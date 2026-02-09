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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterDetail extends AbstractModel {

    /**
    * 是否开启公网访问
    */
    @SerializedName("IsOpenPubNetAccess")
    @Expose
    private Boolean IsOpenPubNetAccess;

    /**
    * 最大算力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * 最小算力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * TDSQL-C集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 存储用量（单位：MB）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * 最大存储量（单位：GB）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 数据库类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 数据库类型
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 公网访问状态；open开启，opening开启中，closed关闭，closing关闭中
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * 数据库集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * serverless状态
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
     * Get 是否开启公网访问 
     * @return IsOpenPubNetAccess 是否开启公网访问
     */
    public Boolean getIsOpenPubNetAccess() {
        return this.IsOpenPubNetAccess;
    }

    /**
     * Set 是否开启公网访问
     * @param IsOpenPubNetAccess 是否开启公网访问
     */
    public void setIsOpenPubNetAccess(Boolean IsOpenPubNetAccess) {
        this.IsOpenPubNetAccess = IsOpenPubNetAccess;
    }

    /**
     * Get 最大算力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxCpu 最大算力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set 最大算力
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxCpu 最大算力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get 最小算力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinCpu 最小算力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set 最小算力
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinCpu 最小算力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get TDSQL-C集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status TDSQL-C集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set TDSQL-C集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status TDSQL-C集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 存储用量（单位：MB）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedStorage 存储用量（单位：MB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set 存储用量（单位：MB）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedStorage 存储用量（单位：MB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get 最大存储量（单位：GB）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageLimit 最大存储量（单位：GB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 最大存储量（单位：GB）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageLimit 最大存储量（单位：GB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 数据库类型 
     * @return DbType 数据库类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型
     * @param DbType 数据库类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 数据库类型 
     * @return DbVersion 数据库类型
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库类型
     * @param DbVersion 数据库类型
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get 公网访问状态；open开启，opening开启中，closed关闭，closing关闭中 
     * @return WanStatus 公网访问状态；open开启，opening开启中，closed关闭，closing关闭中
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 公网访问状态；open开启，opening开启中，closed关闭，closing关闭中
     * @param WanStatus 公网访问状态；open开启，opening开启中，closed关闭，closing关闭中
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 数据库集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterStatus 数据库集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 数据库集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterStatus 数据库集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get serverless状态 
     * @return ServerlessStatus serverless状态
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set serverless状态
     * @param ServerlessStatus serverless状态
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    public ClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterDetail(ClusterDetail source) {
        if (source.IsOpenPubNetAccess != null) {
            this.IsOpenPubNetAccess = new Boolean(source.IsOpenPubNetAccess);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsOpenPubNetAccess", this.IsOpenPubNetAccess);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);

    }
}

