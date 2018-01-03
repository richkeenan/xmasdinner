# Xmas Dinner

CLI tool to replace every other letter of a word with and underscore ( \_ ) and capitalises each letter, e.g.
`Hello world` becomes `H_L_O W_R_D`.

It's pretty dumb (spaces aren't ignored in the even/odd index check) but it's a quick way to generate obfuscated words/phrases for quizzes!

## Running It

```
mvn clean package
java -jar ./target/xmasdinner-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Motivation

I originally made it for a family Christmas quiz using Christmas dinner ingredients/dishes and didn't want to manually replace the letters which would be error prone and boring.

I also wanted to learn a bit about Kotlin
