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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MakePlanTaskOpsDto extends AbstractModel {

    /**
    * 任务基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskBaseInfo")
    @Expose
    private TaskOpsDto TaskBaseInfo;

    /**
    * 补录该任务当前已生成的实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 补录任务实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompletePercent")
    @Expose
    private Long CompletePercent;

    /**
    * 补录任务实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Long SuccessPercent;

    /**
    * 预计生成的总实例个数，由于是异步生成，-1代表实例还未完完全生成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTotalCount")
    @Expose
    private Long InstanceTotalCount;

    /**
     * Get 任务基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskBaseInfo 任务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOpsDto getTaskBaseInfo() {
        return this.TaskBaseInfo;
    }

    /**
     * Set 任务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskBaseInfo 任务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskBaseInfo(TaskOpsDto TaskBaseInfo) {
        this.TaskBaseInfo = TaskBaseInfo;
    }

    /**
     * Get 补录该任务当前已生成的实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCount 补录该任务当前已生成的实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 补录该任务当前已生成的实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount 补录该任务当前已生成的实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 补录任务实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompletePercent 补录任务实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompletePercent() {
        return this.CompletePercent;
    }

    /**
     * Set 补录任务实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompletePercent 补录任务实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompletePercent(Long CompletePercent) {
        this.CompletePercent = CompletePercent;
    }

    /**
     * Get 补录任务实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessPercent 补录任务实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set 补录任务实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessPercent 补录任务实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessPercent(Long SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get 预计生成的总实例个数，由于是异步生成，-1代表实例还未完完全生成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTotalCount 预计生成的总实例个数，由于是异步生成，-1代表实例还未完完全生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceTotalCount() {
        return this.InstanceTotalCount;
    }

    /**
     * Set 预计生成的总实例个数，由于是异步生成，-1代表实例还未完完全生成
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTotalCount 预计生成的总实例个数，由于是异步生成，-1代表实例还未完完全生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTotalCount(Long InstanceTotalCount) {
        this.InstanceTotalCount = InstanceTotalCount;
    }

    public MakePlanTaskOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MakePlanTaskOpsDto(MakePlanTaskOpsDto source) {
        if (source.TaskBaseInfo != null) {
            this.TaskBaseInfo = new TaskOpsDto(source.TaskBaseInfo);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.CompletePercent != null) {
            this.CompletePercent = new Long(source.CompletePercent);
        }
        if (source.SuccessPercent != null) {
            this.SuccessPercent = new Long(source.SuccessPercent);
        }
        if (source.InstanceTotalCount != null) {
            this.InstanceTotalCount = new Long(source.InstanceTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskBaseInfo.", this.TaskBaseInfo);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "CompletePercent", this.CompletePercent);
        this.setParamSimple(map, prefix + "SuccessPercent", this.SuccessPercent);
        this.setParamSimple(map, prefix + "InstanceTotalCount", this.InstanceTotalCount);

    }
}

