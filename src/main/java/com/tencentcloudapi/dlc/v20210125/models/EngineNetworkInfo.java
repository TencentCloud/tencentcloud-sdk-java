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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineNetworkInfo extends AbstractModel {

    /**
    * 引擎网络名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineNetworkName")
    @Expose
    private String EngineNetworkName;

    /**
    * 引擎网络状态，0--初始化，2--可用，-1--已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineNetworkState")
    @Expose
    private Long EngineNetworkState;

    /**
    * 引擎网络cidr
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineNetworkCidr")
    @Expose
    private String EngineNetworkCidr;

    /**
    * 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineNetworkId")
    @Expose
    private String EngineNetworkId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 私有连接个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateLinkNumber")
    @Expose
    private Long PrivateLinkNumber;

    /**
    * 计算引擎个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineNumber")
    @Expose
    private Long EngineNumber;

    /**
    * 网关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GateWayInfo")
    @Expose
    private GatewayInfo [] GateWayInfo;

    /**
     * Get 引擎网络名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineNetworkName 引擎网络名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineNetworkName() {
        return this.EngineNetworkName;
    }

    /**
     * Set 引擎网络名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineNetworkName 引擎网络名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineNetworkName(String EngineNetworkName) {
        this.EngineNetworkName = EngineNetworkName;
    }

    /**
     * Get 引擎网络状态，0--初始化，2--可用，-1--已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineNetworkState 引擎网络状态，0--初始化，2--可用，-1--已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEngineNetworkState() {
        return this.EngineNetworkState;
    }

    /**
     * Set 引擎网络状态，0--初始化，2--可用，-1--已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineNetworkState 引擎网络状态，0--初始化，2--可用，-1--已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineNetworkState(Long EngineNetworkState) {
        this.EngineNetworkState = EngineNetworkState;
    }

    /**
     * Get 引擎网络cidr
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineNetworkCidr 引擎网络cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineNetworkCidr() {
        return this.EngineNetworkCidr;
    }

    /**
     * Set 引擎网络cidr
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineNetworkCidr 引擎网络cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineNetworkCidr(String EngineNetworkCidr) {
        this.EngineNetworkCidr = EngineNetworkCidr;
    }

    /**
     * Get 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineNetworkId 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineNetworkId() {
        return this.EngineNetworkId;
    }

    /**
     * Set 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineNetworkId 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineNetworkId(String EngineNetworkId) {
        this.EngineNetworkId = EngineNetworkId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 私有连接个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateLinkNumber 私有连接个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPrivateLinkNumber() {
        return this.PrivateLinkNumber;
    }

    /**
     * Set 私有连接个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateLinkNumber 私有连接个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateLinkNumber(Long PrivateLinkNumber) {
        this.PrivateLinkNumber = PrivateLinkNumber;
    }

    /**
     * Get 计算引擎个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineNumber 计算引擎个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEngineNumber() {
        return this.EngineNumber;
    }

    /**
     * Set 计算引擎个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineNumber 计算引擎个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineNumber(Long EngineNumber) {
        this.EngineNumber = EngineNumber;
    }

    /**
     * Get 网关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GateWayInfo 网关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayInfo [] getGateWayInfo() {
        return this.GateWayInfo;
    }

    /**
     * Set 网关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GateWayInfo 网关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGateWayInfo(GatewayInfo [] GateWayInfo) {
        this.GateWayInfo = GateWayInfo;
    }

    public EngineNetworkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineNetworkInfo(EngineNetworkInfo source) {
        if (source.EngineNetworkName != null) {
            this.EngineNetworkName = new String(source.EngineNetworkName);
        }
        if (source.EngineNetworkState != null) {
            this.EngineNetworkState = new Long(source.EngineNetworkState);
        }
        if (source.EngineNetworkCidr != null) {
            this.EngineNetworkCidr = new String(source.EngineNetworkCidr);
        }
        if (source.EngineNetworkId != null) {
            this.EngineNetworkId = new String(source.EngineNetworkId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.PrivateLinkNumber != null) {
            this.PrivateLinkNumber = new Long(source.PrivateLinkNumber);
        }
        if (source.EngineNumber != null) {
            this.EngineNumber = new Long(source.EngineNumber);
        }
        if (source.GateWayInfo != null) {
            this.GateWayInfo = new GatewayInfo[source.GateWayInfo.length];
            for (int i = 0; i < source.GateWayInfo.length; i++) {
                this.GateWayInfo[i] = new GatewayInfo(source.GateWayInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineNetworkName", this.EngineNetworkName);
        this.setParamSimple(map, prefix + "EngineNetworkState", this.EngineNetworkState);
        this.setParamSimple(map, prefix + "EngineNetworkCidr", this.EngineNetworkCidr);
        this.setParamSimple(map, prefix + "EngineNetworkId", this.EngineNetworkId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PrivateLinkNumber", this.PrivateLinkNumber);
        this.setParamSimple(map, prefix + "EngineNumber", this.EngineNumber);
        this.setParamArrayObj(map, prefix + "GateWayInfo.", this.GateWayInfo);

    }
}

