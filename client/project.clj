(defproject binding-todo "0.1.0-SNAPSHOT"
  :description "A travels claim system"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]  				 
  				 [fluentsoftware/cljs-binding "1.0.0"]]
  :plugins [[lein-cljsbuild "0.2.1"]]
  :cljsbuild {
    :builds [{:source-path "src"
              :jar true
              :compiler {:output-to "main.js"
                         :optimizations :simple
                         :pretty-print true}}]}  				 
)