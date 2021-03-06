(defproject csjspg "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
  		 [org.clojure/clojurescript "0.0-2227"]
		 [compojure "1.1.8"]
		 [ring "1.3.0"]
		 [enliven "0.1.0-SNAPSHOT"]
		 [com.phloc/phloc-css "3.7.7"]
		 [org.jsoup/jsoup "1.7.3"]
		 [hiccup "1.0.5"]
		 [aleph "0.3.2"]
		 [http-kit "2.1.18"]
		 [om "0.6.2"]]
  :profiles {:dev [:dbmunge :datomicdb]}
  :repositories [["CHS3" {:url "http://rms3.creosotehill.org/mirror/maven/" :snapshots true}]])

