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

public class PersonTracePoint  extends AbstractModel{

    /**
    * 卖场区域编码
    */
    @SerializedName("MallAreaId")
    @Expose
    private Integer MallAreaId;

    /**
    * 门店编码
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 卖场区域类型
    */
    @SerializedName("MallAreaType")
    @Expose
    private Integer MallAreaType;

    /**
    * 轨迹事件
    */
    @SerializedName("TraceEventType")
    @Expose
    private Integer TraceEventType;

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
    private Integer ShoppingBagType;

    /**
    * 购物袋数量
    */
    @SerializedName("ShoppingBagCount")
    @Expose
    private Integer ShoppingBagCount;

    /**
     * 获取卖场区域编码
     * @return MallAreaId 卖场区域编码
     */
    public Integer getMallAreaId() {
        return this.MallAreaId;
    }

    /**
     * 设置卖场区域编码
     * @param MallAreaId 卖场区域编码
     */
    public void setMallAreaId(Integer MallAreaId) {
        this.MallAreaId = MallAreaId;
    }

    /**
     * 获取门店编码
     * @return ShopId 门店编码
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置门店编码
     * @param ShopId 门店编码
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取卖场区域类型
     * @return MallAreaType 卖场区域类型
     */
    public Integer getMallAreaType() {
        return this.MallAreaType;
    }

    /**
     * 设置卖场区域类型
     * @param MallAreaType 卖场区域类型
     */
    public void setMallAreaType(Integer MallAreaType) {
        this.MallAreaType = MallAreaType;
    }

    /**
     * 获取轨迹事件
     * @return TraceEventType 轨迹事件
     */
    public Integer getTraceEventType() {
        return this.TraceEventType;
    }

    /**
     * 设置轨迹事件
     * @param TraceEventType 轨迹事件
     */
    public void setTraceEventType(Integer TraceEventType) {
        this.TraceEventType = TraceEventType;
    }

    /**
     * 获取轨迹事件发生时间点
     * @return TraceEventTime 轨迹事件发生时间点
     */
    public String getTraceEventTime() {
        return this.TraceEventTime;
    }

    /**
     * 设置轨迹事件发生时间点
     * @param TraceEventTime 轨迹事件发生时间点
     */
    public void setTraceEventTime(String TraceEventTime) {
        this.TraceEventTime = TraceEventTime;
    }

    /**
     * 获取抓拍图片
     * @return CapPic 抓拍图片
     */
    public String getCapPic() {
        return this.CapPic;
    }

    /**
     * 设置抓拍图片
     * @param CapPic 抓拍图片
     */
    public void setCapPic(String CapPic) {
        this.CapPic = CapPic;
    }

    /**
     * 获取购物袋类型
     * @return ShoppingBagType 购物袋类型
     */
    public Integer getShoppingBagType() {
        return this.ShoppingBagType;
    }

    /**
     * 设置购物袋类型
     * @param ShoppingBagType 购物袋类型
     */
    public void setShoppingBagType(Integer ShoppingBagType) {
        this.ShoppingBagType = ShoppingBagType;
    }

    /**
     * 获取购物袋数量
     * @return ShoppingBagCount 购物袋数量
     */
    public Integer getShoppingBagCount() {
        return this.ShoppingBagCount;
    }

    /**
     * 设置购物袋数量
     * @param ShoppingBagCount 购物袋数量
     */
    public void setShoppingBagCount(Integer ShoppingBagCount) {
        this.ShoppingBagCount = ShoppingBagCount;
    }

    /**
     * 内部实现，用户禁止调用
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

