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

public class DlcExpiredSnapshotsInfo extends AbstractModel{

    /**
    * 是否启用快照过期治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredSnapshotsEnable")
    @Expose
    private String ExpiredSnapshotsEnable;

    /**
    * 用于运行快照过期治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 需要保留的最近快照个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetainLast")
    @Expose
    private Long RetainLast;

    /**
    * 过期指定天前的快照
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeforeDays")
    @Expose
    private Long BeforeDays;

    /**
    * 清理过期快照的并行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConcurrentDeletes")
    @Expose
    private Long MaxConcurrentDeletes;

    /**
    * 快照过期治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntervalMin")
    @Expose
    private Long IntervalMin;

    /**
     * Get 是否启用快照过期治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredSnapshotsEnable 是否启用快照过期治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredSnapshotsEnable() {
        return this.ExpiredSnapshotsEnable;
    }

    /**
     * Set 是否启用快照过期治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredSnapshotsEnable 是否启用快照过期治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredSnapshotsEnable(String ExpiredSnapshotsEnable) {
        this.ExpiredSnapshotsEnable = ExpiredSnapshotsEnable;
    }

    /**
     * Get 用于运行快照过期治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Engine 用于运行快照过期治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 用于运行快照过期治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Engine 用于运行快照过期治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 需要保留的最近快照个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetainLast 需要保留的最近快照个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetainLast() {
        return this.RetainLast;
    }

    /**
     * Set 需要保留的最近快照个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetainLast 需要保留的最近快照个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetainLast(Long RetainLast) {
        this.RetainLast = RetainLast;
    }

    /**
     * Get 过期指定天前的快照
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeforeDays 过期指定天前的快照
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeforeDays() {
        return this.BeforeDays;
    }

    /**
     * Set 过期指定天前的快照
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeforeDays 过期指定天前的快照
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeforeDays(Long BeforeDays) {
        this.BeforeDays = BeforeDays;
    }

    /**
     * Get 清理过期快照的并行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConcurrentDeletes 清理过期快照的并行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConcurrentDeletes() {
        return this.MaxConcurrentDeletes;
    }

    /**
     * Set 清理过期快照的并行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConcurrentDeletes 清理过期快照的并行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConcurrentDeletes(Long MaxConcurrentDeletes) {
        this.MaxConcurrentDeletes = MaxConcurrentDeletes;
    }

    /**
     * Get 快照过期治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntervalMin 快照过期治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntervalMin() {
        return this.IntervalMin;
    }

    /**
     * Set 快照过期治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntervalMin 快照过期治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntervalMin(Long IntervalMin) {
        this.IntervalMin = IntervalMin;
    }

    public DlcExpiredSnapshotsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcExpiredSnapshotsInfo(DlcExpiredSnapshotsInfo source) {
        if (source.ExpiredSnapshotsEnable != null) {
            this.ExpiredSnapshotsEnable = new String(source.ExpiredSnapshotsEnable);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.RetainLast != null) {
            this.RetainLast = new Long(source.RetainLast);
        }
        if (source.BeforeDays != null) {
            this.BeforeDays = new Long(source.BeforeDays);
        }
        if (source.MaxConcurrentDeletes != null) {
            this.MaxConcurrentDeletes = new Long(source.MaxConcurrentDeletes);
        }
        if (source.IntervalMin != null) {
            this.IntervalMin = new Long(source.IntervalMin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpiredSnapshotsEnable", this.ExpiredSnapshotsEnable);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "RetainLast", this.RetainLast);
        this.setParamSimple(map, prefix + "BeforeDays", this.BeforeDays);
        this.setParamSimple(map, prefix + "MaxConcurrentDeletes", this.MaxConcurrentDeletes);
        this.setParamSimple(map, prefix + "IntervalMin", this.IntervalMin);

    }
}

