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

public class DescribeEnterpriseSecurityGroupRuleRequest extends AbstractModel{

    /**
    * 分页查询时，显示的当前页的页码。

默认值为1。
    */
    @SerializedName("PageNo")
    @Expose
    private String PageNo;

    /**
    * 分页查询时，显示的每页数据的最大条数。

可设置值最大为50。
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
支持通配
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
支持通配
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 规则描述，支持通配
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 是否启用规则，默认为启用，取值：
true为启用，false为不启用
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议；TCP/UDP/ICMP/ANY
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
     * Get 分页查询时，显示的当前页的页码。

默认值为1。 
     * @return PageNo 分页查询时，显示的当前页的页码。

默认值为1。
     */
    public String getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 分页查询时，显示的当前页的页码。

默认值为1。
     * @param PageNo 分页查询时，显示的当前页的页码。

默认值为1。
     */
    public void setPageNo(String PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 分页查询时，显示的每页数据的最大条数。

可设置值最大为50。 
     * @return PageSize 分页查询时，显示的每页数据的最大条数。

可设置值最大为50。
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页查询时，显示的每页数据的最大条数。

可设置值最大为50。
     * @param PageSize 分页查询时，显示的每页数据的最大条数。

可设置值最大为50。
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
支持通配 
     * @return SourceContent 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
支持通配
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
支持通配
     * @param SourceContent 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
支持通配
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
支持通配 
     * @return DestContent 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
支持通配
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
支持通配
     * @param DestContent 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板(ipm-dyodhpby)
instance：资产实例(ins-123456)
resourcegroup：资产分组(/全部分组/分组1/子分组1)
tag：资源标签({"Key":"标签key值","Value":"标签Value值"})
region：地域(ap-gaungzhou)
支持通配
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 规则描述，支持通配 
     * @return Description 规则描述，支持通配
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述，支持通配
     * @param Description 规则描述，支持通配
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝 
     * @return RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
     * @param RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 是否启用规则，默认为启用，取值：
true为启用，false为不启用 
     * @return Enable 是否启用规则，默认为启用，取值：
true为启用，false为不启用
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用规则，默认为启用，取值：
true为启用，false为不启用
     * @param Enable 是否启用规则，默认为启用，取值：
true为启用，false为不启用
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口 
     * @return Port 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
     * @param Port 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议；TCP/UDP/ICMP/ANY 
     * @return Protocol 协议；TCP/UDP/ICMP/ANY
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议；TCP/UDP/ICMP/ANY
     * @param Protocol 协议；TCP/UDP/ICMP/ANY
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥 
     * @return ServiceTemplateId 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
     * @param ServiceTemplateId 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    public DescribeEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnterpriseSecurityGroupRuleRequest(DescribeEnterpriseSecurityGroupRuleRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new String(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);

    }
}

