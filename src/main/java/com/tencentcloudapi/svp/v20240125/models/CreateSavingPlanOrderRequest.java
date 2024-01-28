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
package com.tencentcloudapi.svp.v20240125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSavingPlanOrderRequest extends AbstractModel {

    /**
    * 地域编码
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域编码
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 预付费类型
    */
    @SerializedName("PrePayType")
    @Expose
    private String PrePayType;

    /**
    * 时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 时长单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 商品唯一标识
    */
    @SerializedName("CommodityCode")
    @Expose
    private String CommodityCode;

    /**
    * 承诺时长内的小额金额（单位：元）
    */
    @SerializedName("PromiseUseAmount")
    @Expose
    private Long PromiseUseAmount;

    /**
    * 节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:"2023-10-01 00:00:00"，仅支持指定日期的0点时刻
    */
    @SerializedName("SpecifyEffectTime")
    @Expose
    private String SpecifyEffectTime;

    /**
    * 可重入ID
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get 地域编码 
     * @return RegionId 地域编码
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域编码
     * @param RegionId 地域编码
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域编码 
     * @return ZoneId 区域编码
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域编码
     * @param ZoneId 区域编码
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 预付费类型 
     * @return PrePayType 预付费类型
     */
    public String getPrePayType() {
        return this.PrePayType;
    }

    /**
     * Set 预付费类型
     * @param PrePayType 预付费类型
     */
    public void setPrePayType(String PrePayType) {
        this.PrePayType = PrePayType;
    }

    /**
     * Get 时长 
     * @return TimeSpan 时长
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时长
     * @param TimeSpan 时长
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时长单位 
     * @return TimeUnit 时长单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时长单位
     * @param TimeUnit 时长单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 商品唯一标识 
     * @return CommodityCode 商品唯一标识
     */
    public String getCommodityCode() {
        return this.CommodityCode;
    }

    /**
     * Set 商品唯一标识
     * @param CommodityCode 商品唯一标识
     */
    public void setCommodityCode(String CommodityCode) {
        this.CommodityCode = CommodityCode;
    }

    /**
     * Get 承诺时长内的小额金额（单位：元） 
     * @return PromiseUseAmount 承诺时长内的小额金额（单位：元）
     */
    public Long getPromiseUseAmount() {
        return this.PromiseUseAmount;
    }

    /**
     * Set 承诺时长内的小额金额（单位：元）
     * @param PromiseUseAmount 承诺时长内的小额金额（单位：元）
     */
    public void setPromiseUseAmount(Long PromiseUseAmount) {
        this.PromiseUseAmount = PromiseUseAmount;
    }

    /**
     * Get 节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:"2023-10-01 00:00:00"，仅支持指定日期的0点时刻 
     * @return SpecifyEffectTime 节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:"2023-10-01 00:00:00"，仅支持指定日期的0点时刻
     */
    public String getSpecifyEffectTime() {
        return this.SpecifyEffectTime;
    }

    /**
     * Set 节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:"2023-10-01 00:00:00"，仅支持指定日期的0点时刻
     * @param SpecifyEffectTime 节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:"2023-10-01 00:00:00"，仅支持指定日期的0点时刻
     */
    public void setSpecifyEffectTime(String SpecifyEffectTime) {
        this.SpecifyEffectTime = SpecifyEffectTime;
    }

    /**
     * Get 可重入ID 
     * @return ClientToken 可重入ID
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 可重入ID
     * @param ClientToken 可重入ID
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateSavingPlanOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSavingPlanOrderRequest(CreateSavingPlanOrderRequest source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.PrePayType != null) {
            this.PrePayType = new String(source.PrePayType);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.CommodityCode != null) {
            this.CommodityCode = new String(source.CommodityCode);
        }
        if (source.PromiseUseAmount != null) {
            this.PromiseUseAmount = new Long(source.PromiseUseAmount);
        }
        if (source.SpecifyEffectTime != null) {
            this.SpecifyEffectTime = new String(source.SpecifyEffectTime);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PrePayType", this.PrePayType);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "CommodityCode", this.CommodityCode);
        this.setParamSimple(map, prefix + "PromiseUseAmount", this.PromiseUseAmount);
        this.setParamSimple(map, prefix + "SpecifyEffectTime", this.SpecifyEffectTime);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

