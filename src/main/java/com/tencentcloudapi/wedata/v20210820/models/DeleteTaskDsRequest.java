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

public class DeleteTaskDsRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否删除脚本
true：删除
false：不删除
不传默认false
    */
    @SerializedName("DeleteScript")
    @Expose
    private Boolean DeleteScript;

    /**
    * 任务操作是否消息通知下游任务责任人true：通知
false：不通知
不传默认false
    */
    @SerializedName("OperateInform")
    @Expose
    private Boolean OperateInform;

    /**
    * 任务ID
和VirtualTaskId选填一个
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 虚拟任务id
和TaskId选填一个

    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * 虚拟任务标记
true：是虚拟任务
false：不是虚拟任务
不传默认false
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * 任务删除方式
true：不针对下游任务实例进行强制失败
false：针对下游任务实例进行强制失败
不传默认false

    */
    @SerializedName("DeleteMode")
    @Expose
    private Boolean DeleteMode;

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
     * Get 是否删除脚本
true：删除
false：不删除
不传默认false 
     * @return DeleteScript 是否删除脚本
true：删除
false：不删除
不传默认false
     */
    public Boolean getDeleteScript() {
        return this.DeleteScript;
    }

    /**
     * Set 是否删除脚本
true：删除
false：不删除
不传默认false
     * @param DeleteScript 是否删除脚本
true：删除
false：不删除
不传默认false
     */
    public void setDeleteScript(Boolean DeleteScript) {
        this.DeleteScript = DeleteScript;
    }

    /**
     * Get 任务操作是否消息通知下游任务责任人true：通知
false：不通知
不传默认false 
     * @return OperateInform 任务操作是否消息通知下游任务责任人true：通知
false：不通知
不传默认false
     */
    public Boolean getOperateInform() {
        return this.OperateInform;
    }

    /**
     * Set 任务操作是否消息通知下游任务责任人true：通知
false：不通知
不传默认false
     * @param OperateInform 任务操作是否消息通知下游任务责任人true：通知
false：不通知
不传默认false
     */
    public void setOperateInform(Boolean OperateInform) {
        this.OperateInform = OperateInform;
    }

    /**
     * Get 任务ID
和VirtualTaskId选填一个 
     * @return TaskId 任务ID
和VirtualTaskId选填一个
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
和VirtualTaskId选填一个
     * @param TaskId 任务ID
和VirtualTaskId选填一个
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 虚拟任务id
和TaskId选填一个
 
     * @return VirtualTaskId 虚拟任务id
和TaskId选填一个

     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set 虚拟任务id
和TaskId选填一个

     * @param VirtualTaskId 虚拟任务id
和TaskId选填一个

     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get 虚拟任务标记
true：是虚拟任务
false：不是虚拟任务
不传默认false 
     * @return VirtualFlag 虚拟任务标记
true：是虚拟任务
false：不是虚拟任务
不传默认false
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set 虚拟任务标记
true：是虚拟任务
false：不是虚拟任务
不传默认false
     * @param VirtualFlag 虚拟任务标记
true：是虚拟任务
false：不是虚拟任务
不传默认false
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get 任务删除方式
true：不针对下游任务实例进行强制失败
false：针对下游任务实例进行强制失败
不传默认false
 
     * @return DeleteMode 任务删除方式
true：不针对下游任务实例进行强制失败
false：针对下游任务实例进行强制失败
不传默认false

     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set 任务删除方式
true：不针对下游任务实例进行强制失败
false：针对下游任务实例进行强制失败
不传默认false

     * @param DeleteMode 任务删除方式
true：不针对下游任务实例进行强制失败
false：针对下游任务实例进行强制失败
不传默认false

     */
    public void setDeleteMode(Boolean DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    public DeleteTaskDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTaskDsRequest(DeleteTaskDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeleteScript != null) {
            this.DeleteScript = new Boolean(source.DeleteScript);
        }
        if (source.OperateInform != null) {
            this.OperateInform = new Boolean(source.OperateInform);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VirtualTaskId != null) {
            this.VirtualTaskId = new String(source.VirtualTaskId);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new Boolean(source.DeleteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteScript", this.DeleteScript);
        this.setParamSimple(map, prefix + "OperateInform", this.OperateInform);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VirtualTaskId", this.VirtualTaskId);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

