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

public class DescribeBaselineResponse extends AbstractModel{

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Baselines")
    @Expose
    private BaselineDto [] Baselines;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Baselines 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineDto [] getBaselines() {
        return this.Baselines;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Baselines 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselines(BaselineDto [] Baselines) {
        this.Baselines = Baselines;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public DescribeBaselineResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineResponse(DescribeBaselineResponse source) {
        if (source.Baselines != null) {
            this.Baselines = new BaselineDto[source.Baselines.length];
            for (int i = 0; i < source.Baselines.length; i++) {
                this.Baselines[i] = new BaselineDto(source.Baselines[i]);
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
        this.setParamArrayObj(map, prefix + "Baselines.", this.Baselines);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

