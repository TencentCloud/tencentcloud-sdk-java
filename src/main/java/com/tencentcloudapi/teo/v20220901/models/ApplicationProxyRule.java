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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationProxyRule extends AbstractModel{

    /**
    * 协议，取值有：
<li>TCP：TCP协议；</li>
<li>UDP：UDP协议。</li>
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * 端口，支持格式：
<li>单个端口，如：80。</li>
<li>端口段，如：81-82。表示81，82两个端口。</li>
注意：一条规则最多可填写20个端口。
    */
    @SerializedName("Port")
    @Expose
    private String [] Port;

    /**
    * 源站类型，取值有：
<li>custom：手动添加；</li>
<li>origins：源站组。</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 源站信息：
<li>当 OriginType 为 custom 时，表示一个或多个源站，如`["8.8.8.8","9.9.9.9"]` 或 `OriginValue=["test.com"]`；</li>
<li>当 OriginType 为 origins 时，要求有且仅有一个元素，表示源站组ID，如`["origin-537f5b41-162a-11ed-abaa-525400c5da15"]`。</li>
    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * 规则ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 状态，取值有：
<li>online：启用；</li>
<li>offline：停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 传递客户端IP，取值有：
<li>TOA：TOA（仅Proto=TCP时可选）；</li>
<li>PPV1：Proxy Protocol传递，协议版本V1（仅Proto=TCP时可选）；</li>
<li>PPV2：Proxy Protocol传递，协议版本V2；</li>
<li>OFF：不传递。</li>默认值：OFF。
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * 是否开启会话保持，取值有：
<li>true：开启；</li>
<li>false：关闭。</li>默认值：false。
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * 会话保持的时间，只有当SessionPersist为true时，该值才会生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * 源站端口，支持格式：
<li>单端口，如：80。</li>
<li>端口段：81-82，表示81，82两个端口。</li>
    */
    @SerializedName("OriginPort")
    @Expose
    private String OriginPort;

    /**
    * 规则标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
     * Get 协议，取值有：
<li>TCP：TCP协议；</li>
<li>UDP：UDP协议。</li> 
     * @return Proto 协议，取值有：
<li>TCP：TCP协议；</li>
<li>UDP：UDP协议。</li>
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 协议，取值有：
<li>TCP：TCP协议；</li>
<li>UDP：UDP协议。</li>
     * @param Proto 协议，取值有：
<li>TCP：TCP协议；</li>
<li>UDP：UDP协议。</li>
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get 端口，支持格式：
<li>单个端口，如：80。</li>
<li>端口段，如：81-82。表示81，82两个端口。</li>
注意：一条规则最多可填写20个端口。 
     * @return Port 端口，支持格式：
<li>单个端口，如：80。</li>
<li>端口段，如：81-82。表示81，82两个端口。</li>
注意：一条规则最多可填写20个端口。
     */
    public String [] getPort() {
        return this.Port;
    }

    /**
     * Set 端口，支持格式：
<li>单个端口，如：80。</li>
<li>端口段，如：81-82。表示81，82两个端口。</li>
注意：一条规则最多可填写20个端口。
     * @param Port 端口，支持格式：
<li>单个端口，如：80。</li>
<li>端口段，如：81-82。表示81，82两个端口。</li>
注意：一条规则最多可填写20个端口。
     */
    public void setPort(String [] Port) {
        this.Port = Port;
    }

    /**
     * Get 源站类型，取值有：
<li>custom：手动添加；</li>
<li>origins：源站组。</li> 
     * @return OriginType 源站类型，取值有：
<li>custom：手动添加；</li>
<li>origins：源站组。</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型，取值有：
<li>custom：手动添加；</li>
<li>origins：源站组。</li>
     * @param OriginType 源站类型，取值有：
<li>custom：手动添加；</li>
<li>origins：源站组。</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 源站信息：
<li>当 OriginType 为 custom 时，表示一个或多个源站，如`["8.8.8.8","9.9.9.9"]` 或 `OriginValue=["test.com"]`；</li>
<li>当 OriginType 为 origins 时，要求有且仅有一个元素，表示源站组ID，如`["origin-537f5b41-162a-11ed-abaa-525400c5da15"]`。</li> 
     * @return OriginValue 源站信息：
<li>当 OriginType 为 custom 时，表示一个或多个源站，如`["8.8.8.8","9.9.9.9"]` 或 `OriginValue=["test.com"]`；</li>
<li>当 OriginType 为 origins 时，要求有且仅有一个元素，表示源站组ID，如`["origin-537f5b41-162a-11ed-abaa-525400c5da15"]`。</li>
     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set 源站信息：
<li>当 OriginType 为 custom 时，表示一个或多个源站，如`["8.8.8.8","9.9.9.9"]` 或 `OriginValue=["test.com"]`；</li>
<li>当 OriginType 为 origins 时，要求有且仅有一个元素，表示源站组ID，如`["origin-537f5b41-162a-11ed-abaa-525400c5da15"]`。</li>
     * @param OriginValue 源站信息：
<li>当 OriginType 为 custom 时，表示一个或多个源站，如`["8.8.8.8","9.9.9.9"]` 或 `OriginValue=["test.com"]`；</li>
<li>当 OriginType 为 origins 时，要求有且仅有一个元素，表示源站组ID，如`["origin-537f5b41-162a-11ed-abaa-525400c5da15"]`。</li>
     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get 规则ID。 
     * @return RuleId 规则ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID。
     * @param RuleId 规则ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 状态，取值有：
<li>online：启用；</li>
<li>offline：停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li> 
     * @return Status 状态，取值有：
<li>online：启用；</li>
<li>offline：停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，取值有：
<li>online：启用；</li>
<li>offline：停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
     * @param Status 状态，取值有：
<li>online：启用；</li>
<li>offline：停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 传递客户端IP，取值有：
<li>TOA：TOA（仅Proto=TCP时可选）；</li>
<li>PPV1：Proxy Protocol传递，协议版本V1（仅Proto=TCP时可选）；</li>
<li>PPV2：Proxy Protocol传递，协议版本V2；</li>
<li>OFF：不传递。</li>默认值：OFF。 
     * @return ForwardClientIp 传递客户端IP，取值有：
<li>TOA：TOA（仅Proto=TCP时可选）；</li>
<li>PPV1：Proxy Protocol传递，协议版本V1（仅Proto=TCP时可选）；</li>
<li>PPV2：Proxy Protocol传递，协议版本V2；</li>
<li>OFF：不传递。</li>默认值：OFF。
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set 传递客户端IP，取值有：
<li>TOA：TOA（仅Proto=TCP时可选）；</li>
<li>PPV1：Proxy Protocol传递，协议版本V1（仅Proto=TCP时可选）；</li>
<li>PPV2：Proxy Protocol传递，协议版本V2；</li>
<li>OFF：不传递。</li>默认值：OFF。
     * @param ForwardClientIp 传递客户端IP，取值有：
<li>TOA：TOA（仅Proto=TCP时可选）；</li>
<li>PPV1：Proxy Protocol传递，协议版本V1（仅Proto=TCP时可选）；</li>
<li>PPV2：Proxy Protocol传递，协议版本V2；</li>
<li>OFF：不传递。</li>默认值：OFF。
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get 是否开启会话保持，取值有：
<li>true：开启；</li>
<li>false：关闭。</li>默认值：false。 
     * @return SessionPersist 是否开启会话保持，取值有：
<li>true：开启；</li>
<li>false：关闭。</li>默认值：false。
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set 是否开启会话保持，取值有：
<li>true：开启；</li>
<li>false：关闭。</li>默认值：false。
     * @param SessionPersist 是否开启会话保持，取值有：
<li>true：开启；</li>
<li>false：关闭。</li>默认值：false。
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get 会话保持的时间，只有当SessionPersist为true时，该值才会生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionPersistTime 会话保持的时间，只有当SessionPersist为true时，该值才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set 会话保持的时间，只有当SessionPersist为true时，该值才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionPersistTime 会话保持的时间，只有当SessionPersist为true时，该值才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get 源站端口，支持格式：
<li>单端口，如：80。</li>
<li>端口段：81-82，表示81，82两个端口。</li> 
     * @return OriginPort 源站端口，支持格式：
<li>单端口，如：80。</li>
<li>端口段：81-82，表示81，82两个端口。</li>
     */
    public String getOriginPort() {
        return this.OriginPort;
    }

    /**
     * Set 源站端口，支持格式：
<li>单端口，如：80。</li>
<li>端口段：81-82，表示81，82两个端口。</li>
     * @param OriginPort 源站端口，支持格式：
<li>单端口，如：80。</li>
<li>端口段：81-82，表示81，82两个端口。</li>
     */
    public void setOriginPort(String OriginPort) {
        this.OriginPort = OriginPort;
    }

    /**
     * Get 规则标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTag 规则标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set 规则标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTag 规则标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTag(String RuleTag) {
        this.RuleTag = RuleTag;
    }

    public ApplicationProxyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationProxyRule(ApplicationProxyRule source) {
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.Port != null) {
            this.Port = new String[source.Port.length];
            for (int i = 0; i < source.Port.length; i++) {
                this.Port[i] = new String(source.Port[i]);
            }
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.OriginValue != null) {
            this.OriginValue = new String[source.OriginValue.length];
            for (int i = 0; i < source.OriginValue.length; i++) {
                this.OriginValue[i] = new String(source.OriginValue[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.OriginPort != null) {
            this.OriginPort = new String(source.OriginPort);
        }
        if (source.RuleTag != null) {
            this.RuleTag = new String(source.RuleTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamArraySimple(map, prefix + "Port.", this.Port);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArraySimple(map, prefix + "OriginValue.", this.OriginValue);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "OriginPort", this.OriginPort);
        this.setParamSimple(map, prefix + "RuleTag", this.RuleTag);

    }
}

