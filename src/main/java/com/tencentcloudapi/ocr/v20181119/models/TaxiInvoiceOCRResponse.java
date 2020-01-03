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

public class TaxiInvoiceOCRResponse extends AbstractModel{

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
    * 发票所在地
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 车牌号
    */
    @SerializedName("PlateNumber")
    @Expose
    private String PlateNumber;

    /**
    * 发票消费类型
    */
    @SerializedName("InvoiceType")
    @Expose
    private String InvoiceType;

    /**
    * 省
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 发票代码 
     * @return InvoiceNum 发票代码
     */
    public String getInvoiceNum() {
        return this.InvoiceNum;
    }

    /**
     * Set 发票代码
     * @param InvoiceNum 发票代码
     */
    public void setInvoiceNum(String InvoiceNum) {
        this.InvoiceNum = InvoiceNum;
    }

    /**
     * Get 发票号码 
     * @return InvoiceCode 发票号码
     */
    public String getInvoiceCode() {
        return this.InvoiceCode;
    }

    /**
     * Set 发票号码
     * @param InvoiceCode 发票号码
     */
    public void setInvoiceCode(String InvoiceCode) {
        this.InvoiceCode = InvoiceCode;
    }

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 金额 
     * @return Fare 金额
     */
    public String getFare() {
        return this.Fare;
    }

    /**
     * Set 金额
     * @param Fare 金额
     */
    public void setFare(String Fare) {
        this.Fare = Fare;
    }

    /**
     * Get 上车时间 
     * @return GetOnTime 上车时间
     */
    public String getGetOnTime() {
        return this.GetOnTime;
    }

    /**
     * Set 上车时间
     * @param GetOnTime 上车时间
     */
    public void setGetOnTime(String GetOnTime) {
        this.GetOnTime = GetOnTime;
    }

    /**
     * Get 下车时间 
     * @return GetOffTime 下车时间
     */
    public String getGetOffTime() {
        return this.GetOffTime;
    }

    /**
     * Set 下车时间
     * @param GetOffTime 下车时间
     */
    public void setGetOffTime(String GetOffTime) {
        this.GetOffTime = GetOffTime;
    }

    /**
     * Get 里程 
     * @return Distance 里程
     */
    public String getDistance() {
        return this.Distance;
    }

    /**
     * Set 里程
     * @param Distance 里程
     */
    public void setDistance(String Distance) {
        this.Distance = Distance;
    }

    /**
     * Get 发票所在地 
     * @return Location 发票所在地
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 发票所在地
     * @param Location 发票所在地
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 车牌号 
     * @return PlateNumber 车牌号
     */
    public String getPlateNumber() {
        return this.PlateNumber;
    }

    /**
     * Set 车牌号
     * @param PlateNumber 车牌号
     */
    public void setPlateNumber(String PlateNumber) {
        this.PlateNumber = PlateNumber;
    }

    /**
     * Get 发票消费类型 
     * @return InvoiceType 发票消费类型
     */
    public String getInvoiceType() {
        return this.InvoiceType;
    }

    /**
     * Set 发票消费类型
     * @param InvoiceType 发票消费类型
     */
    public void setInvoiceType(String InvoiceType) {
        this.InvoiceType = InvoiceType;
    }

    /**
     * Get 省
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoiceNum", this.InvoiceNum);
        this.setParamSimple(map, prefix + "InvoiceCode", this.InvoiceCode);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "GetOnTime", this.GetOnTime);
        this.setParamSimple(map, prefix + "GetOffTime", this.GetOffTime);
        this.setParamSimple(map, prefix + "Distance", this.Distance);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "PlateNumber", this.PlateNumber);
        this.setParamSimple(map, prefix + "InvoiceType", this.InvoiceType);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

