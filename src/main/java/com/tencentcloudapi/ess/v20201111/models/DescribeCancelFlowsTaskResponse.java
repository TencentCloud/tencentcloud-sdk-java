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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCancelFlowsTaskResponse extends AbstractModel {

    /**
    * 批量撤销任务编号，为32位字符串，通过接口[获取批量撤销签署流程腾讯电子签小程序链接](https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl)获得。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态，需要关注的状态
<ul><li>**PROCESSING**  - 任务执行中</li>
<li>**END** - 任务处理完成</li>
<li>**TIMEOUT** 任务超时未处理完成，用户未在批量撤销链接有效期内操作</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 批量撤销成功的签署流程编号
    */
    @SerializedName("SuccessFlowIds")
    @Expose
    private String [] SuccessFlowIds;

    /**
    * 批量撤销失败的签署流程信息
    */
    @SerializedName("FailureFlows")
    @Expose
    private CancelFailureFlow [] FailureFlows;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量撤销任务编号，为32位字符串，通过接口[获取批量撤销签署流程腾讯电子签小程序链接](https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl)获得。 
     * @return TaskId 批量撤销任务编号，为32位字符串，通过接口[获取批量撤销签署流程腾讯电子签小程序链接](https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl)获得。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 批量撤销任务编号，为32位字符串，通过接口[获取批量撤销签署流程腾讯电子签小程序链接](https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl)获得。
     * @param TaskId 批量撤销任务编号，为32位字符串，通过接口[获取批量撤销签署流程腾讯电子签小程序链接](https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl)获得。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态，需要关注的状态
<ul><li>**PROCESSING**  - 任务执行中</li>
<li>**END** - 任务处理完成</li>
<li>**TIMEOUT** 任务超时未处理完成，用户未在批量撤销链接有效期内操作</li></ul> 
     * @return TaskStatus 任务状态，需要关注的状态
<ul><li>**PROCESSING**  - 任务执行中</li>
<li>**END** - 任务处理完成</li>
<li>**TIMEOUT** 任务超时未处理完成，用户未在批量撤销链接有效期内操作</li></ul>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态，需要关注的状态
<ul><li>**PROCESSING**  - 任务执行中</li>
<li>**END** - 任务处理完成</li>
<li>**TIMEOUT** 任务超时未处理完成，用户未在批量撤销链接有效期内操作</li></ul>
     * @param TaskStatus 任务状态，需要关注的状态
<ul><li>**PROCESSING**  - 任务执行中</li>
<li>**END** - 任务处理完成</li>
<li>**TIMEOUT** 任务超时未处理完成，用户未在批量撤销链接有效期内操作</li></ul>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 批量撤销成功的签署流程编号 
     * @return SuccessFlowIds 批量撤销成功的签署流程编号
     */
    public String [] getSuccessFlowIds() {
        return this.SuccessFlowIds;
    }

    /**
     * Set 批量撤销成功的签署流程编号
     * @param SuccessFlowIds 批量撤销成功的签署流程编号
     */
    public void setSuccessFlowIds(String [] SuccessFlowIds) {
        this.SuccessFlowIds = SuccessFlowIds;
    }

    /**
     * Get 批量撤销失败的签署流程信息 
     * @return FailureFlows 批量撤销失败的签署流程信息
     */
    public CancelFailureFlow [] getFailureFlows() {
        return this.FailureFlows;
    }

    /**
     * Set 批量撤销失败的签署流程信息
     * @param FailureFlows 批量撤销失败的签署流程信息
     */
    public void setFailureFlows(CancelFailureFlow [] FailureFlows) {
        this.FailureFlows = FailureFlows;
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

    public DescribeCancelFlowsTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCancelFlowsTaskResponse(DescribeCancelFlowsTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.SuccessFlowIds != null) {
            this.SuccessFlowIds = new String[source.SuccessFlowIds.length];
            for (int i = 0; i < source.SuccessFlowIds.length; i++) {
                this.SuccessFlowIds[i] = new String(source.SuccessFlowIds[i]);
            }
        }
        if (source.FailureFlows != null) {
            this.FailureFlows = new CancelFailureFlow[source.FailureFlows.length];
            for (int i = 0; i < source.FailureFlows.length; i++) {
                this.FailureFlows[i] = new CancelFailureFlow(source.FailureFlows[i]);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "SuccessFlowIds.", this.SuccessFlowIds);
        this.setParamArrayObj(map, prefix + "FailureFlows.", this.FailureFlows);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

