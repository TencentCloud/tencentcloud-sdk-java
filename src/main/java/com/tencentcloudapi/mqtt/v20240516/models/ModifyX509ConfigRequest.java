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

public class ModifyX509ConfigRequest extends AbstractModel {

    /**
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>证书验证模式</p><p>枚举值：</p><ul><li>TLS： 单向认证</li><li>mTLS： 双向认证</li><li>BYOC： 一机一证</li></ul>
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * <p>证书注册方式</p><p>枚举值：</p><ul><li>JITP： 自动注册</li><li>API： 手工注册</li></ul>
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * <p>证书自动后激活状态</p><p>枚举值：</p><ul><li>true： 自动激活</li><li>false： 不激活</li></ul>
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

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
     * Get <p>证书验证模式</p><p>枚举值：</p><ul><li>TLS： 单向认证</li><li>mTLS： 双向认证</li><li>BYOC： 一机一证</li></ul> 
     * @return X509Mode <p>证书验证模式</p><p>枚举值：</p><ul><li>TLS： 单向认证</li><li>mTLS： 双向认证</li><li>BYOC： 一机一证</li></ul>
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set <p>证书验证模式</p><p>枚举值：</p><ul><li>TLS： 单向认证</li><li>mTLS： 双向认证</li><li>BYOC： 一机一证</li></ul>
     * @param X509Mode <p>证书验证模式</p><p>枚举值：</p><ul><li>TLS： 单向认证</li><li>mTLS： 双向认证</li><li>BYOC： 一机一证</li></ul>
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get <p>证书注册方式</p><p>枚举值：</p><ul><li>JITP： 自动注册</li><li>API： 手工注册</li></ul> 
     * @return DeviceCertificateProvisionType <p>证书注册方式</p><p>枚举值：</p><ul><li>JITP： 自动注册</li><li>API： 手工注册</li></ul>
     */
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set <p>证书注册方式</p><p>枚举值：</p><ul><li>JITP： 自动注册</li><li>API： 手工注册</li></ul>
     * @param DeviceCertificateProvisionType <p>证书注册方式</p><p>枚举值：</p><ul><li>JITP： 自动注册</li><li>API： 手工注册</li></ul>
     */
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get <p>证书自动后激活状态</p><p>枚举值：</p><ul><li>true： 自动激活</li><li>false： 不激活</li></ul> 
     * @return AutomaticActivation <p>证书自动后激活状态</p><p>枚举值：</p><ul><li>true： 自动激活</li><li>false： 不激活</li></ul>
     */
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set <p>证书自动后激活状态</p><p>枚举值：</p><ul><li>true： 自动激活</li><li>false： 不激活</li></ul>
     * @param AutomaticActivation <p>证书自动后激活状态</p><p>枚举值：</p><ul><li>true： 自动激活</li><li>false： 不激活</li></ul>
     */
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    public ModifyX509ConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyX509ConfigRequest(ModifyX509ConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.X509Mode != null) {
            this.X509Mode = new String(source.X509Mode);
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
        this.setParamSimple(map, prefix + "DeviceCertificateProvisionType", this.DeviceCertificateProvisionType);
        this.setParamSimple(map, prefix + "AutomaticActivation", this.AutomaticActivation);

    }
}

