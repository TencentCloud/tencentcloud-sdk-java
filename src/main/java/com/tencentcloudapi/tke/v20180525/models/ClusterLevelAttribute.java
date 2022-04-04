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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterLevelAttribute extends AbstractModel{

    /**
    * 集群等级
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 等级名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Pod数量
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * Configmap数量
    */
    @SerializedName("ConfigMapCount")
    @Expose
    private Long ConfigMapCount;

    /**
    * CRD数量
    */
    @SerializedName("CRDCount")
    @Expose
    private Long CRDCount;

    /**
    * 是否启用
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 其他资源数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherCount")
    @Expose
    private Long OtherCount;

    /**
     * Get 集群等级 
     * @return Name 集群等级
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群等级
     * @param Name 集群等级
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 等级名称 
     * @return Alias 等级名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 等级名称
     * @param Alias 等级名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 节点数量 
     * @return NodeCount 节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量
     * @param NodeCount 节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Pod数量 
     * @return PodCount Pod数量
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set Pod数量
     * @param PodCount Pod数量
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get Configmap数量 
     * @return ConfigMapCount Configmap数量
     */
    public Long getConfigMapCount() {
        return this.ConfigMapCount;
    }

    /**
     * Set Configmap数量
     * @param ConfigMapCount Configmap数量
     */
    public void setConfigMapCount(Long ConfigMapCount) {
        this.ConfigMapCount = ConfigMapCount;
    }

    /**
     * Get CRD数量 
     * @return CRDCount CRD数量
     */
    public Long getCRDCount() {
        return this.CRDCount;
    }

    /**
     * Set CRD数量
     * @param CRDCount CRD数量
     */
    public void setCRDCount(Long CRDCount) {
        this.CRDCount = CRDCount;
    }

    /**
     * Get 是否启用 
     * @return Enable 是否启用
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用
     * @param Enable 是否启用
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 其他资源数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherCount 其他资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOtherCount() {
        return this.OtherCount;
    }

    /**
     * Set 其他资源数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherCount 其他资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherCount(Long OtherCount) {
        this.OtherCount = OtherCount;
    }

    public ClusterLevelAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterLevelAttribute(ClusterLevelAttribute source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.ConfigMapCount != null) {
            this.ConfigMapCount = new Long(source.ConfigMapCount);
        }
        if (source.CRDCount != null) {
            this.CRDCount = new Long(source.CRDCount);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.OtherCount != null) {
            this.OtherCount = new Long(source.OtherCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "ConfigMapCount", this.ConfigMapCount);
        this.setParamSimple(map, prefix + "CRDCount", this.CRDCount);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "OtherCount", this.OtherCount);

    }
}

