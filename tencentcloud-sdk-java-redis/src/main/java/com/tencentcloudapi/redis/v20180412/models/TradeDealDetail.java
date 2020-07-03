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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TradeDealDetail extends AbstractModel{

    /**
    * 订单号ID，调用云API时使用此ID
    */
    @SerializedName("DealId")
    @Expose
    private String DealId;

    /**
    * 长订单ID，反馈订单问题给官方客服使用此ID
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 订单关联的实例数
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 创建用户uin
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * 订单创建时间
    */
    @SerializedName("CreatTime")
    @Expose
    private String CreatTime;

    /**
    * 订单超时时间
    */
    @SerializedName("OverdueTime")
    @Expose
    private String OverdueTime;

    /**
    * 订单完成时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 订单状态 1：未支付 2:已支付，未发货 3:发货中 4:发货成功 5:发货失败 6:已退款 7:已关闭订单 8:订单过期 9:订单已失效 10:产品已失效 11:代付拒绝 12:支付中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 订单状态描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 订单实际总价，单位：分
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 实例ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 订单号ID，调用云API时使用此ID 
     * @return DealId 订单号ID，调用云API时使用此ID
     */
    public String getDealId() {
        return this.DealId;
    }

    /**
     * Set 订单号ID，调用云API时使用此ID
     * @param DealId 订单号ID，调用云API时使用此ID
     */
    public void setDealId(String DealId) {
        this.DealId = DealId;
    }

    /**
     * Get 长订单ID，反馈订单问题给官方客服使用此ID 
     * @return DealName 长订单ID，反馈订单问题给官方客服使用此ID
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 长订单ID，反馈订单问题给官方客服使用此ID
     * @param DealName 长订单ID，反馈订单问题给官方客服使用此ID
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 可用区id 
     * @return ZoneId 可用区id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区id
     * @param ZoneId 可用区id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 订单关联的实例数 
     * @return GoodsNum 订单关联的实例数
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 订单关联的实例数
     * @param GoodsNum 订单关联的实例数
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 创建用户uin 
     * @return Creater 创建用户uin
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * Set 创建用户uin
     * @param Creater 创建用户uin
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * Get 订单创建时间 
     * @return CreatTime 订单创建时间
     */
    public String getCreatTime() {
        return this.CreatTime;
    }

    /**
     * Set 订单创建时间
     * @param CreatTime 订单创建时间
     */
    public void setCreatTime(String CreatTime) {
        this.CreatTime = CreatTime;
    }

    /**
     * Get 订单超时时间 
     * @return OverdueTime 订单超时时间
     */
    public String getOverdueTime() {
        return this.OverdueTime;
    }

    /**
     * Set 订单超时时间
     * @param OverdueTime 订单超时时间
     */
    public void setOverdueTime(String OverdueTime) {
        this.OverdueTime = OverdueTime;
    }

    /**
     * Get 订单完成时间 
     * @return EndTime 订单完成时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 订单完成时间
     * @param EndTime 订单完成时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 订单状态 1：未支付 2:已支付，未发货 3:发货中 4:发货成功 5:发货失败 6:已退款 7:已关闭订单 8:订单过期 9:订单已失效 10:产品已失效 11:代付拒绝 12:支付中 
     * @return Status 订单状态 1：未支付 2:已支付，未发货 3:发货中 4:发货成功 5:发货失败 6:已退款 7:已关闭订单 8:订单过期 9:订单已失效 10:产品已失效 11:代付拒绝 12:支付中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态 1：未支付 2:已支付，未发货 3:发货中 4:发货成功 5:发货失败 6:已退款 7:已关闭订单 8:订单过期 9:订单已失效 10:产品已失效 11:代付拒绝 12:支付中
     * @param Status 订单状态 1：未支付 2:已支付，未发货 3:发货中 4:发货成功 5:发货失败 6:已退款 7:已关闭订单 8:订单过期 9:订单已失效 10:产品已失效 11:代付拒绝 12:支付中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 订单状态描述 
     * @return Description 订单状态描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 订单状态描述
     * @param Description 订单状态描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 订单实际总价，单位：分 
     * @return Price 订单实际总价，单位：分
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 订单实际总价，单位：分
     * @param Price 订单实际总价，单位：分
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 实例ID 
     * @return InstanceIds 实例ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID
     * @param InstanceIds 实例ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealId", this.DealId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "CreatTime", this.CreatTime);
        this.setParamSimple(map, prefix + "OverdueTime", this.OverdueTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

