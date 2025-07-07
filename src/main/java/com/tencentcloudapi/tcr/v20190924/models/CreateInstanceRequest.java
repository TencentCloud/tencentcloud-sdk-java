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
    * 企业版实例名称
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * 企业版实例类型（basic 基础版；standard 标准版；premium 高级版）
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 云标签描述
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * 实例计费类型，0表示按量计费，1表示预付费，默认为按量计费
    */
    @SerializedName("RegistryChargeType")
    @Expose
    private Long RegistryChargeType;

    /**
    * 预付费自动续费标识和购买时长
    */
    @SerializedName("RegistryChargePrepaid")
    @Expose
    private RegistryChargePrepaid RegistryChargePrepaid;

    /**
    * 是否同步TCR云标签至生成的COS Bucket
    */
    @SerializedName("SyncTag")
    @Expose
    private Boolean SyncTag;

    /**
    * 是否开启Cos桶多AZ特性
    */
    @SerializedName("EnableCosMAZ")
    @Expose
    private Boolean EnableCosMAZ;

    /**
    * 是否开启实例删除保护
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get 企业版实例名称 
     * @return RegistryName 企业版实例名称
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set 企业版实例名称
     * @param RegistryName 企业版实例名称
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get 企业版实例类型（basic 基础版；standard 标准版；premium 高级版） 
     * @return RegistryType 企业版实例类型（basic 基础版；standard 标准版；premium 高级版）
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 企业版实例类型（basic 基础版；standard 标准版；premium 高级版）
     * @param RegistryType 企业版实例类型（basic 基础版；standard 标准版；premium 高级版）
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 云标签描述 
     * @return TagSpecification 云标签描述
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 云标签描述
     * @param TagSpecification 云标签描述
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 实例计费类型，0表示按量计费，1表示预付费，默认为按量计费 
     * @return RegistryChargeType 实例计费类型，0表示按量计费，1表示预付费，默认为按量计费
     */
    public Long getRegistryChargeType() {
        return this.RegistryChargeType;
    }

    /**
     * Set 实例计费类型，0表示按量计费，1表示预付费，默认为按量计费
     * @param RegistryChargeType 实例计费类型，0表示按量计费，1表示预付费，默认为按量计费
     */
    public void setRegistryChargeType(Long RegistryChargeType) {
        this.RegistryChargeType = RegistryChargeType;
    }

    /**
     * Get 预付费自动续费标识和购买时长 
     * @return RegistryChargePrepaid 预付费自动续费标识和购买时长
     */
    public RegistryChargePrepaid getRegistryChargePrepaid() {
        return this.RegistryChargePrepaid;
    }

    /**
     * Set 预付费自动续费标识和购买时长
     * @param RegistryChargePrepaid 预付费自动续费标识和购买时长
     */
    public void setRegistryChargePrepaid(RegistryChargePrepaid RegistryChargePrepaid) {
        this.RegistryChargePrepaid = RegistryChargePrepaid;
    }

    /**
     * Get 是否同步TCR云标签至生成的COS Bucket 
     * @return SyncTag 是否同步TCR云标签至生成的COS Bucket
     */
    public Boolean getSyncTag() {
        return this.SyncTag;
    }

    /**
     * Set 是否同步TCR云标签至生成的COS Bucket
     * @param SyncTag 是否同步TCR云标签至生成的COS Bucket
     */
    public void setSyncTag(Boolean SyncTag) {
        this.SyncTag = SyncTag;
    }

    /**
     * Get 是否开启Cos桶多AZ特性 
     * @return EnableCosMAZ 是否开启Cos桶多AZ特性
     */
    public Boolean getEnableCosMAZ() {
        return this.EnableCosMAZ;
    }

    /**
     * Set 是否开启Cos桶多AZ特性
     * @param EnableCosMAZ 是否开启Cos桶多AZ特性
     */
    public void setEnableCosMAZ(Boolean EnableCosMAZ) {
        this.EnableCosMAZ = EnableCosMAZ;
    }

    /**
     * Get 是否开启实例删除保护 
     * @return DeletionProtection 是否开启实例删除保护
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 是否开启实例删除保护
     * @param DeletionProtection 是否开启实例删除保护
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
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

    }
}

