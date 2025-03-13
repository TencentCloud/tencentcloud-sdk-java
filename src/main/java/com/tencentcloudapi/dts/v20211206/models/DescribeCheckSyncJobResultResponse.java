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

public class DescribeCheckSyncJobResultResponse extends AbstractModel {

    /**
    * 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 步骤总数
    */
    @SerializedName("StepCount")
    @Expose
    private Long StepCount;

    /**
    * 当前所在步骤
    */
    @SerializedName("StepCur")
    @Expose
    private Long StepCur;

    /**
    * 总体进度，范围为[0,100]
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepInfos")
    @Expose
    private StepInfo [] StepInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功) 
     * @return Status 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
     * @param Status 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 步骤总数 
     * @return StepCount 步骤总数
     */
    public Long getStepCount() {
        return this.StepCount;
    }

    /**
     * Set 步骤总数
     * @param StepCount 步骤总数
     */
    public void setStepCount(Long StepCount) {
        this.StepCount = StepCount;
    }

    /**
     * Get 当前所在步骤 
     * @return StepCur 当前所在步骤
     */
    public Long getStepCur() {
        return this.StepCur;
    }

    /**
     * Set 当前所在步骤
     * @param StepCur 当前所在步骤
     */
    public void setStepCur(Long StepCur) {
        this.StepCur = StepCur;
    }

    /**
     * Get 总体进度，范围为[0,100] 
     * @return Progress 总体进度，范围为[0,100]
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 总体进度，范围为[0,100]
     * @param Progress 总体进度，范围为[0,100]
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 步骤信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepInfos 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepInfo [] getStepInfos() {
        return this.StepInfos;
    }

    /**
     * Set 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepInfos 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepInfos(StepInfo [] StepInfos) {
        this.StepInfos = StepInfos;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCheckSyncJobResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCheckSyncJobResultResponse(DescribeCheckSyncJobResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StepCount != null) {
            this.StepCount = new Long(source.StepCount);
        }
        if (source.StepCur != null) {
            this.StepCur = new Long(source.StepCur);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StepInfos != null) {
            this.StepInfos = new StepInfo[source.StepInfos.length];
            for (int i = 0; i < source.StepInfos.length; i++) {
                this.StepInfos[i] = new StepInfo(source.StepInfos[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StepCount", this.StepCount);
        this.setParamSimple(map, prefix + "StepCur", this.StepCur);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamArrayObj(map, prefix + "StepInfos.", this.StepInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

