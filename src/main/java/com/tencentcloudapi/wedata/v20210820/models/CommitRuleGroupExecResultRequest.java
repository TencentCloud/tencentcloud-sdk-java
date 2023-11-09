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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommitRuleGroupExecResultRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 规则组执行ID
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * 规则组执行状态
    */
    @SerializedName("RuleGroupState")
    @Expose
    private String RuleGroupState;

    /**
    * 规则执行结果集合
    */
    @SerializedName("RuleExecResults")
    @Expose
    private RunnerRuleExecResult [] RuleExecResults;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 规则组执行ID 
     * @return RuleGroupExecId 规则组执行ID
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set 规则组执行ID
     * @param RuleGroupExecId 规则组执行ID
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get 规则组执行状态 
     * @return RuleGroupState 规则组执行状态
     */
    public String getRuleGroupState() {
        return this.RuleGroupState;
    }

    /**
     * Set 规则组执行状态
     * @param RuleGroupState 规则组执行状态
     */
    public void setRuleGroupState(String RuleGroupState) {
        this.RuleGroupState = RuleGroupState;
    }

    /**
     * Get 规则执行结果集合 
     * @return RuleExecResults 规则执行结果集合
     */
    public RunnerRuleExecResult [] getRuleExecResults() {
        return this.RuleExecResults;
    }

    /**
     * Set 规则执行结果集合
     * @param RuleExecResults 规则执行结果集合
     */
    public void setRuleExecResults(RunnerRuleExecResult [] RuleExecResults) {
        this.RuleExecResults = RuleExecResults;
    }

    public CommitRuleGroupExecResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitRuleGroupExecResultRequest(CommitRuleGroupExecResultRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RuleGroupExecId != null) {
            this.RuleGroupExecId = new Long(source.RuleGroupExecId);
        }
        if (source.RuleGroupState != null) {
            this.RuleGroupState = new String(source.RuleGroupState);
        }
        if (source.RuleExecResults != null) {
            this.RuleExecResults = new RunnerRuleExecResult[source.RuleExecResults.length];
            for (int i = 0; i < source.RuleExecResults.length; i++) {
                this.RuleExecResults[i] = new RunnerRuleExecResult(source.RuleExecResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RuleGroupExecId", this.RuleGroupExecId);
        this.setParamSimple(map, prefix + "RuleGroupState", this.RuleGroupState);
        this.setParamArrayObj(map, prefix + "RuleExecResults.", this.RuleExecResults);

    }
}

