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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EtcdAdvancedSettings extends AbstractModel {

    /**
    * 安全相关设置
    */
    @SerializedName("SecuritySettings")
    @Expose
    private EtcdSecuritySettings SecuritySettings;

    /**
    * 自动压缩设置
    */
    @SerializedName("AutoCompactionSettings")
    @Expose
    private EtcdAutoCompactionSettings AutoCompactionSettings;

    /**
    * 监控设置
    */
    @SerializedName("MonitorSettings")
    @Expose
    private EtcdMonitorSettings MonitorSettings;

    /**
    * 备份相关设置
    */
    @SerializedName("BackupSettings")
    @Expose
    private EtcdBackupSettings BackupSettings;

    /**
    * 自定义域名
    */
    @SerializedName("CustomDomains")
    @Expose
    private String CustomDomains;

    /**
    * 自定义ip
    */
    @SerializedName("CustomIPs")
    @Expose
    private String CustomIPs;

    /**
     * Get 安全相关设置 
     * @return SecuritySettings 安全相关设置
     */
    public EtcdSecuritySettings getSecuritySettings() {
        return this.SecuritySettings;
    }

    /**
     * Set 安全相关设置
     * @param SecuritySettings 安全相关设置
     */
    public void setSecuritySettings(EtcdSecuritySettings SecuritySettings) {
        this.SecuritySettings = SecuritySettings;
    }

    /**
     * Get 自动压缩设置 
     * @return AutoCompactionSettings 自动压缩设置
     */
    public EtcdAutoCompactionSettings getAutoCompactionSettings() {
        return this.AutoCompactionSettings;
    }

    /**
     * Set 自动压缩设置
     * @param AutoCompactionSettings 自动压缩设置
     */
    public void setAutoCompactionSettings(EtcdAutoCompactionSettings AutoCompactionSettings) {
        this.AutoCompactionSettings = AutoCompactionSettings;
    }

    /**
     * Get 监控设置 
     * @return MonitorSettings 监控设置
     */
    public EtcdMonitorSettings getMonitorSettings() {
        return this.MonitorSettings;
    }

    /**
     * Set 监控设置
     * @param MonitorSettings 监控设置
     */
    public void setMonitorSettings(EtcdMonitorSettings MonitorSettings) {
        this.MonitorSettings = MonitorSettings;
    }

    /**
     * Get 备份相关设置 
     * @return BackupSettings 备份相关设置
     */
    public EtcdBackupSettings getBackupSettings() {
        return this.BackupSettings;
    }

    /**
     * Set 备份相关设置
     * @param BackupSettings 备份相关设置
     */
    public void setBackupSettings(EtcdBackupSettings BackupSettings) {
        this.BackupSettings = BackupSettings;
    }

    /**
     * Get 自定义域名 
     * @return CustomDomains 自定义域名
     */
    public String getCustomDomains() {
        return this.CustomDomains;
    }

    /**
     * Set 自定义域名
     * @param CustomDomains 自定义域名
     */
    public void setCustomDomains(String CustomDomains) {
        this.CustomDomains = CustomDomains;
    }

    /**
     * Get 自定义ip 
     * @return CustomIPs 自定义ip
     */
    public String getCustomIPs() {
        return this.CustomIPs;
    }

    /**
     * Set 自定义ip
     * @param CustomIPs 自定义ip
     */
    public void setCustomIPs(String CustomIPs) {
        this.CustomIPs = CustomIPs;
    }

    public EtcdAdvancedSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EtcdAdvancedSettings(EtcdAdvancedSettings source) {
        if (source.SecuritySettings != null) {
            this.SecuritySettings = new EtcdSecuritySettings(source.SecuritySettings);
        }
        if (source.AutoCompactionSettings != null) {
            this.AutoCompactionSettings = new EtcdAutoCompactionSettings(source.AutoCompactionSettings);
        }
        if (source.MonitorSettings != null) {
            this.MonitorSettings = new EtcdMonitorSettings(source.MonitorSettings);
        }
        if (source.BackupSettings != null) {
            this.BackupSettings = new EtcdBackupSettings(source.BackupSettings);
        }
        if (source.CustomDomains != null) {
            this.CustomDomains = new String(source.CustomDomains);
        }
        if (source.CustomIPs != null) {
            this.CustomIPs = new String(source.CustomIPs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecuritySettings.", this.SecuritySettings);
        this.setParamObj(map, prefix + "AutoCompactionSettings.", this.AutoCompactionSettings);
        this.setParamObj(map, prefix + "MonitorSettings.", this.MonitorSettings);
        this.setParamObj(map, prefix + "BackupSettings.", this.BackupSettings);
        this.setParamSimple(map, prefix + "CustomDomains", this.CustomDomains);
        this.setParamSimple(map, prefix + "CustomIPs", this.CustomIPs);

    }
}

