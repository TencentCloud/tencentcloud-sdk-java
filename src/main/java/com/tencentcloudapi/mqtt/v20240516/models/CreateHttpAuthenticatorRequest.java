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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHttpAuthenticatorRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * jwks服务地址
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 最大并发连接数，默认8，范围：1-10
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * 网络请求方法 GET 或 POST，默认POST
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 认证器是否开启：open-启用；close-关闭，默认open-启用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 说明，最多支持128个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 连接超时时间，单位：秒，范围：1-30
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * 请求超时时间，单位：秒，范围：1-30
    */
    @SerializedName("ReadTimeout")
    @Expose
    private Long ReadTimeout;

    /**
    * 转发请求header
    */
    @SerializedName("Header")
    @Expose
    private HeaderItem [] Header;

    /**
    * 转发请求body
    */
    @SerializedName("Body")
    @Expose
    private BodyItem [] Body;

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get jwks服务地址 
     * @return Endpoint jwks服务地址
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set jwks服务地址
     * @param Endpoint jwks服务地址
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 最大并发连接数，默认8，范围：1-10 
     * @return Concurrency 最大并发连接数，默认8，范围：1-10
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set 最大并发连接数，默认8，范围：1-10
     * @param Concurrency 最大并发连接数，默认8，范围：1-10
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get 网络请求方法 GET 或 POST，默认POST 
     * @return Method 网络请求方法 GET 或 POST，默认POST
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 网络请求方法 GET 或 POST，默认POST
     * @param Method 网络请求方法 GET 或 POST，默认POST
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 认证器是否开启：open-启用；close-关闭，默认open-启用 
     * @return Status 认证器是否开启：open-启用；close-关闭，默认open-启用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 认证器是否开启：open-启用；close-关闭，默认open-启用
     * @param Status 认证器是否开启：open-启用；close-关闭，默认open-启用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 说明，最多支持128个字符。 
     * @return Remark 说明，最多支持128个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，最多支持128个字符。
     * @param Remark 说明，最多支持128个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 连接超时时间，单位：秒，范围：1-30 
     * @return ConnectTimeout 连接超时时间，单位：秒，范围：1-30
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set 连接超时时间，单位：秒，范围：1-30
     * @param ConnectTimeout 连接超时时间，单位：秒，范围：1-30
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get 请求超时时间，单位：秒，范围：1-30 
     * @return ReadTimeout 请求超时时间，单位：秒，范围：1-30
     */
    public Long getReadTimeout() {
        return this.ReadTimeout;
    }

    /**
     * Set 请求超时时间，单位：秒，范围：1-30
     * @param ReadTimeout 请求超时时间，单位：秒，范围：1-30
     */
    public void setReadTimeout(Long ReadTimeout) {
        this.ReadTimeout = ReadTimeout;
    }

    /**
     * Get 转发请求header 
     * @return Header 转发请求header
     */
    public HeaderItem [] getHeader() {
        return this.Header;
    }

    /**
     * Set 转发请求header
     * @param Header 转发请求header
     */
    public void setHeader(HeaderItem [] Header) {
        this.Header = Header;
    }

    /**
     * Get 转发请求body 
     * @return Body 转发请求body
     */
    public BodyItem [] getBody() {
        return this.Body;
    }

    /**
     * Set 转发请求body
     * @param Body 转发请求body
     */
    public void setBody(BodyItem [] Body) {
        this.Body = Body;
    }

    public CreateHttpAuthenticatorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHttpAuthenticatorRequest(CreateHttpAuthenticatorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Concurrency != null) {
            this.Concurrency = new Long(source.Concurrency);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.ReadTimeout != null) {
            this.ReadTimeout = new Long(source.ReadTimeout);
        }
        if (source.Header != null) {
            this.Header = new HeaderItem[source.Header.length];
            for (int i = 0; i < source.Header.length; i++) {
                this.Header[i] = new HeaderItem(source.Header[i]);
            }
        }
        if (source.Body != null) {
            this.Body = new BodyItem[source.Body.length];
            for (int i = 0; i < source.Body.length; i++) {
                this.Body[i] = new BodyItem(source.Body[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "ReadTimeout", this.ReadTimeout);
        this.setParamArrayObj(map, prefix + "Header.", this.Header);
        this.setParamArrayObj(map, prefix + "Body.", this.Body);

    }
}

