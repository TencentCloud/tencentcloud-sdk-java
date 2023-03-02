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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MenstrualHistoryBlock extends AbstractModel{

    /**
    * 末次月经
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastMenstrualPeriod")
    @Expose
    private LastMenstrualPeriodBlock LastMenstrualPeriod;

    /**
    * 月经量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstrualFlow")
    @Expose
    private MenstrualFlowBlock MenstrualFlow;

    /**
    * 初潮时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenarcheAge")
    @Expose
    private LastMenstrualPeriodBlock MenarcheAge;

    /**
    * 是否绝经
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstruationOrNot")
    @Expose
    private MenstruationOrNotBlock MenstruationOrNot;

    /**
    * 月经周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstrualCycles")
    @Expose
    private LastMenstrualPeriodBlock MenstrualCycles;

    /**
    * 月经经期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstrualPeriod")
    @Expose
    private MenstrualPeriodBlock MenstrualPeriod;

    /**
     * Get 末次月经
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastMenstrualPeriod 末次月经
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LastMenstrualPeriodBlock getLastMenstrualPeriod() {
        return this.LastMenstrualPeriod;
    }

    /**
     * Set 末次月经
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastMenstrualPeriod 末次月经
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastMenstrualPeriod(LastMenstrualPeriodBlock LastMenstrualPeriod) {
        this.LastMenstrualPeriod = LastMenstrualPeriod;
    }

    /**
     * Get 月经量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstrualFlow 月经量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MenstrualFlowBlock getMenstrualFlow() {
        return this.MenstrualFlow;
    }

    /**
     * Set 月经量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstrualFlow 月经量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstrualFlow(MenstrualFlowBlock MenstrualFlow) {
        this.MenstrualFlow = MenstrualFlow;
    }

    /**
     * Get 初潮时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenarcheAge 初潮时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LastMenstrualPeriodBlock getMenarcheAge() {
        return this.MenarcheAge;
    }

    /**
     * Set 初潮时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenarcheAge 初潮时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenarcheAge(LastMenstrualPeriodBlock MenarcheAge) {
        this.MenarcheAge = MenarcheAge;
    }

    /**
     * Get 是否绝经
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstruationOrNot 是否绝经
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MenstruationOrNotBlock getMenstruationOrNot() {
        return this.MenstruationOrNot;
    }

    /**
     * Set 是否绝经
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstruationOrNot 是否绝经
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstruationOrNot(MenstruationOrNotBlock MenstruationOrNot) {
        this.MenstruationOrNot = MenstruationOrNot;
    }

    /**
     * Get 月经周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstrualCycles 月经周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LastMenstrualPeriodBlock getMenstrualCycles() {
        return this.MenstrualCycles;
    }

    /**
     * Set 月经周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstrualCycles 月经周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstrualCycles(LastMenstrualPeriodBlock MenstrualCycles) {
        this.MenstrualCycles = MenstrualCycles;
    }

    /**
     * Get 月经经期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstrualPeriod 月经经期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MenstrualPeriodBlock getMenstrualPeriod() {
        return this.MenstrualPeriod;
    }

    /**
     * Set 月经经期
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstrualPeriod 月经经期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstrualPeriod(MenstrualPeriodBlock MenstrualPeriod) {
        this.MenstrualPeriod = MenstrualPeriod;
    }

    public MenstrualHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MenstrualHistoryBlock(MenstrualHistoryBlock source) {
        if (source.LastMenstrualPeriod != null) {
            this.LastMenstrualPeriod = new LastMenstrualPeriodBlock(source.LastMenstrualPeriod);
        }
        if (source.MenstrualFlow != null) {
            this.MenstrualFlow = new MenstrualFlowBlock(source.MenstrualFlow);
        }
        if (source.MenarcheAge != null) {
            this.MenarcheAge = new LastMenstrualPeriodBlock(source.MenarcheAge);
        }
        if (source.MenstruationOrNot != null) {
            this.MenstruationOrNot = new MenstruationOrNotBlock(source.MenstruationOrNot);
        }
        if (source.MenstrualCycles != null) {
            this.MenstrualCycles = new LastMenstrualPeriodBlock(source.MenstrualCycles);
        }
        if (source.MenstrualPeriod != null) {
            this.MenstrualPeriod = new MenstrualPeriodBlock(source.MenstrualPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LastMenstrualPeriod.", this.LastMenstrualPeriod);
        this.setParamObj(map, prefix + "MenstrualFlow.", this.MenstrualFlow);
        this.setParamObj(map, prefix + "MenarcheAge.", this.MenarcheAge);
        this.setParamObj(map, prefix + "MenstruationOrNot.", this.MenstruationOrNot);
        this.setParamObj(map, prefix + "MenstrualCycles.", this.MenstrualCycles);
        this.setParamObj(map, prefix + "MenstrualPeriod.", this.MenstrualPeriod);

    }
}

