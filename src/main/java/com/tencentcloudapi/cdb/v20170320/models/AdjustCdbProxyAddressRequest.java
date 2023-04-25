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

public class AdjustCdbProxyAddressRequest extends AbstractModel{

    /**
    * 代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 权重分配模式，
系统自动分配："system"， 自定义："custom"
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 是否开启延迟剔除，取值："true" | "false"
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * 最小保留数量，最小取值：0
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * 延迟剔除阈值，最小取值：0
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * 是否开启故障转移，取值："true" | "false"
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * 是否自动添加RO，取值："true" | "false"
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * 是否是只读，取值："true" | "false"
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * 代理组地址ID
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * 是否开启事务分离，取值："true" | "false"
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * 是否开启连接池
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * 读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
     * Get 代理组ID 
     * @return ProxyGroupId 代理组ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 代理组ID
     * @param ProxyGroupId 代理组ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 权重分配模式，
系统自动分配："system"， 自定义："custom" 
     * @return WeightMode 权重分配模式，
系统自动分配："system"， 自定义："custom"
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 权重分配模式，
系统自动分配："system"， 自定义："custom"
     * @param WeightMode 权重分配模式，
系统自动分配："system"， 自定义："custom"
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 是否开启延迟剔除，取值："true" | "false" 
     * @return IsKickOut 是否开启延迟剔除，取值："true" | "false"
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set 是否开启延迟剔除，取值："true" | "false"
     * @param IsKickOut 是否开启延迟剔除，取值："true" | "false"
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get 最小保留数量，最小取值：0 
     * @return MinCount 最小保留数量，最小取值：0
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set 最小保留数量，最小取值：0
     * @param MinCount 最小保留数量，最小取值：0
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get 延迟剔除阈值，最小取值：0 
     * @return MaxDelay 延迟剔除阈值，最小取值：0
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set 延迟剔除阈值，最小取值：0
     * @param MaxDelay 延迟剔除阈值，最小取值：0
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get 是否开启故障转移，取值："true" | "false" 
     * @return FailOver 是否开启故障转移，取值："true" | "false"
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 是否开启故障转移，取值："true" | "false"
     * @param FailOver 是否开启故障转移，取值："true" | "false"
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 是否自动添加RO，取值："true" | "false" 
     * @return AutoAddRo 是否自动添加RO，取值："true" | "false"
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set 是否自动添加RO，取值："true" | "false"
     * @param AutoAddRo 是否自动添加RO，取值："true" | "false"
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get 是否是只读，取值："true" | "false" 
     * @return ReadOnly 是否是只读，取值："true" | "false"
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否是只读，取值："true" | "false"
     * @param ReadOnly 是否是只读，取值："true" | "false"
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

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
     * Get 是否开启事务分离，取值："true" | "false" 
     * @return TransSplit 是否开启事务分离，取值："true" | "false"
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set 是否开启事务分离，取值："true" | "false"
     * @param TransSplit 是否开启事务分离，取值："true" | "false"
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get 是否开启连接池 
     * @return ConnectionPool 是否开启连接池
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set 是否开启连接池
     * @param ConnectionPool 是否开启连接池
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get 读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。 
     * @return ProxyAllocation 读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set 读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。
     * @param ProxyAllocation 读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    public AdjustCdbProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustCdbProxyAddressRequest(AdjustCdbProxyAddressRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
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
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
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
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);

    }
}

