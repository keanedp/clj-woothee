(ns clj-woothee.core
  (:require [clojure.string :as str])
  (:import [is.tagomor.woothee Classifier]))

(defn- woothee-key->clojure-key
  [k]
  (-> k
      (str/replace #"_" "-")
      keyword))

(defn parse
  [user-agent]
  (as-> (Classifier/parse user-agent) m
        (zipmap (map woothee-key->clojure-key (keys m)) (vals m))
        (cond-> m (or (not (contains? m :vendor))
                      (= (:vendor m) "null"))
          (assoc :vendor nil))
        (cond-> m (not (contains? m :os-version)) (assoc :os-version nil))))

(defn is-crawler
  [user-agent]
  (let [parsed-user-agent (parse user-agent)]
    (= (:category parsed-user-agent) "crawler")))
