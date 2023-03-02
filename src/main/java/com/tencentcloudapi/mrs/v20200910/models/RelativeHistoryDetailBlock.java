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

public class RelativeHistoryDetailBlock extends AbstractModel{

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
    * 死亡时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeOfDeath")
    @Expose
    private String TimeOfDeath;

    /**
    * 时间类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeType")
    @Expose
    private String TimeType;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Relation 关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param Relation 关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    /**
     * Get 死亡时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeOfDeath 死亡时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeOfDeath() {
        return this.TimeOfDeath;
    }

    /**
     * Set 死亡时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeOfDeath 死亡时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeOfDeath(String TimeOfDeath) {
        this.TimeOfDeath = TimeOfDeath;
    }

    /**
     * Get 时间类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeType 时间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeType() {
        return this.TimeType;
    }

    /**
     * Set 时间类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeType 时间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeType(String TimeType) {
        this.TimeType = TimeType;
    }

    public RelativeHistoryDetailBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelativeHistoryDetailBlock(RelativeHistoryDetailBlock source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
        if (source.TimeOfDeath != null) {
            this.TimeOfDeath = new String(source.TimeOfDeath);
        }
        if (source.TimeType != null) {
            this.TimeType = new String(source.TimeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Relation", this.Relation);
        this.setParamSimple(map, prefix + "TimeOfDeath", this.TimeOfDeath);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);

    }
}

