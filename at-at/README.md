# at-uatuid

Testing whether [overtone/at-at](https://github.com/overtone/at-at) library can be used in a native binary image with GraalVM.

## Usage

Currently testing:

    [clj-uuid "0.1.9"]

Test with:

    lein do clean, uberjar, native, run-native

## Results
`[overtone/at-at]` :white_check_mark: