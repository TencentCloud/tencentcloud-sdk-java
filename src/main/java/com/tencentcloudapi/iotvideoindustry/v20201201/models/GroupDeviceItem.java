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

public class GroupDeviceItem extends AbstractModel{

    /**
    * 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 设备状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInformation")
    @Expose
    private String ExtraInformation;

    /**
    * 设备类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * rtsp地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTSPUrl")
    @Expose
    private String RTSPUrl;

    /**
    * 设备编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceCode")
    @Expose
    private String DeviceCode;

    /**
    * 是否存在录像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRecord")
    @Expose
    private Long IsRecord;

    /**
    * 该设备是否可录制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Recordable")
    @Expose
    private Long Recordable;

    /**
    * 设备接入协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 设备通道总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelNum")
    @Expose
    private Long ChannelNum;

    /**
    * 设备视频通道总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoChannelNum")
    @Expose
    private Long VideoChannelNum;

    /**
     * Get 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 设备状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 设备状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 设备状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInformation 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInformation() {
        return this.ExtraInformation;
    }

    /**
     * Set 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInformation 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInformation(String ExtraInformation) {
        this.ExtraInformation = ExtraInformation;
    }

    /**
     * Get 设备类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceType 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceType 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get rtsp地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTSPUrl rtsp地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRTSPUrl() {
        return this.RTSPUrl;
    }

    /**
     * Set rtsp地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTSPUrl rtsp地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTSPUrl(String RTSPUrl) {
        this.RTSPUrl = RTSPUrl;
    }

    /**
     * Get 设备编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceCode 设备编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceCode() {
        return this.DeviceCode;
    }

    /**
     * Set 设备编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceCode 设备编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceCode(String DeviceCode) {
        this.DeviceCode = DeviceCode;
    }

    /**
     * Get 是否存在录像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRecord 是否存在录像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRecord() {
        return this.IsRecord;
    }

    /**
     * Set 是否存在录像
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRecord 是否存在录像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRecord(Long IsRecord) {
        this.IsRecord = IsRecord;
    }

    /**
     * Get 该设备是否可录制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Recordable 该设备是否可录制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordable() {
        return this.Recordable;
    }

    /**
     * Set 该设备是否可录制
注意：此字段可能返回 null，表示取不到有效值。
     * @param Recordable 该设备是否可录制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordable(Long Recordable) {
        this.Recordable = Recordable;
    }

    /**
     * Get 设备接入协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 设备接入协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 设备接入协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 设备接入协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备通道总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelNum 设备通道总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelNum() {
        return this.ChannelNum;
    }

    /**
     * Set 设备通道总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelNum 设备通道总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelNum(Long ChannelNum) {
        this.ChannelNum = ChannelNum;
    }

    /**
     * Get 设备视频通道总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoChannelNum 设备视频通道总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVideoChannelNum() {
        return this.VideoChannelNum;
    }

    /**
     * Set 设备视频通道总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoChannelNum 设备视频通道总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoChannelNum(Long VideoChannelNum) {
        this.VideoChannelNum = VideoChannelNum;
    }

    public GroupDeviceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupDeviceItem(GroupDeviceItem source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ExtraInformation != null) {
            this.ExtraInformation = new String(source.ExtraInformation);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.RTSPUrl != null) {
            this.RTSPUrl = new String(source.RTSPUrl);
        }
        if (source.DeviceCode != null) {
            this.DeviceCode = new String(source.DeviceCode);
        }
        if (source.IsRecord != null) {
            this.IsRecord = new Long(source.IsRecord);
        }
        if (source.Recordable != null) {
            this.Recordable = new Long(source.Recordable);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ChannelNum != null) {
            this.ChannelNum = new Long(source.ChannelNum);
        }
        if (source.VideoChannelNum != null) {
            this.VideoChannelNum = new Long(source.VideoChannelNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExtraInformation", this.ExtraInformation);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "RTSPUrl", this.RTSPUrl);
        this.setParamSimple(map, prefix + "DeviceCode", this.DeviceCode);
        this.setParamSimple(map, prefix + "IsRecord", this.IsRecord);
        this.setParamSimple(map, prefix + "Recordable", this.Recordable);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChannelNum", this.ChannelNum);
        this.setParamSimple(map, prefix + "VideoChannelNum", this.VideoChannelNum);

    }
}

