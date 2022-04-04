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
    * 刷新检测信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PurgeInfo")
    @Expose
    private DiagnoseData PurgeInfo;

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
     * Get 刷新检测信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PurgeInfo 刷新检测信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiagnoseData getPurgeInfo() {
        return this.PurgeInfo;
    }

    /**
     * Set 刷新检测信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PurgeInfo 刷新检测信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPurgeInfo(DiagnoseData PurgeInfo) {
        this.PurgeInfo = PurgeInfo;
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

    public DescribeDiagnoseReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiagnoseReportResponse(DescribeDiagnoseReportResponse source) {
        if (source.BaskInfo != null) {
            this.BaskInfo = new DiagnoseData(source.BaskInfo);
        }
        if (source.CnameInfo != null) {
            this.CnameInfo = new DiagnoseData(source.CnameInfo);
        }
        if (source.ClientInfo != null) {
            this.ClientInfo = new DiagnoseData(source.ClientInfo);
        }
        if (source.DnsInfo != null) {
            this.DnsInfo = new DiagnoseData(source.DnsInfo);
        }
        if (source.NetworkInfo != null) {
            this.NetworkInfo = new DiagnoseData(source.NetworkInfo);
        }
        if (source.OcNodeInfo != null) {
            this.OcNodeInfo = new DiagnoseData(source.OcNodeInfo);
        }
        if (source.MidNodeInfo != null) {
            this.MidNodeInfo = new DiagnoseData(source.MidNodeInfo);
        }
        if (source.OriginInfo != null) {
            this.OriginInfo = new DiagnoseData(source.OriginInfo);
        }
        if (source.PurgeInfo != null) {
            this.PurgeInfo = new DiagnoseData(source.PurgeInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamObj(map, prefix + "PurgeInfo.", this.PurgeInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

