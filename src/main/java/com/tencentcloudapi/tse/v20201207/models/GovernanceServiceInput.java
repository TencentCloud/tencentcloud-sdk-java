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

public class GovernanceServiceInput extends AbstractModel {

    /**
    * <p>服务名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>服务所属命名空间。</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>服务描述信息。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>服务元数据。</p>
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

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
    * <p>被添加进来可以操作此命名空间的用户ID列表</p>
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * <p>被添加进来可以操作此命名空间的用户组ID列表</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>从操作此命名空间的用户组ID列表被移除的ID列表</p>
    */
    @SerializedName("RemoveUserIds")
    @Expose
    private String [] RemoveUserIds;

    /**
    * <p>从可以操作此命名空间的用户组ID列表中被移除的ID列表</p>
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
    * <p>是否开启同步到全局注册中心</p>
    */
    @SerializedName("SyncToGlobalRegistry")
    @Expose
    private Boolean SyncToGlobalRegistry;

    /**
    * <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul><p>默认值：0</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>服务名。</p> 
     * @return Name <p>服务名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名。</p>
     * @param Name <p>服务名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>服务所属命名空间。</p> 
     * @return Namespace <p>服务所属命名空间。</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>服务所属命名空间。</p>
     * @param Namespace <p>服务所属命名空间。</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>服务描述信息。</p> 
     * @return Comment <p>服务描述信息。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>服务描述信息。</p>
     * @param Comment <p>服务描述信息。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>服务元数据。</p> 
     * @return Metadatas <p>服务元数据。</p>
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set <p>服务元数据。</p>
     * @param Metadatas <p>服务元数据。</p>
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
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
     * Get <p>被添加进来可以操作此命名空间的用户ID列表</p> 
     * @return UserIds <p>被添加进来可以操作此命名空间的用户ID列表</p>
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>被添加进来可以操作此命名空间的用户ID列表</p>
     * @param UserIds <p>被添加进来可以操作此命名空间的用户ID列表</p>
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>被添加进来可以操作此命名空间的用户组ID列表</p> 
     * @return GroupIds <p>被添加进来可以操作此命名空间的用户组ID列表</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>被添加进来可以操作此命名空间的用户组ID列表</p>
     * @param GroupIds <p>被添加进来可以操作此命名空间的用户组ID列表</p>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>从操作此命名空间的用户组ID列表被移除的ID列表</p> 
     * @return RemoveUserIds <p>从操作此命名空间的用户组ID列表被移除的ID列表</p>
     */
    public String [] getRemoveUserIds() {
        return this.RemoveUserIds;
    }

    /**
     * Set <p>从操作此命名空间的用户组ID列表被移除的ID列表</p>
     * @param RemoveUserIds <p>从操作此命名空间的用户组ID列表被移除的ID列表</p>
     */
    public void setRemoveUserIds(String [] RemoveUserIds) {
        this.RemoveUserIds = RemoveUserIds;
    }

    /**
     * Get <p>从可以操作此命名空间的用户组ID列表中被移除的ID列表</p> 
     * @return RemoveGroupIds <p>从可以操作此命名空间的用户组ID列表中被移除的ID列表</p>
     */
    public String [] getRemoveGroupIds() {
        return this.RemoveGroupIds;
    }

    /**
     * Set <p>从可以操作此命名空间的用户组ID列表中被移除的ID列表</p>
     * @param RemoveGroupIds <p>从可以操作此命名空间的用户组ID列表中被移除的ID列表</p>
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
     * Get <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul><p>默认值：0</p> 
     * @return Type <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul><p>默认值：0</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul><p>默认值：0</p>
     * @param Type <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul><p>默认值：0</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public GovernanceServiceInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceServiceInput(GovernanceServiceInput source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Metadatas != null) {
            this.Metadatas = new Metadata[source.Metadatas.length];
            for (int i = 0; i < source.Metadatas.length; i++) {
                this.Metadatas[i] = new Metadata(source.Metadatas[i]);
            }
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
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
        if (source.SyncToGlobalRegistry != null) {
            this.SyncToGlobalRegistry = new Boolean(source.SyncToGlobalRegistry);
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
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Metadatas.", this.Metadatas);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "RemoveUserIds.", this.RemoveUserIds);
        this.setParamArraySimple(map, prefix + "RemoveGroupIds.", this.RemoveGroupIds);
        this.setParamArraySimple(map, prefix + "ExportTo.", this.ExportTo);
        this.setParamSimple(map, prefix + "SyncToGlobalRegistry", this.SyncToGlobalRegistry);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

