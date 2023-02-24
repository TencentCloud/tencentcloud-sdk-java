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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddNatAcRuleRequest extends AbstractModel{

    /**
    * 需要添加的nat访问控制规则列表
    */
    @SerializedName("Rules")
    @Expose
    private CreateNatRuleItem [] Rules;

    /**
    * 添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get 需要添加的nat访问控制规则列表 
     * @return Rules 需要添加的nat访问控制规则列表
     */
    public CreateNatRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set 需要添加的nat访问控制规则列表
     * @param Rules 需要添加的nat访问控制规则列表
     */
    public void setRules(CreateNatRuleItem [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则 
     * @return From 添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则
     * @param From 添加规则的来源，一般不需要使用，值insert_rule 表示插入指定位置的规则；值batch_import 表示批量导入规则；为空时表示添加规则
     */
    public void setFrom(String From) {
        this.From = From;
    }

    public AddNatAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddNatAcRuleRequest(AddNatAcRuleRequest source) {
        if (source.Rules != null) {
            this.Rules = new CreateNatRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new CreateNatRuleItem(source.Rules[i]);
            }
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
        this.setParamSimple(map, prefix + "From", this.From);

    }
}

