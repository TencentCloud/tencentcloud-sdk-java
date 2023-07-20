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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenTaskInfo extends AbstractModel{

    /**
    * 统计标示 0：全部、1：当前天、2：昨天
    */
    @SerializedName("CountTag")
    @Expose
    private Long CountTag;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 运行中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningNum")
    @Expose
    private Long RunningNum;

    /**
    * 停止中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppingNum")
    @Expose
    private Long StoppingNum;

    /**
    * 已停止
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppedNum")
    @Expose
    private Long StoppedNum;

    /**
    * 暂停
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenNum")
    @Expose
    private Long FrozenNum;

    /**
    * 年任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YearNum")
    @Expose
    private Long YearNum;

    /**
    * 月任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonthNum")
    @Expose
    private Long MonthNum;

    /**
    * 周任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeekNum")
    @Expose
    private Long WeekNum;

    /**
    * 天任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayNum")
    @Expose
    private Long DayNum;

    /**
    * 小时任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HourNum")
    @Expose
    private Long HourNum;

    /**
    * 分钟任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinuteNum")
    @Expose
    private Long MinuteNum;

    /**
     * Get 统计标示 0：全部、1：当前天、2：昨天 
     * @return CountTag 统计标示 0：全部、1：当前天、2：昨天
     */
    public Long getCountTag() {
        return this.CountTag;
    }

    /**
     * Set 统计标示 0：全部、1：当前天、2：昨天
     * @param CountTag 统计标示 0：全部、1：当前天、2：昨天
     */
    public void setCountTag(Long CountTag) {
        this.CountTag = CountTag;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNum 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNum 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 运行中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningNum 运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningNum() {
        return this.RunningNum;
    }

    /**
     * Set 运行中
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningNum 运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningNum(Long RunningNum) {
        this.RunningNum = RunningNum;
    }

    /**
     * Get 停止中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppingNum 停止中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoppingNum() {
        return this.StoppingNum;
    }

    /**
     * Set 停止中
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppingNum 停止中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppingNum(Long StoppingNum) {
        this.StoppingNum = StoppingNum;
    }

    /**
     * Get 已停止
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppedNum 已停止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoppedNum() {
        return this.StoppedNum;
    }

    /**
     * Set 已停止
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppedNum 已停止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppedNum(Long StoppedNum) {
        this.StoppedNum = StoppedNum;
    }

    /**
     * Get 暂停
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenNum 暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenNum() {
        return this.FrozenNum;
    }

    /**
     * Set 暂停
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenNum 暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenNum(Long FrozenNum) {
        this.FrozenNum = FrozenNum;
    }

    /**
     * Get 年任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YearNum 年任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getYearNum() {
        return this.YearNum;
    }

    /**
     * Set 年任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param YearNum 年任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYearNum(Long YearNum) {
        this.YearNum = YearNum;
    }

    /**
     * Get 月任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonthNum 月任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonthNum() {
        return this.MonthNum;
    }

    /**
     * Set 月任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonthNum 月任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonthNum(Long MonthNum) {
        this.MonthNum = MonthNum;
    }

    /**
     * Get 周任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeekNum 周任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeekNum() {
        return this.WeekNum;
    }

    /**
     * Set 周任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeekNum 周任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekNum(Long WeekNum) {
        this.WeekNum = WeekNum;
    }

    /**
     * Get 天任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayNum 天任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDayNum() {
        return this.DayNum;
    }

    /**
     * Set 天任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayNum 天任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayNum(Long DayNum) {
        this.DayNum = DayNum;
    }

    /**
     * Get 小时任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HourNum 小时任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHourNum() {
        return this.HourNum;
    }

    /**
     * Set 小时任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param HourNum 小时任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHourNum(Long HourNum) {
        this.HourNum = HourNum;
    }

    /**
     * Get 分钟任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinuteNum 分钟任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinuteNum() {
        return this.MinuteNum;
    }

    /**
     * Set 分钟任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinuteNum 分钟任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinuteNum(Long MinuteNum) {
        this.MinuteNum = MinuteNum;
    }

    public ScreenTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenTaskInfo(ScreenTaskInfo source) {
        if (source.CountTag != null) {
            this.CountTag = new Long(source.CountTag);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RunningNum != null) {
            this.RunningNum = new Long(source.RunningNum);
        }
        if (source.StoppingNum != null) {
            this.StoppingNum = new Long(source.StoppingNum);
        }
        if (source.StoppedNum != null) {
            this.StoppedNum = new Long(source.StoppedNum);
        }
        if (source.FrozenNum != null) {
            this.FrozenNum = new Long(source.FrozenNum);
        }
        if (source.YearNum != null) {
            this.YearNum = new Long(source.YearNum);
        }
        if (source.MonthNum != null) {
            this.MonthNum = new Long(source.MonthNum);
        }
        if (source.WeekNum != null) {
            this.WeekNum = new Long(source.WeekNum);
        }
        if (source.DayNum != null) {
            this.DayNum = new Long(source.DayNum);
        }
        if (source.HourNum != null) {
            this.HourNum = new Long(source.HourNum);
        }
        if (source.MinuteNum != null) {
            this.MinuteNum = new Long(source.MinuteNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountTag", this.CountTag);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RunningNum", this.RunningNum);
        this.setParamSimple(map, prefix + "StoppingNum", this.StoppingNum);
        this.setParamSimple(map, prefix + "StoppedNum", this.StoppedNum);
        this.setParamSimple(map, prefix + "FrozenNum", this.FrozenNum);
        this.setParamSimple(map, prefix + "YearNum", this.YearNum);
        this.setParamSimple(map, prefix + "MonthNum", this.MonthNum);
        this.setParamSimple(map, prefix + "WeekNum", this.WeekNum);
        this.setParamSimple(map, prefix + "DayNum", this.DayNum);
        this.setParamSimple(map, prefix + "HourNum", this.HourNum);
        this.setParamSimple(map, prefix + "MinuteNum", this.MinuteNum);

    }
}

