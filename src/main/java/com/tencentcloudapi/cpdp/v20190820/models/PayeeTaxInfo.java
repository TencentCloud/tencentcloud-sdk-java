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

public class PayeeTaxInfo extends AbstractModel{

    /**
    * 计税模板列表
    */
    @SerializedName("TaxTemplateInfoList")
    @Expose
    private PayeeTaxTemplateInfo [] TaxTemplateInfoList;

    /**
    * 纳税人识别号
    */
    @SerializedName("TaxpayerIdNo")
    @Expose
    private String TaxpayerIdNo;

    /**
    * 纳税主体类型
NATURAL:自然人
NON_NATURAL:非自然人
    */
    @SerializedName("TaxEntityType")
    @Expose
    private String TaxEntityType;

    /**
    * 财税服务商ID
    */
    @SerializedName("TaxServiceProviderId")
    @Expose
    private String TaxServiceProviderId;

    /**
     * Get 计税模板列表 
     * @return TaxTemplateInfoList 计税模板列表
     */
    public PayeeTaxTemplateInfo [] getTaxTemplateInfoList() {
        return this.TaxTemplateInfoList;
    }

    /**
     * Set 计税模板列表
     * @param TaxTemplateInfoList 计税模板列表
     */
    public void setTaxTemplateInfoList(PayeeTaxTemplateInfo [] TaxTemplateInfoList) {
        this.TaxTemplateInfoList = TaxTemplateInfoList;
    }

    /**
     * Get 纳税人识别号 
     * @return TaxpayerIdNo 纳税人识别号
     */
    public String getTaxpayerIdNo() {
        return this.TaxpayerIdNo;
    }

    /**
     * Set 纳税人识别号
     * @param TaxpayerIdNo 纳税人识别号
     */
    public void setTaxpayerIdNo(String TaxpayerIdNo) {
        this.TaxpayerIdNo = TaxpayerIdNo;
    }

    /**
     * Get 纳税主体类型
NATURAL:自然人
NON_NATURAL:非自然人 
     * @return TaxEntityType 纳税主体类型
NATURAL:自然人
NON_NATURAL:非自然人
     */
    public String getTaxEntityType() {
        return this.TaxEntityType;
    }

    /**
     * Set 纳税主体类型
NATURAL:自然人
NON_NATURAL:非自然人
     * @param TaxEntityType 纳税主体类型
NATURAL:自然人
NON_NATURAL:非自然人
     */
    public void setTaxEntityType(String TaxEntityType) {
        this.TaxEntityType = TaxEntityType;
    }

    /**
     * Get 财税服务商ID 
     * @return TaxServiceProviderId 财税服务商ID
     */
    public String getTaxServiceProviderId() {
        return this.TaxServiceProviderId;
    }

    /**
     * Set 财税服务商ID
     * @param TaxServiceProviderId 财税服务商ID
     */
    public void setTaxServiceProviderId(String TaxServiceProviderId) {
        this.TaxServiceProviderId = TaxServiceProviderId;
    }

    public PayeeTaxInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayeeTaxInfo(PayeeTaxInfo source) {
        if (source.TaxTemplateInfoList != null) {
            this.TaxTemplateInfoList = new PayeeTaxTemplateInfo[source.TaxTemplateInfoList.length];
            for (int i = 0; i < source.TaxTemplateInfoList.length; i++) {
                this.TaxTemplateInfoList[i] = new PayeeTaxTemplateInfo(source.TaxTemplateInfoList[i]);
            }
        }
        if (source.TaxpayerIdNo != null) {
            this.TaxpayerIdNo = new String(source.TaxpayerIdNo);
        }
        if (source.TaxEntityType != null) {
            this.TaxEntityType = new String(source.TaxEntityType);
        }
        if (source.TaxServiceProviderId != null) {
            this.TaxServiceProviderId = new String(source.TaxServiceProviderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaxTemplateInfoList.", this.TaxTemplateInfoList);
        this.setParamSimple(map, prefix + "TaxpayerIdNo", this.TaxpayerIdNo);
        this.setParamSimple(map, prefix + "TaxEntityType", this.TaxEntityType);
        this.setParamSimple(map, prefix + "TaxServiceProviderId", this.TaxServiceProviderId);

    }
}

