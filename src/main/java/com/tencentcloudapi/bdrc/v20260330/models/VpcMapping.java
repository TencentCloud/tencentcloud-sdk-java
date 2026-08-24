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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcMapping extends AbstractModel {

    /**
    * 映射规则主键ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 所属容灾策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 源端VPC ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceVpc")
    @Expose
    private String SourceVpc;

    /**
    * 源端子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceSubnet")
    @Expose
    private String SourceSubnet;

    /**
    * 目标端VPC ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetVpc")
    @Expose
    private String TargetVpc;

    /**
    * 目标端子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSubnet")
    @Expose
    private String TargetSubnet;

    /**
    * 映射状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 生命周期状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
     * Get 映射规则主键ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 映射规则主键ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 映射规则主键ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 映射规则主键ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 所属容灾策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SitePairId 所属容灾策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 所属容灾策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SitePairId 所属容灾策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 源端VPC ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceVpc 源端VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceVpc() {
        return this.SourceVpc;
    }

    /**
     * Set 源端VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceVpc 源端VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceVpc(String SourceVpc) {
        this.SourceVpc = SourceVpc;
    }

    /**
     * Get 源端子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceSubnet 源端子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceSubnet() {
        return this.SourceSubnet;
    }

    /**
     * Set 源端子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceSubnet 源端子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceSubnet(String SourceSubnet) {
        this.SourceSubnet = SourceSubnet;
    }

    /**
     * Get 目标端VPC ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetVpc 目标端VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetVpc() {
        return this.TargetVpc;
    }

    /**
     * Set 目标端VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetVpc 目标端VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetVpc(String TargetVpc) {
        this.TargetVpc = TargetVpc;
    }

    /**
     * Get 目标端子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSubnet 目标端子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSubnet() {
        return this.TargetSubnet;
    }

    /**
     * Set 目标端子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSubnet 目标端子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSubnet(String TargetSubnet) {
        this.TargetSubnet = TargetSubnet;
    }

    /**
     * Get 映射状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 映射状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 映射状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 映射状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 生命周期状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeState 生命周期状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 生命周期状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeState 生命周期状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    public VpcMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcMapping(VpcMapping source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.SourceVpc != null) {
            this.SourceVpc = new String(source.SourceVpc);
        }
        if (source.SourceSubnet != null) {
            this.SourceSubnet = new String(source.SourceSubnet);
        }
        if (source.TargetVpc != null) {
            this.TargetVpc = new String(source.TargetVpc);
        }
        if (source.TargetSubnet != null) {
            this.TargetSubnet = new String(source.TargetSubnet);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "SourceVpc", this.SourceVpc);
        this.setParamSimple(map, prefix + "SourceSubnet", this.SourceSubnet);
        this.setParamSimple(map, prefix + "TargetVpc", this.TargetVpc);
        this.setParamSimple(map, prefix + "TargetSubnet", this.TargetSubnet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);

    }
}

