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

public class UserInfo extends AbstractModel{

    /**
    * 用户ID，是用户全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 昵称，长度限制：64个字符。 默认与用户名相同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
     * Get 用户ID，是用户全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户ID，是用户全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID，是用户全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户ID，是用户全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

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
     * Get 用户名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 用户状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 用户状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 用户状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数据来源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);

    }
}

