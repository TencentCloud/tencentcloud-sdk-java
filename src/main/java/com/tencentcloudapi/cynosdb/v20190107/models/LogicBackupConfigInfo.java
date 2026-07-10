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
    * <p>是否开启自动逻辑备份</p>
    */
    @SerializedName("LogicBackupEnable")
    @Expose
    private String LogicBackupEnable;

    /**
    * <p>自动逻辑备份开始时间</p>
    */
    @SerializedName("LogicBackupTimeBeg")
    @Expose
    private Long LogicBackupTimeBeg;

    /**
    * <p>自动逻辑备份结束时间</p>
    */
    @SerializedName("LogicBackupTimeEnd")
    @Expose
    private Long LogicBackupTimeEnd;

    /**
    * <p>自动逻辑备份保留时间<br>单位：秒</p>
    */
    @SerializedName("LogicReserveDuration")
    @Expose
    private Long LogicReserveDuration;

    /**
    * <p>是否开启跨地域逻辑备份<br>可选值：ON/OFF</p>
    */
    @SerializedName("LogicCrossRegionsEnable")
    @Expose
    private String LogicCrossRegionsEnable;

    /**
    * <p>逻辑备份所跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicCrossRegions")
    @Expose
    private String [] LogicCrossRegions;

    /**
    * <p>备份投递关系</p>
    */
    @SerializedName("AutoCopyVaults")
    @Expose
    private CreateBackupVaultItem [] AutoCopyVaults;

    /**
    * <p>天</p><p>单位：跨地域逻辑备份保留时间</p>
    */
    @SerializedName("LogicCrossRegionSaveDays")
    @Expose
    private Long LogicCrossRegionSaveDays;

    /**
     * Get <p>是否开启自动逻辑备份</p> 
     * @return LogicBackupEnable <p>是否开启自动逻辑备份</p>
     */
    public String getLogicBackupEnable() {
        return this.LogicBackupEnable;
    }

    /**
     * Set <p>是否开启自动逻辑备份</p>
     * @param LogicBackupEnable <p>是否开启自动逻辑备份</p>
     */
    public void setLogicBackupEnable(String LogicBackupEnable) {
        this.LogicBackupEnable = LogicBackupEnable;
    }

    /**
     * Get <p>自动逻辑备份开始时间</p> 
     * @return LogicBackupTimeBeg <p>自动逻辑备份开始时间</p>
     */
    public Long getLogicBackupTimeBeg() {
        return this.LogicBackupTimeBeg;
    }

    /**
     * Set <p>自动逻辑备份开始时间</p>
     * @param LogicBackupTimeBeg <p>自动逻辑备份开始时间</p>
     */
    public void setLogicBackupTimeBeg(Long LogicBackupTimeBeg) {
        this.LogicBackupTimeBeg = LogicBackupTimeBeg;
    }

    /**
     * Get <p>自动逻辑备份结束时间</p> 
     * @return LogicBackupTimeEnd <p>自动逻辑备份结束时间</p>
     */
    public Long getLogicBackupTimeEnd() {
        return this.LogicBackupTimeEnd;
    }

    /**
     * Set <p>自动逻辑备份结束时间</p>
     * @param LogicBackupTimeEnd <p>自动逻辑备份结束时间</p>
     */
    public void setLogicBackupTimeEnd(Long LogicBackupTimeEnd) {
        this.LogicBackupTimeEnd = LogicBackupTimeEnd;
    }

    /**
     * Get <p>自动逻辑备份保留时间<br>单位：秒</p> 
     * @return LogicReserveDuration <p>自动逻辑备份保留时间<br>单位：秒</p>
     */
    public Long getLogicReserveDuration() {
        return this.LogicReserveDuration;
    }

    /**
     * Set <p>自动逻辑备份保留时间<br>单位：秒</p>
     * @param LogicReserveDuration <p>自动逻辑备份保留时间<br>单位：秒</p>
     */
    public void setLogicReserveDuration(Long LogicReserveDuration) {
        this.LogicReserveDuration = LogicReserveDuration;
    }

    /**
     * Get <p>是否开启跨地域逻辑备份<br>可选值：ON/OFF</p> 
     * @return LogicCrossRegionsEnable <p>是否开启跨地域逻辑备份<br>可选值：ON/OFF</p>
     */
    public String getLogicCrossRegionsEnable() {
        return this.LogicCrossRegionsEnable;
    }

    /**
     * Set <p>是否开启跨地域逻辑备份<br>可选值：ON/OFF</p>
     * @param LogicCrossRegionsEnable <p>是否开启跨地域逻辑备份<br>可选值：ON/OFF</p>
     */
    public void setLogicCrossRegionsEnable(String LogicCrossRegionsEnable) {
        this.LogicCrossRegionsEnable = LogicCrossRegionsEnable;
    }

    /**
     * Get <p>逻辑备份所跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicCrossRegions <p>逻辑备份所跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLogicCrossRegions() {
        return this.LogicCrossRegions;
    }

    /**
     * Set <p>逻辑备份所跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicCrossRegions <p>逻辑备份所跨地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicCrossRegions(String [] LogicCrossRegions) {
        this.LogicCrossRegions = LogicCrossRegions;
    }

    /**
     * Get <p>备份投递关系</p> 
     * @return AutoCopyVaults <p>备份投递关系</p>
     */
    public CreateBackupVaultItem [] getAutoCopyVaults() {
        return this.AutoCopyVaults;
    }

    /**
     * Set <p>备份投递关系</p>
     * @param AutoCopyVaults <p>备份投递关系</p>
     */
    public void setAutoCopyVaults(CreateBackupVaultItem [] AutoCopyVaults) {
        this.AutoCopyVaults = AutoCopyVaults;
    }

    /**
     * Get <p>天</p><p>单位：跨地域逻辑备份保留时间</p> 
     * @return LogicCrossRegionSaveDays <p>天</p><p>单位：跨地域逻辑备份保留时间</p>
     */
    public Long getLogicCrossRegionSaveDays() {
        return this.LogicCrossRegionSaveDays;
    }

    /**
     * Set <p>天</p><p>单位：跨地域逻辑备份保留时间</p>
     * @param LogicCrossRegionSaveDays <p>天</p><p>单位：跨地域逻辑备份保留时间</p>
     */
    public void setLogicCrossRegionSaveDays(Long LogicCrossRegionSaveDays) {
        this.LogicCrossRegionSaveDays = LogicCrossRegionSaveDays;
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
        if (source.AutoCopyVaults != null) {
            this.AutoCopyVaults = new CreateBackupVaultItem[source.AutoCopyVaults.length];
            for (int i = 0; i < source.AutoCopyVaults.length; i++) {
                this.AutoCopyVaults[i] = new CreateBackupVaultItem(source.AutoCopyVaults[i]);
            }
        }
        if (source.LogicCrossRegionSaveDays != null) {
            this.LogicCrossRegionSaveDays = new Long(source.LogicCrossRegionSaveDays);
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
        this.setParamArrayObj(map, prefix + "AutoCopyVaults.", this.AutoCopyVaults);
        this.setParamSimple(map, prefix + "LogicCrossRegionSaveDays", this.LogicCrossRegionSaveDays);

    }
}

