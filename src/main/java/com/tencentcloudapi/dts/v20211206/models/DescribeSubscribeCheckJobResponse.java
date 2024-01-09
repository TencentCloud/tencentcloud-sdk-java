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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeCheckJobResponse extends AbstractModel {

    /**
    * 订阅实例ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 失败或者报错提示，成功则提示success。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务运行状态，可能值为 running,failed,success
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前总体进度，范围 0~100
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 校验总步骤数
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * 当前执行步骤
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * 各个步骤运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Steps")
    @Expose
    private SubscribeCheckStepInfo [] Steps;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 订阅实例ID 
     * @return SubscribeId 订阅实例ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 订阅实例ID
     * @param SubscribeId 订阅实例ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 失败或者报错提示，成功则提示success。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 失败或者报错提示，成功则提示success。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 失败或者报错提示，成功则提示success。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 失败或者报错提示，成功则提示success。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务运行状态，可能值为 running,failed,success 
     * @return Status 任务运行状态，可能值为 running,failed,success
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务运行状态，可能值为 running,failed,success
     * @param Status 任务运行状态，可能值为 running,failed,success
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前总体进度，范围 0~100 
     * @return Progress 当前总体进度，范围 0~100
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 当前总体进度，范围 0~100
     * @param Progress 当前总体进度，范围 0~100
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 校验总步骤数 
     * @return StepAll 校验总步骤数
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set 校验总步骤数
     * @param StepAll 校验总步骤数
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get 当前执行步骤 
     * @return StepNow 当前执行步骤
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set 当前执行步骤
     * @param StepNow 当前执行步骤
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get 各个步骤运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Steps 各个步骤运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubscribeCheckStepInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set 各个步骤运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Steps 各个步骤运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSteps(SubscribeCheckStepInfo [] Steps) {
        this.Steps = Steps;
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

    public DescribeSubscribeCheckJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeCheckJobResponse(DescribeSubscribeCheckJobResponse source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.Steps != null) {
            this.Steps = new SubscribeCheckStepInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new SubscribeCheckStepInfo(source.Steps[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

