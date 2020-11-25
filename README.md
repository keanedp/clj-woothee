# clj-woothee

Project Woothee is multi-language user-agent string parser.

You can try it on demo site: http://woothee.github.io/

This library provides a light wrapper around the Java library, which can be found at https://github.com/woothee/woothee-java

## Usage

#### Parse

```clojure
(require '[clj-woothee.core :as woothee]

(woothee/parse "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0)")

=> {:name "Internet Explorer"
    :category "pc"
    :os "Windows 7" 
    :version "8.0" 
    :vendor "Microsoft"
    :os-version "NT 6.1"}
```

#### is-crawler

```clojure
(require '[clj-woothee.core :as woothee]

(is-crawler "Mozilla/5.0 (compatible; Sosospider/2.0; +http://help.soso.com/webspider.htm)")

=> true
```

## License

```
Copyright 2020 - Daniel Keane

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
```
