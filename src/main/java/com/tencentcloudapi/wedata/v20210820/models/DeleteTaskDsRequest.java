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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTaskDsRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否删除脚本
    */
    @SerializedName("DeleteScript")
    @Expose
    private Boolean DeleteScript;

    /**
    * 任务操作是否消息通知下游任务责任人
    */
    @SerializedName("OperateInform")
    @Expose
    private Boolean OperateInform;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 虚拟任务id
    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * 虚拟任务标记
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * 任务删除方式
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
     * @return DeleteScript 是否删除脚本
     */
    public Boolean getDeleteScript() {
        return this.DeleteScript;
    }

    /**
     * Set 是否删除脚本
     * @param DeleteScript 是否删除脚本
     */
    public void setDeleteScript(Boolean DeleteScript) {
        this.DeleteScript = DeleteScript;
    }

    /**
     * Get 任务操作是否消息通知下游任务责任人 
     * @return OperateInform 任务操作是否消息通知下游任务责任人
     */
    public Boolean getOperateInform() {
        return this.OperateInform;
    }

    /**
     * Set 任务操作是否消息通知下游任务责任人
     * @param OperateInform 任务操作是否消息通知下游任务责任人
     */
    public void setOperateInform(Boolean OperateInform) {
        this.OperateInform = OperateInform;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 虚拟任务id 
     * @return VirtualTaskId 虚拟任务id
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set 虚拟任务id
     * @param VirtualTaskId 虚拟任务id
     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get 虚拟任务标记 
     * @return VirtualFlag 虚拟任务标记
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set 虚拟任务标记
     * @param VirtualFlag 虚拟任务标记
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get 任务删除方式 
     * @return DeleteMode 任务删除方式
     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set 任务删除方式
     * @param DeleteMode 任务删除方式
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

