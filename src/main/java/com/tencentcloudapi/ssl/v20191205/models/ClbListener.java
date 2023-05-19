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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbListener extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 是否开启SNI，1为开启，0为关闭
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * 监听器协议类型， HTTPS|TCP_SSL
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private Certificate Certificate;

    /**
    * 监听器规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private ClbListenerRule [] Rules;

    /**
    * 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器名称 
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 是否开启SNI，1为开启，0为关闭 
     * @return SniSwitch 是否开启SNI，1为开启，0为关闭
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set 是否开启SNI，1为开启，0为关闭
     * @param SniSwitch 是否开启SNI，1为开启，0为关闭
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get 监听器协议类型， HTTPS|TCP_SSL 
     * @return Protocol 监听器协议类型， HTTPS|TCP_SSL
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议类型， HTTPS|TCP_SSL
     * @param Protocol 监听器协议类型， HTTPS|TCP_SSL
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate 监听器绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Certificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 监听器绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate 监听器绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(Certificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 监听器规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 监听器规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClbListenerRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 监听器规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 监听器规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(ClbListenerRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoMatchDomains 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoMatchDomains 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    public ClbListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbListener(ClbListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Certificate != null) {
            this.Certificate = new Certificate(source.Certificate);
        }
        if (source.Rules != null) {
            this.Rules = new ClbListenerRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ClbListenerRule(source.Rules[i]);
            }
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);

    }
}

