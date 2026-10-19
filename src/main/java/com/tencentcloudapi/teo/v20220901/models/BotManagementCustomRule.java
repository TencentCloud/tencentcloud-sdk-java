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
    * <p>Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Bot 自定义规则的名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>按权重分配的安全执行动作列表。</p>
    */
    @SerializedName("Action")
    @Expose
    private SecurityWeightedAction [] Action;

    /**
     * Get <p>Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p> 
     * @return Id <p>Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     * @param Id <p>Bot 自定义规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BotManagementCustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Bot 自定义规则的名称。</p> 
     * @return Name <p>Bot 自定义规则的名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Bot 自定义规则的名称。</p>
     * @param Name <p>Bot 自定义规则的名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p> 
     * @return Enabled <p>Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     * @param Enabled <p>Bot 自定义规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。</p> 
     * @return Priority <p>Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。</p>
     * @param Priority <p>Bot 自定义规则的优先级，范围是 1 ~ 100，默认为 50。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p> 
     * @return Condition <p>Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     * @param Condition <p>Bot 自定义规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>按权重分配的安全执行动作列表。</p> 
     * @return Action <p>按权重分配的安全执行动作列表。</p>
     */
    public SecurityWeightedAction [] getAction() {
        return this.Action;
    }

    /**
     * Set <p>按权重分配的安全执行动作列表。</p>
     * @param Action <p>按权重分配的安全执行动作列表。</p>
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

