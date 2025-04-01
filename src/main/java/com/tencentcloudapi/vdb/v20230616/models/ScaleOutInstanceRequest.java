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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceRequest extends AbstractModel {

    /**
    * 指定需扩容节点数量的实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定扩容后的节点数量。选项范围起始于当前实例已有的节点数，上限为30个节点。
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * 指定水平扩容增加节点数量的时间。
- false：默认值，指在下一个维护时间段内执行增加节点数的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动扩容任务。维护时间的更多信息，请参维护时间窗。
- true：立即执行增加节点数的任务，请确保此时没有重大业务操作。
    */
    @SerializedName("RunNow")
    @Expose
    private Boolean RunNow;

    /**
     * Get 指定需扩容节点数量的实例 ID。 
     * @return InstanceId 指定需扩容节点数量的实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定需扩容节点数量的实例 ID。
     * @param InstanceId 指定需扩容节点数量的实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指定扩容后的节点数量。选项范围起始于当前实例已有的节点数，上限为30个节点。 
     * @return ReplicaNum 指定扩容后的节点数量。选项范围起始于当前实例已有的节点数，上限为30个节点。
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 指定扩容后的节点数量。选项范围起始于当前实例已有的节点数，上限为30个节点。
     * @param ReplicaNum 指定扩容后的节点数量。选项范围起始于当前实例已有的节点数，上限为30个节点。
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get 指定水平扩容增加节点数量的时间。
- false：默认值，指在下一个维护时间段内执行增加节点数的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动扩容任务。维护时间的更多信息，请参维护时间窗。
- true：立即执行增加节点数的任务，请确保此时没有重大业务操作。 
     * @return RunNow 指定水平扩容增加节点数量的时间。
- false：默认值，指在下一个维护时间段内执行增加节点数的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动扩容任务。维护时间的更多信息，请参维护时间窗。
- true：立即执行增加节点数的任务，请确保此时没有重大业务操作。
     */
    public Boolean getRunNow() {
        return this.RunNow;
    }

    /**
     * Set 指定水平扩容增加节点数量的时间。
- false：默认值，指在下一个维护时间段内执行增加节点数的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动扩容任务。维护时间的更多信息，请参维护时间窗。
- true：立即执行增加节点数的任务，请确保此时没有重大业务操作。
     * @param RunNow 指定水平扩容增加节点数量的时间。
- false：默认值，指在下一个维护时间段内执行增加节点数的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动扩容任务。维护时间的更多信息，请参维护时间窗。
- true：立即执行增加节点数的任务，请确保此时没有重大业务操作。
     */
    public void setRunNow(Boolean RunNow) {
        this.RunNow = RunNow;
    }

    public ScaleOutInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutInstanceRequest(ScaleOutInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
        if (source.RunNow != null) {
            this.RunNow = new Boolean(source.RunNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "RunNow", this.RunNow);

    }
}

