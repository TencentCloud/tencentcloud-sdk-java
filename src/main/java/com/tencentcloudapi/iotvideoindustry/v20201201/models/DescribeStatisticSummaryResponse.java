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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStatisticSummaryResponse extends AbstractModel {

    /**
    * 录制设备总数
    */
    @SerializedName("RecordingDevice")
    @Expose
    private Long RecordingDevice;

    /**
    * 非录制设备总数
    */
    @SerializedName("NonRecordingDevice")
    @Expose
    private Long NonRecordingDevice;

    /**
    * 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
    */
    @SerializedName("WatchFlux")
    @Expose
    private Float WatchFlux;

    /**
    * 累计有效存储容量总数。单位：GB
    */
    @SerializedName("StorageUsage")
    @Expose
    private Float StorageUsage;

    /**
    * X-P2P分享流量。单位 Byte
    */
    @SerializedName("P2PFluxTotal")
    @Expose
    private Float P2PFluxTotal;

    /**
    * X-P2P峰值带宽。 单位bps
    */
    @SerializedName("P2PPeakValue")
    @Expose
    private Float P2PPeakValue;

    /**
    * RTMP推流路数 ( 直播推流)
    */
    @SerializedName("LivePushTotal")
    @Expose
    private Long LivePushTotal;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 录制设备总数 
     * @return RecordingDevice 录制设备总数
     */
    public Long getRecordingDevice() {
        return this.RecordingDevice;
    }

    /**
     * Set 录制设备总数
     * @param RecordingDevice 录制设备总数
     */
    public void setRecordingDevice(Long RecordingDevice) {
        this.RecordingDevice = RecordingDevice;
    }

    /**
     * Get 非录制设备总数 
     * @return NonRecordingDevice 非录制设备总数
     */
    public Long getNonRecordingDevice() {
        return this.NonRecordingDevice;
    }

    /**
     * Set 非录制设备总数
     * @param NonRecordingDevice 非录制设备总数
     */
    public void setNonRecordingDevice(Long NonRecordingDevice) {
        this.NonRecordingDevice = NonRecordingDevice;
    }

    /**
     * Get 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB 
     * @return WatchFlux 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
     */
    public Float getWatchFlux() {
        return this.WatchFlux;
    }

    /**
     * Set 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
     * @param WatchFlux 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
     */
    public void setWatchFlux(Float WatchFlux) {
        this.WatchFlux = WatchFlux;
    }

    /**
     * Get 累计有效存储容量总数。单位：GB 
     * @return StorageUsage 累计有效存储容量总数。单位：GB
     */
    public Float getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set 累计有效存储容量总数。单位：GB
     * @param StorageUsage 累计有效存储容量总数。单位：GB
     */
    public void setStorageUsage(Float StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get X-P2P分享流量。单位 Byte 
     * @return P2PFluxTotal X-P2P分享流量。单位 Byte
     */
    public Float getP2PFluxTotal() {
        return this.P2PFluxTotal;
    }

    /**
     * Set X-P2P分享流量。单位 Byte
     * @param P2PFluxTotal X-P2P分享流量。单位 Byte
     */
    public void setP2PFluxTotal(Float P2PFluxTotal) {
        this.P2PFluxTotal = P2PFluxTotal;
    }

    /**
     * Get X-P2P峰值带宽。 单位bps 
     * @return P2PPeakValue X-P2P峰值带宽。 单位bps
     */
    public Float getP2PPeakValue() {
        return this.P2PPeakValue;
    }

    /**
     * Set X-P2P峰值带宽。 单位bps
     * @param P2PPeakValue X-P2P峰值带宽。 单位bps
     */
    public void setP2PPeakValue(Float P2PPeakValue) {
        this.P2PPeakValue = P2PPeakValue;
    }

    /**
     * Get RTMP推流路数 ( 直播推流) 
     * @return LivePushTotal RTMP推流路数 ( 直播推流)
     */
    public Long getLivePushTotal() {
        return this.LivePushTotal;
    }

    /**
     * Set RTMP推流路数 ( 直播推流)
     * @param LivePushTotal RTMP推流路数 ( 直播推流)
     */
    public void setLivePushTotal(Long LivePushTotal) {
        this.LivePushTotal = LivePushTotal;
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

    public DescribeStatisticSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStatisticSummaryResponse(DescribeStatisticSummaryResponse source) {
        if (source.RecordingDevice != null) {
            this.RecordingDevice = new Long(source.RecordingDevice);
        }
        if (source.NonRecordingDevice != null) {
            this.NonRecordingDevice = new Long(source.NonRecordingDevice);
        }
        if (source.WatchFlux != null) {
            this.WatchFlux = new Float(source.WatchFlux);
        }
        if (source.StorageUsage != null) {
            this.StorageUsage = new Float(source.StorageUsage);
        }
        if (source.P2PFluxTotal != null) {
            this.P2PFluxTotal = new Float(source.P2PFluxTotal);
        }
        if (source.P2PPeakValue != null) {
            this.P2PPeakValue = new Float(source.P2PPeakValue);
        }
        if (source.LivePushTotal != null) {
            this.LivePushTotal = new Long(source.LivePushTotal);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordingDevice", this.RecordingDevice);
        this.setParamSimple(map, prefix + "NonRecordingDevice", this.NonRecordingDevice);
        this.setParamSimple(map, prefix + "WatchFlux", this.WatchFlux);
        this.setParamSimple(map, prefix + "StorageUsage", this.StorageUsage);
        this.setParamSimple(map, prefix + "P2PFluxTotal", this.P2PFluxTotal);
        this.setParamSimple(map, prefix + "P2PPeakValue", this.P2PPeakValue);
        this.setParamSimple(map, prefix + "LivePushTotal", this.LivePushTotal);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

