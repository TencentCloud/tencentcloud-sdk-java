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

public class OrderSummaryResult extends AbstractModel{

    /**
    * 汇总ID
    */
    @SerializedName("SummaryId")
    @Expose
    private String SummaryId;

    /**
    * 收款账户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 收款账户名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 收入类型
    */
    @SerializedName("IncomeType")
    @Expose
    private String IncomeType;

    /**
    * 汇总金额
    */
    @SerializedName("SummaryAmount")
    @Expose
    private String SummaryAmount;

    /**
    * 汇总日期
    */
    @SerializedName("SummaryTime")
    @Expose
    private String SummaryTime;

    /**
    * 汇总记录数量
    */
    @SerializedName("SummaryCount")
    @Expose
    private Long SummaryCount;

    /**
     * Get 汇总ID 
     * @return SummaryId 汇总ID
     */
    public String getSummaryId() {
        return this.SummaryId;
    }

    /**
     * Set 汇总ID
     * @param SummaryId 汇总ID
     */
    public void setSummaryId(String SummaryId) {
        this.SummaryId = SummaryId;
    }

    /**
     * Get 收款账户ID 
     * @return PayeeId 收款账户ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款账户ID
     * @param PayeeId 收款账户ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 收款账户名称 
     * @return Name 收款账户名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 收款账户名称
     * @param Name 收款账户名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 收入类型 
     * @return IncomeType 收入类型
     */
    public String getIncomeType() {
        return this.IncomeType;
    }

    /**
     * Set 收入类型
     * @param IncomeType 收入类型
     */
    public void setIncomeType(String IncomeType) {
        this.IncomeType = IncomeType;
    }

    /**
     * Get 汇总金额 
     * @return SummaryAmount 汇总金额
     */
    public String getSummaryAmount() {
        return this.SummaryAmount;
    }

    /**
     * Set 汇总金额
     * @param SummaryAmount 汇总金额
     */
    public void setSummaryAmount(String SummaryAmount) {
        this.SummaryAmount = SummaryAmount;
    }

    /**
     * Get 汇总日期 
     * @return SummaryTime 汇总日期
     */
    public String getSummaryTime() {
        return this.SummaryTime;
    }

    /**
     * Set 汇总日期
     * @param SummaryTime 汇总日期
     */
    public void setSummaryTime(String SummaryTime) {
        this.SummaryTime = SummaryTime;
    }

    /**
     * Get 汇总记录数量 
     * @return SummaryCount 汇总记录数量
     */
    public Long getSummaryCount() {
        return this.SummaryCount;
    }

    /**
     * Set 汇总记录数量
     * @param SummaryCount 汇总记录数量
     */
    public void setSummaryCount(Long SummaryCount) {
        this.SummaryCount = SummaryCount;
    }

    public OrderSummaryResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderSummaryResult(OrderSummaryResult source) {
        if (source.SummaryId != null) {
            this.SummaryId = new String(source.SummaryId);
        }
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IncomeType != null) {
            this.IncomeType = new String(source.IncomeType);
        }
        if (source.SummaryAmount != null) {
            this.SummaryAmount = new String(source.SummaryAmount);
        }
        if (source.SummaryTime != null) {
            this.SummaryTime = new String(source.SummaryTime);
        }
        if (source.SummaryCount != null) {
            this.SummaryCount = new Long(source.SummaryCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SummaryId", this.SummaryId);
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IncomeType", this.IncomeType);
        this.setParamSimple(map, prefix + "SummaryAmount", this.SummaryAmount);
        this.setParamSimple(map, prefix + "SummaryTime", this.SummaryTime);
        this.setParamSimple(map, prefix + "SummaryCount", this.SummaryCount);

    }
}

