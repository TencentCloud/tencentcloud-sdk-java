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

public class TableScoreStatisticsInfo extends AbstractModel{

    /**
    * 等级 1、2、3、4、5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 占比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * 表数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNumber")
    @Expose
    private Long TableNumber;

    /**
     * Get 等级 1、2、3、4、5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 等级 1、2、3、4、5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 等级 1、2、3、4、5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 等级 1、2、3、4、5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 占比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scale 占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 占比
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scale 占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 表数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNumber 表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableNumber() {
        return this.TableNumber;
    }

    /**
     * Set 表数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNumber 表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNumber(Long TableNumber) {
        this.TableNumber = TableNumber;
    }

    public TableScoreStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableScoreStatisticsInfo(TableScoreStatisticsInfo source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.TableNumber != null) {
            this.TableNumber = new Long(source.TableNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "TableNumber", this.TableNumber);

    }
}

