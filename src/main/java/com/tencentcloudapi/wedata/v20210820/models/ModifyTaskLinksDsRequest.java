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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTaskLinksDsRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 父任务ID
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * 子任务ID
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * 子任务工作流
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 父任务工作流
    */
    @SerializedName("RealFromWorkflowId")
    @Expose
    private String RealFromWorkflowId;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 父子任务之间的依赖关系
    正常的依赖父任务全部实例  启用
    normal_all(1),
    normal_first_one(2), 正常的依赖父任务 第一个
    normal_last_one(3), 正常的依赖父任务 最后一个
    normal_any_one(4), 正常的依赖父任务 任意一个
    normal_specific_one(5), 正常的依赖父任务 指定的一个
    self(6), 自身依赖，可能用不到

     非正常的依赖父任务全部实例  启用（向前依赖  明天)
    non_normal_all_forward(11),
    non_normal_first_one_forward(12), 非正常的依赖父任务 第一个
    non_normal_last_one_forward(13), 非正常的依赖父任务 最后一个
    non_normal_any_one_forward(14), 非正常的依赖父任务 任意一个
    non_normal_specific_one_forward(15),非正常的依赖父任务 指定一个

    非正常的依赖父任务全部实例  启用（向后依赖 昨天）
    non_normal_all_backward(21),
    non_normal_first_one_backward(22), 非正常的依赖父任务 第一个
    non_normal_last_one_backward(23), 非正常的依赖父任务 最后一个
    non_normal_any_one_backward(24), 非正常的依赖父任务 任意一个
    non_normal_specific_one_backward(25) 非正常的依赖父任务 指定一个
    */
    @SerializedName("LinkDependencyType")
    @Expose
    private String LinkDependencyType;

    /**
    * 额外的属性信息 如分支节点、归并节点信息
    */
    @SerializedName("LinkExt")
    @Expose
    private String LinkExt;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 父任务ID 
     * @return TaskFrom 父任务ID
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set 父任务ID
     * @param TaskFrom 父任务ID
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get 子任务ID 
     * @return TaskTo 子任务ID
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set 子任务ID
     * @param TaskTo 子任务ID
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get 子任务工作流 
     * @return WorkflowId 子任务工作流
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 子任务工作流
     * @param WorkflowId 子任务工作流
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 父任务工作流 
     * @return RealFromWorkflowId 父任务工作流
     */
    public String getRealFromWorkflowId() {
        return this.RealFromWorkflowId;
    }

    /**
     * Set 父任务工作流
     * @param RealFromWorkflowId 父任务工作流
     */
    public void setRealFromWorkflowId(String RealFromWorkflowId) {
        this.RealFromWorkflowId = RealFromWorkflowId;
    }

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 父子任务之间的依赖关系
    正常的依赖父任务全部实例  启用
    normal_all(1),
    normal_first_one(2), 正常的依赖父任务 第一个
    normal_last_one(3), 正常的依赖父任务 最后一个
    normal_any_one(4), 正常的依赖父任务 任意一个
    normal_specific_one(5), 正常的依赖父任务 指定的一个
    self(6), 自身依赖，可能用不到

     非正常的依赖父任务全部实例  启用（向前依赖  明天)
    non_normal_all_forward(11),
    non_normal_first_one_forward(12), 非正常的依赖父任务 第一个
    non_normal_last_one_forward(13), 非正常的依赖父任务 最后一个
    non_normal_any_one_forward(14), 非正常的依赖父任务 任意一个
    non_normal_specific_one_forward(15),非正常的依赖父任务 指定一个

    非正常的依赖父任务全部实例  启用（向后依赖 昨天）
    non_normal_all_backward(21),
    non_normal_first_one_backward(22), 非正常的依赖父任务 第一个
    non_normal_last_one_backward(23), 非正常的依赖父任务 最后一个
    non_normal_any_one_backward(24), 非正常的依赖父任务 任意一个
    non_normal_specific_one_backward(25) 非正常的依赖父任务 指定一个 
     * @return LinkDependencyType 父子任务之间的依赖关系
    正常的依赖父任务全部实例  启用
    normal_all(1),
    normal_first_one(2), 正常的依赖父任务 第一个
    normal_last_one(3), 正常的依赖父任务 最后一个
    normal_any_one(4), 正常的依赖父任务 任意一个
    normal_specific_one(5), 正常的依赖父任务 指定的一个
    self(6), 自身依赖，可能用不到

     非正常的依赖父任务全部实例  启用（向前依赖  明天)
    non_normal_all_forward(11),
    non_normal_first_one_forward(12), 非正常的依赖父任务 第一个
    non_normal_last_one_forward(13), 非正常的依赖父任务 最后一个
    non_normal_any_one_forward(14), 非正常的依赖父任务 任意一个
    non_normal_specific_one_forward(15),非正常的依赖父任务 指定一个

    非正常的依赖父任务全部实例  启用（向后依赖 昨天）
    non_normal_all_backward(21),
    non_normal_first_one_backward(22), 非正常的依赖父任务 第一个
    non_normal_last_one_backward(23), 非正常的依赖父任务 最后一个
    non_normal_any_one_backward(24), 非正常的依赖父任务 任意一个
    non_normal_specific_one_backward(25) 非正常的依赖父任务 指定一个
     */
    public String getLinkDependencyType() {
        return this.LinkDependencyType;
    }

    /**
     * Set 父子任务之间的依赖关系
    正常的依赖父任务全部实例  启用
    normal_all(1),
    normal_first_one(2), 正常的依赖父任务 第一个
    normal_last_one(3), 正常的依赖父任务 最后一个
    normal_any_one(4), 正常的依赖父任务 任意一个
    normal_specific_one(5), 正常的依赖父任务 指定的一个
    self(6), 自身依赖，可能用不到

     非正常的依赖父任务全部实例  启用（向前依赖  明天)
    non_normal_all_forward(11),
    non_normal_first_one_forward(12), 非正常的依赖父任务 第一个
    non_normal_last_one_forward(13), 非正常的依赖父任务 最后一个
    non_normal_any_one_forward(14), 非正常的依赖父任务 任意一个
    non_normal_specific_one_forward(15),非正常的依赖父任务 指定一个

    非正常的依赖父任务全部实例  启用（向后依赖 昨天）
    non_normal_all_backward(21),
    non_normal_first_one_backward(22), 非正常的依赖父任务 第一个
    non_normal_last_one_backward(23), 非正常的依赖父任务 最后一个
    non_normal_any_one_backward(24), 非正常的依赖父任务 任意一个
    non_normal_specific_one_backward(25) 非正常的依赖父任务 指定一个
     * @param LinkDependencyType 父子任务之间的依赖关系
    正常的依赖父任务全部实例  启用
    normal_all(1),
    normal_first_one(2), 正常的依赖父任务 第一个
    normal_last_one(3), 正常的依赖父任务 最后一个
    normal_any_one(4), 正常的依赖父任务 任意一个
    normal_specific_one(5), 正常的依赖父任务 指定的一个
    self(6), 自身依赖，可能用不到

     非正常的依赖父任务全部实例  启用（向前依赖  明天)
    non_normal_all_forward(11),
    non_normal_first_one_forward(12), 非正常的依赖父任务 第一个
    non_normal_last_one_forward(13), 非正常的依赖父任务 最后一个
    non_normal_any_one_forward(14), 非正常的依赖父任务 任意一个
    non_normal_specific_one_forward(15),非正常的依赖父任务 指定一个

    非正常的依赖父任务全部实例  启用（向后依赖 昨天）
    non_normal_all_backward(21),
    non_normal_first_one_backward(22), 非正常的依赖父任务 第一个
    non_normal_last_one_backward(23), 非正常的依赖父任务 最后一个
    non_normal_any_one_backward(24), 非正常的依赖父任务 任意一个
    non_normal_specific_one_backward(25) 非正常的依赖父任务 指定一个
     */
    public void setLinkDependencyType(String LinkDependencyType) {
        this.LinkDependencyType = LinkDependencyType;
    }

    /**
     * Get 额外的属性信息 如分支节点、归并节点信息 
     * @return LinkExt 额外的属性信息 如分支节点、归并节点信息
     */
    public String getLinkExt() {
        return this.LinkExt;
    }

    /**
     * Set 额外的属性信息 如分支节点、归并节点信息
     * @param LinkExt 额外的属性信息 如分支节点、归并节点信息
     */
    public void setLinkExt(String LinkExt) {
        this.LinkExt = LinkExt;
    }

    public ModifyTaskLinksDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskLinksDsRequest(ModifyTaskLinksDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.RealFromWorkflowId != null) {
            this.RealFromWorkflowId = new String(source.RealFromWorkflowId);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.LinkDependencyType != null) {
            this.LinkDependencyType = new String(source.LinkDependencyType);
        }
        if (source.LinkExt != null) {
            this.LinkExt = new String(source.LinkExt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RealFromWorkflowId", this.RealFromWorkflowId);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "LinkDependencyType", this.LinkDependencyType);
        this.setParamSimple(map, prefix + "LinkExt", this.LinkExt);

    }
}

