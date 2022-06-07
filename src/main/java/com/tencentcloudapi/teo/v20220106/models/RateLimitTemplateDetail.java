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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitTemplateDetail extends AbstractModel{

    /**
    * 模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 处置动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 惩罚时间，秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * 阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 统计周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get 模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 处置动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 处置动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处置动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 处置动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 惩罚时间，秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PunishTime 惩罚时间，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set 惩罚时间，秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param PunishTime 惩罚时间，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get 阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Threshold 阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Threshold 阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 统计周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 统计周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 统计周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public RateLimitTemplateDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitTemplateDetail(RateLimitTemplateDetail source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

