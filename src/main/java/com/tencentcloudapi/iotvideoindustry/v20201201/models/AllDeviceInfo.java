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

public class AllDeviceInfo extends AbstractModel{

    /**
    * 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备类型；2：IPC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 设备状态；0：设备不在线；1：设备在线；2：设备隔离中；3：设备未注册
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 设备扩展属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInformation")
    @Expose
    private String ExtraInformation;

    /**
    * 设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 设备绑定分组路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupPath")
    @Expose
    private String GroupPath;

    /**
    * 设备编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceCode")
    @Expose
    private String DeviceCode;

    /**
    * 是否存在录像,，0:不存在；1：存在
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
    * 组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 组名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

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
     * Get 设备类型；2：IPC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceType 设备类型；2：IPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型；2：IPC
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceType 设备类型；2：IPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 设备状态；0：设备不在线；1：设备在线；2：设备隔离中；3：设备未注册
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 设备状态；0：设备不在线；1：设备在线；2：设备隔离中；3：设备未注册
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态；0：设备不在线；1：设备在线；2：设备隔离中；3：设备未注册
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 设备状态；0：设备不在线；1：设备在线；2：设备隔离中；3：设备未注册
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备扩展属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInformation 设备扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInformation() {
        return this.ExtraInformation;
    }

    /**
     * Set 设备扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInformation 设备扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInformation(String ExtraInformation) {
        this.ExtraInformation = ExtraInformation;
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
     * Get 设备绑定分组路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupPath 设备绑定分组路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupPath() {
        return this.GroupPath;
    }

    /**
     * Set 设备绑定分组路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupPath 设备绑定分组路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupPath(String GroupPath) {
        this.GroupPath = GroupPath;
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
     * Get 是否存在录像,，0:不存在；1：存在
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRecord 是否存在录像,，0:不存在；1：存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRecord() {
        return this.IsRecord;
    }

    /**
     * Set 是否存在录像,，0:不存在；1：存在
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRecord 是否存在录像,，0:不存在；1：存在
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
     * Get 组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 组名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 组名
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public AllDeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllDeviceInfo(AllDeviceInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ExtraInformation != null) {
            this.ExtraInformation = new String(source.ExtraInformation);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.GroupPath != null) {
            this.GroupPath = new String(source.GroupPath);
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
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExtraInformation", this.ExtraInformation);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "GroupPath", this.GroupPath);
        this.setParamSimple(map, prefix + "DeviceCode", this.DeviceCode);
        this.setParamSimple(map, prefix + "IsRecord", this.IsRecord);
        this.setParamSimple(map, prefix + "Recordable", this.Recordable);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

