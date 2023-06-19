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

public class WorkSpaceSetItem extends AbstractModel{

    /**
    * 工作空间 SerialId
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * 用户 APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账号 UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建者 UIN
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 工作空间名称
    */
    @SerializedName("WorkSpaceName")
    @Expose
    private String WorkSpaceName;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 1 未初始化 2 可用  -1 已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 工作空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工作空间包含集群信息
    */
    @SerializedName("ClusterGroupSetItem")
    @Expose
    private ClusterGroupSetItem [] ClusterGroupSetItem;

    /**
    * 工作空间角色的信息
    */
    @SerializedName("RoleAuth")
    @Expose
    private RoleAuth [] RoleAuth;

    /**
    * 工作空间成员数量
    */
    @SerializedName("RoleAuthCount")
    @Expose
    private Long RoleAuthCount;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobsCount")
    @Expose
    private Long JobsCount;

    /**
     * Get 工作空间 SerialId 
     * @return SerialId 工作空间 SerialId
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set 工作空间 SerialId
     * @param SerialId 工作空间 SerialId
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get 用户 APPID 
     * @return AppId 用户 APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户 APPID
     * @param AppId 用户 APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号 UIN 
     * @return OwnerUin 主账号 UIN
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号 UIN
     * @param OwnerUin 主账号 UIN
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建者 UIN 
     * @return CreatorUin 创建者 UIN
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者 UIN
     * @param CreatorUin 创建者 UIN
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 工作空间名称 
     * @return WorkSpaceName 工作空间名称
     */
    public String getWorkSpaceName() {
        return this.WorkSpaceName;
    }

    /**
     * Set 工作空间名称
     * @param WorkSpaceName 工作空间名称
     */
    public void setWorkSpaceName(String WorkSpaceName) {
        this.WorkSpaceName = WorkSpaceName;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 1 未初始化 2 可用  -1 已删除 
     * @return Status 1 未初始化 2 可用  -1 已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1 未初始化 2 可用  -1 已删除
     * @param Status 1 未初始化 2 可用  -1 已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 工作空间描述 
     * @return Description 工作空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工作空间描述
     * @param Description 工作空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工作空间包含集群信息 
     * @return ClusterGroupSetItem 工作空间包含集群信息
     */
    public ClusterGroupSetItem [] getClusterGroupSetItem() {
        return this.ClusterGroupSetItem;
    }

    /**
     * Set 工作空间包含集群信息
     * @param ClusterGroupSetItem 工作空间包含集群信息
     */
    public void setClusterGroupSetItem(ClusterGroupSetItem [] ClusterGroupSetItem) {
        this.ClusterGroupSetItem = ClusterGroupSetItem;
    }

    /**
     * Get 工作空间角色的信息 
     * @return RoleAuth 工作空间角色的信息
     */
    public RoleAuth [] getRoleAuth() {
        return this.RoleAuth;
    }

    /**
     * Set 工作空间角色的信息
     * @param RoleAuth 工作空间角色的信息
     */
    public void setRoleAuth(RoleAuth [] RoleAuth) {
        this.RoleAuth = RoleAuth;
    }

    /**
     * Get 工作空间成员数量 
     * @return RoleAuthCount 工作空间成员数量
     */
    public Long getRoleAuthCount() {
        return this.RoleAuthCount;
    }

    /**
     * Set 工作空间成员数量
     * @param RoleAuthCount 工作空间成员数量
     */
    public void setRoleAuthCount(Long RoleAuthCount) {
        this.RoleAuthCount = RoleAuthCount;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobsCount 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobsCount() {
        return this.JobsCount;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobsCount 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobsCount(Long JobsCount) {
        this.JobsCount = JobsCount;
    }

    public WorkSpaceSetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkSpaceSetItem(WorkSpaceSetItem source) {
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
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
        if (source.WorkSpaceName != null) {
            this.WorkSpaceName = new String(source.WorkSpaceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClusterGroupSetItem != null) {
            this.ClusterGroupSetItem = new ClusterGroupSetItem[source.ClusterGroupSetItem.length];
            for (int i = 0; i < source.ClusterGroupSetItem.length; i++) {
                this.ClusterGroupSetItem[i] = new ClusterGroupSetItem(source.ClusterGroupSetItem[i]);
            }
        }
        if (source.RoleAuth != null) {
            this.RoleAuth = new RoleAuth[source.RoleAuth.length];
            for (int i = 0; i < source.RoleAuth.length; i++) {
                this.RoleAuth[i] = new RoleAuth(source.RoleAuth[i]);
            }
        }
        if (source.RoleAuthCount != null) {
            this.RoleAuthCount = new Long(source.RoleAuthCount);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.JobsCount != null) {
            this.JobsCount = new Long(source.JobsCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "WorkSpaceName", this.WorkSpaceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ClusterGroupSetItem.", this.ClusterGroupSetItem);
        this.setParamArrayObj(map, prefix + "RoleAuth.", this.RoleAuth);
        this.setParamSimple(map, prefix + "RoleAuthCount", this.RoleAuthCount);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "JobsCount", this.JobsCount);

    }
}

