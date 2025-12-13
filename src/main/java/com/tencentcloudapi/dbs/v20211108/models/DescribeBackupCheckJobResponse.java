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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupCheckJobResponse extends AbstractModel {

    /**
    * 校验任务状态。可能的取值为："finished" - 已完成; "running" - 进行中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务进度。取值范围为[0, 100]，表示任务完成的百分比。例如：30表示任务完成30%。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 校验是否通过标记。可能的取值为："1" - 校验通过;"0" - 校验未通过。
    */
    @SerializedName("CheckFlag")
    @Expose
    private Long CheckFlag;

    /**
    * 错误信息。
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 校验任务状态。可能的取值为："finished" - 已完成; "running" - 进行中。 
     * @return Status 校验任务状态。可能的取值为："finished" - 已完成; "running" - 进行中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 校验任务状态。可能的取值为："finished" - 已完成; "running" - 进行中。
     * @param Status 校验任务状态。可能的取值为："finished" - 已完成; "running" - 进行中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务进度。取值范围为[0, 100]，表示任务完成的百分比。例如：30表示任务完成30%。 
     * @return Progress 任务进度。取值范围为[0, 100]，表示任务完成的百分比。例如：30表示任务完成30%。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度。取值范围为[0, 100]，表示任务完成的百分比。例如：30表示任务完成30%。
     * @param Progress 任务进度。取值范围为[0, 100]，表示任务完成的百分比。例如：30表示任务完成30%。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 校验是否通过标记。可能的取值为："1" - 校验通过;"0" - 校验未通过。 
     * @return CheckFlag 校验是否通过标记。可能的取值为："1" - 校验通过;"0" - 校验未通过。
     */
    public Long getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * Set 校验是否通过标记。可能的取值为："1" - 校验通过;"0" - 校验未通过。
     * @param CheckFlag 校验是否通过标记。可能的取值为："1" - 校验通过;"0" - 校验未通过。
     */
    public void setCheckFlag(Long CheckFlag) {
        this.CheckFlag = CheckFlag;
    }

    /**
     * Get 错误信息。 
     * @return ErrMessage 错误信息。
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set 错误信息。
     * @param ErrMessage 错误信息。
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
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

    public DescribeBackupCheckJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupCheckJobResponse(DescribeBackupCheckJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CheckFlag != null) {
            this.CheckFlag = new Long(source.CheckFlag);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

