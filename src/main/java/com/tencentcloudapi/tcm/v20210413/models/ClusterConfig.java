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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterConfig extends AbstractModel{

    /**
    * 自动注入SideCar的NameSpace
    */
    @SerializedName("AutoInjectionNamespaceList")
    @Expose
    private String [] AutoInjectionNamespaceList;

    /**
    * Ingress配置列表
    */
    @SerializedName("IngressGatewayList")
    @Expose
    private IngressGateway [] IngressGatewayList;

    /**
    * Egress配置列表
    */
    @SerializedName("EgressGatewayList")
    @Expose
    private EgressGateway [] EgressGatewayList;

    /**
    * Istiod配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Istiod")
    @Expose
    private IstiodConfig Istiod;

    /**
    * 部署配置
    */
    @SerializedName("DeployConfig")
    @Expose
    private DeployConfig DeployConfig;

    /**
    * 自动注入命名空间状态列表
    */
    @SerializedName("AutoInjectionNamespaceStateList")
    @Expose
    private AutoInjectionNamespaceState [] AutoInjectionNamespaceStateList;

    /**
     * Get 自动注入SideCar的NameSpace 
     * @return AutoInjectionNamespaceList 自动注入SideCar的NameSpace
     */
    public String [] getAutoInjectionNamespaceList() {
        return this.AutoInjectionNamespaceList;
    }

    /**
     * Set 自动注入SideCar的NameSpace
     * @param AutoInjectionNamespaceList 自动注入SideCar的NameSpace
     */
    public void setAutoInjectionNamespaceList(String [] AutoInjectionNamespaceList) {
        this.AutoInjectionNamespaceList = AutoInjectionNamespaceList;
    }

    /**
     * Get Ingress配置列表 
     * @return IngressGatewayList Ingress配置列表
     */
    public IngressGateway [] getIngressGatewayList() {
        return this.IngressGatewayList;
    }

    /**
     * Set Ingress配置列表
     * @param IngressGatewayList Ingress配置列表
     */
    public void setIngressGatewayList(IngressGateway [] IngressGatewayList) {
        this.IngressGatewayList = IngressGatewayList;
    }

    /**
     * Get Egress配置列表 
     * @return EgressGatewayList Egress配置列表
     */
    public EgressGateway [] getEgressGatewayList() {
        return this.EgressGatewayList;
    }

    /**
     * Set Egress配置列表
     * @param EgressGatewayList Egress配置列表
     */
    public void setEgressGatewayList(EgressGateway [] EgressGatewayList) {
        this.EgressGatewayList = EgressGatewayList;
    }

    /**
     * Get Istiod配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Istiod Istiod配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IstiodConfig getIstiod() {
        return this.Istiod;
    }

    /**
     * Set Istiod配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Istiod Istiod配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIstiod(IstiodConfig Istiod) {
        this.Istiod = Istiod;
    }

    /**
     * Get 部署配置 
     * @return DeployConfig 部署配置
     */
    public DeployConfig getDeployConfig() {
        return this.DeployConfig;
    }

    /**
     * Set 部署配置
     * @param DeployConfig 部署配置
     */
    public void setDeployConfig(DeployConfig DeployConfig) {
        this.DeployConfig = DeployConfig;
    }

    /**
     * Get 自动注入命名空间状态列表 
     * @return AutoInjectionNamespaceStateList 自动注入命名空间状态列表
     */
    public AutoInjectionNamespaceState [] getAutoInjectionNamespaceStateList() {
        return this.AutoInjectionNamespaceStateList;
    }

    /**
     * Set 自动注入命名空间状态列表
     * @param AutoInjectionNamespaceStateList 自动注入命名空间状态列表
     */
    public void setAutoInjectionNamespaceStateList(AutoInjectionNamespaceState [] AutoInjectionNamespaceStateList) {
        this.AutoInjectionNamespaceStateList = AutoInjectionNamespaceStateList;
    }

    public ClusterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterConfig(ClusterConfig source) {
        if (source.AutoInjectionNamespaceList != null) {
            this.AutoInjectionNamespaceList = new String[source.AutoInjectionNamespaceList.length];
            for (int i = 0; i < source.AutoInjectionNamespaceList.length; i++) {
                this.AutoInjectionNamespaceList[i] = new String(source.AutoInjectionNamespaceList[i]);
            }
        }
        if (source.IngressGatewayList != null) {
            this.IngressGatewayList = new IngressGateway[source.IngressGatewayList.length];
            for (int i = 0; i < source.IngressGatewayList.length; i++) {
                this.IngressGatewayList[i] = new IngressGateway(source.IngressGatewayList[i]);
            }
        }
        if (source.EgressGatewayList != null) {
            this.EgressGatewayList = new EgressGateway[source.EgressGatewayList.length];
            for (int i = 0; i < source.EgressGatewayList.length; i++) {
                this.EgressGatewayList[i] = new EgressGateway(source.EgressGatewayList[i]);
            }
        }
        if (source.Istiod != null) {
            this.Istiod = new IstiodConfig(source.Istiod);
        }
        if (source.DeployConfig != null) {
            this.DeployConfig = new DeployConfig(source.DeployConfig);
        }
        if (source.AutoInjectionNamespaceStateList != null) {
            this.AutoInjectionNamespaceStateList = new AutoInjectionNamespaceState[source.AutoInjectionNamespaceStateList.length];
            for (int i = 0; i < source.AutoInjectionNamespaceStateList.length; i++) {
                this.AutoInjectionNamespaceStateList[i] = new AutoInjectionNamespaceState(source.AutoInjectionNamespaceStateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoInjectionNamespaceList.", this.AutoInjectionNamespaceList);
        this.setParamArrayObj(map, prefix + "IngressGatewayList.", this.IngressGatewayList);
        this.setParamArrayObj(map, prefix + "EgressGatewayList.", this.EgressGatewayList);
        this.setParamObj(map, prefix + "Istiod.", this.Istiod);
        this.setParamObj(map, prefix + "DeployConfig.", this.DeployConfig);
        this.setParamArrayObj(map, prefix + "AutoInjectionNamespaceStateList.", this.AutoInjectionNamespaceStateList);

    }
}

