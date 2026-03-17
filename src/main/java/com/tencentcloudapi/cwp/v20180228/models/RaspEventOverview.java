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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspEventOverview extends AbstractModel {

    /**
    * 可防御漏洞数
    */
    @SerializedName("DefenceVuls")
    @Expose
    private Long DefenceVuls;

    /**
    * 可精准防御漏洞数
    */
    @SerializedName("PreciseDefenseVuls")
    @Expose
    private Long PreciseDefenseVuls;

    /**
    * 未处理的应用防御事件数
    */
    @SerializedName("UnhandledRaspEvents")
    @Expose
    private Long UnhandledRaspEvents;

    /**
    * 未处理的内存马扫描事件数
    */
    @SerializedName("UnhandledMemShellScanEvents")
    @Expose
    private Long UnhandledMemShellScanEvents;

    /**
    * 未处理的内存马注入事件数
    */
    @SerializedName("UnhandledMemShellInjectEvents")
    @Expose
    private Long UnhandledMemShellInjectEvents;

    /**
    * 每日未处理事件趋势
    */
    @SerializedName("UnHandledEvents")
    @Expose
    private Long [] UnHandledEvents;

    /**
    * 每日漏洞检测事件趋势
    */
    @SerializedName("RaspAttackCounts")
    @Expose
    private Long [] RaspAttackCounts;

    /**
    * 每日漏洞防御事件趋势
    */
    @SerializedName("RaspDefendCounts")
    @Expose
    private Long [] RaspDefendCounts;

    /**
    * 每日内存马检测事件趋势
    */
    @SerializedName("MemShellAttackCounts")
    @Expose
    private Long [] MemShellAttackCounts;

    /**
    * 每日内存马防御事件趋势
    */
    @SerializedName("MemShellDefendCounts")
    @Expose
    private Long [] MemShellDefendCounts;

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String [] Date;

    /**
    * 开通RASP防护开关资产数
    */
    @SerializedName("ProtectAssetOpenCount")
    @Expose
    private Long ProtectAssetOpenCount;

    /**
    * 全部资产数
    */
    @SerializedName("ProtectAssetCount")
    @Expose
    private Long ProtectAssetCount;

    /**
    * 绑定了旗舰版的资产防护数
    */
    @SerializedName("UltimateAssetCount")
    @Expose
    private Long UltimateAssetCount;

    /**
    * 绑定了重保防护包的资产数
    */
    @SerializedName("RaspAssetCount")
    @Expose
    private Long RaspAssetCount;

    /**
    * 未授权的资产数
    */
    @SerializedName("NotProtectAssetCount")
    @Expose
    private Long NotProtectAssetCount;

    /**
    * 近7天未处理事件数
    */
    @SerializedName("RecentUnhandledEvents")
    @Expose
    private Long RecentUnhandledEvents;

    /**
    * 防御成功的总次数
    */
    @SerializedName("RaspDefendCount")
    @Expose
    private Long RaspDefendCount;

    /**
     * Get 可防御漏洞数 
     * @return DefenceVuls 可防御漏洞数
     */
    public Long getDefenceVuls() {
        return this.DefenceVuls;
    }

    /**
     * Set 可防御漏洞数
     * @param DefenceVuls 可防御漏洞数
     */
    public void setDefenceVuls(Long DefenceVuls) {
        this.DefenceVuls = DefenceVuls;
    }

    /**
     * Get 可精准防御漏洞数 
     * @return PreciseDefenseVuls 可精准防御漏洞数
     */
    public Long getPreciseDefenseVuls() {
        return this.PreciseDefenseVuls;
    }

    /**
     * Set 可精准防御漏洞数
     * @param PreciseDefenseVuls 可精准防御漏洞数
     */
    public void setPreciseDefenseVuls(Long PreciseDefenseVuls) {
        this.PreciseDefenseVuls = PreciseDefenseVuls;
    }

    /**
     * Get 未处理的应用防御事件数 
     * @return UnhandledRaspEvents 未处理的应用防御事件数
     */
    public Long getUnhandledRaspEvents() {
        return this.UnhandledRaspEvents;
    }

    /**
     * Set 未处理的应用防御事件数
     * @param UnhandledRaspEvents 未处理的应用防御事件数
     */
    public void setUnhandledRaspEvents(Long UnhandledRaspEvents) {
        this.UnhandledRaspEvents = UnhandledRaspEvents;
    }

    /**
     * Get 未处理的内存马扫描事件数 
     * @return UnhandledMemShellScanEvents 未处理的内存马扫描事件数
     */
    public Long getUnhandledMemShellScanEvents() {
        return this.UnhandledMemShellScanEvents;
    }

    /**
     * Set 未处理的内存马扫描事件数
     * @param UnhandledMemShellScanEvents 未处理的内存马扫描事件数
     */
    public void setUnhandledMemShellScanEvents(Long UnhandledMemShellScanEvents) {
        this.UnhandledMemShellScanEvents = UnhandledMemShellScanEvents;
    }

    /**
     * Get 未处理的内存马注入事件数 
     * @return UnhandledMemShellInjectEvents 未处理的内存马注入事件数
     */
    public Long getUnhandledMemShellInjectEvents() {
        return this.UnhandledMemShellInjectEvents;
    }

    /**
     * Set 未处理的内存马注入事件数
     * @param UnhandledMemShellInjectEvents 未处理的内存马注入事件数
     */
    public void setUnhandledMemShellInjectEvents(Long UnhandledMemShellInjectEvents) {
        this.UnhandledMemShellInjectEvents = UnhandledMemShellInjectEvents;
    }

    /**
     * Get 每日未处理事件趋势 
     * @return UnHandledEvents 每日未处理事件趋势
     */
    public Long [] getUnHandledEvents() {
        return this.UnHandledEvents;
    }

    /**
     * Set 每日未处理事件趋势
     * @param UnHandledEvents 每日未处理事件趋势
     */
    public void setUnHandledEvents(Long [] UnHandledEvents) {
        this.UnHandledEvents = UnHandledEvents;
    }

    /**
     * Get 每日漏洞检测事件趋势 
     * @return RaspAttackCounts 每日漏洞检测事件趋势
     */
    public Long [] getRaspAttackCounts() {
        return this.RaspAttackCounts;
    }

    /**
     * Set 每日漏洞检测事件趋势
     * @param RaspAttackCounts 每日漏洞检测事件趋势
     */
    public void setRaspAttackCounts(Long [] RaspAttackCounts) {
        this.RaspAttackCounts = RaspAttackCounts;
    }

    /**
     * Get 每日漏洞防御事件趋势 
     * @return RaspDefendCounts 每日漏洞防御事件趋势
     */
    public Long [] getRaspDefendCounts() {
        return this.RaspDefendCounts;
    }

    /**
     * Set 每日漏洞防御事件趋势
     * @param RaspDefendCounts 每日漏洞防御事件趋势
     */
    public void setRaspDefendCounts(Long [] RaspDefendCounts) {
        this.RaspDefendCounts = RaspDefendCounts;
    }

    /**
     * Get 每日内存马检测事件趋势 
     * @return MemShellAttackCounts 每日内存马检测事件趋势
     */
    public Long [] getMemShellAttackCounts() {
        return this.MemShellAttackCounts;
    }

    /**
     * Set 每日内存马检测事件趋势
     * @param MemShellAttackCounts 每日内存马检测事件趋势
     */
    public void setMemShellAttackCounts(Long [] MemShellAttackCounts) {
        this.MemShellAttackCounts = MemShellAttackCounts;
    }

    /**
     * Get 每日内存马防御事件趋势 
     * @return MemShellDefendCounts 每日内存马防御事件趋势
     */
    public Long [] getMemShellDefendCounts() {
        return this.MemShellDefendCounts;
    }

    /**
     * Set 每日内存马防御事件趋势
     * @param MemShellDefendCounts 每日内存马防御事件趋势
     */
    public void setMemShellDefendCounts(Long [] MemShellDefendCounts) {
        this.MemShellDefendCounts = MemShellDefendCounts;
    }

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String [] getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String [] Date) {
        this.Date = Date;
    }

    /**
     * Get 开通RASP防护开关资产数 
     * @return ProtectAssetOpenCount 开通RASP防护开关资产数
     */
    public Long getProtectAssetOpenCount() {
        return this.ProtectAssetOpenCount;
    }

    /**
     * Set 开通RASP防护开关资产数
     * @param ProtectAssetOpenCount 开通RASP防护开关资产数
     */
    public void setProtectAssetOpenCount(Long ProtectAssetOpenCount) {
        this.ProtectAssetOpenCount = ProtectAssetOpenCount;
    }

    /**
     * Get 全部资产数 
     * @return ProtectAssetCount 全部资产数
     */
    public Long getProtectAssetCount() {
        return this.ProtectAssetCount;
    }

    /**
     * Set 全部资产数
     * @param ProtectAssetCount 全部资产数
     */
    public void setProtectAssetCount(Long ProtectAssetCount) {
        this.ProtectAssetCount = ProtectAssetCount;
    }

    /**
     * Get 绑定了旗舰版的资产防护数 
     * @return UltimateAssetCount 绑定了旗舰版的资产防护数
     */
    public Long getUltimateAssetCount() {
        return this.UltimateAssetCount;
    }

    /**
     * Set 绑定了旗舰版的资产防护数
     * @param UltimateAssetCount 绑定了旗舰版的资产防护数
     */
    public void setUltimateAssetCount(Long UltimateAssetCount) {
        this.UltimateAssetCount = UltimateAssetCount;
    }

    /**
     * Get 绑定了重保防护包的资产数 
     * @return RaspAssetCount 绑定了重保防护包的资产数
     */
    public Long getRaspAssetCount() {
        return this.RaspAssetCount;
    }

    /**
     * Set 绑定了重保防护包的资产数
     * @param RaspAssetCount 绑定了重保防护包的资产数
     */
    public void setRaspAssetCount(Long RaspAssetCount) {
        this.RaspAssetCount = RaspAssetCount;
    }

    /**
     * Get 未授权的资产数 
     * @return NotProtectAssetCount 未授权的资产数
     */
    public Long getNotProtectAssetCount() {
        return this.NotProtectAssetCount;
    }

    /**
     * Set 未授权的资产数
     * @param NotProtectAssetCount 未授权的资产数
     */
    public void setNotProtectAssetCount(Long NotProtectAssetCount) {
        this.NotProtectAssetCount = NotProtectAssetCount;
    }

    /**
     * Get 近7天未处理事件数 
     * @return RecentUnhandledEvents 近7天未处理事件数
     */
    public Long getRecentUnhandledEvents() {
        return this.RecentUnhandledEvents;
    }

    /**
     * Set 近7天未处理事件数
     * @param RecentUnhandledEvents 近7天未处理事件数
     */
    public void setRecentUnhandledEvents(Long RecentUnhandledEvents) {
        this.RecentUnhandledEvents = RecentUnhandledEvents;
    }

    /**
     * Get 防御成功的总次数 
     * @return RaspDefendCount 防御成功的总次数
     */
    public Long getRaspDefendCount() {
        return this.RaspDefendCount;
    }

    /**
     * Set 防御成功的总次数
     * @param RaspDefendCount 防御成功的总次数
     */
    public void setRaspDefendCount(Long RaspDefendCount) {
        this.RaspDefendCount = RaspDefendCount;
    }

    public RaspEventOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspEventOverview(RaspEventOverview source) {
        if (source.DefenceVuls != null) {
            this.DefenceVuls = new Long(source.DefenceVuls);
        }
        if (source.PreciseDefenseVuls != null) {
            this.PreciseDefenseVuls = new Long(source.PreciseDefenseVuls);
        }
        if (source.UnhandledRaspEvents != null) {
            this.UnhandledRaspEvents = new Long(source.UnhandledRaspEvents);
        }
        if (source.UnhandledMemShellScanEvents != null) {
            this.UnhandledMemShellScanEvents = new Long(source.UnhandledMemShellScanEvents);
        }
        if (source.UnhandledMemShellInjectEvents != null) {
            this.UnhandledMemShellInjectEvents = new Long(source.UnhandledMemShellInjectEvents);
        }
        if (source.UnHandledEvents != null) {
            this.UnHandledEvents = new Long[source.UnHandledEvents.length];
            for (int i = 0; i < source.UnHandledEvents.length; i++) {
                this.UnHandledEvents[i] = new Long(source.UnHandledEvents[i]);
            }
        }
        if (source.RaspAttackCounts != null) {
            this.RaspAttackCounts = new Long[source.RaspAttackCounts.length];
            for (int i = 0; i < source.RaspAttackCounts.length; i++) {
                this.RaspAttackCounts[i] = new Long(source.RaspAttackCounts[i]);
            }
        }
        if (source.RaspDefendCounts != null) {
            this.RaspDefendCounts = new Long[source.RaspDefendCounts.length];
            for (int i = 0; i < source.RaspDefendCounts.length; i++) {
                this.RaspDefendCounts[i] = new Long(source.RaspDefendCounts[i]);
            }
        }
        if (source.MemShellAttackCounts != null) {
            this.MemShellAttackCounts = new Long[source.MemShellAttackCounts.length];
            for (int i = 0; i < source.MemShellAttackCounts.length; i++) {
                this.MemShellAttackCounts[i] = new Long(source.MemShellAttackCounts[i]);
            }
        }
        if (source.MemShellDefendCounts != null) {
            this.MemShellDefendCounts = new Long[source.MemShellDefendCounts.length];
            for (int i = 0; i < source.MemShellDefendCounts.length; i++) {
                this.MemShellDefendCounts[i] = new Long(source.MemShellDefendCounts[i]);
            }
        }
        if (source.Date != null) {
            this.Date = new String[source.Date.length];
            for (int i = 0; i < source.Date.length; i++) {
                this.Date[i] = new String(source.Date[i]);
            }
        }
        if (source.ProtectAssetOpenCount != null) {
            this.ProtectAssetOpenCount = new Long(source.ProtectAssetOpenCount);
        }
        if (source.ProtectAssetCount != null) {
            this.ProtectAssetCount = new Long(source.ProtectAssetCount);
        }
        if (source.UltimateAssetCount != null) {
            this.UltimateAssetCount = new Long(source.UltimateAssetCount);
        }
        if (source.RaspAssetCount != null) {
            this.RaspAssetCount = new Long(source.RaspAssetCount);
        }
        if (source.NotProtectAssetCount != null) {
            this.NotProtectAssetCount = new Long(source.NotProtectAssetCount);
        }
        if (source.RecentUnhandledEvents != null) {
            this.RecentUnhandledEvents = new Long(source.RecentUnhandledEvents);
        }
        if (source.RaspDefendCount != null) {
            this.RaspDefendCount = new Long(source.RaspDefendCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefenceVuls", this.DefenceVuls);
        this.setParamSimple(map, prefix + "PreciseDefenseVuls", this.PreciseDefenseVuls);
        this.setParamSimple(map, prefix + "UnhandledRaspEvents", this.UnhandledRaspEvents);
        this.setParamSimple(map, prefix + "UnhandledMemShellScanEvents", this.UnhandledMemShellScanEvents);
        this.setParamSimple(map, prefix + "UnhandledMemShellInjectEvents", this.UnhandledMemShellInjectEvents);
        this.setParamArraySimple(map, prefix + "UnHandledEvents.", this.UnHandledEvents);
        this.setParamArraySimple(map, prefix + "RaspAttackCounts.", this.RaspAttackCounts);
        this.setParamArraySimple(map, prefix + "RaspDefendCounts.", this.RaspDefendCounts);
        this.setParamArraySimple(map, prefix + "MemShellAttackCounts.", this.MemShellAttackCounts);
        this.setParamArraySimple(map, prefix + "MemShellDefendCounts.", this.MemShellDefendCounts);
        this.setParamArraySimple(map, prefix + "Date.", this.Date);
        this.setParamSimple(map, prefix + "ProtectAssetOpenCount", this.ProtectAssetOpenCount);
        this.setParamSimple(map, prefix + "ProtectAssetCount", this.ProtectAssetCount);
        this.setParamSimple(map, prefix + "UltimateAssetCount", this.UltimateAssetCount);
        this.setParamSimple(map, prefix + "RaspAssetCount", this.RaspAssetCount);
        this.setParamSimple(map, prefix + "NotProtectAssetCount", this.NotProtectAssetCount);
        this.setParamSimple(map, prefix + "RecentUnhandledEvents", this.RecentUnhandledEvents);
        this.setParamSimple(map, prefix + "RaspDefendCount", this.RaspDefendCount);

    }
}

