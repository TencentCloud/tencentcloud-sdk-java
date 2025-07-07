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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRequest extends AbstractModel {

    /**
    * 用户目录ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 手机号码
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 用户组ID
    */
    @SerializedName("UserGroup")
    @Expose
    private String [] UserGroup;

    /**
    * 生日
    */
    @SerializedName("Birthdate")
    @Expose
    private Long Birthdate;

    /**
    * 自定义属性
    */
    @SerializedName("CustomizationAttributes")
    @Expose
    private MemberMap [] CustomizationAttributes;

    /**
    * 索引字段1
    */
    @SerializedName("IndexedAttribute1")
    @Expose
    private String IndexedAttribute1;

    /**
    * 索引字段2
    */
    @SerializedName("IndexedAttribute2")
    @Expose
    private String IndexedAttribute2;

    /**
    * 索引字段3
    */
    @SerializedName("IndexedAttribute3")
    @Expose
    private String IndexedAttribute3;

    /**
    * 索引字段4
    */
    @SerializedName("IndexedAttribute4")
    @Expose
    private String IndexedAttribute4;

    /**
    * 索引字段5
    */
    @SerializedName("IndexedAttribute5")
    @Expose
    private String IndexedAttribute5;

    /**
     * Get 用户目录ID 
     * @return UserStoreId 用户目录ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户目录ID
     * @param UserStoreId 用户目录ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 手机号码 
     * @return PhoneNumber 手机号码
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码
     * @param PhoneNumber 手机号码
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 密码 
     * @return Password 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
     * @param Password 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 昵称 
     * @return Nickname 昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称
     * @param Nickname 昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 用户组ID 
     * @return UserGroup 用户组ID
     */
    public String [] getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 用户组ID
     * @param UserGroup 用户组ID
     */
    public void setUserGroup(String [] UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get 生日 
     * @return Birthdate 生日
     */
    public Long getBirthdate() {
        return this.Birthdate;
    }

    /**
     * Set 生日
     * @param Birthdate 生日
     */
    public void setBirthdate(Long Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Get 自定义属性 
     * @return CustomizationAttributes 自定义属性
     */
    public MemberMap [] getCustomizationAttributes() {
        return this.CustomizationAttributes;
    }

    /**
     * Set 自定义属性
     * @param CustomizationAttributes 自定义属性
     */
    public void setCustomizationAttributes(MemberMap [] CustomizationAttributes) {
        this.CustomizationAttributes = CustomizationAttributes;
    }

    /**
     * Get 索引字段1 
     * @return IndexedAttribute1 索引字段1
     */
    public String getIndexedAttribute1() {
        return this.IndexedAttribute1;
    }

    /**
     * Set 索引字段1
     * @param IndexedAttribute1 索引字段1
     */
    public void setIndexedAttribute1(String IndexedAttribute1) {
        this.IndexedAttribute1 = IndexedAttribute1;
    }

    /**
     * Get 索引字段2 
     * @return IndexedAttribute2 索引字段2
     */
    public String getIndexedAttribute2() {
        return this.IndexedAttribute2;
    }

    /**
     * Set 索引字段2
     * @param IndexedAttribute2 索引字段2
     */
    public void setIndexedAttribute2(String IndexedAttribute2) {
        this.IndexedAttribute2 = IndexedAttribute2;
    }

    /**
     * Get 索引字段3 
     * @return IndexedAttribute3 索引字段3
     */
    public String getIndexedAttribute3() {
        return this.IndexedAttribute3;
    }

    /**
     * Set 索引字段3
     * @param IndexedAttribute3 索引字段3
     */
    public void setIndexedAttribute3(String IndexedAttribute3) {
        this.IndexedAttribute3 = IndexedAttribute3;
    }

    /**
     * Get 索引字段4 
     * @return IndexedAttribute4 索引字段4
     */
    public String getIndexedAttribute4() {
        return this.IndexedAttribute4;
    }

    /**
     * Set 索引字段4
     * @param IndexedAttribute4 索引字段4
     */
    public void setIndexedAttribute4(String IndexedAttribute4) {
        this.IndexedAttribute4 = IndexedAttribute4;
    }

    /**
     * Get 索引字段5 
     * @return IndexedAttribute5 索引字段5
     */
    public String getIndexedAttribute5() {
        return this.IndexedAttribute5;
    }

    /**
     * Set 索引字段5
     * @param IndexedAttribute5 索引字段5
     */
    public void setIndexedAttribute5(String IndexedAttribute5) {
        this.IndexedAttribute5 = IndexedAttribute5;
    }

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String[source.UserGroup.length];
            for (int i = 0; i < source.UserGroup.length; i++) {
                this.UserGroup[i] = new String(source.UserGroup[i]);
            }
        }
        if (source.Birthdate != null) {
            this.Birthdate = new Long(source.Birthdate);
        }
        if (source.CustomizationAttributes != null) {
            this.CustomizationAttributes = new MemberMap[source.CustomizationAttributes.length];
            for (int i = 0; i < source.CustomizationAttributes.length; i++) {
                this.CustomizationAttributes[i] = new MemberMap(source.CustomizationAttributes[i]);
            }
        }
        if (source.IndexedAttribute1 != null) {
            this.IndexedAttribute1 = new String(source.IndexedAttribute1);
        }
        if (source.IndexedAttribute2 != null) {
            this.IndexedAttribute2 = new String(source.IndexedAttribute2);
        }
        if (source.IndexedAttribute3 != null) {
            this.IndexedAttribute3 = new String(source.IndexedAttribute3);
        }
        if (source.IndexedAttribute4 != null) {
            this.IndexedAttribute4 = new String(source.IndexedAttribute4);
        }
        if (source.IndexedAttribute5 != null) {
            this.IndexedAttribute5 = new String(source.IndexedAttribute5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamArraySimple(map, prefix + "UserGroup.", this.UserGroup);
        this.setParamSimple(map, prefix + "Birthdate", this.Birthdate);
        this.setParamArrayObj(map, prefix + "CustomizationAttributes.", this.CustomizationAttributes);
        this.setParamSimple(map, prefix + "IndexedAttribute1", this.IndexedAttribute1);
        this.setParamSimple(map, prefix + "IndexedAttribute2", this.IndexedAttribute2);
        this.setParamSimple(map, prefix + "IndexedAttribute3", this.IndexedAttribute3);
        this.setParamSimple(map, prefix + "IndexedAttribute4", this.IndexedAttribute4);
        this.setParamSimple(map, prefix + "IndexedAttribute5", this.IndexedAttribute5);

    }
}

