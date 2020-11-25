(ns clj-woothee.core-test
  (:require [clojure.test :refer :all]
            [clj-woothee.core :as woothee]))

(deftest parse
  (testing "Parse Safari"
    (let [ua (woothee/parse "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.1 Safari/605.1.15")]
      (is (= {:name "Safari", :category "pc" :os "Mac OSX" :version "14.0.1" :vendor "Apple" :os-version "10.15.6"}
            ua))))

  (testing "Parse crawler"
    (let [ua (woothee/parse "Mozilla/5.0 (compatible; Sosospider/2.0; +http://help.soso.com/webspider.htm)")]
      (is (= {:name "misc crawler" :category "crawler" :os "UNKNOWN" :version "UNKNOWN" :os-version nil :vendor nil}
            ua)))))

(deftest crawler
  (testing "User agent is crawler?"
    (is (true? (woothee/is-crawler "Mozilla/5.0 (compatible; Sosospider/2.0; +http://help.soso.com/webspider.htm)")))))
