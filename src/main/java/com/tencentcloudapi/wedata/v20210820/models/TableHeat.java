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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableHeat extends AbstractModel {

    /**
    * 表ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 统计日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * 表热度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Heat")
    @Expose
    private Float Heat;

    /**
    * 表热度最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxHeat")
    @Expose
    private Float MaxHeat;

    /**
     * Get 表ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 统计日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayTime 统计日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * Set 统计日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayTime 统计日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * Get 表热度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Heat 表热度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getHeat() {
        return this.Heat;
    }

    /**
     * Set 表热度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Heat 表热度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeat(Float Heat) {
        this.Heat = Heat;
    }

    /**
     * Get 表热度最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxHeat 表热度最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMaxHeat() {
        return this.MaxHeat;
    }

    /**
     * Set 表热度最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxHeat 表热度最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxHeat(Float MaxHeat) {
        this.MaxHeat = MaxHeat;
    }

    public TableHeat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableHeat(TableHeat source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.DayTime != null) {
            this.DayTime = new String(source.DayTime);
        }
        if (source.Heat != null) {
            this.Heat = new Float(source.Heat);
        }
        if (source.MaxHeat != null) {
            this.MaxHeat = new Float(source.MaxHeat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "Heat", this.Heat);
        this.setParamSimple(map, prefix + "MaxHeat", this.MaxHeat);

    }
}

