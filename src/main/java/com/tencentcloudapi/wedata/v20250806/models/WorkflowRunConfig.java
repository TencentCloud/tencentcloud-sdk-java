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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunConfig extends AbstractModel {

    /**
    * <p>工作流运行最大并发数，取值范围：[1, 1000]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConcurrentNum")
    @Expose
    private Long MaxConcurrentNum;

    /**
    * <p>1：开启  0：关闭<br>当工作流达到最大并发上限时，若开启，新工作流运行排队等待，直到其他运行释放并发，最大等待时长为48小时，超过则自动跳过不再执行；若关闭，新工作流直接跳过结束。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueuingMode")
    @Expose
    private Long QueuingMode;

    /**
     * Get <p>工作流运行最大并发数，取值范围：[1, 1000]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConcurrentNum <p>工作流运行最大并发数，取值范围：[1, 1000]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConcurrentNum() {
        return this.MaxConcurrentNum;
    }

    /**
     * Set <p>工作流运行最大并发数，取值范围：[1, 1000]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConcurrentNum <p>工作流运行最大并发数，取值范围：[1, 1000]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConcurrentNum(Long MaxConcurrentNum) {
        this.MaxConcurrentNum = MaxConcurrentNum;
    }

    /**
     * Get <p>1：开启  0：关闭<br>当工作流达到最大并发上限时，若开启，新工作流运行排队等待，直到其他运行释放并发，最大等待时长为48小时，超过则自动跳过不再执行；若关闭，新工作流直接跳过结束。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueuingMode <p>1：开启  0：关闭<br>当工作流达到最大并发上限时，若开启，新工作流运行排队等待，直到其他运行释放并发，最大等待时长为48小时，超过则自动跳过不再执行；若关闭，新工作流直接跳过结束。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueuingMode() {
        return this.QueuingMode;
    }

    /**
     * Set <p>1：开启  0：关闭<br>当工作流达到最大并发上限时，若开启，新工作流运行排队等待，直到其他运行释放并发，最大等待时长为48小时，超过则自动跳过不再执行；若关闭，新工作流直接跳过结束。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueuingMode <p>1：开启  0：关闭<br>当工作流达到最大并发上限时，若开启，新工作流运行排队等待，直到其他运行释放并发，最大等待时长为48小时，超过则自动跳过不再执行；若关闭，新工作流直接跳过结束。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueuingMode(Long QueuingMode) {
        this.QueuingMode = QueuingMode;
    }

    public WorkflowRunConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunConfig(WorkflowRunConfig source) {
        if (source.MaxConcurrentNum != null) {
            this.MaxConcurrentNum = new Long(source.MaxConcurrentNum);
        }
        if (source.QueuingMode != null) {
            this.QueuingMode = new Long(source.QueuingMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxConcurrentNum", this.MaxConcurrentNum);
        this.setParamSimple(map, prefix + "QueuingMode", this.QueuingMode);

    }
}

