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

public class DiDataSourceCvm extends AbstractModel {

    /**
    * vpc id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 采集路径列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogPaths")
    @Expose
    private String [] LogPaths;

    /**
    * cvm实例信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmInstances")
    @Expose
    private DiDataSourceCvmInstance [] CvmInstances;

    /**
    * 采集器id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectorId")
    @Expose
    private String CollectorId;

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
     * Get 采集路径列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogPaths 采集路径列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLogPaths() {
        return this.LogPaths;
    }

    /**
     * Set 采集路径列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogPaths 采集路径列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogPaths(String [] LogPaths) {
        this.LogPaths = LogPaths;
    }

    /**
     * Get cvm实例信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmInstances cvm实例信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiDataSourceCvmInstance [] getCvmInstances() {
        return this.CvmInstances;
    }

    /**
     * Set cvm实例信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmInstances cvm实例信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmInstances(DiDataSourceCvmInstance [] CvmInstances) {
        this.CvmInstances = CvmInstances;
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

    public DiDataSourceCvm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiDataSourceCvm(DiDataSourceCvm source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.LogPaths != null) {
            this.LogPaths = new String[source.LogPaths.length];
            for (int i = 0; i < source.LogPaths.length; i++) {
                this.LogPaths[i] = new String(source.LogPaths[i]);
            }
        }
        if (source.CvmInstances != null) {
            this.CvmInstances = new DiDataSourceCvmInstance[source.CvmInstances.length];
            for (int i = 0; i < source.CvmInstances.length; i++) {
                this.CvmInstances[i] = new DiDataSourceCvmInstance(source.CvmInstances[i]);
            }
        }
        if (source.CollectorId != null) {
            this.CollectorId = new String(source.CollectorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "LogPaths.", this.LogPaths);
        this.setParamArrayObj(map, prefix + "CvmInstances.", this.CvmInstances);
        this.setParamSimple(map, prefix + "CollectorId", this.CollectorId);

    }
}

