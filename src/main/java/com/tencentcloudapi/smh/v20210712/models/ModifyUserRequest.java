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

public class ModifyUserRequest extends AbstractModel {

    /**
    * 媒体库 ID。
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 用于唯一查找用户的过滤器。
    */
    @SerializedName("Filter")
    @Expose
    private UserFilter Filter;

    /**
    * 用户角色，当只支持 user。
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
    * 手机号国家码，不传默认为 null，此时无法使用该登录方式进行登录。
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 手机号码，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有手机号重复则报错。CountryCode 和 PhoneNumber 必须同时传入或同时不传入。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 邮箱，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有邮箱重复则报错。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 账号，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 50 个字符。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 密码的 base64 形式，不传默认为 null，此时无法使用该登录方式进行登录。AccountName 和 AccountPassword 必须同时传入或同时不传入。
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * 第三方账号 ID，用于关联第三方账号体系，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有第三方账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 200 个字符。
    */
    @SerializedName("AccountUserId")
    @Expose
    private String AccountUserId;

    /**
    * 备注。不超过 255 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 昵称。不超过 100 个字符。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 用户头像地址。不超过 255 个字符。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 自定义信息。不超过 255 个字符。
    */
    @SerializedName("Customize")
    @Expose
    private String Customize;

    /**
     * Get 媒体库 ID。 
     * @return LibraryId 媒体库 ID。
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 媒体库 ID。
     * @param LibraryId 媒体库 ID。
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 用于唯一查找用户的过滤器。 
     * @return Filter 用于唯一查找用户的过滤器。
     */
    public UserFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 用于唯一查找用户的过滤器。
     * @param Filter 用于唯一查找用户的过滤器。
     */
    public void setFilter(UserFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 用户角色，当只支持 user。 
     * @return Role 用户角色，当只支持 user。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 用户角色，当只支持 user。
     * @param Role 用户角色，当只支持 user。
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
     * Get 手机号国家码，不传默认为 null，此时无法使用该登录方式进行登录。 
     * @return CountryCode 手机号国家码，不传默认为 null，此时无法使用该登录方式进行登录。
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 手机号国家码，不传默认为 null，此时无法使用该登录方式进行登录。
     * @param CountryCode 手机号国家码，不传默认为 null，此时无法使用该登录方式进行登录。
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 手机号码，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有手机号重复则报错。CountryCode 和 PhoneNumber 必须同时传入或同时不传入。 
     * @return PhoneNumber 手机号码，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有手机号重复则报错。CountryCode 和 PhoneNumber 必须同时传入或同时不传入。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有手机号重复则报错。CountryCode 和 PhoneNumber 必须同时传入或同时不传入。
     * @param PhoneNumber 手机号码，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有手机号重复则报错。CountryCode 和 PhoneNumber 必须同时传入或同时不传入。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 邮箱，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有邮箱重复则报错。 
     * @return Email 邮箱，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有邮箱重复则报错。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有邮箱重复则报错。
     * @param Email 邮箱，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有邮箱重复则报错。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 账号，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 50 个字符。 
     * @return AccountName 账号，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 50 个字符。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 50 个字符。
     * @param AccountName 账号，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 50 个字符。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 密码的 base64 形式，不传默认为 null，此时无法使用该登录方式进行登录。AccountName 和 AccountPassword 必须同时传入或同时不传入。 
     * @return AccountPassword 密码的 base64 形式，不传默认为 null，此时无法使用该登录方式进行登录。AccountName 和 AccountPassword 必须同时传入或同时不传入。
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set 密码的 base64 形式，不传默认为 null，此时无法使用该登录方式进行登录。AccountName 和 AccountPassword 必须同时传入或同时不传入。
     * @param AccountPassword 密码的 base64 形式，不传默认为 null，此时无法使用该登录方式进行登录。AccountName 和 AccountPassword 必须同时传入或同时不传入。
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get 第三方账号 ID，用于关联第三方账号体系，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有第三方账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 200 个字符。 
     * @return AccountUserId 第三方账号 ID，用于关联第三方账号体系，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有第三方账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 200 个字符。
     */
    public String getAccountUserId() {
        return this.AccountUserId;
    }

    /**
     * Set 第三方账号 ID，用于关联第三方账号体系，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有第三方账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 200 个字符。
     * @param AccountUserId 第三方账号 ID，用于关联第三方账号体系，不传默认为 null，此时无法使用该登录方式进行登录。如果与同一媒体库内已有第三方账号重复则报错。只能使用大小写字母、数字、中划线、下划线、小数点，长度不超过 200 个字符。
     */
    public void setAccountUserId(String AccountUserId) {
        this.AccountUserId = AccountUserId;
    }

    /**
     * Get 备注。不超过 255 个字符。 
     * @return Comment 备注。不超过 255 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注。不超过 255 个字符。
     * @param Comment 备注。不超过 255 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 昵称。不超过 100 个字符。 
     * @return Nickname 昵称。不超过 100 个字符。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称。不超过 100 个字符。
     * @param Nickname 昵称。不超过 100 个字符。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 用户头像地址。不超过 255 个字符。 
     * @return Avatar 用户头像地址。不超过 255 个字符。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 用户头像地址。不超过 255 个字符。
     * @param Avatar 用户头像地址。不超过 255 个字符。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 自定义信息。不超过 255 个字符。 
     * @return Customize 自定义信息。不超过 255 个字符。
     */
    public String getCustomize() {
        return this.Customize;
    }

    /**
     * Set 自定义信息。不超过 255 个字符。
     * @param Customize 自定义信息。不超过 255 个字符。
     */
    public void setCustomize(String Customize) {
        this.Customize = Customize;
    }

    public ModifyUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserRequest(ModifyUserRequest source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.Filter != null) {
            this.Filter = new UserFilter(source.Filter);
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
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "AccountUserId", this.AccountUserId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Customize", this.Customize);

    }
}

