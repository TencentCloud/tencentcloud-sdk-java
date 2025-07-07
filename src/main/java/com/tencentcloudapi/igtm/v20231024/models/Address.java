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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel {

    /**
    * 地址值：只支持ipv4、ipv6和域名格式；
不支持回环地址、保留地址、内网地址与腾讯保留网段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Addr")
    @Expose
    private String Addr;

    /**
    * 是否启用:DISABLED不启用；ENABLED启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEnable")
    @Expose
    private String IsEnable;

    /**
    * 地址id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressId")
    @Expose
    private Long AddressId;

    /**
    * 地址名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * OK正常，DOWN故障，WARN风险，UNKNOWN探测中，UNMONITORED未知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 权重，流量策略为WEIGHT时，必填；范围1-100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
     * Get 地址值：只支持ipv4、ipv6和域名格式；
不支持回环地址、保留地址、内网地址与腾讯保留网段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Addr 地址值：只支持ipv4、ipv6和域名格式；
不支持回环地址、保留地址、内网地址与腾讯保留网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddr() {
        return this.Addr;
    }

    /**
     * Set 地址值：只支持ipv4、ipv6和域名格式；
不支持回环地址、保留地址、内网地址与腾讯保留网段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Addr 地址值：只支持ipv4、ipv6和域名格式；
不支持回环地址、保留地址、内网地址与腾讯保留网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    /**
     * Get 是否启用:DISABLED不启用；ENABLED启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEnable 是否启用:DISABLED不启用；ENABLED启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set 是否启用:DISABLED不启用；ENABLED启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEnable 是否启用:DISABLED不启用；ENABLED启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEnable(String IsEnable) {
        this.IsEnable = IsEnable;
    }

    /**
     * Get 地址id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressId 地址id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAddressId() {
        return this.AddressId;
    }

    /**
     * Set 地址id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressId 地址id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressId(Long AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get 地址名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 地址名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 地址名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 地址名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get OK正常，DOWN故障，WARN风险，UNKNOWN探测中，UNMONITORED未知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status OK正常，DOWN故障，WARN风险，UNKNOWN探测中，UNMONITORED未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set OK正常，DOWN故障，WARN风险，UNKNOWN探测中，UNMONITORED未知
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status OK正常，DOWN故障，WARN风险，UNKNOWN探测中，UNMONITORED未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 权重，流量策略为WEIGHT时，必填；范围1-100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 权重，流量策略为WEIGHT时，必填；范围1-100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重，流量策略为WEIGHT时，必填；范围1-100
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 权重，流量策略为WEIGHT时，必填；范围1-100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedOn 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedOn 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedOn 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedOn 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.Addr != null) {
            this.Addr = new String(source.Addr);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new String(source.IsEnable);
        }
        if (source.AddressId != null) {
            this.AddressId = new Long(source.AddressId);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Addr", this.Addr);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);

    }
}

