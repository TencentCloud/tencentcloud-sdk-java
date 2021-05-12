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

public class MerchantManagementList extends AbstractModel{

    /**
    * 企业名称。
    */
    @SerializedName("TaxpayerName")
    @Expose
    private String TaxpayerName;

    /**
    * 纳税人识别号(税号)	。
    */
    @SerializedName("TaxpayerNum")
    @Expose
    private String TaxpayerNum;

    /**
    * 请求流水号。
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 开票系统ID
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
     * Get 企业名称。 
     * @return TaxpayerName 企业名称。
     */
    public String getTaxpayerName() {
        return this.TaxpayerName;
    }

    /**
     * Set 企业名称。
     * @param TaxpayerName 企业名称。
     */
    public void setTaxpayerName(String TaxpayerName) {
        this.TaxpayerName = TaxpayerName;
    }

    /**
     * Get 纳税人识别号(税号)	。 
     * @return TaxpayerNum 纳税人识别号(税号)	。
     */
    public String getTaxpayerNum() {
        return this.TaxpayerNum;
    }

    /**
     * Set 纳税人识别号(税号)	。
     * @param TaxpayerNum 纳税人识别号(税号)	。
     */
    public void setTaxpayerNum(String TaxpayerNum) {
        this.TaxpayerNum = TaxpayerNum;
    }

    /**
     * Get 请求流水号。 
     * @return SerialNo 请求流水号。
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 请求流水号。
     * @param SerialNo 请求流水号。
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get 开票系统ID 
     * @return InvoicePlatformId 开票系统ID
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票系统ID
     * @param InvoicePlatformId 开票系统ID
     */
    public void setInvoicePlatformId(Long InvoicePlatformId) {
        this.InvoicePlatformId = InvoicePlatformId;
    }

    public MerchantManagementList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MerchantManagementList(MerchantManagementList source) {
        if (source.TaxpayerName != null) {
            this.TaxpayerName = new String(source.TaxpayerName);
        }
        if (source.TaxpayerNum != null) {
            this.TaxpayerNum = new String(source.TaxpayerNum);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.InvoicePlatformId != null) {
            this.InvoicePlatformId = new Long(source.InvoicePlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaxpayerName", this.TaxpayerName);
        this.setParamSimple(map, prefix + "TaxpayerNum", this.TaxpayerNum);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);

    }
}

