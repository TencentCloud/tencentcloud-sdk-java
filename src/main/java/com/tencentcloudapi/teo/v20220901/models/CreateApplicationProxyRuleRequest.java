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

public class CreateApplicationProxyRuleRequest extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 代理ID。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

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
<li>80：80端口；</li>
<li>81-90：81至90端口。</li>
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
    * 源站端口，支持格式：
<li>单端口：80；</li>
<li>端口段：81-90，81至90端口。</li>
    */
    @SerializedName("OriginPort")
    @Expose
    private String OriginPort;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 代理ID。 
     * @return ProxyId 代理ID。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 代理ID。
     * @param ProxyId 代理ID。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

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
<li>80：80端口；</li>
<li>81-90：81至90端口。</li> 
     * @return Port 端口，支持格式：
<li>80：80端口；</li>
<li>81-90：81至90端口。</li>
     */
    public String [] getPort() {
        return this.Port;
    }

    /**
     * Set 端口，支持格式：
<li>80：80端口；</li>
<li>81-90：81至90端口。</li>
     * @param Port 端口，支持格式：
<li>80：80端口；</li>
<li>81-90：81至90端口。</li>
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
     * Get 源站端口，支持格式：
<li>单端口：80；</li>
<li>端口段：81-90，81至90端口。</li> 
     * @return OriginPort 源站端口，支持格式：
<li>单端口：80；</li>
<li>端口段：81-90，81至90端口。</li>
     */
    public String getOriginPort() {
        return this.OriginPort;
    }

    /**
     * Set 源站端口，支持格式：
<li>单端口：80；</li>
<li>端口段：81-90，81至90端口。</li>
     * @param OriginPort 源站端口，支持格式：
<li>单端口：80；</li>
<li>端口段：81-90，81至90端口。</li>
     */
    public void setOriginPort(String OriginPort) {
        this.OriginPort = OriginPort;
    }

    public CreateApplicationProxyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationProxyRuleRequest(CreateApplicationProxyRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
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
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
        if (source.OriginPort != null) {
            this.OriginPort = new String(source.OriginPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamArraySimple(map, prefix + "Port.", this.Port);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArraySimple(map, prefix + "OriginValue.", this.OriginValue);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "OriginPort", this.OriginPort);

    }
}

