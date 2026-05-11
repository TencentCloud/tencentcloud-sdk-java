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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GovernanceService extends AbstractModel {

    /**
    * <p>服务名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>命名空间名称。</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>元数据信息数组。</p>
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
    * <p>描述信息。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间。</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>服务所属部门。</p>
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * <p>服务所属业务。</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p>健康服务实例数</p>
    */
    @SerializedName("HealthyInstanceCount")
    @Expose
    private Long HealthyInstanceCount;

    /**
    * <p>服务实例总数</p>
    */
    @SerializedName("TotalInstanceCount")
    @Expose
    private Long TotalInstanceCount;

    /**
    * <p>服务ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>是否可以编辑</p>
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * <p>可以编辑该资源的用户ID</p>
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * <p>可以编辑该资源的用户组ID</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>移除可以编辑该资源的用户ID</p>
    */
    @SerializedName("RemoveUserIds")
    @Expose
    private String [] RemoveUserIds;

    /**
    * <p>移除可以编辑该资源的用户组ID</p>
    */
    @SerializedName("RemoveGroupIds")
    @Expose
    private String [] RemoveGroupIds;

    /**
    * <p>该服务对哪些命名空间可见</p>
    */
    @SerializedName("ExportTo")
    @Expose
    private String [] ExportTo;

    /**
    * <p>该服务信息摘要签名</p>
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
    * <p>是否开启同步到全局注册中心</p>
    */
    @SerializedName("SyncToGlobalRegistry")
    @Expose
    private Boolean SyncToGlobalRegistry;

    /**
    * <p>隔离实例数</p>
    */
    @SerializedName("IsolateInstanceCount")
    @Expose
    private Long IsolateInstanceCount;

    /**
    * <p>服务健康状态</p>
    */
    @SerializedName("ServiceStatus")
    @Expose
    private Long ServiceStatus;

    /**
    * <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>服务名称。</p> 
     * @return Name <p>服务名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名称。</p>
     * @param Name <p>服务名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>命名空间名称。</p> 
     * @return Namespace <p>命名空间名称。</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间名称。</p>
     * @param Namespace <p>命名空间名称。</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>元数据信息数组。</p> 
     * @return Metadatas <p>元数据信息数组。</p>
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set <p>元数据信息数组。</p>
     * @param Metadatas <p>元数据信息数组。</p>
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get <p>描述信息。</p> 
     * @return Comment <p>描述信息。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>描述信息。</p>
     * @param Comment <p>描述信息。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间。</p> 
     * @return ModifyTime <p>修改时间。</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间。</p>
     * @param ModifyTime <p>修改时间。</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>服务所属部门。</p> 
     * @return Department <p>服务所属部门。</p>
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set <p>服务所属部门。</p>
     * @param Department <p>服务所属部门。</p>
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get <p>服务所属业务。</p> 
     * @return Business <p>服务所属业务。</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>服务所属业务。</p>
     * @param Business <p>服务所属业务。</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p>健康服务实例数</p> 
     * @return HealthyInstanceCount <p>健康服务实例数</p>
     */
    public Long getHealthyInstanceCount() {
        return this.HealthyInstanceCount;
    }

    /**
     * Set <p>健康服务实例数</p>
     * @param HealthyInstanceCount <p>健康服务实例数</p>
     */
    public void setHealthyInstanceCount(Long HealthyInstanceCount) {
        this.HealthyInstanceCount = HealthyInstanceCount;
    }

    /**
     * Get <p>服务实例总数</p> 
     * @return TotalInstanceCount <p>服务实例总数</p>
     */
    public Long getTotalInstanceCount() {
        return this.TotalInstanceCount;
    }

    /**
     * Set <p>服务实例总数</p>
     * @param TotalInstanceCount <p>服务实例总数</p>
     */
    public void setTotalInstanceCount(Long TotalInstanceCount) {
        this.TotalInstanceCount = TotalInstanceCount;
    }

    /**
     * Get <p>服务ID</p> 
     * @return Id <p>服务ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>服务ID</p>
     * @param Id <p>服务ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>是否可以编辑</p> 
     * @return Editable <p>是否可以编辑</p>
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set <p>是否可以编辑</p>
     * @param Editable <p>是否可以编辑</p>
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    /**
     * Get <p>可以编辑该资源的用户ID</p> 
     * @return UserIds <p>可以编辑该资源的用户ID</p>
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>可以编辑该资源的用户ID</p>
     * @param UserIds <p>可以编辑该资源的用户ID</p>
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>可以编辑该资源的用户组ID</p> 
     * @return GroupIds <p>可以编辑该资源的用户组ID</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>可以编辑该资源的用户组ID</p>
     * @param GroupIds <p>可以编辑该资源的用户组ID</p>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>移除可以编辑该资源的用户ID</p> 
     * @return RemoveUserIds <p>移除可以编辑该资源的用户ID</p>
     */
    public String [] getRemoveUserIds() {
        return this.RemoveUserIds;
    }

    /**
     * Set <p>移除可以编辑该资源的用户ID</p>
     * @param RemoveUserIds <p>移除可以编辑该资源的用户ID</p>
     */
    public void setRemoveUserIds(String [] RemoveUserIds) {
        this.RemoveUserIds = RemoveUserIds;
    }

    /**
     * Get <p>移除可以编辑该资源的用户组ID</p> 
     * @return RemoveGroupIds <p>移除可以编辑该资源的用户组ID</p>
     */
    public String [] getRemoveGroupIds() {
        return this.RemoveGroupIds;
    }

    /**
     * Set <p>移除可以编辑该资源的用户组ID</p>
     * @param RemoveGroupIds <p>移除可以编辑该资源的用户组ID</p>
     */
    public void setRemoveGroupIds(String [] RemoveGroupIds) {
        this.RemoveGroupIds = RemoveGroupIds;
    }

    /**
     * Get <p>该服务对哪些命名空间可见</p> 
     * @return ExportTo <p>该服务对哪些命名空间可见</p>
     */
    public String [] getExportTo() {
        return this.ExportTo;
    }

    /**
     * Set <p>该服务对哪些命名空间可见</p>
     * @param ExportTo <p>该服务对哪些命名空间可见</p>
     */
    public void setExportTo(String [] ExportTo) {
        this.ExportTo = ExportTo;
    }

    /**
     * Get <p>该服务信息摘要签名</p> 
     * @return Revision <p>该服务信息摘要签名</p>
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set <p>该服务信息摘要签名</p>
     * @param Revision <p>该服务信息摘要签名</p>
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    /**
     * Get <p>是否开启同步到全局注册中心</p> 
     * @return SyncToGlobalRegistry <p>是否开启同步到全局注册中心</p>
     */
    public Boolean getSyncToGlobalRegistry() {
        return this.SyncToGlobalRegistry;
    }

    /**
     * Set <p>是否开启同步到全局注册中心</p>
     * @param SyncToGlobalRegistry <p>是否开启同步到全局注册中心</p>
     */
    public void setSyncToGlobalRegistry(Boolean SyncToGlobalRegistry) {
        this.SyncToGlobalRegistry = SyncToGlobalRegistry;
    }

    /**
     * Get <p>隔离实例数</p> 
     * @return IsolateInstanceCount <p>隔离实例数</p>
     */
    public Long getIsolateInstanceCount() {
        return this.IsolateInstanceCount;
    }

    /**
     * Set <p>隔离实例数</p>
     * @param IsolateInstanceCount <p>隔离实例数</p>
     */
    public void setIsolateInstanceCount(Long IsolateInstanceCount) {
        this.IsolateInstanceCount = IsolateInstanceCount;
    }

    /**
     * Get <p>服务健康状态</p> 
     * @return ServiceStatus <p>服务健康状态</p>
     */
    public Long getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set <p>服务健康状态</p>
     * @param ServiceStatus <p>服务健康状态</p>
     */
    public void setServiceStatus(Long ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul> 
     * @return Type <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul>
     * @param Type <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
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
        if (source.IsolateInstanceCount != null) {
            this.IsolateInstanceCount = new Long(source.IsolateInstanceCount);
        }
        if (source.ServiceStatus != null) {
            this.ServiceStatus = new Long(source.ServiceStatus);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
        this.setParamSimple(map, prefix + "IsolateInstanceCount", this.IsolateInstanceCount);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

