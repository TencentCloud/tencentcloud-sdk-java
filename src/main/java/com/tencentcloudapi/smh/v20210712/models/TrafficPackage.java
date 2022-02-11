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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficPackage extends AbstractModel{

    /**
    * 流量资源包所抵扣的实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 流量资源包来源类型，0 为付费购买，1 为赠送。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 总流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 总流量，单位为 GB
    */
    @SerializedName("SizeGB")
    @Expose
    private Long SizeGB;

    /**
    * 剩余流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("Remain")
    @Expose
    private String Remain;

    /**
    * 已使用流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("Used")
    @Expose
    private String Used;

    /**
    * 已使用百分比，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("UsedPercentage")
    @Expose
    private String UsedPercentage;

    /**
    * 生效时间，即流量资源包的订购时间
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * 过期时间，即所抵扣的实例的过期时间。如果流量资源包所抵扣的实例为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 流量资源包所抵扣的实例 ID 
     * @return InstanceId 流量资源包所抵扣的实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 流量资源包所抵扣的实例 ID
     * @param InstanceId 流量资源包所抵扣的实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 流量资源包来源类型，0 为付费购买，1 为赠送。 
     * @return Type 流量资源包来源类型，0 为付费购买，1 为赠送。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 流量资源包来源类型，0 为付费购买，1 为赠送。
     * @param Type 流量资源包来源类型，0 为付费购买，1 为赠送。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 总流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。 
     * @return Size 总流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 总流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     * @param Size 总流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 总流量，单位为 GB 
     * @return SizeGB 总流量，单位为 GB
     */
    public Long getSizeGB() {
        return this.SizeGB;
    }

    /**
     * Set 总流量，单位为 GB
     * @param SizeGB 总流量，单位为 GB
     */
    public void setSizeGB(Long SizeGB) {
        this.SizeGB = SizeGB;
    }

    /**
     * Get 剩余流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。 
     * @return Remain 剩余流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getRemain() {
        return this.Remain;
    }

    /**
     * Set 剩余流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     * @param Remain 剩余流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setRemain(String Remain) {
        this.Remain = Remain;
    }

    /**
     * Get 已使用流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。 
     * @return Used 已使用流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getUsed() {
        return this.Used;
    }

    /**
     * Set 已使用流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     * @param Used 已使用流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setUsed(String Used) {
        this.Used = Used;
    }

    /**
     * Get 已使用百分比，由于数字类型精度限制，该字段为 String 类型。 
     * @return UsedPercentage 已使用百分比，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getUsedPercentage() {
        return this.UsedPercentage;
    }

    /**
     * Set 已使用百分比，由于数字类型精度限制，该字段为 String 类型。
     * @param UsedPercentage 已使用百分比，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setUsedPercentage(String UsedPercentage) {
        this.UsedPercentage = UsedPercentage;
    }

    /**
     * Get 生效时间，即流量资源包的订购时间 
     * @return EffectiveTime 生效时间，即流量资源包的订购时间
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 生效时间，即流量资源包的订购时间
     * @param EffectiveTime 生效时间，即流量资源包的订购时间
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 过期时间，即所抵扣的实例的过期时间。如果流量资源包所抵扣的实例为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间，即所抵扣的实例的过期时间。如果流量资源包所抵扣的实例为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，即所抵扣的实例的过期时间。如果流量资源包所抵扣的实例为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间，即所抵扣的实例的过期时间。如果流量资源包所抵扣的实例为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public TrafficPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPackage(TrafficPackage source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.SizeGB != null) {
            this.SizeGB = new Long(source.SizeGB);
        }
        if (source.Remain != null) {
            this.Remain = new String(source.Remain);
        }
        if (source.Used != null) {
            this.Used = new String(source.Used);
        }
        if (source.UsedPercentage != null) {
            this.UsedPercentage = new String(source.UsedPercentage);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SizeGB", this.SizeGB);
        this.setParamSimple(map, prefix + "Remain", this.Remain);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "UsedPercentage", this.UsedPercentage);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

