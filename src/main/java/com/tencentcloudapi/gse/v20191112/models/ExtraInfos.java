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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraInfos extends AbstractModel{

    /**
    * 实例类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例限额数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalInstances")
    @Expose
    private Long TotalInstances;

    /**
     * Get 实例类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例限额数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalInstances 实例限额数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalInstances() {
        return this.TotalInstances;
    }

    /**
     * Set 实例限额数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalInstances 实例限额数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalInstances(Long TotalInstances) {
        this.TotalInstances = TotalInstances;
    }

    public ExtraInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraInfos(ExtraInfos source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.TotalInstances != null) {
            this.TotalInstances = new Long(source.TotalInstances);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "TotalInstances", this.TotalInstances);

    }
}

