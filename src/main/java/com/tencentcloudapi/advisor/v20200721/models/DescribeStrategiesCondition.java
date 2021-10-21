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
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStrategiesCondition extends AbstractModel{

    /**
    * 警告条件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionId")
    @Expose
    private Long ConditionId;

    /**
    * 警告级别，2:中风险，3:高风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 警告级别描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelDesc")
    @Expose
    private String LevelDesc;

    /**
    * 警告条件描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 警告条件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionId 警告条件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConditionId() {
        return this.ConditionId;
    }

    /**
     * Set 警告条件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionId 警告条件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionId(Long ConditionId) {
        this.ConditionId = ConditionId;
    }

    /**
     * Get 警告级别，2:中风险，3:高风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 警告级别，2:中风险，3:高风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 警告级别，2:中风险，3:高风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 警告级别，2:中风险，3:高风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 警告级别描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelDesc 警告级别描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevelDesc() {
        return this.LevelDesc;
    }

    /**
     * Set 警告级别描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelDesc 警告级别描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelDesc(String LevelDesc) {
        this.LevelDesc = LevelDesc;
    }

    /**
     * Get 警告条件描述 
     * @return Desc 警告条件描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 警告条件描述
     * @param Desc 警告条件描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public DescribeStrategiesCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStrategiesCondition(DescribeStrategiesCondition source) {
        if (source.ConditionId != null) {
            this.ConditionId = new Long(source.ConditionId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.LevelDesc != null) {
            this.LevelDesc = new String(source.LevelDesc);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConditionId", this.ConditionId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "LevelDesc", this.LevelDesc);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

