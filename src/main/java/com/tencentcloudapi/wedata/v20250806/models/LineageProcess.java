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

public class LineageProcess extends AbstractModel {

    /**
    * 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessId")
    @Expose
    private String ProcessId;

    /**
    * 任务类型
    //调度任务
    SCHEDULE_TASK,
    //集成任务
    INTEGRATION_TASK,
    //第三方上报
    THIRD_REPORT,
    //数据建模
    TABLE_MODEL,
    //模型创建指标
    MODEL_METRIC,
    //原子指标创建衍生指标
    METRIC_METRIC,
    //数据服务
    DATA_SERVICE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * WEDATA, THIRD;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 任务子类型
 SQL_TASK,
    //集成实时任务血缘
    INTEGRATED_STREAM,
    //集成离线任务血缘
    INTEGRATED_OFFLINE;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessSubType")
    @Expose
    private String ProcessSubType;

    /**
    * 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessProperties")
    @Expose
    private LineageProperty [] ProcessProperties;

    /**
    * 血缘任务唯一节点ID
    */
    @SerializedName("LineageNodeId")
    @Expose
    private String LineageNodeId;

    /**
     * Get 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessId 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessId 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessId(String ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 任务类型
    //调度任务
    SCHEDULE_TASK,
    //集成任务
    INTEGRATION_TASK,
    //第三方上报
    THIRD_REPORT,
    //数据建模
    TABLE_MODEL,
    //模型创建指标
    MODEL_METRIC,
    //原子指标创建衍生指标
    METRIC_METRIC,
    //数据服务
    DATA_SERVICE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessType 任务类型
    //调度任务
    SCHEDULE_TASK,
    //集成任务
    INTEGRATION_TASK,
    //第三方上报
    THIRD_REPORT,
    //数据建模
    TABLE_MODEL,
    //模型创建指标
    MODEL_METRIC,
    //原子指标创建衍生指标
    METRIC_METRIC,
    //数据服务
    DATA_SERVICE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 任务类型
    //调度任务
    SCHEDULE_TASK,
    //集成任务
    INTEGRATION_TASK,
    //第三方上报
    THIRD_REPORT,
    //数据建模
    TABLE_MODEL,
    //模型创建指标
    MODEL_METRIC,
    //原子指标创建衍生指标
    METRIC_METRIC,
    //数据服务
    DATA_SERVICE
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessType 任务类型
    //调度任务
    SCHEDULE_TASK,
    //集成任务
    INTEGRATION_TASK,
    //第三方上报
    THIRD_REPORT,
    //数据建模
    TABLE_MODEL,
    //模型创建指标
    MODEL_METRIC,
    //原子指标创建衍生指标
    METRIC_METRIC,
    //数据服务
    DATA_SERVICE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get WEDATA, THIRD;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Platform WEDATA, THIRD;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set WEDATA, THIRD;
注意：此字段可能返回 null，表示取不到有效值。
     * @param Platform WEDATA, THIRD;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 任务子类型
 SQL_TASK,
    //集成实时任务血缘
    INTEGRATED_STREAM,
    //集成离线任务血缘
    INTEGRATED_OFFLINE;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessSubType 任务子类型
 SQL_TASK,
    //集成实时任务血缘
    INTEGRATED_STREAM,
    //集成离线任务血缘
    INTEGRATED_OFFLINE;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessSubType() {
        return this.ProcessSubType;
    }

    /**
     * Set 任务子类型
 SQL_TASK,
    //集成实时任务血缘
    INTEGRATED_STREAM,
    //集成离线任务血缘
    INTEGRATED_OFFLINE;
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessSubType 任务子类型
 SQL_TASK,
    //集成实时任务血缘
    INTEGRATED_STREAM,
    //集成离线任务血缘
    INTEGRATED_OFFLINE;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessSubType(String ProcessSubType) {
        this.ProcessSubType = ProcessSubType;
    }

    /**
     * Get 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessProperties 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageProperty [] getProcessProperties() {
        return this.ProcessProperties;
    }

    /**
     * Set 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessProperties 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessProperties(LineageProperty [] ProcessProperties) {
        this.ProcessProperties = ProcessProperties;
    }

    /**
     * Get 血缘任务唯一节点ID 
     * @return LineageNodeId 血缘任务唯一节点ID
     */
    public String getLineageNodeId() {
        return this.LineageNodeId;
    }

    /**
     * Set 血缘任务唯一节点ID
     * @param LineageNodeId 血缘任务唯一节点ID
     */
    public void setLineageNodeId(String LineageNodeId) {
        this.LineageNodeId = LineageNodeId;
    }

    public LineageProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageProcess(LineageProcess source) {
        if (source.ProcessId != null) {
            this.ProcessId = new String(source.ProcessId);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProcessSubType != null) {
            this.ProcessSubType = new String(source.ProcessSubType);
        }
        if (source.ProcessProperties != null) {
            this.ProcessProperties = new LineageProperty[source.ProcessProperties.length];
            for (int i = 0; i < source.ProcessProperties.length; i++) {
                this.ProcessProperties[i] = new LineageProperty(source.ProcessProperties[i]);
            }
        }
        if (source.LineageNodeId != null) {
            this.LineageNodeId = new String(source.LineageNodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProcessSubType", this.ProcessSubType);
        this.setParamArrayObj(map, prefix + "ProcessProperties.", this.ProcessProperties);
        this.setParamSimple(map, prefix + "LineageNodeId", this.LineageNodeId);

    }
}

