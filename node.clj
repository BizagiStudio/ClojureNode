(require 'cljs.build.api)

(cljs.build.api/build "src"
	{:main 'exercises.core :output-to "main.js" :target :nodejs})