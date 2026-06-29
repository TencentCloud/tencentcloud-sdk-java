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

public class CodeToolConfig extends AbstractModel {

    /**
    * <p>代码</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>示例</p>
    */
    @SerializedName("Example")
    @Expose
    private ToolExample Example;

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
     * Get <p>代码</p> 
     * @return Code <p>代码</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>代码</p>
     * @param Code <p>代码</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>示例</p> 
     * @return Example <p>示例</p>
     */
    public ToolExample getExample() {
        return this.Example;
    }

    /**
     * Set <p>示例</p>
     * @param Example <p>示例</p>
     */
    public void setExample(ToolExample Example) {
        this.Example = Example;
    }

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

    public CodeToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeToolConfig(CodeToolConfig source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Example != null) {
            this.Example = new ToolExample(source.Example);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamObj(map, prefix + "Example.", this.Example);
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);

    }
}

