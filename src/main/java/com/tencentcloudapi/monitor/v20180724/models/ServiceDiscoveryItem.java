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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDiscoveryItem extends AbstractModel{

    /**
    * 服务发现名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务发现属于的 Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 服务发现类型: ServiceMonitor/PodMonitor
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Namespace 选取方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceSelector")
    @Expose
    private String NamespaceSelector;

    /**
    * Label 选取方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Selector")
    @Expose
    private String Selector;

    /**
    * Endpoints 信息（PodMonitor 不含该参数）
    */
    @SerializedName("Endpoints")
    @Expose
    private String Endpoints;

    /**
    * 服务发现对应的配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
     * Get 服务发现名称 
     * @return Name 服务发现名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务发现名称
     * @param Name 服务发现名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务发现属于的 Namespace 
     * @return Namespace 服务发现属于的 Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 服务发现属于的 Namespace
     * @param Namespace 服务发现属于的 Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 服务发现类型: ServiceMonitor/PodMonitor 
     * @return Kind 服务发现类型: ServiceMonitor/PodMonitor
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 服务发现类型: ServiceMonitor/PodMonitor
     * @param Kind 服务发现类型: ServiceMonitor/PodMonitor
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Namespace 选取方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceSelector Namespace 选取方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceSelector() {
        return this.NamespaceSelector;
    }

    /**
     * Set Namespace 选取方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceSelector Namespace 选取方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceSelector(String NamespaceSelector) {
        this.NamespaceSelector = NamespaceSelector;
    }

    /**
     * Get Label 选取方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Selector Label 选取方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelector() {
        return this.Selector;
    }

    /**
     * Set Label 选取方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Selector Label 选取方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelector(String Selector) {
        this.Selector = Selector;
    }

    /**
     * Get Endpoints 信息（PodMonitor 不含该参数） 
     * @return Endpoints Endpoints 信息（PodMonitor 不含该参数）
     */
    public String getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set Endpoints 信息（PodMonitor 不含该参数）
     * @param Endpoints Endpoints 信息（PodMonitor 不含该参数）
     */
    public void setEndpoints(String Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get 服务发现对应的配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Yaml 服务发现对应的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set 服务发现对应的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Yaml 服务发现对应的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "NamespaceSelector", this.NamespaceSelector);
        this.setParamSimple(map, prefix + "Selector", this.Selector);
        this.setParamSimple(map, prefix + "Endpoints", this.Endpoints);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);

    }
}

