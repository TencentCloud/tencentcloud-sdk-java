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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterOverviewResponse extends AbstractModel {

    /**
    * 云服务器数量
    */
    @SerializedName("CvmCount")
    @Expose
    private Long CvmCount;

    /**
    * 宿主机数量
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * vpn通道状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpnConnectionState")
    @Expose
    private String VpnConnectionState;

    /**
    * vpn网关监控数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpngwBandwidthData")
    @Expose
    private VpngwBandwidthData VpngwBandwidthData;

    /**
    * 本地网关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalNetInfo")
    @Expose
    private LocalNetInfo LocalNetInfo;

    /**
    * vpn网关通道监控数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpnConnectionBandwidthData")
    @Expose
    private VpngwBandwidthData [] VpnConnectionBandwidthData;

    /**
    * 宿主机资源概览信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostDetailInfo")
    @Expose
    private HostDetailInfo [] HostDetailInfo;

    /**
    * 热备宿主机数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostStandbyCount")
    @Expose
    private Long HostStandbyCount;

    /**
    * 普通宿主机数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostNormalCount")
    @Expose
    private Long HostNormalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云服务器数量 
     * @return CvmCount 云服务器数量
     */
    public Long getCvmCount() {
        return this.CvmCount;
    }

    /**
     * Set 云服务器数量
     * @param CvmCount 云服务器数量
     */
    public void setCvmCount(Long CvmCount) {
        this.CvmCount = CvmCount;
    }

    /**
     * Get 宿主机数量 
     * @return HostCount 宿主机数量
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 宿主机数量
     * @param HostCount 宿主机数量
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get vpn通道状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpnConnectionState vpn通道状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpnConnectionState() {
        return this.VpnConnectionState;
    }

    /**
     * Set vpn通道状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpnConnectionState vpn通道状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpnConnectionState(String VpnConnectionState) {
        this.VpnConnectionState = VpnConnectionState;
    }

    /**
     * Get vpn网关监控数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpngwBandwidthData vpn网关监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpngwBandwidthData getVpngwBandwidthData() {
        return this.VpngwBandwidthData;
    }

    /**
     * Set vpn网关监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpngwBandwidthData vpn网关监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpngwBandwidthData(VpngwBandwidthData VpngwBandwidthData) {
        this.VpngwBandwidthData = VpngwBandwidthData;
    }

    /**
     * Get 本地网关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalNetInfo 本地网关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalNetInfo getLocalNetInfo() {
        return this.LocalNetInfo;
    }

    /**
     * Set 本地网关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalNetInfo 本地网关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalNetInfo(LocalNetInfo LocalNetInfo) {
        this.LocalNetInfo = LocalNetInfo;
    }

    /**
     * Get vpn网关通道监控数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpnConnectionBandwidthData vpn网关通道监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpngwBandwidthData [] getVpnConnectionBandwidthData() {
        return this.VpnConnectionBandwidthData;
    }

    /**
     * Set vpn网关通道监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpnConnectionBandwidthData vpn网关通道监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpnConnectionBandwidthData(VpngwBandwidthData [] VpnConnectionBandwidthData) {
        this.VpnConnectionBandwidthData = VpnConnectionBandwidthData;
    }

    /**
     * Get 宿主机资源概览信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostDetailInfo 宿主机资源概览信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostDetailInfo [] getHostDetailInfo() {
        return this.HostDetailInfo;
    }

    /**
     * Set 宿主机资源概览信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostDetailInfo 宿主机资源概览信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostDetailInfo(HostDetailInfo [] HostDetailInfo) {
        this.HostDetailInfo = HostDetailInfo;
    }

    /**
     * Get 热备宿主机数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostStandbyCount 热备宿主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHostStandbyCount() {
        return this.HostStandbyCount;
    }

    /**
     * Set 热备宿主机数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostStandbyCount 热备宿主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostStandbyCount(Long HostStandbyCount) {
        this.HostStandbyCount = HostStandbyCount;
    }

    /**
     * Get 普通宿主机数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostNormalCount 普通宿主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHostNormalCount() {
        return this.HostNormalCount;
    }

    /**
     * Set 普通宿主机数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostNormalCount 普通宿主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostNormalCount(Long HostNormalCount) {
        this.HostNormalCount = HostNormalCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDedicatedClusterOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterOverviewResponse(DescribeDedicatedClusterOverviewResponse source) {
        if (source.CvmCount != null) {
            this.CvmCount = new Long(source.CvmCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.VpnConnectionState != null) {
            this.VpnConnectionState = new String(source.VpnConnectionState);
        }
        if (source.VpngwBandwidthData != null) {
            this.VpngwBandwidthData = new VpngwBandwidthData(source.VpngwBandwidthData);
        }
        if (source.LocalNetInfo != null) {
            this.LocalNetInfo = new LocalNetInfo(source.LocalNetInfo);
        }
        if (source.VpnConnectionBandwidthData != null) {
            this.VpnConnectionBandwidthData = new VpngwBandwidthData[source.VpnConnectionBandwidthData.length];
            for (int i = 0; i < source.VpnConnectionBandwidthData.length; i++) {
                this.VpnConnectionBandwidthData[i] = new VpngwBandwidthData(source.VpnConnectionBandwidthData[i]);
            }
        }
        if (source.HostDetailInfo != null) {
            this.HostDetailInfo = new HostDetailInfo[source.HostDetailInfo.length];
            for (int i = 0; i < source.HostDetailInfo.length; i++) {
                this.HostDetailInfo[i] = new HostDetailInfo(source.HostDetailInfo[i]);
            }
        }
        if (source.HostStandbyCount != null) {
            this.HostStandbyCount = new Long(source.HostStandbyCount);
        }
        if (source.HostNormalCount != null) {
            this.HostNormalCount = new Long(source.HostNormalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CvmCount", this.CvmCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "VpnConnectionState", this.VpnConnectionState);
        this.setParamObj(map, prefix + "VpngwBandwidthData.", this.VpngwBandwidthData);
        this.setParamObj(map, prefix + "LocalNetInfo.", this.LocalNetInfo);
        this.setParamArrayObj(map, prefix + "VpnConnectionBandwidthData.", this.VpnConnectionBandwidthData);
        this.setParamArrayObj(map, prefix + "HostDetailInfo.", this.HostDetailInfo);
        this.setParamSimple(map, prefix + "HostStandbyCount", this.HostStandbyCount);
        this.setParamSimple(map, prefix + "HostNormalCount", this.HostNormalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

