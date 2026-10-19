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

public class NodeRunExecution extends AbstractModel {

    /**
    * <p>批次运行汇总</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchRunSummary")
    @Expose
    private BatchRunSummary BatchRunSummary;

    /**
    * <p>结束时间（毫秒时间戳）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>开始时间（毫秒时间戳）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get <p>批次运行汇总</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchRunSummary <p>批次运行汇总</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BatchRunSummary getBatchRunSummary() {
        return this.BatchRunSummary;
    }

    /**
     * Set <p>批次运行汇总</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchRunSummary <p>批次运行汇总</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchRunSummary(BatchRunSummary BatchRunSummary) {
        this.BatchRunSummary = BatchRunSummary;
    }

    /**
     * Get <p>结束时间（毫秒时间戳）</p> 
     * @return EndTime <p>结束时间（毫秒时间戳）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间（毫秒时间戳）</p>
     * @param EndTime <p>结束时间（毫秒时间戳）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>开始时间（毫秒时间戳）</p> 
     * @return StartTime <p>开始时间（毫秒时间戳）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间（毫秒时间戳）</p>
     * @param StartTime <p>开始时间（毫秒时间戳）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public NodeRunExecution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRunExecution(NodeRunExecution source) {
        if (source.BatchRunSummary != null) {
            this.BatchRunSummary = new BatchRunSummary(source.BatchRunSummary);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BatchRunSummary.", this.BatchRunSummary);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

