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

public class GetClusterSummaryResponse  extends AbstractModel{

    /**
    * 网络通道总数量
    */
    @SerializedName("TotalChannelCount")
    @Expose
    private Integer TotalChannelCount;

    /**
    * 当前组织创建的通道数量
    */
    @SerializedName("MyChannelCount")
    @Expose
    private Integer MyChannelCount;

    /**
    * 当前组织加入的通道数量
    */
    @SerializedName("JoinChannelCount")
    @Expose
    private Integer JoinChannelCount;

    /**
    * 网络节点总数量
    */
    @SerializedName("TotalPeerCount")
    @Expose
    private Integer TotalPeerCount;

    /**
    * 当前组织创建的节点数量
    */
    @SerializedName("MyPeerCount")
    @Expose
    private Integer MyPeerCount;

    /**
    * 其他组织创建的节点数量
    */
    @SerializedName("OrderCount")
    @Expose
    private Integer OrderCount;

    /**
    * 网络组织总数量
    */
    @SerializedName("TotalGroupCount")
    @Expose
    private Integer TotalGroupCount;

    /**
    * 当前组织创建的组织数量
    */
    @SerializedName("MyGroupCount")
    @Expose
    private Integer MyGroupCount;

    /**
    * 网络智能合约总数量
    */
    @SerializedName("TotalChaincodeCount")
    @Expose
    private Integer TotalChaincodeCount;

    /**
    * 最近7天发起的智能合约数量
    */
    @SerializedName("RecentChaincodeCount")
    @Expose
    private Integer RecentChaincodeCount;

    /**
    * 当前组织发起的智能合约数量
    */
    @SerializedName("MyChaincodeCount")
    @Expose
    private Integer MyChaincodeCount;

    /**
    * 当前组织的证书总数量
    */
    @SerializedName("TotalCertCount")
    @Expose
    private Integer TotalCertCount;

    /**
    * 颁发给当前组织的证书数量
    */
    @SerializedName("TlsCertCount")
    @Expose
    private Integer TlsCertCount;

    /**
    * 网络背书节点证书数量
    */
    @SerializedName("PeerCertCount")
    @Expose
    private Integer PeerCertCount;

    /**
    * 当前组织业务证书数量
    */
    @SerializedName("ClientCertCount")
    @Expose
    private Integer ClientCertCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取网络通道总数量
     * @return TotalChannelCount 网络通道总数量
     */
    public Integer getTotalChannelCount() {
        return this.TotalChannelCount;
    }

    /**
     * 设置网络通道总数量
     * @param TotalChannelCount 网络通道总数量
     */
    public void setTotalChannelCount(Integer TotalChannelCount) {
        this.TotalChannelCount = TotalChannelCount;
    }

    /**
     * 获取当前组织创建的通道数量
     * @return MyChannelCount 当前组织创建的通道数量
     */
    public Integer getMyChannelCount() {
        return this.MyChannelCount;
    }

    /**
     * 设置当前组织创建的通道数量
     * @param MyChannelCount 当前组织创建的通道数量
     */
    public void setMyChannelCount(Integer MyChannelCount) {
        this.MyChannelCount = MyChannelCount;
    }

    /**
     * 获取当前组织加入的通道数量
     * @return JoinChannelCount 当前组织加入的通道数量
     */
    public Integer getJoinChannelCount() {
        return this.JoinChannelCount;
    }

    /**
     * 设置当前组织加入的通道数量
     * @param JoinChannelCount 当前组织加入的通道数量
     */
    public void setJoinChannelCount(Integer JoinChannelCount) {
        this.JoinChannelCount = JoinChannelCount;
    }

    /**
     * 获取网络节点总数量
     * @return TotalPeerCount 网络节点总数量
     */
    public Integer getTotalPeerCount() {
        return this.TotalPeerCount;
    }

    /**
     * 设置网络节点总数量
     * @param TotalPeerCount 网络节点总数量
     */
    public void setTotalPeerCount(Integer TotalPeerCount) {
        this.TotalPeerCount = TotalPeerCount;
    }

    /**
     * 获取当前组织创建的节点数量
     * @return MyPeerCount 当前组织创建的节点数量
     */
    public Integer getMyPeerCount() {
        return this.MyPeerCount;
    }

    /**
     * 设置当前组织创建的节点数量
     * @param MyPeerCount 当前组织创建的节点数量
     */
    public void setMyPeerCount(Integer MyPeerCount) {
        this.MyPeerCount = MyPeerCount;
    }

    /**
     * 获取其他组织创建的节点数量
     * @return OrderCount 其他组织创建的节点数量
     */
    public Integer getOrderCount() {
        return this.OrderCount;
    }

    /**
     * 设置其他组织创建的节点数量
     * @param OrderCount 其他组织创建的节点数量
     */
    public void setOrderCount(Integer OrderCount) {
        this.OrderCount = OrderCount;
    }

    /**
     * 获取网络组织总数量
     * @return TotalGroupCount 网络组织总数量
     */
    public Integer getTotalGroupCount() {
        return this.TotalGroupCount;
    }

    /**
     * 设置网络组织总数量
     * @param TotalGroupCount 网络组织总数量
     */
    public void setTotalGroupCount(Integer TotalGroupCount) {
        this.TotalGroupCount = TotalGroupCount;
    }

    /**
     * 获取当前组织创建的组织数量
     * @return MyGroupCount 当前组织创建的组织数量
     */
    public Integer getMyGroupCount() {
        return this.MyGroupCount;
    }

    /**
     * 设置当前组织创建的组织数量
     * @param MyGroupCount 当前组织创建的组织数量
     */
    public void setMyGroupCount(Integer MyGroupCount) {
        this.MyGroupCount = MyGroupCount;
    }

    /**
     * 获取网络智能合约总数量
     * @return TotalChaincodeCount 网络智能合约总数量
     */
    public Integer getTotalChaincodeCount() {
        return this.TotalChaincodeCount;
    }

    /**
     * 设置网络智能合约总数量
     * @param TotalChaincodeCount 网络智能合约总数量
     */
    public void setTotalChaincodeCount(Integer TotalChaincodeCount) {
        this.TotalChaincodeCount = TotalChaincodeCount;
    }

    /**
     * 获取最近7天发起的智能合约数量
     * @return RecentChaincodeCount 最近7天发起的智能合约数量
     */
    public Integer getRecentChaincodeCount() {
        return this.RecentChaincodeCount;
    }

    /**
     * 设置最近7天发起的智能合约数量
     * @param RecentChaincodeCount 最近7天发起的智能合约数量
     */
    public void setRecentChaincodeCount(Integer RecentChaincodeCount) {
        this.RecentChaincodeCount = RecentChaincodeCount;
    }

    /**
     * 获取当前组织发起的智能合约数量
     * @return MyChaincodeCount 当前组织发起的智能合约数量
     */
    public Integer getMyChaincodeCount() {
        return this.MyChaincodeCount;
    }

    /**
     * 设置当前组织发起的智能合约数量
     * @param MyChaincodeCount 当前组织发起的智能合约数量
     */
    public void setMyChaincodeCount(Integer MyChaincodeCount) {
        this.MyChaincodeCount = MyChaincodeCount;
    }

    /**
     * 获取当前组织的证书总数量
     * @return TotalCertCount 当前组织的证书总数量
     */
    public Integer getTotalCertCount() {
        return this.TotalCertCount;
    }

    /**
     * 设置当前组织的证书总数量
     * @param TotalCertCount 当前组织的证书总数量
     */
    public void setTotalCertCount(Integer TotalCertCount) {
        this.TotalCertCount = TotalCertCount;
    }

    /**
     * 获取颁发给当前组织的证书数量
     * @return TlsCertCount 颁发给当前组织的证书数量
     */
    public Integer getTlsCertCount() {
        return this.TlsCertCount;
    }

    /**
     * 设置颁发给当前组织的证书数量
     * @param TlsCertCount 颁发给当前组织的证书数量
     */
    public void setTlsCertCount(Integer TlsCertCount) {
        this.TlsCertCount = TlsCertCount;
    }

    /**
     * 获取网络背书节点证书数量
     * @return PeerCertCount 网络背书节点证书数量
     */
    public Integer getPeerCertCount() {
        return this.PeerCertCount;
    }

    /**
     * 设置网络背书节点证书数量
     * @param PeerCertCount 网络背书节点证书数量
     */
    public void setPeerCertCount(Integer PeerCertCount) {
        this.PeerCertCount = PeerCertCount;
    }

    /**
     * 获取当前组织业务证书数量
     * @return ClientCertCount 当前组织业务证书数量
     */
    public Integer getClientCertCount() {
        return this.ClientCertCount;
    }

    /**
     * 设置当前组织业务证书数量
     * @param ClientCertCount 当前组织业务证书数量
     */
    public void setClientCertCount(Integer ClientCertCount) {
        this.ClientCertCount = ClientCertCount;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
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

