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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceCacheRule extends AbstractModel {

    /**
    * <p>自定义描述，最多 128 字节</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>规则开关：nil/true 启用，false 禁用</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>HTTPService 规则匹配条件（必填）</p>
    */
    @SerializedName("Condition")
    @Expose
    private HTTPServiceRuleCondition Condition;

    /**
    * <p>HTTPService 缓存动作列表，同一规则内相同 Type 至多一个</p>
    */
    @SerializedName("Actions")
    @Expose
    private HTTPServiceCacheAction [] Actions;

    /**
     * Get <p>自定义描述，最多 128 字节</p> 
     * @return Description <p>自定义描述，最多 128 字节</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>自定义描述，最多 128 字节</p>
     * @param Description <p>自定义描述，最多 128 字节</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>规则开关：nil/true 启用，false 禁用</p> 
     * @return Enable <p>规则开关：nil/true 启用，false 禁用</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>规则开关：nil/true 启用，false 禁用</p>
     * @param Enable <p>规则开关：nil/true 启用，false 禁用</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>HTTPService 规则匹配条件（必填）</p> 
     * @return Condition <p>HTTPService 规则匹配条件（必填）</p>
     */
    public HTTPServiceRuleCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>HTTPService 规则匹配条件（必填）</p>
     * @param Condition <p>HTTPService 规则匹配条件（必填）</p>
     */
    public void setCondition(HTTPServiceRuleCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>HTTPService 缓存动作列表，同一规则内相同 Type 至多一个</p> 
     * @return Actions <p>HTTPService 缓存动作列表，同一规则内相同 Type 至多一个</p>
     */
    public HTTPServiceCacheAction [] getActions() {
        return this.Actions;
    }

    /**
     * Set <p>HTTPService 缓存动作列表，同一规则内相同 Type 至多一个</p>
     * @param Actions <p>HTTPService 缓存动作列表，同一规则内相同 Type 至多一个</p>
     */
    public void setActions(HTTPServiceCacheAction [] Actions) {
        this.Actions = Actions;
    }

    public HTTPServiceCacheRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceCacheRule(HTTPServiceCacheRule source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Condition != null) {
            this.Condition = new HTTPServiceRuleCondition(source.Condition);
        }
        if (source.Actions != null) {
            this.Actions = new HTTPServiceCacheAction[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new HTTPServiceCacheAction(source.Actions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);

    }
}

