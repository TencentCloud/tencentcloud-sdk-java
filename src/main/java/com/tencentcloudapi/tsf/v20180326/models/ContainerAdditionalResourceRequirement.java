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

public class ContainerAdditionalResourceRequirement extends AbstractModel {

    /**
    * CPU 核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * 内存 MiB 数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mem")
    @Expose
    private String Mem;

    /**
     * Get CPU 核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu CPU 核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU 核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu CPU 核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 MiB 数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mem 内存 MiB 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMem() {
        return this.Mem;
    }

    /**
     * Set 内存 MiB 数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mem 内存 MiB 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMem(String Mem) {
        this.Mem = Mem;
    }

    public ContainerAdditionalResourceRequirement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerAdditionalResourceRequirement(ContainerAdditionalResourceRequirement source) {
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new String(source.Mem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);

    }
}

