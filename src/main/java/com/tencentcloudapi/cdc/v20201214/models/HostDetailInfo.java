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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostDetailInfo extends AbstractModel {

    /**
    * 类型族
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostTypeFamily")
    @Expose
    private String HostTypeFamily;

    /**
    * 总CPU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTotal")
    @Expose
    private Float CpuTotal;

    /**
    * 可用CPU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Float CpuAvailable;

    /**
    * 总内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemTotal")
    @Expose
    private Float MemTotal;

    /**
    * 可用内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemAvailable")
    @Expose
    private Float MemAvailable;

    /**
     * Get 类型族
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostTypeFamily 类型族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostTypeFamily() {
        return this.HostTypeFamily;
    }

    /**
     * Set 类型族
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostTypeFamily 类型族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostTypeFamily(String HostTypeFamily) {
        this.HostTypeFamily = HostTypeFamily;
    }

    /**
     * Get 总CPU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTotal 总CPU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set 总CPU
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTotal 总CPU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTotal(Float CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get 可用CPU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuAvailable 可用CPU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set 可用CPU
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuAvailable 可用CPU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuAvailable(Float CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get 总内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemTotal 总内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set 总内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemTotal 总内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemTotal(Float MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get 可用内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemAvailable 可用内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set 可用内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemAvailable 可用内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemAvailable(Float MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    public HostDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostDetailInfo(HostDetailInfo source) {
        if (source.HostTypeFamily != null) {
            this.HostTypeFamily = new String(source.HostTypeFamily);
        }
        if (source.CpuTotal != null) {
            this.CpuTotal = new Float(source.CpuTotal);
        }
        if (source.CpuAvailable != null) {
            this.CpuAvailable = new Float(source.CpuAvailable);
        }
        if (source.MemTotal != null) {
            this.MemTotal = new Float(source.MemTotal);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new Float(source.MemAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostTypeFamily", this.HostTypeFamily);
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);

    }
}

