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

public class PersonCoordinate  extends AbstractModel{

    /**
    * CAD图X坐标
    */
    @SerializedName("CADX")
    @Expose
    private Float CADX;

    /**
    * CAD图Y坐标
    */
    @SerializedName("CADY")
    @Expose
    private Float CADY;

    /**
    * 抓拍时间点
    */
    @SerializedName("CapTime")
    @Expose
    private String CapTime;

    /**
    * 抓拍图片
    */
    @SerializedName("CapPic")
    @Expose
    private String CapPic;

    /**
    * 卖场区域类型
    */
    @SerializedName("MallAreaType")
    @Expose
    private Integer MallAreaType;

    /**
    * 坐标编号
    */
    @SerializedName("PosId")
    @Expose
    private Integer PosId;

    /**
    * 门店编号
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 事件
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
     * 获取CAD图X坐标
     * @return CADX CAD图X坐标
     */
    public Float getCADX() {
        return this.CADX;
    }

    /**
     * 设置CAD图X坐标
     * @param CADX CAD图X坐标
     */
    public void setCADX(Float CADX) {
        this.CADX = CADX;
    }

    /**
     * 获取CAD图Y坐标
     * @return CADY CAD图Y坐标
     */
    public Float getCADY() {
        return this.CADY;
    }

    /**
     * 设置CAD图Y坐标
     * @param CADY CAD图Y坐标
     */
    public void setCADY(Float CADY) {
        this.CADY = CADY;
    }

    /**
     * 获取抓拍时间点
     * @return CapTime 抓拍时间点
     */
    public String getCapTime() {
        return this.CapTime;
    }

    /**
     * 设置抓拍时间点
     * @param CapTime 抓拍时间点
     */
    public void setCapTime(String CapTime) {
        this.CapTime = CapTime;
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
     * 获取坐标编号
     * @return PosId 坐标编号
     */
    public Integer getPosId() {
        return this.PosId;
    }

    /**
     * 设置坐标编号
     * @param PosId 坐标编号
     */
    public void setPosId(Integer PosId) {
        this.PosId = PosId;
    }

    /**
     * 获取门店编号
     * @return ShopId 门店编号
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置门店编号
     * @param ShopId 门店编号
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取事件
     * @return Event 事件
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * 设置事件
     * @param Event 事件
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CADX", this.CADX);
        this.setParamSimple(map, prefix + "CADY", this.CADY);
        this.setParamSimple(map, prefix + "CapTime", this.CapTime);
        this.setParamSimple(map, prefix + "CapPic", this.CapPic);
        this.setParamSimple(map, prefix + "MallAreaType", this.MallAreaType);
        this.setParamSimple(map, prefix + "PosId", this.PosId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "Event", this.Event);

    }
}

