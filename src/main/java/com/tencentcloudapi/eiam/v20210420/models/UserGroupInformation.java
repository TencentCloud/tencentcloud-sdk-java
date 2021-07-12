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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserGroupInformation extends AbstractModel{

    /**
    * 用户组ID。
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * 用户组名称。
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
     * Get 用户组ID。 
     * @return UserGroupId 用户组ID。
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 用户组ID。
     * @param UserGroupId 用户组ID。
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 用户组名称。 
     * @return UserGroupName 用户组名称。
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set 用户组名称。
     * @param UserGroupName 用户组名称。
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    /**
     * Get 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedDate 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedDate 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    public UserGroupInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupInformation(UserGroupInformation source) {
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);

    }
}

