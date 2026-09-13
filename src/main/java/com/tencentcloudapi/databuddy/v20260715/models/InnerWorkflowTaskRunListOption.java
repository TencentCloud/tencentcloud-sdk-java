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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InnerWorkflowTaskRunListOption extends AbstractModel {

    /**
    * <p>分页页码，从 1 开始。非必填，默认 1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>迭代运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 InnerWorkflowTaskRunIteration.RunState 字段返回值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunStates")
    @Expose
    private String [] RunStates;

    /**
     * Get <p>分页页码，从 1 开始。非必填，默认 1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber <p>分页页码，从 1 开始。非必填，默认 1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码，从 1 开始。非必填，默认 1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber <p>分页页码，从 1 开始。非必填，默认 1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>迭代运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 InnerWorkflowTaskRunIteration.RunState 字段返回值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunStates <p>迭代运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 InnerWorkflowTaskRunIteration.RunState 字段返回值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRunStates() {
        return this.RunStates;
    }

    /**
     * Set <p>迭代运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 InnerWorkflowTaskRunIteration.RunState 字段返回值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunStates <p>迭代运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 InnerWorkflowTaskRunIteration.RunState 字段返回值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunStates(String [] RunStates) {
        this.RunStates = RunStates;
    }

    public InnerWorkflowTaskRunListOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InnerWorkflowTaskRunListOption(InnerWorkflowTaskRunListOption source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.RunStates != null) {
            this.RunStates = new String[source.RunStates.length];
            for (int i = 0; i < source.RunStates.length; i++) {
                this.RunStates[i] = new String(source.RunStates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "RunStates.", this.RunStates);

    }
}

