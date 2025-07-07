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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleRule extends AbstractModel {

    /**
    * 规则表达式
    */
    @SerializedName("Expressions")
    @Expose
    private RuleExpression [] Expressions;

    /**
    * 表达式间逻辑关系
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
     * Get 规则表达式 
     * @return Expressions 规则表达式
     */
    public RuleExpression [] getExpressions() {
        return this.Expressions;
    }

    /**
     * Set 规则表达式
     * @param Expressions 规则表达式
     */
    public void setExpressions(RuleExpression [] Expressions) {
        this.Expressions = Expressions;
    }

    /**
     * Get 表达式间逻辑关系 
     * @return Relation 表达式间逻辑关系
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 表达式间逻辑关系
     * @param Relation 表达式间逻辑关系
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    public SimpleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleRule(SimpleRule source) {
        if (source.Expressions != null) {
            this.Expressions = new RuleExpression[source.Expressions.length];
            for (int i = 0; i < source.Expressions.length; i++) {
                this.Expressions[i] = new RuleExpression(source.Expressions[i]);
            }
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Expressions.", this.Expressions);
        this.setParamSimple(map, prefix + "Relation", this.Relation);

    }
}

