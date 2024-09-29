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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckBashPolicyParamsRequest extends AbstractModel {

    /**
    * 校验内容字段,如果需要检测多个字段时,用逗号分割
<li>Name 策略名称</li>
<li>Process 进程</li>
<li>Name PProcess 父进程</li>
<li>Name AProcess 祖先进程</li>

    */
    @SerializedName("CheckField")
    @Expose
    private String CheckField;

    /**
    * 在事件列表中新增白名时需要提交事件ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 填入的规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 该字段不在维护,如果填入该参数,自动替换到Rules.Process

    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 编辑时传的规则id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 规则表达式
    */
    @SerializedName("Rules")
    @Expose
    private PolicyRules Rules;

    /**
     * Get 校验内容字段,如果需要检测多个字段时,用逗号分割
<li>Name 策略名称</li>
<li>Process 进程</li>
<li>Name PProcess 父进程</li>
<li>Name AProcess 祖先进程</li>
 
     * @return CheckField 校验内容字段,如果需要检测多个字段时,用逗号分割
<li>Name 策略名称</li>
<li>Process 进程</li>
<li>Name PProcess 父进程</li>
<li>Name AProcess 祖先进程</li>

     */
    public String getCheckField() {
        return this.CheckField;
    }

    /**
     * Set 校验内容字段,如果需要检测多个字段时,用逗号分割
<li>Name 策略名称</li>
<li>Process 进程</li>
<li>Name PProcess 父进程</li>
<li>Name AProcess 祖先进程</li>

     * @param CheckField 校验内容字段,如果需要检测多个字段时,用逗号分割
<li>Name 策略名称</li>
<li>Process 进程</li>
<li>Name PProcess 父进程</li>
<li>Name AProcess 祖先进程</li>

     */
    public void setCheckField(String CheckField) {
        this.CheckField = CheckField;
    }

    /**
     * Get 在事件列表中新增白名时需要提交事件ID 
     * @return EventId 在事件列表中新增白名时需要提交事件ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 在事件列表中新增白名时需要提交事件ID
     * @param EventId 在事件列表中新增白名时需要提交事件ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 填入的规则名称 
     * @return Name 填入的规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 填入的规则名称
     * @param Name 填入的规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 该字段不在维护,如果填入该参数,自动替换到Rules.Process
 
     * @return Rule 该字段不在维护,如果填入该参数,自动替换到Rules.Process

     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 该字段不在维护,如果填入该参数,自动替换到Rules.Process

     * @param Rule 该字段不在维护,如果填入该参数,自动替换到Rules.Process

     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 编辑时传的规则id 
     * @return Id 编辑时传的规则id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 编辑时传的规则id
     * @param Id 编辑时传的规则id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 规则表达式 
     * @return Rules 规则表达式
     */
    public PolicyRules getRules() {
        return this.Rules;
    }

    /**
     * Set 规则表达式
     * @param Rules 规则表达式
     */
    public void setRules(PolicyRules Rules) {
        this.Rules = Rules;
    }

    public CheckBashPolicyParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckBashPolicyParamsRequest(CheckBashPolicyParamsRequest source) {
        if (source.CheckField != null) {
            this.CheckField = new String(source.CheckField);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Rules != null) {
            this.Rules = new PolicyRules(source.Rules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckField", this.CheckField);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Rules.", this.Rules);

    }
}

