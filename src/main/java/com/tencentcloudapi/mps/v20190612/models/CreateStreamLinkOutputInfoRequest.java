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

public class CreateStreamLinkOutputInfoRequest extends AbstractModel{

    /**
    * 传输流Id。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 传输流的Output配置。
    */
    @SerializedName("Output")
    @Expose
    private CreateOutputInfo Output;

    /**
     * Get 传输流Id。 
     * @return FlowId 传输流Id。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 传输流Id。
     * @param FlowId 传输流Id。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 传输流的Output配置。 
     * @return Output 传输流的Output配置。
     */
    public CreateOutputInfo getOutput() {
        return this.Output;
    }

    /**
     * Set 传输流的Output配置。
     * @param Output 传输流的Output配置。
     */
    public void setOutput(CreateOutputInfo Output) {
        this.Output = Output;
    }

    public CreateStreamLinkOutputInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLinkOutputInfoRequest(CreateStreamLinkOutputInfoRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Output != null) {
            this.Output = new CreateOutputInfo(source.Output);
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

