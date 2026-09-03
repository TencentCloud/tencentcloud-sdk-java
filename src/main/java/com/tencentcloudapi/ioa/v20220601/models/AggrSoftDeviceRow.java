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
    * <p>终端名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>最近登录账号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLoginAccount")
    @Expose
    private String LastLoginAccount;

    /**
    * <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceUserName")
    @Expose
    private String DeviceUserName;

    /**
    * <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>是否盗版</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyRisk")
    @Expose
    private Long PiracyRisk;

    /**
    * <p>盗版原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyReason")
    @Expose
    private String PiracyReason;

    /**
    * <p>安装时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstallTime")
    @Expose
    private String InstallTime;

    /**
    * <p>用户目录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserPath")
    @Expose
    private String UserPath;

    /**
    * <p>所在分组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * <p>IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * <p>MAC</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MAC")
    @Expose
    private String MAC;

    /**
    * <p>使用时长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseTime")
    @Expose
    private Long UseTime;

    /**
    * <p>设备ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * <p>软件全名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullSoftName")
    @Expose
    private String FullSoftName;

    /**
    * <p>数据ID（唯一）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>该终端此款软件可升级到的目标版本号</p>
    */
    @SerializedName("NewVersion")
    @Expose
    private String NewVersion;

    /**
    * <p>该软件对应运营配置的可升级id</p>
    */
    @SerializedName("UpgradeSoftId")
    @Expose
    private Long UpgradeSoftId;

    /**
    * <p>终端备注名</p>
    */
    @SerializedName("RemarkName")
    @Expose
    private String RemarkName;

    /**
    * <p>软件id</p>
    */
    @SerializedName("SoftwareId")
    @Expose
    private Long SoftwareId;

    /**
    * <p>0:win 2:mac</p>
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * <p>所有权</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
     * Get <p>终端名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceName <p>终端名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>终端名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceName <p>终端名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>最近登录账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLoginAccount <p>最近登录账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLoginAccount() {
        return this.LastLoginAccount;
    }

    /**
     * Set <p>最近登录账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLoginAccount <p>最近登录账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLoginAccount(String LastLoginAccount) {
        this.LastLoginAccount = LastLoginAccount;
    }

    /**
     * Get <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceUserName <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceUserName() {
        return this.DeviceUserName;
    }

    /**
     * Set <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceUserName <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceUserName(String DeviceUserName) {
        this.DeviceUserName = DeviceUserName;
    }

    /**
     * Get <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>是否盗版</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyRisk <p>是否盗版</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPiracyRisk() {
        return this.PiracyRisk;
    }

    /**
     * Set <p>是否盗版</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyRisk <p>是否盗版</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyRisk(Long PiracyRisk) {
        this.PiracyRisk = PiracyRisk;
    }

    /**
     * Get <p>盗版原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyReason <p>盗版原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPiracyReason() {
        return this.PiracyReason;
    }

    /**
     * Set <p>盗版原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyReason <p>盗版原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyReason(String PiracyReason) {
        this.PiracyReason = PiracyReason;
    }

    /**
     * Get <p>安装时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstallTime <p>安装时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstallTime() {
        return this.InstallTime;
    }

    /**
     * Set <p>安装时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstallTime <p>安装时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstallTime(String InstallTime) {
        this.InstallTime = InstallTime;
    }

    /**
     * Get <p>用户目录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserPath <p>用户目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserPath() {
        return this.UserPath;
    }

    /**
     * Set <p>用户目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserPath <p>用户目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserPath(String UserPath) {
        this.UserPath = UserPath;
    }

    /**
     * Get <p>所在分组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroup <p>所在分组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set <p>所在分组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroup <p>所在分组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get <p>IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP <p>IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set <p>IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP <p>IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get <p>MAC</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MAC <p>MAC</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMAC() {
        return this.MAC;
    }

    /**
     * Set <p>MAC</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MAC <p>MAC</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    /**
     * Get <p>使用时长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseTime <p>使用时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseTime() {
        return this.UseTime;
    }

    /**
     * Set <p>使用时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseTime <p>使用时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseTime(Long UseTime) {
        this.UseTime = UseTime;
    }

    /**
     * Get <p>设备ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId <p>设备ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId <p>设备ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>软件全名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullSoftName <p>软件全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullSoftName() {
        return this.FullSoftName;
    }

    /**
     * Set <p>软件全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullSoftName <p>软件全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullSoftName(String FullSoftName) {
        this.FullSoftName = FullSoftName;
    }

    /**
     * Get <p>数据ID（唯一）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>数据ID（唯一）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>数据ID（唯一）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>数据ID（唯一）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>该终端此款软件可升级到的目标版本号</p> 
     * @return NewVersion <p>该终端此款软件可升级到的目标版本号</p>
     */
    public String getNewVersion() {
        return this.NewVersion;
    }

    /**
     * Set <p>该终端此款软件可升级到的目标版本号</p>
     * @param NewVersion <p>该终端此款软件可升级到的目标版本号</p>
     */
    public void setNewVersion(String NewVersion) {
        this.NewVersion = NewVersion;
    }

    /**
     * Get <p>该软件对应运营配置的可升级id</p> 
     * @return UpgradeSoftId <p>该软件对应运营配置的可升级id</p>
     */
    public Long getUpgradeSoftId() {
        return this.UpgradeSoftId;
    }

    /**
     * Set <p>该软件对应运营配置的可升级id</p>
     * @param UpgradeSoftId <p>该软件对应运营配置的可升级id</p>
     */
    public void setUpgradeSoftId(Long UpgradeSoftId) {
        this.UpgradeSoftId = UpgradeSoftId;
    }

    /**
     * Get <p>终端备注名</p> 
     * @return RemarkName <p>终端备注名</p>
     */
    public String getRemarkName() {
        return this.RemarkName;
    }

    /**
     * Set <p>终端备注名</p>
     * @param RemarkName <p>终端备注名</p>
     */
    public void setRemarkName(String RemarkName) {
        this.RemarkName = RemarkName;
    }

    /**
     * Get <p>软件id</p> 
     * @return SoftwareId <p>软件id</p>
     */
    public Long getSoftwareId() {
        return this.SoftwareId;
    }

    /**
     * Set <p>软件id</p>
     * @param SoftwareId <p>软件id</p>
     */
    public void setSoftwareId(Long SoftwareId) {
        this.SoftwareId = SoftwareId;
    }

    /**
     * Get <p>0:win 2:mac</p> 
     * @return OsType <p>0:win 2:mac</p>
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>0:win 2:mac</p>
     * @param OsType <p>0:win 2:mac</p>
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>所有权</p> 
     * @return AssetType <p>所有权</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>所有权</p>
     * @param AssetType <p>所有权</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
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
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
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
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

