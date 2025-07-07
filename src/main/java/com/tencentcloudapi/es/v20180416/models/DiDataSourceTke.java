/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiDataSourceTke extends AbstractModel {

    /**
    * vpc id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * tke实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TkeId")
    @Expose
    private String TkeId;

    /**
    * 采集器id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectorId")
    @Expose
    private String CollectorId;

    /**
    * 采集源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectorName")
    @Expose
    private String CollectorName;

    /**
    * 采集器类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectorType")
    @Expose
    private String CollectorType;

    /**
    * 采集器版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectorVersion")
    @Expose
    private String CollectorVersion;

    /**
    * tke包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeNamespaces")
    @Expose
    private String [] IncludeNamespaces;

    /**
    * tke不包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeNamespaces")
    @Expose
    private String [] ExcludeNamespaces;

    /**
    * tke pod标签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodLabelKeys")
    @Expose
    private String [] PodLabelKeys;

    /**
    * tke pod标签值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodLabelValues")
    @Expose
    private String [] PodLabelValues;

    /**
    * tke容器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * tke采集器beat配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * /
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * TKE 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputPath")
    @Expose
    private String InputPath;

    /**
     * Get vpc id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get tke实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TkeId tke实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTkeId() {
        return this.TkeId;
    }

    /**
     * Set tke实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TkeId tke实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTkeId(String TkeId) {
        this.TkeId = TkeId;
    }

    /**
     * Get 采集器id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectorId 采集器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollectorId() {
        return this.CollectorId;
    }

    /**
     * Set 采集器id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectorId 采集器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectorId(String CollectorId) {
        this.CollectorId = CollectorId;
    }

    /**
     * Get 采集源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectorName 采集源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollectorName() {
        return this.CollectorName;
    }

    /**
     * Set 采集源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectorName 采集源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectorName(String CollectorName) {
        this.CollectorName = CollectorName;
    }

    /**
     * Get 采集器类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectorType 采集器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollectorType() {
        return this.CollectorType;
    }

    /**
     * Set 采集器类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectorType 采集器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectorType(String CollectorType) {
        this.CollectorType = CollectorType;
    }

    /**
     * Get 采集器版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectorVersion 采集器版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollectorVersion() {
        return this.CollectorVersion;
    }

    /**
     * Set 采集器版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectorVersion 采集器版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectorVersion(String CollectorVersion) {
        this.CollectorVersion = CollectorVersion;
    }

    /**
     * Get tke包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeNamespaces tke包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIncludeNamespaces() {
        return this.IncludeNamespaces;
    }

    /**
     * Set tke包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeNamespaces tke包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeNamespaces(String [] IncludeNamespaces) {
        this.IncludeNamespaces = IncludeNamespaces;
    }

    /**
     * Get tke不包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeNamespaces tke不包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludeNamespaces() {
        return this.ExcludeNamespaces;
    }

    /**
     * Set tke不包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeNamespaces tke不包含的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeNamespaces(String [] ExcludeNamespaces) {
        this.ExcludeNamespaces = ExcludeNamespaces;
    }

    /**
     * Get tke pod标签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodLabelKeys tke pod标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPodLabelKeys() {
        return this.PodLabelKeys;
    }

    /**
     * Set tke pod标签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodLabelKeys tke pod标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodLabelKeys(String [] PodLabelKeys) {
        this.PodLabelKeys = PodLabelKeys;
    }

    /**
     * Get tke pod标签值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodLabelValues tke pod标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPodLabelValues() {
        return this.PodLabelValues;
    }

    /**
     * Set tke pod标签值
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodLabelValues tke pod标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodLabelValues(String [] PodLabelValues) {
        this.PodLabelValues = PodLabelValues;
    }

    /**
     * Get tke容器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName tke容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set tke容器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName tke容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get tke采集器beat配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigContent tke采集器beat配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set tke采集器beat配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigContent tke采集器beat配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get /
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputType /
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set /
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputType /
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get TKE 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputPath TKE 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputPath() {
        return this.InputPath;
    }

    /**
     * Set TKE 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputPath TKE 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputPath(String InputPath) {
        this.InputPath = InputPath;
    }

    public DiDataSourceTke() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiDataSourceTke(DiDataSourceTke source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TkeId != null) {
            this.TkeId = new String(source.TkeId);
        }
        if (source.CollectorId != null) {
            this.CollectorId = new String(source.CollectorId);
        }
        if (source.CollectorName != null) {
            this.CollectorName = new String(source.CollectorName);
        }
        if (source.CollectorType != null) {
            this.CollectorType = new String(source.CollectorType);
        }
        if (source.CollectorVersion != null) {
            this.CollectorVersion = new String(source.CollectorVersion);
        }
        if (source.IncludeNamespaces != null) {
            this.IncludeNamespaces = new String[source.IncludeNamespaces.length];
            for (int i = 0; i < source.IncludeNamespaces.length; i++) {
                this.IncludeNamespaces[i] = new String(source.IncludeNamespaces[i]);
            }
        }
        if (source.ExcludeNamespaces != null) {
            this.ExcludeNamespaces = new String[source.ExcludeNamespaces.length];
            for (int i = 0; i < source.ExcludeNamespaces.length; i++) {
                this.ExcludeNamespaces[i] = new String(source.ExcludeNamespaces[i]);
            }
        }
        if (source.PodLabelKeys != null) {
            this.PodLabelKeys = new String[source.PodLabelKeys.length];
            for (int i = 0; i < source.PodLabelKeys.length; i++) {
                this.PodLabelKeys[i] = new String(source.PodLabelKeys[i]);
            }
        }
        if (source.PodLabelValues != null) {
            this.PodLabelValues = new String[source.PodLabelValues.length];
            for (int i = 0; i < source.PodLabelValues.length; i++) {
                this.PodLabelValues[i] = new String(source.PodLabelValues[i]);
            }
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.InputPath != null) {
            this.InputPath = new String(source.InputPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TkeId", this.TkeId);
        this.setParamSimple(map, prefix + "CollectorId", this.CollectorId);
        this.setParamSimple(map, prefix + "CollectorName", this.CollectorName);
        this.setParamSimple(map, prefix + "CollectorType", this.CollectorType);
        this.setParamSimple(map, prefix + "CollectorVersion", this.CollectorVersion);
        this.setParamArraySimple(map, prefix + "IncludeNamespaces.", this.IncludeNamespaces);
        this.setParamArraySimple(map, prefix + "ExcludeNamespaces.", this.ExcludeNamespaces);
        this.setParamArraySimple(map, prefix + "PodLabelKeys.", this.PodLabelKeys);
        this.setParamArraySimple(map, prefix + "PodLabelValues.", this.PodLabelValues);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "InputPath", this.InputPath);

    }
}

