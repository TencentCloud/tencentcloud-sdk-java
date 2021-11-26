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

public class SecurityGroupRule extends AbstractModel{

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
    * 访问源类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

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
    * 访问目的类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则顺序，-1表示最低，1表示最高
    */
    @SerializedName("OrderIndex")
    @Expose
    private String OrderIndex;

    /**
    * 协议；TCP/UDP/ICMP/ANY
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 规则对应的唯一id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 规则状态，true表示启用，false表示禁用
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

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

    /**
     * Get 访问源类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region 
     * @return SourceType 访问源类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region
     * @param SourceType 访问源类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
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
     * Get 访问目的类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region 
     * @return DestType 访问目的类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 访问目的类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region
     * @param DestType 访问目的类型，类型可以为以下6种：net|template|instance|resourcegroup|tag|region
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
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
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则顺序，-1表示最低，1表示最高 
     * @return OrderIndex 规则顺序，-1表示最低，1表示最高
     */
    public String getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 规则顺序，-1表示最低，1表示最高
     * @param OrderIndex 规则顺序，-1表示最低，1表示最高
     */
    public void setOrderIndex(String OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 协议；TCP/UDP/ICMP/ANY
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议；TCP/UDP/ICMP/ANY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议；TCP/UDP/ICMP/ANY
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议；TCP/UDP/ICMP/ANY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceTemplateId 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceTemplateId 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get 规则对应的唯一id 
     * @return Id 规则对应的唯一id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 规则对应的唯一id
     * @param Id 规则对应的唯一id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 规则状态，true表示启用，false表示禁用 
     * @return Enable 规则状态，true表示启用，false表示禁用
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 规则状态，true表示启用，false表示禁用
     * @param Enable 规则状态，true表示启用，false表示禁用
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    public SecurityGroupRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupRule(SecurityGroupRule source) {
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new String(source.OrderIndex);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

