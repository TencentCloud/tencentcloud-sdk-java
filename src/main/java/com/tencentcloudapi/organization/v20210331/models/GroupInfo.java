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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * 用户组的名称。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 用户组的描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户组的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户组的类型  Manual：手动创建，Synchronized：外部导入。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 用户组的修改时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 用户组的 ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 组员数量。
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * 如果有入参FilterUsers，用户在用户组返回true，否则返回false
    */
    @SerializedName("IsSelected")
    @Expose
    private Boolean IsSelected;

    /**
     * Get 用户组的名称。 
     * @return GroupName 用户组的名称。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 用户组的名称。
     * @param GroupName 用户组的名称。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 用户组的描述。 
     * @return Description 用户组的描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户组的描述。
     * @param Description 用户组的描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户组的创建时间。 
     * @return CreateTime 用户组的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 用户组的创建时间。
     * @param CreateTime 用户组的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户组的类型  Manual：手动创建，Synchronized：外部导入。 
     * @return GroupType 用户组的类型  Manual：手动创建，Synchronized：外部导入。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 用户组的类型  Manual：手动创建，Synchronized：外部导入。
     * @param GroupType 用户组的类型  Manual：手动创建，Synchronized：外部导入。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 用户组的修改时间。 
     * @return UpdateTime 用户组的修改时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 用户组的修改时间。
     * @param UpdateTime 用户组的修改时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 用户组的 ID。 
     * @return GroupId 用户组的 ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 用户组的 ID。
     * @param GroupId 用户组的 ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 组员数量。 
     * @return MemberCount 组员数量。
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set 组员数量。
     * @param MemberCount 组员数量。
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get 如果有入参FilterUsers，用户在用户组返回true，否则返回false 
     * @return IsSelected 如果有入参FilterUsers，用户在用户组返回true，否则返回false
     */
    public Boolean getIsSelected() {
        return this.IsSelected;
    }

    /**
     * Set 如果有入参FilterUsers，用户在用户组返回true，否则返回false
     * @param IsSelected 如果有入参FilterUsers，用户在用户组返回true，否则返回false
     */
    public void setIsSelected(Boolean IsSelected) {
        this.IsSelected = IsSelected;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.IsSelected != null) {
            this.IsSelected = new Boolean(source.IsSelected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "IsSelected", this.IsSelected);

    }
}

