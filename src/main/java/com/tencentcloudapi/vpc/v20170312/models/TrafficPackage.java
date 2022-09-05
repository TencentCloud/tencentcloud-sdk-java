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

public class TrafficPackage extends AbstractModel{

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
    * 流量包总量，单位GB
    */
    @SerializedName("TotalAmount")
    @Expose
    private Float TotalAmount;

    /**
    * 流量包剩余量，单位GB
    */
    @SerializedName("RemainingAmount")
    @Expose
    private Float RemainingAmount;

    /**
    * 流量包状态，可能的值有: AVAILABLE-可用状态， EXPIRED-已过期， EXHAUSTED-已用完， REFUNDED-已退还， DELETED-已删除
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 流量包创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 流量包截止时间
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 已使用的流量，单位GB
    */
    @SerializedName("UsedAmount")
    @Expose
    private Float UsedAmount;

    /**
    * 流量包标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 区分闲时流量包与全时流量包
    */
    @SerializedName("DeductType")
    @Expose
    private String DeductType;

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
     * Get 流量包总量，单位GB 
     * @return TotalAmount 流量包总量，单位GB
     */
    public Float getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 流量包总量，单位GB
     * @param TotalAmount 流量包总量，单位GB
     */
    public void setTotalAmount(Float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 流量包剩余量，单位GB 
     * @return RemainingAmount 流量包剩余量，单位GB
     */
    public Float getRemainingAmount() {
        return this.RemainingAmount;
    }

    /**
     * Set 流量包剩余量，单位GB
     * @param RemainingAmount 流量包剩余量，单位GB
     */
    public void setRemainingAmount(Float RemainingAmount) {
        this.RemainingAmount = RemainingAmount;
    }

    /**
     * Get 流量包状态，可能的值有: AVAILABLE-可用状态， EXPIRED-已过期， EXHAUSTED-已用完， REFUNDED-已退还， DELETED-已删除 
     * @return Status 流量包状态，可能的值有: AVAILABLE-可用状态， EXPIRED-已过期， EXHAUSTED-已用完， REFUNDED-已退还， DELETED-已删除
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 流量包状态，可能的值有: AVAILABLE-可用状态， EXPIRED-已过期， EXHAUSTED-已用完， REFUNDED-已退还， DELETED-已删除
     * @param Status 流量包状态，可能的值有: AVAILABLE-可用状态， EXPIRED-已过期， EXHAUSTED-已用完， REFUNDED-已退还， DELETED-已删除
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 流量包创建时间 
     * @return CreatedTime 流量包创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 流量包创建时间
     * @param CreatedTime 流量包创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 流量包截止时间 
     * @return Deadline 流量包截止时间
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 流量包截止时间
     * @param Deadline 流量包截止时间
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 已使用的流量，单位GB 
     * @return UsedAmount 已使用的流量，单位GB
     */
    public Float getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 已使用的流量，单位GB
     * @param UsedAmount 已使用的流量，单位GB
     */
    public void setUsedAmount(Float UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get 流量包标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 流量包标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 流量包标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 流量包标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 区分闲时流量包与全时流量包 
     * @return DeductType 区分闲时流量包与全时流量包
     */
    public String getDeductType() {
        return this.DeductType;
    }

    /**
     * Set 区分闲时流量包与全时流量包
     * @param DeductType 区分闲时流量包与全时流量包
     */
    public void setDeductType(String DeductType) {
        this.DeductType = DeductType;
    }

    public TrafficPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPackage(TrafficPackage source) {
        if (source.TrafficPackageId != null) {
            this.TrafficPackageId = new String(source.TrafficPackageId);
        }
        if (source.TrafficPackageName != null) {
            this.TrafficPackageName = new String(source.TrafficPackageName);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Float(source.TotalAmount);
        }
        if (source.RemainingAmount != null) {
            this.RemainingAmount = new Float(source.RemainingAmount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new Float(source.UsedAmount);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.DeductType != null) {
            this.DeductType = new String(source.DeductType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficPackageId", this.TrafficPackageId);
        this.setParamSimple(map, prefix + "TrafficPackageName", this.TrafficPackageName);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "RemainingAmount", this.RemainingAmount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "DeductType", this.DeductType);

    }
}

