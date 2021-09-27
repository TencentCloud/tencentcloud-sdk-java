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

public class AddAcRuleRequest extends AbstractModel{

    /**
    * -1表示优先级最低，1表示优先级最高
    */
    @SerializedName("OrderIndex")
    @Expose
    private String OrderIndex;

    /**
    * 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
log：观察
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 访问控制策略的流量方向。取值：
in：外对内流量访问控制
out：内对外流量访问控制
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 访问控制策略的描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 访问控制策略中的源地址类型。取值：
net：源IP或网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 访问控制策略中的源地址。取值：
当SourceType为net时，SourceContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当SourceType为template时，SourceContent为源地址模板名称。

当SourceType为location时，SourceContent为源区域。
例如["BJ11", "ZB"]

当SourceType为instance时，SourceContent为该实例id对应的公网ip。
例如ins-xxxxx

当SourceType为vendor时，SourceContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问控制策略中的目的地址类型。取值：
net：目的IP或者网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
domain: 域名或者ip
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 访问控制策略中的目的地址。取值：
当DestType为net时，DestContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当DestType为template时，DestContent为源地址模板名称。

当DestType为location时，DestContent为源区域。
例如["BJ11", "ZB"]

当DestType为instance时，DestContent为该实例id对应的公网ip。
例如ins-xxxxx

当DestType为domain时，DestContent为该实例id对应的域名规则。
例如*.qq.com

当DestType为vendor时，DestContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 访问控制策略的端口。取值：
-1/-1：全部端口
80,443：80或者443
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 访问控制策略中流量访问的协议类型。取值：TCP，目前互联网边界规则只能支持TCP，不传参数默认就是TCP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 七层协议，取值：
HTTP/HTTPS
TLS/SSL
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 是否启用规则，默认为启用，取值：
true为启用，false为不启用
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
     * Get -1表示优先级最低，1表示优先级最高 
     * @return OrderIndex -1表示优先级最低，1表示优先级最高
     */
    public String getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set -1表示优先级最低，1表示优先级最高
     * @param OrderIndex -1表示优先级最低，1表示优先级最高
     */
    public void setOrderIndex(String OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
log：观察 
     * @return RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
log：观察
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
log：观察
     * @param RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值：
accept：放行
drop：拒绝
log：观察
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 访问控制策略的流量方向。取值：
in：外对内流量访问控制
out：内对外流量访问控制 
     * @return Direction 访问控制策略的流量方向。取值：
in：外对内流量访问控制
out：内对外流量访问控制
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 访问控制策略的流量方向。取值：
in：外对内流量访问控制
out：内对外流量访问控制
     * @param Direction 访问控制策略的流量方向。取值：
in：外对内流量访问控制
out：内对外流量访问控制
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 访问控制策略的描述信息 
     * @return Description 访问控制策略的描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 访问控制策略的描述信息
     * @param Description 访问控制策略的描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 访问控制策略中的源地址类型。取值：
net：源IP或网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商 
     * @return SourceType 访问控制策略中的源地址类型。取值：
net：源IP或网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问控制策略中的源地址类型。取值：
net：源IP或网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
     * @param SourceType 访问控制策略中的源地址类型。取值：
net：源IP或网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问控制策略中的源地址。取值：
当SourceType为net时，SourceContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当SourceType为template时，SourceContent为源地址模板名称。

当SourceType为location时，SourceContent为源区域。
例如["BJ11", "ZB"]

当SourceType为instance时，SourceContent为该实例id对应的公网ip。
例如ins-xxxxx

当SourceType为vendor时，SourceContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个 
     * @return SourceContent 访问控制策略中的源地址。取值：
当SourceType为net时，SourceContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当SourceType为template时，SourceContent为源地址模板名称。

当SourceType为location时，SourceContent为源区域。
例如["BJ11", "ZB"]

当SourceType为instance时，SourceContent为该实例id对应的公网ip。
例如ins-xxxxx

当SourceType为vendor时，SourceContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问控制策略中的源地址。取值：
当SourceType为net时，SourceContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当SourceType为template时，SourceContent为源地址模板名称。

当SourceType为location时，SourceContent为源区域。
例如["BJ11", "ZB"]

当SourceType为instance时，SourceContent为该实例id对应的公网ip。
例如ins-xxxxx

当SourceType为vendor时，SourceContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个
     * @param SourceContent 访问控制策略中的源地址。取值：
当SourceType为net时，SourceContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当SourceType为template时，SourceContent为源地址模板名称。

当SourceType为location时，SourceContent为源区域。
例如["BJ11", "ZB"]

当SourceType为instance时，SourceContent为该实例id对应的公网ip。
例如ins-xxxxx

当SourceType为vendor时，SourceContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问控制策略中的目的地址类型。取值：
net：目的IP或者网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
domain: 域名或者ip 
     * @return DestType 访问控制策略中的目的地址类型。取值：
net：目的IP或者网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
domain: 域名或者ip
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 访问控制策略中的目的地址类型。取值：
net：目的IP或者网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
domain: 域名或者ip
     * @param DestType 访问控制策略中的目的地址类型。取值：
net：目的IP或者网段（IP或者CIDR）
location：源区域
template：云防火墙地址模板
instance：实例id
vendor：云厂商
domain: 域名或者ip
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get 访问控制策略中的目的地址。取值：
当DestType为net时，DestContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当DestType为template时，DestContent为源地址模板名称。

当DestType为location时，DestContent为源区域。
例如["BJ11", "ZB"]

当DestType为instance时，DestContent为该实例id对应的公网ip。
例如ins-xxxxx

当DestType为domain时，DestContent为该实例id对应的域名规则。
例如*.qq.com

当DestType为vendor时，DestContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个 
     * @return DestContent 访问控制策略中的目的地址。取值：
当DestType为net时，DestContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当DestType为template时，DestContent为源地址模板名称。

当DestType为location时，DestContent为源区域。
例如["BJ11", "ZB"]

当DestType为instance时，DestContent为该实例id对应的公网ip。
例如ins-xxxxx

当DestType为domain时，DestContent为该实例id对应的域名规则。
例如*.qq.com

当DestType为vendor时，DestContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 访问控制策略中的目的地址。取值：
当DestType为net时，DestContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当DestType为template时，DestContent为源地址模板名称。

当DestType为location时，DestContent为源区域。
例如["BJ11", "ZB"]

当DestType为instance时，DestContent为该实例id对应的公网ip。
例如ins-xxxxx

当DestType为domain时，DestContent为该实例id对应的域名规则。
例如*.qq.com

当DestType为vendor时，DestContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个
     * @param DestContent 访问控制策略中的目的地址。取值：
当DestType为net时，DestContent为源IP地址或者CIDR地址。
例如：1.1.1.0/24

当DestType为template时，DestContent为源地址模板名称。

当DestType为location时，DestContent为源区域。
例如["BJ11", "ZB"]

当DestType为instance时，DestContent为该实例id对应的公网ip。
例如ins-xxxxx

当DestType为domain时，DestContent为该实例id对应的域名规则。
例如*.qq.com

当DestType为vendor时，DestContent为所选择厂商的公网ip列表。
例如：aws,huawei,tencent,aliyun,azure,all代表以上五个
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 访问控制策略的端口。取值：
-1/-1：全部端口
80,443：80或者443 
     * @return Port 访问控制策略的端口。取值：
-1/-1：全部端口
80,443：80或者443
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 访问控制策略的端口。取值：
-1/-1：全部端口
80,443：80或者443
     * @param Port 访问控制策略的端口。取值：
-1/-1：全部端口
80,443：80或者443
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 访问控制策略中流量访问的协议类型。取值：TCP，目前互联网边界规则只能支持TCP，不传参数默认就是TCP 
     * @return Protocol 访问控制策略中流量访问的协议类型。取值：TCP，目前互联网边界规则只能支持TCP，不传参数默认就是TCP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 访问控制策略中流量访问的协议类型。取值：TCP，目前互联网边界规则只能支持TCP，不传参数默认就是TCP
     * @param Protocol 访问控制策略中流量访问的协议类型。取值：TCP，目前互联网边界规则只能支持TCP，不传参数默认就是TCP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 七层协议，取值：
HTTP/HTTPS
TLS/SSL 
     * @return ApplicationName 七层协议，取值：
HTTP/HTTPS
TLS/SSL
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 七层协议，取值：
HTTP/HTTPS
TLS/SSL
     * @param ApplicationName 七层协议，取值：
HTTP/HTTPS
TLS/SSL
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
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

    public AddAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAcRuleRequest(AddAcRuleRequest source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new String(source.OrderIndex);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

