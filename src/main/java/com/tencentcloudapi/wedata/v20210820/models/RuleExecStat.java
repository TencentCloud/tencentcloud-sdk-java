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

public class RuleExecStat extends AbstractModel{

    /**
    * 规则运行总数
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 环比规则运行总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTotalCnt")
    @Expose
    private Long LastTotalCnt;

    /**
    * 规则运行总数占比
    */
    @SerializedName("TotalCntRatio")
    @Expose
    private Float TotalCntRatio;

    /**
    * 规则运行总数环比变化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTotalCntRatio")
    @Expose
    private Float LastTotalCntRatio;

    /**
    * 规则触发数
    */
    @SerializedName("TriggerCnt")
    @Expose
    private Long TriggerCnt;

    /**
    * 环比规则触发数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTriggerCnt")
    @Expose
    private Long LastTriggerCnt;

    /**
    * 触发占总数占比
    */
    @SerializedName("TriggerCntRatio")
    @Expose
    private Float TriggerCntRatio;

    /**
    * 环比规则触发数变化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTriggerCntRatio")
    @Expose
    private Float LastTriggerCntRatio;

    /**
    * 规则报警数
    */
    @SerializedName("AlarmCnt")
    @Expose
    private Long AlarmCnt;

    /**
    * 环比规则报警数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastAlarmCnt")
    @Expose
    private Long LastAlarmCnt;

    /**
    * 报警占总数占比
    */
    @SerializedName("AlarmCntRatio")
    @Expose
    private Float AlarmCntRatio;

    /**
    * 环比报警数变化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastAlarmCntRatio")
    @Expose
    private Float LastAlarmCntRatio;

    /**
    * 阻塞发生数
    */
    @SerializedName("PipelineCnt")
    @Expose
    private Long PipelineCnt;

    /**
    * 环比阻塞发生数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastPipelineCnt")
    @Expose
    private Long LastPipelineCnt;

    /**
    * 阻塞占总数占比
    */
    @SerializedName("PipelineCntRatio")
    @Expose
    private Float PipelineCntRatio;

    /**
    * 环比阻塞发生数变化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastPipelineCntRatio")
    @Expose
    private Float LastPipelineCntRatio;

    /**
     * Get 规则运行总数 
     * @return TotalCnt 规则运行总数
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 规则运行总数
     * @param TotalCnt 规则运行总数
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 环比规则运行总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTotalCnt 环比规则运行总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastTotalCnt() {
        return this.LastTotalCnt;
    }

    /**
     * Set 环比规则运行总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTotalCnt 环比规则运行总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTotalCnt(Long LastTotalCnt) {
        this.LastTotalCnt = LastTotalCnt;
    }

    /**
     * Get 规则运行总数占比 
     * @return TotalCntRatio 规则运行总数占比
     */
    public Float getTotalCntRatio() {
        return this.TotalCntRatio;
    }

    /**
     * Set 规则运行总数占比
     * @param TotalCntRatio 规则运行总数占比
     */
    public void setTotalCntRatio(Float TotalCntRatio) {
        this.TotalCntRatio = TotalCntRatio;
    }

    /**
     * Get 规则运行总数环比变化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTotalCntRatio 规则运行总数环比变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLastTotalCntRatio() {
        return this.LastTotalCntRatio;
    }

    /**
     * Set 规则运行总数环比变化
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTotalCntRatio 规则运行总数环比变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTotalCntRatio(Float LastTotalCntRatio) {
        this.LastTotalCntRatio = LastTotalCntRatio;
    }

    /**
     * Get 规则触发数 
     * @return TriggerCnt 规则触发数
     */
    public Long getTriggerCnt() {
        return this.TriggerCnt;
    }

    /**
     * Set 规则触发数
     * @param TriggerCnt 规则触发数
     */
    public void setTriggerCnt(Long TriggerCnt) {
        this.TriggerCnt = TriggerCnt;
    }

    /**
     * Get 环比规则触发数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTriggerCnt 环比规则触发数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastTriggerCnt() {
        return this.LastTriggerCnt;
    }

    /**
     * Set 环比规则触发数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTriggerCnt 环比规则触发数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTriggerCnt(Long LastTriggerCnt) {
        this.LastTriggerCnt = LastTriggerCnt;
    }

    /**
     * Get 触发占总数占比 
     * @return TriggerCntRatio 触发占总数占比
     */
    public Float getTriggerCntRatio() {
        return this.TriggerCntRatio;
    }

    /**
     * Set 触发占总数占比
     * @param TriggerCntRatio 触发占总数占比
     */
    public void setTriggerCntRatio(Float TriggerCntRatio) {
        this.TriggerCntRatio = TriggerCntRatio;
    }

    /**
     * Get 环比规则触发数变化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTriggerCntRatio 环比规则触发数变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLastTriggerCntRatio() {
        return this.LastTriggerCntRatio;
    }

    /**
     * Set 环比规则触发数变化
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTriggerCntRatio 环比规则触发数变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTriggerCntRatio(Float LastTriggerCntRatio) {
        this.LastTriggerCntRatio = LastTriggerCntRatio;
    }

    /**
     * Get 规则报警数 
     * @return AlarmCnt 规则报警数
     */
    public Long getAlarmCnt() {
        return this.AlarmCnt;
    }

    /**
     * Set 规则报警数
     * @param AlarmCnt 规则报警数
     */
    public void setAlarmCnt(Long AlarmCnt) {
        this.AlarmCnt = AlarmCnt;
    }

    /**
     * Get 环比规则报警数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastAlarmCnt 环比规则报警数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastAlarmCnt() {
        return this.LastAlarmCnt;
    }

    /**
     * Set 环比规则报警数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastAlarmCnt 环比规则报警数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastAlarmCnt(Long LastAlarmCnt) {
        this.LastAlarmCnt = LastAlarmCnt;
    }

    /**
     * Get 报警占总数占比 
     * @return AlarmCntRatio 报警占总数占比
     */
    public Float getAlarmCntRatio() {
        return this.AlarmCntRatio;
    }

    /**
     * Set 报警占总数占比
     * @param AlarmCntRatio 报警占总数占比
     */
    public void setAlarmCntRatio(Float AlarmCntRatio) {
        this.AlarmCntRatio = AlarmCntRatio;
    }

    /**
     * Get 环比报警数变化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastAlarmCntRatio 环比报警数变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLastAlarmCntRatio() {
        return this.LastAlarmCntRatio;
    }

    /**
     * Set 环比报警数变化
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastAlarmCntRatio 环比报警数变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastAlarmCntRatio(Float LastAlarmCntRatio) {
        this.LastAlarmCntRatio = LastAlarmCntRatio;
    }

    /**
     * Get 阻塞发生数 
     * @return PipelineCnt 阻塞发生数
     */
    public Long getPipelineCnt() {
        return this.PipelineCnt;
    }

    /**
     * Set 阻塞发生数
     * @param PipelineCnt 阻塞发生数
     */
    public void setPipelineCnt(Long PipelineCnt) {
        this.PipelineCnt = PipelineCnt;
    }

    /**
     * Get 环比阻塞发生数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastPipelineCnt 环比阻塞发生数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastPipelineCnt() {
        return this.LastPipelineCnt;
    }

    /**
     * Set 环比阻塞发生数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastPipelineCnt 环比阻塞发生数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastPipelineCnt(Long LastPipelineCnt) {
        this.LastPipelineCnt = LastPipelineCnt;
    }

    /**
     * Get 阻塞占总数占比 
     * @return PipelineCntRatio 阻塞占总数占比
     */
    public Float getPipelineCntRatio() {
        return this.PipelineCntRatio;
    }

    /**
     * Set 阻塞占总数占比
     * @param PipelineCntRatio 阻塞占总数占比
     */
    public void setPipelineCntRatio(Float PipelineCntRatio) {
        this.PipelineCntRatio = PipelineCntRatio;
    }

    /**
     * Get 环比阻塞发生数变化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastPipelineCntRatio 环比阻塞发生数变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLastPipelineCntRatio() {
        return this.LastPipelineCntRatio;
    }

    /**
     * Set 环比阻塞发生数变化
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastPipelineCntRatio 环比阻塞发生数变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastPipelineCntRatio(Float LastPipelineCntRatio) {
        this.LastPipelineCntRatio = LastPipelineCntRatio;
    }

    public RuleExecStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecStat(RuleExecStat source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.LastTotalCnt != null) {
            this.LastTotalCnt = new Long(source.LastTotalCnt);
        }
        if (source.TotalCntRatio != null) {
            this.TotalCntRatio = new Float(source.TotalCntRatio);
        }
        if (source.LastTotalCntRatio != null) {
            this.LastTotalCntRatio = new Float(source.LastTotalCntRatio);
        }
        if (source.TriggerCnt != null) {
            this.TriggerCnt = new Long(source.TriggerCnt);
        }
        if (source.LastTriggerCnt != null) {
            this.LastTriggerCnt = new Long(source.LastTriggerCnt);
        }
        if (source.TriggerCntRatio != null) {
            this.TriggerCntRatio = new Float(source.TriggerCntRatio);
        }
        if (source.LastTriggerCntRatio != null) {
            this.LastTriggerCntRatio = new Float(source.LastTriggerCntRatio);
        }
        if (source.AlarmCnt != null) {
            this.AlarmCnt = new Long(source.AlarmCnt);
        }
        if (source.LastAlarmCnt != null) {
            this.LastAlarmCnt = new Long(source.LastAlarmCnt);
        }
        if (source.AlarmCntRatio != null) {
            this.AlarmCntRatio = new Float(source.AlarmCntRatio);
        }
        if (source.LastAlarmCntRatio != null) {
            this.LastAlarmCntRatio = new Float(source.LastAlarmCntRatio);
        }
        if (source.PipelineCnt != null) {
            this.PipelineCnt = new Long(source.PipelineCnt);
        }
        if (source.LastPipelineCnt != null) {
            this.LastPipelineCnt = new Long(source.LastPipelineCnt);
        }
        if (source.PipelineCntRatio != null) {
            this.PipelineCntRatio = new Float(source.PipelineCntRatio);
        }
        if (source.LastPipelineCntRatio != null) {
            this.LastPipelineCntRatio = new Float(source.LastPipelineCntRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamSimple(map, prefix + "LastTotalCnt", this.LastTotalCnt);
        this.setParamSimple(map, prefix + "TotalCntRatio", this.TotalCntRatio);
        this.setParamSimple(map, prefix + "LastTotalCntRatio", this.LastTotalCntRatio);
        this.setParamSimple(map, prefix + "TriggerCnt", this.TriggerCnt);
        this.setParamSimple(map, prefix + "LastTriggerCnt", this.LastTriggerCnt);
        this.setParamSimple(map, prefix + "TriggerCntRatio", this.TriggerCntRatio);
        this.setParamSimple(map, prefix + "LastTriggerCntRatio", this.LastTriggerCntRatio);
        this.setParamSimple(map, prefix + "AlarmCnt", this.AlarmCnt);
        this.setParamSimple(map, prefix + "LastAlarmCnt", this.LastAlarmCnt);
        this.setParamSimple(map, prefix + "AlarmCntRatio", this.AlarmCntRatio);
        this.setParamSimple(map, prefix + "LastAlarmCntRatio", this.LastAlarmCntRatio);
        this.setParamSimple(map, prefix + "PipelineCnt", this.PipelineCnt);
        this.setParamSimple(map, prefix + "LastPipelineCnt", this.LastPipelineCnt);
        this.setParamSimple(map, prefix + "PipelineCntRatio", this.PipelineCntRatio);
        this.setParamSimple(map, prefix + "LastPipelineCntRatio", this.LastPipelineCntRatio);

    }
}

