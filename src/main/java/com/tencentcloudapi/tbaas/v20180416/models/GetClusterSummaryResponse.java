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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetClusterSummaryResponse extends AbstractModel{

    /**
    * 网络通道总数量
    */
    @SerializedName("TotalChannelCount")
    @Expose
    private Long TotalChannelCount;

    /**
    * 当前组织创建的通道数量
    */
    @SerializedName("MyChannelCount")
    @Expose
    private Long MyChannelCount;

    /**
    * 当前组织加入的通道数量
    */
    @SerializedName("JoinChannelCount")
    @Expose
    private Long JoinChannelCount;

    /**
    * 网络节点总数量
    */
    @SerializedName("TotalPeerCount")
    @Expose
    private Long TotalPeerCount;

    /**
    * 当前组织创建的节点数量
    */
    @SerializedName("MyPeerCount")
    @Expose
    private Long MyPeerCount;

    /**
    * 其他组织创建的节点数量
    */
    @SerializedName("OrderCount")
    @Expose
    private Long OrderCount;

    /**
    * 网络组织总数量
    */
    @SerializedName("TotalGroupCount")
    @Expose
    private Long TotalGroupCount;

    /**
    * 当前组织创建的组织数量
    */
    @SerializedName("MyGroupCount")
    @Expose
    private Long MyGroupCount;

    /**
    * 网络智能合约总数量
    */
    @SerializedName("TotalChaincodeCount")
    @Expose
    private Long TotalChaincodeCount;

    /**
    * 最近7天发起的智能合约数量
    */
    @SerializedName("RecentChaincodeCount")
    @Expose
    private Long RecentChaincodeCount;

    /**
    * 当前组织发起的智能合约数量
    */
    @SerializedName("MyChaincodeCount")
    @Expose
    private Long MyChaincodeCount;

    /**
    * 当前组织的证书总数量
    */
    @SerializedName("TotalCertCount")
    @Expose
    private Long TotalCertCount;

    /**
    * 颁发给当前组织的证书数量
    */
    @SerializedName("TlsCertCount")
    @Expose
    private Long TlsCertCount;

    /**
    * 网络背书节点证书数量
    */
    @SerializedName("PeerCertCount")
    @Expose
    private Long PeerCertCount;

    /**
    * 当前组织业务证书数量
    */
    @SerializedName("ClientCertCount")
    @Expose
    private Long ClientCertCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 网络通道总数量 
     * @return TotalChannelCount 网络通道总数量
     */
    public Long getTotalChannelCount() {
        return this.TotalChannelCount;
    }

    /**
     * Set 网络通道总数量
     * @param TotalChannelCount 网络通道总数量
     */
    public void setTotalChannelCount(Long TotalChannelCount) {
        this.TotalChannelCount = TotalChannelCount;
    }

    /**
     * Get 当前组织创建的通道数量 
     * @return MyChannelCount 当前组织创建的通道数量
     */
    public Long getMyChannelCount() {
        return this.MyChannelCount;
    }

    /**
     * Set 当前组织创建的通道数量
     * @param MyChannelCount 当前组织创建的通道数量
     */
    public void setMyChannelCount(Long MyChannelCount) {
        this.MyChannelCount = MyChannelCount;
    }

    /**
     * Get 当前组织加入的通道数量 
     * @return JoinChannelCount 当前组织加入的通道数量
     */
    public Long getJoinChannelCount() {
        return this.JoinChannelCount;
    }

    /**
     * Set 当前组织加入的通道数量
     * @param JoinChannelCount 当前组织加入的通道数量
     */
    public void setJoinChannelCount(Long JoinChannelCount) {
        this.JoinChannelCount = JoinChannelCount;
    }

    /**
     * Get 网络节点总数量 
     * @return TotalPeerCount 网络节点总数量
     */
    public Long getTotalPeerCount() {
        return this.TotalPeerCount;
    }

    /**
     * Set 网络节点总数量
     * @param TotalPeerCount 网络节点总数量
     */
    public void setTotalPeerCount(Long TotalPeerCount) {
        this.TotalPeerCount = TotalPeerCount;
    }

    /**
     * Get 当前组织创建的节点数量 
     * @return MyPeerCount 当前组织创建的节点数量
     */
    public Long getMyPeerCount() {
        return this.MyPeerCount;
    }

    /**
     * Set 当前组织创建的节点数量
     * @param MyPeerCount 当前组织创建的节点数量
     */
    public void setMyPeerCount(Long MyPeerCount) {
        this.MyPeerCount = MyPeerCount;
    }

    /**
     * Get 其他组织创建的节点数量 
     * @return OrderCount 其他组织创建的节点数量
     */
    public Long getOrderCount() {
        return this.OrderCount;
    }

    /**
     * Set 其他组织创建的节点数量
     * @param OrderCount 其他组织创建的节点数量
     */
    public void setOrderCount(Long OrderCount) {
        this.OrderCount = OrderCount;
    }

    /**
     * Get 网络组织总数量 
     * @return TotalGroupCount 网络组织总数量
     */
    public Long getTotalGroupCount() {
        return this.TotalGroupCount;
    }

    /**
     * Set 网络组织总数量
     * @param TotalGroupCount 网络组织总数量
     */
    public void setTotalGroupCount(Long TotalGroupCount) {
        this.TotalGroupCount = TotalGroupCount;
    }

    /**
     * Get 当前组织创建的组织数量 
     * @return MyGroupCount 当前组织创建的组织数量
     */
    public Long getMyGroupCount() {
        return this.MyGroupCount;
    }

    /**
     * Set 当前组织创建的组织数量
     * @param MyGroupCount 当前组织创建的组织数量
     */
    public void setMyGroupCount(Long MyGroupCount) {
        this.MyGroupCount = MyGroupCount;
    }

    /**
     * Get 网络智能合约总数量 
     * @return TotalChaincodeCount 网络智能合约总数量
     */
    public Long getTotalChaincodeCount() {
        return this.TotalChaincodeCount;
    }

    /**
     * Set 网络智能合约总数量
     * @param TotalChaincodeCount 网络智能合约总数量
     */
    public void setTotalChaincodeCount(Long TotalChaincodeCount) {
        this.TotalChaincodeCount = TotalChaincodeCount;
    }

    /**
     * Get 最近7天发起的智能合约数量 
     * @return RecentChaincodeCount 最近7天发起的智能合约数量
     */
    public Long getRecentChaincodeCount() {
        return this.RecentChaincodeCount;
    }

    /**
     * Set 最近7天发起的智能合约数量
     * @param RecentChaincodeCount 最近7天发起的智能合约数量
     */
    public void setRecentChaincodeCount(Long RecentChaincodeCount) {
        this.RecentChaincodeCount = RecentChaincodeCount;
    }

    /**
     * Get 当前组织发起的智能合约数量 
     * @return MyChaincodeCount 当前组织发起的智能合约数量
     */
    public Long getMyChaincodeCount() {
        return this.MyChaincodeCount;
    }

    /**
     * Set 当前组织发起的智能合约数量
     * @param MyChaincodeCount 当前组织发起的智能合约数量
     */
    public void setMyChaincodeCount(Long MyChaincodeCount) {
        this.MyChaincodeCount = MyChaincodeCount;
    }

    /**
     * Get 当前组织的证书总数量 
     * @return TotalCertCount 当前组织的证书总数量
     */
    public Long getTotalCertCount() {
        return this.TotalCertCount;
    }

    /**
     * Set 当前组织的证书总数量
     * @param TotalCertCount 当前组织的证书总数量
     */
    public void setTotalCertCount(Long TotalCertCount) {
        this.TotalCertCount = TotalCertCount;
    }

    /**
     * Get 颁发给当前组织的证书数量 
     * @return TlsCertCount 颁发给当前组织的证书数量
     */
    public Long getTlsCertCount() {
        return this.TlsCertCount;
    }

    /**
     * Set 颁发给当前组织的证书数量
     * @param TlsCertCount 颁发给当前组织的证书数量
     */
    public void setTlsCertCount(Long TlsCertCount) {
        this.TlsCertCount = TlsCertCount;
    }

    /**
     * Get 网络背书节点证书数量 
     * @return PeerCertCount 网络背书节点证书数量
     */
    public Long getPeerCertCount() {
        return this.PeerCertCount;
    }

    /**
     * Set 网络背书节点证书数量
     * @param PeerCertCount 网络背书节点证书数量
     */
    public void setPeerCertCount(Long PeerCertCount) {
        this.PeerCertCount = PeerCertCount;
    }

    /**
     * Get 当前组织业务证书数量 
     * @return ClientCertCount 当前组织业务证书数量
     */
    public Long getClientCertCount() {
        return this.ClientCertCount;
    }

    /**
     * Set 当前组织业务证书数量
     * @param ClientCertCount 当前组织业务证书数量
     */
    public void setClientCertCount(Long ClientCertCount) {
        this.ClientCertCount = ClientCertCount;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalChannelCount", this.TotalChannelCount);
        this.setParamSimple(map, prefix + "MyChannelCount", this.MyChannelCount);
        this.setParamSimple(map, prefix + "JoinChannelCount", this.JoinChannelCount);
        this.setParamSimple(map, prefix + "TotalPeerCount", this.TotalPeerCount);
        this.setParamSimple(map, prefix + "MyPeerCount", this.MyPeerCount);
        this.setParamSimple(map, prefix + "OrderCount", this.OrderCount);
        this.setParamSimple(map, prefix + "TotalGroupCount", this.TotalGroupCount);
        this.setParamSimple(map, prefix + "MyGroupCount", this.MyGroupCount);
        this.setParamSimple(map, prefix + "TotalChaincodeCount", this.TotalChaincodeCount);
        this.setParamSimple(map, prefix + "RecentChaincodeCount", this.RecentChaincodeCount);
        this.setParamSimple(map, prefix + "MyChaincodeCount", this.MyChaincodeCount);
        this.setParamSimple(map, prefix + "TotalCertCount", this.TotalCertCount);
        this.setParamSimple(map, prefix + "TlsCertCount", this.TlsCertCount);
        this.setParamSimple(map, prefix + "PeerCertCount", this.PeerCertCount);
        this.setParamSimple(map, prefix + "ClientCertCount", this.ClientCertCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

