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

public class VpcRuleItem extends AbstractModel {

    /**
    * 访问源示例：
net：IP/CIDR(192.168.0.2)
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问源类型，类型可以为：net
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 访问目的示例：
net：IP/CIDR(192.168.0.2)
domain：域名规则，例如*.qq.com
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * 访问目的类型，类型可以为：net，domain，dnsparse
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 协议，可选的值：
TCP
UDP
ICMP
ANY
HTTP
HTTPS
HTTP/HTTPS
SMTP
SMTPS
SMTP/SMTPS
FTP
DNS
TLS/SSL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

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
    * 访问控制策略的端口。取值：
-1/-1：全部端口
80：80端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

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
    private Long OrderIndex;

    /**
    * 规则对应的唯一id
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * 规则状态，true表示启用，false表示禁用
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 规则生效的范围，是在哪对vpc之间还是针对所有vpc间生效
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 规则的命中次数，增删改查规则时无需传入此参数，主要用于返回查询结果数据
    */
    @SerializedName("DetectedTimes")
    @Expose
    private Long DetectedTimes;

    /**
    * EdgeId对应的这对VPC间防火墙的描述
    */
    @SerializedName("EdgeName")
    @Expose
    private String EdgeName;

    /**
    * 内部使用的uuid，一般情况下不会使用到该字段
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * 规则被删除：1，已删除；0，未删除
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
    * 规则生效的防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 防火墙名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
    * beta任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BetaList")
    @Expose
    private BetaInfoByACL [] BetaList;

    /**
    * 端口协议组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 端口协议组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTemplateName")
    @Expose
    private String ParamTemplateName;

    /**
    * 访问目的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 访问源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
     * Get 访问源示例：
net：IP/CIDR(192.168.0.2) 
     * @return SourceContent 访问源示例：
net：IP/CIDR(192.168.0.2)
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源示例：
net：IP/CIDR(192.168.0.2)
     * @param SourceContent 访问源示例：
net：IP/CIDR(192.168.0.2)
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问源类型，类型可以为：net 
     * @return SourceType 访问源类型，类型可以为：net
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，类型可以为：net
     * @param SourceType 访问源类型，类型可以为：net
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问目的示例：
net：IP/CIDR(192.168.0.2)
domain：域名规则，例如*.qq.com 
     * @return DestContent 访问目的示例：
net：IP/CIDR(192.168.0.2)
domain：域名规则，例如*.qq.com
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set 访问目的示例：
net：IP/CIDR(192.168.0.2)
domain：域名规则，例如*.qq.com
     * @param DestContent 访问目的示例：
net：IP/CIDR(192.168.0.2)
domain：域名规则，例如*.qq.com
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get 访问目的类型，类型可以为：net，domain，dnsparse 
     * @return DestType 访问目的类型，类型可以为：net，domain，dnsparse
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 访问目的类型，类型可以为：net，domain，dnsparse
     * @param DestType 访问目的类型，类型可以为：net，domain，dnsparse
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get 协议，可选的值：
TCP
UDP
ICMP
ANY
HTTP
HTTPS
HTTP/HTTPS
SMTP
SMTPS
SMTP/SMTPS
FTP
DNS
TLS/SSL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议，可选的值：
TCP
UDP
ICMP
ANY
HTTP
HTTPS
HTTP/HTTPS
SMTP
SMTPS
SMTP/SMTPS
FTP
DNS
TLS/SSL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，可选的值：
TCP
UDP
ICMP
ANY
HTTP
HTTPS
HTTP/HTTPS
SMTP
SMTPS
SMTP/SMTPS
FTP
DNS
TLS/SSL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议，可选的值：
TCP
UDP
ICMP
ANY
HTTP
HTTPS
HTTP/HTTPS
SMTP
SMTPS
SMTP/SMTPS
FTP
DNS
TLS/SSL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
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
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 规则顺序，-1表示最低，1表示最高
     * @param OrderIndex 规则顺序，-1表示最低，1表示最高
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 规则对应的唯一id 
     * @return Uuid 规则对应的唯一id
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set 规则对应的唯一id
     * @param Uuid 规则对应的唯一id
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
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
     * Get 规则生效的范围，是在哪对vpc之间还是针对所有vpc间生效 
     * @return EdgeId 规则生效的范围，是在哪对vpc之间还是针对所有vpc间生效
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set 规则生效的范围，是在哪对vpc之间还是针对所有vpc间生效
     * @param EdgeId 规则生效的范围，是在哪对vpc之间还是针对所有vpc间生效
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 规则的命中次数，增删改查规则时无需传入此参数，主要用于返回查询结果数据 
     * @return DetectedTimes 规则的命中次数，增删改查规则时无需传入此参数，主要用于返回查询结果数据
     */
    public Long getDetectedTimes() {
        return this.DetectedTimes;
    }

    /**
     * Set 规则的命中次数，增删改查规则时无需传入此参数，主要用于返回查询结果数据
     * @param DetectedTimes 规则的命中次数，增删改查规则时无需传入此参数，主要用于返回查询结果数据
     */
    public void setDetectedTimes(Long DetectedTimes) {
        this.DetectedTimes = DetectedTimes;
    }

    /**
     * Get EdgeId对应的这对VPC间防火墙的描述 
     * @return EdgeName EdgeId对应的这对VPC间防火墙的描述
     */
    public String getEdgeName() {
        return this.EdgeName;
    }

    /**
     * Set EdgeId对应的这对VPC间防火墙的描述
     * @param EdgeName EdgeId对应的这对VPC间防火墙的描述
     */
    public void setEdgeName(String EdgeName) {
        this.EdgeName = EdgeName;
    }

    /**
     * Get 内部使用的uuid，一般情况下不会使用到该字段 
     * @return InternalUuid 内部使用的uuid，一般情况下不会使用到该字段
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set 内部使用的uuid，一般情况下不会使用到该字段
     * @param InternalUuid 内部使用的uuid，一般情况下不会使用到该字段
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get 规则被删除：1，已删除；0，未删除 
     * @return Deleted 规则被删除：1，已删除；0，未删除
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 规则被删除：1，已删除；0，未删除
     * @param Deleted 规则被删除：1，已删除；0，未删除
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get 规则生效的防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwGroupId 规则生效的防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 规则生效的防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwGroupId 规则生效的防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 防火墙名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwGroupName 防火墙名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set 防火墙名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwGroupName 防火墙名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    /**
     * Get beta任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BetaList beta任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BetaInfoByACL [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set beta任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param BetaList beta任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBetaList(BetaInfoByACL [] BetaList) {
        this.BetaList = BetaList;
    }

    /**
     * Get 端口协议组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTemplateId 端口协议组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 端口协议组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTemplateId 端口协议组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get 端口协议组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTemplateName 端口协议组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamTemplateName() {
        return this.ParamTemplateName;
    }

    /**
     * Set 端口协议组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTemplateName 端口协议组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTemplateName(String ParamTemplateName) {
        this.ParamTemplateName = ParamTemplateName;
    }

    /**
     * Get 访问目的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetName 访问目的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 访问目的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetName 访问目的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 访问源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceName 访问源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 访问源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceName 访问源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    public VpcRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcRuleItem(VpcRuleItem source) {
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
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.DetectedTimes != null) {
            this.DetectedTimes = new Long(source.DetectedTimes);
        }
        if (source.EdgeName != null) {
            this.EdgeName = new String(source.EdgeName);
        }
        if (source.InternalUuid != null) {
            this.InternalUuid = new Long(source.InternalUuid);
        }
        if (source.Deleted != null) {
            this.Deleted = new Long(source.Deleted);
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
        if (source.BetaList != null) {
            this.BetaList = new BetaInfoByACL[source.BetaList.length];
            for (int i = 0; i < source.BetaList.length; i++) {
                this.BetaList[i] = new BetaInfoByACL(source.BetaList[i]);
            }
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.ParamTemplateName != null) {
            this.ParamTemplateName = new String(source.ParamTemplateName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
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
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "DetectedTimes", this.DetectedTimes);
        this.setParamSimple(map, prefix + "EdgeName", this.EdgeName);
        this.setParamSimple(map, prefix + "InternalUuid", this.InternalUuid);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);
        this.setParamArrayObj(map, prefix + "BetaList.", this.BetaList);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "ParamTemplateName", this.ParamTemplateName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);

    }
}

