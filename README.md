# ClojureNode
Funcional Programming with Clojure (ClojureScript) &amp; Nodejs.

Exercises based on http://xuanji.appspot.com/isicp/1-1-elements.html

Quick-Install
-------------------------

1. Install NPM Modules
```
npm install
```
2. Build Node project

Windows

```
java -cp "cljs.jar;src" clojure.main node.clj 
```

Other
```
java -cp cljs.jar:src clojure.main node.clj
```

3. Run Node
```
node main.js
```
-------------------------

Interact with REPL
-------------------------

1. Install NPM Modules
```
npm install
```

2. Build Node REPL project

Windows

```
 java -cp "cljs.jar;src" clojure.main node-repl.clj
```

Other
```
rlwrap java -cp cljs.jar:src clojure.main node-repl.clj
```

3.Try evaluating ....

``` clojure
cljs.user=> (require '[exercises.core :as start])
```
``` clojure
(start/(square-sum-larger 2 8 4))
```
-------------------------

For more information visit https://github.com/clojure/clojurescript
