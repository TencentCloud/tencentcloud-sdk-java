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

public class GovernanceServiceInput extends AbstractModel {

    /**
    * 服务名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务所属命名空间。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 服务描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 服务元数据。
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

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
    * 被添加进来可以操作此命名空间的用户ID列表
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 被添加进来可以操作此命名空间的用户组ID列表
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 从操作此命名空间的用户组ID列表被移除的ID列表
    */
    @SerializedName("RemoveUserIds")
    @Expose
    private String [] RemoveUserIds;

    /**
    * 从可以操作此命名空间的用户组ID列表中被移除的ID列表
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
     * Get 服务名。 
     * @return Name 服务名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名。
     * @param Name 服务名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务所属命名空间。 
     * @return Namespace 服务所属命名空间。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 服务所属命名空间。
     * @param Namespace 服务所属命名空间。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 服务描述信息。 
     * @return Comment 服务描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 服务描述信息。
     * @param Comment 服务描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 服务元数据。 
     * @return Metadatas 服务元数据。
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set 服务元数据。
     * @param Metadatas 服务元数据。
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
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
     * Get 被添加进来可以操作此命名空间的用户ID列表 
     * @return UserIds 被添加进来可以操作此命名空间的用户ID列表
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 被添加进来可以操作此命名空间的用户ID列表
     * @param UserIds 被添加进来可以操作此命名空间的用户ID列表
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 被添加进来可以操作此命名空间的用户组ID列表 
     * @return GroupIds 被添加进来可以操作此命名空间的用户组ID列表
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 被添加进来可以操作此命名空间的用户组ID列表
     * @param GroupIds 被添加进来可以操作此命名空间的用户组ID列表
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 从操作此命名空间的用户组ID列表被移除的ID列表 
     * @return RemoveUserIds 从操作此命名空间的用户组ID列表被移除的ID列表
     */
    public String [] getRemoveUserIds() {
        return this.RemoveUserIds;
    }

    /**
     * Set 从操作此命名空间的用户组ID列表被移除的ID列表
     * @param RemoveUserIds 从操作此命名空间的用户组ID列表被移除的ID列表
     */
    public void setRemoveUserIds(String [] RemoveUserIds) {
        this.RemoveUserIds = RemoveUserIds;
    }

    /**
     * Get 从可以操作此命名空间的用户组ID列表中被移除的ID列表 
     * @return RemoveGroupIds 从可以操作此命名空间的用户组ID列表中被移除的ID列表
     */
    public String [] getRemoveGroupIds() {
        return this.RemoveGroupIds;
    }

    /**
     * Set 从可以操作此命名空间的用户组ID列表中被移除的ID列表
     * @param RemoveGroupIds 从可以操作此命名空间的用户组ID列表中被移除的ID列表
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

    }
}

