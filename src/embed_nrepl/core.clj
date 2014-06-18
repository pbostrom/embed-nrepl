(ns embed-nrepl.core
  (:require [clojure.tools.nrepl.server :as nrepl]
            [cider.nrepl.middleware.classpath]
            [cider.nrepl.middleware.complete]
            [cider.nrepl.middleware.info]
            [cider.nrepl.middleware.inspect]
            [cider.nrepl.middleware.macroexpand]
            [cider.nrepl.middleware.resource]
            [cider.nrepl.middleware.stacktrace]
            [cider.nrepl.middleware.test]
            [cider.nrepl.middleware.trace]))

(defn cider-handler []
  (apply nrepl/default-handler
         [cider.nrepl.middleware.classpath/wrap-classpath
          cider.nrepl.middleware.complete/wrap-complete
          cider.nrepl.middleware.info/wrap-info
          cider.nrepl.middleware.inspect/wrap-inspect
          cider.nrepl.middleware.macroexpand/wrap-macroexpand
          cider.nrepl.middleware.resource/wrap-resource
          cider.nrepl.middleware.stacktrace/wrap-stacktrace
          cider.nrepl.middleware.test/wrap-test
          cider.nrepl.middleware.trace/wrap-trace]))

(defn -main
  []
  (nrepl/start-server :port 7888 :handler (cider-handler))
  (println  "nrepl started on port 7888"))
