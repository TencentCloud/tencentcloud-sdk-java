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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4ProxyRule extends AbstractModel {

    /**
    * 转发规则 ID。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数请勿填写；在 ModifyL4ProxyRules 作为入参使用时，该参数必填。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 转发协议。取值有：
<li>TCP：TCP 协议；</li>
<li>UDP：UDP 协议。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 转发端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85。表示 81、82、83、84、85 五个端口。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
    */
    @SerializedName("PortRange")
    @Expose
    private String [] PortRange;

    /**
    * 源站类型，取值有：
<li>IP_DOMAIN：IP/域名源站；</li>
<li>ORIGIN_GROUP：源站组；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 源站地址：
<li>当 OriginType 为 IP_DOMAIN 时，填写 IP 或域名，如 8.8.8.8 或 test.com ；</li>
<li>当 OriginType 为 ORIGIN_GROUP 时，填写源站组 ID，如 og-537y24vf5b41；</li>
<li>当 OriginType 为 LB 时，填写负载均衡实例 ID，如 lb-2qwk30xf7s9g。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。

    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * 源站端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85，表示 81、82、83、84、85 五个端口。填写端口段时，则需要与转发端口段长度保持一致，例如转发端口：80-90，则转发端口：90-100。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
    */
    @SerializedName("OriginPortRange")
    @Expose
    private String OriginPortRange;

    /**
    * 传递客户端 IP 的形式，取值有：
<li>TOA：TOA（仅 Protocol = TCP 时可选）；</li> 
<li>PPV1：Proxy Protocol 传递，协议版本 V1（仅 Protocol = TCP 时可选）；</li>
<li>PPV2：Proxy Protocol 传递，协议版本 V2；</li> 
<li>SPP：Simple Proxy Protocol 传递，（仅 Protocol = UDP 时可选）；</li> 
<li>OFF：不传递。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 OFF；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
    */
    @SerializedName("ClientIPPassThroughMode")
    @Expose
    private String ClientIPPassThroughMode;

    /**
    * 是否开启会话保持，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 off；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
    */
    @SerializedName("SessionPersist")
    @Expose
    private String SessionPersist;

    /**
    * 会话保持时间，取值范围为 30-3600，单位为秒。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，仅当 SessionPersist = on 时，该值才会生效，且当 SessionPersist = on ，该值不填写默认为 3600；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * 规则标签。可输入1-50 个任意字符。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
    * 规则状态，取值有：
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules、ModifyL4ProxyRules 作为入参使用时，该参数请勿填写。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * BuID。
    */
    @SerializedName("BuId")
    @Expose
    private String BuId;

    /**
     * Get 转发规则 ID。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数请勿填写；在 ModifyL4ProxyRules 作为入参使用时，该参数必填。 
     * @return RuleId 转发规则 ID。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数请勿填写；在 ModifyL4ProxyRules 作为入参使用时，该参数必填。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 转发规则 ID。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数请勿填写；在 ModifyL4ProxyRules 作为入参使用时，该参数必填。
     * @param RuleId 转发规则 ID。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数请勿填写；在 ModifyL4ProxyRules 作为入参使用时，该参数必填。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 转发协议。取值有：
<li>TCP：TCP 协议；</li>
<li>UDP：UDP 协议。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。 
     * @return Protocol 转发协议。取值有：
<li>TCP：TCP 协议；</li>
<li>UDP：UDP 协议。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 转发协议。取值有：
<li>TCP：TCP 协议；</li>
<li>UDP：UDP 协议。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     * @param Protocol 转发协议。取值有：
<li>TCP：TCP 协议；</li>
<li>UDP：UDP 协议。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 转发端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85。表示 81、82、83、84、85 五个端口。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。 
     * @return PortRange 转发端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85。表示 81、82、83、84、85 五个端口。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     */
    public String [] getPortRange() {
        return this.PortRange;
    }

    /**
     * Set 转发端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85。表示 81、82、83、84、85 五个端口。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     * @param PortRange 转发端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85。表示 81、82、83、84、85 五个端口。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     */
    public void setPortRange(String [] PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get 源站类型，取值有：
<li>IP_DOMAIN：IP/域名源站；</li>
<li>ORIGIN_GROUP：源站组；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。 
     * @return OriginType 源站类型，取值有：
<li>IP_DOMAIN：IP/域名源站；</li>
<li>ORIGIN_GROUP：源站组；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型，取值有：
<li>IP_DOMAIN：IP/域名源站；</li>
<li>ORIGIN_GROUP：源站组；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     * @param OriginType 源站类型，取值有：
<li>IP_DOMAIN：IP/域名源站；</li>
<li>ORIGIN_GROUP：源站组；</li>
<li>LB：负载均衡，当前仅白名单开放。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 源站地址：
<li>当 OriginType 为 IP_DOMAIN 时，填写 IP 或域名，如 8.8.8.8 或 test.com ；</li>
<li>当 OriginType 为 ORIGIN_GROUP 时，填写源站组 ID，如 og-537y24vf5b41；</li>
<li>当 OriginType 为 LB 时，填写负载均衡实例 ID，如 lb-2qwk30xf7s9g。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
 
     * @return OriginValue 源站地址：
<li>当 OriginType 为 IP_DOMAIN 时，填写 IP 或域名，如 8.8.8.8 或 test.com ；</li>
<li>当 OriginType 为 ORIGIN_GROUP 时，填写源站组 ID，如 og-537y24vf5b41；</li>
<li>当 OriginType 为 LB 时，填写负载均衡实例 ID，如 lb-2qwk30xf7s9g。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。

     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set 源站地址：
<li>当 OriginType 为 IP_DOMAIN 时，填写 IP 或域名，如 8.8.8.8 或 test.com ；</li>
<li>当 OriginType 为 ORIGIN_GROUP 时，填写源站组 ID，如 og-537y24vf5b41；</li>
<li>当 OriginType 为 LB 时，填写负载均衡实例 ID，如 lb-2qwk30xf7s9g。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。

     * @param OriginValue 源站地址：
<li>当 OriginType 为 IP_DOMAIN 时，填写 IP 或域名，如 8.8.8.8 或 test.com ；</li>
<li>当 OriginType 为 ORIGIN_GROUP 时，填写源站组 ID，如 og-537y24vf5b41；</li>
<li>当 OriginType 为 LB 时，填写负载均衡实例 ID，如 lb-2qwk30xf7s9g。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。

     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get 源站端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85，表示 81、82、83、84、85 五个端口。填写端口段时，则需要与转发端口段长度保持一致，例如转发端口：80-90，则转发端口：90-100。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。 
     * @return OriginPortRange 源站端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85，表示 81、82、83、84、85 五个端口。填写端口段时，则需要与转发端口段长度保持一致，例如转发端口：80-90，则转发端口：90-100。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     */
    public String getOriginPortRange() {
        return this.OriginPortRange;
    }

    /**
     * Set 源站端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85，表示 81、82、83、84、85 五个端口。填写端口段时，则需要与转发端口段长度保持一致，例如转发端口：80-90，则转发端口：90-100。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     * @param OriginPortRange 源站端口，支持按照以下形式填写：
<li>单端口，如：80；</li>
<li>端口段，如：81-85，表示 81、82、83、84、85 五个端口。填写端口段时，则需要与转发端口段长度保持一致，例如转发端口：80-90，则转发端口：90-100。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数必填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写时表示不修改。
     */
    public void setOriginPortRange(String OriginPortRange) {
        this.OriginPortRange = OriginPortRange;
    }

    /**
     * Get 传递客户端 IP 的形式，取值有：
<li>TOA：TOA（仅 Protocol = TCP 时可选）；</li> 
<li>PPV1：Proxy Protocol 传递，协议版本 V1（仅 Protocol = TCP 时可选）；</li>
<li>PPV2：Proxy Protocol 传递，协议版本 V2；</li> 
<li>SPP：Simple Proxy Protocol 传递，（仅 Protocol = UDP 时可选）；</li> 
<li>OFF：不传递。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 OFF；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。 
     * @return ClientIPPassThroughMode 传递客户端 IP 的形式，取值有：
<li>TOA：TOA（仅 Protocol = TCP 时可选）；</li> 
<li>PPV1：Proxy Protocol 传递，协议版本 V1（仅 Protocol = TCP 时可选）；</li>
<li>PPV2：Proxy Protocol 传递，协议版本 V2；</li> 
<li>SPP：Simple Proxy Protocol 传递，（仅 Protocol = UDP 时可选）；</li> 
<li>OFF：不传递。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 OFF；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     */
    public String getClientIPPassThroughMode() {
        return this.ClientIPPassThroughMode;
    }

    /**
     * Set 传递客户端 IP 的形式，取值有：
<li>TOA：TOA（仅 Protocol = TCP 时可选）；</li> 
<li>PPV1：Proxy Protocol 传递，协议版本 V1（仅 Protocol = TCP 时可选）；</li>
<li>PPV2：Proxy Protocol 传递，协议版本 V2；</li> 
<li>SPP：Simple Proxy Protocol 传递，（仅 Protocol = UDP 时可选）；</li> 
<li>OFF：不传递。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 OFF；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     * @param ClientIPPassThroughMode 传递客户端 IP 的形式，取值有：
<li>TOA：TOA（仅 Protocol = TCP 时可选）；</li> 
<li>PPV1：Proxy Protocol 传递，协议版本 V1（仅 Protocol = TCP 时可选）；</li>
<li>PPV2：Proxy Protocol 传递，协议版本 V2；</li> 
<li>SPP：Simple Proxy Protocol 传递，（仅 Protocol = UDP 时可选）；</li> 
<li>OFF：不传递。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 OFF；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     */
    public void setClientIPPassThroughMode(String ClientIPPassThroughMode) {
        this.ClientIPPassThroughMode = ClientIPPassThroughMode;
    }

    /**
     * Get 是否开启会话保持，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 off；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。 
     * @return SessionPersist 是否开启会话保持，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 off；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     */
    public String getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set 是否开启会话保持，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 off；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     * @param SessionPersist 是否开启会话保持，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，不填写时默认为 off；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     */
    public void setSessionPersist(String SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get 会话保持时间，取值范围为 30-3600，单位为秒。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，仅当 SessionPersist = on 时，该值才会生效，且当 SessionPersist = on ，该值不填写默认为 3600；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。 
     * @return SessionPersistTime 会话保持时间，取值范围为 30-3600，单位为秒。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，仅当 SessionPersist = on 时，该值才会生效，且当 SessionPersist = on ，该值不填写默认为 3600；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set 会话保持时间，取值范围为 30-3600，单位为秒。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，仅当 SessionPersist = on 时，该值才会生效，且当 SessionPersist = on ，该值不填写默认为 3600；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     * @param SessionPersistTime 会话保持时间，取值范围为 30-3600，单位为秒。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填，仅当 SessionPersist = on 时，该值才会生效，且当 SessionPersist = on ，该值不填写默认为 3600；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get 规则标签。可输入1-50 个任意字符。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。 
     * @return RuleTag 规则标签。可输入1-50 个任意字符。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set 规则标签。可输入1-50 个任意字符。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     * @param RuleTag 规则标签。可输入1-50 个任意字符。
注意：L4ProxyRule 在 CreateL4ProxyRules 作为入参使用时，该参数选填；在 ModifyL4ProxyRules 作为入参使用时，该参数选填，不填写表示不修改。
     */
    public void setRuleTag(String RuleTag) {
        this.RuleTag = RuleTag;
    }

    /**
     * Get 规则状态，取值有：
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules、ModifyL4ProxyRules 作为入参使用时，该参数请勿填写。 
     * @return Status 规则状态，取值有：
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules、ModifyL4ProxyRules 作为入参使用时，该参数请勿填写。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态，取值有：
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules、ModifyL4ProxyRules 作为入参使用时，该参数请勿填写。
     * @param Status 规则状态，取值有：
<li>online：已启用；</li>
<li>offline：已停用；</li>
<li>progress：部署中；</li>
<li>stopping：停用中；</li>
<li>fail：部署失败/停用失败。</li>
注意：L4ProxyRule 在 CreateL4ProxyRules、ModifyL4ProxyRules 作为入参使用时，该参数请勿填写。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get BuID。 
     * @return BuId BuID。
     */
    public String getBuId() {
        return this.BuId;
    }

    /**
     * Set BuID。
     * @param BuId BuID。
     */
    public void setBuId(String BuId) {
        this.BuId = BuId;
    }

    public L4ProxyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4ProxyRule(L4ProxyRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PortRange != null) {
            this.PortRange = new String[source.PortRange.length];
            for (int i = 0; i < source.PortRange.length; i++) {
                this.PortRange[i] = new String(source.PortRange[i]);
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
        if (source.OriginPortRange != null) {
            this.OriginPortRange = new String(source.OriginPortRange);
        }
        if (source.ClientIPPassThroughMode != null) {
            this.ClientIPPassThroughMode = new String(source.ClientIPPassThroughMode);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new String(source.SessionPersist);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.RuleTag != null) {
            this.RuleTag = new String(source.RuleTag);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BuId != null) {
            this.BuId = new String(source.BuId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "PortRange.", this.PortRange);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArraySimple(map, prefix + "OriginValue.", this.OriginValue);
        this.setParamSimple(map, prefix + "OriginPortRange", this.OriginPortRange);
        this.setParamSimple(map, prefix + "ClientIPPassThroughMode", this.ClientIPPassThroughMode);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "RuleTag", this.RuleTag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BuId", this.BuId);

    }
}

