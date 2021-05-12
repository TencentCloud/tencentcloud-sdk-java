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

public class ResourceConfigItem extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资源所属AppId
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
    * 资源位置描述
    */
    @SerializedName("ResourceLoc")
    @Expose
    private ResourceLoc ResourceLoc;

    /**
    * 资源创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 资源版本
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 资源描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 资源状态：0: 资源同步中，1:资源已就绪
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 关联作业个数
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
     * Get 资源所属地域 
     * @return Region 资源所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源所属地域
     * @param Region 资源所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 资源所属AppId 
     * @return AppId 资源所属AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 资源所属AppId
     * @param AppId 资源所属AppId
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
     * Get 资源位置描述 
     * @return ResourceLoc 资源位置描述
     */
    public ResourceLoc getResourceLoc() {
        return this.ResourceLoc;
    }

    /**
     * Set 资源位置描述
     * @param ResourceLoc 资源位置描述
     */
    public void setResourceLoc(ResourceLoc ResourceLoc) {
        this.ResourceLoc = ResourceLoc;
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
     * Get 资源版本 
     * @return Version 资源版本
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 资源版本
     * @param Version 资源版本
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 资源描述 
     * @return Remark 资源描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 资源描述
     * @param Remark 资源描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 资源状态：0: 资源同步中，1:资源已就绪
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源状态：0: 资源同步中，1:资源已就绪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态：0: 资源同步中，1:资源已就绪
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源状态：0: 资源同步中，1:资源已就绪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 关联作业个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefJobCount 关联作业个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRefJobCount() {
        return this.RefJobCount;
    }

    /**
     * Set 关联作业个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefJobCount 关联作业个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefJobCount(Long RefJobCount) {
        this.RefJobCount = RefJobCount;
    }

    public ResourceConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceConfigItem(ResourceConfigItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
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
        if (source.ResourceLoc != null) {
            this.ResourceLoc = new ResourceLoc(source.ResourceLoc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamObj(map, prefix + "ResourceLoc.", this.ResourceLoc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RefJobCount", this.RefJobCount);

    }
}

