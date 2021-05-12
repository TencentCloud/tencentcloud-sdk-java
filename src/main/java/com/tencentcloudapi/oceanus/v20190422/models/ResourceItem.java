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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceItem extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源位置
    */
    @SerializedName("ResourceLoc")
    @Expose
    private ResourceLoc ResourceLoc;

    /**
    * 资源地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账号Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 子账号Uin
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 资源创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 资源最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 资源的资源版本ID
    */
    @SerializedName("LatestResourceConfigVersion")
    @Expose
    private Long LatestResourceConfigVersion;

    /**
    * 资源备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 版本个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionCount")
    @Expose
    private Long VersionCount;

    /**
    * 关联作业数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefJobCount")
    @Expose
    private Long RefJobCount;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称 
     * @return Name 资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
     * @param Name 资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源位置 
     * @return ResourceLoc 资源位置
     */
    public ResourceLoc getResourceLoc() {
        return this.ResourceLoc;
    }

    /**
     * Set 资源位置
     * @param ResourceLoc 资源位置
     */
    public void setResourceLoc(ResourceLoc ResourceLoc) {
        this.ResourceLoc = ResourceLoc;
    }

    /**
     * Get 资源地域 
     * @return Region 资源地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源地域
     * @param Region 资源地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号Uin 
     * @return OwnerUin 主账号Uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号Uin
     * @param OwnerUin 主账号Uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 子账号Uin 
     * @return CreatorUin 子账号Uin
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 子账号Uin
     * @param CreatorUin 子账号Uin
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 资源创建时间 
     * @return CreateTime 资源创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资源创建时间
     * @param CreateTime 资源创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 资源最后更新时间 
     * @return UpdateTime 资源最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 资源最后更新时间
     * @param UpdateTime 资源最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 资源的资源版本ID 
     * @return LatestResourceConfigVersion 资源的资源版本ID
     */
    public Long getLatestResourceConfigVersion() {
        return this.LatestResourceConfigVersion;
    }

    /**
     * Set 资源的资源版本ID
     * @param LatestResourceConfigVersion 资源的资源版本ID
     */
    public void setLatestResourceConfigVersion(Long LatestResourceConfigVersion) {
        this.LatestResourceConfigVersion = LatestResourceConfigVersion;
    }

    /**
     * Get 资源备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 资源备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 资源备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 资源备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 版本个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionCount 版本个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionCount() {
        return this.VersionCount;
    }

    /**
     * Set 版本个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionCount 版本个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionCount(Long VersionCount) {
        this.VersionCount = VersionCount;
    }

    /**
     * Get 关联作业数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefJobCount 关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRefJobCount() {
        return this.RefJobCount;
    }

    /**
     * Set 关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefJobCount 关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefJobCount(Long RefJobCount) {
        this.RefJobCount = RefJobCount;
    }

    public ResourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceItem(ResourceItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceLoc != null) {
            this.ResourceLoc = new ResourceLoc(source.ResourceLoc);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LatestResourceConfigVersion != null) {
            this.LatestResourceConfigVersion = new Long(source.LatestResourceConfigVersion);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.VersionCount != null) {
            this.VersionCount = new Long(source.VersionCount);
        }
        if (source.RefJobCount != null) {
            this.RefJobCount = new Long(source.RefJobCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "ResourceLoc.", this.ResourceLoc);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LatestResourceConfigVersion", this.LatestResourceConfigVersion);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "VersionCount", this.VersionCount);
        this.setParamSimple(map, prefix + "RefJobCount", this.RefJobCount);

    }
}

