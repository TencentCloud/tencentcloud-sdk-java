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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseUser extends AbstractModel {

    /**
    * 有云的UIN，全局唯一
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户全局唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户显示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 电话号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get 有云的UIN，全局唯一
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 有云的UIN，全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 有云的UIN，全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 有云的UIN，全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户全局唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户全局唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户全局唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户全局唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户显示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 用户显示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 用户显示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 用户显示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 电话号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNum 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNum 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public BaseUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseUser(BaseUser source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

