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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonTracePoint extends AbstractModel{

    /**
    * 卖场区域编码
    */
    @SerializedName("MallAreaId")
    @Expose
    private Long MallAreaId;

    /**
    * 门店编码
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 卖场区域类型
    */
    @SerializedName("MallAreaType")
    @Expose
    private Long MallAreaType;

    /**
    * 轨迹事件
    */
    @SerializedName("TraceEventType")
    @Expose
    private Long TraceEventType;

    /**
    * 轨迹事件发生时间点
    */
    @SerializedName("TraceEventTime")
    @Expose
    private String TraceEventTime;

    /**
    * 抓拍图片
    */
    @SerializedName("CapPic")
    @Expose
    private String CapPic;

    /**
    * 购物袋类型
    */
    @SerializedName("ShoppingBagType")
    @Expose
    private Long ShoppingBagType;

    /**
    * 购物袋数量
    */
    @SerializedName("ShoppingBagCount")
    @Expose
    private Long ShoppingBagCount;

    /**
     * Get 卖场区域编码 
     * @return MallAreaId 卖场区域编码
     */
    public Long getMallAreaId() {
        return this.MallAreaId;
    }

    /**
     * Set 卖场区域编码
     * @param MallAreaId 卖场区域编码
     */
    public void setMallAreaId(Long MallAreaId) {
        this.MallAreaId = MallAreaId;
    }

    /**
     * Get 门店编码 
     * @return ShopId 门店编码
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 门店编码
     * @param ShopId 门店编码
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 卖场区域类型 
     * @return MallAreaType 卖场区域类型
     */
    public Long getMallAreaType() {
        return this.MallAreaType;
    }

    /**
     * Set 卖场区域类型
     * @param MallAreaType 卖场区域类型
     */
    public void setMallAreaType(Long MallAreaType) {
        this.MallAreaType = MallAreaType;
    }

    /**
     * Get 轨迹事件 
     * @return TraceEventType 轨迹事件
     */
    public Long getTraceEventType() {
        return this.TraceEventType;
    }

    /**
     * Set 轨迹事件
     * @param TraceEventType 轨迹事件
     */
    public void setTraceEventType(Long TraceEventType) {
        this.TraceEventType = TraceEventType;
    }

    /**
     * Get 轨迹事件发生时间点 
     * @return TraceEventTime 轨迹事件发生时间点
     */
    public String getTraceEventTime() {
        return this.TraceEventTime;
    }

    /**
     * Set 轨迹事件发生时间点
     * @param TraceEventTime 轨迹事件发生时间点
     */
    public void setTraceEventTime(String TraceEventTime) {
        this.TraceEventTime = TraceEventTime;
    }

    /**
     * Get 抓拍图片 
     * @return CapPic 抓拍图片
     */
    public String getCapPic() {
        return this.CapPic;
    }

    /**
     * Set 抓拍图片
     * @param CapPic 抓拍图片
     */
    public void setCapPic(String CapPic) {
        this.CapPic = CapPic;
    }

    /**
     * Get 购物袋类型 
     * @return ShoppingBagType 购物袋类型
     */
    public Long getShoppingBagType() {
        return this.ShoppingBagType;
    }

    /**
     * Set 购物袋类型
     * @param ShoppingBagType 购物袋类型
     */
    public void setShoppingBagType(Long ShoppingBagType) {
        this.ShoppingBagType = ShoppingBagType;
    }

    /**
     * Get 购物袋数量 
     * @return ShoppingBagCount 购物袋数量
     */
    public Long getShoppingBagCount() {
        return this.ShoppingBagCount;
    }

    /**
     * Set 购物袋数量
     * @param ShoppingBagCount 购物袋数量
     */
    public void setShoppingBagCount(Long ShoppingBagCount) {
        this.ShoppingBagCount = ShoppingBagCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MallAreaId", this.MallAreaId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "MallAreaType", this.MallAreaType);
        this.setParamSimple(map, prefix + "TraceEventType", this.TraceEventType);
        this.setParamSimple(map, prefix + "TraceEventTime", this.TraceEventTime);
        this.setParamSimple(map, prefix + "CapPic", this.CapPic);
        this.setParamSimple(map, prefix + "ShoppingBagType", this.ShoppingBagType);
        this.setParamSimple(map, prefix + "ShoppingBagCount", this.ShoppingBagCount);

    }
}

