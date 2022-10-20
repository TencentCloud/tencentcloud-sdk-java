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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusInstanceInitStatusResponse extends AbstractModel{

    /**
    * 实例初始化状态，取值：
uninitialized 未初始化 
initializing 初始化中
running 初始化完成，运行中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 初始化任务步骤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Steps")
    @Expose
    private TaskStepInfo [] Steps;

    /**
    * 实例eks集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EksClusterId")
    @Expose
    private String EksClusterId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例初始化状态，取值：
uninitialized 未初始化 
initializing 初始化中
running 初始化完成，运行中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例初始化状态，取值：
uninitialized 未初始化 
initializing 初始化中
running 初始化完成，运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例初始化状态，取值：
uninitialized 未初始化 
initializing 初始化中
running 初始化完成，运行中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例初始化状态，取值：
uninitialized 未初始化 
initializing 初始化中
running 初始化完成，运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 初始化任务步骤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Steps 初始化任务步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskStepInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set 初始化任务步骤
注意：此字段可能返回 null，表示取不到有效值。
     * @param Steps 初始化任务步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSteps(TaskStepInfo [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get 实例eks集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EksClusterId 实例eks集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEksClusterId() {
        return this.EksClusterId;
    }

    /**
     * Set 实例eks集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EksClusterId 实例eks集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEksClusterId(String EksClusterId) {
        this.EksClusterId = EksClusterId;
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

    public DescribePrometheusInstanceInitStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstanceInitStatusResponse(DescribePrometheusInstanceInitStatusResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Steps != null) {
            this.Steps = new TaskStepInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new TaskStepInfo(source.Steps[i]);
            }
        }
        if (source.EksClusterId != null) {
            this.EksClusterId = new String(source.EksClusterId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "EksClusterId", this.EksClusterId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

