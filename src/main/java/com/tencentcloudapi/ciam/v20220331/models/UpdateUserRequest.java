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

public class UpdateUserRequest extends AbstractModel {

    /**
    * <p>用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户目录ID</p>
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * <p>用户名称</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>手机号码</p>
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>邮箱</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>昵称</p>
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * <p>地址</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>用户组</p>
    */
    @SerializedName("UserGroup")
    @Expose
    private String [] UserGroup;

    /**
    * <p>生日</p>
    */
    @SerializedName("Birthdate")
    @Expose
    private Long Birthdate;

    /**
    * <p>自定义属性</p>
    */
    @SerializedName("CustomizationAttributes")
    @Expose
    private MemberMap [] CustomizationAttributes;

    /**
    * <p>索引字段1</p>
    */
    @SerializedName("IndexedAttribute1")
    @Expose
    private String IndexedAttribute1;

    /**
    * <p>索引字段2</p>
    */
    @SerializedName("IndexedAttribute2")
    @Expose
    private String IndexedAttribute2;

    /**
    * <p>索引字段3</p>
    */
    @SerializedName("IndexedAttribute3")
    @Expose
    private String IndexedAttribute3;

    /**
    * <p>索引字段4</p>
    */
    @SerializedName("IndexedAttribute4")
    @Expose
    private String IndexedAttribute4;

    /**
    * <p>索引字段5</p>
    */
    @SerializedName("IndexedAttribute5")
    @Expose
    private String IndexedAttribute5;

    /**
    * <p>用户所属组织机构ID</p>
    */
    @SerializedName("UserOrg")
    @Expose
    private String [] UserOrg;

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
     * Get <p>用户目录ID</p> 
     * @return UserStoreId <p>用户目录ID</p>
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set <p>用户目录ID</p>
     * @param UserStoreId <p>用户目录ID</p>
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get <p>用户名称</p> 
     * @return UserName <p>用户名称</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名称</p>
     * @param UserName <p>用户名称</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>手机号码</p> 
     * @return PhoneNumber <p>手机号码</p>
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>手机号码</p>
     * @param PhoneNumber <p>手机号码</p>
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>邮箱</p> 
     * @return Email <p>邮箱</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>邮箱</p>
     * @param Email <p>邮箱</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>昵称</p> 
     * @return Nickname <p>昵称</p>
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set <p>昵称</p>
     * @param Nickname <p>昵称</p>
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get <p>地址</p> 
     * @return Address <p>地址</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>地址</p>
     * @param Address <p>地址</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>用户组</p> 
     * @return UserGroup <p>用户组</p>
     */
    public String [] getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set <p>用户组</p>
     * @param UserGroup <p>用户组</p>
     */
    public void setUserGroup(String [] UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get <p>生日</p> 
     * @return Birthdate <p>生日</p>
     */
    public Long getBirthdate() {
        return this.Birthdate;
    }

    /**
     * Set <p>生日</p>
     * @param Birthdate <p>生日</p>
     */
    public void setBirthdate(Long Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Get <p>自定义属性</p> 
     * @return CustomizationAttributes <p>自定义属性</p>
     */
    public MemberMap [] getCustomizationAttributes() {
        return this.CustomizationAttributes;
    }

    /**
     * Set <p>自定义属性</p>
     * @param CustomizationAttributes <p>自定义属性</p>
     */
    public void setCustomizationAttributes(MemberMap [] CustomizationAttributes) {
        this.CustomizationAttributes = CustomizationAttributes;
    }

    /**
     * Get <p>索引字段1</p> 
     * @return IndexedAttribute1 <p>索引字段1</p>
     */
    public String getIndexedAttribute1() {
        return this.IndexedAttribute1;
    }

    /**
     * Set <p>索引字段1</p>
     * @param IndexedAttribute1 <p>索引字段1</p>
     */
    public void setIndexedAttribute1(String IndexedAttribute1) {
        this.IndexedAttribute1 = IndexedAttribute1;
    }

    /**
     * Get <p>索引字段2</p> 
     * @return IndexedAttribute2 <p>索引字段2</p>
     */
    public String getIndexedAttribute2() {
        return this.IndexedAttribute2;
    }

    /**
     * Set <p>索引字段2</p>
     * @param IndexedAttribute2 <p>索引字段2</p>
     */
    public void setIndexedAttribute2(String IndexedAttribute2) {
        this.IndexedAttribute2 = IndexedAttribute2;
    }

    /**
     * Get <p>索引字段3</p> 
     * @return IndexedAttribute3 <p>索引字段3</p>
     */
    public String getIndexedAttribute3() {
        return this.IndexedAttribute3;
    }

    /**
     * Set <p>索引字段3</p>
     * @param IndexedAttribute3 <p>索引字段3</p>
     */
    public void setIndexedAttribute3(String IndexedAttribute3) {
        this.IndexedAttribute3 = IndexedAttribute3;
    }

    /**
     * Get <p>索引字段4</p> 
     * @return IndexedAttribute4 <p>索引字段4</p>
     */
    public String getIndexedAttribute4() {
        return this.IndexedAttribute4;
    }

    /**
     * Set <p>索引字段4</p>
     * @param IndexedAttribute4 <p>索引字段4</p>
     */
    public void setIndexedAttribute4(String IndexedAttribute4) {
        this.IndexedAttribute4 = IndexedAttribute4;
    }

    /**
     * Get <p>索引字段5</p> 
     * @return IndexedAttribute5 <p>索引字段5</p>
     */
    public String getIndexedAttribute5() {
        return this.IndexedAttribute5;
    }

    /**
     * Set <p>索引字段5</p>
     * @param IndexedAttribute5 <p>索引字段5</p>
     */
    public void setIndexedAttribute5(String IndexedAttribute5) {
        this.IndexedAttribute5 = IndexedAttribute5;
    }

    /**
     * Get <p>用户所属组织机构ID</p> 
     * @return UserOrg <p>用户所属组织机构ID</p>
     */
    public String [] getUserOrg() {
        return this.UserOrg;
    }

    /**
     * Set <p>用户所属组织机构ID</p>
     * @param UserOrg <p>用户所属组织机构ID</p>
     */
    public void setUserOrg(String [] UserOrg) {
        this.UserOrg = UserOrg;
    }

    public UpdateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserRequest(UpdateUserRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
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
        if (source.UserOrg != null) {
            this.UserOrg = new String[source.UserOrg.length];
            for (int i = 0; i < source.UserOrg.length; i++) {
                this.UserOrg[i] = new String(source.UserOrg[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
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
        this.setParamArraySimple(map, prefix + "UserOrg.", this.UserOrg);

    }
}

