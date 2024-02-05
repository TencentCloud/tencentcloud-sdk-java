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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateLinkInfo extends AbstractModel {

    /**
    * 私有连接所在的VPCID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有连接所在的子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * HTTP内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpAddr")
    @Expose
    private String [] InnerHttpAddr;

    /**
    * HTTPS内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpsAddr")
    @Expose
    private String [] InnerHttpsAddr;

    /**
    * 私有连接状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get 私有连接所在的VPCID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有连接所在的VPCID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有连接所在的VPCID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有连接所在的VPCID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有连接所在的子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 私有连接所在的子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有连接所在的子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 私有连接所在的子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get HTTP内网调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpAddr HTTP内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInnerHttpAddr() {
        return this.InnerHttpAddr;
    }

    /**
     * Set HTTP内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpAddr HTTP内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpAddr(String [] InnerHttpAddr) {
        this.InnerHttpAddr = InnerHttpAddr;
    }

    /**
     * Get HTTPS内网调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpsAddr HTTPS内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInnerHttpsAddr() {
        return this.InnerHttpsAddr;
    }

    /**
     * Set HTTPS内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpsAddr HTTPS内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpsAddr(String [] InnerHttpsAddr) {
        this.InnerHttpsAddr = InnerHttpsAddr;
    }

    /**
     * Get 私有连接状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 私有连接状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 私有连接状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 私有连接状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    public PrivateLinkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateLinkInfo(PrivateLinkInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InnerHttpAddr != null) {
            this.InnerHttpAddr = new String[source.InnerHttpAddr.length];
            for (int i = 0; i < source.InnerHttpAddr.length; i++) {
                this.InnerHttpAddr[i] = new String(source.InnerHttpAddr[i]);
            }
        }
        if (source.InnerHttpsAddr != null) {
            this.InnerHttpsAddr = new String[source.InnerHttpsAddr.length];
            for (int i = 0; i < source.InnerHttpsAddr.length; i++) {
                this.InnerHttpsAddr[i] = new String(source.InnerHttpsAddr[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "InnerHttpAddr.", this.InnerHttpAddr);
        this.setParamArraySimple(map, prefix + "InnerHttpsAddr.", this.InnerHttpsAddr);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

