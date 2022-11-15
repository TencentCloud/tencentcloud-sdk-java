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

public class ModifyMonitorStatusRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 规则组ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 监控开关状态
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Boolean MonitorStatus;

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
     * Get 规则组ID 
     * @return RuleGroupId 规则组ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组ID
     * @param RuleGroupId 规则组ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 监控开关状态 
     * @return MonitorStatus 监控开关状态
     */
    public Boolean getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监控开关状态
     * @param MonitorStatus 监控开关状态
     */
    public void setMonitorStatus(Boolean MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    public ModifyMonitorStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMonitorStatusRequest(ModifyMonitorStatusRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Boolean(source.MonitorStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);

    }
}

