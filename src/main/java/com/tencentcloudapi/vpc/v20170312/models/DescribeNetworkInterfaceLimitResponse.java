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

public class DescribeNetworkInterfaceLimitResponse extends AbstractModel{

    /**
    * 标准型弹性网卡配额
    */
    @SerializedName("EniQuantity")
    @Expose
    private Long EniQuantity;

    /**
    * 每个标准型弹性网卡可以分配的IP配额
    */
    @SerializedName("EniPrivateIpAddressQuantity")
    @Expose
    private Long EniPrivateIpAddressQuantity;

    /**
    * 扩展型网卡配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtendEniQuantity")
    @Expose
    private Long ExtendEniQuantity;

    /**
    * 每个扩展型弹性网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtendEniPrivateIpAddressQuantity")
    @Expose
    private Long ExtendEniPrivateIpAddressQuantity;

    /**
    * 中继网卡配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubEniQuantity")
    @Expose
    private Long SubEniQuantity;

    /**
    * 每个中继网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubEniPrivateIpAddressQuantity")
    @Expose
    private Long SubEniPrivateIpAddressQuantity;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 标准型弹性网卡配额 
     * @return EniQuantity 标准型弹性网卡配额
     */
    public Long getEniQuantity() {
        return this.EniQuantity;
    }

    /**
     * Set 标准型弹性网卡配额
     * @param EniQuantity 标准型弹性网卡配额
     */
    public void setEniQuantity(Long EniQuantity) {
        this.EniQuantity = EniQuantity;
    }

    /**
     * Get 每个标准型弹性网卡可以分配的IP配额 
     * @return EniPrivateIpAddressQuantity 每个标准型弹性网卡可以分配的IP配额
     */
    public Long getEniPrivateIpAddressQuantity() {
        return this.EniPrivateIpAddressQuantity;
    }

    /**
     * Set 每个标准型弹性网卡可以分配的IP配额
     * @param EniPrivateIpAddressQuantity 每个标准型弹性网卡可以分配的IP配额
     */
    public void setEniPrivateIpAddressQuantity(Long EniPrivateIpAddressQuantity) {
        this.EniPrivateIpAddressQuantity = EniPrivateIpAddressQuantity;
    }

    /**
     * Get 扩展型网卡配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtendEniQuantity 扩展型网卡配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExtendEniQuantity() {
        return this.ExtendEniQuantity;
    }

    /**
     * Set 扩展型网卡配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtendEniQuantity 扩展型网卡配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtendEniQuantity(Long ExtendEniQuantity) {
        this.ExtendEniQuantity = ExtendEniQuantity;
    }

    /**
     * Get 每个扩展型弹性网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtendEniPrivateIpAddressQuantity 每个扩展型弹性网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExtendEniPrivateIpAddressQuantity() {
        return this.ExtendEniPrivateIpAddressQuantity;
    }

    /**
     * Set 每个扩展型弹性网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtendEniPrivateIpAddressQuantity 每个扩展型弹性网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtendEniPrivateIpAddressQuantity(Long ExtendEniPrivateIpAddressQuantity) {
        this.ExtendEniPrivateIpAddressQuantity = ExtendEniPrivateIpAddressQuantity;
    }

    /**
     * Get 中继网卡配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubEniQuantity 中继网卡配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubEniQuantity() {
        return this.SubEniQuantity;
    }

    /**
     * Set 中继网卡配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubEniQuantity 中继网卡配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubEniQuantity(Long SubEniQuantity) {
        this.SubEniQuantity = SubEniQuantity;
    }

    /**
     * Get 每个中继网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubEniPrivateIpAddressQuantity 每个中继网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubEniPrivateIpAddressQuantity() {
        return this.SubEniPrivateIpAddressQuantity;
    }

    /**
     * Set 每个中继网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubEniPrivateIpAddressQuantity 每个中继网卡可以分配的IP配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubEniPrivateIpAddressQuantity(Long SubEniPrivateIpAddressQuantity) {
        this.SubEniPrivateIpAddressQuantity = SubEniPrivateIpAddressQuantity;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNetworkInterfaceLimitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkInterfaceLimitResponse(DescribeNetworkInterfaceLimitResponse source) {
        if (source.EniQuantity != null) {
            this.EniQuantity = new Long(source.EniQuantity);
        }
        if (source.EniPrivateIpAddressQuantity != null) {
            this.EniPrivateIpAddressQuantity = new Long(source.EniPrivateIpAddressQuantity);
        }
        if (source.ExtendEniQuantity != null) {
            this.ExtendEniQuantity = new Long(source.ExtendEniQuantity);
        }
        if (source.ExtendEniPrivateIpAddressQuantity != null) {
            this.ExtendEniPrivateIpAddressQuantity = new Long(source.ExtendEniPrivateIpAddressQuantity);
        }
        if (source.SubEniQuantity != null) {
            this.SubEniQuantity = new Long(source.SubEniQuantity);
        }
        if (source.SubEniPrivateIpAddressQuantity != null) {
            this.SubEniPrivateIpAddressQuantity = new Long(source.SubEniPrivateIpAddressQuantity);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EniQuantity", this.EniQuantity);
        this.setParamSimple(map, prefix + "EniPrivateIpAddressQuantity", this.EniPrivateIpAddressQuantity);
        this.setParamSimple(map, prefix + "ExtendEniQuantity", this.ExtendEniQuantity);
        this.setParamSimple(map, prefix + "ExtendEniPrivateIpAddressQuantity", this.ExtendEniPrivateIpAddressQuantity);
        this.setParamSimple(map, prefix + "SubEniQuantity", this.SubEniQuantity);
        this.setParamSimple(map, prefix + "SubEniPrivateIpAddressQuantity", this.SubEniPrivateIpAddressQuantity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

