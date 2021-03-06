<div align="center">

<h1><b>HTTP Web Server</b> </h1>

![web-server](https://user-images.githubusercontent.com/73330352/164957623-d6935f1d-171d-4894-9c9f-2afdbbf710fb.png)

</div>

<br>
<br>

## **๐ ํ๋ก์ ํธ ์๊ฐ**
- ์น ์๋ฒ๊ฐ ์ด๋ป๊ฒ ๋์์ ํ๋์ง ์ดํดํ๊ธฐ ์ํด์ ๋ฐ๋ฐ๋ฅ๋ถํฐ ์ง์  ์คํ์ ๊ตฌํํด๋ณด์์ต๋๋ค.
- ๊ตฌํํ ์น ์๋ฒ๋ฅผ ์ด์ฉํด ์ธ์๋ฐฉ์์ ๋ก๊ทธ์ธ ๊ธฐ๋ฅ์ ๋ง๋ค์ด๋ณด์์ต๋๋ค.
- ๊ตฌํ ํ๋ก์ธ์ค์ ์ฝ๋๊ฐ ๋ฆฌํฉํ ๋ง ๋๋ ๊ณผ์ ์ ๊ธฐ๋กํ์์ต๋๋ค.
  - ๐๐ผ https://github.com/kellykang-tech/webserver/blob/main/PROCESS.md

- ๊ฐ๋ฐ ๊ธฐ๊ฐ
  - 2022.02.02 ~ ํ์ฌ (๊ตฌํ์ ์๋ฃ, ๋ฆฌํฉํ ๋ง ์งํ ์ค)
- JDK 1.8, JUnit5
<br>
<br>

## **๐ ๊ฐ๋ฐ ๋ด์ฉ**
- ์๋ฐ ์๋ฒ ์์ผ์ ํ์ฉํ ์๋ฒ ํต์ 
  - ํด๋ผ์ด์ธํธ์ ์๋ฒ์ ํต์ ์ ์ํด ์๋ฐ ServerSocket ์ฌ์ฉ

- RFC 2616 ์คํ์ ๋ง์กฑํ๋ HTTP request parser
  - HTTP Request Message ์คํ์ ๋ง์ถฐ ํด๋ผ์ด์ธํธ์ ์์ฒญ์ parsing

- RFC 2616 ์คํ์ ๋ง์กฑํ๋ HTTP response builder
  - HTTP Response Message ์คํ์ ๋ง์ถฐ response ๊ตฌ์กฐ ๋น๋ฉ
  
- ์ค๋ ๋ ํ์ ํ์ฉํ ๋ค์ค ์์ฒญ ์ฒ๋ฆฌ
  - ํด๋ผ์ด์ธํธ์ ๋ค์ค ์์ฒญ์ ์ฒ๋ฆฌํ๊ธฐ ์ํด ๋ฉํฐ ์ค๋ ๋ ์ฌ์ฉ
  - ์ค๋ ๋๋ฅผ ๊ด๋ฆฌํ๊ธฐ ์ํด ์ค๋ ๋ ํ ์์ฑ

- ์ธ์ ์ฒ๋ฆฌ๋ฅผ ์ํ ์ฟ ํค ๊ตฌํ
  - ํด๋ผ์ด์ธํธ๋ฅผ ์๋ณํ๊ณ  ๊ทธ ์ํ๋ฅผ ์ ์ง ํ๊ธฐ ์ํด ์ธ์๊ณผ ์ฟ ํค๋ฅผ ๊ตฌํ
  - SessionManager๋ฅผ ์์ฑํ๊ณ , SessionManager๊ฐ ์ธ์์ ๋ผ์ดํ ์ฌ์ดํด์ ๊ด๋ฆฌํ๋๋ก ํจ

- ์ง์  ๊ตฌํํ ์น ์๋ฒ๋ก ์ธ์ ๋ฐฉ์ ๋ก๊ทธ์ธ ๊ตฌํ
  - ์ฌ์ฉ์๊ฐ ๋ก๊ทธ์ธ ํ์ ๋ ์ธ์์ ๋ถ์ฌํ๊ณ , ๋ค์ ์์ฒญ ์ ์ฟ ํค์ ์ธ์ id๋ฅผ ํ์ธํด ๊ฐ์ ์ฌ์ฉ์๊ฐ ๋ง๋์ง ํ์ธ
  
- ์น ์๋ฒ ์ฌ์ฉ ํธ์์ฑ์ ์ํ ๋ถ๊ฐ๊ธฐ๋ฅ ์ ๊ณต
  - ์คํ๋ง์ DispatcherServlet์ฒ๋ผ Front Controller ํจํด์ ํ์ฉํ DispatcherServlet ์์ฑ
  - ์ฌ์ฉ์ ์ ์ ์ปจํธ๋กค๋ฌ
  - ์คํํฑ ํ์ผ์ ์๋นํด์ฃผ๋ ์ปจํธ๋กค๋ฌ
  - ์๋ชป๋ ๊ฒฝ๋ก์ ๋ํ ์ฒ๋ฆฌ๋ฅผ ํ๋ ์ปจํธ๋กค๋ฌ

- ๊ธฐ๋ฅ ๊ฒ์ฆ์ ์ํ ๋จ์ ํ์คํธ ์์ฑ
  - domain layer, service layer ๋ฉ์๋์ ๊ธฐ๋ฅ ๊ฒ์ฆ์ ์ํด ๋จ์ ํ์คํธ ์์ฑ

<br>
<br>

## **๐ ํ๋ก์ ํธ ์ฃผ์ ๊ด์ฌ์ฌ**
- HTTP ์คํ์ ๋ง์กฑํ๋ ์๋ฒ ๊ตฌํํ๊ธฐ
- HTTP RFC 2616 ์์ฒญ ์คํ์ ๋ง์ถฐ์ ์์ฒญ ๊ฐ์ฒด ๋ง๋ค๊ธฐ
- HTTP RFC 2616 ์๋ต ์คํ์ ๋ง์ถฐ์ ์๋ต ๊ฐ์ฒด ๋ง๋ค๊ธฐ
- ์ธ์๊ณผ ์ธ์ ์ฒ๋ฆฌ๋ฅผ ์ํ ์ธ์ ๋งค๋์ ธ
- ๋ค์ค ์์ฒญ ์ฒ๋ฆฌ ๊ด๋ จํด์ ๊ณต๋ถํด์ผ ํ  ๊ฐ๋
  - ๋ฉํฐ ์ค๋ ๋
  - ์ค๋ ๋ ํ
- service layer ๋จ์ ํ์คํธ ์ฝ๋ ์์ฑํ๊ธฐ

<br>
<br>

## **๐ ํ๋ก์ ํธ ๋๋ ํ ๋ฆฌ ๊ตฌ์กฐ**
๐ขinterface ๐ตclass
```
๐src
    ๐main
        ๐java
            ๐com.github.kelly
                ๐controller
                    ๐ขController
                    ๐ตLoginContoller
                    ๐ตLogOutController
                    ๐ตSignUpController
                    ๐ตWelcomeController
                ๐domain
                    ๐ตMember
                    ๐ตMemberRepository
                ๐http
                    ๐cookie
                        ๐ตCookie
                        ๐ตCookieParser
                        ๐ตCookieTypes
                    ๐request
                        ๐ตHttpMethod
                        ๐ตHttpRequest
                        ๐ตQueryString
                        ๐ตRequestBody
                        ๐ตRequestHeaders
                        ๐ตRequestLine
                    ๐response
                        ๐ตHttpResponse
                        ๐ตHttpStatus
                    ๐session
                        ๐ตSession
                        ๐ตSessionManager
                ๐utils
                    ๐ตFileReadUtil
                ๐webserver
                    ๐controller
                        ๐ตNotFoundController
                        ๐ตStaticFileController
                    ๐dispatcher
                        ๐ตDispatcherServlet
                        ๐ตRequestKey
                        ๐ขRequestResolver
                        ๐ตRequestResolverManager
                        ๐ตStaticFileRequestResolver
                        ๐ตUserDefinedRequestResolver
                    ๐ตHttpRequestHandler
                    ๐ตWebserver
                ๐ตApplication

    ๐test
        ๐java
            ๐com.github.kelly
                ๐domain
                    ๐ตMemberRepositoryTest
                    ๐ตMemberTest
                ๐http
                    ๐cookie
                        ๐ตCookieParserTest
                        ๐ตCookieTest
                    ๐request
                        ๐ตHttpRequestTest
                        ๐ตQueryStringTest
                        ๐ตRequestBodyTest
                        ๐ตRequestHeadersTest
                        ๐ตReuqestLineTest
                    ๐response
                        ๐ตHttpResponseTest
                    ๐session
                        ๐ตSessionManagerTest
                        ๐ตSessionTest
                    ๐webserver.dispatcher
                        ๐ตDispatcherServletTest
                        ๐ตRequestResolverManagerTest
                        ๐ตStaticFileRequestResolverTest
                        ๐ตUserDefinedRequestResolverTest
```