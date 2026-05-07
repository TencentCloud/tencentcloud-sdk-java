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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedAIModel extends AbstractModel {

    /**
    * <p>模型名</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>是否开启MCP</p>
    */
    @SerializedName("EnableMCP")
    @Expose
    private Boolean EnableMCP;

    /**
    * <p>模型规格</p>
    */
    @SerializedName("ModelSpec")
    @Expose
    private ManagedAIModelSpec ModelSpec;

    /**
    * <p>模型计费信息</p>
    */
    @SerializedName("ModelChargingInfo")
    @Expose
    private ManagedAIModelChargingInfo [] ModelChargingInfo;

    /**
     * Get <p>模型名</p> 
     * @return Model <p>模型名</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名</p>
     * @param Model <p>模型名</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>是否开启MCP</p> 
     * @return EnableMCP <p>是否开启MCP</p>
     */
    public Boolean getEnableMCP() {
        return this.EnableMCP;
    }

    /**
     * Set <p>是否开启MCP</p>
     * @param EnableMCP <p>是否开启MCP</p>
     */
    public void setEnableMCP(Boolean EnableMCP) {
        this.EnableMCP = EnableMCP;
    }

    /**
     * Get <p>模型规格</p> 
     * @return ModelSpec <p>模型规格</p>
     */
    public ManagedAIModelSpec getModelSpec() {
        return this.ModelSpec;
    }

    /**
     * Set <p>模型规格</p>
     * @param ModelSpec <p>模型规格</p>
     */
    public void setModelSpec(ManagedAIModelSpec ModelSpec) {
        this.ModelSpec = ModelSpec;
    }

    /**
     * Get <p>模型计费信息</p> 
     * @return ModelChargingInfo <p>模型计费信息</p>
     */
    public ManagedAIModelChargingInfo [] getModelChargingInfo() {
        return this.ModelChargingInfo;
    }

    /**
     * Set <p>模型计费信息</p>
     * @param ModelChargingInfo <p>模型计费信息</p>
     */
    public void setModelChargingInfo(ManagedAIModelChargingInfo [] ModelChargingInfo) {
        this.ModelChargingInfo = ModelChargingInfo;
    }

    public ManagedAIModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedAIModel(ManagedAIModel source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.EnableMCP != null) {
            this.EnableMCP = new Boolean(source.EnableMCP);
        }
        if (source.ModelSpec != null) {
            this.ModelSpec = new ManagedAIModelSpec(source.ModelSpec);
        }
        if (source.ModelChargingInfo != null) {
            this.ModelChargingInfo = new ManagedAIModelChargingInfo[source.ModelChargingInfo.length];
            for (int i = 0; i < source.ModelChargingInfo.length; i++) {
                this.ModelChargingInfo[i] = new ManagedAIModelChargingInfo(source.ModelChargingInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "EnableMCP", this.EnableMCP);
        this.setParamObj(map, prefix + "ModelSpec.", this.ModelSpec);
        this.setParamArrayObj(map, prefix + "ModelChargingInfo.", this.ModelChargingInfo);

    }
}

