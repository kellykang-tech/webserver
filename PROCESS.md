<div align="center">

<h1>๐จ <b>๋ฐ๋ฐ๋ฅ๋ถํฐ ๊ตฌํํ๋ ์น์๋ฒ (ver.TDD)</b> ๐จ </h1>

<b>์น์๋ฒ์ ๋ด๋ถ ๋์ ์๋ฆฌ๊ฐ ๊ถ๊ธํ๋ค๋ฉด ์ง์  ๋ง๋ค์ด๋ณด์.</b>

<h6>"A programming language is for thinking about programs, not for expressing programs you've already thought of. It should be a pencil, not a pen."</h6>

</div>

<br>
<br>

## **[ CONTENT ]**

### **ํ์ผ ์ฝ๊ณ  ์ฐ๊ธฐ**
- ์๋ฐ API ์ด์ฉํ๊ธฐ
- text ํ์ผ ์ฝ๊ณ  ์ฐ๊ธฐ
- ์ด๋ฏธ์ง ํ์ผ ์ฝ๊ณ  ์ฐ๊ธฐ
<br>

### **๋คํธ์ํฌ**
- ์๋ฐ ์๋ฒ ์์ผ์ผ๋ก ํต์ ํ๊ธฐ
- ์คํธ๋ฆผ ๊ฐ์ ธ์ค๊ธฐ
- ์น ๋ธ๋ผ์ฐ์ ์ text ๋ด๋ณด๋ด๊ธฐ
<br>

### **HTTP (RFC 2616)**
- ์น ๋ธ๋ผ์ฐ์ ์ ์์ฒญ ๋ฐ์ดํฐ ์ฝ๊ธฐ

- ์ฝ์ด์จ ์์ฒญ ๋ฐ์ดํฐ ํ์ฑํ๊ธฐ
  - request ๊ตฌํ
    - request line
    - request headers
    - request body (YAGNI)

- `์ฐ๋ ๋` ๊ฐ๋๊ณผ ์ดํด

- response ๊ตฌํ
  - status line
  - response headers

- ์น ๋ธ๋ผ์ฐ์ ์ ์์ฒญ์ด POST ์ผ ๋
  - post ์์ฒญ์ผ๋ก ๋ณด๋ธ ๋ฐ์ดํฐ๋ ์ด๋์ ์์๊น?
  - post ์์ฒญ ํ  ๋ทฐ ๋ง๋ค๊ธฐ 
  - HttpRequest ์์๋ ์ด ์์ฒญ์ ์ด๋ป๊ฒ ์ฒ๋ฆฌํ  ๊ฒ์ธ๊ฐ?

- ํด๋ผ์ด์ธํธ๊ฐ get ์์ฒญ์ผ๋ก ๋ฐ์ดํฐ๋ฅผ ๋ณด๋ธ๋ค๋ฉด?
  - ์ด ๋ฐ์ดํฐ๋ฅผ ์ด๋ป๊ฒ ๊ฐ์ ธ์ฌ ๊ฒ์ธ๊ฐ?
<br>

### **Web Server**
- ์์ฒญ handler ๊ตฌํ
  - HTTP Request Handler ์ ์ ์ฐธ๊ณ   
  ```text
  ํ๋ก๊ทธ๋จ์ด๋ค.  
  URL ๋ก ์๋ณ๋๊ณ  HTTP ์์ฒญ์ ์ฒ๋ฆฌํ๋ค.  
  HTTP ํธ์ถ์ ์ํด ์ ์ก๋๋ ๋ฐ์ดํฐ(URL ์ ์ฟผ๋ฆฌ ์คํธ๋ง์ผ๋ก ์ฝ๋ฉ๋๋)๋ฅผ ์์ ํ๊ณ  ์ฒ๋ฆฌํ๋ค.  
  ํธ๋ค๋ฌ๊ฐ ๋ฐ์ดํฐ๋ฅผ ์ฒ๋ฆฌํ๊ณ  ๋๋ฉด ์์ฒญํ ์ฌ๋์๊ฒ ๋ณด๋ผ ์๋ต์ ๋ง๋ ๋ค.  
  ```
  - ์์ผ
  - ์คํธ๋ฆผ

- Dispatcher ๊ตฌํ
  - Front Controller:  
    A controller that handles all requests for a web site
  - v0. happy path:  
    - ํด๋ผ์ด์ธํธ์ ์์ฒญ์ ๋ํ ์๋ฒ์ ์ ์ ํ ์๋ต์ ๋งคํํด์ฃผ๋ ์ญํ ์ ํ๋ ๊ฐ์ฒด์ ์์ฒญ์ ๋ํ ์๋ต ์ปจํธ๋กค๋ฌ๋ฅผ ๋ฐํํ  ๊ฒ์ ์์ฒญ
    - ์์ฒญ handler์ ์ปจํธ๋กค๋ฌ ๋ฐํ

- ํธ์์ฑ์ ์ํด ๋ง๋๋ ๊ฐ์ฒด
  - ํด๋ผ์ด์ธํธ๊ฐ ์คํํฑ ํ์ผ์ ์์ฒญํ๋ค๋ฉด?
  
  - ํด๋ผ์ด์ธํธ์ '/welcome' ์์ฒญ์ ๋ํด static ํ์ผ์ ์๋ตํด์ฃผ๊ณ  ์ถ๋ค๋ฉด?
  
  - v1. staticFile ์์ฒญ (/home.html)    
      - ์คํํฑ ํ์ผ ์๋นํ๋ ๊ฐ์ฒด  
  - v2. ๋ฆฌ์์ค ์์ฒญ (/welcome)  
      - ์ฌ์ฉ์ ์ ์ ์ปจํธ๋กค๋ฌ ๋ฐํํ๋ ๊ฐ์ฒด

  - FileReadUtil ๊ฐ์ฒด ํ๋ ๋ง๋ค์ด์ ํ์ผ ์ฝ์ด์ค๊ธฐ

- ์์ฒญ Resolver๋ฅผ ํตํฉํด์ ์ ์ ํ Resolver๋ฅผ ๋ฐํํด์ฃผ๋ ๊ฐ์ฒด ํ์
<br>  

### **๊ฐ๋จํ ์๋น์ค ๋ง๋ค๊ธฐ**
- user A๊ฐ ์์ฒญ์ ๋ณด๋ธ๋ค๋ฉด ์๋ฒ์์๋ user A๋ฅผ ์ด๋ป๊ฒ ๋ค๋ฅธ ์ฌ์ฉ์์ ๊ตฌ๋ณํ  ์ ์์๊น?
<br>

### **Stateful**
- ์ฟ ํค ๋ง๋ค๊ธฐ
  - ์ฟ ํค๊ฐ ๋ฌด์์ธ์ง?
  - ์ฟ ํค๋ ์ด๋์?  
  ```text
  request headers.
  Idea-sample=d1e23a4b-c5bb-67s8-94a4-asdfasdf342
  ```
  
- ์ธ์ ๋ง๋ค๊ธฐ
  - ์ธ์์ด ๋ฌด์์ธ์ง?
<br>
<br>

## **[ ํต์ฌ ]**
- HTTP ์คํ์ ๋ง์กฑํ๋ ์๋ฒ๋ฅผ ๋ง๋ค์.
- HTTP ์์ฒญ ๋ถ์
- HTTP ์๋ต
- ์ธ์
- ๋ค์ค ์์ฒญ ์ฒ๋ฆฌ 
  - ๋ฉํฐ์ค๋ ๋
  - ์ค๋ ๋ ํ
  - ์ค๋ ๋ ๋ก์ปฌ
<br>
<br>

## **[ TO DO ]**
- [x] ๊นจ์ง ํ์คํธ ์ฝ๋ ์์ 
- [ ] ํธ๋ฌ๋ธ ์ํ - favicon ํด๊ฒฐ
- [x] README ์ ๋ฆฌ
- [ ] ์ปจํ์คํธ๋ก ๋ฌถ์ด๋ณด๊ธฐ
- [ ] ์ค๋ ๋ ๋ก์ปฌ ์ดํดํ๊ณ , ์ ์ฉํด๋ณด๊ธฐ
- [x] NotFoundController ๋ฅผ ๋งค๋ฒ ์์ฑํด์ ๋ด๋ ค์ฃผ๋ ๋ถ๋ถ ๋ฆฌํฉํ ๋ง
- [ ] StaticFileController   
      ์๋ฒ -> ์น๋ธ๋ผ์ฐ์ ๋ก ๋ฐ์ดํฐ ๋ณด๋ด์ ํ์ฑ ๊ฐ๋ฅํ์ง?
- [ ] Cookie   
      Optional ์ค์  ์ถ๊ฐ (๋ง๋ฃ์ผ ยท ์ง์์๊ฐ, ํน์  ๋๋ฉ์ธ ๋ฐ ๊ฒฝ๋ก ์ ํ ์ค์ )
- [x] ์ค๋ ๋ ํ: ๊ณ ์  ์ค๋ ๋ํ -> ์ฝ์ด, ๋งฅ์๋ฉ, ๋๊ธฐ์๊ฐ, ํ ์ค์ 
- [ ] Composite pattern ์ดํดํ๊ณ  ๋ฆฌํฉํ ๋ง ํด๋ณด๊ธฐ
- [ ] Trouble Shooting 2๋ฒ, 3๋ฒ ํด๊ฒฐํ๊ณ  ๊ธฐ๋กํ๊ธฐ
<br>
<br>

## **[ Learning Target ]**
1. Junit์ ์ด์ฉํด **๋จ์ ํ์คํธ**ํ๊ธฐ
2. **๋ฆฌํฉํ ๋ง** ํ๊ธฐ
3. **TDD** ๊ธฐ๋ฐ์ผ๋ก ํ๋ก๊ทธ๋๋ฐ ํ๊ธฐ (โญ์ต์ข ๋ชฉํ)
<br>
<br>


## **[ Troubleshooting ]**
- [1. URL์ ์ฟผ๋ฆฌ ์คํธ๋ง์ด ์์ ๋](https://github.com/kellykang-tech/Troubleshooting/blob/main/URL%EC%97%90-%EC%BF%BC%EB%A6%AC%EC%8A%A4%ED%8A%B8%EB%A7%81%EC%9D%B4-%EC%97%86%EC%9D%84-%EB%95%8C-NullPointerException.md)
- [2. ์์ฒญ์ด ์ ๋ฌด์๋์ง?]()
- [3. ๋งค๋ฒ ๊ฐ์ฒด๋ฅผ ์๋ก ์์ฑํ  ํ์๊ฐ ์๋๋ฐ ์ด๋ป๊ฒ ๋ฆฌํฉํ ๋ง ํ์ง?]()
<br>
<br>


## **[ Reference ]**
### **HTTP**
- https://developer.mozilla.org/ko/docs/Web/HTTP/Messages
- https://developer.mozilla.org/ko/docs/Web/HTTP/Status
- https://developer.mozilla.org/ko/docs/Web/HTTP/Redirections
- https://developer.mozilla.org/ko/docs/Web/HTTP/Basics_of_HTTP/MIME_types
- https://developer.mozilla.org/ko/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types
- https://datatracker.ietf.org/doc/html/rfc2616

### **Cookie**
- https://developer.mozilla.org/ko/docs/Web/HTTP/Cookies
- https://developer.mozilla.org/ko/docs/Web/HTTP/Headers/Set-Cookie
- https://docs.oracle.com/javaee/7/api/javax/servlet/http/Cookie.html
- https://developer.mozilla.org/ko/docs/Web/HTTP/Headers/Set-Cookie#permanent_cookie
- https://docs.oracle.com/javaee/7/api/javax/servlet/http/Cookie.html
- https://datatracker.ietf.org/doc/html/rfc6265

### **Session**
- https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSession.html

### **Web Server**
- http://thierryroussel.free.fr/java/books/martinfowler/www.martinfowler.com/isa/frontController.html
- https://en.wikipedia.org/wiki/URL_redirection


### **Thread**
- https://www.javatpoint.com/java-threadlocal-class
- https://www.javatpoint.com/java-thread-pool
- https://levelup.gitconnected.com/lets-learn-java-threads-e156481883cb
- https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadPoolExecutor.html
- https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/LinkedBlockingQueue.html

### **ETC**
- https://www.srihash.org/
- https://ko.wikipedia.org/wiki%EC%BB%B4%ED%8F%AC%EC%A7%80%ED%8A%B8_%ED%8C%A8%ED%84%B4