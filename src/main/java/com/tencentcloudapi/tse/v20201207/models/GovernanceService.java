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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GovernanceService extends AbstractModel {

    /**
    * 服务名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间名称。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 元数据信息数组。
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
    * 描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 服务所属部门。
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * 服务所属业务。
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 健康服务实例数
    */
    @SerializedName("HealthyInstanceCount")
    @Expose
    private Long HealthyInstanceCount;

    /**
    * 服务实例总数
    */
    @SerializedName("TotalInstanceCount")
    @Expose
    private Long TotalInstanceCount;

    /**
    * 服务ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 是否可以编辑
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * 可以编辑该资源的用户ID
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 可以编辑该资源的用户组ID
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 移除可以编辑该资源的用户ID
    */
    @SerializedName("RemoveUserIds")
    @Expose
    private String [] RemoveUserIds;

    /**
    * 移除可以编辑该资源的用户组ID
    */
    @SerializedName("RemoveGroupIds")
    @Expose
    private String [] RemoveGroupIds;

    /**
    * 该服务对哪些命名空间可见	
    */
    @SerializedName("ExportTo")
    @Expose
    private String [] ExportTo;

    /**
    * 该服务信息摘要签名
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
    * 是否开启同步到全局注册中心
    */
    @SerializedName("SyncToGlobalRegistry")
    @Expose
    private Boolean SyncToGlobalRegistry;

    /**
     * Get 服务名称。 
     * @return Name 服务名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名称。
     * @param Name 服务名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间名称。 
     * @return Namespace 命名空间名称。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称。
     * @param Namespace 命名空间名称。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 元数据信息数组。 
     * @return Metadatas 元数据信息数组。
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set 元数据信息数组。
     * @param Metadatas 元数据信息数组。
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get 描述信息。 
     * @return Comment 描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 描述信息。
     * @param Comment 描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间。 
     * @return ModifyTime 修改时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间。
     * @param ModifyTime 修改时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 服务所属部门。 
     * @return Department 服务所属部门。
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set 服务所属部门。
     * @param Department 服务所属部门。
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get 服务所属业务。 
     * @return Business 服务所属业务。
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 服务所属业务。
     * @param Business 服务所属业务。
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 健康服务实例数 
     * @return HealthyInstanceCount 健康服务实例数
     */
    public Long getHealthyInstanceCount() {
        return this.HealthyInstanceCount;
    }

    /**
     * Set 健康服务实例数
     * @param HealthyInstanceCount 健康服务实例数
     */
    public void setHealthyInstanceCount(Long HealthyInstanceCount) {
        this.HealthyInstanceCount = HealthyInstanceCount;
    }

    /**
     * Get 服务实例总数 
     * @return TotalInstanceCount 服务实例总数
     */
    public Long getTotalInstanceCount() {
        return this.TotalInstanceCount;
    }

    /**
     * Set 服务实例总数
     * @param TotalInstanceCount 服务实例总数
     */
    public void setTotalInstanceCount(Long TotalInstanceCount) {
        this.TotalInstanceCount = TotalInstanceCount;
    }

    /**
     * Get 服务ID 
     * @return Id 服务ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 服务ID
     * @param Id 服务ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 是否可以编辑 
     * @return Editable 是否可以编辑
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set 是否可以编辑
     * @param Editable 是否可以编辑
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    /**
     * Get 可以编辑该资源的用户ID 
     * @return UserIds 可以编辑该资源的用户ID
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 可以编辑该资源的用户ID
     * @param UserIds 可以编辑该资源的用户ID
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 可以编辑该资源的用户组ID 
     * @return GroupIds 可以编辑该资源的用户组ID
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 可以编辑该资源的用户组ID
     * @param GroupIds 可以编辑该资源的用户组ID
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 移除可以编辑该资源的用户ID 
     * @return RemoveUserIds 移除可以编辑该资源的用户ID
     */
    public String [] getRemoveUserIds() {
        return this.RemoveUserIds;
    }

    /**
     * Set 移除可以编辑该资源的用户ID
     * @param RemoveUserIds 移除可以编辑该资源的用户ID
     */
    public void setRemoveUserIds(String [] RemoveUserIds) {
        this.RemoveUserIds = RemoveUserIds;
    }

    /**
     * Get 移除可以编辑该资源的用户组ID 
     * @return RemoveGroupIds 移除可以编辑该资源的用户组ID
     */
    public String [] getRemoveGroupIds() {
        return this.RemoveGroupIds;
    }

    /**
     * Set 移除可以编辑该资源的用户组ID
     * @param RemoveGroupIds 移除可以编辑该资源的用户组ID
     */
    public void setRemoveGroupIds(String [] RemoveGroupIds) {
        this.RemoveGroupIds = RemoveGroupIds;
    }

    /**
     * Get 该服务对哪些命名空间可见	 
     * @return ExportTo 该服务对哪些命名空间可见	
     */
    public String [] getExportTo() {
        return this.ExportTo;
    }

    /**
     * Set 该服务对哪些命名空间可见	
     * @param ExportTo 该服务对哪些命名空间可见	
     */
    public void setExportTo(String [] ExportTo) {
        this.ExportTo = ExportTo;
    }

    /**
     * Get 该服务信息摘要签名 
     * @return Revision 该服务信息摘要签名
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set 该服务信息摘要签名
     * @param Revision 该服务信息摘要签名
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    /**
     * Get 是否开启同步到全局注册中心 
     * @return SyncToGlobalRegistry 是否开启同步到全局注册中心
     */
    public Boolean getSyncToGlobalRegistry() {
        return this.SyncToGlobalRegistry;
    }

    /**
     * Set 是否开启同步到全局注册中心
     * @param SyncToGlobalRegistry 是否开启同步到全局注册中心
     */
    public void setSyncToGlobalRegistry(Boolean SyncToGlobalRegistry) {
        this.SyncToGlobalRegistry = SyncToGlobalRegistry;
    }

    public GovernanceService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceService(GovernanceService source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Metadatas != null) {
            this.Metadatas = new Metadata[source.Metadatas.length];
            for (int i = 0; i < source.Metadatas.length; i++) {
                this.Metadatas[i] = new Metadata(source.Metadatas[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.HealthyInstanceCount != null) {
            this.HealthyInstanceCount = new Long(source.HealthyInstanceCount);
        }
        if (source.TotalInstanceCount != null) {
            this.TotalInstanceCount = new Long(source.TotalInstanceCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.RemoveUserIds != null) {
            this.RemoveUserIds = new String[source.RemoveUserIds.length];
            for (int i = 0; i < source.RemoveUserIds.length; i++) {
                this.RemoveUserIds[i] = new String(source.RemoveUserIds[i]);
            }
        }
        if (source.RemoveGroupIds != null) {
            this.RemoveGroupIds = new String[source.RemoveGroupIds.length];
            for (int i = 0; i < source.RemoveGroupIds.length; i++) {
                this.RemoveGroupIds[i] = new String(source.RemoveGroupIds[i]);
            }
        }
        if (source.ExportTo != null) {
            this.ExportTo = new String[source.ExportTo.length];
            for (int i = 0; i < source.ExportTo.length; i++) {
                this.ExportTo[i] = new String(source.ExportTo[i]);
            }
        }
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
        if (source.SyncToGlobalRegistry != null) {
            this.SyncToGlobalRegistry = new Boolean(source.SyncToGlobalRegistry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Metadatas.", this.Metadatas);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "HealthyInstanceCount", this.HealthyInstanceCount);
        this.setParamSimple(map, prefix + "TotalInstanceCount", this.TotalInstanceCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Editable", this.Editable);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "RemoveUserIds.", this.RemoveUserIds);
        this.setParamArraySimple(map, prefix + "RemoveGroupIds.", this.RemoveGroupIds);
        this.setParamArraySimple(map, prefix + "ExportTo.", this.ExportTo);
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "SyncToGlobalRegistry", this.SyncToGlobalRegistry);

    }
}

