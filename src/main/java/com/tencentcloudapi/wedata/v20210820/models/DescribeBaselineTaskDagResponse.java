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

public class DescribeBaselineTaskDagResponse extends AbstractModel{

    /**
    * 基线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Baseline")
    @Expose
    private BaselineDto Baseline;

    /**
    * 基线任务dag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineTaskDag")
    @Expose
    private BaselineTaskDto [] BaselineTaskDag;

    /**
     * Get 基线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Baseline 基线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineDto getBaseline() {
        return this.Baseline;
    }

    /**
     * Set 基线
注意：此字段可能返回 null，表示取不到有效值。
     * @param Baseline 基线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseline(BaselineDto Baseline) {
        this.Baseline = Baseline;
    }

    /**
     * Get 基线任务dag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineTaskDag 基线任务dag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineTaskDto [] getBaselineTaskDag() {
        return this.BaselineTaskDag;
    }

    /**
     * Set 基线任务dag
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineTaskDag 基线任务dag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineTaskDag(BaselineTaskDto [] BaselineTaskDag) {
        this.BaselineTaskDag = BaselineTaskDag;
    }

    public DescribeBaselineTaskDagResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineTaskDagResponse(DescribeBaselineTaskDagResponse source) {
        if (source.Baseline != null) {
            this.Baseline = new BaselineDto(source.Baseline);
        }
        if (source.BaselineTaskDag != null) {
            this.BaselineTaskDag = new BaselineTaskDto[source.BaselineTaskDag.length];
            for (int i = 0; i < source.BaselineTaskDag.length; i++) {
                this.BaselineTaskDag[i] = new BaselineTaskDto(source.BaselineTaskDag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Baseline.", this.Baseline);
        this.setParamArrayObj(map, prefix + "BaselineTaskDag.", this.BaselineTaskDag);

    }
}

