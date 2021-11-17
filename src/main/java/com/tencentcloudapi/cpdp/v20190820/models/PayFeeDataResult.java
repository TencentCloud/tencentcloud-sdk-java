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

public class PayFeeDataResult extends AbstractModel{

    /**
    * 机构的分佣扣率扣率
    */
    @SerializedName("OrganizationFee")
    @Expose
    private String OrganizationFee;

    /**
    * 商户手续费封顶值，0为不限封顶
    */
    @SerializedName("PaymentClassificationLimit")
    @Expose
    private String PaymentClassificationLimit;

    /**
    * 机构的分佣扣率类型(1按签约扣率，2按收单收益)
    */
    @SerializedName("OrganizationFeeType")
    @Expose
    private String OrganizationFeeType;

    /**
    * 商户扣率最大值
    */
    @SerializedName("PaymentClassificationMaxFee")
    @Expose
    private String PaymentClassificationMaxFee;

    /**
    * 商户扣率最小值
    */
    @SerializedName("PaymentClassificationMinFee")
    @Expose
    private String PaymentClassificationMinFee;

    /**
    * 行业会类编号
    */
    @SerializedName("PaymentClassificationId")
    @Expose
    private String PaymentClassificationId;

    /**
    * 行业分类名称
    */
    @SerializedName("PaymentClassificationName")
    @Expose
    private String PaymentClassificationName;

    /**
     * Get 机构的分佣扣率扣率 
     * @return OrganizationFee 机构的分佣扣率扣率
     */
    public String getOrganizationFee() {
        return this.OrganizationFee;
    }

    /**
     * Set 机构的分佣扣率扣率
     * @param OrganizationFee 机构的分佣扣率扣率
     */
    public void setOrganizationFee(String OrganizationFee) {
        this.OrganizationFee = OrganizationFee;
    }

    /**
     * Get 商户手续费封顶值，0为不限封顶 
     * @return PaymentClassificationLimit 商户手续费封顶值，0为不限封顶
     */
    public String getPaymentClassificationLimit() {
        return this.PaymentClassificationLimit;
    }

    /**
     * Set 商户手续费封顶值，0为不限封顶
     * @param PaymentClassificationLimit 商户手续费封顶值，0为不限封顶
     */
    public void setPaymentClassificationLimit(String PaymentClassificationLimit) {
        this.PaymentClassificationLimit = PaymentClassificationLimit;
    }

    /**
     * Get 机构的分佣扣率类型(1按签约扣率，2按收单收益) 
     * @return OrganizationFeeType 机构的分佣扣率类型(1按签约扣率，2按收单收益)
     */
    public String getOrganizationFeeType() {
        return this.OrganizationFeeType;
    }

    /**
     * Set 机构的分佣扣率类型(1按签约扣率，2按收单收益)
     * @param OrganizationFeeType 机构的分佣扣率类型(1按签约扣率，2按收单收益)
     */
    public void setOrganizationFeeType(String OrganizationFeeType) {
        this.OrganizationFeeType = OrganizationFeeType;
    }

    /**
     * Get 商户扣率最大值 
     * @return PaymentClassificationMaxFee 商户扣率最大值
     */
    public String getPaymentClassificationMaxFee() {
        return this.PaymentClassificationMaxFee;
    }

    /**
     * Set 商户扣率最大值
     * @param PaymentClassificationMaxFee 商户扣率最大值
     */
    public void setPaymentClassificationMaxFee(String PaymentClassificationMaxFee) {
        this.PaymentClassificationMaxFee = PaymentClassificationMaxFee;
    }

    /**
     * Get 商户扣率最小值 
     * @return PaymentClassificationMinFee 商户扣率最小值
     */
    public String getPaymentClassificationMinFee() {
        return this.PaymentClassificationMinFee;
    }

    /**
     * Set 商户扣率最小值
     * @param PaymentClassificationMinFee 商户扣率最小值
     */
    public void setPaymentClassificationMinFee(String PaymentClassificationMinFee) {
        this.PaymentClassificationMinFee = PaymentClassificationMinFee;
    }

    /**
     * Get 行业会类编号 
     * @return PaymentClassificationId 行业会类编号
     */
    public String getPaymentClassificationId() {
        return this.PaymentClassificationId;
    }

    /**
     * Set 行业会类编号
     * @param PaymentClassificationId 行业会类编号
     */
    public void setPaymentClassificationId(String PaymentClassificationId) {
        this.PaymentClassificationId = PaymentClassificationId;
    }

    /**
     * Get 行业分类名称 
     * @return PaymentClassificationName 行业分类名称
     */
    public String getPaymentClassificationName() {
        return this.PaymentClassificationName;
    }

    /**
     * Set 行业分类名称
     * @param PaymentClassificationName 行业分类名称
     */
    public void setPaymentClassificationName(String PaymentClassificationName) {
        this.PaymentClassificationName = PaymentClassificationName;
    }

    public PayFeeDataResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayFeeDataResult(PayFeeDataResult source) {
        if (source.OrganizationFee != null) {
            this.OrganizationFee = new String(source.OrganizationFee);
        }
        if (source.PaymentClassificationLimit != null) {
            this.PaymentClassificationLimit = new String(source.PaymentClassificationLimit);
        }
        if (source.OrganizationFeeType != null) {
            this.OrganizationFeeType = new String(source.OrganizationFeeType);
        }
        if (source.PaymentClassificationMaxFee != null) {
            this.PaymentClassificationMaxFee = new String(source.PaymentClassificationMaxFee);
        }
        if (source.PaymentClassificationMinFee != null) {
            this.PaymentClassificationMinFee = new String(source.PaymentClassificationMinFee);
        }
        if (source.PaymentClassificationId != null) {
            this.PaymentClassificationId = new String(source.PaymentClassificationId);
        }
        if (source.PaymentClassificationName != null) {
            this.PaymentClassificationName = new String(source.PaymentClassificationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationFee", this.OrganizationFee);
        this.setParamSimple(map, prefix + "PaymentClassificationLimit", this.PaymentClassificationLimit);
        this.setParamSimple(map, prefix + "OrganizationFeeType", this.OrganizationFeeType);
        this.setParamSimple(map, prefix + "PaymentClassificationMaxFee", this.PaymentClassificationMaxFee);
        this.setParamSimple(map, prefix + "PaymentClassificationMinFee", this.PaymentClassificationMinFee);
        this.setParamSimple(map, prefix + "PaymentClassificationId", this.PaymentClassificationId);
        this.setParamSimple(map, prefix + "PaymentClassificationName", this.PaymentClassificationName);

    }
}

