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

public class DescribeBackupListByVaultItem extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 备份信息
    */
    @SerializedName("BackupFileInfo")
    @Expose
    private BackupFileInfo BackupFileInfo;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群name 
     * @return ClusterName 集群name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群name
     * @param ClusterName 集群name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 备份信息 
     * @return BackupFileInfo 备份信息
     */
    public BackupFileInfo getBackupFileInfo() {
        return this.BackupFileInfo;
    }

    /**
     * Set 备份信息
     * @param BackupFileInfo 备份信息
     */
    public void setBackupFileInfo(BackupFileInfo BackupFileInfo) {
        this.BackupFileInfo = BackupFileInfo;
    }

    public DescribeBackupListByVaultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupListByVaultItem(DescribeBackupListByVaultItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.BackupFileInfo != null) {
            this.BackupFileInfo = new BackupFileInfo(source.BackupFileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamObj(map, prefix + "BackupFileInfo.", this.BackupFileInfo);

    }
}

