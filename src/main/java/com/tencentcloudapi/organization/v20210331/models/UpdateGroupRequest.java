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

public class UpdateGroupRequest extends AbstractModel {

    /**
    * 空间 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 用户组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 新的用户组名称。
    */
    @SerializedName("NewGroupName")
    @Expose
    private String NewGroupName;

    /**
    * 新的用户组描述。
    */
    @SerializedName("NewDescription")
    @Expose
    private String NewDescription;

    /**
     * Get 空间 ID。 
     * @return ZoneId 空间 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID。
     * @param ZoneId 空间 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 用户组ID。 
     * @return GroupId 用户组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 用户组ID。
     * @param GroupId 用户组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 新的用户组名称。 
     * @return NewGroupName 新的用户组名称。
     */
    public String getNewGroupName() {
        return this.NewGroupName;
    }

    /**
     * Set 新的用户组名称。
     * @param NewGroupName 新的用户组名称。
     */
    public void setNewGroupName(String NewGroupName) {
        this.NewGroupName = NewGroupName;
    }

    /**
     * Get 新的用户组描述。 
     * @return NewDescription 新的用户组描述。
     */
    public String getNewDescription() {
        return this.NewDescription;
    }

    /**
     * Set 新的用户组描述。
     * @param NewDescription 新的用户组描述。
     */
    public void setNewDescription(String NewDescription) {
        this.NewDescription = NewDescription;
    }

    public UpdateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGroupRequest(UpdateGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NewGroupName != null) {
            this.NewGroupName = new String(source.NewGroupName);
        }
        if (source.NewDescription != null) {
            this.NewDescription = new String(source.NewDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NewGroupName", this.NewGroupName);
        this.setParamSimple(map, prefix + "NewDescription", this.NewDescription);

    }
}

