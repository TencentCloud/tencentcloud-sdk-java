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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class XForwardedForConfig extends AbstractModel {

    /**
    * 是否通过 ALB-ID 头字段获取负载均衡实例ID。
- **true**：是。
- **false**：否。
    */
    @SerializedName("XForwardedForAlbIdEnabled")
    @Expose
    private Boolean XForwardedForAlbIdEnabled;

    /**
    * 是否通过X-Forwarded-Client-srcport头字段获取访问负载均衡实例客户端的端口。
- **true**：是。
- **false**：否。
    */
    @SerializedName("XForwardedForClientSrcPortEnabled")
    @Expose
    private Boolean XForwardedForClientSrcPortEnabled;

    /**
    * 是否开启通过X-Forwarded-Host头字段获取访问负载均衡实例客户端的域名。
- **true**：是。
- **false**：否。
    */
    @SerializedName("XForwardedForHostEnabled")
    @Expose
    private Boolean XForwardedForHostEnabled;

    /**
    * 指定如何处理 X-Forwarded-For（XFF）HTTP 头字段。
- **append**:  附加模式（默认），将客户端的真实 IP 地址附加到 X-Forwarded-For 头的末尾，保留原有的 XFF 链路信息
- **remove**:  删除模式，移除 X-Forwarded-For 头字段，不将该头传递给后端服务器
- **passthrough**: 透传模式，保持 X-Forwarded-For 头不变，直接透传给后端服务器，不做任何修改

    */
    @SerializedName("XForwardedForMode")
    @Expose
    private String XForwardedForMode;

    /**
    * 是否通过X-Forwarded-Port头字段获取负载均衡实例的监听端口。
- **true**：是。
- **false**：否。
    */
    @SerializedName("XForwardedForPortEnabled")
    @Expose
    private Boolean XForwardedForPortEnabled;

    /**
    * 是否通过X-Forwarded-Proto头字段获取负载均衡实例的监听协议。
- **true**：是。
- **false**：否。

    */
    @SerializedName("XForwardedForProtoEnabled")
    @Expose
    private Boolean XForwardedForProtoEnabled;

    /**
    * 是否通过 X-Tencent-Client-IDN 头访问 客户端证书的颁发者 $ssl_client_i_dn。
- **true**：是。
- **false**：否。

    */
    @SerializedName("XTencentClientIDNEnabled")
    @Expose
    private Boolean XTencentClientIDNEnabled;

    /**
    * 是否通过 X-Tencent-Client-SDN 头访问客户端证书的主题$ssl_client_s_dn。
- **true**：是。
- **false**：否。

    */
    @SerializedName("XTencentClientSDNEnabled")
    @Expose
    private Boolean XTencentClientSDNEnabled;

    /**
    * 是否通过 X-Tencent-Client-Serial 头访问 客户端证书的序列号 $ssl_client_serial。
- **true**：是。
- **false**：否。

    */
    @SerializedName("XTencentClientSerialEnabled")
    @Expose
    private Boolean XTencentClientSerialEnabled;

    /**
    * 是通过 X-Tencent-Client-Verify 头访问 客户端证书的验证结果 $ssl_client_verify。
- **true**：是。
- **false**：否。

    */
    @SerializedName("XTencentClientVerifyEnabled")
    @Expose
    private Boolean XTencentClientVerifyEnabled;

    /**
     * Get 是否通过 ALB-ID 头字段获取负载均衡实例ID。
- **true**：是。
- **false**：否。 
     * @return XForwardedForAlbIdEnabled 是否通过 ALB-ID 头字段获取负载均衡实例ID。
- **true**：是。
- **false**：否。
     */
    public Boolean getXForwardedForAlbIdEnabled() {
        return this.XForwardedForAlbIdEnabled;
    }

    /**
     * Set 是否通过 ALB-ID 头字段获取负载均衡实例ID。
- **true**：是。
- **false**：否。
     * @param XForwardedForAlbIdEnabled 是否通过 ALB-ID 头字段获取负载均衡实例ID。
- **true**：是。
- **false**：否。
     */
    public void setXForwardedForAlbIdEnabled(Boolean XForwardedForAlbIdEnabled) {
        this.XForwardedForAlbIdEnabled = XForwardedForAlbIdEnabled;
    }

    /**
     * Get 是否通过X-Forwarded-Client-srcport头字段获取访问负载均衡实例客户端的端口。
- **true**：是。
- **false**：否。 
     * @return XForwardedForClientSrcPortEnabled 是否通过X-Forwarded-Client-srcport头字段获取访问负载均衡实例客户端的端口。
- **true**：是。
- **false**：否。
     */
    public Boolean getXForwardedForClientSrcPortEnabled() {
        return this.XForwardedForClientSrcPortEnabled;
    }

    /**
     * Set 是否通过X-Forwarded-Client-srcport头字段获取访问负载均衡实例客户端的端口。
- **true**：是。
- **false**：否。
     * @param XForwardedForClientSrcPortEnabled 是否通过X-Forwarded-Client-srcport头字段获取访问负载均衡实例客户端的端口。
- **true**：是。
- **false**：否。
     */
    public void setXForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
        this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
    }

    /**
     * Get 是否开启通过X-Forwarded-Host头字段获取访问负载均衡实例客户端的域名。
- **true**：是。
- **false**：否。 
     * @return XForwardedForHostEnabled 是否开启通过X-Forwarded-Host头字段获取访问负载均衡实例客户端的域名。
- **true**：是。
- **false**：否。
     */
    public Boolean getXForwardedForHostEnabled() {
        return this.XForwardedForHostEnabled;
    }

    /**
     * Set 是否开启通过X-Forwarded-Host头字段获取访问负载均衡实例客户端的域名。
- **true**：是。
- **false**：否。
     * @param XForwardedForHostEnabled 是否开启通过X-Forwarded-Host头字段获取访问负载均衡实例客户端的域名。
- **true**：是。
- **false**：否。
     */
    public void setXForwardedForHostEnabled(Boolean XForwardedForHostEnabled) {
        this.XForwardedForHostEnabled = XForwardedForHostEnabled;
    }

    /**
     * Get 指定如何处理 X-Forwarded-For（XFF）HTTP 头字段。
- **append**:  附加模式（默认），将客户端的真实 IP 地址附加到 X-Forwarded-For 头的末尾，保留原有的 XFF 链路信息
- **remove**:  删除模式，移除 X-Forwarded-For 头字段，不将该头传递给后端服务器
- **passthrough**: 透传模式，保持 X-Forwarded-For 头不变，直接透传给后端服务器，不做任何修改
 
     * @return XForwardedForMode 指定如何处理 X-Forwarded-For（XFF）HTTP 头字段。
- **append**:  附加模式（默认），将客户端的真实 IP 地址附加到 X-Forwarded-For 头的末尾，保留原有的 XFF 链路信息
- **remove**:  删除模式，移除 X-Forwarded-For 头字段，不将该头传递给后端服务器
- **passthrough**: 透传模式，保持 X-Forwarded-For 头不变，直接透传给后端服务器，不做任何修改

     */
    public String getXForwardedForMode() {
        return this.XForwardedForMode;
    }

    /**
     * Set 指定如何处理 X-Forwarded-For（XFF）HTTP 头字段。
- **append**:  附加模式（默认），将客户端的真实 IP 地址附加到 X-Forwarded-For 头的末尾，保留原有的 XFF 链路信息
- **remove**:  删除模式，移除 X-Forwarded-For 头字段，不将该头传递给后端服务器
- **passthrough**: 透传模式，保持 X-Forwarded-For 头不变，直接透传给后端服务器，不做任何修改

     * @param XForwardedForMode 指定如何处理 X-Forwarded-For（XFF）HTTP 头字段。
- **append**:  附加模式（默认），将客户端的真实 IP 地址附加到 X-Forwarded-For 头的末尾，保留原有的 XFF 链路信息
- **remove**:  删除模式，移除 X-Forwarded-For 头字段，不将该头传递给后端服务器
- **passthrough**: 透传模式，保持 X-Forwarded-For 头不变，直接透传给后端服务器，不做任何修改

     */
    public void setXForwardedForMode(String XForwardedForMode) {
        this.XForwardedForMode = XForwardedForMode;
    }

    /**
     * Get 是否通过X-Forwarded-Port头字段获取负载均衡实例的监听端口。
- **true**：是。
- **false**：否。 
     * @return XForwardedForPortEnabled 是否通过X-Forwarded-Port头字段获取负载均衡实例的监听端口。
- **true**：是。
- **false**：否。
     */
    public Boolean getXForwardedForPortEnabled() {
        return this.XForwardedForPortEnabled;
    }

    /**
     * Set 是否通过X-Forwarded-Port头字段获取负载均衡实例的监听端口。
- **true**：是。
- **false**：否。
     * @param XForwardedForPortEnabled 是否通过X-Forwarded-Port头字段获取负载均衡实例的监听端口。
- **true**：是。
- **false**：否。
     */
    public void setXForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
        this.XForwardedForPortEnabled = XForwardedForPortEnabled;
    }

    /**
     * Get 是否通过X-Forwarded-Proto头字段获取负载均衡实例的监听协议。
- **true**：是。
- **false**：否。
 
     * @return XForwardedForProtoEnabled 是否通过X-Forwarded-Proto头字段获取负载均衡实例的监听协议。
- **true**：是。
- **false**：否。

     */
    public Boolean getXForwardedForProtoEnabled() {
        return this.XForwardedForProtoEnabled;
    }

    /**
     * Set 是否通过X-Forwarded-Proto头字段获取负载均衡实例的监听协议。
- **true**：是。
- **false**：否。

     * @param XForwardedForProtoEnabled 是否通过X-Forwarded-Proto头字段获取负载均衡实例的监听协议。
- **true**：是。
- **false**：否。

     */
    public void setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
        this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
    }

    /**
     * Get 是否通过 X-Tencent-Client-IDN 头访问 客户端证书的颁发者 $ssl_client_i_dn。
- **true**：是。
- **false**：否。
 
     * @return XTencentClientIDNEnabled 是否通过 X-Tencent-Client-IDN 头访问 客户端证书的颁发者 $ssl_client_i_dn。
- **true**：是。
- **false**：否。

     */
    public Boolean getXTencentClientIDNEnabled() {
        return this.XTencentClientIDNEnabled;
    }

    /**
     * Set 是否通过 X-Tencent-Client-IDN 头访问 客户端证书的颁发者 $ssl_client_i_dn。
- **true**：是。
- **false**：否。

     * @param XTencentClientIDNEnabled 是否通过 X-Tencent-Client-IDN 头访问 客户端证书的颁发者 $ssl_client_i_dn。
- **true**：是。
- **false**：否。

     */
    public void setXTencentClientIDNEnabled(Boolean XTencentClientIDNEnabled) {
        this.XTencentClientIDNEnabled = XTencentClientIDNEnabled;
    }

    /**
     * Get 是否通过 X-Tencent-Client-SDN 头访问客户端证书的主题$ssl_client_s_dn。
- **true**：是。
- **false**：否。
 
     * @return XTencentClientSDNEnabled 是否通过 X-Tencent-Client-SDN 头访问客户端证书的主题$ssl_client_s_dn。
- **true**：是。
- **false**：否。

     */
    public Boolean getXTencentClientSDNEnabled() {
        return this.XTencentClientSDNEnabled;
    }

    /**
     * Set 是否通过 X-Tencent-Client-SDN 头访问客户端证书的主题$ssl_client_s_dn。
- **true**：是。
- **false**：否。

     * @param XTencentClientSDNEnabled 是否通过 X-Tencent-Client-SDN 头访问客户端证书的主题$ssl_client_s_dn。
- **true**：是。
- **false**：否。

     */
    public void setXTencentClientSDNEnabled(Boolean XTencentClientSDNEnabled) {
        this.XTencentClientSDNEnabled = XTencentClientSDNEnabled;
    }

    /**
     * Get 是否通过 X-Tencent-Client-Serial 头访问 客户端证书的序列号 $ssl_client_serial。
- **true**：是。
- **false**：否。
 
     * @return XTencentClientSerialEnabled 是否通过 X-Tencent-Client-Serial 头访问 客户端证书的序列号 $ssl_client_serial。
- **true**：是。
- **false**：否。

     */
    public Boolean getXTencentClientSerialEnabled() {
        return this.XTencentClientSerialEnabled;
    }

    /**
     * Set 是否通过 X-Tencent-Client-Serial 头访问 客户端证书的序列号 $ssl_client_serial。
- **true**：是。
- **false**：否。

     * @param XTencentClientSerialEnabled 是否通过 X-Tencent-Client-Serial 头访问 客户端证书的序列号 $ssl_client_serial。
- **true**：是。
- **false**：否。

     */
    public void setXTencentClientSerialEnabled(Boolean XTencentClientSerialEnabled) {
        this.XTencentClientSerialEnabled = XTencentClientSerialEnabled;
    }

    /**
     * Get 是通过 X-Tencent-Client-Verify 头访问 客户端证书的验证结果 $ssl_client_verify。
- **true**：是。
- **false**：否。
 
     * @return XTencentClientVerifyEnabled 是通过 X-Tencent-Client-Verify 头访问 客户端证书的验证结果 $ssl_client_verify。
- **true**：是。
- **false**：否。

     */
    public Boolean getXTencentClientVerifyEnabled() {
        return this.XTencentClientVerifyEnabled;
    }

    /**
     * Set 是通过 X-Tencent-Client-Verify 头访问 客户端证书的验证结果 $ssl_client_verify。
- **true**：是。
- **false**：否。

     * @param XTencentClientVerifyEnabled 是通过 X-Tencent-Client-Verify 头访问 客户端证书的验证结果 $ssl_client_verify。
- **true**：是。
- **false**：否。

     */
    public void setXTencentClientVerifyEnabled(Boolean XTencentClientVerifyEnabled) {
        this.XTencentClientVerifyEnabled = XTencentClientVerifyEnabled;
    }

    public XForwardedForConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XForwardedForConfig(XForwardedForConfig source) {
        if (source.XForwardedForAlbIdEnabled != null) {
            this.XForwardedForAlbIdEnabled = new Boolean(source.XForwardedForAlbIdEnabled);
        }
        if (source.XForwardedForClientSrcPortEnabled != null) {
            this.XForwardedForClientSrcPortEnabled = new Boolean(source.XForwardedForClientSrcPortEnabled);
        }
        if (source.XForwardedForHostEnabled != null) {
            this.XForwardedForHostEnabled = new Boolean(source.XForwardedForHostEnabled);
        }
        if (source.XForwardedForMode != null) {
            this.XForwardedForMode = new String(source.XForwardedForMode);
        }
        if (source.XForwardedForPortEnabled != null) {
            this.XForwardedForPortEnabled = new Boolean(source.XForwardedForPortEnabled);
        }
        if (source.XForwardedForProtoEnabled != null) {
            this.XForwardedForProtoEnabled = new Boolean(source.XForwardedForProtoEnabled);
        }
        if (source.XTencentClientIDNEnabled != null) {
            this.XTencentClientIDNEnabled = new Boolean(source.XTencentClientIDNEnabled);
        }
        if (source.XTencentClientSDNEnabled != null) {
            this.XTencentClientSDNEnabled = new Boolean(source.XTencentClientSDNEnabled);
        }
        if (source.XTencentClientSerialEnabled != null) {
            this.XTencentClientSerialEnabled = new Boolean(source.XTencentClientSerialEnabled);
        }
        if (source.XTencentClientVerifyEnabled != null) {
            this.XTencentClientVerifyEnabled = new Boolean(source.XTencentClientVerifyEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "XForwardedForAlbIdEnabled", this.XForwardedForAlbIdEnabled);
        this.setParamSimple(map, prefix + "XForwardedForClientSrcPortEnabled", this.XForwardedForClientSrcPortEnabled);
        this.setParamSimple(map, prefix + "XForwardedForHostEnabled", this.XForwardedForHostEnabled);
        this.setParamSimple(map, prefix + "XForwardedForMode", this.XForwardedForMode);
        this.setParamSimple(map, prefix + "XForwardedForPortEnabled", this.XForwardedForPortEnabled);
        this.setParamSimple(map, prefix + "XForwardedForProtoEnabled", this.XForwardedForProtoEnabled);
        this.setParamSimple(map, prefix + "XTencentClientIDNEnabled", this.XTencentClientIDNEnabled);
        this.setParamSimple(map, prefix + "XTencentClientSDNEnabled", this.XTencentClientSDNEnabled);
        this.setParamSimple(map, prefix + "XTencentClientSerialEnabled", this.XTencentClientSerialEnabled);
        this.setParamSimple(map, prefix + "XTencentClientVerifyEnabled", this.XTencentClientVerifyEnabled);

    }
}

