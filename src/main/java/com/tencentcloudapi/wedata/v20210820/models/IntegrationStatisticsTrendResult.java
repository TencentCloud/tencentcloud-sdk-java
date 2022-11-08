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

public class IntegrationStatisticsTrendResult extends AbstractModel{

    /**
    * 统计属性名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticName")
    @Expose
    private String [] StatisticName;

    /**
    * 统计值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticValue")
    @Expose
    private Long [] StatisticValue;

    /**
    * 统计项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticType")
    @Expose
    private String StatisticType;

    /**
     * Get 统计属性名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticName 统计属性名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getStatisticName() {
        return this.StatisticName;
    }

    /**
     * Set 统计属性名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticName 统计属性名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticName(String [] StatisticName) {
        this.StatisticName = StatisticName;
    }

    /**
     * Get 统计值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticValue 统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getStatisticValue() {
        return this.StatisticValue;
    }

    /**
     * Set 统计值
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticValue 统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticValue(Long [] StatisticValue) {
        this.StatisticValue = StatisticValue;
    }

    /**
     * Get 统计项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticType 统计项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatisticType() {
        return this.StatisticType;
    }

    /**
     * Set 统计项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticType 统计项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticType(String StatisticType) {
        this.StatisticType = StatisticType;
    }

    public IntegrationStatisticsTrendResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationStatisticsTrendResult(IntegrationStatisticsTrendResult source) {
        if (source.StatisticName != null) {
            this.StatisticName = new String[source.StatisticName.length];
            for (int i = 0; i < source.StatisticName.length; i++) {
                this.StatisticName[i] = new String(source.StatisticName[i]);
            }
        }
        if (source.StatisticValue != null) {
            this.StatisticValue = new Long[source.StatisticValue.length];
            for (int i = 0; i < source.StatisticValue.length; i++) {
                this.StatisticValue[i] = new Long(source.StatisticValue[i]);
            }
        }
        if (source.StatisticType != null) {
            this.StatisticType = new String(source.StatisticType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StatisticName.", this.StatisticName);
        this.setParamArraySimple(map, prefix + "StatisticValue.", this.StatisticValue);
        this.setParamSimple(map, prefix + "StatisticType", this.StatisticType);

    }
}

