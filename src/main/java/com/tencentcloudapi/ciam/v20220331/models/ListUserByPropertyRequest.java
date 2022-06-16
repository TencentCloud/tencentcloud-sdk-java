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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserByPropertyRequest extends AbstractModel{

    /**
    * 用户目录ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 查询的属性

<li> **phoneNumber** </li>	  手机号码
<li> **email** </li>  邮箱
    */
    @SerializedName("PropertyCode")
    @Expose
    private String PropertyCode;

    /**
    * 属性值
    */
    @SerializedName("PropertyValue")
    @Expose
    private String PropertyValue;

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
     * Get 查询的属性

<li> **phoneNumber** </li>	  手机号码
<li> **email** </li>  邮箱 
     * @return PropertyCode 查询的属性

<li> **phoneNumber** </li>	  手机号码
<li> **email** </li>  邮箱
     */
    public String getPropertyCode() {
        return this.PropertyCode;
    }

    /**
     * Set 查询的属性

<li> **phoneNumber** </li>	  手机号码
<li> **email** </li>  邮箱
     * @param PropertyCode 查询的属性

<li> **phoneNumber** </li>	  手机号码
<li> **email** </li>  邮箱
     */
    public void setPropertyCode(String PropertyCode) {
        this.PropertyCode = PropertyCode;
    }

    /**
     * Get 属性值 
     * @return PropertyValue 属性值
     */
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    /**
     * Set 属性值
     * @param PropertyValue 属性值
     */
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    public ListUserByPropertyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserByPropertyRequest(ListUserByPropertyRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.PropertyCode != null) {
            this.PropertyCode = new String(source.PropertyCode);
        }
        if (source.PropertyValue != null) {
            this.PropertyValue = new String(source.PropertyValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "PropertyCode", this.PropertyCode);
        this.setParamSimple(map, prefix + "PropertyValue", this.PropertyValue);

    }
}

