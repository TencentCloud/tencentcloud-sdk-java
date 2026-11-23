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

public class GovernanceNamespace extends AbstractModel {

    /**
    * <p>命名空间名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>命名空间描述信息。</p>
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
    * <p>命名空间下总服务数据量</p>
    */
    @SerializedName("TotalServiceCount")
    @Expose
    private Long TotalServiceCount;

    /**
    * <p>命名空间下总健康实例数量</p>
    */
    @SerializedName("TotalHealthInstanceCount")
    @Expose
    private Long TotalHealthInstanceCount;

    /**
    * <p>命名空间下总实例数量</p>
    */
    @SerializedName("TotalInstanceCount")
    @Expose
    private Long TotalInstanceCount;

    /**
    * <p>命名空间ID</p>
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
    * <p>可以操作此命名空间的用户ID列表</p>
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * <p>可以操作此命名空间的用户组ID列表</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>移除可以操作此命名空间的用户ID列表</p>
    */
    @SerializedName("RemoveUserIds")
    @Expose
    private String [] RemoveUserIds;

    /**
    * <p>移除可以操作此命名空间的用户组ID列表</p>
    */
    @SerializedName("RemoveGroupIds")
    @Expose
    private String [] RemoveGroupIds;

    /**
    * <p>该命名空间下的服务对哪些命名空间可见</p>
    */
    @SerializedName("ServiceExportTo")
    @Expose
    private String [] ServiceExportTo;

    /**
    * <p>是否开启同步到全局注册中心</p>
    */
    @SerializedName("SyncToGlobalRegistry")
    @Expose
    private Boolean SyncToGlobalRegistry;

    /**
    * <p>元数据</p>
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
     * Get <p>命名空间名称。</p> 
     * @return Name <p>命名空间名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>命名空间名称。</p>
     * @param Name <p>命名空间名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>命名空间描述信息。</p> 
     * @return Comment <p>命名空间描述信息。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>命名空间描述信息。</p>
     * @param Comment <p>命名空间描述信息。</p>
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
     * Get <p>命名空间下总服务数据量</p> 
     * @return TotalServiceCount <p>命名空间下总服务数据量</p>
     */
    public Long getTotalServiceCount() {
        return this.TotalServiceCount;
    }

    /**
     * Set <p>命名空间下总服务数据量</p>
     * @param TotalServiceCount <p>命名空间下总服务数据量</p>
     */
    public void setTotalServiceCount(Long TotalServiceCount) {
        this.TotalServiceCount = TotalServiceCount;
    }

    /**
     * Get <p>命名空间下总健康实例数量</p> 
     * @return TotalHealthInstanceCount <p>命名空间下总健康实例数量</p>
     */
    public Long getTotalHealthInstanceCount() {
        return this.TotalHealthInstanceCount;
    }

    /**
     * Set <p>命名空间下总健康实例数量</p>
     * @param TotalHealthInstanceCount <p>命名空间下总健康实例数量</p>
     */
    public void setTotalHealthInstanceCount(Long TotalHealthInstanceCount) {
        this.TotalHealthInstanceCount = TotalHealthInstanceCount;
    }

    /**
     * Get <p>命名空间下总实例数量</p> 
     * @return TotalInstanceCount <p>命名空间下总实例数量</p>
     */
    public Long getTotalInstanceCount() {
        return this.TotalInstanceCount;
    }

    /**
     * Set <p>命名空间下总实例数量</p>
     * @param TotalInstanceCount <p>命名空间下总实例数量</p>
     */
    public void setTotalInstanceCount(Long TotalInstanceCount) {
        this.TotalInstanceCount = TotalInstanceCount;
    }

    /**
     * Get <p>命名空间ID</p> 
     * @return Id <p>命名空间ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>命名空间ID</p>
     * @param Id <p>命名空间ID</p>
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
     * Get <p>可以操作此命名空间的用户ID列表</p> 
     * @return UserIds <p>可以操作此命名空间的用户ID列表</p>
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>可以操作此命名空间的用户ID列表</p>
     * @param UserIds <p>可以操作此命名空间的用户ID列表</p>
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>可以操作此命名空间的用户组ID列表</p> 
     * @return GroupIds <p>可以操作此命名空间的用户组ID列表</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>可以操作此命名空间的用户组ID列表</p>
     * @param GroupIds <p>可以操作此命名空间的用户组ID列表</p>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>移除可以操作此命名空间的用户ID列表</p> 
     * @return RemoveUserIds <p>移除可以操作此命名空间的用户ID列表</p>
     */
    public String [] getRemoveUserIds() {
        return this.RemoveUserIds;
    }

    /**
     * Set <p>移除可以操作此命名空间的用户ID列表</p>
     * @param RemoveUserIds <p>移除可以操作此命名空间的用户ID列表</p>
     */
    public void setRemoveUserIds(String [] RemoveUserIds) {
        this.RemoveUserIds = RemoveUserIds;
    }

    /**
     * Get <p>移除可以操作此命名空间的用户组ID列表</p> 
     * @return RemoveGroupIds <p>移除可以操作此命名空间的用户组ID列表</p>
     */
    public String [] getRemoveGroupIds() {
        return this.RemoveGroupIds;
    }

    /**
     * Set <p>移除可以操作此命名空间的用户组ID列表</p>
     * @param RemoveGroupIds <p>移除可以操作此命名空间的用户组ID列表</p>
     */
    public void setRemoveGroupIds(String [] RemoveGroupIds) {
        this.RemoveGroupIds = RemoveGroupIds;
    }

    /**
     * Get <p>该命名空间下的服务对哪些命名空间可见</p> 
     * @return ServiceExportTo <p>该命名空间下的服务对哪些命名空间可见</p>
     */
    public String [] getServiceExportTo() {
        return this.ServiceExportTo;
    }

    /**
     * Set <p>该命名空间下的服务对哪些命名空间可见</p>
     * @param ServiceExportTo <p>该命名空间下的服务对哪些命名空间可见</p>
     */
    public void setServiceExportTo(String [] ServiceExportTo) {
        this.ServiceExportTo = ServiceExportTo;
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
     * Get <p>元数据</p> 
     * @return Metadatas <p>元数据</p>
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set <p>元数据</p>
     * @param Metadatas <p>元数据</p>
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    public GovernanceNamespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceNamespace(GovernanceNamespace source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.TotalServiceCount != null) {
            this.TotalServiceCount = new Long(source.TotalServiceCount);
        }
        if (source.TotalHealthInstanceCount != null) {
            this.TotalHealthInstanceCount = new Long(source.TotalHealthInstanceCount);
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
        if (source.ServiceExportTo != null) {
            this.ServiceExportTo = new String[source.ServiceExportTo.length];
            for (int i = 0; i < source.ServiceExportTo.length; i++) {
                this.ServiceExportTo[i] = new String(source.ServiceExportTo[i]);
            }
        }
        if (source.SyncToGlobalRegistry != null) {
            this.SyncToGlobalRegistry = new Boolean(source.SyncToGlobalRegistry);
        }
        if (source.Metadatas != null) {
            this.Metadatas = new Metadata[source.Metadatas.length];
            for (int i = 0; i < source.Metadatas.length; i++) {
                this.Metadatas[i] = new Metadata(source.Metadatas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "TotalServiceCount", this.TotalServiceCount);
        this.setParamSimple(map, prefix + "TotalHealthInstanceCount", this.TotalHealthInstanceCount);
        this.setParamSimple(map, prefix + "TotalInstanceCount", this.TotalInstanceCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Editable", this.Editable);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "RemoveUserIds.", this.RemoveUserIds);
        this.setParamArraySimple(map, prefix + "RemoveGroupIds.", this.RemoveGroupIds);
        this.setParamArraySimple(map, prefix + "ServiceExportTo.", this.ServiceExportTo);
        this.setParamSimple(map, prefix + "SyncToGlobalRegistry", this.SyncToGlobalRegistry);
        this.setParamArrayObj(map, prefix + "Metadatas.", this.Metadatas);

    }
}

