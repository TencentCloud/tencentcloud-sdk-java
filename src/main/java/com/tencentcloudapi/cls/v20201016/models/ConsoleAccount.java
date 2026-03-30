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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsoleAccount extends AbstractModel {

    /**
    * <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>腾讯云账号SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>腾讯云账号SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>电子邮箱，用于发送验证码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>腾讯云账号SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretId <p>腾讯云账号SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>腾讯云账号SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretId <p>腾讯云账号SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>腾讯云账号SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey <p>腾讯云账号SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>腾讯云账号SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey <p>腾讯云账号SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>电子邮箱，用于发送验证码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email <p>电子邮箱，用于发送验证码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>电子邮箱，用于发送验证码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email <p>电子邮箱，用于发送验证码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public ConsoleAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsoleAccount(ConsoleAccount source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

