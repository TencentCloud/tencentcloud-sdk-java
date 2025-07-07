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

public class FreezeOpsTasksRequest extends AbstractModel {

    /**
    * 任务列表
    */
    @SerializedName("Tasks")
    @Expose
    private SimpleTaskInfo [] Tasks;

    /**
    * 任务操作是否消息通知下游任务责任人
    */
    @SerializedName("OperateIsInform")
    @Expose
    private Boolean OperateIsInform;

    /**
    * 是否终止已生成的实例
    */
    @SerializedName("KillInstance")
    @Expose
    private Boolean KillInstance;

    /**
     * Get 任务列表 
     * @return Tasks 任务列表
     */
    public SimpleTaskInfo [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务列表
     * @param Tasks 任务列表
     */
    public void setTasks(SimpleTaskInfo [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 任务操作是否消息通知下游任务责任人 
     * @return OperateIsInform 任务操作是否消息通知下游任务责任人
     */
    public Boolean getOperateIsInform() {
        return this.OperateIsInform;
    }

    /**
     * Set 任务操作是否消息通知下游任务责任人
     * @param OperateIsInform 任务操作是否消息通知下游任务责任人
     */
    public void setOperateIsInform(Boolean OperateIsInform) {
        this.OperateIsInform = OperateIsInform;
    }

    /**
     * Get 是否终止已生成的实例 
     * @return KillInstance 是否终止已生成的实例
     */
    public Boolean getKillInstance() {
        return this.KillInstance;
    }

    /**
     * Set 是否终止已生成的实例
     * @param KillInstance 是否终止已生成的实例
     */
    public void setKillInstance(Boolean KillInstance) {
        this.KillInstance = KillInstance;
    }

    public FreezeOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FreezeOpsTasksRequest(FreezeOpsTasksRequest source) {
        if (source.Tasks != null) {
            this.Tasks = new SimpleTaskInfo[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new SimpleTaskInfo(source.Tasks[i]);
            }
        }
        if (source.OperateIsInform != null) {
            this.OperateIsInform = new Boolean(source.OperateIsInform);
        }
        if (source.KillInstance != null) {
            this.KillInstance = new Boolean(source.KillInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "OperateIsInform", this.OperateIsInform);
        this.setParamSimple(map, prefix + "KillInstance", this.KillInstance);

    }
}

