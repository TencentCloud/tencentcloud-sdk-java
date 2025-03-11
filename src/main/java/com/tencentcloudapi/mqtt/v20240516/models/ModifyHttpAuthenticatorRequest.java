/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class ModifyHttpAuthenticatorRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 端点
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 认证器状态：open-启用；close-关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 最大并发连接数，默认8，范围：1-20
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

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
    * 说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 请求方法，GET 或者 POST
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 请求header
    */
    @SerializedName("Header")
    @Expose
    private HeaderItem [] Header;

    /**
    * 请求body
    */
    @SerializedName("Body")
    @Expose
    private BodyItem [] Body;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 端点 
     * @return Endpoint 端点
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 端点
     * @param Endpoint 端点
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 认证器状态：open-启用；close-关闭 
     * @return Status 认证器状态：open-启用；close-关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 认证器状态：open-启用；close-关闭
     * @param Status 认证器状态：open-启用；close-关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 最大并发连接数，默认8，范围：1-20 
     * @return Concurrency 最大并发连接数，默认8，范围：1-20
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set 最大并发连接数，默认8，范围：1-20
     * @param Concurrency 最大并发连接数，默认8，范围：1-20
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
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
     * Get 说明 
     * @return Remark 说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
     * @param Remark 说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 请求方法，GET 或者 POST 
     * @return Method 请求方法，GET 或者 POST
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法，GET 或者 POST
     * @param Method 请求方法，GET 或者 POST
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 请求header 
     * @return Header 请求header
     */
    public HeaderItem [] getHeader() {
        return this.Header;
    }

    /**
     * Set 请求header
     * @param Header 请求header
     */
    public void setHeader(HeaderItem [] Header) {
        this.Header = Header;
    }

    /**
     * Get 请求body 
     * @return Body 请求body
     */
    public BodyItem [] getBody() {
        return this.Body;
    }

    /**
     * Set 请求body
     * @param Body 请求body
     */
    public void setBody(BodyItem [] Body) {
        this.Body = Body;
    }

    public ModifyHttpAuthenticatorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHttpAuthenticatorRequest(ModifyHttpAuthenticatorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Concurrency != null) {
            this.Concurrency = new Long(source.Concurrency);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.ReadTimeout != null) {
            this.ReadTimeout = new Long(source.ReadTimeout);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "ReadTimeout", this.ReadTimeout);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArrayObj(map, prefix + "Header.", this.Header);
        this.setParamArrayObj(map, prefix + "Body.", this.Body);

    }
}

