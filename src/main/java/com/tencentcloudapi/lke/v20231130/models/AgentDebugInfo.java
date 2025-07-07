/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class AgentDebugInfo extends AbstractModel {

    /**
    * 工具、大模型的输入信息，json
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 工具、大模型的输出信息，json
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
     * Get 工具、大模型的输入信息，json
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Input 工具、大模型的输入信息，json
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 工具、大模型的输入信息，json
注意：此字段可能返回 null，表示取不到有效值。
     * @param Input 工具、大模型的输入信息，json
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 工具、大模型的输出信息，json
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 工具、大模型的输出信息，json
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 工具、大模型的输出信息，json
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 工具、大模型的输出信息，json
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    public AgentDebugInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentDebugInfo(AgentDebugInfo source) {
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);

    }
}

