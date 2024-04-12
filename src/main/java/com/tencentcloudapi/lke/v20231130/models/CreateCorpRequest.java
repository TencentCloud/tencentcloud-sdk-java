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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCorpRequest extends AbstractModel {

    /**
    * 企业全称
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * 联系人名称
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * 联系人邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 联系人手机号
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
     * Get 企业全称 
     * @return FullName 企业全称
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set 企业全称
     * @param FullName 企业全称
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get 联系人名称 
     * @return ContactName 联系人名称
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set 联系人名称
     * @param ContactName 联系人名称
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get 联系人邮箱 
     * @return Email 联系人邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 联系人邮箱
     * @param Email 联系人邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 联系人手机号 
     * @return Telephone 联系人手机号
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 联系人手机号
     * @param Telephone 联系人手机号
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public CreateCorpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCorpRequest(CreateCorpRequest source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);

    }
}

