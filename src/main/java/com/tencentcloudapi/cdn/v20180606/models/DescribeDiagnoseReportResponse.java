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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiagnoseReportResponse extends AbstractModel{

    /**
    * 诊断报告基础信息
    */
    @SerializedName("BaskInfo")
    @Expose
    private DiagnoseData BaskInfo;

    /**
    * CNAME检测信息
    */
    @SerializedName("CnameInfo")
    @Expose
    private DiagnoseData CnameInfo;

    /**
    * 客户端检测信息
    */
    @SerializedName("ClientInfo")
    @Expose
    private DiagnoseData ClientInfo;

    /**
    * DNS检测信息
    */
    @SerializedName("DnsInfo")
    @Expose
    private DiagnoseData DnsInfo;

    /**
    * 网络检测信息
    */
    @SerializedName("NetworkInfo")
    @Expose
    private DiagnoseData NetworkInfo;

    /**
    * 边缘节点检测信息
    */
    @SerializedName("OcNodeInfo")
    @Expose
    private DiagnoseData OcNodeInfo;

    /**
    * 中间源节点检测信息
    */
    @SerializedName("MidNodeInfo")
    @Expose
    private DiagnoseData MidNodeInfo;

    /**
    * 源站检测信息
    */
    @SerializedName("OriginInfo")
    @Expose
    private DiagnoseData OriginInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 诊断报告基础信息 
     * @return BaskInfo 诊断报告基础信息
     */
    public DiagnoseData getBaskInfo() {
        return this.BaskInfo;
    }

    /**
     * Set 诊断报告基础信息
     * @param BaskInfo 诊断报告基础信息
     */
    public void setBaskInfo(DiagnoseData BaskInfo) {
        this.BaskInfo = BaskInfo;
    }

    /**
     * Get CNAME检测信息 
     * @return CnameInfo CNAME检测信息
     */
    public DiagnoseData getCnameInfo() {
        return this.CnameInfo;
    }

    /**
     * Set CNAME检测信息
     * @param CnameInfo CNAME检测信息
     */
    public void setCnameInfo(DiagnoseData CnameInfo) {
        this.CnameInfo = CnameInfo;
    }

    /**
     * Get 客户端检测信息 
     * @return ClientInfo 客户端检测信息
     */
    public DiagnoseData getClientInfo() {
        return this.ClientInfo;
    }

    /**
     * Set 客户端检测信息
     * @param ClientInfo 客户端检测信息
     */
    public void setClientInfo(DiagnoseData ClientInfo) {
        this.ClientInfo = ClientInfo;
    }

    /**
     * Get DNS检测信息 
     * @return DnsInfo DNS检测信息
     */
    public DiagnoseData getDnsInfo() {
        return this.DnsInfo;
    }

    /**
     * Set DNS检测信息
     * @param DnsInfo DNS检测信息
     */
    public void setDnsInfo(DiagnoseData DnsInfo) {
        this.DnsInfo = DnsInfo;
    }

    /**
     * Get 网络检测信息 
     * @return NetworkInfo 网络检测信息
     */
    public DiagnoseData getNetworkInfo() {
        return this.NetworkInfo;
    }

    /**
     * Set 网络检测信息
     * @param NetworkInfo 网络检测信息
     */
    public void setNetworkInfo(DiagnoseData NetworkInfo) {
        this.NetworkInfo = NetworkInfo;
    }

    /**
     * Get 边缘节点检测信息 
     * @return OcNodeInfo 边缘节点检测信息
     */
    public DiagnoseData getOcNodeInfo() {
        return this.OcNodeInfo;
    }

    /**
     * Set 边缘节点检测信息
     * @param OcNodeInfo 边缘节点检测信息
     */
    public void setOcNodeInfo(DiagnoseData OcNodeInfo) {
        this.OcNodeInfo = OcNodeInfo;
    }

    /**
     * Get 中间源节点检测信息 
     * @return MidNodeInfo 中间源节点检测信息
     */
    public DiagnoseData getMidNodeInfo() {
        return this.MidNodeInfo;
    }

    /**
     * Set 中间源节点检测信息
     * @param MidNodeInfo 中间源节点检测信息
     */
    public void setMidNodeInfo(DiagnoseData MidNodeInfo) {
        this.MidNodeInfo = MidNodeInfo;
    }

    /**
     * Get 源站检测信息 
     * @return OriginInfo 源站检测信息
     */
    public DiagnoseData getOriginInfo() {
        return this.OriginInfo;
    }

    /**
     * Set 源站检测信息
     * @param OriginInfo 源站检测信息
     */
    public void setOriginInfo(DiagnoseData OriginInfo) {
        this.OriginInfo = OriginInfo;
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
        this.setParamObj(map, prefix + "BaskInfo.", this.BaskInfo);
        this.setParamObj(map, prefix + "CnameInfo.", this.CnameInfo);
        this.setParamObj(map, prefix + "ClientInfo.", this.ClientInfo);
        this.setParamObj(map, prefix + "DnsInfo.", this.DnsInfo);
        this.setParamObj(map, prefix + "NetworkInfo.", this.NetworkInfo);
        this.setParamObj(map, prefix + "OcNodeInfo.", this.OcNodeInfo);
        this.setParamObj(map, prefix + "MidNodeInfo.", this.MidNodeInfo);
        this.setParamObj(map, prefix + "OriginInfo.", this.OriginInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

