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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkflowRunResponse extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 工作流运行实例的ID
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * 运行环境。0: 测试环境； 1: 正式环境
    */
    @SerializedName("RunEnv")
    @Expose
    private Long RunEnv;

    /**
    * 用户输入的内容
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * API参数配置
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * 创建时间（毫秒时间戳）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用ID 
     * @return AppBizId 应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
     * @param AppBizId 应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 工作流运行实例的ID 
     * @return WorkflowRunId 工作流运行实例的ID
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set 工作流运行实例的ID
     * @param WorkflowRunId 工作流运行实例的ID
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get 运行环境。0: 测试环境； 1: 正式环境 
     * @return RunEnv 运行环境。0: 测试环境； 1: 正式环境
     */
    public Long getRunEnv() {
        return this.RunEnv;
    }

    /**
     * Set 运行环境。0: 测试环境； 1: 正式环境
     * @param RunEnv 运行环境。0: 测试环境； 1: 正式环境
     */
    public void setRunEnv(Long RunEnv) {
        this.RunEnv = RunEnv;
    }

    /**
     * Get 用户输入的内容 
     * @return Query 用户输入的内容
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 用户输入的内容
     * @param Query 用户输入的内容
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get API参数配置 
     * @return CustomVariables API参数配置
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set API参数配置
     * @param CustomVariables API参数配置
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get 创建时间（毫秒时间戳） 
     * @return CreateTime 创建时间（毫秒时间戳）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间（毫秒时间戳）
     * @param CreateTime 创建时间（毫秒时间戳）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    public CreateWorkflowRunResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkflowRunResponse(CreateWorkflowRunResponse source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.RunEnv != null) {
            this.RunEnv = new Long(source.RunEnv);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new CustomVariable[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new CustomVariable(source.CustomVariables[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "RunEnv", this.RunEnv);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

