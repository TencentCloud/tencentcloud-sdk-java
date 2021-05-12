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

public class DescribeOrderStatusResponse extends AbstractModel{

    /**
    * 交易状态 （0：成功，1：失败，2：待确认, 5：待处理，6：处理中）
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
    * 转出子账户账号
    */
    @SerializedName("OutSubAccountNumber")
    @Expose
    private String OutSubAccountNumber;

    /**
    * 转入子账户账号
    */
    @SerializedName("InSubAccountNumber")
    @Expose
    private String InSubAccountNumber;

    /**
    * 记账标志（1：登记挂账 2：支付 3：提现 4：清分5:下单预支付 6：确认并付款 7：退款 8：支付到平台 N:其他）
    */
    @SerializedName("BookingFlag")
    @Expose
    private String BookingFlag;

    /**
    * 当交易失败时，返回交易失败原因
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
     * Get 交易状态 （0：成功，1：失败，2：待确认, 5：待处理，6：处理中） 
     * @return OrderStatus 交易状态 （0：成功，1：失败，2：待确认, 5：待处理，6：处理中）
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 交易状态 （0：成功，1：失败，2：待确认, 5：待处理，6：处理中）
     * @param OrderStatus 交易状态 （0：成功，1：失败，2：待确认, 5：待处理，6：处理中）
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
     * Get 转出子账户账号 
     * @return OutSubAccountNumber 转出子账户账号
     */
    public String getOutSubAccountNumber() {
        return this.OutSubAccountNumber;
    }

    /**
     * Set 转出子账户账号
     * @param OutSubAccountNumber 转出子账户账号
     */
    public void setOutSubAccountNumber(String OutSubAccountNumber) {
        this.OutSubAccountNumber = OutSubAccountNumber;
    }

    /**
     * Get 转入子账户账号 
     * @return InSubAccountNumber 转入子账户账号
     */
    public String getInSubAccountNumber() {
        return this.InSubAccountNumber;
    }

    /**
     * Set 转入子账户账号
     * @param InSubAccountNumber 转入子账户账号
     */
    public void setInSubAccountNumber(String InSubAccountNumber) {
        this.InSubAccountNumber = InSubAccountNumber;
    }

    /**
     * Get 记账标志（1：登记挂账 2：支付 3：提现 4：清分5:下单预支付 6：确认并付款 7：退款 8：支付到平台 N:其他） 
     * @return BookingFlag 记账标志（1：登记挂账 2：支付 3：提现 4：清分5:下单预支付 6：确认并付款 7：退款 8：支付到平台 N:其他）
     */
    public String getBookingFlag() {
        return this.BookingFlag;
    }

    /**
     * Set 记账标志（1：登记挂账 2：支付 3：提现 4：清分5:下单预支付 6：确认并付款 7：退款 8：支付到平台 N:其他）
     * @param BookingFlag 记账标志（1：登记挂账 2：支付 3：提现 4：清分5:下单预支付 6：确认并付款 7：退款 8：支付到平台 N:其他）
     */
    public void setBookingFlag(String BookingFlag) {
        this.BookingFlag = BookingFlag;
    }

    /**
     * Get 当交易失败时，返回交易失败原因 
     * @return FailMessage 当交易失败时，返回交易失败原因
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 当交易失败时，返回交易失败原因
     * @param FailMessage 当交易失败时，返回交易失败原因
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

    public DescribeOrderStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrderStatusResponse(DescribeOrderStatusResponse source) {
        if (source.OrderStatus != null) {
            this.OrderStatus = new String(source.OrderStatus);
        }
        if (source.OrderAmount != null) {
            this.OrderAmount = new String(source.OrderAmount);
        }
        if (source.OrderDate != null) {
            this.OrderDate = new String(source.OrderDate);
        }
        if (source.OrderTime != null) {
            this.OrderTime = new String(source.OrderTime);
        }
        if (source.OutSubAccountNumber != null) {
            this.OutSubAccountNumber = new String(source.OutSubAccountNumber);
        }
        if (source.InSubAccountNumber != null) {
            this.InSubAccountNumber = new String(source.InSubAccountNumber);
        }
        if (source.BookingFlag != null) {
            this.BookingFlag = new String(source.BookingFlag);
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
        this.setParamSimple(map, prefix + "OrderDate", this.OrderDate);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "OutSubAccountNumber", this.OutSubAccountNumber);
        this.setParamSimple(map, prefix + "InSubAccountNumber", this.InSubAccountNumber);
        this.setParamSimple(map, prefix + "BookingFlag", this.BookingFlag);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

