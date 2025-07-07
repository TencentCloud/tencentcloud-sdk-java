/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthChecker extends AbstractModel {

    /**
    * 健康检查策略，取值有：
<li>HTTP；</li>
<li>HTTPS；</li>
<li>TCP；</li>
<li>UDP；</li>
<li>ICMP Ping；</li>
<li>NoCheck。</li>
注意：NoCheck 表示不启用健康检查策略。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 检查频率，表示多久发起一次健康检查任务，单位为秒。可取值有：30，60，180，300 或 600。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为”不健康“， 单位为秒，默认值为 5s，取值必须小于 Interval。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 健康阈值，表示连续几次健康检查结果为"健康"，则判断源站为"健康"，单位为次，默认 3 次，最小取值 1 次。
    */
    @SerializedName("HealthThreshold")
    @Expose
    private Long HealthThreshold;

    /**
    * 不健康阈值，表示连续几次健康检查结果为"不健康"，则判断源站为"不健康"，单位为次，默认 2 次。
    */
    @SerializedName("CriticalThreshold")
    @Expose
    private Long CriticalThreshold;

    /**
    * 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。

    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：
<li>GET；</li>
<li>HEAD。</li>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。
    */
    @SerializedName("ExpectedCodes")
    @Expose
    private String [] ExpectedCodes;

    /**
    * 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。
    */
    @SerializedName("Headers")
    @Expose
    private CustomizedHeader [] Headers;

    /**
    * 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为"健康"的状态码，默认跳转 3 次。
    */
    @SerializedName("FollowRedirect")
    @Expose
    private String FollowRedirect;

    /**
    * 该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * 该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
     * Get 健康检查策略，取值有：
<li>HTTP；</li>
<li>HTTPS；</li>
<li>TCP；</li>
<li>UDP；</li>
<li>ICMP Ping；</li>
<li>NoCheck。</li>
注意：NoCheck 表示不启用健康检查策略。 
     * @return Type 健康检查策略，取值有：
<li>HTTP；</li>
<li>HTTPS；</li>
<li>TCP；</li>
<li>UDP；</li>
<li>ICMP Ping；</li>
<li>NoCheck。</li>
注意：NoCheck 表示不启用健康检查策略。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 健康检查策略，取值有：
<li>HTTP；</li>
<li>HTTPS；</li>
<li>TCP；</li>
<li>UDP；</li>
<li>ICMP Ping；</li>
<li>NoCheck。</li>
注意：NoCheck 表示不启用健康检查策略。
     * @param Type 健康检查策略，取值有：
<li>HTTP；</li>
<li>HTTPS；</li>
<li>TCP；</li>
<li>UDP；</li>
<li>ICMP Ping；</li>
<li>NoCheck。</li>
注意：NoCheck 表示不启用健康检查策略。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。 
     * @return Port 检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。
     * @param Port 检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 检查频率，表示多久发起一次健康检查任务，单位为秒。可取值有：30，60，180，300 或 600。 
     * @return Interval 检查频率，表示多久发起一次健康检查任务，单位为秒。可取值有：30，60，180，300 或 600。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 检查频率，表示多久发起一次健康检查任务，单位为秒。可取值有：30，60，180，300 或 600。
     * @param Interval 检查频率，表示多久发起一次健康检查任务，单位为秒。可取值有：30，60，180，300 或 600。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为”不健康“， 单位为秒，默认值为 5s，取值必须小于 Interval。 
     * @return Timeout 每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为”不健康“， 单位为秒，默认值为 5s，取值必须小于 Interval。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为”不健康“， 单位为秒，默认值为 5s，取值必须小于 Interval。
     * @param Timeout 每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为”不健康“， 单位为秒，默认值为 5s，取值必须小于 Interval。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 健康阈值，表示连续几次健康检查结果为"健康"，则判断源站为"健康"，单位为次，默认 3 次，最小取值 1 次。 
     * @return HealthThreshold 健康阈值，表示连续几次健康检查结果为"健康"，则判断源站为"健康"，单位为次，默认 3 次，最小取值 1 次。
     */
    public Long getHealthThreshold() {
        return this.HealthThreshold;
    }

    /**
     * Set 健康阈值，表示连续几次健康检查结果为"健康"，则判断源站为"健康"，单位为次，默认 3 次，最小取值 1 次。
     * @param HealthThreshold 健康阈值，表示连续几次健康检查结果为"健康"，则判断源站为"健康"，单位为次，默认 3 次，最小取值 1 次。
     */
    public void setHealthThreshold(Long HealthThreshold) {
        this.HealthThreshold = HealthThreshold;
    }

    /**
     * Get 不健康阈值，表示连续几次健康检查结果为"不健康"，则判断源站为"不健康"，单位为次，默认 2 次。 
     * @return CriticalThreshold 不健康阈值，表示连续几次健康检查结果为"不健康"，则判断源站为"不健康"，单位为次，默认 2 次。
     */
    public Long getCriticalThreshold() {
        return this.CriticalThreshold;
    }

    /**
     * Set 不健康阈值，表示连续几次健康检查结果为"不健康"，则判断源站为"不健康"，单位为次，默认 2 次。
     * @param CriticalThreshold 不健康阈值，表示连续几次健康检查结果为"不健康"，则判断源站为"不健康"，单位为次，默认 2 次。
     */
    public void setCriticalThreshold(Long CriticalThreshold) {
        this.CriticalThreshold = CriticalThreshold;
    }

    /**
     * Get 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。
 
     * @return Path 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。

     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。

     * @param Path 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。

     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：
<li>GET；</li>
<li>HEAD。</li> 
     * @return Method 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：
<li>GET；</li>
<li>HEAD。</li>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：
<li>GET；</li>
<li>HEAD。</li>
     * @param Method 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：
<li>GET；</li>
<li>HEAD。</li>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。 
     * @return ExpectedCodes 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。
     */
    public String [] getExpectedCodes() {
        return this.ExpectedCodes;
    }

    /**
     * Set 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。
     * @param ExpectedCodes 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。
     */
    public void setExpectedCodes(String [] ExpectedCodes) {
        this.ExpectedCodes = ExpectedCodes;
    }

    /**
     * Get 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。 
     * @return Headers 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。
     */
    public CustomizedHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。
     * @param Headers 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。
     */
    public void setHeaders(CustomizedHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为"健康"的状态码，默认跳转 3 次。 
     * @return FollowRedirect 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为"健康"的状态码，默认跳转 3 次。
     */
    public String getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为"健康"的状态码，默认跳转 3 次。
     * @param FollowRedirect 该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为"健康"的状态码，默认跳转 3 次。
     */
    public void setFollowRedirect(String FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get 该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。 
     * @return SendContext 该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set 该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。
     * @param SendContext 该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get 该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。 
     * @return RecvContext 该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set 该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。
     * @param RecvContext 该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    public HealthChecker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthChecker(HealthChecker source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.HealthThreshold != null) {
            this.HealthThreshold = new Long(source.HealthThreshold);
        }
        if (source.CriticalThreshold != null) {
            this.CriticalThreshold = new Long(source.CriticalThreshold);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.ExpectedCodes != null) {
            this.ExpectedCodes = new String[source.ExpectedCodes.length];
            for (int i = 0; i < source.ExpectedCodes.length; i++) {
                this.ExpectedCodes[i] = new String(source.ExpectedCodes[i]);
            }
        }
        if (source.Headers != null) {
            this.Headers = new CustomizedHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new CustomizedHeader(source.Headers[i]);
            }
        }
        if (source.FollowRedirect != null) {
            this.FollowRedirect = new String(source.FollowRedirect);
        }
        if (source.SendContext != null) {
            this.SendContext = new String(source.SendContext);
        }
        if (source.RecvContext != null) {
            this.RecvContext = new String(source.RecvContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "HealthThreshold", this.HealthThreshold);
        this.setParamSimple(map, prefix + "CriticalThreshold", this.CriticalThreshold);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "ExpectedCodes.", this.ExpectedCodes);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "FollowRedirect", this.FollowRedirect);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);

    }
}

