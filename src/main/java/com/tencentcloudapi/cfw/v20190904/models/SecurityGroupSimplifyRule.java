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

public class SecurityGroupSimplifyRule extends AbstractModel {

    /**
    * 写入规则的描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 写入规则的协议。普通 IPv4 规则返回 ANY、TCP、UDP 或 ICMP；使用服务模板时，Protocol 可省略或留空，此时返回空字符串；若仍显式填写 Protocol，则只接受 ANY 并返回 ANY。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 服务端写入后生成或采用的规则数据库 ID。
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * 写入后的规则生效范围；SG 表示安全组，LH 表示轻量应用服务器，组合范围以逗号分隔。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 服务端写入后的实际规则顺序。
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
     * Get 写入规则的描述。 
     * @return Description 写入规则的描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 写入规则的描述。
     * @param Description 写入规则的描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou) 
     * @return DestContent 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
     * @param DestContent 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 写入规则的协议。普通 IPv4 规则返回 ANY、TCP、UDP 或 ICMP；使用服务模板时，Protocol 可省略或留空，此时返回空字符串；若仍显式填写 Protocol，则只接受 ANY 并返回 ANY。 
     * @return Protocol 写入规则的协议。普通 IPv4 规则返回 ANY、TCP、UDP 或 ICMP；使用服务模板时，Protocol 可省略或留空，此时返回空字符串；若仍显式填写 Protocol，则只接受 ANY 并返回 ANY。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 写入规则的协议。普通 IPv4 规则返回 ANY、TCP、UDP 或 ICMP；使用服务模板时，Protocol 可省略或留空，此时返回空字符串；若仍显式填写 Protocol，则只接受 ANY 并返回 ANY。
     * @param Protocol 写入规则的协议。普通 IPv4 规则返回 ANY、TCP、UDP 或 ICMP；使用服务模板时，Protocol 可省略或留空，此时返回空字符串；若仍显式填写 Protocol，则只接受 ANY 并返回 ANY。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 服务端写入后生成或采用的规则数据库 ID。 
     * @return RuleUuid 服务端写入后生成或采用的规则数据库 ID。
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set 服务端写入后生成或采用的规则数据库 ID。
     * @param RuleUuid 服务端写入后生成或采用的规则数据库 ID。
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get 写入后的规则生效范围；SG 表示安全组，LH 表示轻量应用服务器，组合范围以逗号分隔。 
     * @return Scope 写入后的规则生效范围；SG 表示安全组，LH 表示轻量应用服务器，组合范围以逗号分隔。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 写入后的规则生效范围；SG 表示安全组，LH 表示轻量应用服务器，组合范围以逗号分隔。
     * @param Scope 写入后的规则生效范围；SG 表示安全组，LH 表示轻量应用服务器，组合范围以逗号分隔。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 服务端写入后的实际规则顺序。 
     * @return Sequence 服务端写入后的实际规则顺序。
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set 服务端写入后的实际规则顺序。
     * @param Sequence 服务端写入后的实际规则顺序。
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou) 
     * @return SourceContent 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
     * @param SourceContent 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    public SecurityGroupSimplifyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupSimplifyRule(SecurityGroupSimplifyRule source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);

    }
}

