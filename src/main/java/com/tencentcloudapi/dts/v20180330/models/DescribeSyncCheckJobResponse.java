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

public class DescribeSyncCheckJobResponse  extends AbstractModel{

    /**
    * 任务校验状态： starting(开始中)，running(校验中)，finished(校验完成)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务校验结果代码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Integer ErrorCode;

    /**
    * 提示信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 任务执行步骤描述
    */
    @SerializedName("StepInfo")
    @Expose
    private SyncCheckStepInfo [] StepInfo;

    /**
    * 校验标志：0（尚未校验成功） ， 1（校验成功）
    */
    @SerializedName("CheckFlag")
    @Expose
    private Integer CheckFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务校验状态： starting(开始中)，running(校验中)，finished(校验完成)
     * @return Status 任务校验状态： starting(开始中)，running(校验中)，finished(校验完成)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置任务校验状态： starting(开始中)，running(校验中)，finished(校验完成)
     * @param Status 任务校验状态： starting(开始中)，running(校验中)，finished(校验完成)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取任务校验结果代码
     * @return ErrorCode 任务校验结果代码
     */
    public Integer getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * 设置任务校验结果代码
     * @param ErrorCode 任务校验结果代码
     */
    public void setErrorCode(Integer ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * 获取提示信息
     * @return ErrorMessage 提示信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * 设置提示信息
     * @param ErrorMessage 提示信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * 获取任务执行步骤描述
     * @return StepInfo 任务执行步骤描述
     */
    public SyncCheckStepInfo [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * 设置任务执行步骤描述
     * @param StepInfo 任务执行步骤描述
     */
    public void setStepInfo(SyncCheckStepInfo [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * 获取校验标志：0（尚未校验成功） ， 1（校验成功）
     * @return CheckFlag 校验标志：0（尚未校验成功） ， 1（校验成功）
     */
    public Integer getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * 设置校验标志：0（尚未校验成功） ， 1（校验成功）
     * @param CheckFlag 校验标志：0（尚未校验成功） ， 1（校验成功）
     */
    public void setCheckFlag(Integer CheckFlag) {
        this.CheckFlag = CheckFlag;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

