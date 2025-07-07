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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdjustInfoDetail extends AbstractModel {

    /**
    * 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 账单月份，格式：yyyy-MM
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 调整类型
调账：manualAdjustment
补结算：supplementarySettlement
重结算：reSettlement
    */
    @SerializedName("AdjustType")
    @Expose
    private String AdjustType;

    /**
    * 调整单号
    */
    @SerializedName("AdjustNum")
    @Expose
    private String AdjustNum;

    /**
    * 异常调整完成时间，格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("AdjustCompletionTime")
    @Expose
    private String AdjustCompletionTime;

    /**
    * 调整金额
    */
    @SerializedName("AdjustAmount")
    @Expose
    private Float AdjustAmount;

    /**
     * Get 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识 
     * @return PayerUin 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
     * @param PayerUin 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 账单月份，格式：yyyy-MM 
     * @return Month 账单月份，格式：yyyy-MM
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 账单月份，格式：yyyy-MM
     * @param Month 账单月份，格式：yyyy-MM
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 调整类型
调账：manualAdjustment
补结算：supplementarySettlement
重结算：reSettlement 
     * @return AdjustType 调整类型
调账：manualAdjustment
补结算：supplementarySettlement
重结算：reSettlement
     */
    public String getAdjustType() {
        return this.AdjustType;
    }

    /**
     * Set 调整类型
调账：manualAdjustment
补结算：supplementarySettlement
重结算：reSettlement
     * @param AdjustType 调整类型
调账：manualAdjustment
补结算：supplementarySettlement
重结算：reSettlement
     */
    public void setAdjustType(String AdjustType) {
        this.AdjustType = AdjustType;
    }

    /**
     * Get 调整单号 
     * @return AdjustNum 调整单号
     */
    public String getAdjustNum() {
        return this.AdjustNum;
    }

    /**
     * Set 调整单号
     * @param AdjustNum 调整单号
     */
    public void setAdjustNum(String AdjustNum) {
        this.AdjustNum = AdjustNum;
    }

    /**
     * Get 异常调整完成时间，格式：yyyy-MM-dd HH:mm:ss 
     * @return AdjustCompletionTime 异常调整完成时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public String getAdjustCompletionTime() {
        return this.AdjustCompletionTime;
    }

    /**
     * Set 异常调整完成时间，格式：yyyy-MM-dd HH:mm:ss
     * @param AdjustCompletionTime 异常调整完成时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public void setAdjustCompletionTime(String AdjustCompletionTime) {
        this.AdjustCompletionTime = AdjustCompletionTime;
    }

    /**
     * Get 调整金额 
     * @return AdjustAmount 调整金额
     */
    public Float getAdjustAmount() {
        return this.AdjustAmount;
    }

    /**
     * Set 调整金额
     * @param AdjustAmount 调整金额
     */
    public void setAdjustAmount(Float AdjustAmount) {
        this.AdjustAmount = AdjustAmount;
    }

    public AdjustInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustInfoDetail(AdjustInfoDetail source) {
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.AdjustType != null) {
            this.AdjustType = new String(source.AdjustType);
        }
        if (source.AdjustNum != null) {
            this.AdjustNum = new String(source.AdjustNum);
        }
        if (source.AdjustCompletionTime != null) {
            this.AdjustCompletionTime = new String(source.AdjustCompletionTime);
        }
        if (source.AdjustAmount != null) {
            this.AdjustAmount = new Float(source.AdjustAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "AdjustType", this.AdjustType);
        this.setParamSimple(map, prefix + "AdjustNum", this.AdjustNum);
        this.setParamSimple(map, prefix + "AdjustCompletionTime", this.AdjustCompletionTime);
        this.setParamSimple(map, prefix + "AdjustAmount", this.AdjustAmount);

    }
}

