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
    * 待添加的 VPC边界规则列表，至少包含一条，可包含不同 IpVersion。EdgeId 调用 DescribeVpcAclEdgeRange，传 FromList=switchs，并使用 EdgeRanges[].EdgeId；FromList=rules 只返回已有规则使用过的范围，不用于发现可新增范围。FwGroupId 调用 DescribeFwGroupIdNames，IpVersion 使用与目标规则相同的 JSON 整数 0 或 1，并使用 Data[].FwGroupId，不要使用 FwGroupName。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON，不要写入 GroupId。batch_import_cover 的覆盖范围仅由首条规则的 IpVersion 决定。
    */
    @SerializedName("Rules")
    @Expose
    private VpcRuleItem [] Rules;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * 添加方式。省略或为空表示普通新增；insert_rule 表示按 OrderIndex 插入；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除首条规则 IpVersion 对应的现有可操作规则后再按 Rules 顺序添加，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get 待添加的 VPC边界规则列表，至少包含一条，可包含不同 IpVersion。EdgeId 调用 DescribeVpcAclEdgeRange，传 FromList=switchs，并使用 EdgeRanges[].EdgeId；FromList=rules 只返回已有规则使用过的范围，不用于发现可新增范围。FwGroupId 调用 DescribeFwGroupIdNames，IpVersion 使用与目标规则相同的 JSON 整数 0 或 1，并使用 Data[].FwGroupId，不要使用 FwGroupName。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON，不要写入 GroupId。batch_import_cover 的覆盖范围仅由首条规则的 IpVersion 决定。 
     * @return Rules 待添加的 VPC边界规则列表，至少包含一条，可包含不同 IpVersion。EdgeId 调用 DescribeVpcAclEdgeRange，传 FromList=switchs，并使用 EdgeRanges[].EdgeId；FromList=rules 只返回已有规则使用过的范围，不用于发现可新增范围。FwGroupId 调用 DescribeFwGroupIdNames，IpVersion 使用与目标规则相同的 JSON 整数 0 或 1，并使用 Data[].FwGroupId，不要使用 FwGroupName。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON，不要写入 GroupId。batch_import_cover 的覆盖范围仅由首条规则的 IpVersion 决定。
     */
    public VpcRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set 待添加的 VPC边界规则列表，至少包含一条，可包含不同 IpVersion。EdgeId 调用 DescribeVpcAclEdgeRange，传 FromList=switchs，并使用 EdgeRanges[].EdgeId；FromList=rules 只返回已有规则使用过的范围，不用于发现可新增范围。FwGroupId 调用 DescribeFwGroupIdNames，IpVersion 使用与目标规则相同的 JSON 整数 0 或 1，并使用 Data[].FwGroupId，不要使用 FwGroupName。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON，不要写入 GroupId。batch_import_cover 的覆盖范围仅由首条规则的 IpVersion 决定。
     * @param Rules 待添加的 VPC边界规则列表，至少包含一条，可包含不同 IpVersion。EdgeId 调用 DescribeVpcAclEdgeRange，传 FromList=switchs，并使用 EdgeRanges[].EdgeId；FromList=rules 只返回已有规则使用过的范围，不用于发现可新增范围。FwGroupId 调用 DescribeFwGroupIdNames，IpVersion 使用与目标规则相同的 JSON 整数 0 或 1，并使用 Data[].FwGroupId，不要使用 FwGroupName。地址模板调用 DescribeAddressTemplateList，请求用 TemplateType=1 或 5 过滤，并确认返回项 Data[].Type 为 1 或 5；将 Data[].Uuid（mb_ 前缀）写入对应 Content，不要使用 Data[].TemplateId（ip-/dm- 前缀）。协议端口模板请求用 TemplateType=6 过滤，并将 Data[].TemplateId（pp- 前缀）写入 ParamTemplateId。资产实例调用 DescribeCfwAssets，解析返回结果后使用 assets[].instance_id；资产分组调用 DescribeResourceGroupNew，传 QueryType=resource、GroupId="0"、ShowType=all，解析返回结果后使用 GroupId；资源标签传 QueryType=tag，跳过“全部资产”根节点，以一级节点 GroupName 为 Key、所选二级子节点 GroupName 为 Value 构造 JSON，不要写入 GroupId。batch_import_cover 的覆盖范围仅由首条规则的 IpVersion 决定。
     */
    public void setRules(VpcRuleItem [] Rules) {
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
     * Get 添加方式。省略或为空表示普通新增；insert_rule 表示按 OrderIndex 插入；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除首条规则 IpVersion 对应的现有可操作规则后再按 Rules 顺序添加，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。 
     * @return From 添加方式。省略或为空表示普通新增；insert_rule 表示按 OrderIndex 插入；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除首条规则 IpVersion 对应的现有可操作规则后再按 Rules 顺序添加，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 添加方式。省略或为空表示普通新增；insert_rule 表示按 OrderIndex 插入；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除首条规则 IpVersion 对应的现有可操作规则后再按 Rules 顺序添加，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。
     * @param From 添加方式。省略或为空表示普通新增；insert_rule 表示按 OrderIndex 插入；batch_import 表示非覆盖批量导入；batch_import_cover 表示覆盖导入，会删除首条规则 IpVersion 对应的现有可操作规则后再按 Rules 顺序添加，添加失败时已删除的规则不会恢复，风险极高。仅支持上述取值。
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

