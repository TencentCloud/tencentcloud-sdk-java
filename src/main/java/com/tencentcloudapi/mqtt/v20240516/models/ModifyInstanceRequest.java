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
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>要修改的备注信息，最多128个字符。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>需要变更的配置规格<br>基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。</p>
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * <p>客户端证书注册方式：<br>JITP：自动注册<br>API：手动通过API注册</p>
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * <p>自动注册证书是否自动激活</p>
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

    /**
    * <p>授权策略开关</p>
    */
    @SerializedName("AuthorizationPolicy")
    @Expose
    private Boolean AuthorizationPolicy;

    /**
    * <p>是否使用默认的服务端证书</p>
    */
    @SerializedName("UseDefaultServerCert")
    @Expose
    private Boolean UseDefaultServerCert;

    /**
    * <p>TLS：单向认证<br>mTLS；双向认证<br>BYOC：一机一证</p>
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * <p>单客户端消息收发限速单位 条/秒</p>
    */
    @SerializedName("MessageRate")
    @Expose
    private Long MessageRate;

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p> 
     * @return Name <p>要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p>
     * @param Name <p>要修改实例名称，不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>要修改的备注信息，最多128个字符。</p> 
     * @return Remark <p>要修改的备注信息，最多128个字符。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>要修改的备注信息，最多128个字符。</p>
     * @param Remark <p>要修改的备注信息，最多128个字符。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>需要变更的配置规格<br>基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。</p> 
     * @return SkuCode <p>需要变更的配置规格<br>基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。</p>
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set <p>需要变更的配置规格<br>基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。</p>
     * @param SkuCode <p>需要变更的配置规格<br>基础版和专业版集群不能升配到铂金版规格，铂金版集群不能降配至基础版和增强版规格。</p>
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get <p>客户端证书注册方式：<br>JITP：自动注册<br>API：手动通过API注册</p> 
     * @return DeviceCertificateProvisionType <p>客户端证书注册方式：<br>JITP：自动注册<br>API：手动通过API注册</p>
     */
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set <p>客户端证书注册方式：<br>JITP：自动注册<br>API：手动通过API注册</p>
     * @param DeviceCertificateProvisionType <p>客户端证书注册方式：<br>JITP：自动注册<br>API：手动通过API注册</p>
     */
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get <p>自动注册证书是否自动激活</p> 
     * @return AutomaticActivation <p>自动注册证书是否自动激活</p>
     */
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set <p>自动注册证书是否自动激活</p>
     * @param AutomaticActivation <p>自动注册证书是否自动激活</p>
     */
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    /**
     * Get <p>授权策略开关</p> 
     * @return AuthorizationPolicy <p>授权策略开关</p>
     */
    public Boolean getAuthorizationPolicy() {
        return this.AuthorizationPolicy;
    }

    /**
     * Set <p>授权策略开关</p>
     * @param AuthorizationPolicy <p>授权策略开关</p>
     */
    public void setAuthorizationPolicy(Boolean AuthorizationPolicy) {
        this.AuthorizationPolicy = AuthorizationPolicy;
    }

    /**
     * Get <p>是否使用默认的服务端证书</p> 
     * @return UseDefaultServerCert <p>是否使用默认的服务端证书</p>
     */
    public Boolean getUseDefaultServerCert() {
        return this.UseDefaultServerCert;
    }

    /**
     * Set <p>是否使用默认的服务端证书</p>
     * @param UseDefaultServerCert <p>是否使用默认的服务端证书</p>
     */
    public void setUseDefaultServerCert(Boolean UseDefaultServerCert) {
        this.UseDefaultServerCert = UseDefaultServerCert;
    }

    /**
     * Get <p>TLS：单向认证<br>mTLS；双向认证<br>BYOC：一机一证</p> 
     * @return X509Mode <p>TLS：单向认证<br>mTLS；双向认证<br>BYOC：一机一证</p>
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set <p>TLS：单向认证<br>mTLS；双向认证<br>BYOC：一机一证</p>
     * @param X509Mode <p>TLS：单向认证<br>mTLS；双向认证<br>BYOC：一机一证</p>
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get <p>单客户端消息收发限速单位 条/秒</p> 
     * @return MessageRate <p>单客户端消息收发限速单位 条/秒</p>
     */
    public Long getMessageRate() {
        return this.MessageRate;
    }

    /**
     * Set <p>单客户端消息收发限速单位 条/秒</p>
     * @param MessageRate <p>单客户端消息收发限速单位 条/秒</p>
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

