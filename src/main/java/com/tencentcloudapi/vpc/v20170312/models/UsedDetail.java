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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsedDetail extends AbstractModel{

    /**
    * 流量包唯一ID
    */
    @SerializedName("TrafficPackageId")
    @Expose
    private String TrafficPackageId;

    /**
    * 流量包名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrafficPackageName")
    @Expose
    private String TrafficPackageName;

    /**
    * 流量包总量
    */
    @SerializedName("TotalAmount")
    @Expose
    private TrafficFlow TotalAmount;

    /**
    * 本次抵扣
    */
    @SerializedName("Deduction")
    @Expose
    private TrafficFlow Deduction;

    /**
    * 本次抵扣后剩余量
    */
    @SerializedName("RemainingAmount")
    @Expose
    private TrafficFlow RemainingAmount;

    /**
    * 抵扣时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 资源类型。可能的值: CVM, LB, NAT, HAVIP, EIP
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 流量包到期时间
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
     * Get 流量包唯一ID 
     * @return TrafficPackageId 流量包唯一ID
     */
    public String getTrafficPackageId() {
        return this.TrafficPackageId;
    }

    /**
     * Set 流量包唯一ID
     * @param TrafficPackageId 流量包唯一ID
     */
    public void setTrafficPackageId(String TrafficPackageId) {
        this.TrafficPackageId = TrafficPackageId;
    }

    /**
     * Get 流量包名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrafficPackageName 流量包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrafficPackageName() {
        return this.TrafficPackageName;
    }

    /**
     * Set 流量包名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrafficPackageName 流量包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrafficPackageName(String TrafficPackageName) {
        this.TrafficPackageName = TrafficPackageName;
    }

    /**
     * Get 流量包总量 
     * @return TotalAmount 流量包总量
     */
    public TrafficFlow getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 流量包总量
     * @param TotalAmount 流量包总量
     */
    public void setTotalAmount(TrafficFlow TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 本次抵扣 
     * @return Deduction 本次抵扣
     */
    public TrafficFlow getDeduction() {
        return this.Deduction;
    }

    /**
     * Set 本次抵扣
     * @param Deduction 本次抵扣
     */
    public void setDeduction(TrafficFlow Deduction) {
        this.Deduction = Deduction;
    }

    /**
     * Get 本次抵扣后剩余量 
     * @return RemainingAmount 本次抵扣后剩余量
     */
    public TrafficFlow getRemainingAmount() {
        return this.RemainingAmount;
    }

    /**
     * Set 本次抵扣后剩余量
     * @param RemainingAmount 本次抵扣后剩余量
     */
    public void setRemainingAmount(TrafficFlow RemainingAmount) {
        this.RemainingAmount = RemainingAmount;
    }

    /**
     * Get 抵扣时间 
     * @return Time 抵扣时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 抵扣时间
     * @param Time 抵扣时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 资源类型。可能的值: CVM, LB, NAT, HAVIP, EIP 
     * @return ResourceType 资源类型。可能的值: CVM, LB, NAT, HAVIP, EIP
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型。可能的值: CVM, LB, NAT, HAVIP, EIP
     * @param ResourceType 资源类型。可能的值: CVM, LB, NAT, HAVIP, EIP
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 流量包到期时间 
     * @return Deadline 流量包到期时间
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 流量包到期时间
     * @param Deadline 流量包到期时间
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    public UsedDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsedDetail(UsedDetail source) {
        if (source.TrafficPackageId != null) {
            this.TrafficPackageId = new String(source.TrafficPackageId);
        }
        if (source.TrafficPackageName != null) {
            this.TrafficPackageName = new String(source.TrafficPackageName);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new TrafficFlow(source.TotalAmount);
        }
        if (source.Deduction != null) {
            this.Deduction = new TrafficFlow(source.Deduction);
        }
        if (source.RemainingAmount != null) {
            this.RemainingAmount = new TrafficFlow(source.RemainingAmount);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficPackageId", this.TrafficPackageId);
        this.setParamSimple(map, prefix + "TrafficPackageName", this.TrafficPackageName);
        this.setParamObj(map, prefix + "TotalAmount.", this.TotalAmount);
        this.setParamObj(map, prefix + "Deduction.", this.Deduction);
        this.setParamObj(map, prefix + "RemainingAmount.", this.RemainingAmount);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

