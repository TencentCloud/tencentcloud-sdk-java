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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUserContactRequest extends AbstractModel {

    /**
    * 联系人姓名，大小写字母+数字+下划线，最小 2 位最大 60 位的长度， 不能以"_"开头，且联系人名保持唯一。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 邮箱地址，大小写字母、数字及下划线组成， 不能以"_"开头。
    */
    @SerializedName("ContactInfo")
    @Expose
    private String ContactInfo;

    /**
    * 服务产品类型，固定值："mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 联系人姓名，大小写字母+数字+下划线，最小 2 位最大 60 位的长度， 不能以"_"开头，且联系人名保持唯一。 
     * @return Name 联系人姓名，大小写字母+数字+下划线，最小 2 位最大 60 位的长度， 不能以"_"开头，且联系人名保持唯一。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 联系人姓名，大小写字母+数字+下划线，最小 2 位最大 60 位的长度， 不能以"_"开头，且联系人名保持唯一。
     * @param Name 联系人姓名，大小写字母+数字+下划线，最小 2 位最大 60 位的长度， 不能以"_"开头，且联系人名保持唯一。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 邮箱地址，大小写字母、数字及下划线组成， 不能以"_"开头。 
     * @return ContactInfo 邮箱地址，大小写字母、数字及下划线组成， 不能以"_"开头。
     */
    public String getContactInfo() {
        return this.ContactInfo;
    }

    /**
     * Set 邮箱地址，大小写字母、数字及下划线组成， 不能以"_"开头。
     * @param ContactInfo 邮箱地址，大小写字母、数字及下划线组成， 不能以"_"开头。
     */
    public void setContactInfo(String ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    /**
     * Get 服务产品类型，固定值："mysql"。 
     * @return Product 服务产品类型，固定值："mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，固定值："mysql"。
     * @param Product 服务产品类型，固定值："mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public AddUserContactRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUserContactRequest(AddUserContactRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContactInfo != null) {
            this.ContactInfo = new String(source.ContactInfo);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContactInfo", this.ContactInfo);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

