# Netty

## 第一课

Netty通用流程
1. 定义好父子线程组
2. 构造启动器
3. childHandler中定义Initiallizer
4. Initiallizer添加自定义的通道处理器（ServerHandler）
5. ServerHandler中处理请求和响应数据
6. 回调方法被调用
6. 关流

```java
// chrome浏览器会发送两个请求，来查看网站图标
HttpRequest httpRequest = (HttpRequest) msg;
URI uri = new URI(httpRequest.uri());
if ("/favicon.ico".equals(uri.getPath())) {
    // System.out.println("请求favicon.ico");
    return;
}
```


## 第二课

Netty 本身并不是遵循 servelt 规范来进行的。
curl是一次完整的请求，结束后即关闭。
浏览器则不同，它会等待一段时间，一直没有连接的话才关闭。




P7




