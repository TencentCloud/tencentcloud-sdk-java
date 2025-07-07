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

public class ModifyInstanceCertBindingRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 加密通信方式
TLS：单向证书认证
mTLS：双向证书认证
BYOC：一设备一证书认证
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * 服务端证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS或BYOC时为必填。
    */
    @SerializedName("SSLServerCertId")
    @Expose
    private String SSLServerCertId;

    /**
    * CA证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS时为必填
    */
    @SerializedName("SSLCaCertId")
    @Expose
    private String SSLCaCertId;

    /**
    * 设备证书注册类型：
JITP：自动注册；
API：手动注册
默认值：API
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * 是否自动激活，默认为false
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

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
     * Get 加密通信方式
TLS：单向证书认证
mTLS：双向证书认证
BYOC：一设备一证书认证 
     * @return X509Mode 加密通信方式
TLS：单向证书认证
mTLS：双向证书认证
BYOC：一设备一证书认证
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set 加密通信方式
TLS：单向证书认证
mTLS：双向证书认证
BYOC：一设备一证书认证
     * @param X509Mode 加密通信方式
TLS：单向证书认证
mTLS：双向证书认证
BYOC：一设备一证书认证
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get 服务端证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS或BYOC时为必填。 
     * @return SSLServerCertId 服务端证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS或BYOC时为必填。
     */
    public String getSSLServerCertId() {
        return this.SSLServerCertId;
    }

    /**
     * Set 服务端证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS或BYOC时为必填。
     * @param SSLServerCertId 服务端证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS或BYOC时为必填。
     */
    public void setSSLServerCertId(String SSLServerCertId) {
        this.SSLServerCertId = SSLServerCertId;
    }

    /**
     * Get CA证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS时为必填 
     * @return SSLCaCertId CA证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS时为必填
     */
    public String getSSLCaCertId() {
        return this.SSLCaCertId;
    }

    /**
     * Set CA证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS时为必填
     * @param SSLCaCertId CA证书id，从 [获取证书列表](https://cloud.tencent.com/document/api/400/41671) 或者腾讯云证书服务控制台获取。X509Mode为mTLS时为必填
     */
    public void setSSLCaCertId(String SSLCaCertId) {
        this.SSLCaCertId = SSLCaCertId;
    }

    /**
     * Get 设备证书注册类型：
JITP：自动注册；
API：手动注册
默认值：API 
     * @return DeviceCertificateProvisionType 设备证书注册类型：
JITP：自动注册；
API：手动注册
默认值：API
     */
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set 设备证书注册类型：
JITP：自动注册；
API：手动注册
默认值：API
     * @param DeviceCertificateProvisionType 设备证书注册类型：
JITP：自动注册；
API：手动注册
默认值：API
     */
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get 是否自动激活，默认为false 
     * @return AutomaticActivation 是否自动激活，默认为false
     */
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set 是否自动激活，默认为false
     * @param AutomaticActivation 是否自动激活，默认为false
     */
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    public ModifyInstanceCertBindingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceCertBindingRequest(ModifyInstanceCertBindingRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.X509Mode != null) {
            this.X509Mode = new String(source.X509Mode);
        }
        if (source.SSLServerCertId != null) {
            this.SSLServerCertId = new String(source.SSLServerCertId);
        }
        if (source.SSLCaCertId != null) {
            this.SSLCaCertId = new String(source.SSLCaCertId);
        }
        if (source.DeviceCertificateProvisionType != null) {
            this.DeviceCertificateProvisionType = new String(source.DeviceCertificateProvisionType);
        }
        if (source.AutomaticActivation != null) {
            this.AutomaticActivation = new Boolean(source.AutomaticActivation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "X509Mode", this.X509Mode);
        this.setParamSimple(map, prefix + "SSLServerCertId", this.SSLServerCertId);
        this.setParamSimple(map, prefix + "SSLCaCertId", this.SSLCaCertId);
        this.setParamSimple(map, prefix + "DeviceCertificateProvisionType", this.DeviceCertificateProvisionType);
        this.setParamSimple(map, prefix + "AutomaticActivation", this.AutomaticActivation);

    }
}

