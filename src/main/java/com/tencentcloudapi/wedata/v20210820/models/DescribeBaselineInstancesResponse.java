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

public class DescribeBaselineInstancesResponse extends AbstractModel{

    /**
    * 基线实例数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineInstances")
    @Expose
    private BaselineInstanceVo [] BaselineInstances;

    /**
    * 总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 基线实例数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineInstances 基线实例数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineInstanceVo [] getBaselineInstances() {
        return this.BaselineInstances;
    }

    /**
     * Set 基线实例数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineInstances 基线实例数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineInstances(BaselineInstanceVo [] BaselineInstances) {
        this.BaselineInstances = BaselineInstances;
    }

    /**
     * Get 总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public DescribeBaselineInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineInstancesResponse(DescribeBaselineInstancesResponse source) {
        if (source.BaselineInstances != null) {
            this.BaselineInstances = new BaselineInstanceVo[source.BaselineInstances.length];
            for (int i = 0; i < source.BaselineInstances.length; i++) {
                this.BaselineInstances[i] = new BaselineInstanceVo(source.BaselineInstances[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BaselineInstances.", this.BaselineInstances);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

