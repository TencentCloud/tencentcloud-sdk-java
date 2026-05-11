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
    * <p>实例名称</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>快照名称</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>索引名称</p>
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * <p>0 腾讯云仓库; 1 客户仓库</p>
    */
    @SerializedName("EsRepositoryType")
    @Expose
    private Long EsRepositoryType;

    /**
    * <p>客户快照仓库名称</p>
    */
    @SerializedName("UserEsRepository")
    @Expose
    private String UserEsRepository;

    /**
    * <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
    */
    @SerializedName("StorageDuration")
    @Expose
    private Long StorageDuration;

    /**
    * <p>备份锁定 0 不锁定; 1 锁定</p>
    */
    @SerializedName("CosRetention")
    @Expose
    private Long CosRetention;

    /**
    * <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
    */
    @SerializedName("RetainUntilDate")
    @Expose
    private String RetainUntilDate;

    /**
    * <p>锁定宽限期,单位天</p>
    */
    @SerializedName("RetentionGraceTime")
    @Expose
    private Long RetentionGraceTime;

    /**
    * <p>跨地域备份 0 不跨地域; 1 跨地域</p>
    */
    @SerializedName("RemoteCos")
    @Expose
    private Long RemoteCos;

    /**
    * <p>跨地域备份地域名称 ap-guangzhou</p>
    */
    @SerializedName("RemoteCosRegion")
    @Expose
    private String RemoteCosRegion;

    /**
    * <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
    */
    @SerializedName("MultiAz")
    @Expose
    private Long MultiAz;

    /**
    * <p>快照创建速率（单位mb）</p>
    */
    @SerializedName("MaxSnapshotPerSec")
    @Expose
    private String MaxSnapshotPerSec;

    /**
     * Get <p>实例名称</p> 
     * @return InstanceId <p>实例名称</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceId <p>实例名称</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>快照名称</p> 
     * @return SnapshotName <p>快照名称</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>快照名称</p>
     * @param SnapshotName <p>快照名称</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>索引名称</p> 
     * @return Indices <p>索引名称</p>
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set <p>索引名称</p>
     * @param Indices <p>索引名称</p>
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get <p>0 腾讯云仓库; 1 客户仓库</p> 
     * @return EsRepositoryType <p>0 腾讯云仓库; 1 客户仓库</p>
     */
    public Long getEsRepositoryType() {
        return this.EsRepositoryType;
    }

    /**
     * Set <p>0 腾讯云仓库; 1 客户仓库</p>
     * @param EsRepositoryType <p>0 腾讯云仓库; 1 客户仓库</p>
     */
    public void setEsRepositoryType(Long EsRepositoryType) {
        this.EsRepositoryType = EsRepositoryType;
    }

    /**
     * Get <p>客户快照仓库名称</p> 
     * @return UserEsRepository <p>客户快照仓库名称</p>
     */
    public String getUserEsRepository() {
        return this.UserEsRepository;
    }

    /**
     * Set <p>客户快照仓库名称</p>
     * @param UserEsRepository <p>客户快照仓库名称</p>
     */
    public void setUserEsRepository(String UserEsRepository) {
        this.UserEsRepository = UserEsRepository;
    }

    /**
     * Get <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p> 
     * @return StorageDuration <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
     */
    public Long getStorageDuration() {
        return this.StorageDuration;
    }

    /**
     * Set <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
     * @param StorageDuration <p>快照存储周期 单位天，范围[0, INF), 如果没有设置则默认7天</p>
     */
    public void setStorageDuration(Long StorageDuration) {
        this.StorageDuration = StorageDuration;
    }

    /**
     * Get <p>备份锁定 0 不锁定; 1 锁定</p> 
     * @return CosRetention <p>备份锁定 0 不锁定; 1 锁定</p>
     */
    public Long getCosRetention() {
        return this.CosRetention;
    }

    /**
     * Set <p>备份锁定 0 不锁定; 1 锁定</p>
     * @param CosRetention <p>备份锁定 0 不锁定; 1 锁定</p>
     */
    public void setCosRetention(Long CosRetention) {
        this.CosRetention = CosRetention;
    }

    /**
     * Get <p>锁定截止日期 2022-12-10T08:34:48.000Z</p> 
     * @return RetainUntilDate <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
     */
    public String getRetainUntilDate() {
        return this.RetainUntilDate;
    }

    /**
     * Set <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
     * @param RetainUntilDate <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
     */
    public void setRetainUntilDate(String RetainUntilDate) {
        this.RetainUntilDate = RetainUntilDate;
    }

    /**
     * Get <p>锁定宽限期,单位天</p> 
     * @return RetentionGraceTime <p>锁定宽限期,单位天</p>
     */
    public Long getRetentionGraceTime() {
        return this.RetentionGraceTime;
    }

    /**
     * Set <p>锁定宽限期,单位天</p>
     * @param RetentionGraceTime <p>锁定宽限期,单位天</p>
     */
    public void setRetentionGraceTime(Long RetentionGraceTime) {
        this.RetentionGraceTime = RetentionGraceTime;
    }

    /**
     * Get <p>跨地域备份 0 不跨地域; 1 跨地域</p> 
     * @return RemoteCos <p>跨地域备份 0 不跨地域; 1 跨地域</p>
     */
    public Long getRemoteCos() {
        return this.RemoteCos;
    }

    /**
     * Set <p>跨地域备份 0 不跨地域; 1 跨地域</p>
     * @param RemoteCos <p>跨地域备份 0 不跨地域; 1 跨地域</p>
     */
    public void setRemoteCos(Long RemoteCos) {
        this.RemoteCos = RemoteCos;
    }

    /**
     * Get <p>跨地域备份地域名称 ap-guangzhou</p> 
     * @return RemoteCosRegion <p>跨地域备份地域名称 ap-guangzhou</p>
     */
    public String getRemoteCosRegion() {
        return this.RemoteCosRegion;
    }

    /**
     * Set <p>跨地域备份地域名称 ap-guangzhou</p>
     * @param RemoteCosRegion <p>跨地域备份地域名称 ap-guangzhou</p>
     */
    public void setRemoteCosRegion(String RemoteCosRegion) {
        this.RemoteCosRegion = RemoteCosRegion;
    }

    /**
     * Get <p>cos多AZ备份 0 单AZ; 1 多AZ</p> 
     * @return MultiAz <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
     */
    public Long getMultiAz() {
        return this.MultiAz;
    }

    /**
     * Set <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
     * @param MultiAz <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
     */
    public void setMultiAz(Long MultiAz) {
        this.MultiAz = MultiAz;
    }

    /**
     * Get <p>快照创建速率（单位mb）</p> 
     * @return MaxSnapshotPerSec <p>快照创建速率（单位mb）</p>
     */
    public String getMaxSnapshotPerSec() {
        return this.MaxSnapshotPerSec;
    }

    /**
     * Set <p>快照创建速率（单位mb）</p>
     * @param MaxSnapshotPerSec <p>快照创建速率（单位mb）</p>
     */
    public void setMaxSnapshotPerSec(String MaxSnapshotPerSec) {
        this.MaxSnapshotPerSec = MaxSnapshotPerSec;
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
        if (source.MultiAz != null) {
            this.MultiAz = new Long(source.MultiAz);
        }
        if (source.MaxSnapshotPerSec != null) {
            this.MaxSnapshotPerSec = new String(source.MaxSnapshotPerSec);
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
        this.setParamSimple(map, prefix + "MultiAz", this.MultiAz);
        this.setParamSimple(map, prefix + "MaxSnapshotPerSec", this.MaxSnapshotPerSec);

    }
}

