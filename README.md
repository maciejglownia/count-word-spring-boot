# count-word-spring-boot

### Goal

1. Create Spring Boot application which counts letters in given word.

### Overview

1. Application takes an object represents by a map ```["count":"word"]```, where "word" is any String matches regex```[a-zA-Z]*```.
2. It counts how many times each character repeats.
3. It returns list of lists. The list represents counted letters, in order of their appearance, with a number of their repetitions. (See the response below).
4. A few variants of words is also tested.

### URL

#### POST

```
http://localhost:8080/count-word
```

#### Request Body example 
```
{
  "countThis":"Massachusetts"
}
```

#### Response example

```
{
    "countWord:[[M, 1], [a, 2], [s, 4], [c, 1], [h, 1], [u, 1], [e, 1], [t, 2]]
}
```


### Screenshots

Tested
with: [Talend API Tester](https://chrome.google.com/webstore/detail/talend-api-tester-free-ed/aejoelaoggembcahagimdiliamlcdmfm)
available for Chrome.

- URL

![Url](src/main/resources/drawable/url.png)

- Allowed word

![Url](src/main/resources/drawable/allowed_word.png)

- Response 200

![Url](src/main/resources/drawable/response_200.png)

- Not allowed word

![Url](src/main/resources/drawable/not_allowed_word.png)

- Response 400

![Url](src/main/resources/drawable/response_400.png)