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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChemicalProductInfoManufacturer extends AbstractModel {

    /**
    * 文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 企业名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 生产地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 邮政编码
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * 电话，包含区号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 传真，包含区号
    */
    @SerializedName("Fax")
    @Expose
    private String Fax;

    /**
    * 网址，如无则不填写
    */
    @SerializedName("Website")
    @Expose
    private String Website;

    /**
     * Get 文本 
     * @return Text 文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本
     * @param Text 文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 企业名称 
     * @return Name 企业名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 企业名称
     * @param Name 企业名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 生产地址 
     * @return Address 生产地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 生产地址
     * @param Address 生产地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 邮政编码 
     * @return PostalCode 邮政编码
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set 邮政编码
     * @param PostalCode 邮政编码
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get 电话，包含区号 
     * @return Phone 电话，包含区号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 电话，包含区号
     * @param Phone 电话，包含区号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 传真，包含区号 
     * @return Fax 传真，包含区号
     */
    public String getFax() {
        return this.Fax;
    }

    /**
     * Set 传真，包含区号
     * @param Fax 传真，包含区号
     */
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    /**
     * Get 网址，如无则不填写 
     * @return Website 网址，如无则不填写
     */
    public String getWebsite() {
        return this.Website;
    }

    /**
     * Set 网址，如无则不填写
     * @param Website 网址，如无则不填写
     */
    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public ChemicalProductInfoManufacturer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChemicalProductInfoManufacturer(ChemicalProductInfoManufacturer source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new String(source.PostalCode);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Fax != null) {
            this.Fax = new String(source.Fax);
        }
        if (source.Website != null) {
            this.Website = new String(source.Website);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Fax", this.Fax);
        this.setParamSimple(map, prefix + "Website", this.Website);

    }
}

