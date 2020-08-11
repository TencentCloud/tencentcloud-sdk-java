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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatInvoiceVerifyRequest extends AbstractModel{

    /**
    * 发票代码， 一张发票一天只能查询5次。
    */
    @SerializedName("InvoiceCode")
    @Expose
    private String InvoiceCode;

    /**
    * 发票号码（8位）。
    */
    @SerializedName("InvoiceNo")
    @Expose
    private String InvoiceNo;

    /**
    * 开票日期（不支持当天发票查询，只支持一年以内），如：2019-12-20。
    */
    @SerializedName("InvoiceDate")
    @Expose
    private String InvoiceDate;

    /**
    * 金额/发票校验码后6位（根据票种传递对应值，如果报参数错误，请仔细检查每个票种对应的值）
增值税专用发票：开具金额（不含税）
增值税普通发票、增值税电子普通发票（含通行费发票）、增值税普通发票（卷票）：校验码后6位
机动车销售统一发票：不含税价
货物运输业增值税专用发票：合计金额
二手车销售统一发票：车价合计
    */
    @SerializedName("Additional")
    @Expose
    private String Additional;

    /**
     * Get 发票代码， 一张发票一天只能查询5次。 
     * @return InvoiceCode 发票代码， 一张发票一天只能查询5次。
     */
    public String getInvoiceCode() {
        return this.InvoiceCode;
    }

    /**
     * Set 发票代码， 一张发票一天只能查询5次。
     * @param InvoiceCode 发票代码， 一张发票一天只能查询5次。
     */
    public void setInvoiceCode(String InvoiceCode) {
        this.InvoiceCode = InvoiceCode;
    }

    /**
     * Get 发票号码（8位）。 
     * @return InvoiceNo 发票号码（8位）。
     */
    public String getInvoiceNo() {
        return this.InvoiceNo;
    }

    /**
     * Set 发票号码（8位）。
     * @param InvoiceNo 发票号码（8位）。
     */
    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    /**
     * Get 开票日期（不支持当天发票查询，只支持一年以内），如：2019-12-20。 
     * @return InvoiceDate 开票日期（不支持当天发票查询，只支持一年以内），如：2019-12-20。
     */
    public String getInvoiceDate() {
        return this.InvoiceDate;
    }

    /**
     * Set 开票日期（不支持当天发票查询，只支持一年以内），如：2019-12-20。
     * @param InvoiceDate 开票日期（不支持当天发票查询，只支持一年以内），如：2019-12-20。
     */
    public void setInvoiceDate(String InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    /**
     * Get 金额/发票校验码后6位（根据票种传递对应值，如果报参数错误，请仔细检查每个票种对应的值）
增值税专用发票：开具金额（不含税）
增值税普通发票、增值税电子普通发票（含通行费发票）、增值税普通发票（卷票）：校验码后6位
机动车销售统一发票：不含税价
货物运输业增值税专用发票：合计金额
二手车销售统一发票：车价合计 
     * @return Additional 金额/发票校验码后6位（根据票种传递对应值，如果报参数错误，请仔细检查每个票种对应的值）
增值税专用发票：开具金额（不含税）
增值税普通发票、增值税电子普通发票（含通行费发票）、增值税普通发票（卷票）：校验码后6位
机动车销售统一发票：不含税价
货物运输业增值税专用发票：合计金额
二手车销售统一发票：车价合计
     */
    public String getAdditional() {
        return this.Additional;
    }

    /**
     * Set 金额/发票校验码后6位（根据票种传递对应值，如果报参数错误，请仔细检查每个票种对应的值）
增值税专用发票：开具金额（不含税）
增值税普通发票、增值税电子普通发票（含通行费发票）、增值税普通发票（卷票）：校验码后6位
机动车销售统一发票：不含税价
货物运输业增值税专用发票：合计金额
二手车销售统一发票：车价合计
     * @param Additional 金额/发票校验码后6位（根据票种传递对应值，如果报参数错误，请仔细检查每个票种对应的值）
增值税专用发票：开具金额（不含税）
增值税普通发票、增值税电子普通发票（含通行费发票）、增值税普通发票（卷票）：校验码后6位
机动车销售统一发票：不含税价
货物运输业增值税专用发票：合计金额
二手车销售统一发票：车价合计
     */
    public void setAdditional(String Additional) {
        this.Additional = Additional;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoiceCode", this.InvoiceCode);
        this.setParamSimple(map, prefix + "InvoiceNo", this.InvoiceNo);
        this.setParamSimple(map, prefix + "InvoiceDate", this.InvoiceDate);
        this.setParamSimple(map, prefix + "Additional", this.Additional);

    }
}

