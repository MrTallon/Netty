# Netty

## 第一课

### Netty的作用
- RPC通信协议，实现远程调用（基于socket）
- 长连接服务器，实现客户端与服务端的长连接通信
- HTTP服务器，类似Tomcat，但不遵循servelt规范


### Netty的通用流程
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

Netty 本身并不是遵循 servelt 规范来进行的。
它提供自己的实现方式，更为底层，效率、吞吐量更高。




>curl是一次完整的请求，结束后即关闭。
浏览器则不同，它会等待一段时间，一直没有连接的话才关闭。


## 第二课
对于服务端和客户端的连接通信与浏览器类似，
客户端的实现与服务端的也类似。



P8，9'




