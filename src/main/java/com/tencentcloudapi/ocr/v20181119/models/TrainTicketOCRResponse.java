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

public class TrainTicketOCRResponse  extends AbstractModel{

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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取编号
     * @return TicketNum 编号
     */
    public String getTicketNum() {
        return this.TicketNum;
    }

    /**
     * 设置编号
     * @param TicketNum 编号
     */
    public void setTicketNum(String TicketNum) {
        this.TicketNum = TicketNum;
    }

    /**
     * 获取出发站
     * @return StartStation 出发站
     */
    public String getStartStation() {
        return this.StartStation;
    }

    /**
     * 设置出发站
     * @param StartStation 出发站
     */
    public void setStartStation(String StartStation) {
        this.StartStation = StartStation;
    }

    /**
     * 获取到达站
     * @return DestinationStation 到达站
     */
    public String getDestinationStation() {
        return this.DestinationStation;
    }

    /**
     * 设置到达站
     * @param DestinationStation 到达站
     */
    public void setDestinationStation(String DestinationStation) {
        this.DestinationStation = DestinationStation;
    }

    /**
     * 获取出发时间
     * @return Date 出发时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置出发时间
     * @param Date 出发时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取车次
     * @return TrainNum 车次
     */
    public String getTrainNum() {
        return this.TrainNum;
    }

    /**
     * 设置车次
     * @param TrainNum 车次
     */
    public void setTrainNum(String TrainNum) {
        this.TrainNum = TrainNum;
    }

    /**
     * 获取座位号
     * @return Seat 座位号
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * 设置座位号
     * @param Seat 座位号
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    /**
     * 获取姓名
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取票价
     * @return Price 票价
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * 设置票价
     * @param Price 票价
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * 获取席别
     * @return SeatCategory 席别
     */
    public String getSeatCategory() {
        return this.SeatCategory;
    }

    /**
     * 设置席别
     * @param SeatCategory 席别
     */
    public void setSeatCategory(String SeatCategory) {
        this.SeatCategory = SeatCategory;
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
        this.setParamSimple(map, prefix + "TicketNum", this.TicketNum);
        this.setParamSimple(map, prefix + "StartStation", this.StartStation);
        this.setParamSimple(map, prefix + "DestinationStation", this.DestinationStation);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "TrainNum", this.TrainNum);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "SeatCategory", this.SeatCategory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

