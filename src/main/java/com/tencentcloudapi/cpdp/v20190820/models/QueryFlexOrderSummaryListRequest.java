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

public class QueryFlexOrderSummaryListRequest extends AbstractModel{

    /**
    * 汇总日期:yyyy-MM-dd
    */
    @SerializedName("SummaryDate")
    @Expose
    private String SummaryDate;

    /**
    * 分页
    */
    @SerializedName("PageNumber")
    @Expose
    private Paging PageNumber;

    /**
    * 汇总订单类型:FREEZE, SETTLEMENT,PAYMENT
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 收款用户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 汇总日期:yyyy-MM-dd 
     * @return SummaryDate 汇总日期:yyyy-MM-dd
     */
    public String getSummaryDate() {
        return this.SummaryDate;
    }

    /**
     * Set 汇总日期:yyyy-MM-dd
     * @param SummaryDate 汇总日期:yyyy-MM-dd
     */
    public void setSummaryDate(String SummaryDate) {
        this.SummaryDate = SummaryDate;
    }

    /**
     * Get 分页 
     * @return PageNumber 分页
     */
    public Paging getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页
     * @param PageNumber 分页
     */
    public void setPageNumber(Paging PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 汇总订单类型:FREEZE, SETTLEMENT,PAYMENT 
     * @return OrderType 汇总订单类型:FREEZE, SETTLEMENT,PAYMENT
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 汇总订单类型:FREEZE, SETTLEMENT,PAYMENT
     * @param OrderType 汇总订单类型:FREEZE, SETTLEMENT,PAYMENT
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 收款用户ID 
     * @return PayeeId 收款用户ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款用户ID
     * @param PayeeId 收款用户ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境 
     * @return Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     * @param Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public QueryFlexOrderSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFlexOrderSummaryListRequest(QueryFlexOrderSummaryListRequest source) {
        if (source.SummaryDate != null) {
            this.SummaryDate = new String(source.SummaryDate);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Paging(source.PageNumber);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SummaryDate", this.SummaryDate);
        this.setParamObj(map, prefix + "PageNumber.", this.PageNumber);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

