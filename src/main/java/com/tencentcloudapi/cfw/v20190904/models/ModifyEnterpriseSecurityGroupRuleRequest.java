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

public class ModifyEnterpriseSecurityGroupRuleRequest extends AbstractModel {

    /**
    * 修改类型，仅接受 0、1、2。0：用 Data 完整替换 RuleUuid 指定规则的可写内容；1：修改 RuleUuid 指定规则的启停状态；2：修改当前账号全部可操作规则的启停状态。
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * 规则数值 ID。ModifyType=0 或 1 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false，并使用返回的 rules[].uuid；ModifyType=2 时传 0。
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * ModifyType=0 时必填的完整规则内容对象，不是局部更新。调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false 获取原规则：src_content、dst_content 分别写入 SourceContent、DestContent；src_type 和 dst_type 的 0、1/2/3/4/5/6/16/24/25、7、8、9/10、100 分别对应 net、instance、template、tag、region、resourcegroup，DestType 的 20 对应 dnsparse；未列出的数值类型不能转换。再调用 DescribeEnterpriseSecurityGroupRule，使用同一 RuleUuid 获取 OrderIndex、Protocol、Port、RuleAction、Description、Scope 和 ServiceTemplateId。缺失字段按空值处理，仅 Scope 省略时保留原值。ModifyType=1 或 2 时不传 Data。
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupRule Data;

    /**
    * 规则状态，JSON 整数：0 表示关闭，1 表示开启。ModifyType=1 时修改 RuleUuid 指定规则，ModifyType=2 时修改当前账号的全部可操作规则；这两种模式下应显式填写。ModifyType=0 时忽略该字段。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 修改类型，仅接受 0、1、2。0：用 Data 完整替换 RuleUuid 指定规则的可写内容；1：修改 RuleUuid 指定规则的启停状态；2：修改当前账号全部可操作规则的启停状态。 
     * @return ModifyType 修改类型，仅接受 0、1、2。0：用 Data 完整替换 RuleUuid 指定规则的可写内容；1：修改 RuleUuid 指定规则的启停状态；2：修改当前账号全部可操作规则的启停状态。
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 修改类型，仅接受 0、1、2。0：用 Data 完整替换 RuleUuid 指定规则的可写内容；1：修改 RuleUuid 指定规则的启停状态；2：修改当前账号全部可操作规则的启停状态。
     * @param ModifyType 修改类型，仅接受 0、1、2。0：用 Data 完整替换 RuleUuid 指定规则的可写内容；1：修改 RuleUuid 指定规则的启停状态；2：修改当前账号全部可操作规则的启停状态。
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 规则数值 ID。ModifyType=0 或 1 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false，并使用返回的 rules[].uuid；ModifyType=2 时传 0。 
     * @return RuleUuid 规则数值 ID。ModifyType=0 或 1 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false，并使用返回的 rules[].uuid；ModifyType=2 时传 0。
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set 规则数值 ID。ModifyType=0 或 1 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false，并使用返回的 rules[].uuid；ModifyType=2 时传 0。
     * @param RuleUuid 规则数值 ID。ModifyType=0 或 1 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false，并使用返回的 rules[].uuid；ModifyType=2 时传 0。
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
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
     * Get ModifyType=0 时必填的完整规则内容对象，不是局部更新。调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false 获取原规则：src_content、dst_content 分别写入 SourceContent、DestContent；src_type 和 dst_type 的 0、1/2/3/4/5/6/16/24/25、7、8、9/10、100 分别对应 net、instance、template、tag、region、resourcegroup，DestType 的 20 对应 dnsparse；未列出的数值类型不能转换。再调用 DescribeEnterpriseSecurityGroupRule，使用同一 RuleUuid 获取 OrderIndex、Protocol、Port、RuleAction、Description、Scope 和 ServiceTemplateId。缺失字段按空值处理，仅 Scope 省略时保留原值。ModifyType=1 或 2 时不传 Data。 
     * @return Data ModifyType=0 时必填的完整规则内容对象，不是局部更新。调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false 获取原规则：src_content、dst_content 分别写入 SourceContent、DestContent；src_type 和 dst_type 的 0、1/2/3/4/5/6/16/24/25、7、8、9/10、100 分别对应 net、instance、template、tag、region、resourcegroup，DestType 的 20 对应 dnsparse；未列出的数值类型不能转换。再调用 DescribeEnterpriseSecurityGroupRule，使用同一 RuleUuid 获取 OrderIndex、Protocol、Port、RuleAction、Description、Scope 和 ServiceTemplateId。缺失字段按空值处理，仅 Scope 省略时保留原值。ModifyType=1 或 2 时不传 Data。
     */
    public SecurityGroupRule getData() {
        return this.Data;
    }

    /**
     * Set ModifyType=0 时必填的完整规则内容对象，不是局部更新。调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false 获取原规则：src_content、dst_content 分别写入 SourceContent、DestContent；src_type 和 dst_type 的 0、1/2/3/4/5/6/16/24/25、7、8、9/10、100 分别对应 net、instance、template、tag、region、resourcegroup，DestType 的 20 对应 dnsparse；未列出的数值类型不能转换。再调用 DescribeEnterpriseSecurityGroupRule，使用同一 RuleUuid 获取 OrderIndex、Protocol、Port、RuleAction、Description、Scope 和 ServiceTemplateId。缺失字段按空值处理，仅 Scope 省略时保留原值。ModifyType=1 或 2 时不传 Data。
     * @param Data ModifyType=0 时必填的完整规则内容对象，不是局部更新。调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=<数值 RuleUuid>、ExpandNames=false 获取原规则：src_content、dst_content 分别写入 SourceContent、DestContent；src_type 和 dst_type 的 0、1/2/3/4/5/6/16/24/25、7、8、9/10、100 分别对应 net、instance、template、tag、region、resourcegroup，DestType 的 20 对应 dnsparse；未列出的数值类型不能转换。再调用 DescribeEnterpriseSecurityGroupRule，使用同一 RuleUuid 获取 OrderIndex、Protocol、Port、RuleAction、Description、Scope 和 ServiceTemplateId。缺失字段按空值处理，仅 Scope 省略时保留原值。ModifyType=1 或 2 时不传 Data。
     */
    public void setData(SecurityGroupRule Data) {
        this.Data = Data;
    }

    /**
     * Get 规则状态，JSON 整数：0 表示关闭，1 表示开启。ModifyType=1 时修改 RuleUuid 指定规则，ModifyType=2 时修改当前账号的全部可操作规则；这两种模式下应显式填写。ModifyType=0 时忽略该字段。 
     * @return Enable 规则状态，JSON 整数：0 表示关闭，1 表示开启。ModifyType=1 时修改 RuleUuid 指定规则，ModifyType=2 时修改当前账号的全部可操作规则；这两种模式下应显式填写。ModifyType=0 时忽略该字段。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 规则状态，JSON 整数：0 表示关闭，1 表示开启。ModifyType=1 时修改 RuleUuid 指定规则，ModifyType=2 时修改当前账号的全部可操作规则；这两种模式下应显式填写。ModifyType=0 时忽略该字段。
     * @param Enable 规则状态，JSON 整数：0 表示关闭，1 表示开启。ModifyType=1 时修改 RuleUuid 指定规则，ModifyType=2 时修改当前账号的全部可操作规则；这两种模式下应显式填写。ModifyType=0 时忽略该字段。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnterpriseSecurityGroupRuleRequest(ModifyEnterpriseSecurityGroupRuleRequest source) {
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.Data != null) {
            this.Data = new SecurityGroupRule(source.Data);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

