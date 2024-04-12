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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SummaryConfig extends AbstractModel {

    /**
    * 模型配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private AppModel Model;

    /**
    * 知识摘要输出配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private SummaryOutput Output;

    /**
     * Get 模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppModel getModel() {
        return this.Model;
    }

    /**
     * Set 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(AppModel Model) {
        this.Model = Model;
    }

    /**
     * Get 知识摘要输出配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 知识摘要输出配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SummaryOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 知识摘要输出配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 知识摘要输出配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(SummaryOutput Output) {
        this.Output = Output;
    }

    public SummaryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryConfig(SummaryConfig source) {
        if (source.Model != null) {
            this.Model = new AppModel(source.Model);
        }
        if (source.Output != null) {
            this.Output = new SummaryOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

