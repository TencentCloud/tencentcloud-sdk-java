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
    * 命名空间名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间描述信息。
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
    * 命名空间下总服务数据量
    */
    @SerializedName("TotalServiceCount")
    @Expose
    private Long TotalServiceCount;

    /**
    * 命名空间下总健康实例数量
    */
    @SerializedName("TotalHealthInstanceCount")
    @Expose
    private Long TotalHealthInstanceCount;

    /**
    * 命名空间下总实例数量
    */
    @SerializedName("TotalInstanceCount")
    @Expose
    private Long TotalInstanceCount;

    /**
    * 命名空间ID
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
    * 可以操作此命名空间的用户ID列表
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 可以操作此命名空间的用户组ID列表
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 移除可以操作此命名空间的用户ID列表
    */
    @SerializedName("RemoveUserIds")
    @Expose
    private String [] RemoveUserIds;

    /**
    * 移除可以操作此命名空间的用户组ID列表
    */
    @SerializedName("RemoveGroupIds")
    @Expose
    private String [] RemoveGroupIds;

    /**
    * 该命名空间下的服务对哪些命名空间可见
    */
    @SerializedName("ServiceExportTo")
    @Expose
    private String [] ServiceExportTo;

    /**
    * 是否开启同步到全局注册中心	
    */
    @SerializedName("SyncToGlobalRegistry")
    @Expose
    private Boolean SyncToGlobalRegistry;

    /**
    * 元数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
     * Get 命名空间名称。 
     * @return Name 命名空间名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 命名空间名称。
     * @param Name 命名空间名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间描述信息。 
     * @return Comment 命名空间描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 命名空间描述信息。
     * @param Comment 命名空间描述信息。
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
     * Get 命名空间下总服务数据量 
     * @return TotalServiceCount 命名空间下总服务数据量
     */
    public Long getTotalServiceCount() {
        return this.TotalServiceCount;
    }

    /**
     * Set 命名空间下总服务数据量
     * @param TotalServiceCount 命名空间下总服务数据量
     */
    public void setTotalServiceCount(Long TotalServiceCount) {
        this.TotalServiceCount = TotalServiceCount;
    }

    /**
     * Get 命名空间下总健康实例数量 
     * @return TotalHealthInstanceCount 命名空间下总健康实例数量
     */
    public Long getTotalHealthInstanceCount() {
        return this.TotalHealthInstanceCount;
    }

    /**
     * Set 命名空间下总健康实例数量
     * @param TotalHealthInstanceCount 命名空间下总健康实例数量
     */
    public void setTotalHealthInstanceCount(Long TotalHealthInstanceCount) {
        this.TotalHealthInstanceCount = TotalHealthInstanceCount;
    }

    /**
     * Get 命名空间下总实例数量 
     * @return TotalInstanceCount 命名空间下总实例数量
     */
    public Long getTotalInstanceCount() {
        return this.TotalInstanceCount;
    }

    /**
     * Set 命名空间下总实例数量
     * @param TotalInstanceCount 命名空间下总实例数量
     */
    public void setTotalInstanceCount(Long TotalInstanceCount) {
        this.TotalInstanceCount = TotalInstanceCount;
    }

    /**
     * Get 命名空间ID 
     * @return Id 命名空间ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 命名空间ID
     * @param Id 命名空间ID
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
     * Get 可以操作此命名空间的用户ID列表 
     * @return UserIds 可以操作此命名空间的用户ID列表
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 可以操作此命名空间的用户ID列表
     * @param UserIds 可以操作此命名空间的用户ID列表
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 可以操作此命名空间的用户组ID列表 
     * @return GroupIds 可以操作此命名空间的用户组ID列表
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 可以操作此命名空间的用户组ID列表
     * @param GroupIds 可以操作此命名空间的用户组ID列表
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 移除可以操作此命名空间的用户ID列表 
     * @return RemoveUserIds 移除可以操作此命名空间的用户ID列表
     */
    public String [] getRemoveUserIds() {
        return this.RemoveUserIds;
    }

    /**
     * Set 移除可以操作此命名空间的用户ID列表
     * @param RemoveUserIds 移除可以操作此命名空间的用户ID列表
     */
    public void setRemoveUserIds(String [] RemoveUserIds) {
        this.RemoveUserIds = RemoveUserIds;
    }

    /**
     * Get 移除可以操作此命名空间的用户组ID列表 
     * @return RemoveGroupIds 移除可以操作此命名空间的用户组ID列表
     */
    public String [] getRemoveGroupIds() {
        return this.RemoveGroupIds;
    }

    /**
     * Set 移除可以操作此命名空间的用户组ID列表
     * @param RemoveGroupIds 移除可以操作此命名空间的用户组ID列表
     */
    public void setRemoveGroupIds(String [] RemoveGroupIds) {
        this.RemoveGroupIds = RemoveGroupIds;
    }

    /**
     * Get 该命名空间下的服务对哪些命名空间可见 
     * @return ServiceExportTo 该命名空间下的服务对哪些命名空间可见
     */
    public String [] getServiceExportTo() {
        return this.ServiceExportTo;
    }

    /**
     * Set 该命名空间下的服务对哪些命名空间可见
     * @param ServiceExportTo 该命名空间下的服务对哪些命名空间可见
     */
    public void setServiceExportTo(String [] ServiceExportTo) {
        this.ServiceExportTo = ServiceExportTo;
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

    /**
     * Get 元数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadatas 元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set 元数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadatas 元数据
注意：此字段可能返回 null，表示取不到有效值。
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

