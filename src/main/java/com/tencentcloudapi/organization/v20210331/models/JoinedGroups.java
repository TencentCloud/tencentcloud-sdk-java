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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JoinedGroups extends AbstractModel {

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
    * 用户组 ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 用户组的类型。取值：

Manual：手动创建。
Synchronized：外部同步。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 加入用户组的时间
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

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
     * Get 用户组 ID。 
     * @return GroupId 用户组 ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 用户组 ID。
     * @param GroupId 用户组 ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 用户组的类型。取值：

Manual：手动创建。
Synchronized：外部同步。 
     * @return GroupType 用户组的类型。取值：

Manual：手动创建。
Synchronized：外部同步。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 用户组的类型。取值：

Manual：手动创建。
Synchronized：外部同步。
     * @param GroupType 用户组的类型。取值：

Manual：手动创建。
Synchronized：外部同步。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 加入用户组的时间 
     * @return JoinTime 加入用户组的时间
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set 加入用户组的时间
     * @param JoinTime 加入用户组的时间
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    public JoinedGroups() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinedGroups(JoinedGroups source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.JoinTime != null) {
            this.JoinTime = new String(source.JoinTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);

    }
}

