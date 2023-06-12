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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfs extends AbstractModel{

    /**
    * 数据库巡检开关, Yes/No。
    */
    @SerializedName("DailyInspection")
    @Expose
    private String DailyInspection;

    /**
    * 实例概览开关，Yes/No。
    */
    @SerializedName("OverviewDisplay")
    @Expose
    private String OverviewDisplay;

    /**
    * redis大key分析的自定义分割符，仅redis使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyDelimiters")
    @Expose
    private String [] KeyDelimiters;

    /**
     * Get 数据库巡检开关, Yes/No。 
     * @return DailyInspection 数据库巡检开关, Yes/No。
     */
    public String getDailyInspection() {
        return this.DailyInspection;
    }

    /**
     * Set 数据库巡检开关, Yes/No。
     * @param DailyInspection 数据库巡检开关, Yes/No。
     */
    public void setDailyInspection(String DailyInspection) {
        this.DailyInspection = DailyInspection;
    }

    /**
     * Get 实例概览开关，Yes/No。 
     * @return OverviewDisplay 实例概览开关，Yes/No。
     */
    public String getOverviewDisplay() {
        return this.OverviewDisplay;
    }

    /**
     * Set 实例概览开关，Yes/No。
     * @param OverviewDisplay 实例概览开关，Yes/No。
     */
    public void setOverviewDisplay(String OverviewDisplay) {
        this.OverviewDisplay = OverviewDisplay;
    }

    /**
     * Get redis大key分析的自定义分割符，仅redis使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyDelimiters redis大key分析的自定义分割符，仅redis使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeyDelimiters() {
        return this.KeyDelimiters;
    }

    /**
     * Set redis大key分析的自定义分割符，仅redis使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyDelimiters redis大key分析的自定义分割符，仅redis使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyDelimiters(String [] KeyDelimiters) {
        this.KeyDelimiters = KeyDelimiters;
    }

    public InstanceConfs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfs(InstanceConfs source) {
        if (source.DailyInspection != null) {
            this.DailyInspection = new String(source.DailyInspection);
        }
        if (source.OverviewDisplay != null) {
            this.OverviewDisplay = new String(source.OverviewDisplay);
        }
        if (source.KeyDelimiters != null) {
            this.KeyDelimiters = new String[source.KeyDelimiters.length];
            for (int i = 0; i < source.KeyDelimiters.length; i++) {
                this.KeyDelimiters[i] = new String(source.KeyDelimiters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DailyInspection", this.DailyInspection);
        this.setParamSimple(map, prefix + "OverviewDisplay", this.OverviewDisplay);
        this.setParamArraySimple(map, prefix + "KeyDelimiters.", this.KeyDelimiters);

    }
}

