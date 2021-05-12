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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationDataStatistics extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * Dau统计项数目
    */
    @SerializedName("DauDataNum")
    @Expose
    private Long DauDataNum;

    /**
    * 大陆地区Dau统计数据，单位人
    */
    @SerializedName("DauDataMainland")
    @Expose
    private StatisticsItem [] DauDataMainland;

    /**
    * 海外地区Dau统计数据，单位人
    */
    @SerializedName("DauDataOversea")
    @Expose
    private StatisticsItem [] DauDataOversea;

    /**
    * 大陆和海外地区Dau统计数据汇总，单位人
    */
    @SerializedName("DauDataSum")
    @Expose
    private StatisticsItem [] DauDataSum;

    /**
    * 实时语音时长统计项数目
    */
    @SerializedName("DurationDataNum")
    @Expose
    private Long DurationDataNum;

    /**
    * 大陆地区实时语音时长统计数据，单位分钟
    */
    @SerializedName("DurationDataMainland")
    @Expose
    private StatisticsItem [] DurationDataMainland;

    /**
    * 海外地区实时语音时长统计数据，单位分钟
    */
    @SerializedName("DurationDataOversea")
    @Expose
    private StatisticsItem [] DurationDataOversea;

    /**
    * 大陆和海外地区实时语音时长统计数据汇总，单位分钟
    */
    @SerializedName("DurationDataSum")
    @Expose
    private StatisticsItem [] DurationDataSum;

    /**
    * Pcu统计项数目
    */
    @SerializedName("PcuDataNum")
    @Expose
    private Long PcuDataNum;

    /**
    * 大陆地区Pcu统计数据，单位人
    */
    @SerializedName("PcuDataMainland")
    @Expose
    private StatisticsItem [] PcuDataMainland;

    /**
    * 海外地区Pcu统计数据，单位人
    */
    @SerializedName("PcuDataOversea")
    @Expose
    private StatisticsItem [] PcuDataOversea;

    /**
    * 大陆和海外地区Pcu统计数据汇总，单位人
    */
    @SerializedName("PcuDataSum")
    @Expose
    private StatisticsItem [] PcuDataSum;

    /**
     * Get 应用ID 
     * @return BizId 应用ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID
     * @param BizId 应用ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get Dau统计项数目 
     * @return DauDataNum Dau统计项数目
     */
    public Long getDauDataNum() {
        return this.DauDataNum;
    }

    /**
     * Set Dau统计项数目
     * @param DauDataNum Dau统计项数目
     */
    public void setDauDataNum(Long DauDataNum) {
        this.DauDataNum = DauDataNum;
    }

    /**
     * Get 大陆地区Dau统计数据，单位人 
     * @return DauDataMainland 大陆地区Dau统计数据，单位人
     */
    public StatisticsItem [] getDauDataMainland() {
        return this.DauDataMainland;
    }

    /**
     * Set 大陆地区Dau统计数据，单位人
     * @param DauDataMainland 大陆地区Dau统计数据，单位人
     */
    public void setDauDataMainland(StatisticsItem [] DauDataMainland) {
        this.DauDataMainland = DauDataMainland;
    }

    /**
     * Get 海外地区Dau统计数据，单位人 
     * @return DauDataOversea 海外地区Dau统计数据，单位人
     */
    public StatisticsItem [] getDauDataOversea() {
        return this.DauDataOversea;
    }

    /**
     * Set 海外地区Dau统计数据，单位人
     * @param DauDataOversea 海外地区Dau统计数据，单位人
     */
    public void setDauDataOversea(StatisticsItem [] DauDataOversea) {
        this.DauDataOversea = DauDataOversea;
    }

    /**
     * Get 大陆和海外地区Dau统计数据汇总，单位人 
     * @return DauDataSum 大陆和海外地区Dau统计数据汇总，单位人
     */
    public StatisticsItem [] getDauDataSum() {
        return this.DauDataSum;
    }

    /**
     * Set 大陆和海外地区Dau统计数据汇总，单位人
     * @param DauDataSum 大陆和海外地区Dau统计数据汇总，单位人
     */
    public void setDauDataSum(StatisticsItem [] DauDataSum) {
        this.DauDataSum = DauDataSum;
    }

    /**
     * Get 实时语音时长统计项数目 
     * @return DurationDataNum 实时语音时长统计项数目
     */
    public Long getDurationDataNum() {
        return this.DurationDataNum;
    }

    /**
     * Set 实时语音时长统计项数目
     * @param DurationDataNum 实时语音时长统计项数目
     */
    public void setDurationDataNum(Long DurationDataNum) {
        this.DurationDataNum = DurationDataNum;
    }

    /**
     * Get 大陆地区实时语音时长统计数据，单位分钟 
     * @return DurationDataMainland 大陆地区实时语音时长统计数据，单位分钟
     */
    public StatisticsItem [] getDurationDataMainland() {
        return this.DurationDataMainland;
    }

    /**
     * Set 大陆地区实时语音时长统计数据，单位分钟
     * @param DurationDataMainland 大陆地区实时语音时长统计数据，单位分钟
     */
    public void setDurationDataMainland(StatisticsItem [] DurationDataMainland) {
        this.DurationDataMainland = DurationDataMainland;
    }

    /**
     * Get 海外地区实时语音时长统计数据，单位分钟 
     * @return DurationDataOversea 海外地区实时语音时长统计数据，单位分钟
     */
    public StatisticsItem [] getDurationDataOversea() {
        return this.DurationDataOversea;
    }

    /**
     * Set 海外地区实时语音时长统计数据，单位分钟
     * @param DurationDataOversea 海外地区实时语音时长统计数据，单位分钟
     */
    public void setDurationDataOversea(StatisticsItem [] DurationDataOversea) {
        this.DurationDataOversea = DurationDataOversea;
    }

    /**
     * Get 大陆和海外地区实时语音时长统计数据汇总，单位分钟 
     * @return DurationDataSum 大陆和海外地区实时语音时长统计数据汇总，单位分钟
     */
    public StatisticsItem [] getDurationDataSum() {
        return this.DurationDataSum;
    }

    /**
     * Set 大陆和海外地区实时语音时长统计数据汇总，单位分钟
     * @param DurationDataSum 大陆和海外地区实时语音时长统计数据汇总，单位分钟
     */
    public void setDurationDataSum(StatisticsItem [] DurationDataSum) {
        this.DurationDataSum = DurationDataSum;
    }

    /**
     * Get Pcu统计项数目 
     * @return PcuDataNum Pcu统计项数目
     */
    public Long getPcuDataNum() {
        return this.PcuDataNum;
    }

    /**
     * Set Pcu统计项数目
     * @param PcuDataNum Pcu统计项数目
     */
    public void setPcuDataNum(Long PcuDataNum) {
        this.PcuDataNum = PcuDataNum;
    }

    /**
     * Get 大陆地区Pcu统计数据，单位人 
     * @return PcuDataMainland 大陆地区Pcu统计数据，单位人
     */
    public StatisticsItem [] getPcuDataMainland() {
        return this.PcuDataMainland;
    }

    /**
     * Set 大陆地区Pcu统计数据，单位人
     * @param PcuDataMainland 大陆地区Pcu统计数据，单位人
     */
    public void setPcuDataMainland(StatisticsItem [] PcuDataMainland) {
        this.PcuDataMainland = PcuDataMainland;
    }

    /**
     * Get 海外地区Pcu统计数据，单位人 
     * @return PcuDataOversea 海外地区Pcu统计数据，单位人
     */
    public StatisticsItem [] getPcuDataOversea() {
        return this.PcuDataOversea;
    }

    /**
     * Set 海外地区Pcu统计数据，单位人
     * @param PcuDataOversea 海外地区Pcu统计数据，单位人
     */
    public void setPcuDataOversea(StatisticsItem [] PcuDataOversea) {
        this.PcuDataOversea = PcuDataOversea;
    }

    /**
     * Get 大陆和海外地区Pcu统计数据汇总，单位人 
     * @return PcuDataSum 大陆和海外地区Pcu统计数据汇总，单位人
     */
    public StatisticsItem [] getPcuDataSum() {
        return this.PcuDataSum;
    }

    /**
     * Set 大陆和海外地区Pcu统计数据汇总，单位人
     * @param PcuDataSum 大陆和海外地区Pcu统计数据汇总，单位人
     */
    public void setPcuDataSum(StatisticsItem [] PcuDataSum) {
        this.PcuDataSum = PcuDataSum;
    }

    public ApplicationDataStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationDataStatistics(ApplicationDataStatistics source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.DauDataNum != null) {
            this.DauDataNum = new Long(source.DauDataNum);
        }
        if (source.DauDataMainland != null) {
            this.DauDataMainland = new StatisticsItem[source.DauDataMainland.length];
            for (int i = 0; i < source.DauDataMainland.length; i++) {
                this.DauDataMainland[i] = new StatisticsItem(source.DauDataMainland[i]);
            }
        }
        if (source.DauDataOversea != null) {
            this.DauDataOversea = new StatisticsItem[source.DauDataOversea.length];
            for (int i = 0; i < source.DauDataOversea.length; i++) {
                this.DauDataOversea[i] = new StatisticsItem(source.DauDataOversea[i]);
            }
        }
        if (source.DauDataSum != null) {
            this.DauDataSum = new StatisticsItem[source.DauDataSum.length];
            for (int i = 0; i < source.DauDataSum.length; i++) {
                this.DauDataSum[i] = new StatisticsItem(source.DauDataSum[i]);
            }
        }
        if (source.DurationDataNum != null) {
            this.DurationDataNum = new Long(source.DurationDataNum);
        }
        if (source.DurationDataMainland != null) {
            this.DurationDataMainland = new StatisticsItem[source.DurationDataMainland.length];
            for (int i = 0; i < source.DurationDataMainland.length; i++) {
                this.DurationDataMainland[i] = new StatisticsItem(source.DurationDataMainland[i]);
            }
        }
        if (source.DurationDataOversea != null) {
            this.DurationDataOversea = new StatisticsItem[source.DurationDataOversea.length];
            for (int i = 0; i < source.DurationDataOversea.length; i++) {
                this.DurationDataOversea[i] = new StatisticsItem(source.DurationDataOversea[i]);
            }
        }
        if (source.DurationDataSum != null) {
            this.DurationDataSum = new StatisticsItem[source.DurationDataSum.length];
            for (int i = 0; i < source.DurationDataSum.length; i++) {
                this.DurationDataSum[i] = new StatisticsItem(source.DurationDataSum[i]);
            }
        }
        if (source.PcuDataNum != null) {
            this.PcuDataNum = new Long(source.PcuDataNum);
        }
        if (source.PcuDataMainland != null) {
            this.PcuDataMainland = new StatisticsItem[source.PcuDataMainland.length];
            for (int i = 0; i < source.PcuDataMainland.length; i++) {
                this.PcuDataMainland[i] = new StatisticsItem(source.PcuDataMainland[i]);
            }
        }
        if (source.PcuDataOversea != null) {
            this.PcuDataOversea = new StatisticsItem[source.PcuDataOversea.length];
            for (int i = 0; i < source.PcuDataOversea.length; i++) {
                this.PcuDataOversea[i] = new StatisticsItem(source.PcuDataOversea[i]);
            }
        }
        if (source.PcuDataSum != null) {
            this.PcuDataSum = new StatisticsItem[source.PcuDataSum.length];
            for (int i = 0; i < source.PcuDataSum.length; i++) {
                this.PcuDataSum[i] = new StatisticsItem(source.PcuDataSum[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "DauDataNum", this.DauDataNum);
        this.setParamArrayObj(map, prefix + "DauDataMainland.", this.DauDataMainland);
        this.setParamArrayObj(map, prefix + "DauDataOversea.", this.DauDataOversea);
        this.setParamArrayObj(map, prefix + "DauDataSum.", this.DauDataSum);
        this.setParamSimple(map, prefix + "DurationDataNum", this.DurationDataNum);
        this.setParamArrayObj(map, prefix + "DurationDataMainland.", this.DurationDataMainland);
        this.setParamArrayObj(map, prefix + "DurationDataOversea.", this.DurationDataOversea);
        this.setParamArrayObj(map, prefix + "DurationDataSum.", this.DurationDataSum);
        this.setParamSimple(map, prefix + "PcuDataNum", this.PcuDataNum);
        this.setParamArrayObj(map, prefix + "PcuDataMainland.", this.PcuDataMainland);
        this.setParamArrayObj(map, prefix + "PcuDataOversea.", this.PcuDataOversea);
        this.setParamArrayObj(map, prefix + "PcuDataSum.", this.PcuDataSum);

    }
}

