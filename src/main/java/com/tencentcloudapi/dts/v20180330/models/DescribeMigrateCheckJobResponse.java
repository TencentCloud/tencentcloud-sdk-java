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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrateCheckJobResponse extends AbstractModel{

    /**
    * 校验任务状态：unavailable(当前不可用), starting(开始中)，running(校验中)，finished(校验完成)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务的错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 任务的错误信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Check任务总进度,如："30"表示30%
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * 校验是否通过,0-未通过，1-校验通过, 3-未校验
    */
    @SerializedName("CheckFlag")
    @Expose
    private Long CheckFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 校验任务状态：unavailable(当前不可用), starting(开始中)，running(校验中)，finished(校验完成) 
     * @return Status 校验任务状态：unavailable(当前不可用), starting(开始中)，running(校验中)，finished(校验完成)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 校验任务状态：unavailable(当前不可用), starting(开始中)，running(校验中)，finished(校验完成)
     * @param Status 校验任务状态：unavailable(当前不可用), starting(开始中)，running(校验中)，finished(校验完成)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务的错误码 
     * @return ErrorCode 任务的错误码
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 任务的错误码
     * @param ErrorCode 任务的错误码
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 任务的错误信息 
     * @return ErrorMessage 任务的错误信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 任务的错误信息
     * @param ErrorMessage 任务的错误信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Check任务总进度,如："30"表示30% 
     * @return Progress Check任务总进度,如："30"表示30%
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set Check任务总进度,如："30"表示30%
     * @param Progress Check任务总进度,如："30"表示30%
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 校验是否通过,0-未通过，1-校验通过, 3-未校验 
     * @return CheckFlag 校验是否通过,0-未通过，1-校验通过, 3-未校验
     */
    public Long getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * Set 校验是否通过,0-未通过，1-校验通过, 3-未校验
     * @param CheckFlag 校验是否通过,0-未通过，1-校验通过, 3-未校验
     */
    public void setCheckFlag(Long CheckFlag) {
        this.CheckFlag = CheckFlag;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

