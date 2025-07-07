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

public class CreateStreamLinkInputRequest extends AbstractModel {

    /**
    * 媒体传输流ID。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流的输入组。
    */
    @SerializedName("InputGroup")
    @Expose
    private CreateInput [] InputGroup;

    /**
     * Get 媒体传输流ID。 
     * @return FlowId 媒体传输流ID。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 媒体传输流ID。
     * @param FlowId 媒体传输流ID。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 流的输入组。 
     * @return InputGroup 流的输入组。
     */
    public CreateInput [] getInputGroup() {
        return this.InputGroup;
    }

    /**
     * Set 流的输入组。
     * @param InputGroup 流的输入组。
     */
    public void setInputGroup(CreateInput [] InputGroup) {
        this.InputGroup = InputGroup;
    }

    public CreateStreamLinkInputRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLinkInputRequest(CreateStreamLinkInputRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.InputGroup != null) {
            this.InputGroup = new CreateInput[source.InputGroup.length];
            for (int i = 0; i < source.InputGroup.length; i++) {
                this.InputGroup[i] = new CreateInput(source.InputGroup[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "InputGroup.", this.InputGroup);

    }
}

