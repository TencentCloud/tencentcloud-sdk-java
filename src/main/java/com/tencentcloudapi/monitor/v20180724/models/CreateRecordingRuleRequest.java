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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecordingRuleRequest extends AbstractModel{

    /**
    * 聚合规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 聚合规则组内容，格式为 yaml
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Prometheus 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
     * Get 聚合规则名称 
     * @return Name 聚合规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 聚合规则名称
     * @param Name 聚合规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 聚合规则组内容，格式为 yaml 
     * @return Group 聚合规则组内容，格式为 yaml
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 聚合规则组内容，格式为 yaml
     * @param Group 聚合规则组内容，格式为 yaml
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Prometheus 实例 ID 
     * @return InstanceId Prometheus 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus 实例 ID
     * @param InstanceId Prometheus 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。 
     * @return RuleState 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。
     * @param RuleState 规则状态码，取值如下：
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
默认状态码为 2 启用。
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    public CreateRecordingRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordingRuleRequest(CreateRecordingRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);

    }
}

