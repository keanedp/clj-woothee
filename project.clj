(defproject clj-woothee "1.0.0"
  :description "Clojure wrapper for woothee-java"
  :url "https://github.com/keanedp/clj-woothee"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [is.tagomor.woothee/woothee-java "1.11.0"]]
  :repl-options {:init-ns clj-woothee.core})
