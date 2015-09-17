# ClojureNode
Funcional Programming with Clojure (ClojureScript) &amp; Nodejs.

Exercises based on http://xuanji.appspot.com/isicp/1-1-elements.html

Quick-Install

```
npm install
```
Build Node project

Windows

```
java -cp "cljs.jar;src" clojure.main node.clj 
```

Other
```
java -cp cljs.jar:src clojure.main node.clj
```

Run Node
```
node main.js
```

Interact with REPL

Windows

```
 java -cp "cljs.jar;src" clojure.main node-repl.clj
```

Other
```
rlwrap java -cp cljs.jar:src clojure.main node-repl.clj
```

``` clojure
cljs.user=> (require '[exercises.core :as start])
```

Try evaluating ....
``` clojure
(start/(square-sum-larger 2 8 4))
```

For more information visit https://github.com/clojure/clojurescript