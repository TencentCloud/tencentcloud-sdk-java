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

public class CommitRuleGroupTaskRequest extends AbstractModel{

    /**
    * 规则组ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 触发类型 1.手动触发 2.调度事中触发 3.周期调度触发
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * 规则配置列表
    */
    @SerializedName("ExecRuleConfig")
    @Expose
    private RuleConfig [] ExecRuleConfig;

    /**
    * 执行配置
    */
    @SerializedName("ExecConfig")
    @Expose
    private RuleExecConfig ExecConfig;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 该规则运行的执行引擎，不传时会请求该数据源下默认的执行引擎
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

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
     * Get 触发类型 1.手动触发 2.调度事中触发 3.周期调度触发 
     * @return TriggerType 触发类型 1.手动触发 2.调度事中触发 3.周期调度触发
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型 1.手动触发 2.调度事中触发 3.周期调度触发
     * @param TriggerType 触发类型 1.手动触发 2.调度事中触发 3.周期调度触发
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 规则配置列表 
     * @return ExecRuleConfig 规则配置列表
     */
    public RuleConfig [] getExecRuleConfig() {
        return this.ExecRuleConfig;
    }

    /**
     * Set 规则配置列表
     * @param ExecRuleConfig 规则配置列表
     */
    public void setExecRuleConfig(RuleConfig [] ExecRuleConfig) {
        this.ExecRuleConfig = ExecRuleConfig;
    }

    /**
     * Get 执行配置 
     * @return ExecConfig 执行配置
     */
    public RuleExecConfig getExecConfig() {
        return this.ExecConfig;
    }

    /**
     * Set 执行配置
     * @param ExecConfig 执行配置
     */
    public void setExecConfig(RuleExecConfig ExecConfig) {
        this.ExecConfig = ExecConfig;
    }

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
     * Get 该规则运行的执行引擎，不传时会请求该数据源下默认的执行引擎 
     * @return EngineType 该规则运行的执行引擎，不传时会请求该数据源下默认的执行引擎
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 该规则运行的执行引擎，不传时会请求该数据源下默认的执行引擎
     * @param EngineType 该规则运行的执行引擎，不传时会请求该数据源下默认的执行引擎
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public CommitRuleGroupTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitRuleGroupTaskRequest(CommitRuleGroupTaskRequest source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.ExecRuleConfig != null) {
            this.ExecRuleConfig = new RuleConfig[source.ExecRuleConfig.length];
            for (int i = 0; i < source.ExecRuleConfig.length; i++) {
                this.ExecRuleConfig[i] = new RuleConfig(source.ExecRuleConfig[i]);
            }
        }
        if (source.ExecConfig != null) {
            this.ExecConfig = new RuleExecConfig(source.ExecConfig);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamArrayObj(map, prefix + "ExecRuleConfig.", this.ExecRuleConfig);
        this.setParamObj(map, prefix + "ExecConfig.", this.ExecConfig);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

