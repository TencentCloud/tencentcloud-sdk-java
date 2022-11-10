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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelAccelerateTaskResponse extends AbstractModel{

    /**
    * 模型加速任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAccelerateTask")
    @Expose
    private ModelAccelerateTask ModelAccelerateTask;

    /**
    * 模型加速时长，单位s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAccRuntimeInSecond")
    @Expose
    private Long ModelAccRuntimeInSecond;

    /**
    * 模型加速任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAccStartTime")
    @Expose
    private String ModelAccStartTime;

    /**
    * 模型加速任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAccEndTime")
    @Expose
    private String ModelAccEndTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模型加速任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAccelerateTask 模型加速任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelAccelerateTask getModelAccelerateTask() {
        return this.ModelAccelerateTask;
    }

    /**
     * Set 模型加速任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAccelerateTask 模型加速任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAccelerateTask(ModelAccelerateTask ModelAccelerateTask) {
        this.ModelAccelerateTask = ModelAccelerateTask;
    }

    /**
     * Get 模型加速时长，单位s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAccRuntimeInSecond 模型加速时长，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModelAccRuntimeInSecond() {
        return this.ModelAccRuntimeInSecond;
    }

    /**
     * Set 模型加速时长，单位s
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAccRuntimeInSecond 模型加速时长，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAccRuntimeInSecond(Long ModelAccRuntimeInSecond) {
        this.ModelAccRuntimeInSecond = ModelAccRuntimeInSecond;
    }

    /**
     * Get 模型加速任务开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAccStartTime 模型加速任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelAccStartTime() {
        return this.ModelAccStartTime;
    }

    /**
     * Set 模型加速任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAccStartTime 模型加速任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAccStartTime(String ModelAccStartTime) {
        this.ModelAccStartTime = ModelAccStartTime;
    }

    /**
     * Get 模型加速任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAccEndTime 模型加速任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelAccEndTime() {
        return this.ModelAccEndTime;
    }

    /**
     * Set 模型加速任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAccEndTime 模型加速任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAccEndTime(String ModelAccEndTime) {
        this.ModelAccEndTime = ModelAccEndTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeModelAccelerateTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelAccelerateTaskResponse(DescribeModelAccelerateTaskResponse source) {
        if (source.ModelAccelerateTask != null) {
            this.ModelAccelerateTask = new ModelAccelerateTask(source.ModelAccelerateTask);
        }
        if (source.ModelAccRuntimeInSecond != null) {
            this.ModelAccRuntimeInSecond = new Long(source.ModelAccRuntimeInSecond);
        }
        if (source.ModelAccStartTime != null) {
            this.ModelAccStartTime = new String(source.ModelAccStartTime);
        }
        if (source.ModelAccEndTime != null) {
            this.ModelAccEndTime = new String(source.ModelAccEndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ModelAccelerateTask.", this.ModelAccelerateTask);
        this.setParamSimple(map, prefix + "ModelAccRuntimeInSecond", this.ModelAccRuntimeInSecond);
        this.setParamSimple(map, prefix + "ModelAccStartTime", this.ModelAccStartTime);
        this.setParamSimple(map, prefix + "ModelAccEndTime", this.ModelAccEndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

