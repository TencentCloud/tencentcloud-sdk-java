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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAnnotationResultsResponse extends AbstractModel {

    /**
    * <p>处理项 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>视频文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>处理项状态：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>失败原因，成功为空</p>
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * <p>标注结果 JSON 原文，非成功状态为空</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>标注结果字节数</p>
    */
    @SerializedName("ResultSize")
    @Expose
    private Long ResultSize;

    /**
    * <p>创建时间，Unix 时间戳（秒）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>完成时间，Unix 时间戳（秒），进行中为 0</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>处理项 ID</p> 
     * @return TaskId <p>处理项 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>处理项 ID</p>
     * @param TaskId <p>处理项 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>视频文件名</p> 
     * @return FileName <p>视频文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>视频文件名</p>
     * @param FileName <p>视频文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>处理项状态：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul> 
     * @return Status <p>处理项状态：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理项状态：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul>
     * @param Status <p>处理项状态：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>失败原因，成功为空</p> 
     * @return ErrorMsg <p>失败原因，成功为空</p>
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set <p>失败原因，成功为空</p>
     * @param ErrorMsg <p>失败原因，成功为空</p>
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get <p>标注结果 JSON 原文，非成功状态为空</p> 
     * @return Result <p>标注结果 JSON 原文，非成功状态为空</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>标注结果 JSON 原文，非成功状态为空</p>
     * @param Result <p>标注结果 JSON 原文，非成功状态为空</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>标注结果字节数</p> 
     * @return ResultSize <p>标注结果字节数</p>
     */
    public Long getResultSize() {
        return this.ResultSize;
    }

    /**
     * Set <p>标注结果字节数</p>
     * @param ResultSize <p>标注结果字节数</p>
     */
    public void setResultSize(Long ResultSize) {
        this.ResultSize = ResultSize;
    }

    /**
     * Get <p>创建时间，Unix 时间戳（秒）</p> 
     * @return CreateTime <p>创建时间，Unix 时间戳（秒）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，Unix 时间戳（秒）</p>
     * @param CreateTime <p>创建时间，Unix 时间戳（秒）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>完成时间，Unix 时间戳（秒），进行中为 0</p> 
     * @return FinishTime <p>完成时间，Unix 时间戳（秒），进行中为 0</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>完成时间，Unix 时间戳（秒），进行中为 0</p>
     * @param FinishTime <p>完成时间，Unix 时间戳（秒），进行中为 0</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
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

    public DescribeAnnotationResultsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAnnotationResultsResponse(DescribeAnnotationResultsResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ResultSize != null) {
            this.ResultSize = new Long(source.ResultSize);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ResultSize", this.ResultSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

