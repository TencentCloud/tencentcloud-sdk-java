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

public class DescribeStreamLinkFlowRealtimeStatusRequest extends AbstractModel{

    /**
    * 流ID。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 输入id数组，如果输入输出数组都为空，则代表全量查询。
    */
    @SerializedName("InputIds")
    @Expose
    private String [] InputIds;

    /**
    * 输出id数组，如果输入输出数组都为空，则代表全量查询。
    */
    @SerializedName("OutputIds")
    @Expose
    private String [] OutputIds;

    /**
     * Get 流ID。 
     * @return FlowId 流ID。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流ID。
     * @param FlowId 流ID。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 输入id数组，如果输入输出数组都为空，则代表全量查询。 
     * @return InputIds 输入id数组，如果输入输出数组都为空，则代表全量查询。
     */
    public String [] getInputIds() {
        return this.InputIds;
    }

    /**
     * Set 输入id数组，如果输入输出数组都为空，则代表全量查询。
     * @param InputIds 输入id数组，如果输入输出数组都为空，则代表全量查询。
     */
    public void setInputIds(String [] InputIds) {
        this.InputIds = InputIds;
    }

    /**
     * Get 输出id数组，如果输入输出数组都为空，则代表全量查询。 
     * @return OutputIds 输出id数组，如果输入输出数组都为空，则代表全量查询。
     */
    public String [] getOutputIds() {
        return this.OutputIds;
    }

    /**
     * Set 输出id数组，如果输入输出数组都为空，则代表全量查询。
     * @param OutputIds 输出id数组，如果输入输出数组都为空，则代表全量查询。
     */
    public void setOutputIds(String [] OutputIds) {
        this.OutputIds = OutputIds;
    }

    public DescribeStreamLinkFlowRealtimeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowRealtimeStatusRequest(DescribeStreamLinkFlowRealtimeStatusRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.InputIds != null) {
            this.InputIds = new String[source.InputIds.length];
            for (int i = 0; i < source.InputIds.length; i++) {
                this.InputIds[i] = new String(source.InputIds[i]);
            }
        }
        if (source.OutputIds != null) {
            this.OutputIds = new String[source.OutputIds.length];
            for (int i = 0; i < source.OutputIds.length; i++) {
                this.OutputIds[i] = new String(source.OutputIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "InputIds.", this.InputIds);
        this.setParamArraySimple(map, prefix + "OutputIds.", this.OutputIds);

    }
}

