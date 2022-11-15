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

public class CommitRuleGroupExecResultRequest extends AbstractModel{

    /**
    * preject id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * rule group exec id
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * group exec state
    */
    @SerializedName("RuleGroupState")
    @Expose
    private String RuleGroupState;

    /**
    * runner rule exec result list
    */
    @SerializedName("RuleExecResults")
    @Expose
    private RunnerRuleExecResult [] RuleExecResults;

    /**
     * Get preject id 
     * @return ProjectId preject id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set preject id
     * @param ProjectId preject id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get rule group exec id 
     * @return RuleGroupExecId rule group exec id
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set rule group exec id
     * @param RuleGroupExecId rule group exec id
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get group exec state 
     * @return RuleGroupState group exec state
     */
    public String getRuleGroupState() {
        return this.RuleGroupState;
    }

    /**
     * Set group exec state
     * @param RuleGroupState group exec state
     */
    public void setRuleGroupState(String RuleGroupState) {
        this.RuleGroupState = RuleGroupState;
    }

    /**
     * Get runner rule exec result list 
     * @return RuleExecResults runner rule exec result list
     */
    public RunnerRuleExecResult [] getRuleExecResults() {
        return this.RuleExecResults;
    }

    /**
     * Set runner rule exec result list
     * @param RuleExecResults runner rule exec result list
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

