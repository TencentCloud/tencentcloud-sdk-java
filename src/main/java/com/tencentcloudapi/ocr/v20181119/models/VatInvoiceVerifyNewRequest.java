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

public class VatInvoiceVerifyNewRequest extends AbstractModel{

    /**
    * 发票号码，8位、20位（全电票）
    */
    @SerializedName("InvoiceNo")
    @Expose
    private String InvoiceNo;

    /**
    * 开票日期（不支持当天发票查询，支持五年以内开具的发票），格式：“YYYY-MM-DD”，如：2019-12-20。
    */
    @SerializedName("InvoiceDate")
    @Expose
    private String InvoiceDate;

    /**
    * 发票代码（10或12 位），全电发票为空。查验未成功超过5次后当日无法再查。
    */
    @SerializedName("InvoiceCode")
    @Expose
    private String InvoiceCode;

    /**
    * 票种类型 01:增值税专用发票， 02:货运运输业增值税专用发 票， 03:机动车销售统一发票， 04:增值税普通发票， 08:增值税电子专用发票(含全电)， 10:增值税电子普通发票(含全电)， 11:增值税普通发票(卷式)， 14:增值税电子(通行费)发 票， 15:二手车销售统一发票， 32:深圳区块链发票(云南区块链因业务调整现已下线)。
    */
    @SerializedName("InvoiceKind")
    @Expose
    private String InvoiceKind;

    /**
    * 校验码后 6 位，增值税普通发票、增值税电子普通发票、增值税普通发票(卷式)、增值税电子普通发票(通行费)时必填;
区块链为 5 位
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 不含税金额，增值税专用发票、增值税电子专用发票、机动车销售统一发票、二手车销售统一发票、区块链发票时必填; 全电发票为价税合计(含税金额)
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
     * Get 发票号码，8位、20位（全电票） 
     * @return InvoiceNo 发票号码，8位、20位（全电票）
     */
    public String getInvoiceNo() {
        return this.InvoiceNo;
    }

    /**
     * Set 发票号码，8位、20位（全电票）
     * @param InvoiceNo 发票号码，8位、20位（全电票）
     */
    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    /**
     * Get 开票日期（不支持当天发票查询，支持五年以内开具的发票），格式：“YYYY-MM-DD”，如：2019-12-20。 
     * @return InvoiceDate 开票日期（不支持当天发票查询，支持五年以内开具的发票），格式：“YYYY-MM-DD”，如：2019-12-20。
     */
    public String getInvoiceDate() {
        return this.InvoiceDate;
    }

    /**
     * Set 开票日期（不支持当天发票查询，支持五年以内开具的发票），格式：“YYYY-MM-DD”，如：2019-12-20。
     * @param InvoiceDate 开票日期（不支持当天发票查询，支持五年以内开具的发票），格式：“YYYY-MM-DD”，如：2019-12-20。
     */
    public void setInvoiceDate(String InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    /**
     * Get 发票代码（10或12 位），全电发票为空。查验未成功超过5次后当日无法再查。 
     * @return InvoiceCode 发票代码（10或12 位），全电发票为空。查验未成功超过5次后当日无法再查。
     */
    public String getInvoiceCode() {
        return this.InvoiceCode;
    }

    /**
     * Set 发票代码（10或12 位），全电发票为空。查验未成功超过5次后当日无法再查。
     * @param InvoiceCode 发票代码（10或12 位），全电发票为空。查验未成功超过5次后当日无法再查。
     */
    public void setInvoiceCode(String InvoiceCode) {
        this.InvoiceCode = InvoiceCode;
    }

    /**
     * Get 票种类型 01:增值税专用发票， 02:货运运输业增值税专用发 票， 03:机动车销售统一发票， 04:增值税普通发票， 08:增值税电子专用发票(含全电)， 10:增值税电子普通发票(含全电)， 11:增值税普通发票(卷式)， 14:增值税电子(通行费)发 票， 15:二手车销售统一发票， 32:深圳区块链发票(云南区块链因业务调整现已下线)。 
     * @return InvoiceKind 票种类型 01:增值税专用发票， 02:货运运输业增值税专用发 票， 03:机动车销售统一发票， 04:增值税普通发票， 08:增值税电子专用发票(含全电)， 10:增值税电子普通发票(含全电)， 11:增值税普通发票(卷式)， 14:增值税电子(通行费)发 票， 15:二手车销售统一发票， 32:深圳区块链发票(云南区块链因业务调整现已下线)。
     */
    public String getInvoiceKind() {
        return this.InvoiceKind;
    }

    /**
     * Set 票种类型 01:增值税专用发票， 02:货运运输业增值税专用发 票， 03:机动车销售统一发票， 04:增值税普通发票， 08:增值税电子专用发票(含全电)， 10:增值税电子普通发票(含全电)， 11:增值税普通发票(卷式)， 14:增值税电子(通行费)发 票， 15:二手车销售统一发票， 32:深圳区块链发票(云南区块链因业务调整现已下线)。
     * @param InvoiceKind 票种类型 01:增值税专用发票， 02:货运运输业增值税专用发 票， 03:机动车销售统一发票， 04:增值税普通发票， 08:增值税电子专用发票(含全电)， 10:增值税电子普通发票(含全电)， 11:增值税普通发票(卷式)， 14:增值税电子(通行费)发 票， 15:二手车销售统一发票， 32:深圳区块链发票(云南区块链因业务调整现已下线)。
     */
    public void setInvoiceKind(String InvoiceKind) {
        this.InvoiceKind = InvoiceKind;
    }

    /**
     * Get 校验码后 6 位，增值税普通发票、增值税电子普通发票、增值税普通发票(卷式)、增值税电子普通发票(通行费)时必填;
区块链为 5 位 
     * @return CheckCode 校验码后 6 位，增值税普通发票、增值税电子普通发票、增值税普通发票(卷式)、增值税电子普通发票(通行费)时必填;
区块链为 5 位
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 校验码后 6 位，增值税普通发票、增值税电子普通发票、增值税普通发票(卷式)、增值税电子普通发票(通行费)时必填;
区块链为 5 位
     * @param CheckCode 校验码后 6 位，增值税普通发票、增值税电子普通发票、增值税普通发票(卷式)、增值税电子普通发票(通行费)时必填;
区块链为 5 位
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 不含税金额，增值税专用发票、增值税电子专用发票、机动车销售统一发票、二手车销售统一发票、区块链发票时必填; 全电发票为价税合计(含税金额) 
     * @return Amount 不含税金额，增值税专用发票、增值税电子专用发票、机动车销售统一发票、二手车销售统一发票、区块链发票时必填; 全电发票为价税合计(含税金额)
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set 不含税金额，增值税专用发票、增值税电子专用发票、机动车销售统一发票、二手车销售统一发票、区块链发票时必填; 全电发票为价税合计(含税金额)
     * @param Amount 不含税金额，增值税专用发票、增值税电子专用发票、机动车销售统一发票、二手车销售统一发票、区块链发票时必填; 全电发票为价税合计(含税金额)
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public VatInvoiceVerifyNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceVerifyNewRequest(VatInvoiceVerifyNewRequest source) {
        if (source.InvoiceNo != null) {
            this.InvoiceNo = new String(source.InvoiceNo);
        }
        if (source.InvoiceDate != null) {
            this.InvoiceDate = new String(source.InvoiceDate);
        }
        if (source.InvoiceCode != null) {
            this.InvoiceCode = new String(source.InvoiceCode);
        }
        if (source.InvoiceKind != null) {
            this.InvoiceKind = new String(source.InvoiceKind);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Amount != null) {
            this.Amount = new String(source.Amount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoiceNo", this.InvoiceNo);
        this.setParamSimple(map, prefix + "InvoiceDate", this.InvoiceDate);
        this.setParamSimple(map, prefix + "InvoiceCode", this.InvoiceCode);
        this.setParamSimple(map, prefix + "InvoiceKind", this.InvoiceKind);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Amount", this.Amount);

    }
}

