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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayMonitor extends AbstractModel{

    /**
    * 设备接入总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceTotal")
    @Expose
    private Long DeviceTotal;

    /**
    * 设备在线数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceOnline")
    @Expose
    private Long DeviceOnline;

    /**
    * 设备离线数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceOffline")
    @Expose
    private Long DeviceOffline;

    /**
    * 视频通道总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelTotal")
    @Expose
    private Long ChannelTotal;

    /**
    * 视频通道在线数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelOnline")
    @Expose
    private Long ChannelOnline;

    /**
    * 视频通道离线数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelOffline")
    @Expose
    private Long ChannelOffline;

    /**
    * 网关上行流量,单位kbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpFlow")
    @Expose
    private Long UpFlow;

    /**
    * 流在传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelPull")
    @Expose
    private Long ChannelPull;

    /**
    * 流未传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelUnPull")
    @Expose
    private Long ChannelUnPull;

    /**
     * Get 设备接入总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceTotal 设备接入总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceTotal() {
        return this.DeviceTotal;
    }

    /**
     * Set 设备接入总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceTotal 设备接入总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceTotal(Long DeviceTotal) {
        this.DeviceTotal = DeviceTotal;
    }

    /**
     * Get 设备在线数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceOnline 设备在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceOnline() {
        return this.DeviceOnline;
    }

    /**
     * Set 设备在线数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceOnline 设备在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceOnline(Long DeviceOnline) {
        this.DeviceOnline = DeviceOnline;
    }

    /**
     * Get 设备离线数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceOffline 设备离线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceOffline() {
        return this.DeviceOffline;
    }

    /**
     * Set 设备离线数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceOffline 设备离线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceOffline(Long DeviceOffline) {
        this.DeviceOffline = DeviceOffline;
    }

    /**
     * Get 视频通道总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelTotal 视频通道总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelTotal() {
        return this.ChannelTotal;
    }

    /**
     * Set 视频通道总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelTotal 视频通道总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelTotal(Long ChannelTotal) {
        this.ChannelTotal = ChannelTotal;
    }

    /**
     * Get 视频通道在线数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelOnline 视频通道在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelOnline() {
        return this.ChannelOnline;
    }

    /**
     * Set 视频通道在线数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelOnline 视频通道在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelOnline(Long ChannelOnline) {
        this.ChannelOnline = ChannelOnline;
    }

    /**
     * Get 视频通道离线数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelOffline 视频通道离线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelOffline() {
        return this.ChannelOffline;
    }

    /**
     * Set 视频通道离线数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelOffline 视频通道离线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelOffline(Long ChannelOffline) {
        this.ChannelOffline = ChannelOffline;
    }

    /**
     * Get 网关上行流量,单位kbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpFlow 网关上行流量,单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpFlow() {
        return this.UpFlow;
    }

    /**
     * Set 网关上行流量,单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpFlow 网关上行流量,单位kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpFlow(Long UpFlow) {
        this.UpFlow = UpFlow;
    }

    /**
     * Get 流在传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelPull 流在传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelPull() {
        return this.ChannelPull;
    }

    /**
     * Set 流在传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelPull 流在传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelPull(Long ChannelPull) {
        this.ChannelPull = ChannelPull;
    }

    /**
     * Get 流未传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelUnPull 流未传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelUnPull() {
        return this.ChannelUnPull;
    }

    /**
     * Set 流未传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelUnPull 流未传输中的通道数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelUnPull(Long ChannelUnPull) {
        this.ChannelUnPull = ChannelUnPull;
    }

    public DescribeGatewayMonitor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayMonitor(DescribeGatewayMonitor source) {
        if (source.DeviceTotal != null) {
            this.DeviceTotal = new Long(source.DeviceTotal);
        }
        if (source.DeviceOnline != null) {
            this.DeviceOnline = new Long(source.DeviceOnline);
        }
        if (source.DeviceOffline != null) {
            this.DeviceOffline = new Long(source.DeviceOffline);
        }
        if (source.ChannelTotal != null) {
            this.ChannelTotal = new Long(source.ChannelTotal);
        }
        if (source.ChannelOnline != null) {
            this.ChannelOnline = new Long(source.ChannelOnline);
        }
        if (source.ChannelOffline != null) {
            this.ChannelOffline = new Long(source.ChannelOffline);
        }
        if (source.UpFlow != null) {
            this.UpFlow = new Long(source.UpFlow);
        }
        if (source.ChannelPull != null) {
            this.ChannelPull = new Long(source.ChannelPull);
        }
        if (source.ChannelUnPull != null) {
            this.ChannelUnPull = new Long(source.ChannelUnPull);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceTotal", this.DeviceTotal);
        this.setParamSimple(map, prefix + "DeviceOnline", this.DeviceOnline);
        this.setParamSimple(map, prefix + "DeviceOffline", this.DeviceOffline);
        this.setParamSimple(map, prefix + "ChannelTotal", this.ChannelTotal);
        this.setParamSimple(map, prefix + "ChannelOnline", this.ChannelOnline);
        this.setParamSimple(map, prefix + "ChannelOffline", this.ChannelOffline);
        this.setParamSimple(map, prefix + "UpFlow", this.UpFlow);
        this.setParamSimple(map, prefix + "ChannelPull", this.ChannelPull);
        this.setParamSimple(map, prefix + "ChannelUnPull", this.ChannelUnPull);

    }
}

