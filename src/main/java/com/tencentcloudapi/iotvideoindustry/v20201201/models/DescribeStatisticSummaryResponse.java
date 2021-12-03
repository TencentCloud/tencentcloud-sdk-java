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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStatisticSummaryResponse extends AbstractModel{

    /**
    * 录制设备总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordingDevice")
    @Expose
    private Long RecordingDevice;

    /**
    * 非录制设备总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonRecordingDevice")
    @Expose
    private Long NonRecordingDevice;

    /**
    * 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WatchFlux")
    @Expose
    private Float WatchFlux;

    /**
    * 累计有效存储容量总数。单位：GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageUsage")
    @Expose
    private Float StorageUsage;

    /**
    * X-P2P分享流量。单位 Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P2PFluxTotal")
    @Expose
    private Float P2PFluxTotal;

    /**
    * X-P2P峰值带宽。 单位bps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P2PPeakValue")
    @Expose
    private Float P2PPeakValue;

    /**
    * RTMP推流路数 ( 直播推流)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivePushTotal")
    @Expose
    private Long LivePushTotal;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 录制设备总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordingDevice 录制设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordingDevice() {
        return this.RecordingDevice;
    }

    /**
     * Set 录制设备总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordingDevice 录制设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordingDevice(Long RecordingDevice) {
        this.RecordingDevice = RecordingDevice;
    }

    /**
     * Get 非录制设备总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonRecordingDevice 非录制设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNonRecordingDevice() {
        return this.NonRecordingDevice;
    }

    /**
     * Set 非录制设备总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonRecordingDevice 非录制设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonRecordingDevice(Long NonRecordingDevice) {
        this.NonRecordingDevice = NonRecordingDevice;
    }

    /**
     * Get 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WatchFlux 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWatchFlux() {
        return this.WatchFlux;
    }

    /**
     * Set 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param WatchFlux 观看流量总数。为直播观看流量与点播观看流量之和。单位：GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWatchFlux(Float WatchFlux) {
        this.WatchFlux = WatchFlux;
    }

    /**
     * Get 累计有效存储容量总数。单位：GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageUsage 累计有效存储容量总数。单位：GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set 累计有效存储容量总数。单位：GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageUsage 累计有效存储容量总数。单位：GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageUsage(Float StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get X-P2P分享流量。单位 Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P2PFluxTotal X-P2P分享流量。单位 Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP2PFluxTotal() {
        return this.P2PFluxTotal;
    }

    /**
     * Set X-P2P分享流量。单位 Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param P2PFluxTotal X-P2P分享流量。单位 Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP2PFluxTotal(Float P2PFluxTotal) {
        this.P2PFluxTotal = P2PFluxTotal;
    }

    /**
     * Get X-P2P峰值带宽。 单位bps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P2PPeakValue X-P2P峰值带宽。 单位bps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP2PPeakValue() {
        return this.P2PPeakValue;
    }

    /**
     * Set X-P2P峰值带宽。 单位bps
注意：此字段可能返回 null，表示取不到有效值。
     * @param P2PPeakValue X-P2P峰值带宽。 单位bps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP2PPeakValue(Float P2PPeakValue) {
        this.P2PPeakValue = P2PPeakValue;
    }

    /**
     * Get RTMP推流路数 ( 直播推流)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivePushTotal RTMP推流路数 ( 直播推流)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLivePushTotal() {
        return this.LivePushTotal;
    }

    /**
     * Set RTMP推流路数 ( 直播推流)
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivePushTotal RTMP推流路数 ( 直播推流)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivePushTotal(Long LivePushTotal) {
        this.LivePushTotal = LivePushTotal;
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

