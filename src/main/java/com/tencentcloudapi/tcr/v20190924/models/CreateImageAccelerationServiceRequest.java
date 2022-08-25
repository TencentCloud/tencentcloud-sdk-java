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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageAccelerationServiceRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 创建CFS的归属的VPCID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 创建CFS的归属的子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 创建CFS的存储类型，其中 SD 为标准型存储， HP为性能存储。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 权限组 ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 可用区名称，例如ap-beijing-1，请参考 概览 文档中的地域与可用区列表
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 云标签描述
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 创建CFS的归属的VPCID 
     * @return VpcId 创建CFS的归属的VPCID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 创建CFS的归属的VPCID
     * @param VpcId 创建CFS的归属的VPCID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 创建CFS的归属的子网ID 
     * @return SubnetId 创建CFS的归属的子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 创建CFS的归属的子网ID
     * @param SubnetId 创建CFS的归属的子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 创建CFS的存储类型，其中 SD 为标准型存储， HP为性能存储。 
     * @return StorageType 创建CFS的存储类型，其中 SD 为标准型存储， HP为性能存储。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 创建CFS的存储类型，其中 SD 为标准型存储， HP为性能存储。
     * @param StorageType 创建CFS的存储类型，其中 SD 为标准型存储， HP为性能存储。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 权限组 ID 
     * @return PGroupId 权限组 ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID
     * @param PGroupId 权限组 ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get 可用区名称，例如ap-beijing-1，请参考 概览 文档中的地域与可用区列表 
     * @return Zone 可用区名称，例如ap-beijing-1，请参考 概览 文档中的地域与可用区列表
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称，例如ap-beijing-1，请参考 概览 文档中的地域与可用区列表
     * @param Zone 可用区名称，例如ap-beijing-1，请参考 概览 文档中的地域与可用区列表
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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

    public CreateImageAccelerationServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageAccelerationServiceRequest(CreateImageAccelerationServiceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

