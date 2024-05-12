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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoUpgradeOptions extends AbstractModel {

    /**
    * 自动升级开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoUpgradeStartTime")
    @Expose
    private String AutoUpgradeStartTime;

    /**
    * 自动升级持续时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 运维日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeeklyPeriod")
    @Expose
    private String [] WeeklyPeriod;

    /**
     * Get 自动升级开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoUpgradeStartTime 自动升级开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoUpgradeStartTime() {
        return this.AutoUpgradeStartTime;
    }

    /**
     * Set 自动升级开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoUpgradeStartTime 自动升级开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoUpgradeStartTime(String AutoUpgradeStartTime) {
        this.AutoUpgradeStartTime = AutoUpgradeStartTime;
    }

    /**
     * Get 自动升级持续时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 自动升级持续时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 自动升级持续时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 自动升级持续时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 运维日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeeklyPeriod 运维日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getWeeklyPeriod() {
        return this.WeeklyPeriod;
    }

    /**
     * Set 运维日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeeklyPeriod 运维日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeeklyPeriod(String [] WeeklyPeriod) {
        this.WeeklyPeriod = WeeklyPeriod;
    }

    public AutoUpgradeOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoUpgradeOptions(AutoUpgradeOptions source) {
        if (source.AutoUpgradeStartTime != null) {
            this.AutoUpgradeStartTime = new String(source.AutoUpgradeStartTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.WeeklyPeriod != null) {
            this.WeeklyPeriod = new String[source.WeeklyPeriod.length];
            for (int i = 0; i < source.WeeklyPeriod.length; i++) {
                this.WeeklyPeriod[i] = new String(source.WeeklyPeriod[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoUpgradeStartTime", this.AutoUpgradeStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "WeeklyPeriod.", this.WeeklyPeriod);

    }
}

