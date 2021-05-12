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

public class DescribeChargeDetailResponse extends AbstractModel{

    /**
    * 交易状态 （0：成功，1：失败，2：异常,3:冲正，5：待处理）
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
    * 交易金额
    */
    @SerializedName("OrderAmount")
    @Expose
    private String OrderAmount;

    /**
    * 佣金费
    */
    @SerializedName("CommissionAmount")
    @Expose
    private String CommissionAmount;

    /**
    * 支付方式  0-冻结支付 1-普通支付
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 交易日期
    */
    @SerializedName("OrderDate")
    @Expose
    private String OrderDate;

    /**
    * 交易时间
    */
    @SerializedName("OrderTime")
    @Expose
    private String OrderTime;

    /**
    * 订单实际转入见证子账户的名称
    */
    @SerializedName("OrderActualInSubAccountName")
    @Expose
    private String OrderActualInSubAccountName;

    /**
    * 订单实际转入见证子账户的帐号
    */
    @SerializedName("OrderActualInSubAccountNumber")
    @Expose
    private String OrderActualInSubAccountNumber;

    /**
    * 订单实际转入见证子账户的帐号
    */
    @SerializedName("OrderInSubAccountName")
    @Expose
    private String OrderInSubAccountName;

    /**
    * 订单转入见证子账户的帐号
    */
    @SerializedName("OrderInSubAccountNumber")
    @Expose
    private String OrderInSubAccountNumber;

    /**
    * 银行流水号
    */
    @SerializedName("FrontSequenceNumber")
    @Expose
    private String FrontSequenceNumber;

    /**
    * 当充值失败时，返回交易失败原因
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * 请求类型
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 交易状态 （0：成功，1：失败，2：异常,3:冲正，5：待处理） 
     * @return OrderStatus 交易状态 （0：成功，1：失败，2：异常,3:冲正，5：待处理）
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 交易状态 （0：成功，1：失败，2：异常,3:冲正，5：待处理）
     * @param OrderStatus 交易状态 （0：成功，1：失败，2：异常,3:冲正，5：待处理）
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get 交易金额 
     * @return OrderAmount 交易金额
     */
    public String getOrderAmount() {
        return this.OrderAmount;
    }

    /**
     * Set 交易金额
     * @param OrderAmount 交易金额
     */
    public void setOrderAmount(String OrderAmount) {
        this.OrderAmount = OrderAmount;
    }

    /**
     * Get 佣金费 
     * @return CommissionAmount 佣金费
     */
    public String getCommissionAmount() {
        return this.CommissionAmount;
    }

    /**
     * Set 佣金费
     * @param CommissionAmount 佣金费
     */
    public void setCommissionAmount(String CommissionAmount) {
        this.CommissionAmount = CommissionAmount;
    }

    /**
     * Get 支付方式  0-冻结支付 1-普通支付 
     * @return PayMode 支付方式  0-冻结支付 1-普通支付
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 支付方式  0-冻结支付 1-普通支付
     * @param PayMode 支付方式  0-冻结支付 1-普通支付
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 交易日期 
     * @return OrderDate 交易日期
     */
    public String getOrderDate() {
        return this.OrderDate;
    }

    /**
     * Set 交易日期
     * @param OrderDate 交易日期
     */
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * Get 交易时间 
     * @return OrderTime 交易时间
     */
    public String getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 交易时间
     * @param OrderTime 交易时间
     */
    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    /**
     * Get 订单实际转入见证子账户的名称 
     * @return OrderActualInSubAccountName 订单实际转入见证子账户的名称
     */
    public String getOrderActualInSubAccountName() {
        return this.OrderActualInSubAccountName;
    }

    /**
     * Set 订单实际转入见证子账户的名称
     * @param OrderActualInSubAccountName 订单实际转入见证子账户的名称
     */
    public void setOrderActualInSubAccountName(String OrderActualInSubAccountName) {
        this.OrderActualInSubAccountName = OrderActualInSubAccountName;
    }

    /**
     * Get 订单实际转入见证子账户的帐号 
     * @return OrderActualInSubAccountNumber 订单实际转入见证子账户的帐号
     */
    public String getOrderActualInSubAccountNumber() {
        return this.OrderActualInSubAccountNumber;
    }

    /**
     * Set 订单实际转入见证子账户的帐号
     * @param OrderActualInSubAccountNumber 订单实际转入见证子账户的帐号
     */
    public void setOrderActualInSubAccountNumber(String OrderActualInSubAccountNumber) {
        this.OrderActualInSubAccountNumber = OrderActualInSubAccountNumber;
    }

    /**
     * Get 订单实际转入见证子账户的帐号 
     * @return OrderInSubAccountName 订单实际转入见证子账户的帐号
     */
    public String getOrderInSubAccountName() {
        return this.OrderInSubAccountName;
    }

    /**
     * Set 订单实际转入见证子账户的帐号
     * @param OrderInSubAccountName 订单实际转入见证子账户的帐号
     */
    public void setOrderInSubAccountName(String OrderInSubAccountName) {
        this.OrderInSubAccountName = OrderInSubAccountName;
    }

    /**
     * Get 订单转入见证子账户的帐号 
     * @return OrderInSubAccountNumber 订单转入见证子账户的帐号
     */
    public String getOrderInSubAccountNumber() {
        return this.OrderInSubAccountNumber;
    }

    /**
     * Set 订单转入见证子账户的帐号
     * @param OrderInSubAccountNumber 订单转入见证子账户的帐号
     */
    public void setOrderInSubAccountNumber(String OrderInSubAccountNumber) {
        this.OrderInSubAccountNumber = OrderInSubAccountNumber;
    }

    /**
     * Get 银行流水号 
     * @return FrontSequenceNumber 银行流水号
     */
    public String getFrontSequenceNumber() {
        return this.FrontSequenceNumber;
    }

    /**
     * Set 银行流水号
     * @param FrontSequenceNumber 银行流水号
     */
    public void setFrontSequenceNumber(String FrontSequenceNumber) {
        this.FrontSequenceNumber = FrontSequenceNumber;
    }

    /**
     * Get 当充值失败时，返回交易失败原因 
     * @return FailMessage 当充值失败时，返回交易失败原因
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 当充值失败时，返回交易失败原因
     * @param FailMessage 当充值失败时，返回交易失败原因
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get 请求类型 
     * @return RequestType 请求类型
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 请求类型
     * @param RequestType 请求类型
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeChargeDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChargeDetailResponse(DescribeChargeDetailResponse source) {
        if (source.OrderStatus != null) {
            this.OrderStatus = new String(source.OrderStatus);
        }
        if (source.OrderAmount != null) {
            this.OrderAmount = new String(source.OrderAmount);
        }
        if (source.CommissionAmount != null) {
            this.CommissionAmount = new String(source.CommissionAmount);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.OrderDate != null) {
            this.OrderDate = new String(source.OrderDate);
        }
        if (source.OrderTime != null) {
            this.OrderTime = new String(source.OrderTime);
        }
        if (source.OrderActualInSubAccountName != null) {
            this.OrderActualInSubAccountName = new String(source.OrderActualInSubAccountName);
        }
        if (source.OrderActualInSubAccountNumber != null) {
            this.OrderActualInSubAccountNumber = new String(source.OrderActualInSubAccountNumber);
        }
        if (source.OrderInSubAccountName != null) {
            this.OrderInSubAccountName = new String(source.OrderInSubAccountName);
        }
        if (source.OrderInSubAccountNumber != null) {
            this.OrderInSubAccountNumber = new String(source.OrderInSubAccountNumber);
        }
        if (source.FrontSequenceNumber != null) {
            this.FrontSequenceNumber = new String(source.FrontSequenceNumber);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.RequestType != null) {
            this.RequestType = new String(source.RequestType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "OrderAmount", this.OrderAmount);
        this.setParamSimple(map, prefix + "CommissionAmount", this.CommissionAmount);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "OrderDate", this.OrderDate);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "OrderActualInSubAccountName", this.OrderActualInSubAccountName);
        this.setParamSimple(map, prefix + "OrderActualInSubAccountNumber", this.OrderActualInSubAccountNumber);
        this.setParamSimple(map, prefix + "OrderInSubAccountName", this.OrderInSubAccountName);
        this.setParamSimple(map, prefix + "OrderInSubAccountNumber", this.OrderInSubAccountNumber);
        this.setParamSimple(map, prefix + "FrontSequenceNumber", this.FrontSequenceNumber);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

