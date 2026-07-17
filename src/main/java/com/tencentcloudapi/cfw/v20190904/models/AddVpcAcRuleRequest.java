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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddVpcAcRuleRequest extends AbstractModel {

    /**
    * <p>需要添加的vpc内网间规则列表</p>
    */
    @SerializedName("Rules")
    @Expose
    private VpcRuleItem [] Rules;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则</p>
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get <p>需要添加的vpc内网间规则列表</p> 
     * @return Rules <p>需要添加的vpc内网间规则列表</p>
     */
    public VpcRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>需要添加的vpc内网间规则列表</p>
     * @param Rules <p>需要添加的vpc内网间规则列表</p>
     */
    public void setRules(VpcRuleItem [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul> 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则</p> 
     * @return From <p>添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则</p>
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set <p>添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则</p>
     * @param From <p>添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则</p>
     */
    public void setFrom(String From) {
        this.From = From;
    }

    public AddVpcAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddVpcAcRuleRequest(AddVpcAcRuleRequest source) {
        if (source.Rules != null) {
            this.Rules = new VpcRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new VpcRuleItem(source.Rules[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "From", this.From);

    }
}

