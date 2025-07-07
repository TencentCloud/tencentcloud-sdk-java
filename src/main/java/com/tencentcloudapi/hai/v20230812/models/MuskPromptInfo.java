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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MuskPromptInfo extends AbstractModel {

    /**
    * workflow id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * workgroup id
    */
    @SerializedName("WorkgroupId")
    @Expose
    private String WorkgroupId;

    /**
    * prompt id
    */
    @SerializedName("PromptId")
    @Expose
    private String PromptId;

    /**
    * 生成的内容
    */
    @SerializedName("OutputResource")
    @Expose
    private String [] OutputResource;

    /**
    * prompt status 
0: 执行中
1: 执行成功
2: 执行失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 任务执行耗时，单位毫秒
    */
    @SerializedName("Cost")
    @Expose
    private Long Cost;

    /**
    * 任务执行失败错误信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get workflow id 
     * @return WorkflowId workflow id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set workflow id
     * @param WorkflowId workflow id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get workgroup id 
     * @return WorkgroupId workgroup id
     */
    public String getWorkgroupId() {
        return this.WorkgroupId;
    }

    /**
     * Set workgroup id
     * @param WorkgroupId workgroup id
     */
    public void setWorkgroupId(String WorkgroupId) {
        this.WorkgroupId = WorkgroupId;
    }

    /**
     * Get prompt id 
     * @return PromptId prompt id
     */
    public String getPromptId() {
        return this.PromptId;
    }

    /**
     * Set prompt id
     * @param PromptId prompt id
     */
    public void setPromptId(String PromptId) {
        this.PromptId = PromptId;
    }

    /**
     * Get 生成的内容 
     * @return OutputResource 生成的内容
     */
    public String [] getOutputResource() {
        return this.OutputResource;
    }

    /**
     * Set 生成的内容
     * @param OutputResource 生成的内容
     */
    public void setOutputResource(String [] OutputResource) {
        this.OutputResource = OutputResource;
    }

    /**
     * Get prompt status 
0: 执行中
1: 执行成功
2: 执行失败 
     * @return Status prompt status 
0: 执行中
1: 执行成功
2: 执行失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set prompt status 
0: 执行中
1: 执行成功
2: 执行失败
     * @param Status prompt status 
0: 执行中
1: 执行成功
2: 执行失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 任务执行耗时，单位毫秒 
     * @return Cost 任务执行耗时，单位毫秒
     */
    public Long getCost() {
        return this.Cost;
    }

    /**
     * Set 任务执行耗时，单位毫秒
     * @param Cost 任务执行耗时，单位毫秒
     */
    public void setCost(Long Cost) {
        this.Cost = Cost;
    }

    /**
     * Get 任务执行失败错误信息 
     * @return ErrorMessage 任务执行失败错误信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 任务执行失败错误信息
     * @param ErrorMessage 任务执行失败错误信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public MuskPromptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MuskPromptInfo(MuskPromptInfo source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkgroupId != null) {
            this.WorkgroupId = new String(source.WorkgroupId);
        }
        if (source.PromptId != null) {
            this.PromptId = new String(source.PromptId);
        }
        if (source.OutputResource != null) {
            this.OutputResource = new String[source.OutputResource.length];
            for (int i = 0; i < source.OutputResource.length; i++) {
                this.OutputResource[i] = new String(source.OutputResource[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Cost != null) {
            this.Cost = new Long(source.Cost);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkgroupId", this.WorkgroupId);
        this.setParamSimple(map, prefix + "PromptId", this.PromptId);
        this.setParamArraySimple(map, prefix + "OutputResource.", this.OutputResource);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

