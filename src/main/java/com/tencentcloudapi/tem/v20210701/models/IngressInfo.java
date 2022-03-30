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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressInfo extends AbstractModel{

    /**
    * 环境ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 环境namespace
    */
    @SerializedName("ClusterNamespace")
    @Expose
    private String ClusterNamespace;

    /**
    * ip version
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * ingress name
    */
    @SerializedName("IngressName")
    @Expose
    private String IngressName;

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
    * 环境集群ID
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
    * 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewriteType")
    @Expose
    private String RewriteType;

    /**
     * Get 环境ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 环境namespace 
     * @return ClusterNamespace 环境namespace
     */
    public String getClusterNamespace() {
        return this.ClusterNamespace;
    }

    /**
     * Set 环境namespace
     * @param ClusterNamespace 环境namespace
     */
    public void setClusterNamespace(String ClusterNamespace) {
        this.ClusterNamespace = ClusterNamespace;
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
     * @return IngressName ingress name
     */
    public String getIngressName() {
        return this.IngressName;
    }

    /**
     * Set ingress name
     * @param IngressName ingress name
     */
    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
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
     * Get 环境集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 环境集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 环境集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 环境集群ID
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

    /**
     * Get 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewriteType 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRewriteType() {
        return this.RewriteType;
    }

    /**
     * Set 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewriteType 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewriteType(String RewriteType) {
        this.RewriteType = RewriteType;
    }

    public IngressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressInfo(IngressInfo source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ClusterNamespace != null) {
            this.ClusterNamespace = new String(source.ClusterNamespace);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.IngressName != null) {
            this.IngressName = new String(source.IngressName);
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
        if (source.RewriteType != null) {
            this.RewriteType = new String(source.RewriteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ClusterNamespace", this.ClusterNamespace);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "IngressName", this.IngressName);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ClbId", this.ClbId);
        this.setParamArrayObj(map, prefix + "Tls.", this.Tls);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Mixed", this.Mixed);
        this.setParamSimple(map, prefix + "RewriteType", this.RewriteType);

    }
}

