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

public class UserGroupInfo extends AbstractModel{

    /**
    * 昵称，长度限制：64个字符。 默认与用户名相同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户组ID，是用户组全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * 用户组备注。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
     * Get 昵称，长度限制：64个字符。 默认与用户名相同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 昵称，长度限制：64个字符。 默认与用户名相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 昵称，长度限制：64个字符。 默认与用户名相同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 昵称，长度限制：64个字符。 默认与用户名相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户组ID，是用户组全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupId 用户组ID，是用户组全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 用户组ID，是用户组全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupId 用户组ID，是用户组全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 用户组备注。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 用户组备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户组备注。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 用户组备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedDate 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedDate 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public UserGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupInfo(UserGroupInfo source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);

    }
}

