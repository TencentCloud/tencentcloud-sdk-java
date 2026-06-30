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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel {

    /**
    * <p>用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

    /**
    * <p>企微账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * <p>企微账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserName")
    @Expose
    private String AppUserName;

    /**
    * <p>飞书OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LarkOpenId")
    @Expose
    private String LarkOpenId;

    /**
     * Get <p>用户ID</p> 
     * @return UserId <p>用户ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户ID</p>
     * @param UserId <p>用户ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNumber <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNumber <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaCode <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCode <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }

    /**
     * Get <p>企微账号id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserId <p>企微账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set <p>企微账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserId <p>企微账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get <p>企微账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserName <p>企微账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserName() {
        return this.AppUserName;
    }

    /**
     * Set <p>企微账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserName <p>企微账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserName(String AppUserName) {
        this.AppUserName = AppUserName;
    }

    /**
     * Get <p>飞书OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LarkOpenId <p>飞书OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLarkOpenId() {
        return this.LarkOpenId;
    }

    /**
     * Set <p>飞书OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LarkOpenId <p>飞书OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLarkOpenId(String LarkOpenId) {
        this.LarkOpenId = LarkOpenId;
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
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
        }
        if (source.AppUserId != null) {
            this.AppUserId = new String(source.AppUserId);
        }
        if (source.AppUserName != null) {
            this.AppUserName = new String(source.AppUserName);
        }
        if (source.LarkOpenId != null) {
            this.LarkOpenId = new String(source.LarkOpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);
        this.setParamSimple(map, prefix + "AppUserName", this.AppUserName);
        this.setParamSimple(map, prefix + "LarkOpenId", this.LarkOpenId);

    }
}

