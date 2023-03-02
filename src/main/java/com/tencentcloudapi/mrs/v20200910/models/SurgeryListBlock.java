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

public class SurgeryListBlock extends AbstractModel{

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeType")
    @Expose
    private String TimeType;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String [] Name;

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private String Part;

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeType() {
        return this.TimeType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeType(String TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String [] Name) {
        this.Name = Name;
    }

    /**
     * Get 部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPart() {
        return this.Part;
    }

    /**
     * Set 部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(String Part) {
        this.Part = Part;
    }

    public SurgeryListBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SurgeryListBlock(SurgeryListBlock source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.TimeType != null) {
            this.TimeType = new String(source.TimeType);
        }
        if (source.Name != null) {
            this.Name = new String[source.Name.length];
            for (int i = 0; i < source.Name.length; i++) {
                this.Name[i] = new String(source.Name[i]);
            }
        }
        if (source.Part != null) {
            this.Part = new String(source.Part);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamArraySimple(map, prefix + "Name.", this.Name);
        this.setParamSimple(map, prefix + "Part", this.Part);

    }
}

