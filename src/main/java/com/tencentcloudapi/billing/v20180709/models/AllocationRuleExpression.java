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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationRuleExpression extends AbstractModel {

    /**
    * RuleKey：分账维度
枚举值：
ownerUin - 使用者UIN,
operateUin - 操作者UIN,
businessCode - 产品一层编码,
productCode - 产品二层编码,
itemCode - 产品四层编码,
projectId - 项目ID,
regionId - 地域ID,
resourceId - 资源ID,
tag - 标签键值对,
payMode - 计费模式,
instanceType - 实例类型,
actionType - 交易类型
    */
    @SerializedName("RuleKey")
    @Expose
    private String RuleKey;

    /**
    * 分账维度规则
枚举值：
in - 是
not in - 不是
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 分账维度值，例如当RuleKey为businessCode时，["p_cbs","p_sqlserver"]表示产品一层是"p_cbs","p_sqlserver"的费用
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
    * 分账逻辑连接词，枚举值如下：
and - 且
or - 或
    */
    @SerializedName("Connectors")
    @Expose
    private String Connectors;

    /**
    * 嵌套规则
    */
    @SerializedName("Children")
    @Expose
    private AllocationRuleExpression [] Children;

    /**
     * Get RuleKey：分账维度
枚举值：
ownerUin - 使用者UIN,
operateUin - 操作者UIN,
businessCode - 产品一层编码,
productCode - 产品二层编码,
itemCode - 产品四层编码,
projectId - 项目ID,
regionId - 地域ID,
resourceId - 资源ID,
tag - 标签键值对,
payMode - 计费模式,
instanceType - 实例类型,
actionType - 交易类型 
     * @return RuleKey RuleKey：分账维度
枚举值：
ownerUin - 使用者UIN,
operateUin - 操作者UIN,
businessCode - 产品一层编码,
productCode - 产品二层编码,
itemCode - 产品四层编码,
projectId - 项目ID,
regionId - 地域ID,
resourceId - 资源ID,
tag - 标签键值对,
payMode - 计费模式,
instanceType - 实例类型,
actionType - 交易类型
     */
    public String getRuleKey() {
        return this.RuleKey;
    }

    /**
     * Set RuleKey：分账维度
枚举值：
ownerUin - 使用者UIN,
operateUin - 操作者UIN,
businessCode - 产品一层编码,
productCode - 产品二层编码,
itemCode - 产品四层编码,
projectId - 项目ID,
regionId - 地域ID,
resourceId - 资源ID,
tag - 标签键值对,
payMode - 计费模式,
instanceType - 实例类型,
actionType - 交易类型
     * @param RuleKey RuleKey：分账维度
枚举值：
ownerUin - 使用者UIN,
operateUin - 操作者UIN,
businessCode - 产品一层编码,
productCode - 产品二层编码,
itemCode - 产品四层编码,
projectId - 项目ID,
regionId - 地域ID,
resourceId - 资源ID,
tag - 标签键值对,
payMode - 计费模式,
instanceType - 实例类型,
actionType - 交易类型
     */
    public void setRuleKey(String RuleKey) {
        this.RuleKey = RuleKey;
    }

    /**
     * Get 分账维度规则
枚举值：
in - 是
not in - 不是 
     * @return Operator 分账维度规则
枚举值：
in - 是
not in - 不是
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 分账维度规则
枚举值：
in - 是
not in - 不是
     * @param Operator 分账维度规则
枚举值：
in - 是
not in - 不是
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 分账维度值，例如当RuleKey为businessCode时，["p_cbs","p_sqlserver"]表示产品一层是"p_cbs","p_sqlserver"的费用 
     * @return RuleValue 分账维度值，例如当RuleKey为businessCode时，["p_cbs","p_sqlserver"]表示产品一层是"p_cbs","p_sqlserver"的费用
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set 分账维度值，例如当RuleKey为businessCode时，["p_cbs","p_sqlserver"]表示产品一层是"p_cbs","p_sqlserver"的费用
     * @param RuleValue 分账维度值，例如当RuleKey为businessCode时，["p_cbs","p_sqlserver"]表示产品一层是"p_cbs","p_sqlserver"的费用
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    /**
     * Get 分账逻辑连接词，枚举值如下：
and - 且
or - 或 
     * @return Connectors 分账逻辑连接词，枚举值如下：
and - 且
or - 或
     */
    public String getConnectors() {
        return this.Connectors;
    }

    /**
     * Set 分账逻辑连接词，枚举值如下：
and - 且
or - 或
     * @param Connectors 分账逻辑连接词，枚举值如下：
and - 且
or - 或
     */
    public void setConnectors(String Connectors) {
        this.Connectors = Connectors;
    }

    /**
     * Get 嵌套规则 
     * @return Children 嵌套规则
     */
    public AllocationRuleExpression [] getChildren() {
        return this.Children;
    }

    /**
     * Set 嵌套规则
     * @param Children 嵌套规则
     */
    public void setChildren(AllocationRuleExpression [] Children) {
        this.Children = Children;
    }

    public AllocationRuleExpression() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationRuleExpression(AllocationRuleExpression source) {
        if (source.RuleKey != null) {
            this.RuleKey = new String(source.RuleKey);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.RuleValue != null) {
            this.RuleValue = new String[source.RuleValue.length];
            for (int i = 0; i < source.RuleValue.length; i++) {
                this.RuleValue[i] = new String(source.RuleValue[i]);
            }
        }
        if (source.Connectors != null) {
            this.Connectors = new String(source.Connectors);
        }
        if (source.Children != null) {
            this.Children = new AllocationRuleExpression[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new AllocationRuleExpression(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleKey", this.RuleKey);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);
        this.setParamSimple(map, prefix + "Connectors", this.Connectors);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

