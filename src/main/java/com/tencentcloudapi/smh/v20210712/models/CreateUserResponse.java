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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserResponse extends AbstractModel {

    /**
    * 用户所在的媒体库 ID。
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 用户 ID。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户创建时间。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 用户角色.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 是否启用。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 手机号国家码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 手机号码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 邮箱，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 账号，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 第三方账号 ID，用于关联第三方账号体系，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUserId")
    @Expose
    private String AccountUserId;

    /**
    * 备注。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 昵称。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 用户头像地址。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 自定义信息。
    */
    @SerializedName("Customize")
    @Expose
    private String Customize;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户所在的媒体库 ID。 
     * @return LibraryId 用户所在的媒体库 ID。
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 用户所在的媒体库 ID。
     * @param LibraryId 用户所在的媒体库 ID。
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 用户 ID。 
     * @return UserId 用户 ID。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 ID。
     * @param UserId 用户 ID。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户创建时间。 
     * @return CreationTime 用户创建时间。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 用户创建时间。
     * @param CreationTime 用户创建时间。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 用户角色. 
     * @return Role 用户角色.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 用户角色.
     * @param Role 用户角色.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 是否启用。 
     * @return Enabled 是否启用。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用。
     * @param Enabled 是否启用。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 手机号国家码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountryCode 手机号国家码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 手机号国家码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountryCode 手机号国家码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 手机号码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNumber 手机号码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNumber 手机号码，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 邮箱，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 邮箱，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 邮箱，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 账号，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName 账号，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName 账号，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 第三方账号 ID，用于关联第三方账号体系，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUserId 第三方账号 ID，用于关联第三方账号体系，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUserId() {
        return this.AccountUserId;
    }

    /**
     * Set 第三方账号 ID，用于关联第三方账号体系，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUserId 第三方账号 ID，用于关联第三方账号体系，如未指定则为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUserId(String AccountUserId) {
        this.AccountUserId = AccountUserId;
    }

    /**
     * Get 备注。 
     * @return Comment 备注。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注。
     * @param Comment 备注。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 昵称。 
     * @return Nickname 昵称。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称。
     * @param Nickname 昵称。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 用户头像地址。 
     * @return Avatar 用户头像地址。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 用户头像地址。
     * @param Avatar 用户头像地址。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 自定义信息。 
     * @return Customize 自定义信息。
     */
    public String getCustomize() {
        return this.Customize;
    }

    /**
     * Set 自定义信息。
     * @param Customize 自定义信息。
     */
    public void setCustomize(String Customize) {
        this.Customize = Customize;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserResponse(CreateUserResponse source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountUserId != null) {
            this.AccountUserId = new String(source.AccountUserId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Customize != null) {
            this.Customize = new String(source.Customize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountUserId", this.AccountUserId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Customize", this.Customize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

