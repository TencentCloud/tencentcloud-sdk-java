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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyAddress extends AbstractModel{

    /**
    * 代理组地址ID
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * 私有网络ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有子网ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * IP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 是否开启延迟剔除，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * 最小保留数量，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * 延迟剔除阈值，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * 是否自动添加RO，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * 是否是只读，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * 是否开启事务分离
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * 是否开启连接池
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 实例读权重分配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
     * Get 代理组地址ID 
     * @return ProxyAddressId 代理组地址ID
     */
    public String getProxyAddressId() {
        return this.ProxyAddressId;
    }

    /**
     * Set 代理组地址ID
     * @param ProxyAddressId 代理组地址ID
     */
    public void setProxyAddressId(String ProxyAddressId) {
        this.ProxyAddressId = ProxyAddressId;
    }

    /**
     * Get 私有网络ID 
     * @return UniqVpcId 私有网络ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络ID
     * @param UniqVpcId 私有网络ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有子网ID 
     * @return UniqSubnetId 私有子网ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有子网ID
     * @param UniqSubnetId 私有子网ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get IP地址 
     * @return Vip IP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP地址
     * @param Vip IP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 端口 
     * @return VPort 端口
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 端口
     * @param VPort 端口
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeightMode 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeightMode 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 是否开启延迟剔除，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsKickOut 是否开启延迟剔除，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set 是否开启延迟剔除，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsKickOut 是否开启延迟剔除，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get 最小保留数量，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinCount 最小保留数量，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set 最小保留数量，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinCount 最小保留数量，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get 延迟剔除阈值，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDelay 延迟剔除阈值，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set 延迟剔除阈值，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDelay 延迟剔除阈值，最小取值：0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get 是否自动添加RO，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoAddRo 是否自动添加RO，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set 是否自动添加RO，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoAddRo 是否自动添加RO，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get 是否是只读，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnly 是否是只读，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否是只读，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnly 是否是只读，取值："true" | "false"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 是否开启事务分离
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransSplit 是否开启事务分离
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set 是否开启事务分离
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransSplit 是否开启事务分离
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailOver 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailOver 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 是否开启连接池
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionPool 是否开启连接池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set 是否开启连接池
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionPool 是否开启连接池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 实例读权重分配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyAllocation 实例读权重分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set 实例读权重分配
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyAllocation 实例读权重分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    public ProxyAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyAddress(ProxyAddress source) {
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.IsKickOut != null) {
            this.IsKickOut = new Boolean(source.IsKickOut);
        }
        if (source.MinCount != null) {
            this.MinCount = new Long(source.MinCount);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ProxyAllocation != null) {
            this.ProxyAllocation = new ProxyAllocation[source.ProxyAllocation.length];
            for (int i = 0; i < source.ProxyAllocation.length; i++) {
                this.ProxyAllocation[i] = new ProxyAllocation(source.ProxyAllocation[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);

    }
}

