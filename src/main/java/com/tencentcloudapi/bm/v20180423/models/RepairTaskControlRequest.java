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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepairTaskControlRequest extends AbstractModel{

    /**
    * 维修任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 操作
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 需要重新维修操作的备注信息，可提供返场维修原因，以便驻场快速针对问题定位解决。
    */
    @SerializedName("OperateRemark")
    @Expose
    private String OperateRemark;

    /**
     * Get 维修任务ID 
     * @return TaskId 维修任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 维修任务ID
     * @param TaskId 维修任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 操作 
     * @return Operate 操作
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作
     * @param Operate 操作
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 需要重新维修操作的备注信息，可提供返场维修原因，以便驻场快速针对问题定位解决。 
     * @return OperateRemark 需要重新维修操作的备注信息，可提供返场维修原因，以便驻场快速针对问题定位解决。
     */
    public String getOperateRemark() {
        return this.OperateRemark;
    }

    /**
     * Set 需要重新维修操作的备注信息，可提供返场维修原因，以便驻场快速针对问题定位解决。
     * @param OperateRemark 需要重新维修操作的备注信息，可提供返场维修原因，以便驻场快速针对问题定位解决。
     */
    public void setOperateRemark(String OperateRemark) {
        this.OperateRemark = OperateRemark;
    }

    public RepairTaskControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepairTaskControlRequest(RepairTaskControlRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.OperateRemark != null) {
            this.OperateRemark = new String(source.OperateRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "OperateRemark", this.OperateRemark);

    }
}

