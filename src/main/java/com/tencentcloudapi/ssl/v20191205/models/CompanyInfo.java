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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompanyInfo extends AbstractModel {

    /**
    * 公司名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 公司所在国家
    */
    @SerializedName("CompanyCountry")
    @Expose
    private String CompanyCountry;

    /**
    * 公司所在省份
    */
    @SerializedName("CompanyProvince")
    @Expose
    private String CompanyProvince;

    /**
    * 公司所在城市
    */
    @SerializedName("CompanyCity")
    @Expose
    private String CompanyCity;

    /**
    * 公司所在详细地址
    */
    @SerializedName("CompanyAddress")
    @Expose
    private String CompanyAddress;

    /**
    * 公司电话
    */
    @SerializedName("CompanyPhone")
    @Expose
    private String CompanyPhone;

    /**
    * 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他）
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820
    */
    @SerializedName("IdNumber")
    @Expose
    private String IdNumber;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
     * Get 公司名称 
     * @return CompanyName 公司名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 公司名称
     * @param CompanyName 公司名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 公司ID 
     * @return CompanyId 公司ID
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 公司所在国家 
     * @return CompanyCountry 公司所在国家
     */
    public String getCompanyCountry() {
        return this.CompanyCountry;
    }

    /**
     * Set 公司所在国家
     * @param CompanyCountry 公司所在国家
     */
    public void setCompanyCountry(String CompanyCountry) {
        this.CompanyCountry = CompanyCountry;
    }

    /**
     * Get 公司所在省份 
     * @return CompanyProvince 公司所在省份
     */
    public String getCompanyProvince() {
        return this.CompanyProvince;
    }

    /**
     * Set 公司所在省份
     * @param CompanyProvince 公司所在省份
     */
    public void setCompanyProvince(String CompanyProvince) {
        this.CompanyProvince = CompanyProvince;
    }

    /**
     * Get 公司所在城市 
     * @return CompanyCity 公司所在城市
     */
    public String getCompanyCity() {
        return this.CompanyCity;
    }

    /**
     * Set 公司所在城市
     * @param CompanyCity 公司所在城市
     */
    public void setCompanyCity(String CompanyCity) {
        this.CompanyCity = CompanyCity;
    }

    /**
     * Get 公司所在详细地址 
     * @return CompanyAddress 公司所在详细地址
     */
    public String getCompanyAddress() {
        return this.CompanyAddress;
    }

    /**
     * Set 公司所在详细地址
     * @param CompanyAddress 公司所在详细地址
     */
    public void setCompanyAddress(String CompanyAddress) {
        this.CompanyAddress = CompanyAddress;
    }

    /**
     * Get 公司电话 
     * @return CompanyPhone 公司电话
     */
    public String getCompanyPhone() {
        return this.CompanyPhone;
    }

    /**
     * Set 公司电话
     * @param CompanyPhone 公司电话
     */
    public void setCompanyPhone(String CompanyPhone) {
        this.CompanyPhone = CompanyPhone;
    }

    /**
     * Get 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他） 
     * @return IdType 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他）
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他）
     * @param IdType 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他）
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820 
     * @return IdNumber 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820
     */
    public String getIdNumber() {
        return this.IdNumber;
    }

    /**
     * Set 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820
     * @param IdNumber 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820
     */
    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    public CompanyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompanyInfo(CompanyInfo source) {
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.CompanyCountry != null) {
            this.CompanyCountry = new String(source.CompanyCountry);
        }
        if (source.CompanyProvince != null) {
            this.CompanyProvince = new String(source.CompanyProvince);
        }
        if (source.CompanyCity != null) {
            this.CompanyCity = new String(source.CompanyCity);
        }
        if (source.CompanyAddress != null) {
            this.CompanyAddress = new String(source.CompanyAddress);
        }
        if (source.CompanyPhone != null) {
            this.CompanyPhone = new String(source.CompanyPhone);
        }
        if (source.IdType != null) {
            this.IdType = new String(source.IdType);
        }
        if (source.IdNumber != null) {
            this.IdNumber = new String(source.IdNumber);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "CompanyCountry", this.CompanyCountry);
        this.setParamSimple(map, prefix + "CompanyProvince", this.CompanyProvince);
        this.setParamSimple(map, prefix + "CompanyCity", this.CompanyCity);
        this.setParamSimple(map, prefix + "CompanyAddress", this.CompanyAddress);
        this.setParamSimple(map, prefix + "CompanyPhone", this.CompanyPhone);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "IdNumber", this.IdNumber);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

