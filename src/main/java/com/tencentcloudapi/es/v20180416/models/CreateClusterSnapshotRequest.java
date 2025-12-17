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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterSnapshotRequest extends AbstractModel {

    /**
    * 实例名称
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 索引名称
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * 0 腾讯云仓库; 1 客户仓库
    */
    @SerializedName("EsRepositoryType")
    @Expose
    private Long EsRepositoryType;

    /**
    * 客户快照仓库名称
    */
    @SerializedName("UserEsRepository")
    @Expose
    private String UserEsRepository;

    /**
    * 快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天
    */
    @SerializedName("StorageDuration")
    @Expose
    private Long StorageDuration;

    /**
    * 备份锁定 0 不锁定; 1 锁定
    */
    @SerializedName("CosRetention")
    @Expose
    private Long CosRetention;

    /**
    * 锁定截止日期 2022-12-10T08:34:48.000Z
    */
    @SerializedName("RetainUntilDate")
    @Expose
    private String RetainUntilDate;

    /**
    * 锁定宽限期,单位天
    */
    @SerializedName("RetentionGraceTime")
    @Expose
    private Long RetentionGraceTime;

    /**
    * 跨地域备份 0 不跨地域; 1 跨地域
    */
    @SerializedName("RemoteCos")
    @Expose
    private Long RemoteCos;

    /**
    * 跨地域备份地域名称 ap-guangzhou
    */
    @SerializedName("RemoteCosRegion")
    @Expose
    private String RemoteCosRegion;

    /**
     * Get 实例名称 
     * @return InstanceId 实例名称
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名称
     * @param InstanceId 实例名称
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 快照名称 
     * @return SnapshotName 快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
     * @param SnapshotName 快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 索引名称 
     * @return Indices 索引名称
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set 索引名称
     * @param Indices 索引名称
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get 0 腾讯云仓库; 1 客户仓库 
     * @return EsRepositoryType 0 腾讯云仓库; 1 客户仓库
     */
    public Long getEsRepositoryType() {
        return this.EsRepositoryType;
    }

    /**
     * Set 0 腾讯云仓库; 1 客户仓库
     * @param EsRepositoryType 0 腾讯云仓库; 1 客户仓库
     */
    public void setEsRepositoryType(Long EsRepositoryType) {
        this.EsRepositoryType = EsRepositoryType;
    }

    /**
     * Get 客户快照仓库名称 
     * @return UserEsRepository 客户快照仓库名称
     */
    public String getUserEsRepository() {
        return this.UserEsRepository;
    }

    /**
     * Set 客户快照仓库名称
     * @param UserEsRepository 客户快照仓库名称
     */
    public void setUserEsRepository(String UserEsRepository) {
        this.UserEsRepository = UserEsRepository;
    }

    /**
     * Get 快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天 
     * @return StorageDuration 快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天
     */
    public Long getStorageDuration() {
        return this.StorageDuration;
    }

    /**
     * Set 快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天
     * @param StorageDuration 快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天
     */
    public void setStorageDuration(Long StorageDuration) {
        this.StorageDuration = StorageDuration;
    }

    /**
     * Get 备份锁定 0 不锁定; 1 锁定 
     * @return CosRetention 备份锁定 0 不锁定; 1 锁定
     */
    public Long getCosRetention() {
        return this.CosRetention;
    }

    /**
     * Set 备份锁定 0 不锁定; 1 锁定
     * @param CosRetention 备份锁定 0 不锁定; 1 锁定
     */
    public void setCosRetention(Long CosRetention) {
        this.CosRetention = CosRetention;
    }

    /**
     * Get 锁定截止日期 2022-12-10T08:34:48.000Z 
     * @return RetainUntilDate 锁定截止日期 2022-12-10T08:34:48.000Z
     */
    public String getRetainUntilDate() {
        return this.RetainUntilDate;
    }

    /**
     * Set 锁定截止日期 2022-12-10T08:34:48.000Z
     * @param RetainUntilDate 锁定截止日期 2022-12-10T08:34:48.000Z
     */
    public void setRetainUntilDate(String RetainUntilDate) {
        this.RetainUntilDate = RetainUntilDate;
    }

    /**
     * Get 锁定宽限期,单位天 
     * @return RetentionGraceTime 锁定宽限期,单位天
     */
    public Long getRetentionGraceTime() {
        return this.RetentionGraceTime;
    }

    /**
     * Set 锁定宽限期,单位天
     * @param RetentionGraceTime 锁定宽限期,单位天
     */
    public void setRetentionGraceTime(Long RetentionGraceTime) {
        this.RetentionGraceTime = RetentionGraceTime;
    }

    /**
     * Get 跨地域备份 0 不跨地域; 1 跨地域 
     * @return RemoteCos 跨地域备份 0 不跨地域; 1 跨地域
     */
    public Long getRemoteCos() {
        return this.RemoteCos;
    }

    /**
     * Set 跨地域备份 0 不跨地域; 1 跨地域
     * @param RemoteCos 跨地域备份 0 不跨地域; 1 跨地域
     */
    public void setRemoteCos(Long RemoteCos) {
        this.RemoteCos = RemoteCos;
    }

    /**
     * Get 跨地域备份地域名称 ap-guangzhou 
     * @return RemoteCosRegion 跨地域备份地域名称 ap-guangzhou
     */
    public String getRemoteCosRegion() {
        return this.RemoteCosRegion;
    }

    /**
     * Set 跨地域备份地域名称 ap-guangzhou
     * @param RemoteCosRegion 跨地域备份地域名称 ap-guangzhou
     */
    public void setRemoteCosRegion(String RemoteCosRegion) {
        this.RemoteCosRegion = RemoteCosRegion;
    }

    public CreateClusterSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterSnapshotRequest(CreateClusterSnapshotRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.Indices != null) {
            this.Indices = new String(source.Indices);
        }
        if (source.EsRepositoryType != null) {
            this.EsRepositoryType = new Long(source.EsRepositoryType);
        }
        if (source.UserEsRepository != null) {
            this.UserEsRepository = new String(source.UserEsRepository);
        }
        if (source.StorageDuration != null) {
            this.StorageDuration = new Long(source.StorageDuration);
        }
        if (source.CosRetention != null) {
            this.CosRetention = new Long(source.CosRetention);
        }
        if (source.RetainUntilDate != null) {
            this.RetainUntilDate = new String(source.RetainUntilDate);
        }
        if (source.RetentionGraceTime != null) {
            this.RetentionGraceTime = new Long(source.RetentionGraceTime);
        }
        if (source.RemoteCos != null) {
            this.RemoteCos = new Long(source.RemoteCos);
        }
        if (source.RemoteCosRegion != null) {
            this.RemoteCosRegion = new String(source.RemoteCosRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Indices", this.Indices);
        this.setParamSimple(map, prefix + "EsRepositoryType", this.EsRepositoryType);
        this.setParamSimple(map, prefix + "UserEsRepository", this.UserEsRepository);
        this.setParamSimple(map, prefix + "StorageDuration", this.StorageDuration);
        this.setParamSimple(map, prefix + "CosRetention", this.CosRetention);
        this.setParamSimple(map, prefix + "RetainUntilDate", this.RetainUntilDate);
        this.setParamSimple(map, prefix + "RetentionGraceTime", this.RetentionGraceTime);
        this.setParamSimple(map, prefix + "RemoteCos", this.RemoteCos);
        this.setParamSimple(map, prefix + "RemoteCosRegion", this.RemoteCosRegion);

    }
}

