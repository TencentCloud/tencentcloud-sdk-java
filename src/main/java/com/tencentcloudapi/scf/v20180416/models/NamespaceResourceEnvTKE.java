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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceResourceEnvTKE extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 子网ID
    */
    @SerializedName("SubnetID")
    @Expose
    private String SubnetID;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 数据存储地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataPath")
    @Expose
    private String DataPath;

    /**
    * node选择器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeSelector")
    @Expose
    private K8SLabel [] NodeSelector;

    /**
    * 污点容忍
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tolerations")
    @Expose
    private K8SToleration [] Tolerations;

    /**
    * scf组件将占用的节点端口起始号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * yaml格式的pod patch内容，例如
metadata:
  labels:
    key: value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodTemplatePatch")
    @Expose
    private String PodTemplatePatch;

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 子网ID 
     * @return SubnetID 子网ID
     */
    public String getSubnetID() {
        return this.SubnetID;
    }

    /**
     * Set 子网ID
     * @param SubnetID 子网ID
     */
    public void setSubnetID(String SubnetID) {
        this.SubnetID = SubnetID;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 数据存储地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataPath 数据存储地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataPath() {
        return this.DataPath;
    }

    /**
     * Set 数据存储地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataPath 数据存储地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataPath(String DataPath) {
        this.DataPath = DataPath;
    }

    /**
     * Get node选择器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeSelector node选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public K8SLabel [] getNodeSelector() {
        return this.NodeSelector;
    }

    /**
     * Set node选择器
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeSelector node选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeSelector(K8SLabel [] NodeSelector) {
        this.NodeSelector = NodeSelector;
    }

    /**
     * Get 污点容忍
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tolerations 污点容忍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public K8SToleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set 污点容忍
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tolerations 污点容忍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTolerations(K8SToleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get scf组件将占用的节点端口起始号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port scf组件将占用的节点端口起始号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set scf组件将占用的节点端口起始号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port scf组件将占用的节点端口起始号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get yaml格式的pod patch内容，例如
metadata:
  labels:
    key: value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodTemplatePatch yaml格式的pod patch内容，例如
metadata:
  labels:
    key: value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodTemplatePatch() {
        return this.PodTemplatePatch;
    }

    /**
     * Set yaml格式的pod patch内容，例如
metadata:
  labels:
    key: value
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodTemplatePatch yaml格式的pod patch内容，例如
metadata:
  labels:
    key: value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodTemplatePatch(String PodTemplatePatch) {
        this.PodTemplatePatch = PodTemplatePatch;
    }

    public NamespaceResourceEnvTKE() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceResourceEnvTKE(NamespaceResourceEnvTKE source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.SubnetID != null) {
            this.SubnetID = new String(source.SubnetID);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.DataPath != null) {
            this.DataPath = new String(source.DataPath);
        }
        if (source.NodeSelector != null) {
            this.NodeSelector = new K8SLabel[source.NodeSelector.length];
            for (int i = 0; i < source.NodeSelector.length; i++) {
                this.NodeSelector[i] = new K8SLabel(source.NodeSelector[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new K8SToleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new K8SToleration(source.Tolerations[i]);
            }
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.PodTemplatePatch != null) {
            this.PodTemplatePatch = new String(source.PodTemplatePatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "SubnetID", this.SubnetID);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "DataPath", this.DataPath);
        this.setParamArrayObj(map, prefix + "NodeSelector.", this.NodeSelector);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "PodTemplatePatch", this.PodTemplatePatch);

    }
}

