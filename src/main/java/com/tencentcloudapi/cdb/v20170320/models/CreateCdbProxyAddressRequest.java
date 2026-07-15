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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCdbProxyAddressRequest extends AbstractModel {

    /**
    * <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>权重分配模式，<br>系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>是否开启延迟剔除，取值：&quot;true&quot; | &quot;false&quot;</p>
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * <p>最小保留数量，最小取值：0</p>
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * <p>延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。</p>
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * <p>是否开启故障转移，取值：&quot;true&quot; | &quot;false&quot;</p>
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * <p>是否自动添加RO，取值：&quot;true&quot; | &quot;false&quot;</p>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * <p>是否是只读，取值：&quot;true&quot; | &quot;false&quot;</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>读写权重分配</p>
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
    * <p>私有网络 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>私有子网 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>是否开启连接池。默认关闭。<br>注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。</p>
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * <p>描述</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>端口。默认值3306。</p>
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * <p>安全组</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。</p>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>是否开启自适应负载均衡。默认关闭。</p>
    */
    @SerializedName("AutoLoadBalance")
    @Expose
    private Boolean AutoLoadBalance;

    /**
    * <p>接入模式。</p><p>枚举值：</p><ul><li>nearBy： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul><p>默认值：nearBy</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
     * Get <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p> 
     * @return ProxyGroupId <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     * @param ProxyGroupId <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>权重分配模式，<br>系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p> 
     * @return WeightMode <p>权重分配模式，<br>系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>权重分配模式，<br>系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p>
     * @param WeightMode <p>权重分配模式，<br>系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>是否开启延迟剔除，取值：&quot;true&quot; | &quot;false&quot;</p> 
     * @return IsKickOut <p>是否开启延迟剔除，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set <p>是否开启延迟剔除，取值：&quot;true&quot; | &quot;false&quot;</p>
     * @param IsKickOut <p>是否开启延迟剔除，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get <p>最小保留数量，最小取值：0</p> 
     * @return MinCount <p>最小保留数量，最小取值：0</p>
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set <p>最小保留数量，最小取值：0</p>
     * @param MinCount <p>最小保留数量，最小取值：0</p>
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get <p>延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。</p> 
     * @return MaxDelay <p>延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。</p>
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set <p>延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。</p>
     * @param MaxDelay <p>延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。</p>
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get <p>是否开启故障转移，取值：&quot;true&quot; | &quot;false&quot;</p> 
     * @return FailOver <p>是否开启故障转移，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>是否开启故障转移，取值：&quot;true&quot; | &quot;false&quot;</p>
     * @param FailOver <p>是否开启故障转移，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>是否自动添加RO，取值：&quot;true&quot; | &quot;false&quot;</p> 
     * @return AutoAddRo <p>是否自动添加RO，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>是否自动添加RO，取值：&quot;true&quot; | &quot;false&quot;</p>
     * @param AutoAddRo <p>是否自动添加RO，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>是否是只读，取值：&quot;true&quot; | &quot;false&quot;</p> 
     * @return ReadOnly <p>是否是只读，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>是否是只读，取值：&quot;true&quot; | &quot;false&quot;</p>
     * @param ReadOnly <p>是否是只读，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;</p> 
     * @return TransSplit <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;</p>
     * @param TransSplit <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>读写权重分配</p> 
     * @return ProxyAllocation <p>读写权重分配</p>
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set <p>读写权重分配</p>
     * @param ProxyAllocation <p>读写权重分配</p>
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    /**
     * Get <p>私有网络 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return UniqVpcId <p>私有网络 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>私有网络 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param UniqVpcId <p>私有网络 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>私有子网 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return UniqSubnetId <p>私有子网 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>私有子网 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param UniqSubnetId <p>私有子网 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>是否开启连接池。默认关闭。<br>注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。</p> 
     * @return ConnectionPool <p>是否开启连接池。默认关闭。<br>注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。</p>
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set <p>是否开启连接池。默认关闭。<br>注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。</p>
     * @param ConnectionPool <p>是否开启连接池。默认关闭。<br>注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。</p>
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get <p>描述</p> 
     * @return Desc <p>描述</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>描述</p>
     * @param Desc <p>描述</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。</p> 
     * @return Vip <p>IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。</p>
     * @param Vip <p>IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>端口。默认值3306。</p> 
     * @return VPort <p>端口。默认值3306。</p>
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set <p>端口。默认值3306。</p>
     * @param VPort <p>端口。默认值3306。</p>
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get <p>安全组</p> 
     * @return SecurityGroup <p>安全组</p>
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set <p>安全组</p>
     * @param SecurityGroup <p>安全组</p>
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get <p>连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。</p> 
     * @return ConnectionPoolType <p>连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。</p>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。</p>
     * @param ConnectionPoolType <p>连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。</p>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>是否开启自适应负载均衡。默认关闭。</p> 
     * @return AutoLoadBalance <p>是否开启自适应负载均衡。默认关闭。</p>
     */
    public Boolean getAutoLoadBalance() {
        return this.AutoLoadBalance;
    }

    /**
     * Set <p>是否开启自适应负载均衡。默认关闭。</p>
     * @param AutoLoadBalance <p>是否开启自适应负载均衡。默认关闭。</p>
     */
    public void setAutoLoadBalance(Boolean AutoLoadBalance) {
        this.AutoLoadBalance = AutoLoadBalance;
    }

    /**
     * Get <p>接入模式。</p><p>枚举值：</p><ul><li>nearBy： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul><p>默认值：nearBy</p> 
     * @return AccessMode <p>接入模式。</p><p>枚举值：</p><ul><li>nearBy： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul><p>默认值：nearBy</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>接入模式。</p><p>枚举值：</p><ul><li>nearBy： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul><p>默认值：nearBy</p>
     * @param AccessMode <p>接入模式。</p><p>枚举值：</p><ul><li>nearBy： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul><p>默认值：nearBy</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    public CreateCdbProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCdbProxyAddressRequest(CreateCdbProxyAddressRequest source) {
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
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.ProxyAllocation != null) {
            this.ProxyAllocation = new ProxyAllocation[source.ProxyAllocation.length];
            for (int i = 0; i < source.ProxyAllocation.length; i++) {
                this.ProxyAllocation[i] = new ProxyAllocation(source.ProxyAllocation[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.AutoLoadBalance != null) {
            this.AutoLoadBalance = new Boolean(source.AutoLoadBalance);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
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
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "AutoLoadBalance", this.AutoLoadBalance);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);

    }
}

