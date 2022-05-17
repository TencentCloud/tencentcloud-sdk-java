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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterType extends AbstractModel{

    /**
    * 配置id
    */
    @SerializedName("DedicatedClusterTypeId")
    @Expose
    private String DedicatedClusterTypeId;

    /**
    * 配置描述，对应描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 配置名称，对应计算资源类型
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建配置的时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 支持的存储类型列表
    */
    @SerializedName("SupportedStorageType")
    @Expose
    private String [] SupportedStorageType;

    /**
    * 支持的上连交换机的链路传输速率
    */
    @SerializedName("SupportedUplinkGiB")
    @Expose
    private Long [] SupportedUplinkGiB;

    /**
    * 支持的实例族列表
    */
    @SerializedName("SupportedInstanceFamily")
    @Expose
    private String [] SupportedInstanceFamily;

    /**
    * 地板承重要求(KG)
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 功率要求(KW)
    */
    @SerializedName("PowerDrawKva")
    @Expose
    private Float PowerDrawKva;

    /**
    * 显示计算资源规格详情，存储等资源不显示；对应规格
    */
    @SerializedName("ComputeFormatDesc")
    @Expose
    private String ComputeFormatDesc;

    /**
     * Get 配置id 
     * @return DedicatedClusterTypeId 配置id
     */
    public String getDedicatedClusterTypeId() {
        return this.DedicatedClusterTypeId;
    }

    /**
     * Set 配置id
     * @param DedicatedClusterTypeId 配置id
     */
    public void setDedicatedClusterTypeId(String DedicatedClusterTypeId) {
        this.DedicatedClusterTypeId = DedicatedClusterTypeId;
    }

    /**
     * Get 配置描述，对应描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 配置描述，对应描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 配置描述，对应描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 配置描述，对应描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 配置名称，对应计算资源类型 
     * @return Name 配置名称，对应计算资源类型
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置名称，对应计算资源类型
     * @param Name 配置名称，对应计算资源类型
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建配置的时间 
     * @return CreateTime 创建配置的时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建配置的时间
     * @param CreateTime 创建配置的时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 支持的存储类型列表 
     * @return SupportedStorageType 支持的存储类型列表
     */
    public String [] getSupportedStorageType() {
        return this.SupportedStorageType;
    }

    /**
     * Set 支持的存储类型列表
     * @param SupportedStorageType 支持的存储类型列表
     */
    public void setSupportedStorageType(String [] SupportedStorageType) {
        this.SupportedStorageType = SupportedStorageType;
    }

    /**
     * Get 支持的上连交换机的链路传输速率 
     * @return SupportedUplinkGiB 支持的上连交换机的链路传输速率
     */
    public Long [] getSupportedUplinkGiB() {
        return this.SupportedUplinkGiB;
    }

    /**
     * Set 支持的上连交换机的链路传输速率
     * @param SupportedUplinkGiB 支持的上连交换机的链路传输速率
     */
    public void setSupportedUplinkGiB(Long [] SupportedUplinkGiB) {
        this.SupportedUplinkGiB = SupportedUplinkGiB;
    }

    /**
     * Get 支持的实例族列表 
     * @return SupportedInstanceFamily 支持的实例族列表
     */
    public String [] getSupportedInstanceFamily() {
        return this.SupportedInstanceFamily;
    }

    /**
     * Set 支持的实例族列表
     * @param SupportedInstanceFamily 支持的实例族列表
     */
    public void setSupportedInstanceFamily(String [] SupportedInstanceFamily) {
        this.SupportedInstanceFamily = SupportedInstanceFamily;
    }

    /**
     * Get 地板承重要求(KG) 
     * @return Weight 地板承重要求(KG)
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 地板承重要求(KG)
     * @param Weight 地板承重要求(KG)
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 功率要求(KW) 
     * @return PowerDrawKva 功率要求(KW)
     */
    public Float getPowerDrawKva() {
        return this.PowerDrawKva;
    }

    /**
     * Set 功率要求(KW)
     * @param PowerDrawKva 功率要求(KW)
     */
    public void setPowerDrawKva(Float PowerDrawKva) {
        this.PowerDrawKva = PowerDrawKva;
    }

    /**
     * Get 显示计算资源规格详情，存储等资源不显示；对应规格 
     * @return ComputeFormatDesc 显示计算资源规格详情，存储等资源不显示；对应规格
     */
    public String getComputeFormatDesc() {
        return this.ComputeFormatDesc;
    }

    /**
     * Set 显示计算资源规格详情，存储等资源不显示；对应规格
     * @param ComputeFormatDesc 显示计算资源规格详情，存储等资源不显示；对应规格
     */
    public void setComputeFormatDesc(String ComputeFormatDesc) {
        this.ComputeFormatDesc = ComputeFormatDesc;
    }

    public DedicatedClusterType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterType(DedicatedClusterType source) {
        if (source.DedicatedClusterTypeId != null) {
            this.DedicatedClusterTypeId = new String(source.DedicatedClusterTypeId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SupportedStorageType != null) {
            this.SupportedStorageType = new String[source.SupportedStorageType.length];
            for (int i = 0; i < source.SupportedStorageType.length; i++) {
                this.SupportedStorageType[i] = new String(source.SupportedStorageType[i]);
            }
        }
        if (source.SupportedUplinkGiB != null) {
            this.SupportedUplinkGiB = new Long[source.SupportedUplinkGiB.length];
            for (int i = 0; i < source.SupportedUplinkGiB.length; i++) {
                this.SupportedUplinkGiB[i] = new Long(source.SupportedUplinkGiB[i]);
            }
        }
        if (source.SupportedInstanceFamily != null) {
            this.SupportedInstanceFamily = new String[source.SupportedInstanceFamily.length];
            for (int i = 0; i < source.SupportedInstanceFamily.length; i++) {
                this.SupportedInstanceFamily[i] = new String(source.SupportedInstanceFamily[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.PowerDrawKva != null) {
            this.PowerDrawKva = new Float(source.PowerDrawKva);
        }
        if (source.ComputeFormatDesc != null) {
            this.ComputeFormatDesc = new String(source.ComputeFormatDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterTypeId", this.DedicatedClusterTypeId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "SupportedStorageType.", this.SupportedStorageType);
        this.setParamArraySimple(map, prefix + "SupportedUplinkGiB.", this.SupportedUplinkGiB);
        this.setParamArraySimple(map, prefix + "SupportedInstanceFamily.", this.SupportedInstanceFamily);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "PowerDrawKva", this.PowerDrawKva);
        this.setParamSimple(map, prefix + "ComputeFormatDesc", this.ComputeFormatDesc);

    }
}

