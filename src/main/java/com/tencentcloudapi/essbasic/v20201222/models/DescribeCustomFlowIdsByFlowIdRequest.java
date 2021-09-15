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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomFlowIdsByFlowIdRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 流程 id 列表，最多同时查询 10 个流程 id
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 流程 id 列表，最多同时查询 10 个流程 id 
     * @return FlowIds 流程 id 列表，最多同时查询 10 个流程 id
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 流程 id 列表，最多同时查询 10 个流程 id
     * @param FlowIds 流程 id 列表，最多同时查询 10 个流程 id
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    public DescribeCustomFlowIdsByFlowIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomFlowIdsByFlowIdRequest(DescribeCustomFlowIdsByFlowIdRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);

    }
}

