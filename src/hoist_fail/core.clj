(ns hoist-fail.core
  (:require
    [compojure.api.sweet :refer [GET*]]
    [clojure.test :refer [is]]))

(GET* "/foobar" []
  :query-params [isFoo :- boolean]
  (is isFoo)
  "")
