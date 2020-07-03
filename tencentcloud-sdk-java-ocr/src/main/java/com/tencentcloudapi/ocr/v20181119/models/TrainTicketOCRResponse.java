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

public class TrainTicketOCRResponse extends AbstractModel{

    /**
    * 编号
    */
    @SerializedName("TicketNum")
    @Expose
    private String TicketNum;

    /**
    * 出发站
    */
    @SerializedName("StartStation")
    @Expose
    private String StartStation;

    /**
    * 到达站
    */
    @SerializedName("DestinationStation")
    @Expose
    private String DestinationStation;

    /**
    * 出发时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 车次
    */
    @SerializedName("TrainNum")
    @Expose
    private String TrainNum;

    /**
    * 座位号
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 票价
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 席别
    */
    @SerializedName("SeatCategory")
    @Expose
    private String SeatCategory;

    /**
    * 身份证号
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 发票消费类型
    */
    @SerializedName("InvoiceType")
    @Expose
    private String InvoiceType;

    /**
    * 序列号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 编号 
     * @return TicketNum 编号
     */
    public String getTicketNum() {
        return this.TicketNum;
    }

    /**
     * Set 编号
     * @param TicketNum 编号
     */
    public void setTicketNum(String TicketNum) {
        this.TicketNum = TicketNum;
    }

    /**
     * Get 出发站 
     * @return StartStation 出发站
     */
    public String getStartStation() {
        return this.StartStation;
    }

    /**
     * Set 出发站
     * @param StartStation 出发站
     */
    public void setStartStation(String StartStation) {
        this.StartStation = StartStation;
    }

    /**
     * Get 到达站 
     * @return DestinationStation 到达站
     */
    public String getDestinationStation() {
        return this.DestinationStation;
    }

    /**
     * Set 到达站
     * @param DestinationStation 到达站
     */
    public void setDestinationStation(String DestinationStation) {
        this.DestinationStation = DestinationStation;
    }

    /**
     * Get 出发时间 
     * @return Date 出发时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 出发时间
     * @param Date 出发时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 车次 
     * @return TrainNum 车次
     */
    public String getTrainNum() {
        return this.TrainNum;
    }

    /**
     * Set 车次
     * @param TrainNum 车次
     */
    public void setTrainNum(String TrainNum) {
        this.TrainNum = TrainNum;
    }

    /**
     * Get 座位号 
     * @return Seat 座位号
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * Set 座位号
     * @param Seat 座位号
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 票价 
     * @return Price 票价
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 票价
     * @param Price 票价
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 席别 
     * @return SeatCategory 席别
     */
    public String getSeatCategory() {
        return this.SeatCategory;
    }

    /**
     * Set 席别
     * @param SeatCategory 席别
     */
    public void setSeatCategory(String SeatCategory) {
        this.SeatCategory = SeatCategory;
    }

    /**
     * Get 身份证号 
     * @return ID 身份证号
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 身份证号
     * @param ID 身份证号
     */
    public void setID(String ID) {
        this.ID = ID;
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
     * Get 序列号 
     * @return SerialNumber 序列号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 序列号
     * @param SerialNumber 序列号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
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
        this.setParamSimple(map, prefix + "TicketNum", this.TicketNum);
        this.setParamSimple(map, prefix + "StartStation", this.StartStation);
        this.setParamSimple(map, prefix + "DestinationStation", this.DestinationStation);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "TrainNum", this.TrainNum);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "SeatCategory", this.SeatCategory);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InvoiceType", this.InvoiceType);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

