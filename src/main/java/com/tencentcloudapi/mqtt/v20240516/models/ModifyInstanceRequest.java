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

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要修改的备注信息，最多128个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 需要变更的配置规格
基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 客户端证书注册方式：
JITP：自动注册
API：手动通过API注册
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * 自动注册证书是否自动激活
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

    /**
    * 授权策略开关
    */
    @SerializedName("AuthorizationPolicy")
    @Expose
    private Boolean AuthorizationPolicy;

    /**
    * 是否使用默认的服务端证书
    */
    @SerializedName("UseDefaultServerCert")
    @Expose
    private Boolean UseDefaultServerCert;

    /**
    * TLS：单向认证
mTLS；双向认证
BYOC：一机一证
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * 单客户端消息收发限速单位 条/秒
    */
    @SerializedName("MessageRate")
    @Expose
    private Long MessageRate;

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
     * Get 要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。 
     * @return Name 要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。
     * @param Name 要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 要修改的备注信息，最多128个字符。 
     * @return Remark 要修改的备注信息，最多128个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 要修改的备注信息，最多128个字符。
     * @param Remark 要修改的备注信息，最多128个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 需要变更的配置规格
基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。 
     * @return SkuCode 需要变更的配置规格
基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 需要变更的配置规格
基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。
     * @param SkuCode 需要变更的配置规格
基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 客户端证书注册方式：
JITP：自动注册
API：手动通过API注册 
     * @return DeviceCertificateProvisionType 客户端证书注册方式：
JITP：自动注册
API：手动通过API注册
     * @deprecated
     */
    @Deprecated
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set 客户端证书注册方式：
JITP：自动注册
API：手动通过API注册
     * @param DeviceCertificateProvisionType 客户端证书注册方式：
JITP：自动注册
API：手动通过API注册
     * @deprecated
     */
    @Deprecated
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get 自动注册证书是否自动激活 
     * @return AutomaticActivation 自动注册证书是否自动激活
     * @deprecated
     */
    @Deprecated
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set 自动注册证书是否自动激活
     * @param AutomaticActivation 自动注册证书是否自动激活
     * @deprecated
     */
    @Deprecated
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    /**
     * Get 授权策略开关 
     * @return AuthorizationPolicy 授权策略开关
     */
    public Boolean getAuthorizationPolicy() {
        return this.AuthorizationPolicy;
    }

    /**
     * Set 授权策略开关
     * @param AuthorizationPolicy 授权策略开关
     */
    public void setAuthorizationPolicy(Boolean AuthorizationPolicy) {
        this.AuthorizationPolicy = AuthorizationPolicy;
    }

    /**
     * Get 是否使用默认的服务端证书 
     * @return UseDefaultServerCert 是否使用默认的服务端证书
     */
    public Boolean getUseDefaultServerCert() {
        return this.UseDefaultServerCert;
    }

    /**
     * Set 是否使用默认的服务端证书
     * @param UseDefaultServerCert 是否使用默认的服务端证书
     */
    public void setUseDefaultServerCert(Boolean UseDefaultServerCert) {
        this.UseDefaultServerCert = UseDefaultServerCert;
    }

    /**
     * Get TLS：单向认证
mTLS；双向认证
BYOC：一机一证 
     * @return X509Mode TLS：单向认证
mTLS；双向认证
BYOC：一机一证
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set TLS：单向认证
mTLS；双向认证
BYOC：一机一证
     * @param X509Mode TLS：单向认证
mTLS；双向认证
BYOC：一机一证
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get 单客户端消息收发限速单位 条/秒 
     * @return MessageRate 单客户端消息收发限速单位 条/秒
     */
    public Long getMessageRate() {
        return this.MessageRate;
    }

    /**
     * Set 单客户端消息收发限速单位 条/秒
     * @param MessageRate 单客户端消息收发限速单位 条/秒
     */
    public void setMessageRate(Long MessageRate) {
        this.MessageRate = MessageRate;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.DeviceCertificateProvisionType != null) {
            this.DeviceCertificateProvisionType = new String(source.DeviceCertificateProvisionType);
        }
        if (source.AutomaticActivation != null) {
            this.AutomaticActivation = new Boolean(source.AutomaticActivation);
        }
        if (source.AuthorizationPolicy != null) {
            this.AuthorizationPolicy = new Boolean(source.AuthorizationPolicy);
        }
        if (source.UseDefaultServerCert != null) {
            this.UseDefaultServerCert = new Boolean(source.UseDefaultServerCert);
        }
        if (source.X509Mode != null) {
            this.X509Mode = new String(source.X509Mode);
        }
        if (source.MessageRate != null) {
            this.MessageRate = new Long(source.MessageRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "DeviceCertificateProvisionType", this.DeviceCertificateProvisionType);
        this.setParamSimple(map, prefix + "AutomaticActivation", this.AutomaticActivation);
        this.setParamSimple(map, prefix + "AuthorizationPolicy", this.AuthorizationPolicy);
        this.setParamSimple(map, prefix + "UseDefaultServerCert", this.UseDefaultServerCert);
        this.setParamSimple(map, prefix + "X509Mode", this.X509Mode);
        this.setParamSimple(map, prefix + "MessageRate", this.MessageRate);

    }
}

