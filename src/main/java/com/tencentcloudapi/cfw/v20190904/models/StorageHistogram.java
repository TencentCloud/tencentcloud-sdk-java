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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageHistogram extends AbstractModel {

    /**
    * 访问控制日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclSize")
    @Expose
    private Long AclSize;

    /**
    * 入侵防御日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdsSize")
    @Expose
    private Long IdsSize;

    /**
    * 流量日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetFlowSize")
    @Expose
    private Long NetFlowSize;

    /**
    * 操作日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateSize")
    @Expose
    private Long OperateSize;

    /**
    * 统计时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * NDR流量日志存储量，单位B
    */
    @SerializedName("NDRNetflowSize")
    @Expose
    private Long NDRNetflowSize;

    /**
    * NDR风险日志存储量，单位B
    */
    @SerializedName("NDRRiskSize")
    @Expose
    private Long NDRRiskSize;

    /**
     * Get 访问控制日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclSize 访问控制日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAclSize() {
        return this.AclSize;
    }

    /**
     * Set 访问控制日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclSize 访问控制日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclSize(Long AclSize) {
        this.AclSize = AclSize;
    }

    /**
     * Get 入侵防御日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdsSize 入侵防御日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdsSize() {
        return this.IdsSize;
    }

    /**
     * Set 入侵防御日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdsSize 入侵防御日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdsSize(Long IdsSize) {
        this.IdsSize = IdsSize;
    }

    /**
     * Get 流量日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetFlowSize 流量日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetFlowSize() {
        return this.NetFlowSize;
    }

    /**
     * Set 流量日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetFlowSize 流量日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetFlowSize(Long NetFlowSize) {
        this.NetFlowSize = NetFlowSize;
    }

    /**
     * Get 操作日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateSize 操作日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperateSize() {
        return this.OperateSize;
    }

    /**
     * Set 操作日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateSize 操作日志存储量，单位B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateSize(Long OperateSize) {
        this.OperateSize = OperateSize;
    }

    /**
     * Get 统计时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 统计时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 统计时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 统计时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get NDR流量日志存储量，单位B 
     * @return NDRNetflowSize NDR流量日志存储量，单位B
     */
    public Long getNDRNetflowSize() {
        return this.NDRNetflowSize;
    }

    /**
     * Set NDR流量日志存储量，单位B
     * @param NDRNetflowSize NDR流量日志存储量，单位B
     */
    public void setNDRNetflowSize(Long NDRNetflowSize) {
        this.NDRNetflowSize = NDRNetflowSize;
    }

    /**
     * Get NDR风险日志存储量，单位B 
     * @return NDRRiskSize NDR风险日志存储量，单位B
     */
    public Long getNDRRiskSize() {
        return this.NDRRiskSize;
    }

    /**
     * Set NDR风险日志存储量，单位B
     * @param NDRRiskSize NDR风险日志存储量，单位B
     */
    public void setNDRRiskSize(Long NDRRiskSize) {
        this.NDRRiskSize = NDRRiskSize;
    }

    public StorageHistogram() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageHistogram(StorageHistogram source) {
        if (source.AclSize != null) {
            this.AclSize = new Long(source.AclSize);
        }
        if (source.IdsSize != null) {
            this.IdsSize = new Long(source.IdsSize);
        }
        if (source.NetFlowSize != null) {
            this.NetFlowSize = new Long(source.NetFlowSize);
        }
        if (source.OperateSize != null) {
            this.OperateSize = new Long(source.OperateSize);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.NDRNetflowSize != null) {
            this.NDRNetflowSize = new Long(source.NDRNetflowSize);
        }
        if (source.NDRRiskSize != null) {
            this.NDRRiskSize = new Long(source.NDRRiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AclSize", this.AclSize);
        this.setParamSimple(map, prefix + "IdsSize", this.IdsSize);
        this.setParamSimple(map, prefix + "NetFlowSize", this.NetFlowSize);
        this.setParamSimple(map, prefix + "OperateSize", this.OperateSize);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "NDRNetflowSize", this.NDRNetflowSize);
        this.setParamSimple(map, prefix + "NDRRiskSize", this.NDRRiskSize);

    }
}

