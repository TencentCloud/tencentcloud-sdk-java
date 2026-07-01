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

public class ComputeConfigMapping extends AbstractModel {

    /**
    * <p>任务类型ID</p><p>枚举值：</p><ul><li>32： DLC_SQL</li><li>46： DLC_SPARK</li><li>50： DLC_PYSPARK</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * <p>存算配置项。当前支持：COMPUTE_ENGINE、DLC_ENGINE_RESOURCE_GROUP</p><p>枚举值：</p><ul><li>COMPUTE_ENGINE： DLC 标准计算引擎</li><li>DLC_ENGINE_RESOURCE_GROUP：  DLC 标准引擎资源组</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeConfigItem")
    @Expose
    private String ComputeConfigItem;

    /**
    * <p>指定任务列表，非空时表示任务级覆盖，当前仅支持 DLC_SQL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * <p>ComputeConfigItem=COMPUTE_ENGINE 时表示原引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示原 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceValue")
    @Expose
    private String SourceValue;

    /**
    * <p>ComputeConfigItem=COMPUTE_ENGINE 时表示目标引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示目标 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetValue")
    @Expose
    private String TargetValue;

    /**
     * Get <p>任务类型ID</p><p>枚举值：</p><ul><li>32： DLC_SQL</li><li>46： DLC_SPARK</li><li>50： DLC_PYSPARK</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId <p>任务类型ID</p><p>枚举值：</p><ul><li>32： DLC_SQL</li><li>46： DLC_SPARK</li><li>50： DLC_PYSPARK</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set <p>任务类型ID</p><p>枚举值：</p><ul><li>32： DLC_SQL</li><li>46： DLC_SPARK</li><li>50： DLC_PYSPARK</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId <p>任务类型ID</p><p>枚举值：</p><ul><li>32： DLC_SQL</li><li>46： DLC_SPARK</li><li>50： DLC_PYSPARK</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get <p>存算配置项。当前支持：COMPUTE_ENGINE、DLC_ENGINE_RESOURCE_GROUP</p><p>枚举值：</p><ul><li>COMPUTE_ENGINE： DLC 标准计算引擎</li><li>DLC_ENGINE_RESOURCE_GROUP：  DLC 标准引擎资源组</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeConfigItem <p>存算配置项。当前支持：COMPUTE_ENGINE、DLC_ENGINE_RESOURCE_GROUP</p><p>枚举值：</p><ul><li>COMPUTE_ENGINE： DLC 标准计算引擎</li><li>DLC_ENGINE_RESOURCE_GROUP：  DLC 标准引擎资源组</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeConfigItem() {
        return this.ComputeConfigItem;
    }

    /**
     * Set <p>存算配置项。当前支持：COMPUTE_ENGINE、DLC_ENGINE_RESOURCE_GROUP</p><p>枚举值：</p><ul><li>COMPUTE_ENGINE： DLC 标准计算引擎</li><li>DLC_ENGINE_RESOURCE_GROUP：  DLC 标准引擎资源组</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeConfigItem <p>存算配置项。当前支持：COMPUTE_ENGINE、DLC_ENGINE_RESOURCE_GROUP</p><p>枚举值：</p><ul><li>COMPUTE_ENGINE： DLC 标准计算引擎</li><li>DLC_ENGINE_RESOURCE_GROUP：  DLC 标准引擎资源组</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeConfigItem(String ComputeConfigItem) {
        this.ComputeConfigItem = ComputeConfigItem;
    }

    /**
     * Get <p>指定任务列表，非空时表示任务级覆盖，当前仅支持 DLC_SQL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskIds <p>指定任务列表，非空时表示任务级覆盖，当前仅支持 DLC_SQL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>指定任务列表，非空时表示任务级覆盖，当前仅支持 DLC_SQL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskIds <p>指定任务列表，非空时表示任务级覆盖，当前仅支持 DLC_SQL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get <p>ComputeConfigItem=COMPUTE_ENGINE 时表示原引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示原 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceValue <p>ComputeConfigItem=COMPUTE_ENGINE 时表示原引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示原 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceValue() {
        return this.SourceValue;
    }

    /**
     * Set <p>ComputeConfigItem=COMPUTE_ENGINE 时表示原引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示原 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceValue <p>ComputeConfigItem=COMPUTE_ENGINE 时表示原引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示原 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceValue(String SourceValue) {
        this.SourceValue = SourceValue;
    }

    /**
     * Get <p>ComputeConfigItem=COMPUTE_ENGINE 时表示目标引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示目标 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetValue <p>ComputeConfigItem=COMPUTE_ENGINE 时表示目标引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示目标 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetValue() {
        return this.TargetValue;
    }

    /**
     * Set <p>ComputeConfigItem=COMPUTE_ENGINE 时表示目标引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示目标 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetValue <p>ComputeConfigItem=COMPUTE_ENGINE 时表示目标引擎名；ComputeConfigItem=DLC_ENGINE_RESOURCE_GROUP 时表示目标 DLC 标准引擎资源组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetValue(String TargetValue) {
        this.TargetValue = TargetValue;
    }

    public ComputeConfigMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputeConfigMapping(ComputeConfigMapping source) {
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.ComputeConfigItem != null) {
            this.ComputeConfigItem = new String(source.ComputeConfigItem);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.SourceValue != null) {
            this.SourceValue = new String(source.SourceValue);
        }
        if (source.TargetValue != null) {
            this.TargetValue = new String(source.TargetValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "ComputeConfigItem", this.ComputeConfigItem);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "SourceValue", this.SourceValue);
        this.setParamSimple(map, prefix + "TargetValue", this.TargetValue);

    }
}

