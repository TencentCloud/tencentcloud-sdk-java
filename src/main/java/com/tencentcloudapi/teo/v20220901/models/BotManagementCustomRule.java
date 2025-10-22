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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotManagementCustomRule extends AbstractModel {

    /**
    * Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Bot 自定义规则的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Bot 自定义规则的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中 DenyActionParameters.Name 支持 Deny 和 ReturnCustomPage；</li><li>Challenge：挑战，其中 ChallengeActionParameters.Name 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至 URL。</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityWeightedAction [] Action;

    /**
     * Get Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li> 
     * @return Id Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     * @param Id Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Bot 自定义规则的名称。 
     * @return Name Bot 自定义规则的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Bot 自定义规则的名称。
     * @param Name Bot 自定义规则的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。 
     * @return Priority Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。
     * @param Priority Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。 
     * @return Condition Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     * @param Condition Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Bot 自定义规则的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中 DenyActionParameters.Name 支持 Deny 和 ReturnCustomPage；</li><li>Challenge：挑战，其中 ChallengeActionParameters.Name 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至 URL。</li> 
     * @return Action Bot 自定义规则的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中 DenyActionParameters.Name 支持 Deny 和 ReturnCustomPage；</li><li>Challenge：挑战，其中 ChallengeActionParameters.Name 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至 URL。</li>
     */
    public SecurityWeightedAction [] getAction() {
        return this.Action;
    }

    /**
     * Set Bot 自定义规则的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中 DenyActionParameters.Name 支持 Deny 和 ReturnCustomPage；</li><li>Challenge：挑战，其中 ChallengeActionParameters.Name 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至 URL。</li>
     * @param Action Bot 自定义规则的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中 DenyActionParameters.Name 支持 Deny 和 ReturnCustomPage；</li><li>Challenge：挑战，其中 ChallengeActionParameters.Name 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至 URL。</li>
     */
    public void setAction(SecurityWeightedAction [] Action) {
        this.Action = Action;
    }

    public BotManagementCustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagementCustomRule(BotManagementCustomRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Action != null) {
            this.Action = new SecurityWeightedAction[source.Action.length];
            for (int i = 0; i < source.Action.length; i++) {
                this.Action[i] = new SecurityWeightedAction(source.Action[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArrayObj(map, prefix + "Action.", this.Action);

    }
}

