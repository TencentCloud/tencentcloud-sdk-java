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

public class GovernanceNamespaceInput extends AbstractModel {

    /**
    * 命名空间名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 新增的可以操作此命名空间的用户ID列表
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 新增的可以操作此命名空间的用户组ID列表
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
    * 该命名空间下的服务对哪些命名空间下可见，
1、为空或者不填写，表示仅当前命名空间可见
2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）
3、列表内容为部份命名空间名称，则只对这些命名空间下可见
    */
    @SerializedName("ServiceExportTo")
    @Expose
    private String [] ServiceExportTo;

    /**
     * Get 命名空间名。 
     * @return Name 命名空间名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 命名空间名。
     * @param Name 命名空间名。
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 新增的可以操作此命名空间的用户ID列表 
     * @return UserIds 新增的可以操作此命名空间的用户ID列表
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 新增的可以操作此命名空间的用户ID列表
     * @param UserIds 新增的可以操作此命名空间的用户ID列表
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 新增的可以操作此命名空间的用户组ID列表 
     * @return GroupIds 新增的可以操作此命名空间的用户组ID列表
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 新增的可以操作此命名空间的用户组ID列表
     * @param GroupIds 新增的可以操作此命名空间的用户组ID列表
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
     * Get 该命名空间下的服务对哪些命名空间下可见，
1、为空或者不填写，表示仅当前命名空间可见
2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）
3、列表内容为部份命名空间名称，则只对这些命名空间下可见 
     * @return ServiceExportTo 该命名空间下的服务对哪些命名空间下可见，
1、为空或者不填写，表示仅当前命名空间可见
2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）
3、列表内容为部份命名空间名称，则只对这些命名空间下可见
     */
    public String [] getServiceExportTo() {
        return this.ServiceExportTo;
    }

    /**
     * Set 该命名空间下的服务对哪些命名空间下可见，
1、为空或者不填写，表示仅当前命名空间可见
2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）
3、列表内容为部份命名空间名称，则只对这些命名空间下可见
     * @param ServiceExportTo 该命名空间下的服务对哪些命名空间下可见，
1、为空或者不填写，表示仅当前命名空间可见
2、列表内容仅一个元素，且为字符 *，表示所有命名空间可见（包括新增）
3、列表内容为部份命名空间名称，则只对这些命名空间下可见
     */
    public void setServiceExportTo(String [] ServiceExportTo) {
        this.ServiceExportTo = ServiceExportTo;
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

    }
}

