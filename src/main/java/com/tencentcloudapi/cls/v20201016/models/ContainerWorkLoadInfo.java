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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerWorkLoadInfo extends AbstractModel{

    /**
    * 工作负载的类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 工作负载的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 容器名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 工作负载的类型 
     * @return Kind 工作负载的类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 工作负载的类型
     * @param Kind 工作负载的类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 工作负载的名称 
     * @return Name 工作负载的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工作负载的名称
     * @param Name 工作负载的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 容器名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Container 容器名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 容器名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Container 容器名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public ContainerWorkLoadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerWorkLoadInfo(ContainerWorkLoadInfo source) {
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

