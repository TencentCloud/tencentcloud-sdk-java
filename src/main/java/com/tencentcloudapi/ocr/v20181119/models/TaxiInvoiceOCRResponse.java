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

public class TaxiInvoiceOCRResponse  extends AbstractModel{

    /**
    * 发票代码
    */
    @SerializedName("InvoiceNum")
    @Expose
    private String InvoiceNum;

    /**
    * 发票号码
    */
    @SerializedName("InvoiceCode")
    @Expose
    private String InvoiceCode;

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 金额
    */
    @SerializedName("Fare")
    @Expose
    private String Fare;

    /**
    * 上车时间
    */
    @SerializedName("GetOnTime")
    @Expose
    private String GetOnTime;

    /**
    * 下车时间
    */
    @SerializedName("GetOffTime")
    @Expose
    private String GetOffTime;

    /**
    * 里程
    */
    @SerializedName("Distance")
    @Expose
    private String Distance;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取发票代码
     * @return InvoiceNum 发票代码
     */
    public String getInvoiceNum() {
        return this.InvoiceNum;
    }

    /**
     * 设置发票代码
     * @param InvoiceNum 发票代码
     */
    public void setInvoiceNum(String InvoiceNum) {
        this.InvoiceNum = InvoiceNum;
    }

    /**
     * 获取发票号码
     * @return InvoiceCode 发票号码
     */
    public String getInvoiceCode() {
        return this.InvoiceCode;
    }

    /**
     * 设置发票号码
     * @param InvoiceCode 发票号码
     */
    public void setInvoiceCode(String InvoiceCode) {
        this.InvoiceCode = InvoiceCode;
    }

    /**
     * 获取日期
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取金额
     * @return Fare 金额
     */
    public String getFare() {
        return this.Fare;
    }

    /**
     * 设置金额
     * @param Fare 金额
     */
    public void setFare(String Fare) {
        this.Fare = Fare;
    }

    /**
     * 获取上车时间
     * @return GetOnTime 上车时间
     */
    public String getGetOnTime() {
        return this.GetOnTime;
    }

    /**
     * 设置上车时间
     * @param GetOnTime 上车时间
     */
    public void setGetOnTime(String GetOnTime) {
        this.GetOnTime = GetOnTime;
    }

    /**
     * 获取下车时间
     * @return GetOffTime 下车时间
     */
    public String getGetOffTime() {
        return this.GetOffTime;
    }

    /**
     * 设置下车时间
     * @param GetOffTime 下车时间
     */
    public void setGetOffTime(String GetOffTime) {
        this.GetOffTime = GetOffTime;
    }

    /**
     * 获取里程
     * @return Distance 里程
     */
    public String getDistance() {
        return this.Distance;
    }

    /**
     * 设置里程
     * @param Distance 里程
     */
    public void setDistance(String Distance) {
        this.Distance = Distance;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoiceNum", this.InvoiceNum);
        this.setParamSimple(map, prefix + "InvoiceCode", this.InvoiceCode);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "GetOnTime", this.GetOnTime);
        this.setParamSimple(map, prefix + "GetOffTime", this.GetOffTime);
        this.setParamSimple(map, prefix + "Distance", this.Distance);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

