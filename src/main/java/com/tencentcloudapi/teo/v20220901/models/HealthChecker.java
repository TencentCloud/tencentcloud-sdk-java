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
    * <p>健康检查策略，取值有：</p><li>HTTP；</li><li>HTTPS；</li><li>TCP；</li><li>UDP；</li><li>ICMP Ping；</li><li>NoCheck。</li>注意：NoCheck 表示不启用健康检查策略。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>检查频率，表示多久发起一次健康检查任务，单位为秒。可配置 10-600 秒。</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为“不健康”， 单位为秒，默认值为 5s，取值必须小于 Interval。</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>健康阈值，表示连续几次健康检查结果为&quot;健康&quot;，则判断源站为&quot;健康&quot;，单位为次，默认 3 次，最小取值 1 次。</p>
    */
    @SerializedName("HealthThreshold")
    @Expose
    private Long HealthThreshold;

    /**
    * <p>不健康阈值，表示连续几次健康检查结果为&quot;不健康&quot;，则判断源站为&quot;不健康&quot;，单位为次，默认 2 次。</p>
    */
    @SerializedName("CriticalThreshold")
    @Expose
    private Long CriticalThreshold;

    /**
    * <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：</p><li>GET；</li><li>HEAD。</li>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。</p>
    */
    @SerializedName("ExpectedCodes")
    @Expose
    private String [] ExpectedCodes;

    /**
    * <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。</p>
    */
    @SerializedName("Headers")
    @Expose
    private CustomizedHeader [] Headers;

    /**
    * <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为&quot;健康&quot;的状态码，默认跳转 3 次。</p>
    */
    @SerializedName("FollowRedirect")
    @Expose
    private String FollowRedirect;

    /**
    * <p>该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p>
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * <p>该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p>
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * <p>健康检查探测集群。指定本负载均衡实例发起健康探测的集群区域范围，探测集群地区分布详见<a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>，仅 HTTP 专用型（V2）版本负载均衡实例支持设置。取值有：<br>global：由全球所有区域的探测集群发起探测，包括中国大陆区域以及非中国大陆区域，各个区域的集群独立维护各自的探测结果；<br>mainland_china：仅由中国大陆区域的探测集群发起探测，当前中国大陆区域共用一个探测集群，探测结果由中国大陆区域的探测集群维护，其他区域跟随中国大陆区域的集群的探测结果；<br>overseas：仅由非中国大陆区域的探测集群发起探测，当前非中国大陆区域包含多个地区的探测集群，探测结果由各个地区的探测集群独立维护，中国大陆区域的探测结果由所有其他地区的探测集群的探测结果汇总生成。<br>默认为 global。</p>
    */
    @SerializedName("ProbeCluster")
    @Expose
    private String ProbeCluster;

    /**
     * Get <p>健康检查策略，取值有：</p><li>HTTP；</li><li>HTTPS；</li><li>TCP；</li><li>UDP；</li><li>ICMP Ping；</li><li>NoCheck。</li>注意：NoCheck 表示不启用健康检查策略。 
     * @return Type <p>健康检查策略，取值有：</p><li>HTTP；</li><li>HTTPS；</li><li>TCP；</li><li>UDP；</li><li>ICMP Ping；</li><li>NoCheck。</li>注意：NoCheck 表示不启用健康检查策略。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>健康检查策略，取值有：</p><li>HTTP；</li><li>HTTPS；</li><li>TCP；</li><li>UDP；</li><li>ICMP Ping；</li><li>NoCheck。</li>注意：NoCheck 表示不启用健康检查策略。
     * @param Type <p>健康检查策略，取值有：</p><li>HTTP；</li><li>HTTPS；</li><li>TCP；</li><li>UDP；</li><li>ICMP Ping；</li><li>NoCheck。</li>注意：NoCheck 表示不启用健康检查策略。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。</p> 
     * @return Port <p>检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。</p>
     * @param Port <p>检查端口。当 Type=HTTP 或 Type=HTTPS 或 Type=TCP 或 Type=UDP 时为必填。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>检查频率，表示多久发起一次健康检查任务，单位为秒。可配置 10-600 秒。</p> 
     * @return Interval <p>检查频率，表示多久发起一次健康检查任务，单位为秒。可配置 10-600 秒。</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>检查频率，表示多久发起一次健康检查任务，单位为秒。可配置 10-600 秒。</p>
     * @param Interval <p>检查频率，表示多久发起一次健康检查任务，单位为秒。可配置 10-600 秒。</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为“不健康”， 单位为秒，默认值为 5s，取值必须小于 Interval。</p> 
     * @return Timeout <p>每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为“不健康”， 单位为秒，默认值为 5s，取值必须小于 Interval。</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为“不健康”， 单位为秒，默认值为 5s，取值必须小于 Interval。</p>
     * @param Timeout <p>每一次健康检查的超时时间，若健康检查消耗时间大于此值，则检查结果判定为“不健康”， 单位为秒，默认值为 5s，取值必须小于 Interval。</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>健康阈值，表示连续几次健康检查结果为&quot;健康&quot;，则判断源站为&quot;健康&quot;，单位为次，默认 3 次，最小取值 1 次。</p> 
     * @return HealthThreshold <p>健康阈值，表示连续几次健康检查结果为&quot;健康&quot;，则判断源站为&quot;健康&quot;，单位为次，默认 3 次，最小取值 1 次。</p>
     */
    public Long getHealthThreshold() {
        return this.HealthThreshold;
    }

    /**
     * Set <p>健康阈值，表示连续几次健康检查结果为&quot;健康&quot;，则判断源站为&quot;健康&quot;，单位为次，默认 3 次，最小取值 1 次。</p>
     * @param HealthThreshold <p>健康阈值，表示连续几次健康检查结果为&quot;健康&quot;，则判断源站为&quot;健康&quot;，单位为次，默认 3 次，最小取值 1 次。</p>
     */
    public void setHealthThreshold(Long HealthThreshold) {
        this.HealthThreshold = HealthThreshold;
    }

    /**
     * Get <p>不健康阈值，表示连续几次健康检查结果为&quot;不健康&quot;，则判断源站为&quot;不健康&quot;，单位为次，默认 2 次。</p> 
     * @return CriticalThreshold <p>不健康阈值，表示连续几次健康检查结果为&quot;不健康&quot;，则判断源站为&quot;不健康&quot;，单位为次，默认 2 次。</p>
     */
    public Long getCriticalThreshold() {
        return this.CriticalThreshold;
    }

    /**
     * Set <p>不健康阈值，表示连续几次健康检查结果为&quot;不健康&quot;，则判断源站为&quot;不健康&quot;，单位为次，默认 2 次。</p>
     * @param CriticalThreshold <p>不健康阈值，表示连续几次健康检查结果为&quot;不健康&quot;，则判断源站为&quot;不健康&quot;，单位为次，默认 2 次。</p>
     */
    public void setCriticalThreshold(Long CriticalThreshold) {
        this.CriticalThreshold = CriticalThreshold;
    }

    /**
     * Get <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。</p> 
     * @return Path <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。</p>
     * @param Path <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测路径，需要填写完整的 host/path，不包含协议部分，例如：www.example.com/test。</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：</p><li>GET；</li><li>HEAD。</li> 
     * @return Method <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：</p><li>GET；</li><li>HEAD。</li>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：</p><li>GET；</li><li>HEAD。</li>
     * @param Method <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示请求方法，取值有：</p><li>GET；</li><li>HEAD。</li>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。</p> 
     * @return ExpectedCodes <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。</p>
     */
    public String [] getExpectedCodes() {
        return this.ExpectedCodes;
    }

    /**
     * Set <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。</p>
     * @param ExpectedCodes <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测节点向源站发起健康检查时，响应哪些状态码可用于认定探测结果为健康。</p>
     */
    public void setExpectedCodes(String [] ExpectedCodes) {
        this.ExpectedCodes = ExpectedCodes;
    }

    /**
     * Get <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。</p> 
     * @return Headers <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。</p>
     */
    public CustomizedHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。</p>
     * @param Headers <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示探测请求携带的自定义  HTTP 请求头，至多可配置 10 个。</p>
     */
    public void setHeaders(CustomizedHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为&quot;健康&quot;的状态码，默认跳转 3 次。</p> 
     * @return FollowRedirect <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为&quot;健康&quot;的状态码，默认跳转 3 次。</p>
     */
    public String getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为&quot;健康&quot;的状态码，默认跳转 3 次。</p>
     * @param FollowRedirect <p>该参数仅当 Type=HTTP 或 Type=HTTPS 时有效，表示是否启用遵循 301/302 重定向。启用后，301/302 默认为&quot;健康&quot;的状态码，默认跳转 3 次。</p>
     */
    public void setFollowRedirect(String FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get <p>该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p> 
     * @return SendContext <p>该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p>
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set <p>该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p>
     * @param SendContext <p>该参数仅当 Type=UDP 时有效，表示健康检查发送的内容。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p>
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get <p>该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p> 
     * @return RecvContext <p>该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p>
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set <p>该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p>
     * @param RecvContext <p>该参数仅当 Type=UDP 时有效，表示健康检查期望源站返回结果。只允许 ASCII 可见字符，最大长度限制 500 个字符。</p>
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get <p>健康检查探测集群。指定本负载均衡实例发起健康探测的集群区域范围，探测集群地区分布详见<a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>，仅 HTTP 专用型（V2）版本负载均衡实例支持设置。取值有：<br>global：由全球所有区域的探测集群发起探测，包括中国大陆区域以及非中国大陆区域，各个区域的集群独立维护各自的探测结果；<br>mainland_china：仅由中国大陆区域的探测集群发起探测，当前中国大陆区域共用一个探测集群，探测结果由中国大陆区域的探测集群维护，其他区域跟随中国大陆区域的集群的探测结果；<br>overseas：仅由非中国大陆区域的探测集群发起探测，当前非中国大陆区域包含多个地区的探测集群，探测结果由各个地区的探测集群独立维护，中国大陆区域的探测结果由所有其他地区的探测集群的探测结果汇总生成。<br>默认为 global。</p> 
     * @return ProbeCluster <p>健康检查探测集群。指定本负载均衡实例发起健康探测的集群区域范围，探测集群地区分布详见<a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>，仅 HTTP 专用型（V2）版本负载均衡实例支持设置。取值有：<br>global：由全球所有区域的探测集群发起探测，包括中国大陆区域以及非中国大陆区域，各个区域的集群独立维护各自的探测结果；<br>mainland_china：仅由中国大陆区域的探测集群发起探测，当前中国大陆区域共用一个探测集群，探测结果由中国大陆区域的探测集群维护，其他区域跟随中国大陆区域的集群的探测结果；<br>overseas：仅由非中国大陆区域的探测集群发起探测，当前非中国大陆区域包含多个地区的探测集群，探测结果由各个地区的探测集群独立维护，中国大陆区域的探测结果由所有其他地区的探测集群的探测结果汇总生成。<br>默认为 global。</p>
     */
    public String getProbeCluster() {
        return this.ProbeCluster;
    }

    /**
     * Set <p>健康检查探测集群。指定本负载均衡实例发起健康探测的集群区域范围，探测集群地区分布详见<a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>，仅 HTTP 专用型（V2）版本负载均衡实例支持设置。取值有：<br>global：由全球所有区域的探测集群发起探测，包括中国大陆区域以及非中国大陆区域，各个区域的集群独立维护各自的探测结果；<br>mainland_china：仅由中国大陆区域的探测集群发起探测，当前中国大陆区域共用一个探测集群，探测结果由中国大陆区域的探测集群维护，其他区域跟随中国大陆区域的集群的探测结果；<br>overseas：仅由非中国大陆区域的探测集群发起探测，当前非中国大陆区域包含多个地区的探测集群，探测结果由各个地区的探测集群独立维护，中国大陆区域的探测结果由所有其他地区的探测集群的探测结果汇总生成。<br>默认为 global。</p>
     * @param ProbeCluster <p>健康检查探测集群。指定本负载均衡实例发起健康探测的集群区域范围，探测集群地区分布详见<a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>，仅 HTTP 专用型（V2）版本负载均衡实例支持设置。取值有：<br>global：由全球所有区域的探测集群发起探测，包括中国大陆区域以及非中国大陆区域，各个区域的集群独立维护各自的探测结果；<br>mainland_china：仅由中国大陆区域的探测集群发起探测，当前中国大陆区域共用一个探测集群，探测结果由中国大陆区域的探测集群维护，其他区域跟随中国大陆区域的集群的探测结果；<br>overseas：仅由非中国大陆区域的探测集群发起探测，当前非中国大陆区域包含多个地区的探测集群，探测结果由各个地区的探测集群独立维护，中国大陆区域的探测结果由所有其他地区的探测集群的探测结果汇总生成。<br>默认为 global。</p>
     */
    public void setProbeCluster(String ProbeCluster) {
        this.ProbeCluster = ProbeCluster;
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
        if (source.ProbeCluster != null) {
            this.ProbeCluster = new String(source.ProbeCluster);
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
        this.setParamSimple(map, prefix + "ProbeCluster", this.ProbeCluster);

    }
}

