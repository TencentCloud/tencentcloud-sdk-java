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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationInfo extends AbstractModel{

    /**
    * 公司名称，个体工商户必输
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 公司证件类型，个体工商户必输，证件类型仅支持73
    */
    @SerializedName("OrganizationType")
    @Expose
    private String OrganizationType;

    /**
    * 公司证件号码，个体工商户必输
    */
    @SerializedName("OrganizationCode")
    @Expose
    private String OrganizationCode;

    /**
    * 法人名称，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("LegalPersonName")
    @Expose
    private String LegalPersonName;

    /**
    * 法人证件类型，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
    */
    @SerializedName("LegalPersonIdType")
    @Expose
    private String LegalPersonIdType;

    /**
    * 法人证件号码，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("LegalPersonIdCode")
    @Expose
    private String LegalPersonIdCode;

    /**
     * Get 公司名称，个体工商户必输 
     * @return OrganizationName 公司名称，个体工商户必输
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 公司名称，个体工商户必输
     * @param OrganizationName 公司名称，个体工商户必输
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 公司证件类型，个体工商户必输，证件类型仅支持73 
     * @return OrganizationType 公司证件类型，个体工商户必输，证件类型仅支持73
     */
    public String getOrganizationType() {
        return this.OrganizationType;
    }

    /**
     * Set 公司证件类型，个体工商户必输，证件类型仅支持73
     * @param OrganizationType 公司证件类型，个体工商户必输，证件类型仅支持73
     */
    public void setOrganizationType(String OrganizationType) {
        this.OrganizationType = OrganizationType;
    }

    /**
     * Get 公司证件号码，个体工商户必输 
     * @return OrganizationCode 公司证件号码，个体工商户必输
     */
    public String getOrganizationCode() {
        return this.OrganizationCode;
    }

    /**
     * Set 公司证件号码，个体工商户必输
     * @param OrganizationCode 公司证件号码，个体工商户必输
     */
    public void setOrganizationCode(String OrganizationCode) {
        this.OrganizationCode = OrganizationCode;
    }

    /**
     * Get 法人名称，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return LegalPersonName 法人名称，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getLegalPersonName() {
        return this.LegalPersonName;
    }

    /**
     * Set 法人名称，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param LegalPersonName 法人名称，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setLegalPersonName(String LegalPersonName) {
        this.LegalPersonName = LegalPersonName;
    }

    /**
     * Get 法人证件类型，如果SubMchName不是法人，需要另外送入法人信息（企业必输） 
     * @return LegalPersonIdType 法人证件类型，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
     */
    public String getLegalPersonIdType() {
        return this.LegalPersonIdType;
    }

    /**
     * Set 法人证件类型，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
     * @param LegalPersonIdType 法人证件类型，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
     */
    public void setLegalPersonIdType(String LegalPersonIdType) {
        this.LegalPersonIdType = LegalPersonIdType;
    }

    /**
     * Get 法人证件号码，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return LegalPersonIdCode 法人证件号码，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getLegalPersonIdCode() {
        return this.LegalPersonIdCode;
    }

    /**
     * Set 法人证件号码，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param LegalPersonIdCode 法人证件号码，如果SubMchName不是法人，需要另外送入法人信息（企业必输）
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setLegalPersonIdCode(String LegalPersonIdCode) {
        this.LegalPersonIdCode = LegalPersonIdCode;
    }

    public OrganizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationInfo(OrganizationInfo source) {
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.OrganizationType != null) {
            this.OrganizationType = new String(source.OrganizationType);
        }
        if (source.OrganizationCode != null) {
            this.OrganizationCode = new String(source.OrganizationCode);
        }
        if (source.LegalPersonName != null) {
            this.LegalPersonName = new String(source.LegalPersonName);
        }
        if (source.LegalPersonIdType != null) {
            this.LegalPersonIdType = new String(source.LegalPersonIdType);
        }
        if (source.LegalPersonIdCode != null) {
            this.LegalPersonIdCode = new String(source.LegalPersonIdCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationType", this.OrganizationType);
        this.setParamSimple(map, prefix + "OrganizationCode", this.OrganizationCode);
        this.setParamSimple(map, prefix + "LegalPersonName", this.LegalPersonName);
        this.setParamSimple(map, prefix + "LegalPersonIdType", this.LegalPersonIdType);
        this.setParamSimple(map, prefix + "LegalPersonIdCode", this.LegalPersonIdCode);

    }
}

