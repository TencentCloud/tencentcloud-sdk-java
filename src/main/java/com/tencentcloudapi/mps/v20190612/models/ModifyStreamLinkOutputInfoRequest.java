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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamLinkOutputInfoRequest extends AbstractModel {

    /**
    * 流Id。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 需要修改的Output配置。
    */
    @SerializedName("Output")
    @Expose
    private ModifyOutputInfo Output;

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
     * Get 需要修改的Output配置。 
     * @return Output 需要修改的Output配置。
     */
    public ModifyOutputInfo getOutput() {
        return this.Output;
    }

    /**
     * Set 需要修改的Output配置。
     * @param Output 需要修改的Output配置。
     */
    public void setOutput(ModifyOutputInfo Output) {
        this.Output = Output;
    }

    public ModifyStreamLinkOutputInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLinkOutputInfoRequest(ModifyStreamLinkOutputInfoRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Output != null) {
            this.Output = new ModifyOutputInfo(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

