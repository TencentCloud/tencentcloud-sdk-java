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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * <p>企业版实例名称</p>
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * <p>企业版实例类型（basic 基础版；standard 标准版；premium 高级版）</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>云标签描述</p>
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * <p>实例计费类型，0表示按量计费，1表示预付费，默认为按量计费</p>
    */
    @SerializedName("RegistryChargeType")
    @Expose
    private Long RegistryChargeType;

    /**
    * <p>预付费自动续费标识和购买时长</p>
    */
    @SerializedName("RegistryChargePrepaid")
    @Expose
    private RegistryChargePrepaid RegistryChargePrepaid;

    /**
    * <p>是否同步TCR云标签至生成的COS Bucket</p>
    */
    @SerializedName("SyncTag")
    @Expose
    private Boolean SyncTag;

    /**
    * <p>是否开启Cos桶多AZ特性</p>
    */
    @SerializedName("EnableCosMAZ")
    @Expose
    private Boolean EnableCosMAZ;

    /**
    * <p>是否开启实例删除保护</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>是否开启cos桶多版本控制</p>
    */
    @SerializedName("EnableCosVersioning")
    @Expose
    private Boolean EnableCosVersioning;

    /**
     * Get <p>企业版实例名称</p> 
     * @return RegistryName <p>企业版实例名称</p>
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set <p>企业版实例名称</p>
     * @param RegistryName <p>企业版实例名称</p>
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get <p>企业版实例类型（basic 基础版；standard 标准版；premium 高级版）</p> 
     * @return RegistryType <p>企业版实例类型（basic 基础版；standard 标准版；premium 高级版）</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>企业版实例类型（basic 基础版；standard 标准版；premium 高级版）</p>
     * @param RegistryType <p>企业版实例类型（basic 基础版；standard 标准版；premium 高级版）</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>云标签描述</p> 
     * @return TagSpecification <p>云标签描述</p>
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set <p>云标签描述</p>
     * @param TagSpecification <p>云标签描述</p>
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get <p>实例计费类型，0表示按量计费，1表示预付费，默认为按量计费</p> 
     * @return RegistryChargeType <p>实例计费类型，0表示按量计费，1表示预付费，默认为按量计费</p>
     */
    public Long getRegistryChargeType() {
        return this.RegistryChargeType;
    }

    /**
     * Set <p>实例计费类型，0表示按量计费，1表示预付费，默认为按量计费</p>
     * @param RegistryChargeType <p>实例计费类型，0表示按量计费，1表示预付费，默认为按量计费</p>
     */
    public void setRegistryChargeType(Long RegistryChargeType) {
        this.RegistryChargeType = RegistryChargeType;
    }

    /**
     * Get <p>预付费自动续费标识和购买时长</p> 
     * @return RegistryChargePrepaid <p>预付费自动续费标识和购买时长</p>
     */
    public RegistryChargePrepaid getRegistryChargePrepaid() {
        return this.RegistryChargePrepaid;
    }

    /**
     * Set <p>预付费自动续费标识和购买时长</p>
     * @param RegistryChargePrepaid <p>预付费自动续费标识和购买时长</p>
     */
    public void setRegistryChargePrepaid(RegistryChargePrepaid RegistryChargePrepaid) {
        this.RegistryChargePrepaid = RegistryChargePrepaid;
    }

    /**
     * Get <p>是否同步TCR云标签至生成的COS Bucket</p> 
     * @return SyncTag <p>是否同步TCR云标签至生成的COS Bucket</p>
     */
    public Boolean getSyncTag() {
        return this.SyncTag;
    }

    /**
     * Set <p>是否同步TCR云标签至生成的COS Bucket</p>
     * @param SyncTag <p>是否同步TCR云标签至生成的COS Bucket</p>
     */
    public void setSyncTag(Boolean SyncTag) {
        this.SyncTag = SyncTag;
    }

    /**
     * Get <p>是否开启Cos桶多AZ特性</p> 
     * @return EnableCosMAZ <p>是否开启Cos桶多AZ特性</p>
     */
    public Boolean getEnableCosMAZ() {
        return this.EnableCosMAZ;
    }

    /**
     * Set <p>是否开启Cos桶多AZ特性</p>
     * @param EnableCosMAZ <p>是否开启Cos桶多AZ特性</p>
     */
    public void setEnableCosMAZ(Boolean EnableCosMAZ) {
        this.EnableCosMAZ = EnableCosMAZ;
    }

    /**
     * Get <p>是否开启实例删除保护</p> 
     * @return DeletionProtection <p>是否开启实例删除保护</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>是否开启实例删除保护</p>
     * @param DeletionProtection <p>是否开启实例删除保护</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>是否开启cos桶多版本控制</p> 
     * @return EnableCosVersioning <p>是否开启cos桶多版本控制</p>
     */
    public Boolean getEnableCosVersioning() {
        return this.EnableCosVersioning;
    }

    /**
     * Set <p>是否开启cos桶多版本控制</p>
     * @param EnableCosVersioning <p>是否开启cos桶多版本控制</p>
     */
    public void setEnableCosVersioning(Boolean EnableCosVersioning) {
        this.EnableCosVersioning = EnableCosVersioning;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
        if (source.RegistryChargeType != null) {
            this.RegistryChargeType = new Long(source.RegistryChargeType);
        }
        if (source.RegistryChargePrepaid != null) {
            this.RegistryChargePrepaid = new RegistryChargePrepaid(source.RegistryChargePrepaid);
        }
        if (source.SyncTag != null) {
            this.SyncTag = new Boolean(source.SyncTag);
        }
        if (source.EnableCosMAZ != null) {
            this.EnableCosMAZ = new Boolean(source.EnableCosMAZ);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.EnableCosVersioning != null) {
            this.EnableCosVersioning = new Boolean(source.EnableCosVersioning);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "RegistryChargeType", this.RegistryChargeType);
        this.setParamObj(map, prefix + "RegistryChargePrepaid.", this.RegistryChargePrepaid);
        this.setParamSimple(map, prefix + "SyncTag", this.SyncTag);
        this.setParamSimple(map, prefix + "EnableCosMAZ", this.EnableCosMAZ);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "EnableCosVersioning", this.EnableCosVersioning);

    }
}

