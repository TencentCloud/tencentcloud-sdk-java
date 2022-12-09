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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceInfo extends AbstractModel{

    /**
    * ID 信息
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 名字（已弃用）
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * subnet id 数组
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
    * 环境名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApmInstanceId")
    @Expose
    private String ApmInstanceId;

    /**
    * 环境是否上锁，1为上锁，0则未上锁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 环境类型：test、pre、prod
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
     * Get ID 信息 
     * @return EnvironmentId ID 信息
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set ID 信息
     * @param EnvironmentId ID 信息
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 名字（已弃用） 
     * @return NamespaceName 名字（已弃用）
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 名字（已弃用）
     * @param NamespaceName 名字（已弃用）
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get subnet id 数组 
     * @return SubnetIds subnet id 数组
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set subnet id 数组
     * @param SubnetIds subnet id 数组
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间 
     * @return CreatedDate 创建时间
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 创建时间
     * @param CreatedDate 创建时间
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get 环境名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentName 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentName 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApmInstanceId APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApmInstanceId() {
        return this.ApmInstanceId;
    }

    /**
     * Set APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApmInstanceId APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApmInstanceId(String ApmInstanceId) {
        this.ApmInstanceId = ApmInstanceId;
    }

    /**
     * Get 环境是否上锁，1为上锁，0则未上锁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Locked 环境是否上锁，1为上锁，0则未上锁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 环境是否上锁，1为上锁，0则未上锁
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locked 环境是否上锁，1为上锁，0则未上锁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 环境类型：test、pre、prod
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvType 环境类型：test、pre、prod
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 环境类型：test、pre、prod
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvType 环境类型：test、pre、prod
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    public NamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceInfo(NamespaceInfo source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ApmInstanceId != null) {
            this.ApmInstanceId = new String(source.ApmInstanceId);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ApmInstanceId", this.ApmInstanceId);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);

    }
}

