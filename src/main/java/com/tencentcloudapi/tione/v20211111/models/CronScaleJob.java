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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronScaleJob extends AbstractModel{

    /**
    * Cron表达式，标识任务的执行时间，精确到分钟级
    */
    @SerializedName("Schedule")
    @Expose
    private String Schedule;

    /**
    * 定时任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 目标实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
    * 目标min
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 目标max
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 例外时间，Cron表达式，在对应时间内不执行任务。最多支持3条。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeDates")
    @Expose
    private String [] ExcludeDates;

    /**
     * Get Cron表达式，标识任务的执行时间，精确到分钟级 
     * @return Schedule Cron表达式，标识任务的执行时间，精确到分钟级
     */
    public String getSchedule() {
        return this.Schedule;
    }

    /**
     * Set Cron表达式，标识任务的执行时间，精确到分钟级
     * @param Schedule Cron表达式，标识任务的执行时间，精确到分钟级
     */
    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get 定时任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 定时任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 定时任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 定时任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 目标实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetReplicas 目标实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set 目标实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetReplicas 目标实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    /**
     * Get 目标min
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinReplicas 目标min
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 目标min
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinReplicas 目标min
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 目标max
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxReplicas 目标max
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 目标max
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxReplicas 目标max
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 例外时间，Cron表达式，在对应时间内不执行任务。最多支持3条。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeDates 例外时间，Cron表达式，在对应时间内不执行任务。最多支持3条。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludeDates() {
        return this.ExcludeDates;
    }

    /**
     * Set 例外时间，Cron表达式，在对应时间内不执行任务。最多支持3条。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeDates 例外时间，Cron表达式，在对应时间内不执行任务。最多支持3条。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeDates(String [] ExcludeDates) {
        this.ExcludeDates = ExcludeDates;
    }

    public CronScaleJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronScaleJob(CronScaleJob source) {
        if (source.Schedule != null) {
            this.Schedule = new String(source.Schedule);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.ExcludeDates != null) {
            this.ExcludeDates = new String[source.ExcludeDates.length];
            for (int i = 0; i < source.ExcludeDates.length; i++) {
                this.ExcludeDates[i] = new String(source.ExcludeDates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArraySimple(map, prefix + "ExcludeDates.", this.ExcludeDates);

    }
}

