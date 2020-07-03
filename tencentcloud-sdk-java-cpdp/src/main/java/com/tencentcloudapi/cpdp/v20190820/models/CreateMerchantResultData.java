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

public class CreateMerchantResultData extends AbstractModel{

    /**
    * 企业名称
    */
    @SerializedName("TaxpayerName")
    @Expose
    private String TaxpayerName;

    /**
    * 请求流水号
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 纳税号
    */
    @SerializedName("TaxpayerNum")
    @Expose
    private String TaxpayerNum;

    /**
     * Get 企业名称 
     * @return TaxpayerName 企业名称
     */
    public String getTaxpayerName() {
        return this.TaxpayerName;
    }

    /**
     * Set 企业名称
     * @param TaxpayerName 企业名称
     */
    public void setTaxpayerName(String TaxpayerName) {
        this.TaxpayerName = TaxpayerName;
    }

    /**
     * Get 请求流水号 
     * @return SerialNo 请求流水号
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 请求流水号
     * @param SerialNo 请求流水号
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get 纳税号 
     * @return TaxpayerNum 纳税号
     */
    public String getTaxpayerNum() {
        return this.TaxpayerNum;
    }

    /**
     * Set 纳税号
     * @param TaxpayerNum 纳税号
     */
    public void setTaxpayerNum(String TaxpayerNum) {
        this.TaxpayerNum = TaxpayerNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaxpayerName", this.TaxpayerName);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "TaxpayerNum", this.TaxpayerNum);

    }
}

