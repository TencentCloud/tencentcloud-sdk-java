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

public class GovernanceNamespaceInput extends AbstractModel {

    /**
    * <p>命名空间名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述信息。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>新增的可以操作此命名空间的用户ID列表</p>
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * <p>新增的可以操作此命名空间的用户组ID列表</p>
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
    * <p>该命名空间下的服务对哪些命名空间下可见，<br>1、为空或者不填写，表示仅当前命名空间可见<br>2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）<br>3、列表内容为部份命名空间名称，则只对这些命名空间下可见</p>
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
     * Get <p>命名空间名。</p> 
     * @return Name <p>命名空间名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>命名空间名。</p>
     * @param Name <p>命名空间名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>新增的可以操作此命名空间的用户ID列表</p> 
     * @return UserIds <p>新增的可以操作此命名空间的用户ID列表</p>
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>新增的可以操作此命名空间的用户ID列表</p>
     * @param UserIds <p>新增的可以操作此命名空间的用户ID列表</p>
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>新增的可以操作此命名空间的用户组ID列表</p> 
     * @return GroupIds <p>新增的可以操作此命名空间的用户组ID列表</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>新增的可以操作此命名空间的用户组ID列表</p>
     * @param GroupIds <p>新增的可以操作此命名空间的用户组ID列表</p>
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
     * Get <p>该命名空间下的服务对哪些命名空间下可见，<br>1、为空或者不填写，表示仅当前命名空间可见<br>2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）<br>3、列表内容为部份命名空间名称，则只对这些命名空间下可见</p> 
     * @return ServiceExportTo <p>该命名空间下的服务对哪些命名空间下可见，<br>1、为空或者不填写，表示仅当前命名空间可见<br>2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）<br>3、列表内容为部份命名空间名称，则只对这些命名空间下可见</p>
     */
    public String [] getServiceExportTo() {
        return this.ServiceExportTo;
    }

    /**
     * Set <p>该命名空间下的服务对哪些命名空间下可见，<br>1、为空或者不填写，表示仅当前命名空间可见<br>2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）<br>3、列表内容为部份命名空间名称，则只对这些命名空间下可见</p>
     * @param ServiceExportTo <p>该命名空间下的服务对哪些命名空间下可见，<br>1、为空或者不填写，表示仅当前命名空间可见<br>2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）<br>3、列表内容为部份命名空间名称，则只对这些命名空间下可见</p>
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

    public GovernanceNamespaceInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceNamespaceInput(GovernanceNamespaceInput source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "RemoveUserIds.", this.RemoveUserIds);
        this.setParamArraySimple(map, prefix + "RemoveGroupIds.", this.RemoveGroupIds);
        this.setParamArraySimple(map, prefix + "ServiceExportTo.", this.ServiceExportTo);
        this.setParamSimple(map, prefix + "SyncToGlobalRegistry", this.SyncToGlobalRegistry);

    }
}

