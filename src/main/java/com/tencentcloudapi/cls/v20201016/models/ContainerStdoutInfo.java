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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerStdoutInfo extends AbstractModel {

    /**
    * 是否所有容器
    */
    @SerializedName("AllContainers")
    @Expose
    private Boolean AllContainers;

    /**
    * container为空表所有的，不为空采集指定的容器
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * namespace可以多个，用分隔号分割,例如A,B；为空或者没有这个字段，表示所有namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeLabels")
    @Expose
    private String [] IncludeLabels;

    /**
    * 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkLoads")
    @Expose
    private ContainerWorkLoadInfo [] WorkLoads;

    /**
    * 需要排除的namespace可以多个，用分隔号分割,例如A,B
    */
    @SerializedName("ExcludeNamespace")
    @Expose
    private String ExcludeNamespace;

    /**
    * 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeLabels")
    @Expose
    private String [] ExcludeLabels;

    /**
    * metadata信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomLabels")
    @Expose
    private String [] CustomLabels;

    /**
     * Get 是否所有容器 
     * @return AllContainers 是否所有容器
     */
    public Boolean getAllContainers() {
        return this.AllContainers;
    }

    /**
     * Set 是否所有容器
     * @param AllContainers 是否所有容器
     */
    public void setAllContainers(Boolean AllContainers) {
        this.AllContainers = AllContainers;
    }

    /**
     * Get container为空表所有的，不为空采集指定的容器 
     * @return Container container为空表所有的，不为空采集指定的容器
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set container为空表所有的，不为空采集指定的容器
     * @param Container container为空表所有的，不为空采集指定的容器
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get namespace可以多个，用分隔号分割,例如A,B；为空或者没有这个字段，表示所有namespace 
     * @return Namespace namespace可以多个，用分隔号分割,例如A,B；为空或者没有这个字段，表示所有namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set namespace可以多个，用分隔号分割,例如A,B；为空或者没有这个字段，表示所有namespace
     * @param Namespace namespace可以多个，用分隔号分割,例如A,B；为空或者没有这个字段，表示所有namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get pod标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeLabels pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIncludeLabels() {
        return this.IncludeLabels;
    }

    /**
     * Set pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeLabels pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeLabels(String [] IncludeLabels) {
        this.IncludeLabels = IncludeLabels;
    }

    /**
     * Get 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkLoads 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerWorkLoadInfo [] getWorkLoads() {
        return this.WorkLoads;
    }

    /**
     * Set 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkLoads 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkLoads(ContainerWorkLoadInfo [] WorkLoads) {
        this.WorkLoads = WorkLoads;
    }

    /**
     * Get 需要排除的namespace可以多个，用分隔号分割,例如A,B 
     * @return ExcludeNamespace 需要排除的namespace可以多个，用分隔号分割,例如A,B
     */
    public String getExcludeNamespace() {
        return this.ExcludeNamespace;
    }

    /**
     * Set 需要排除的namespace可以多个，用分隔号分割,例如A,B
     * @param ExcludeNamespace 需要排除的namespace可以多个，用分隔号分割,例如A,B
     */
    public void setExcludeNamespace(String ExcludeNamespace) {
        this.ExcludeNamespace = ExcludeNamespace;
    }

    /**
     * Get 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeLabels 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludeLabels() {
        return this.ExcludeLabels;
    }

    /**
     * Set 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeLabels 需要排除的pod标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeLabels(String [] ExcludeLabels) {
        this.ExcludeLabels = ExcludeLabels;
    }

    /**
     * Get metadata信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomLabels metadata信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomLabels() {
        return this.CustomLabels;
    }

    /**
     * Set metadata信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomLabels metadata信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomLabels(String [] CustomLabels) {
        this.CustomLabels = CustomLabels;
    }

    public ContainerStdoutInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerStdoutInfo(ContainerStdoutInfo source) {
        if (source.AllContainers != null) {
            this.AllContainers = new Boolean(source.AllContainers);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.IncludeLabels != null) {
            this.IncludeLabels = new String[source.IncludeLabels.length];
            for (int i = 0; i < source.IncludeLabels.length; i++) {
                this.IncludeLabels[i] = new String(source.IncludeLabels[i]);
            }
        }
        if (source.WorkLoads != null) {
            this.WorkLoads = new ContainerWorkLoadInfo[source.WorkLoads.length];
            for (int i = 0; i < source.WorkLoads.length; i++) {
                this.WorkLoads[i] = new ContainerWorkLoadInfo(source.WorkLoads[i]);
            }
        }
        if (source.ExcludeNamespace != null) {
            this.ExcludeNamespace = new String(source.ExcludeNamespace);
        }
        if (source.ExcludeLabels != null) {
            this.ExcludeLabels = new String[source.ExcludeLabels.length];
            for (int i = 0; i < source.ExcludeLabels.length; i++) {
                this.ExcludeLabels[i] = new String(source.ExcludeLabels[i]);
            }
        }
        if (source.CustomLabels != null) {
            this.CustomLabels = new String[source.CustomLabels.length];
            for (int i = 0; i < source.CustomLabels.length; i++) {
                this.CustomLabels[i] = new String(source.CustomLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllContainers", this.AllContainers);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArraySimple(map, prefix + "IncludeLabels.", this.IncludeLabels);
        this.setParamArrayObj(map, prefix + "WorkLoads.", this.WorkLoads);
        this.setParamSimple(map, prefix + "ExcludeNamespace", this.ExcludeNamespace);
        this.setParamArraySimple(map, prefix + "ExcludeLabels.", this.ExcludeLabels);
        this.setParamArraySimple(map, prefix + "CustomLabels.", this.CustomLabels);

    }
}

