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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExtensionResponse extends AbstractModel{

    /**
    * 分机号
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * 域名
    */
    @SerializedName("ExtensionDomain")
    @Expose
    private String ExtensionDomain;

    /**
    * 注册密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 代理服务器地址
    */
    @SerializedName("OutboundProxy")
    @Expose
    private String OutboundProxy;

    /**
    * 传输协议
    */
    @SerializedName("Transport")
    @Expose
    private String Transport;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分机号 
     * @return ExtensionId 分机号
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set 分机号
     * @param ExtensionId 分机号
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get 域名 
     * @return ExtensionDomain 域名
     */
    public String getExtensionDomain() {
        return this.ExtensionDomain;
    }

    /**
     * Set 域名
     * @param ExtensionDomain 域名
     */
    public void setExtensionDomain(String ExtensionDomain) {
        this.ExtensionDomain = ExtensionDomain;
    }

    /**
     * Get 注册密码 
     * @return Password 注册密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 注册密码
     * @param Password 注册密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 代理服务器地址 
     * @return OutboundProxy 代理服务器地址
     */
    public String getOutboundProxy() {
        return this.OutboundProxy;
    }

    /**
     * Set 代理服务器地址
     * @param OutboundProxy 代理服务器地址
     */
    public void setOutboundProxy(String OutboundProxy) {
        this.OutboundProxy = OutboundProxy;
    }

    /**
     * Get 传输协议 
     * @return Transport 传输协议
     */
    public String getTransport() {
        return this.Transport;
    }

    /**
     * Set 传输协议
     * @param Transport 传输协议
     */
    public void setTransport(String Transport) {
        this.Transport = Transport;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeExtensionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtensionResponse(DescribeExtensionResponse source) {
        if (source.ExtensionId != null) {
            this.ExtensionId = new String(source.ExtensionId);
        }
        if (source.ExtensionDomain != null) {
            this.ExtensionDomain = new String(source.ExtensionDomain);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.OutboundProxy != null) {
            this.OutboundProxy = new String(source.OutboundProxy);
        }
        if (source.Transport != null) {
            this.Transport = new String(source.Transport);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExtensionId", this.ExtensionId);
        this.setParamSimple(map, prefix + "ExtensionDomain", this.ExtensionDomain);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "OutboundProxy", this.OutboundProxy);
        this.setParamSimple(map, prefix + "Transport", this.Transport);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

