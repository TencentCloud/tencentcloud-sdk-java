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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteStreamLinkOutputRequest extends AbstractModel{

    /**
    * 流Id。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 输出Id。
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
     * Get 流Id。 
     * @return FlowId 流Id。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流Id。
     * @param FlowId 流Id。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 输出Id。 
     * @return OutputId 输出Id。
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set 输出Id。
     * @param OutputId 输出Id。
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

    public DeleteStreamLinkOutputRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStreamLinkOutputRequest(DeleteStreamLinkOutputRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.OutputId != null) {
            this.OutputId = new String(source.OutputId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "OutputId", this.OutputId);

    }
}

