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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MCPToolConfig extends AbstractModel {

    /**
    * <p>输入参数</p>
    */
    @SerializedName("Inputs")
    @Expose
    private RequestParam [] Inputs;

    /**
    * <p>输出参数</p>
    */
    @SerializedName("Outputs")
    @Expose
    private ResponseParam [] Outputs;

    /**
    * <p>工具meta信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Meta")
    @Expose
    private MCPToolMeta Meta;

    /**
    * <p>是否支持交互界面（MCP Apps），插件级标签  默认值：false</p>
    */
    @SerializedName("SupportsApps")
    @Expose
    private Boolean SupportsApps;

    /**
     * Get <p>输入参数</p> 
     * @return Inputs <p>输入参数</p>
     */
    public RequestParam [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set <p>输入参数</p>
     * @param Inputs <p>输入参数</p>
     */
    public void setInputs(RequestParam [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get <p>输出参数</p> 
     * @return Outputs <p>输出参数</p>
     */
    public ResponseParam [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set <p>输出参数</p>
     * @param Outputs <p>输出参数</p>
     */
    public void setOutputs(ResponseParam [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get <p>工具meta信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Meta <p>工具meta信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MCPToolMeta getMeta() {
        return this.Meta;
    }

    /**
     * Set <p>工具meta信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Meta <p>工具meta信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMeta(MCPToolMeta Meta) {
        this.Meta = Meta;
    }

    /**
     * Get <p>是否支持交互界面（MCP Apps），插件级标签  默认值：false</p> 
     * @return SupportsApps <p>是否支持交互界面（MCP Apps），插件级标签  默认值：false</p>
     */
    public Boolean getSupportsApps() {
        return this.SupportsApps;
    }

    /**
     * Set <p>是否支持交互界面（MCP Apps），插件级标签  默认值：false</p>
     * @param SupportsApps <p>是否支持交互界面（MCP Apps），插件级标签  默认值：false</p>
     */
    public void setSupportsApps(Boolean SupportsApps) {
        this.SupportsApps = SupportsApps;
    }

    public MCPToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPToolConfig(MCPToolConfig source) {
        if (source.Inputs != null) {
            this.Inputs = new RequestParam[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new RequestParam(source.Inputs[i]);
            }
        }
        if (source.Outputs != null) {
            this.Outputs = new ResponseParam[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new ResponseParam(source.Outputs[i]);
            }
        }
        if (source.Meta != null) {
            this.Meta = new MCPToolMeta(source.Meta);
        }
        if (source.SupportsApps != null) {
            this.SupportsApps = new Boolean(source.SupportsApps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamObj(map, prefix + "Meta.", this.Meta);
        this.setParamSimple(map, prefix + "SupportsApps", this.SupportsApps);

    }
}

