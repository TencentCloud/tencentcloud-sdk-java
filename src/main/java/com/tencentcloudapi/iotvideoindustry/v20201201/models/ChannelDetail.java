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

public class ChannelDetail extends AbstractModel{

    /**
    * 通道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 通道唯一标识
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 通道类型 0：未知；1：视频通道；2：音频通道；3：告警通道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelType")
    @Expose
    private Long ChannelType;

    /**
    * 20位国标通道编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * 通道扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInformation")
    @Expose
    private String ExtraInformation;

    /**
    * 通道在线状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 通道是否存在录像标识 0：无录像；1：有录像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRecord")
    @Expose
    private Long IsRecord;

    /**
    * 通道所属设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 通道所属虚拟组织的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessGroupId")
    @Expose
    private String BusinessGroupId;

    /**
     * Get 通道名称 
     * @return ChannelName 通道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 通道名称
     * @param ChannelName 通道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 通道唯一标识 
     * @return ChannelId 通道唯一标识
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道唯一标识
     * @param ChannelId 通道唯一标识
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 通道类型 0：未知；1：视频通道；2：音频通道；3：告警通道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelType 通道类型 0：未知；1：视频通道；2：音频通道；3：告警通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set 通道类型 0：未知；1：视频通道；2：音频通道；3：告警通道
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelType 通道类型 0：未知；1：视频通道；2：音频通道；3：告警通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelType(Long ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get 20位国标通道编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelCode 20位国标通道编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set 20位国标通道编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelCode 20位国标通道编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }

    /**
     * Get 通道扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInformation 通道扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInformation() {
        return this.ExtraInformation;
    }

    /**
     * Set 通道扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInformation 通道扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInformation(String ExtraInformation) {
        this.ExtraInformation = ExtraInformation;
    }

    /**
     * Get 通道在线状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 通道在线状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 通道在线状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 通道在线状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 通道是否存在录像标识 0：无录像；1：有录像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRecord 通道是否存在录像标识 0：无录像；1：有录像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRecord() {
        return this.IsRecord;
    }

    /**
     * Set 通道是否存在录像标识 0：无录像；1：有录像
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRecord 通道是否存在录像标识 0：无录像；1：有录像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRecord(Long IsRecord) {
        this.IsRecord = IsRecord;
    }

    /**
     * Get 通道所属设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 通道所属设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 通道所属设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 通道所属设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 通道所属虚拟组织的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessGroupId 通道所属虚拟组织的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessGroupId() {
        return this.BusinessGroupId;
    }

    /**
     * Set 通道所属虚拟组织的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessGroupId 通道所属虚拟组织的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessGroupId(String BusinessGroupId) {
        this.BusinessGroupId = BusinessGroupId;
    }

    public ChannelDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDetail(ChannelDetail source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelType != null) {
            this.ChannelType = new Long(source.ChannelType);
        }
        if (source.ChannelCode != null) {
            this.ChannelCode = new String(source.ChannelCode);
        }
        if (source.ExtraInformation != null) {
            this.ExtraInformation = new String(source.ExtraInformation);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsRecord != null) {
            this.IsRecord = new Long(source.IsRecord);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.BusinessGroupId != null) {
            this.BusinessGroupId = new String(source.BusinessGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamSimple(map, prefix + "ChannelCode", this.ChannelCode);
        this.setParamSimple(map, prefix + "ExtraInformation", this.ExtraInformation);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsRecord", this.IsRecord);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "BusinessGroupId", this.BusinessGroupId);

    }
}

