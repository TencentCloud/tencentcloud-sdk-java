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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AggrSoftDeviceRow extends AbstractModel {

    /**
    * 终端名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 最近登录账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLoginAccount")
    @Expose
    private String LastLoginAccount;

    /**
    * 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceUserName")
    @Expose
    private String DeviceUserName;

    /**
    * 软件版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 是否盗版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyRisk")
    @Expose
    private Long PiracyRisk;

    /**
    * 盗版原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyReason")
    @Expose
    private String PiracyReason;

    /**
    * 安装时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstallTime")
    @Expose
    private String InstallTime;

    /**
    * 用户目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserPath")
    @Expose
    private String UserPath;

    /**
    * 所在分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * MAC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MAC")
    @Expose
    private String MAC;

    /**
    * 使用时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseTime")
    @Expose
    private Long UseTime;

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * 软件全名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullSoftName")
    @Expose
    private String FullSoftName;

    /**
    * 数据ID（唯一）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 该终端此款软件可升级到的目标版本号
    */
    @SerializedName("NewVersion")
    @Expose
    private String NewVersion;

    /**
    * 该软件对应运营配置的可升级id
    */
    @SerializedName("UpgradeSoftId")
    @Expose
    private Long UpgradeSoftId;

    /**
    * 终端备注名
    */
    @SerializedName("RemarkName")
    @Expose
    private String RemarkName;

    /**
    * 软件id
    */
    @SerializedName("SoftwareId")
    @Expose
    private Long SoftwareId;

    /**
    * 0:win 2:mac
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
     * Get 终端名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceName 终端名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 终端名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceName 终端名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 最近登录账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLoginAccount 最近登录账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLoginAccount() {
        return this.LastLoginAccount;
    }

    /**
     * Set 最近登录账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLoginAccount 最近登录账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLoginAccount(String LastLoginAccount) {
        this.LastLoginAccount = LastLoginAccount;
    }

    /**
     * Get 终端用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceUserName 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceUserName() {
        return this.DeviceUserName;
    }

    /**
     * Set 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceUserName 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceUserName(String DeviceUserName) {
        this.DeviceUserName = DeviceUserName;
    }

    /**
     * Get 软件版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 是否盗版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyRisk 是否盗版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPiracyRisk() {
        return this.PiracyRisk;
    }

    /**
     * Set 是否盗版
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyRisk 是否盗版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyRisk(Long PiracyRisk) {
        this.PiracyRisk = PiracyRisk;
    }

    /**
     * Get 盗版原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyReason 盗版原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPiracyReason() {
        return this.PiracyReason;
    }

    /**
     * Set 盗版原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyReason 盗版原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyReason(String PiracyReason) {
        this.PiracyReason = PiracyReason;
    }

    /**
     * Get 安装时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstallTime 安装时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstallTime() {
        return this.InstallTime;
    }

    /**
     * Set 安装时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstallTime 安装时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstallTime(String InstallTime) {
        this.InstallTime = InstallTime;
    }

    /**
     * Get 用户目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserPath 用户目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserPath() {
        return this.UserPath;
    }

    /**
     * Set 用户目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserPath 用户目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserPath(String UserPath) {
        this.UserPath = UserPath;
    }

    /**
     * Get 所在分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroup 所在分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 所在分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroup 所在分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get MAC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MAC MAC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMAC() {
        return this.MAC;
    }

    /**
     * Set MAC
注意：此字段可能返回 null，表示取不到有效值。
     * @param MAC MAC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    /**
     * Get 使用时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseTime 使用时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseTime() {
        return this.UseTime;
    }

    /**
     * Set 使用时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseTime 使用时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseTime(Long UseTime) {
        this.UseTime = UseTime;
    }

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 软件全名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullSoftName 软件全名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullSoftName() {
        return this.FullSoftName;
    }

    /**
     * Set 软件全名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullSoftName 软件全名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullSoftName(String FullSoftName) {
        this.FullSoftName = FullSoftName;
    }

    /**
     * Get 数据ID（唯一）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 数据ID（唯一）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数据ID（唯一）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 数据ID（唯一）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 该终端此款软件可升级到的目标版本号 
     * @return NewVersion 该终端此款软件可升级到的目标版本号
     */
    public String getNewVersion() {
        return this.NewVersion;
    }

    /**
     * Set 该终端此款软件可升级到的目标版本号
     * @param NewVersion 该终端此款软件可升级到的目标版本号
     */
    public void setNewVersion(String NewVersion) {
        this.NewVersion = NewVersion;
    }

    /**
     * Get 该软件对应运营配置的可升级id 
     * @return UpgradeSoftId 该软件对应运营配置的可升级id
     */
    public Long getUpgradeSoftId() {
        return this.UpgradeSoftId;
    }

    /**
     * Set 该软件对应运营配置的可升级id
     * @param UpgradeSoftId 该软件对应运营配置的可升级id
     */
    public void setUpgradeSoftId(Long UpgradeSoftId) {
        this.UpgradeSoftId = UpgradeSoftId;
    }

    /**
     * Get 终端备注名 
     * @return RemarkName 终端备注名
     */
    public String getRemarkName() {
        return this.RemarkName;
    }

    /**
     * Set 终端备注名
     * @param RemarkName 终端备注名
     */
    public void setRemarkName(String RemarkName) {
        this.RemarkName = RemarkName;
    }

    /**
     * Get 软件id 
     * @return SoftwareId 软件id
     */
    public Long getSoftwareId() {
        return this.SoftwareId;
    }

    /**
     * Set 软件id
     * @param SoftwareId 软件id
     */
    public void setSoftwareId(Long SoftwareId) {
        this.SoftwareId = SoftwareId;
    }

    /**
     * Get 0:win 2:mac 
     * @return OsType 0:win 2:mac
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 0:win 2:mac
     * @param OsType 0:win 2:mac
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    public AggrSoftDeviceRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggrSoftDeviceRow(AggrSoftDeviceRow source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.LastLoginAccount != null) {
            this.LastLoginAccount = new String(source.LastLoginAccount);
        }
        if (source.DeviceUserName != null) {
            this.DeviceUserName = new String(source.DeviceUserName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.PiracyRisk != null) {
            this.PiracyRisk = new Long(source.PiracyRisk);
        }
        if (source.PiracyReason != null) {
            this.PiracyReason = new String(source.PiracyReason);
        }
        if (source.InstallTime != null) {
            this.InstallTime = new String(source.InstallTime);
        }
        if (source.UserPath != null) {
            this.UserPath = new String(source.UserPath);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.MAC != null) {
            this.MAC = new String(source.MAC);
        }
        if (source.UseTime != null) {
            this.UseTime = new Long(source.UseTime);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new Long(source.DeviceId);
        }
        if (source.FullSoftName != null) {
            this.FullSoftName = new String(source.FullSoftName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.NewVersion != null) {
            this.NewVersion = new String(source.NewVersion);
        }
        if (source.UpgradeSoftId != null) {
            this.UpgradeSoftId = new Long(source.UpgradeSoftId);
        }
        if (source.RemarkName != null) {
            this.RemarkName = new String(source.RemarkName);
        }
        if (source.SoftwareId != null) {
            this.SoftwareId = new Long(source.SoftwareId);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "LastLoginAccount", this.LastLoginAccount);
        this.setParamSimple(map, prefix + "DeviceUserName", this.DeviceUserName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "PiracyRisk", this.PiracyRisk);
        this.setParamSimple(map, prefix + "PiracyReason", this.PiracyReason);
        this.setParamSimple(map, prefix + "InstallTime", this.InstallTime);
        this.setParamSimple(map, prefix + "UserPath", this.UserPath);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "MAC", this.MAC);
        this.setParamSimple(map, prefix + "UseTime", this.UseTime);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "FullSoftName", this.FullSoftName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "NewVersion", this.NewVersion);
        this.setParamSimple(map, prefix + "UpgradeSoftId", this.UpgradeSoftId);
        this.setParamSimple(map, prefix + "RemarkName", this.RemarkName);
        this.setParamSimple(map, prefix + "SoftwareId", this.SoftwareId);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

