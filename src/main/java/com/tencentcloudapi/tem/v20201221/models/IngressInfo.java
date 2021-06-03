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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressInfo extends AbstractModel{

    /**
    * tem namespaceId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * eks namespace
    */
    @SerializedName("EksNamespace")
    @Expose
    private String EksNamespace;

    /**
    * ip version
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * ingress name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * rules 配置
    */
    @SerializedName("Rules")
    @Expose
    private IngressRule [] Rules;

    /**
    * clb ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClbId")
    @Expose
    private String ClbId;

    /**
    * tls 配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tls")
    @Expose
    private IngressTls [] Tls;

    /**
    * eks clusterId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * clb ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否混合 https，默认 false，可选值 true 代表有 https 协议监听
    */
    @SerializedName("Mixed")
    @Expose
    private Boolean Mixed;

    /**
     * Get tem namespaceId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId tem namespaceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set tem namespaceId
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId tem namespaceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get eks namespace 
     * @return EksNamespace eks namespace
     */
    public String getEksNamespace() {
        return this.EksNamespace;
    }

    /**
     * Set eks namespace
     * @param EksNamespace eks namespace
     */
    public void setEksNamespace(String EksNamespace) {
        this.EksNamespace = EksNamespace;
    }

    /**
     * Get ip version 
     * @return AddressIPVersion ip version
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set ip version
     * @param AddressIPVersion ip version
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get ingress name 
     * @return Name ingress name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set ingress name
     * @param Name ingress name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get rules 配置 
     * @return Rules rules 配置
     */
    public IngressRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set rules 配置
     * @param Rules rules 配置
     */
    public void setRules(IngressRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get clb ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClbId clb ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClbId() {
        return this.ClbId;
    }

    /**
     * Set clb ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClbId clb ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClbId(String ClbId) {
        this.ClbId = ClbId;
    }

    /**
     * Get tls 配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tls tls 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IngressTls [] getTls() {
        return this.Tls;
    }

    /**
     * Set tls 配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tls tls 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTls(IngressTls [] Tls) {
        this.Tls = Tls;
    }

    /**
     * Get eks clusterId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId eks clusterId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set eks clusterId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId eks clusterId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get clb ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip clb ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set clb ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip clb ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否混合 https，默认 false，可选值 true 代表有 https 协议监听 
     * @return Mixed 是否混合 https，默认 false，可选值 true 代表有 https 协议监听
     */
    public Boolean getMixed() {
        return this.Mixed;
    }

    /**
     * Set 是否混合 https，默认 false，可选值 true 代表有 https 协议监听
     * @param Mixed 是否混合 https，默认 false，可选值 true 代表有 https 协议监听
     */
    public void setMixed(Boolean Mixed) {
        this.Mixed = Mixed;
    }

    public IngressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressInfo(IngressInfo source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.EksNamespace != null) {
            this.EksNamespace = new String(source.EksNamespace);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new IngressRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new IngressRule(source.Rules[i]);
            }
        }
        if (source.ClbId != null) {
            this.ClbId = new String(source.ClbId);
        }
        if (source.Tls != null) {
            this.Tls = new IngressTls[source.Tls.length];
            for (int i = 0; i < source.Tls.length; i++) {
                this.Tls[i] = new IngressTls(source.Tls[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Mixed != null) {
            this.Mixed = new Boolean(source.Mixed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "EksNamespace", this.EksNamespace);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ClbId", this.ClbId);
        this.setParamArrayObj(map, prefix + "Tls.", this.Tls);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Mixed", this.Mixed);

    }
}

