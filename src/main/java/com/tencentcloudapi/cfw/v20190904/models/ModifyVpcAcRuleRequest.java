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

public class ModifyVpcAcRuleRequest extends AbstractModel {

    /**
    * 待修改的规则数组，必须恰好包含一条完整规则，不是局部更新。调用 DescribeCfwRules，传 RuleType=vpc、目标 RuleUuid、ExpandNames=false 获取原规则。字段转换：uuid→Uuid，sequence→OrderIndex，src_ip→SourceContent，src_type→SourceType，dst_content→DestContent，dst_type→DestType，dst_port→Port，detail→Description，edge_id→EdgeId，fwgroupid→FwGroupId，ip_version→IpVersion；action 的 0、1、2 分别转换为 log、drop、accept，enabled 的布尔值转换为字符串 true、false；protocol、param_template_id、dest_value_type 分别写入 Protocol、ParamTemplateId、DestValueType。src_type 和 dst_type 的 1、2、3、4/5、6、8、9、10、100 分别对应 net、url、domain、template、instance、tag、dnsparse、domainiptwoverify、group；仅当转换结果属于对应 SourceType 或 DestType 的有效取值时才能提交。省略的可写字段不会继承旧值，IpVersion=0 也必须传入。不修改生效范围时，将原规则的 edge_id 和 fwgroupid 原样写入 EdgeId 和 FwGroupId；主动更换时，EdgeId 通过 DescribeVpcAclEdgeRange 查询，FwGroupId 通过 DescribeFwGroupIdNames 查询。
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
     * Get 待修改的规则数组，必须恰好包含一条完整规则，不是局部更新。调用 DescribeCfwRules，传 RuleType=vpc、目标 RuleUuid、ExpandNames=false 获取原规则。字段转换：uuid→Uuid，sequence→OrderIndex，src_ip→SourceContent，src_type→SourceType，dst_content→DestContent，dst_type→DestType，dst_port→Port，detail→Description，edge_id→EdgeId，fwgroupid→FwGroupId，ip_version→IpVersion；action 的 0、1、2 分别转换为 log、drop、accept，enabled 的布尔值转换为字符串 true、false；protocol、param_template_id、dest_value_type 分别写入 Protocol、ParamTemplateId、DestValueType。src_type 和 dst_type 的 1、2、3、4/5、6、8、9、10、100 分别对应 net、url、domain、template、instance、tag、dnsparse、domainiptwoverify、group；仅当转换结果属于对应 SourceType 或 DestType 的有效取值时才能提交。省略的可写字段不会继承旧值，IpVersion=0 也必须传入。不修改生效范围时，将原规则的 edge_id 和 fwgroupid 原样写入 EdgeId 和 FwGroupId；主动更换时，EdgeId 通过 DescribeVpcAclEdgeRange 查询，FwGroupId 通过 DescribeFwGroupIdNames 查询。 
     * @return Rules 待修改的规则数组，必须恰好包含一条完整规则，不是局部更新。调用 DescribeCfwRules，传 RuleType=vpc、目标 RuleUuid、ExpandNames=false 获取原规则。字段转换：uuid→Uuid，sequence→OrderIndex，src_ip→SourceContent，src_type→SourceType，dst_content→DestContent，dst_type→DestType，dst_port→Port，detail→Description，edge_id→EdgeId，fwgroupid→FwGroupId，ip_version→IpVersion；action 的 0、1、2 分别转换为 log、drop、accept，enabled 的布尔值转换为字符串 true、false；protocol、param_template_id、dest_value_type 分别写入 Protocol、ParamTemplateId、DestValueType。src_type 和 dst_type 的 1、2、3、4/5、6、8、9、10、100 分别对应 net、url、domain、template、instance、tag、dnsparse、domainiptwoverify、group；仅当转换结果属于对应 SourceType 或 DestType 的有效取值时才能提交。省略的可写字段不会继承旧值，IpVersion=0 也必须传入。不修改生效范围时，将原规则的 edge_id 和 fwgroupid 原样写入 EdgeId 和 FwGroupId；主动更换时，EdgeId 通过 DescribeVpcAclEdgeRange 查询，FwGroupId 通过 DescribeFwGroupIdNames 查询。
     */
    public VpcRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set 待修改的规则数组，必须恰好包含一条完整规则，不是局部更新。调用 DescribeCfwRules，传 RuleType=vpc、目标 RuleUuid、ExpandNames=false 获取原规则。字段转换：uuid→Uuid，sequence→OrderIndex，src_ip→SourceContent，src_type→SourceType，dst_content→DestContent，dst_type→DestType，dst_port→Port，detail→Description，edge_id→EdgeId，fwgroupid→FwGroupId，ip_version→IpVersion；action 的 0、1、2 分别转换为 log、drop、accept，enabled 的布尔值转换为字符串 true、false；protocol、param_template_id、dest_value_type 分别写入 Protocol、ParamTemplateId、DestValueType。src_type 和 dst_type 的 1、2、3、4/5、6、8、9、10、100 分别对应 net、url、domain、template、instance、tag、dnsparse、domainiptwoverify、group；仅当转换结果属于对应 SourceType 或 DestType 的有效取值时才能提交。省略的可写字段不会继承旧值，IpVersion=0 也必须传入。不修改生效范围时，将原规则的 edge_id 和 fwgroupid 原样写入 EdgeId 和 FwGroupId；主动更换时，EdgeId 通过 DescribeVpcAclEdgeRange 查询，FwGroupId 通过 DescribeFwGroupIdNames 查询。
     * @param Rules 待修改的规则数组，必须恰好包含一条完整规则，不是局部更新。调用 DescribeCfwRules，传 RuleType=vpc、目标 RuleUuid、ExpandNames=false 获取原规则。字段转换：uuid→Uuid，sequence→OrderIndex，src_ip→SourceContent，src_type→SourceType，dst_content→DestContent，dst_type→DestType，dst_port→Port，detail→Description，edge_id→EdgeId，fwgroupid→FwGroupId，ip_version→IpVersion；action 的 0、1、2 分别转换为 log、drop、accept，enabled 的布尔值转换为字符串 true、false；protocol、param_template_id、dest_value_type 分别写入 Protocol、ParamTemplateId、DestValueType。src_type 和 dst_type 的 1、2、3、4/5、6、8、9、10、100 分别对应 net、url、domain、template、instance、tag、dnsparse、domainiptwoverify、group；仅当转换结果属于对应 SourceType 或 DestType 的有效取值时才能提交。省略的可写字段不会继承旧值，IpVersion=0 也必须传入。不修改生效范围时，将原规则的 edge_id 和 fwgroupid 原样写入 EdgeId 和 FwGroupId；主动更换时，EdgeId 通过 DescribeVpcAclEdgeRange 查询，FwGroupId 通过 DescribeFwGroupIdNames 查询。
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

    public ModifyVpcAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpcAcRuleRequest(ModifyVpcAcRuleRequest source) {
        if (source.Rules != null) {
            this.Rules = new VpcRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new VpcRuleItem(source.Rules[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);

    }
}

