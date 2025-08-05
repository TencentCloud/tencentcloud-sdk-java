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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceResourceConfig extends AbstractModel {

    /**
    * 容器实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Container")
    @Expose
    private ContainerInstanceResourceConfig Container;

    /**
    * 虚拟机实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vm")
    @Expose
    private VmInstanceResourceConfig Vm;

    /**
     * Get 容器实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Container 容器实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerInstanceResourceConfig getContainer() {
        return this.Container;
    }

    /**
     * Set 容器实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Container 容器实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainer(ContainerInstanceResourceConfig Container) {
        this.Container = Container;
    }

    /**
     * Get 虚拟机实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vm 虚拟机实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VmInstanceResourceConfig getVm() {
        return this.Vm;
    }

    /**
     * Set 虚拟机实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vm 虚拟机实例相关的参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVm(VmInstanceResourceConfig Vm) {
        this.Vm = Vm;
    }

    public InstanceResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceResourceConfig(InstanceResourceConfig source) {
        if (source.Container != null) {
            this.Container = new ContainerInstanceResourceConfig(source.Container);
        }
        if (source.Vm != null) {
            this.Vm = new VmInstanceResourceConfig(source.Vm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Container.", this.Container);
        this.setParamObj(map, prefix + "Vm.", this.Vm);

    }
}

