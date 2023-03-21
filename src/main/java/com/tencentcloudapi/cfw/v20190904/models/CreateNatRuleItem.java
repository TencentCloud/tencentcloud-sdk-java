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

public class CreateNatRuleItem extends AbstractModel{

    /**
    * 访问源示例： net：IP/CIDR(192.168.0.2)
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 访问控制策略的端口。取值： -1/-1：全部端口 80：80端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 规则方向：1，入站；0，出站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 规则序号
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 规则状态，true表示启用，false表示禁用
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 规则对应的唯一id，创建规则时无需填写
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 访问源示例： net：IP/CIDR(192.168.0.2) 
     * @return SourceContent 访问源示例： net：IP/CIDR(192.168.0.2)
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源示例： net：IP/CIDR(192.168.0.2)
     * @param SourceContent 访问源示例： net：IP/CIDR(192.168.0.2)
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag 
     * @return SourceType 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
     * @param SourceType 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com 
     * @return TargetContent 访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set 访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com
     * @param TargetContent 访问目的示例： net：IP/CIDR(192.168.0.2) domain：域名规则，例如*.qq.com
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location 
     * @return TargetType 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location
     * @param TargetType 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为  ip,net,domain,template,location
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS 
     * @return Protocol 协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS
     * @param Protocol 协议，可选的值： TCP UDP ICMP ANY HTTP HTTPS HTTP/HTTPS SMTP SMTPS SMTP/SMTPS FTP DNS
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察 
     * @return RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
     * @param RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 访问控制策略的端口。取值： -1/-1：全部端口 80：80端口 
     * @return Port 访问控制策略的端口。取值： -1/-1：全部端口 80：80端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 访问控制策略的端口。取值： -1/-1：全部端口 80：80端口
     * @param Port 访问控制策略的端口。取值： -1/-1：全部端口 80：80端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 规则方向：1，入站；0，出站 
     * @return Direction 规则方向：1，入站；0，出站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：1，入站；0，出站
     * @param Direction 规则方向：1，入站；0，出站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 规则序号 
     * @return OrderIndex 规则序号
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 规则序号
     * @param OrderIndex 规则序号
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
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

    /**
     * Get 规则对应的唯一id，创建规则时无需填写 
     * @return Uuid 规则对应的唯一id，创建规则时无需填写
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set 规则对应的唯一id，创建规则时无需填写
     * @param Uuid 规则对应的唯一id，创建规则时无需填写
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
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

    }
}

