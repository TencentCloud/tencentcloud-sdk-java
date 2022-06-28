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

public class BusinessLicenseInfo extends AbstractModel{

    /**
    * 营业证件类型
 IDCARD：身份证
 CREDITCODE：统一社会信用代码
    */
    @SerializedName("BusinessLicenseType")
    @Expose
    private String BusinessLicenseType;

    /**
    * 营业证件号码 非个人商户上送统一社会信用代码，个人商户上送身份证号码
    */
    @SerializedName("BusinessLicenseNumber")
    @Expose
    private String BusinessLicenseNumber;

    /**
    * 营业证件有效期类型 
LONGTERM：长期有效
OTHER：非长期有效
    */
    @SerializedName("BusinessLicenseValidityType")
    @Expose
    private String BusinessLicenseValidityType;

    /**
    * 营业证件生效日期，yyyy-MM-dd
    */
    @SerializedName("BusinessLicenseEffectiveDate")
    @Expose
    private String BusinessLicenseEffectiveDate;

    /**
    * 营业证件失效日期，yyyy-MM-dd
    */
    @SerializedName("BusinessLicenseExpireDate")
    @Expose
    private String BusinessLicenseExpireDate;

    /**
     * Get 营业证件类型
 IDCARD：身份证
 CREDITCODE：统一社会信用代码 
     * @return BusinessLicenseType 营业证件类型
 IDCARD：身份证
 CREDITCODE：统一社会信用代码
     */
    public String getBusinessLicenseType() {
        return this.BusinessLicenseType;
    }

    /**
     * Set 营业证件类型
 IDCARD：身份证
 CREDITCODE：统一社会信用代码
     * @param BusinessLicenseType 营业证件类型
 IDCARD：身份证
 CREDITCODE：统一社会信用代码
     */
    public void setBusinessLicenseType(String BusinessLicenseType) {
        this.BusinessLicenseType = BusinessLicenseType;
    }

    /**
     * Get 营业证件号码 非个人商户上送统一社会信用代码，个人商户上送身份证号码 
     * @return BusinessLicenseNumber 营业证件号码 非个人商户上送统一社会信用代码，个人商户上送身份证号码
     */
    public String getBusinessLicenseNumber() {
        return this.BusinessLicenseNumber;
    }

    /**
     * Set 营业证件号码 非个人商户上送统一社会信用代码，个人商户上送身份证号码
     * @param BusinessLicenseNumber 营业证件号码 非个人商户上送统一社会信用代码，个人商户上送身份证号码
     */
    public void setBusinessLicenseNumber(String BusinessLicenseNumber) {
        this.BusinessLicenseNumber = BusinessLicenseNumber;
    }

    /**
     * Get 营业证件有效期类型 
LONGTERM：长期有效
OTHER：非长期有效 
     * @return BusinessLicenseValidityType 营业证件有效期类型 
LONGTERM：长期有效
OTHER：非长期有效
     */
    public String getBusinessLicenseValidityType() {
        return this.BusinessLicenseValidityType;
    }

    /**
     * Set 营业证件有效期类型 
LONGTERM：长期有效
OTHER：非长期有效
     * @param BusinessLicenseValidityType 营业证件有效期类型 
LONGTERM：长期有效
OTHER：非长期有效
     */
    public void setBusinessLicenseValidityType(String BusinessLicenseValidityType) {
        this.BusinessLicenseValidityType = BusinessLicenseValidityType;
    }

    /**
     * Get 营业证件生效日期，yyyy-MM-dd 
     * @return BusinessLicenseEffectiveDate 营业证件生效日期，yyyy-MM-dd
     */
    public String getBusinessLicenseEffectiveDate() {
        return this.BusinessLicenseEffectiveDate;
    }

    /**
     * Set 营业证件生效日期，yyyy-MM-dd
     * @param BusinessLicenseEffectiveDate 营业证件生效日期，yyyy-MM-dd
     */
    public void setBusinessLicenseEffectiveDate(String BusinessLicenseEffectiveDate) {
        this.BusinessLicenseEffectiveDate = BusinessLicenseEffectiveDate;
    }

    /**
     * Get 营业证件失效日期，yyyy-MM-dd 
     * @return BusinessLicenseExpireDate 营业证件失效日期，yyyy-MM-dd
     */
    public String getBusinessLicenseExpireDate() {
        return this.BusinessLicenseExpireDate;
    }

    /**
     * Set 营业证件失效日期，yyyy-MM-dd
     * @param BusinessLicenseExpireDate 营业证件失效日期，yyyy-MM-dd
     */
    public void setBusinessLicenseExpireDate(String BusinessLicenseExpireDate) {
        this.BusinessLicenseExpireDate = BusinessLicenseExpireDate;
    }

    public BusinessLicenseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessLicenseInfo(BusinessLicenseInfo source) {
        if (source.BusinessLicenseType != null) {
            this.BusinessLicenseType = new String(source.BusinessLicenseType);
        }
        if (source.BusinessLicenseNumber != null) {
            this.BusinessLicenseNumber = new String(source.BusinessLicenseNumber);
        }
        if (source.BusinessLicenseValidityType != null) {
            this.BusinessLicenseValidityType = new String(source.BusinessLicenseValidityType);
        }
        if (source.BusinessLicenseEffectiveDate != null) {
            this.BusinessLicenseEffectiveDate = new String(source.BusinessLicenseEffectiveDate);
        }
        if (source.BusinessLicenseExpireDate != null) {
            this.BusinessLicenseExpireDate = new String(source.BusinessLicenseExpireDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessLicenseType", this.BusinessLicenseType);
        this.setParamSimple(map, prefix + "BusinessLicenseNumber", this.BusinessLicenseNumber);
        this.setParamSimple(map, prefix + "BusinessLicenseValidityType", this.BusinessLicenseValidityType);
        this.setParamSimple(map, prefix + "BusinessLicenseEffectiveDate", this.BusinessLicenseEffectiveDate);
        this.setParamSimple(map, prefix + "BusinessLicenseExpireDate", this.BusinessLicenseExpireDate);

    }
}

