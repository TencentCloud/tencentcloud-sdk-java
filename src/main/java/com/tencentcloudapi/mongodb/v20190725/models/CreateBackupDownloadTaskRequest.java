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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupDownloadTaskRequest extends AbstractModel {

    /**
    * 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要下载的备份文件名。请通过 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 接口获取。
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 指定要下载的副本集节点 ID 或分片集群的分片节点 ID 列表。
- 如副本集实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0，可下载全量数据。
- 如分片集群实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0&BackupSets.1=cmgo-p8vnipr5_1，即下载分片0和分片1的数据。分片集群如需全量下载，请按示例方式传入全部分片名称。
    */
    @SerializedName("BackupSets")
    @Expose
    private ReplicaSetInfo [] BackupSets;

    /**
     * Get 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要下载的备份文件名。请通过 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 接口获取。 
     * @return BackupName 要下载的备份文件名。请通过 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 接口获取。
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 要下载的备份文件名。请通过 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 接口获取。
     * @param BackupName 要下载的备份文件名。请通过 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 接口获取。
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 指定要下载的副本集节点 ID 或分片集群的分片节点 ID 列表。
- 如副本集实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0，可下载全量数据。
- 如分片集群实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0&BackupSets.1=cmgo-p8vnipr5_1，即下载分片0和分片1的数据。分片集群如需全量下载，请按示例方式传入全部分片名称。 
     * @return BackupSets 指定要下载的副本集节点 ID 或分片集群的分片节点 ID 列表。
- 如副本集实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0，可下载全量数据。
- 如分片集群实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0&BackupSets.1=cmgo-p8vnipr5_1，即下载分片0和分片1的数据。分片集群如需全量下载，请按示例方式传入全部分片名称。
     */
    public ReplicaSetInfo [] getBackupSets() {
        return this.BackupSets;
    }

    /**
     * Set 指定要下载的副本集节点 ID 或分片集群的分片节点 ID 列表。
- 如副本集实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0，可下载全量数据。
- 如分片集群实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0&BackupSets.1=cmgo-p8vnipr5_1，即下载分片0和分片1的数据。分片集群如需全量下载，请按示例方式传入全部分片名称。
     * @param BackupSets 指定要下载的副本集节点 ID 或分片集群的分片节点 ID 列表。
- 如副本集实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0，可下载全量数据。
- 如分片集群实例 ID 为 cmgo-p8vnipr5，示例：BackupSets.0=cmgo-p8vnipr5_0&BackupSets.1=cmgo-p8vnipr5_1，即下载分片0和分片1的数据。分片集群如需全量下载，请按示例方式传入全部分片名称。
     */
    public void setBackupSets(ReplicaSetInfo [] BackupSets) {
        this.BackupSets = BackupSets;
    }

    public CreateBackupDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupDownloadTaskRequest(CreateBackupDownloadTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupSets != null) {
            this.BackupSets = new ReplicaSetInfo[source.BackupSets.length];
            for (int i = 0; i < source.BackupSets.length; i++) {
                this.BackupSets[i] = new ReplicaSetInfo(source.BackupSets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamArrayObj(map, prefix + "BackupSets.", this.BackupSets);

    }
}

