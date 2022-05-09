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

public class NamespaceUsage extends AbstractModel{

    /**
    * 函数数组
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 命名空间函数个数
    */
    @SerializedName("FunctionsCount")
    @Expose
    private Long FunctionsCount;

    /**
    * 命名空间配额总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalConcurrencyMem")
    @Expose
    private Long TotalConcurrencyMem;

    /**
    * 命名空间并发使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalAllocatedConcurrencyMem")
    @Expose
    private Long TotalAllocatedConcurrencyMem;

    /**
    * 命名空间预置使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalAllocatedProvisionedMem")
    @Expose
    private Long TotalAllocatedProvisionedMem;

    /**
     * Get 函数数组 
     * @return Functions 函数数组
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set 函数数组
     * @param Functions 函数数组
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get 命名空间名称 
     * @return Namespace 命名空间名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称
     * @param Namespace 命名空间名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 命名空间函数个数 
     * @return FunctionsCount 命名空间函数个数
     */
    public Long getFunctionsCount() {
        return this.FunctionsCount;
    }

    /**
     * Set 命名空间函数个数
     * @param FunctionsCount 命名空间函数个数
     */
    public void setFunctionsCount(Long FunctionsCount) {
        this.FunctionsCount = FunctionsCount;
    }

    /**
     * Get 命名空间配额总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalConcurrencyMem 命名空间配额总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalConcurrencyMem() {
        return this.TotalConcurrencyMem;
    }

    /**
     * Set 命名空间配额总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalConcurrencyMem 命名空间配额总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalConcurrencyMem(Long TotalConcurrencyMem) {
        this.TotalConcurrencyMem = TotalConcurrencyMem;
    }

    /**
     * Get 命名空间并发使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalAllocatedConcurrencyMem 命名空间并发使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalAllocatedConcurrencyMem() {
        return this.TotalAllocatedConcurrencyMem;
    }

    /**
     * Set 命名空间并发使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalAllocatedConcurrencyMem 命名空间并发使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalAllocatedConcurrencyMem(Long TotalAllocatedConcurrencyMem) {
        this.TotalAllocatedConcurrencyMem = TotalAllocatedConcurrencyMem;
    }

    /**
     * Get 命名空间预置使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalAllocatedProvisionedMem 命名空间预置使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalAllocatedProvisionedMem() {
        return this.TotalAllocatedProvisionedMem;
    }

    /**
     * Set 命名空间预置使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalAllocatedProvisionedMem 命名空间预置使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalAllocatedProvisionedMem(Long TotalAllocatedProvisionedMem) {
        this.TotalAllocatedProvisionedMem = TotalAllocatedProvisionedMem;
    }

    public NamespaceUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceUsage(NamespaceUsage source) {
        if (source.Functions != null) {
            this.Functions = new String[source.Functions.length];
            for (int i = 0; i < source.Functions.length; i++) {
                this.Functions[i] = new String(source.Functions[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionsCount != null) {
            this.FunctionsCount = new Long(source.FunctionsCount);
        }
        if (source.TotalConcurrencyMem != null) {
            this.TotalConcurrencyMem = new Long(source.TotalConcurrencyMem);
        }
        if (source.TotalAllocatedConcurrencyMem != null) {
            this.TotalAllocatedConcurrencyMem = new Long(source.TotalAllocatedConcurrencyMem);
        }
        if (source.TotalAllocatedProvisionedMem != null) {
            this.TotalAllocatedProvisionedMem = new Long(source.TotalAllocatedProvisionedMem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionsCount", this.FunctionsCount);
        this.setParamSimple(map, prefix + "TotalConcurrencyMem", this.TotalConcurrencyMem);
        this.setParamSimple(map, prefix + "TotalAllocatedConcurrencyMem", this.TotalAllocatedConcurrencyMem);
        this.setParamSimple(map, prefix + "TotalAllocatedProvisionedMem", this.TotalAllocatedProvisionedMem);

    }
}

