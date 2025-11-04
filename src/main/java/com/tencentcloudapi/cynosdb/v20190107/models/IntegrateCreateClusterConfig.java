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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrateCreateClusterConfig extends AbstractModel {

    /**
    * binlog保留天数[7,1830]
    */
    @SerializedName("BinlogSaveDays")
    @Expose
    private Long BinlogSaveDays;

    /**
    * 备份保留天数[7,1830]
    */
    @SerializedName("BackupSaveDays")
    @Expose
    private Long BackupSaveDays;

    /**
    * 半同步超时时间[1000,4294967295]
    */
    @SerializedName("SemiSyncTimeout")
    @Expose
    private Long SemiSyncTimeout;

    /**
    * proxy连接地址配置信息
    */
    @SerializedName("ProxyEndPointConfigs")
    @Expose
    private ProxyEndPointConfigInfo [] ProxyEndPointConfigs;

    /**
     * Get binlog保留天数[7,1830] 
     * @return BinlogSaveDays binlog保留天数[7,1830]
     */
    public Long getBinlogSaveDays() {
        return this.BinlogSaveDays;
    }

    /**
     * Set binlog保留天数[7,1830]
     * @param BinlogSaveDays binlog保留天数[7,1830]
     */
    public void setBinlogSaveDays(Long BinlogSaveDays) {
        this.BinlogSaveDays = BinlogSaveDays;
    }

    /**
     * Get 备份保留天数[7,1830] 
     * @return BackupSaveDays 备份保留天数[7,1830]
     */
    public Long getBackupSaveDays() {
        return this.BackupSaveDays;
    }

    /**
     * Set 备份保留天数[7,1830]
     * @param BackupSaveDays 备份保留天数[7,1830]
     */
    public void setBackupSaveDays(Long BackupSaveDays) {
        this.BackupSaveDays = BackupSaveDays;
    }

    /**
     * Get 半同步超时时间[1000,4294967295] 
     * @return SemiSyncTimeout 半同步超时时间[1000,4294967295]
     */
    public Long getSemiSyncTimeout() {
        return this.SemiSyncTimeout;
    }

    /**
     * Set 半同步超时时间[1000,4294967295]
     * @param SemiSyncTimeout 半同步超时时间[1000,4294967295]
     */
    public void setSemiSyncTimeout(Long SemiSyncTimeout) {
        this.SemiSyncTimeout = SemiSyncTimeout;
    }

    /**
     * Get proxy连接地址配置信息 
     * @return ProxyEndPointConfigs proxy连接地址配置信息
     */
    public ProxyEndPointConfigInfo [] getProxyEndPointConfigs() {
        return this.ProxyEndPointConfigs;
    }

    /**
     * Set proxy连接地址配置信息
     * @param ProxyEndPointConfigs proxy连接地址配置信息
     */
    public void setProxyEndPointConfigs(ProxyEndPointConfigInfo [] ProxyEndPointConfigs) {
        this.ProxyEndPointConfigs = ProxyEndPointConfigs;
    }

    public IntegrateCreateClusterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrateCreateClusterConfig(IntegrateCreateClusterConfig source) {
        if (source.BinlogSaveDays != null) {
            this.BinlogSaveDays = new Long(source.BinlogSaveDays);
        }
        if (source.BackupSaveDays != null) {
            this.BackupSaveDays = new Long(source.BackupSaveDays);
        }
        if (source.SemiSyncTimeout != null) {
            this.SemiSyncTimeout = new Long(source.SemiSyncTimeout);
        }
        if (source.ProxyEndPointConfigs != null) {
            this.ProxyEndPointConfigs = new ProxyEndPointConfigInfo[source.ProxyEndPointConfigs.length];
            for (int i = 0; i < source.ProxyEndPointConfigs.length; i++) {
                this.ProxyEndPointConfigs[i] = new ProxyEndPointConfigInfo(source.ProxyEndPointConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BinlogSaveDays", this.BinlogSaveDays);
        this.setParamSimple(map, prefix + "BackupSaveDays", this.BackupSaveDays);
        this.setParamSimple(map, prefix + "SemiSyncTimeout", this.SemiSyncTimeout);
        this.setParamArrayObj(map, prefix + "ProxyEndPointConfigs.", this.ProxyEndPointConfigs);

    }
}

