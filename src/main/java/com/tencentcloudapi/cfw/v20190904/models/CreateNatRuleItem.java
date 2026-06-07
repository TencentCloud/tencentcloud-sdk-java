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

public class CreateNatRuleItem extends AbstractModel {

    /**
    * <p>访问源示例： net：IP/CIDR(192.168.0.2)</p>
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * <p>访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com</p>
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * <p>访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>访问控制策略的端口。取值： -1/-1：全部端口 80：80端口</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>规则方向：1，入站；0，出站</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>规则序号</p>
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * <p>规则状态，true表示启用，false表示禁用</p>
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * <p>规则对应的唯一id，创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p><p>创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p>
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>端口协议组ID</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * <p>内部id</p>
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * <p>规则生效的范围：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
     * Get <p>访问源示例： net：IP/CIDR(192.168.0.2)</p> 
     * @return SourceContent <p>访问源示例： net：IP/CIDR(192.168.0.2)</p>
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set <p>访问源示例： net：IP/CIDR(192.168.0.2)</p>
     * @param SourceContent <p>访问源示例： net：IP/CIDR(192.168.0.2)</p>
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get <p>访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag</p> 
     * @return SourceType <p>访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag</p>
     * @param SourceType <p>访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com</p> 
     * @return TargetContent <p>访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com</p>
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set <p>访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com</p>
     * @param TargetContent <p>访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com</p>
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get <p>访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location</p> 
     * @return TargetType <p>访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location</p>
     * @param TargetType <p>访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS</p> 
     * @return Protocol <p>协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS</p>
     * @param Protocol <p>协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察</p> 
     * @return RuleAction <p>访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察</p>
     * @param RuleAction <p>访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>访问控制策略的端口。取值： -1/-1：全部端口 80：80端口</p> 
     * @return Port <p>访问控制策略的端口。取值： -1/-1：全部端口 80：80端口</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>访问控制策略的端口。取值： -1/-1：全部端口 80：80端口</p>
     * @param Port <p>访问控制策略的端口。取值： -1/-1：全部端口 80：80端口</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>规则方向：1，入站；0，出站</p> 
     * @return Direction <p>规则方向：1，入站；0，出站</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>规则方向：1，入站；0，出站</p>
     * @param Direction <p>规则方向：1，入站；0，出站</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>规则序号</p> 
     * @return OrderIndex <p>规则序号</p>
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set <p>规则序号</p>
     * @param OrderIndex <p>规则序号</p>
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get <p>规则状态，true表示启用，false表示禁用</p> 
     * @return Enable <p>规则状态，true表示启用，false表示禁用</p>
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>规则状态，true表示启用，false表示禁用</p>
     * @param Enable <p>规则状态，true表示启用，false表示禁用</p>
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>规则对应的唯一id，创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p><p>创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p> 
     * @return Uuid <p>规则对应的唯一id，创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p><p>创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p>
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>规则对应的唯一id，创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p><p>创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p>
     * @param Uuid <p>规则对应的唯一id，创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p><p>创建规则AddNatAcRule时无需填写；修改规则ModifyNatAcRule时必须填写</p>
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>端口协议组ID</p> 
     * @return ParamTemplateId <p>端口协议组ID</p>
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>端口协议组ID</p>
     * @param ParamTemplateId <p>端口协议组ID</p>
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>内部id</p> 
     * @return InternalUuid <p>内部id</p>
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set <p>内部id</p>
     * @param InternalUuid <p>内部id</p>
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get <p>规则生效的范围：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度</p> 
     * @return Scope <p>规则生效的范围：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>规则生效的范围：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度</p>
     * @param Scope <p>规则生效的范围：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public CreateNatRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatRuleItem(CreateNatRuleItem source) {
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.TargetContent != null) {
            this.TargetContent = new String(source.TargetContent);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.InternalUuid != null) {
            this.InternalUuid = new Long(source.InternalUuid);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetContent", this.TargetContent);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "InternalUuid", this.InternalUuid);
        this.setParamSimple(map, prefix + "Scope", this.Scope);

    }
}

