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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Targets extends AbstractModel{

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 在线数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
    * 不在线数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Down")
    @Expose
    private Long Down;

    /**
    * 未知状态数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unknown")
    @Expose
    private Long Unknown;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 在线数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Up 在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set 在线数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Up 在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

    /**
     * Get 不在线数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Down 不在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDown() {
        return this.Down;
    }

    /**
     * Set 不在线数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Down 不在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDown(Long Down) {
        this.Down = Down;
    }

    /**
     * Get 未知状态数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unknown 未知状态数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnknown() {
        return this.Unknown;
    }

    /**
     * Set 未知状态数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unknown 未知状态数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnknown(Long Unknown) {
        this.Unknown = Unknown;
    }

    public Targets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Targets(Targets source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
        if (source.Down != null) {
            this.Down = new Long(source.Down);
        }
        if (source.Unknown != null) {
            this.Unknown = new Long(source.Unknown);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Up", this.Up);
        this.setParamSimple(map, prefix + "Down", this.Down);
        this.setParamSimple(map, prefix + "Unknown", this.Unknown);

    }
}

