(ns y.bit.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [y.bit.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
