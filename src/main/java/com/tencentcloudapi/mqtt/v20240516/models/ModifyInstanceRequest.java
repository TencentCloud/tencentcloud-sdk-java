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

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要修改实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要修改的备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 要变更的配置规格
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
     * Get 要修改实例名称 
     * @return Name 要修改实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 要修改实例名称
     * @param Name 要修改实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 要修改的备注信息 
     * @return Remark 要修改的备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 要修改的备注信息
     * @param Remark 要修改的备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 要变更的配置规格 
     * @return SkuCode 要变更的配置规格
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 要变更的配置规格
     * @param SkuCode 要变更的配置规格
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
     */
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
     */
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get 自动注册证书是否自动激活 
     * @return AutomaticActivation 自动注册证书是否自动激活
     */
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set 自动注册证书是否自动激活
     * @param AutomaticActivation 自动注册证书是否自动激活
     */
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
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

    }
}

