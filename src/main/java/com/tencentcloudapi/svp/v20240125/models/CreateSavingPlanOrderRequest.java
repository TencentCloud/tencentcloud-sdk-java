/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * <p>地域编码</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>区域编码</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>预付费类型</p><p>枚举值：</p><ul><li>1： 全预费</li><li>2： 部分预付</li><li>3： 不预付</li></ul>
    */
    @SerializedName("PrePayType")
    @Expose
    private String PrePayType;

    /**
    * <p>时长</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>时长单位</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>商品唯一标识</p>
    */
    @SerializedName("CommodityCode")
    @Expose
    private String CommodityCode;

    /**
    * <p>承诺时长内的小额金额（单位：元）</p>
    */
    @SerializedName("PromiseUseAmount")
    @Expose
    private Long PromiseUseAmount;

    /**
    * <p>节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:&quot;2023-10-01 00:00:00&quot;，仅支持指定日期的0点时刻</p>
    */
    @SerializedName("SpecifyEffectTime")
    @Expose
    private String SpecifyEffectTime;

    /**
    * <p>可重入ID</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>节省计划结算类型</p><p>枚举值：</p><ul><li>1： 小时结算包</li><li>2： 日结算包</li><li>3： 月结算包</li></ul><p>默认值：1</p><p>不填写是默认是小时结算包</p>
    */
    @SerializedName("CommitmentPeriod")
    @Expose
    private Long CommitmentPeriod;

    /**
     * Get <p>地域编码</p> 
     * @return RegionId <p>地域编码</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域编码</p>
     * @param RegionId <p>地域编码</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>区域编码</p> 
     * @return ZoneId <p>区域编码</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>区域编码</p>
     * @param ZoneId <p>区域编码</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>预付费类型</p><p>枚举值：</p><ul><li>1： 全预费</li><li>2： 部分预付</li><li>3： 不预付</li></ul> 
     * @return PrePayType <p>预付费类型</p><p>枚举值：</p><ul><li>1： 全预费</li><li>2： 部分预付</li><li>3： 不预付</li></ul>
     */
    public String getPrePayType() {
        return this.PrePayType;
    }

    /**
     * Set <p>预付费类型</p><p>枚举值：</p><ul><li>1： 全预费</li><li>2： 部分预付</li><li>3： 不预付</li></ul>
     * @param PrePayType <p>预付费类型</p><p>枚举值：</p><ul><li>1： 全预费</li><li>2： 部分预付</li><li>3： 不预付</li></ul>
     */
    public void setPrePayType(String PrePayType) {
        this.PrePayType = PrePayType;
    }

    /**
     * Get <p>时长</p> 
     * @return TimeSpan <p>时长</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>时长</p>
     * @param TimeSpan <p>时长</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>时长单位</p> 
     * @return TimeUnit <p>时长单位</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>时长单位</p>
     * @param TimeUnit <p>时长单位</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>商品唯一标识</p> 
     * @return CommodityCode <p>商品唯一标识</p>
     */
    public String getCommodityCode() {
        return this.CommodityCode;
    }

    /**
     * Set <p>商品唯一标识</p>
     * @param CommodityCode <p>商品唯一标识</p>
     */
    public void setCommodityCode(String CommodityCode) {
        this.CommodityCode = CommodityCode;
    }

    /**
     * Get <p>承诺时长内的小额金额（单位：元）</p> 
     * @return PromiseUseAmount <p>承诺时长内的小额金额（单位：元）</p>
     */
    public Long getPromiseUseAmount() {
        return this.PromiseUseAmount;
    }

    /**
     * Set <p>承诺时长内的小额金额（单位：元）</p>
     * @param PromiseUseAmount <p>承诺时长内的小额金额（单位：元）</p>
     */
    public void setPromiseUseAmount(Long PromiseUseAmount) {
        this.PromiseUseAmount = PromiseUseAmount;
    }

    /**
     * Get <p>节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:&quot;2023-10-01 00:00:00&quot;，仅支持指定日期的0点时刻</p> 
     * @return SpecifyEffectTime <p>节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:&quot;2023-10-01 00:00:00&quot;，仅支持指定日期的0点时刻</p>
     */
    public String getSpecifyEffectTime() {
        return this.SpecifyEffectTime;
    }

    /**
     * Set <p>节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:&quot;2023-10-01 00:00:00&quot;，仅支持指定日期的0点时刻</p>
     * @param SpecifyEffectTime <p>节省计划的指定生效时间，若不传则为当前下单时间。传参数格式:&quot;2023-10-01 00:00:00&quot;，仅支持指定日期的0点时刻</p>
     */
    public void setSpecifyEffectTime(String SpecifyEffectTime) {
        this.SpecifyEffectTime = SpecifyEffectTime;
    }

    /**
     * Get <p>可重入ID</p> 
     * @return ClientToken <p>可重入ID</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>可重入ID</p>
     * @param ClientToken <p>可重入ID</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>节省计划结算类型</p><p>枚举值：</p><ul><li>1： 小时结算包</li><li>2： 日结算包</li><li>3： 月结算包</li></ul><p>默认值：1</p><p>不填写是默认是小时结算包</p> 
     * @return CommitmentPeriod <p>节省计划结算类型</p><p>枚举值：</p><ul><li>1： 小时结算包</li><li>2： 日结算包</li><li>3： 月结算包</li></ul><p>默认值：1</p><p>不填写是默认是小时结算包</p>
     */
    public Long getCommitmentPeriod() {
        return this.CommitmentPeriod;
    }

    /**
     * Set <p>节省计划结算类型</p><p>枚举值：</p><ul><li>1： 小时结算包</li><li>2： 日结算包</li><li>3： 月结算包</li></ul><p>默认值：1</p><p>不填写是默认是小时结算包</p>
     * @param CommitmentPeriod <p>节省计划结算类型</p><p>枚举值：</p><ul><li>1： 小时结算包</li><li>2： 日结算包</li><li>3： 月结算包</li></ul><p>默认值：1</p><p>不填写是默认是小时结算包</p>
     */
    public void setCommitmentPeriod(Long CommitmentPeriod) {
        this.CommitmentPeriod = CommitmentPeriod;
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
        if (source.CommitmentPeriod != null) {
            this.CommitmentPeriod = new Long(source.CommitmentPeriod);
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
        this.setParamSimple(map, prefix + "CommitmentPeriod", this.CommitmentPeriod);

    }
}

