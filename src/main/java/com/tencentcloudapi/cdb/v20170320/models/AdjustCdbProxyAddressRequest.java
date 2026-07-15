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

public class AdjustCdbProxyAddressRequest extends AbstractModel {

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
    * <p>最小保留数量，最小取值：0。<br>说明：当 IsKickOut 为 true 时才有效。</p>
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * <p>延迟剔除阈值，最小取值：1，取值范围：[1,10000]，整数。</p>
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
    * <p>代理组地址 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;，默认值 false。</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>是否开启连接池。默认关闭。<br>注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。</p>
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * <p>读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。</p>
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
    * <p>是否开启自适应负载均衡。默认关闭。</p>
    */
    @SerializedName("AutoLoadBalance")
    @Expose
    private Boolean AutoLoadBalance;

    /**
    * <p>访问模式。</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>是否将libra节点当作普通RO节点</p>
    */
    @SerializedName("ApNodeAsRoNode")
    @Expose
    private Boolean ApNodeAsRoNode;

    /**
    * <p>libra节点故障，是否转发给其他节点</p>
    */
    @SerializedName("ApQueryToOtherNode")
    @Expose
    private Boolean ApQueryToOtherNode;

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
     * Get <p>最小保留数量，最小取值：0。<br>说明：当 IsKickOut 为 true 时才有效。</p> 
     * @return MinCount <p>最小保留数量，最小取值：0。<br>说明：当 IsKickOut 为 true 时才有效。</p>
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set <p>最小保留数量，最小取值：0。<br>说明：当 IsKickOut 为 true 时才有效。</p>
     * @param MinCount <p>最小保留数量，最小取值：0。<br>说明：当 IsKickOut 为 true 时才有效。</p>
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get <p>延迟剔除阈值，最小取值：1，取值范围：[1,10000]，整数。</p> 
     * @return MaxDelay <p>延迟剔除阈值，最小取值：1，取值范围：[1,10000]，整数。</p>
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set <p>延迟剔除阈值，最小取值：1，取值范围：[1,10000]，整数。</p>
     * @param MaxDelay <p>延迟剔除阈值，最小取值：1，取值范围：[1,10000]，整数。</p>
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
     * Get <p>代理组地址 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p> 
     * @return ProxyAddressId <p>代理组地址 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     */
    public String getProxyAddressId() {
        return this.ProxyAddressId;
    }

    /**
     * Set <p>代理组地址 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     * @param ProxyAddressId <p>代理组地址 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     */
    public void setProxyAddressId(String ProxyAddressId) {
        this.ProxyAddressId = ProxyAddressId;
    }

    /**
     * Get <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;，默认值 false。</p> 
     * @return TransSplit <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;，默认值 false。</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;，默认值 false。</p>
     * @param TransSplit <p>是否开启事务分离，取值：&quot;true&quot; | &quot;false&quot;，默认值 false。</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
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
     * Get <p>读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。</p> 
     * @return ProxyAllocation <p>读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。</p>
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set <p>读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。</p>
     * @param ProxyAllocation <p>读写权重分配。如果 WeightMode 传的是 system ，则传入的权重不生效，由系统分配默认权重。</p>
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
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
     * Get <p>访问模式。</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul> 
     * @return AccessMode <p>访问模式。</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>访问模式。</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul>
     * @param AccessMode <p>访问模式。</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li><li>direct_nearby： 纯网络转发就近访问</li><li>direct_balance： 纯网络转发均衡分配</li></ul>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>是否将libra节点当作普通RO节点</p> 
     * @return ApNodeAsRoNode <p>是否将libra节点当作普通RO节点</p>
     */
    public Boolean getApNodeAsRoNode() {
        return this.ApNodeAsRoNode;
    }

    /**
     * Set <p>是否将libra节点当作普通RO节点</p>
     * @param ApNodeAsRoNode <p>是否将libra节点当作普通RO节点</p>
     */
    public void setApNodeAsRoNode(Boolean ApNodeAsRoNode) {
        this.ApNodeAsRoNode = ApNodeAsRoNode;
    }

    /**
     * Get <p>libra节点故障，是否转发给其他节点</p> 
     * @return ApQueryToOtherNode <p>libra节点故障，是否转发给其他节点</p>
     */
    public Boolean getApQueryToOtherNode() {
        return this.ApQueryToOtherNode;
    }

    /**
     * Set <p>libra节点故障，是否转发给其他节点</p>
     * @param ApQueryToOtherNode <p>libra节点故障，是否转发给其他节点</p>
     */
    public void setApQueryToOtherNode(Boolean ApQueryToOtherNode) {
        this.ApQueryToOtherNode = ApQueryToOtherNode;
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
        if (source.AutoLoadBalance != null) {
            this.AutoLoadBalance = new Boolean(source.AutoLoadBalance);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.ApNodeAsRoNode != null) {
            this.ApNodeAsRoNode = new Boolean(source.ApNodeAsRoNode);
        }
        if (source.ApQueryToOtherNode != null) {
            this.ApQueryToOtherNode = new Boolean(source.ApQueryToOtherNode);
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
        this.setParamSimple(map, prefix + "AutoLoadBalance", this.AutoLoadBalance);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "ApNodeAsRoNode", this.ApNodeAsRoNode);
        this.setParamSimple(map, prefix + "ApQueryToOtherNode", this.ApQueryToOtherNode);

    }
}

