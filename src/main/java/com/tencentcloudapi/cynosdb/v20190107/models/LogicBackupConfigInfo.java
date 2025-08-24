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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogicBackupConfigInfo extends AbstractModel {

    /**
    * 是否开启自动逻辑备份
    */
    @SerializedName("LogicBackupEnable")
    @Expose
    private String LogicBackupEnable;

    /**
    * 自动逻辑备份开始时间
    */
    @SerializedName("LogicBackupTimeBeg")
    @Expose
    private Long LogicBackupTimeBeg;

    /**
    * 自动逻辑备份结束时间
    */
    @SerializedName("LogicBackupTimeEnd")
    @Expose
    private Long LogicBackupTimeEnd;

    /**
    * 自动逻辑备份保留时间
单位：秒
    */
    @SerializedName("LogicReserveDuration")
    @Expose
    private Long LogicReserveDuration;

    /**
    * 是否开启跨地域逻辑备份
可选值：ON/OFF
    */
    @SerializedName("LogicCrossRegionsEnable")
    @Expose
    private String LogicCrossRegionsEnable;

    /**
    * 逻辑备份所跨地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicCrossRegions")
    @Expose
    private String [] LogicCrossRegions;

    /**
     * Get 是否开启自动逻辑备份 
     * @return LogicBackupEnable 是否开启自动逻辑备份
     */
    public String getLogicBackupEnable() {
        return this.LogicBackupEnable;
    }

    /**
     * Set 是否开启自动逻辑备份
     * @param LogicBackupEnable 是否开启自动逻辑备份
     */
    public void setLogicBackupEnable(String LogicBackupEnable) {
        this.LogicBackupEnable = LogicBackupEnable;
    }

    /**
     * Get 自动逻辑备份开始时间 
     * @return LogicBackupTimeBeg 自动逻辑备份开始时间
     */
    public Long getLogicBackupTimeBeg() {
        return this.LogicBackupTimeBeg;
    }

    /**
     * Set 自动逻辑备份开始时间
     * @param LogicBackupTimeBeg 自动逻辑备份开始时间
     */
    public void setLogicBackupTimeBeg(Long LogicBackupTimeBeg) {
        this.LogicBackupTimeBeg = LogicBackupTimeBeg;
    }

    /**
     * Get 自动逻辑备份结束时间 
     * @return LogicBackupTimeEnd 自动逻辑备份结束时间
     */
    public Long getLogicBackupTimeEnd() {
        return this.LogicBackupTimeEnd;
    }

    /**
     * Set 自动逻辑备份结束时间
     * @param LogicBackupTimeEnd 自动逻辑备份结束时间
     */
    public void setLogicBackupTimeEnd(Long LogicBackupTimeEnd) {
        this.LogicBackupTimeEnd = LogicBackupTimeEnd;
    }

    /**
     * Get 自动逻辑备份保留时间
单位：秒 
     * @return LogicReserveDuration 自动逻辑备份保留时间
单位：秒
     */
    public Long getLogicReserveDuration() {
        return this.LogicReserveDuration;
    }

    /**
     * Set 自动逻辑备份保留时间
单位：秒
     * @param LogicReserveDuration 自动逻辑备份保留时间
单位：秒
     */
    public void setLogicReserveDuration(Long LogicReserveDuration) {
        this.LogicReserveDuration = LogicReserveDuration;
    }

    /**
     * Get 是否开启跨地域逻辑备份
可选值：ON/OFF 
     * @return LogicCrossRegionsEnable 是否开启跨地域逻辑备份
可选值：ON/OFF
     */
    public String getLogicCrossRegionsEnable() {
        return this.LogicCrossRegionsEnable;
    }

    /**
     * Set 是否开启跨地域逻辑备份
可选值：ON/OFF
     * @param LogicCrossRegionsEnable 是否开启跨地域逻辑备份
可选值：ON/OFF
     */
    public void setLogicCrossRegionsEnable(String LogicCrossRegionsEnable) {
        this.LogicCrossRegionsEnable = LogicCrossRegionsEnable;
    }

    /**
     * Get 逻辑备份所跨地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicCrossRegions 逻辑备份所跨地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLogicCrossRegions() {
        return this.LogicCrossRegions;
    }

    /**
     * Set 逻辑备份所跨地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicCrossRegions 逻辑备份所跨地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicCrossRegions(String [] LogicCrossRegions) {
        this.LogicCrossRegions = LogicCrossRegions;
    }

    public LogicBackupConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogicBackupConfigInfo(LogicBackupConfigInfo source) {
        if (source.LogicBackupEnable != null) {
            this.LogicBackupEnable = new String(source.LogicBackupEnable);
        }
        if (source.LogicBackupTimeBeg != null) {
            this.LogicBackupTimeBeg = new Long(source.LogicBackupTimeBeg);
        }
        if (source.LogicBackupTimeEnd != null) {
            this.LogicBackupTimeEnd = new Long(source.LogicBackupTimeEnd);
        }
        if (source.LogicReserveDuration != null) {
            this.LogicReserveDuration = new Long(source.LogicReserveDuration);
        }
        if (source.LogicCrossRegionsEnable != null) {
            this.LogicCrossRegionsEnable = new String(source.LogicCrossRegionsEnable);
        }
        if (source.LogicCrossRegions != null) {
            this.LogicCrossRegions = new String[source.LogicCrossRegions.length];
            for (int i = 0; i < source.LogicCrossRegions.length; i++) {
                this.LogicCrossRegions[i] = new String(source.LogicCrossRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogicBackupEnable", this.LogicBackupEnable);
        this.setParamSimple(map, prefix + "LogicBackupTimeBeg", this.LogicBackupTimeBeg);
        this.setParamSimple(map, prefix + "LogicBackupTimeEnd", this.LogicBackupTimeEnd);
        this.setParamSimple(map, prefix + "LogicReserveDuration", this.LogicReserveDuration);
        this.setParamSimple(map, prefix + "LogicCrossRegionsEnable", this.LogicCrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "LogicCrossRegions.", this.LogicCrossRegions);

    }
}

