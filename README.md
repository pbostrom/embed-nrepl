# embed-nrepl

CIDER does not load the cider-nrepl middleware when connecting to an embedded nREPL server.

## Usage
Start embedded nREPL
`
$ lein run
nrepl started on port 7888
`

Connect cider:
`
C-c M-c
Host: 127.0.0.1
Port: 7888

; CIDER 0.7.0alpha (package: 20140618.557) (Java 1.7.0_55, Clojure 1.6.0, nREPL 0.2.3, cider-nrepl 0.7.0-snapshot)
WARNING: The following required nREPL ops are not supported:
classpath complete info inspect-start inspect-refresh inspect-pop inspect-push inspect-reset macroexpand macroexpand-1 macroexpand-all resource stacktrace toggle-trace
Please, install (or update) cider-nrepl 0.7.0-snapshot and restart CIDER
user>
`

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
