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

public class QueryCompanyTitleRequest extends AbstractModel{

    /**
    * 公司抬头关键字
    */
    @SerializedName("CompanyTitleKeyword")
    @Expose
    private String CompanyTitleKeyword;

    /**
    * 开票平台ID。0：高灯，1：票易通
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
    * 销方纳税人识别号
    */
    @SerializedName("SellerTaxpayerNum")
    @Expose
    private String SellerTaxpayerNum;

    /**
    * 接入环境。沙箱环境填sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 公司抬头关键字 
     * @return CompanyTitleKeyword 公司抬头关键字
     */
    public String getCompanyTitleKeyword() {
        return this.CompanyTitleKeyword;
    }

    /**
     * Set 公司抬头关键字
     * @param CompanyTitleKeyword 公司抬头关键字
     */
    public void setCompanyTitleKeyword(String CompanyTitleKeyword) {
        this.CompanyTitleKeyword = CompanyTitleKeyword;
    }

    /**
     * Get 开票平台ID。0：高灯，1：票易通 
     * @return InvoicePlatformId 开票平台ID。0：高灯，1：票易通
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票平台ID。0：高灯，1：票易通
     * @param InvoicePlatformId 开票平台ID。0：高灯，1：票易通
     */
    public void setInvoicePlatformId(Long InvoicePlatformId) {
        this.InvoicePlatformId = InvoicePlatformId;
    }

    /**
     * Get 销方纳税人识别号 
     * @return SellerTaxpayerNum 销方纳税人识别号
     */
    public String getSellerTaxpayerNum() {
        return this.SellerTaxpayerNum;
    }

    /**
     * Set 销方纳税人识别号
     * @param SellerTaxpayerNum 销方纳税人识别号
     */
    public void setSellerTaxpayerNum(String SellerTaxpayerNum) {
        this.SellerTaxpayerNum = SellerTaxpayerNum;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox。 
     * @return Profile 接入环境。沙箱环境填sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox。
     * @param Profile 接入环境。沙箱环境填sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public QueryCompanyTitleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCompanyTitleRequest(QueryCompanyTitleRequest source) {
        if (source.CompanyTitleKeyword != null) {
            this.CompanyTitleKeyword = new String(source.CompanyTitleKeyword);
        }
        if (source.InvoicePlatformId != null) {
            this.InvoicePlatformId = new Long(source.InvoicePlatformId);
        }
        if (source.SellerTaxpayerNum != null) {
            this.SellerTaxpayerNum = new String(source.SellerTaxpayerNum);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyTitleKeyword", this.CompanyTitleKeyword);
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamSimple(map, prefix + "SellerTaxpayerNum", this.SellerTaxpayerNum);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

