(defproject calorias-api "0.1.0-SNAPSHOT"
  :description "API intermediária para cálculo de calorias"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [compojure "1.7.0"]
                 [ring/ring-defaults "0.3.3"]
                 [ring/ring-jetty-adapter "1.9.6"]
                 [clj-http "3.12.3"]
                 [cheshire "5.11.0"]]
  :main calorias-api.core
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler calorias-api.core/app})
