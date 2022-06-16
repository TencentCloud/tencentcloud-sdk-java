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

public class LinkAccountRequest extends AbstractModel{

    /**
    * 用户目录ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 主用户ID
    */
    @SerializedName("PrimaryUserId")
    @Expose
    private String PrimaryUserId;

    /**
    * 从用户ID
    */
    @SerializedName("SecondaryUserId")
    @Expose
    private String SecondaryUserId;

    /**
    * 融合属性

<li> **PHONENUMBER** </li>	  手机号码
<li> **EMAIL** </li>  邮箱
    */
    @SerializedName("UserLinkedOnAttribute")
    @Expose
    private String UserLinkedOnAttribute;

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
     * Get 主用户ID 
     * @return PrimaryUserId 主用户ID
     */
    public String getPrimaryUserId() {
        return this.PrimaryUserId;
    }

    /**
     * Set 主用户ID
     * @param PrimaryUserId 主用户ID
     */
    public void setPrimaryUserId(String PrimaryUserId) {
        this.PrimaryUserId = PrimaryUserId;
    }

    /**
     * Get 从用户ID 
     * @return SecondaryUserId 从用户ID
     */
    public String getSecondaryUserId() {
        return this.SecondaryUserId;
    }

    /**
     * Set 从用户ID
     * @param SecondaryUserId 从用户ID
     */
    public void setSecondaryUserId(String SecondaryUserId) {
        this.SecondaryUserId = SecondaryUserId;
    }

    /**
     * Get 融合属性

<li> **PHONENUMBER** </li>	  手机号码
<li> **EMAIL** </li>  邮箱 
     * @return UserLinkedOnAttribute 融合属性

<li> **PHONENUMBER** </li>	  手机号码
<li> **EMAIL** </li>  邮箱
     */
    public String getUserLinkedOnAttribute() {
        return this.UserLinkedOnAttribute;
    }

    /**
     * Set 融合属性

<li> **PHONENUMBER** </li>	  手机号码
<li> **EMAIL** </li>  邮箱
     * @param UserLinkedOnAttribute 融合属性

<li> **PHONENUMBER** </li>	  手机号码
<li> **EMAIL** </li>  邮箱
     */
    public void setUserLinkedOnAttribute(String UserLinkedOnAttribute) {
        this.UserLinkedOnAttribute = UserLinkedOnAttribute;
    }

    public LinkAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkAccountRequest(LinkAccountRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.PrimaryUserId != null) {
            this.PrimaryUserId = new String(source.PrimaryUserId);
        }
        if (source.SecondaryUserId != null) {
            this.SecondaryUserId = new String(source.SecondaryUserId);
        }
        if (source.UserLinkedOnAttribute != null) {
            this.UserLinkedOnAttribute = new String(source.UserLinkedOnAttribute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "PrimaryUserId", this.PrimaryUserId);
        this.setParamSimple(map, prefix + "SecondaryUserId", this.SecondaryUserId);
        this.setParamSimple(map, prefix + "UserLinkedOnAttribute", this.UserLinkedOnAttribute);

    }
}

