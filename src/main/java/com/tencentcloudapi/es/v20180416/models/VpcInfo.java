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

public class VpcInfo extends AbstractModel {

    /**
    * vpcId信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * SubnetId信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VpcUid信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcUid")
    @Expose
    private Long VpcUid;

    /**
    * SubnetUid 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetUid")
    @Expose
    private Long SubnetUid;

    /**
    * 可用ip数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableIpAddressCount")
    @Expose
    private Long AvailableIpAddressCount;

    /**
     * Get vpcId信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpcId信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpcId信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get SubnetId信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId SubnetId信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set SubnetId信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId SubnetId信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VpcUid信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcUid VpcUid信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVpcUid() {
        return this.VpcUid;
    }

    /**
     * Set VpcUid信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcUid VpcUid信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcUid(Long VpcUid) {
        this.VpcUid = VpcUid;
    }

    /**
     * Get SubnetUid 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetUid SubnetUid 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubnetUid() {
        return this.SubnetUid;
    }

    /**
     * Set SubnetUid 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetUid SubnetUid 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetUid(Long SubnetUid) {
        this.SubnetUid = SubnetUid;
    }

    /**
     * Get 可用ip数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableIpAddressCount 可用ip数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailableIpAddressCount() {
        return this.AvailableIpAddressCount;
    }

    /**
     * Set 可用ip数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableIpAddressCount 可用ip数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableIpAddressCount(Long AvailableIpAddressCount) {
        this.AvailableIpAddressCount = AvailableIpAddressCount;
    }

    public VpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcInfo(VpcInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcUid != null) {
            this.VpcUid = new Long(source.VpcUid);
        }
        if (source.SubnetUid != null) {
            this.SubnetUid = new Long(source.SubnetUid);
        }
        if (source.AvailableIpAddressCount != null) {
            this.AvailableIpAddressCount = new Long(source.AvailableIpAddressCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcUid", this.VpcUid);
        this.setParamSimple(map, prefix + "SubnetUid", this.SubnetUid);
        this.setParamSimple(map, prefix + "AvailableIpAddressCount", this.AvailableIpAddressCount);

    }
}

