(ns embed-nrepl.core
  (:require [clojure.tools.nrepl.server :as nrepl]))

(defn -main
  []
  (nrepl/start-server :port 7888)
  (println  "nrepl started on port 7888"))
