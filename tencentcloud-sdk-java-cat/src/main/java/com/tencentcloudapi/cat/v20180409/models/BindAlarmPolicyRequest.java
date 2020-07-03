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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindAlarmPolicyRequest extends AbstractModel{

    /**
    * 拨测任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 告警策略组Id
    */
    @SerializedName("PolicyGroupId")
    @Expose
    private Long PolicyGroupId;

    /**
    * 是否绑定操作。非0 为绑定， 0 为 解绑。缺省表示 绑定。
    */
    @SerializedName("IfBind")
    @Expose
    private Long IfBind;

    /**
    * 告警主题Id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get 拨测任务Id 
     * @return TaskId 拨测任务Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 拨测任务Id
     * @param TaskId 拨测任务Id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 告警策略组Id 
     * @return PolicyGroupId 告警策略组Id
     */
    public Long getPolicyGroupId() {
        return this.PolicyGroupId;
    }

    /**
     * Set 告警策略组Id
     * @param PolicyGroupId 告警策略组Id
     */
    public void setPolicyGroupId(Long PolicyGroupId) {
        this.PolicyGroupId = PolicyGroupId;
    }

    /**
     * Get 是否绑定操作。非0 为绑定， 0 为 解绑。缺省表示 绑定。 
     * @return IfBind 是否绑定操作。非0 为绑定， 0 为 解绑。缺省表示 绑定。
     */
    public Long getIfBind() {
        return this.IfBind;
    }

    /**
     * Set 是否绑定操作。非0 为绑定， 0 为 解绑。缺省表示 绑定。
     * @param IfBind 是否绑定操作。非0 为绑定， 0 为 解绑。缺省表示 绑定。
     */
    public void setIfBind(Long IfBind) {
        this.IfBind = IfBind;
    }

    /**
     * Get 告警主题Id 
     * @return TopicId 告警主题Id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 告警主题Id
     * @param TopicId 告警主题Id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PolicyGroupId", this.PolicyGroupId);
        this.setParamSimple(map, prefix + "IfBind", this.IfBind);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

