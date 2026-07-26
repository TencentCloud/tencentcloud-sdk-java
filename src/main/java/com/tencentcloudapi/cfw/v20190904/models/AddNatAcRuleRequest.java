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

public class AddNatAcRuleRequest extends AbstractModel {

    /**
    * <p>要添加的 NAT 访问控制规则列表，至少一项。Direction、地址类型与内容、Protocol、RuleAction 和 Scope 会逐项校验；Description、Enable、OrderIndex 和 Scope 的缺省或归一化行为见对应字段说明。Scope 调用无业务参数的 DescribeNatRuleScopes，使用 ScopeItems[].Scope，不要使用 ScopeDesc。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON 字符串 {"Key":"标签键","Value":"标签值"}，不要写入 GroupId；地域调用 DescribeAclRegInfo，传 FwType=["NAT"] 并使用 Data[].RegionCode。不得使用展示名称或自行拼接。</p>
    */
    @SerializedName("Rules")
    @Expose
    private CreateNatRuleItem [] Rules;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>添加方式。省略或为空表示普通新增；insert_rule 表示指定位置新增；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号中与首条规则同方向的全部可操作 NAT边界规则后再添加 Rules，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。</p>
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get <p>要添加的 NAT 访问控制规则列表，至少一项。Direction、地址类型与内容、Protocol、RuleAction 和 Scope 会逐项校验；Description、Enable、OrderIndex 和 Scope 的缺省或归一化行为见对应字段说明。Scope 调用无业务参数的 DescribeNatRuleScopes，使用 ScopeItems[].Scope，不要使用 ScopeDesc。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON 字符串 {"Key":"标签键","Value":"标签值"}，不要写入 GroupId；地域调用 DescribeAclRegInfo，传 FwType=["NAT"] 并使用 Data[].RegionCode。不得使用展示名称或自行拼接。</p> 
     * @return Rules <p>要添加的 NAT 访问控制规则列表，至少一项。Direction、地址类型与内容、Protocol、RuleAction 和 Scope 会逐项校验；Description、Enable、OrderIndex 和 Scope 的缺省或归一化行为见对应字段说明。Scope 调用无业务参数的 DescribeNatRuleScopes，使用 ScopeItems[].Scope，不要使用 ScopeDesc。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON 字符串 {"Key":"标签键","Value":"标签值"}，不要写入 GroupId；地域调用 DescribeAclRegInfo，传 FwType=["NAT"] 并使用 Data[].RegionCode。不得使用展示名称或自行拼接。</p>
     */
    public CreateNatRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>要添加的 NAT 访问控制规则列表，至少一项。Direction、地址类型与内容、Protocol、RuleAction 和 Scope 会逐项校验；Description、Enable、OrderIndex 和 Scope 的缺省或归一化行为见对应字段说明。Scope 调用无业务参数的 DescribeNatRuleScopes，使用 ScopeItems[].Scope，不要使用 ScopeDesc。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON 字符串 {"Key":"标签键","Value":"标签值"}，不要写入 GroupId；地域调用 DescribeAclRegInfo，传 FwType=["NAT"] 并使用 Data[].RegionCode。不得使用展示名称或自行拼接。</p>
     * @param Rules <p>要添加的 NAT 访问控制规则列表，至少一项。Direction、地址类型与内容、Protocol、RuleAction 和 Scope 会逐项校验；Description、Enable、OrderIndex 和 Scope 的缺省或归一化行为见对应字段说明。Scope 调用无业务参数的 DescribeNatRuleScopes，使用 ScopeItems[].Scope，不要使用 ScopeDesc。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON 字符串 {"Key":"标签键","Value":"标签值"}，不要写入 GroupId；地域调用 DescribeAclRegInfo，传 FwType=["NAT"] 并使用 Data[].RegionCode。不得使用展示名称或自行拼接。</p>
     */
    public void setRules(CreateNatRuleItem [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>添加方式。省略或为空表示普通新增；insert_rule 表示指定位置新增；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号中与首条规则同方向的全部可操作 NAT边界规则后再添加 Rules，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。</p> 
     * @return From <p>添加方式。省略或为空表示普通新增；insert_rule 表示指定位置新增；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号中与首条规则同方向的全部可操作 NAT边界规则后再添加 Rules，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。</p>
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set <p>添加方式。省略或为空表示普通新增；insert_rule 表示指定位置新增；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号中与首条规则同方向的全部可操作 NAT边界规则后再添加 Rules，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。</p>
     * @param From <p>添加方式。省略或为空表示普通新增；insert_rule 表示指定位置新增；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除当前账号中与首条规则同方向的全部可操作 NAT边界规则后再添加 Rules，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。</p>
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

