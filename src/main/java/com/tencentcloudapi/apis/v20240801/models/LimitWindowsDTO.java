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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LimitWindowsDTO extends AbstractModel {

    /**
    * <p>时间窗口，分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>累计上限，k</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>限流类型</p><p>枚举值：</p><ul><li>minute： 时间窗口</li><li>day： 自然日</li><li>month： 自然月</li><li>timeRange： 时间范围</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>时间区间配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeRange")
    @Expose
    private TimeRange TimeRange;

    /**
     * Get <p>时间窗口，分钟</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Interval <p>时间窗口，分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>时间窗口，分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Interval <p>时间窗口，分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>累计上限，k</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limit <p>累计上限，k</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>累计上限，k</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limit <p>累计上限，k</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>限流类型</p><p>枚举值：</p><ul><li>minute： 时间窗口</li><li>day： 自然日</li><li>month： 自然月</li><li>timeRange： 时间范围</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>限流类型</p><p>枚举值：</p><ul><li>minute： 时间窗口</li><li>day： 自然日</li><li>month： 自然月</li><li>timeRange： 时间范围</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>限流类型</p><p>枚举值：</p><ul><li>minute： 时间窗口</li><li>day： 自然日</li><li>month： 自然月</li><li>timeRange： 时间范围</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>限流类型</p><p>枚举值：</p><ul><li>minute： 时间窗口</li><li>day： 自然日</li><li>month： 自然月</li><li>timeRange： 时间范围</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>时间区间配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeRange <p>时间区间配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimeRange getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>时间区间配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeRange <p>时间区间配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeRange(TimeRange TimeRange) {
        this.TimeRange = TimeRange;
    }

    public LimitWindowsDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitWindowsDTO(LimitWindowsDTO source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new TimeRange(source.TimeRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "TimeRange.", this.TimeRange);

    }
}

