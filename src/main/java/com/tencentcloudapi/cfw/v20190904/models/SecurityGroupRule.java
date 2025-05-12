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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupRule extends AbstractModel {

    /**
    * 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
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
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
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
    * 规则描述 用于规则使用或者场景的描述，最多支持50个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则顺序，-1表示最低，1表示最高，请勿和外层Type冲突（和外层的Type配合使用，当中间插入时，指定添加位置）
    */
    @SerializedName("OrderIndex")
    @Expose
    private String OrderIndex;

    /**
    * 协议；TCP/UDP/ICMP/ICMPv6/ANY
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 端口协议类型参数模板id；协议端口模板id；与Protocol,Port互斥
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * （入参时无需填写，自动生成）规则对应的唯一id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * （入参时、Enable已弃用；由通用配置中新增规则启用状态控制）
规则状态，true表示启用，false表示禁用
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 规则对应的唯一内部id
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
     * Get 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
region：地域(ap-gaungzhou) 
     * @return SourceContent 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
region：地域(ap-gaungzhou)
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
region：地域(ap-gaungzhou)
     * @param SourceContent 访问源示例：
net：IP/CIDR(192.168.0.2)
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
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
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
region：地域(ap-gaungzhou) 
     * @return DestContent 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
region：地域(ap-gaungzhou)
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
region：地域(ap-gaungzhou)
     * @param DestContent 访问目的示例：
net：IP/CIDR(192.168.0.2)
template：参数模板id(ipm-dyodhpby)
instance：资产实例id(ins-123456)
resourcegroup：资产分组id(cfwrg-xxxx)
tag：资源标签({\"Key\":\"标签key值\",\"Value\":\"标签Value值\"})
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
     * Get 规则描述 用于规则使用或者场景的描述，最多支持50个字符 
     * @return Description 规则描述 用于规则使用或者场景的描述，最多支持50个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述 用于规则使用或者场景的描述，最多支持50个字符
     * @param Description 规则描述 用于规则使用或者场景的描述，最多支持50个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则顺序，-1表示最低，1表示最高，请勿和外层Type冲突（和外层的Type配合使用，当中间插入时，指定添加位置） 
     * @return OrderIndex 规则顺序，-1表示最低，1表示最高，请勿和外层Type冲突（和外层的Type配合使用，当中间插入时，指定添加位置）
     */
    public String getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 规则顺序，-1表示最低，1表示最高，请勿和外层Type冲突（和外层的Type配合使用，当中间插入时，指定添加位置）
     * @param OrderIndex 规则顺序，-1表示最低，1表示最高，请勿和外层Type冲突（和外层的Type配合使用，当中间插入时，指定添加位置）
     */
    public void setOrderIndex(String OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 协议；TCP/UDP/ICMP/ICMPv6/ANY 
     * @return Protocol 协议；TCP/UDP/ICMP/ICMPv6/ANY
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议；TCP/UDP/ICMP/ICMPv6/ANY
     * @param Protocol 协议；TCP/UDP/ICMP/ICMPv6/ANY
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
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

    /**
     * Get （入参时无需填写，自动生成）规则对应的唯一id 
     * @return Id （入参时无需填写，自动生成）规则对应的唯一id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set （入参时无需填写，自动生成）规则对应的唯一id
     * @param Id （入参时无需填写，自动生成）规则对应的唯一id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get （入参时、Enable已弃用；由通用配置中新增规则启用状态控制）
规则状态，true表示启用，false表示禁用 
     * @return Enable （入参时、Enable已弃用；由通用配置中新增规则启用状态控制）
规则状态，true表示启用，false表示禁用
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set （入参时、Enable已弃用；由通用配置中新增规则启用状态控制）
规则状态，true表示启用，false表示禁用
     * @param Enable （入参时、Enable已弃用；由通用配置中新增规则启用状态控制）
规则状态，true表示启用，false表示禁用
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 规则对应的唯一内部id 
     * @return Uid 规则对应的唯一内部id
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 规则对应的唯一内部id
     * @param Uid 规则对应的唯一内部id
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
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
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
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
        this.setParamSimple(map, prefix + "Uid", this.Uid);

    }
}

