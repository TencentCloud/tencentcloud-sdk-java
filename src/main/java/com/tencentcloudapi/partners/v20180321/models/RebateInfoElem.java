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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebateInfoElem extends AbstractModel{

    /**
    * 代理商账号ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 返佣月份，如2018-02
    */
    @SerializedName("RebateMonth")
    @Expose
    private String RebateMonth;

    /**
    * 返佣金额，单位分
    */
    @SerializedName("Amt")
    @Expose
    private Long Amt;

    /**
    * 月度业绩，单位分
    */
    @SerializedName("MonthSales")
    @Expose
    private Long MonthSales;

    /**
    * 季度业绩，单位分
    */
    @SerializedName("QuarterSales")
    @Expose
    private Long QuarterSales;

    /**
    * NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
    */
    @SerializedName("ExceptionFlag")
    @Expose
    private String ExceptionFlag;

    /**
     * Get 代理商账号ID 
     * @return Uin 代理商账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 代理商账号ID
     * @param Uin 代理商账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 返佣月份，如2018-02 
     * @return RebateMonth 返佣月份，如2018-02
     */
    public String getRebateMonth() {
        return this.RebateMonth;
    }

    /**
     * Set 返佣月份，如2018-02
     * @param RebateMonth 返佣月份，如2018-02
     */
    public void setRebateMonth(String RebateMonth) {
        this.RebateMonth = RebateMonth;
    }

    /**
     * Get 返佣金额，单位分 
     * @return Amt 返佣金额，单位分
     */
    public Long getAmt() {
        return this.Amt;
    }

    /**
     * Set 返佣金额，单位分
     * @param Amt 返佣金额，单位分
     */
    public void setAmt(Long Amt) {
        this.Amt = Amt;
    }

    /**
     * Get 月度业绩，单位分 
     * @return MonthSales 月度业绩，单位分
     */
    public Long getMonthSales() {
        return this.MonthSales;
    }

    /**
     * Set 月度业绩，单位分
     * @param MonthSales 月度业绩，单位分
     */
    public void setMonthSales(Long MonthSales) {
        this.MonthSales = MonthSales;
    }

    /**
     * Get 季度业绩，单位分 
     * @return QuarterSales 季度业绩，单位分
     */
    public Long getQuarterSales() {
        return this.QuarterSales;
    }

    /**
     * Set 季度业绩，单位分
     * @param QuarterSales 季度业绩，单位分
     */
    public void setQuarterSales(Long QuarterSales) {
        this.QuarterSales = QuarterSales;
    }

    /**
     * Get NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同) 
     * @return ExceptionFlag NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
     */
    public String getExceptionFlag() {
        return this.ExceptionFlag;
    }

    /**
     * Set NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
     * @param ExceptionFlag NORMAL(正常)/HAS_OVERDUE_BILL(欠费)/NO_CONTRACT(缺合同)
     */
    public void setExceptionFlag(String ExceptionFlag) {
        this.ExceptionFlag = ExceptionFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RebateMonth", this.RebateMonth);
        this.setParamSimple(map, prefix + "Amt", this.Amt);
        this.setParamSimple(map, prefix + "MonthSales", this.MonthSales);
        this.setParamSimple(map, prefix + "QuarterSales", this.QuarterSales);
        this.setParamSimple(map, prefix + "ExceptionFlag", this.ExceptionFlag);

    }
}

