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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateLinkInfo extends AbstractModel {

    /**
    * <p>私有连接所在的VPCID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有连接所在的子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>HTTP内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpAddr")
    @Expose
    private String [] InnerHttpAddr;

    /**
    * <p>HTTPS内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpsAddr")
    @Expose
    private String [] InnerHttpsAddr;

    /**
    * <p>私有连接状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>grpc内网调用地址</p>
    */
    @SerializedName("InnerGrpcAddr")
    @Expose
    private String [] InnerGrpcAddr;

    /**
    * <p>创建者 UIN</p>
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>子用户名称</p>
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
     * Get <p>私有连接所在的VPCID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>私有连接所在的VPCID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有连接所在的VPCID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>私有连接所在的VPCID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有连接所在的子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId <p>私有连接所在的子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有连接所在的子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId <p>私有连接所在的子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>HTTP内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpAddr <p>HTTP内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInnerHttpAddr() {
        return this.InnerHttpAddr;
    }

    /**
     * Set <p>HTTP内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpAddr <p>HTTP内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpAddr(String [] InnerHttpAddr) {
        this.InnerHttpAddr = InnerHttpAddr;
    }

    /**
     * Get <p>HTTPS内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpsAddr <p>HTTPS内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInnerHttpsAddr() {
        return this.InnerHttpsAddr;
    }

    /**
     * Set <p>HTTPS内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpsAddr <p>HTTPS内网调用地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpsAddr(String [] InnerHttpsAddr) {
        this.InnerHttpsAddr = InnerHttpsAddr;
    }

    /**
     * Get <p>私有连接状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State <p>私有连接状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>私有连接状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param State <p>私有连接状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>grpc内网调用地址</p> 
     * @return InnerGrpcAddr <p>grpc内网调用地址</p>
     */
    public String [] getInnerGrpcAddr() {
        return this.InnerGrpcAddr;
    }

    /**
     * Set <p>grpc内网调用地址</p>
     * @param InnerGrpcAddr <p>grpc内网调用地址</p>
     */
    public void setInnerGrpcAddr(String [] InnerGrpcAddr) {
        this.InnerGrpcAddr = InnerGrpcAddr;
    }

    /**
     * Get <p>创建者 UIN</p> 
     * @return CreatedBy <p>创建者 UIN</p>
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set <p>创建者 UIN</p>
     * @param CreatedBy <p>创建者 UIN</p>
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>子用户名称</p> 
     * @return SubUinName <p>子用户名称</p>
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>子用户名称</p>
     * @param SubUinName <p>子用户名称</p>
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
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
        if (source.InnerGrpcAddr != null) {
            this.InnerGrpcAddr = new String[source.InnerGrpcAddr.length];
            for (int i = 0; i < source.InnerGrpcAddr.length; i++) {
                this.InnerGrpcAddr[i] = new String(source.InnerGrpcAddr[i]);
            }
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
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
        this.setParamArraySimple(map, prefix + "InnerGrpcAddr.", this.InnerGrpcAddr);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);

    }
}

