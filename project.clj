(defproject be-analysis "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.csv "1.0.0"]
                 [org.clojure/tools.cli "1.0.194"]
                 [com.taoensso/timbre "5.1.0"]
                 [cheshire "5.10.0"]]
  :profiles {:uberjar {:aot :all}
             :prod {:main be-analysis.core
                    :jar-name "analysis.jar-THIN"
                    :uberjar-name "analysis.jar"}})
