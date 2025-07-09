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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMigrationTaskRequest extends AbstractModel {

    /**
    * 迁移任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 迁移方式标志位，默认为0。0：桶迁移；1：清单迁移
    */
    @SerializedName("MigrationType")
    @Expose
    private Long MigrationType;

    /**
    * 迁移模式，默认为0。0: 全量迁移
    */
    @SerializedName("MigrationMode")
    @Expose
    private Long MigrationMode;

    /**
    * 数据源账号的 SecretId
    */
    @SerializedName("SrcSecretId")
    @Expose
    private String SrcSecretId;

    /**
    * 数据源账号的 SecretKey
    */
    @SerializedName("SrcSecretKey")
    @Expose
    private String SrcSecretKey;

    /**
    * 文件系统实例 ID，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 文件系统路径
    */
    @SerializedName("FsPath")
    @Expose
    private String FsPath;

    /**
    * 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖
    */
    @SerializedName("CoverType")
    @Expose
    private Long CoverType;

    /**
    * 数据源服务商。COS：腾讯云COS，OSS：阿里云OSS，OBS：华为云OBS
    */
    @SerializedName("SrcService")
    @Expose
    private String SrcService;

    /**
    * 数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 数据源桶地域
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数
    */
    @SerializedName("BucketAddress")
    @Expose
    private String BucketAddress;

    /**
    * 清单地址，迁移方式为清单迁移时必填
    */
    @SerializedName("ListAddress")
    @Expose
    private String ListAddress;

    /**
    * 目标文件系统名称
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * 源桶路径，默认为 /
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

    /**
    * 迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get 迁移任务名称 
     * @return TaskName 迁移任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 迁移任务名称
     * @param TaskName 迁移任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 迁移方式标志位，默认为0。0：桶迁移；1：清单迁移 
     * @return MigrationType 迁移方式标志位，默认为0。0：桶迁移；1：清单迁移
     */
    public Long getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set 迁移方式标志位，默认为0。0：桶迁移；1：清单迁移
     * @param MigrationType 迁移方式标志位，默认为0。0：桶迁移；1：清单迁移
     */
    public void setMigrationType(Long MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get 迁移模式，默认为0。0: 全量迁移 
     * @return MigrationMode 迁移模式，默认为0。0: 全量迁移
     */
    public Long getMigrationMode() {
        return this.MigrationMode;
    }

    /**
     * Set 迁移模式，默认为0。0: 全量迁移
     * @param MigrationMode 迁移模式，默认为0。0: 全量迁移
     */
    public void setMigrationMode(Long MigrationMode) {
        this.MigrationMode = MigrationMode;
    }

    /**
     * Get 数据源账号的 SecretId 
     * @return SrcSecretId 数据源账号的 SecretId
     */
    public String getSrcSecretId() {
        return this.SrcSecretId;
    }

    /**
     * Set 数据源账号的 SecretId
     * @param SrcSecretId 数据源账号的 SecretId
     */
    public void setSrcSecretId(String SrcSecretId) {
        this.SrcSecretId = SrcSecretId;
    }

    /**
     * Get 数据源账号的 SecretKey 
     * @return SrcSecretKey 数据源账号的 SecretKey
     */
    public String getSrcSecretKey() {
        return this.SrcSecretKey;
    }

    /**
     * Set 数据源账号的 SecretKey
     * @param SrcSecretKey 数据源账号的 SecretKey
     */
    public void setSrcSecretKey(String SrcSecretKey) {
        this.SrcSecretKey = SrcSecretKey;
    }

    /**
     * Get 文件系统实例 ID，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取 
     * @return FileSystemId 文件系统实例 ID，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统实例 ID，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     * @param FileSystemId 文件系统实例 ID，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 文件系统路径 
     * @return FsPath 文件系统路径
     */
    public String getFsPath() {
        return this.FsPath;
    }

    /**
     * Set 文件系统路径
     * @param FsPath 文件系统路径
     */
    public void setFsPath(String FsPath) {
        this.FsPath = FsPath;
    }

    /**
     * Get 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖 
     * @return CoverType 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖
     */
    public Long getCoverType() {
        return this.CoverType;
    }

    /**
     * Set 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖
     * @param CoverType 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖
     */
    public void setCoverType(Long CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get 数据源服务商。COS：腾讯云COS，OSS：阿里云OSS，OBS：华为云OBS 
     * @return SrcService 数据源服务商。COS：腾讯云COS，OSS：阿里云OSS，OBS：华为云OBS
     */
    public String getSrcService() {
        return this.SrcService;
    }

    /**
     * Set 数据源服务商。COS：腾讯云COS，OSS：阿里云OSS，OBS：华为云OBS
     * @param SrcService 数据源服务商。COS：腾讯云COS，OSS：阿里云OSS，OBS：华为云OBS
     */
    public void setSrcService(String SrcService) {
        this.SrcService = SrcService;
    }

    /**
     * Get 数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数 
     * @return BucketName 数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数
     * @param BucketName 数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 数据源桶地域 
     * @return BucketRegion 数据源桶地域
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 数据源桶地域
     * @param BucketRegion 数据源桶地域
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数 
     * @return BucketAddress 数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数
     */
    public String getBucketAddress() {
        return this.BucketAddress;
    }

    /**
     * Set 数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数
     * @param BucketAddress 数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数
     */
    public void setBucketAddress(String BucketAddress) {
        this.BucketAddress = BucketAddress;
    }

    /**
     * Get 清单地址，迁移方式为清单迁移时必填 
     * @return ListAddress 清单地址，迁移方式为清单迁移时必填
     */
    public String getListAddress() {
        return this.ListAddress;
    }

    /**
     * Set 清单地址，迁移方式为清单迁移时必填
     * @param ListAddress 清单地址，迁移方式为清单迁移时必填
     */
    public void setListAddress(String ListAddress) {
        this.ListAddress = ListAddress;
    }

    /**
     * Get 目标文件系统名称 
     * @return FsName 目标文件系统名称
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set 目标文件系统名称
     * @param FsName 目标文件系统名称
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get 源桶路径，默认为 / 
     * @return BucketPath 源桶路径，默认为 /
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set 源桶路径，默认为 /
     * @param BucketPath 源桶路径，默认为 /
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
    }

    /**
     * Get 迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0 
     * @return Direction 迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0
     * @param Direction 迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public CreateMigrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMigrationTaskRequest(CreateMigrationTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.MigrationType != null) {
            this.MigrationType = new Long(source.MigrationType);
        }
        if (source.MigrationMode != null) {
            this.MigrationMode = new Long(source.MigrationMode);
        }
        if (source.SrcSecretId != null) {
            this.SrcSecretId = new String(source.SrcSecretId);
        }
        if (source.SrcSecretKey != null) {
            this.SrcSecretKey = new String(source.SrcSecretKey);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FsPath != null) {
            this.FsPath = new String(source.FsPath);
        }
        if (source.CoverType != null) {
            this.CoverType = new Long(source.CoverType);
        }
        if (source.SrcService != null) {
            this.SrcService = new String(source.SrcService);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketAddress != null) {
            this.BucketAddress = new String(source.BucketAddress);
        }
        if (source.ListAddress != null) {
            this.ListAddress = new String(source.ListAddress);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.BucketPath != null) {
            this.BucketPath = new String(source.BucketPath);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "MigrationType", this.MigrationType);
        this.setParamSimple(map, prefix + "MigrationMode", this.MigrationMode);
        this.setParamSimple(map, prefix + "SrcSecretId", this.SrcSecretId);
        this.setParamSimple(map, prefix + "SrcSecretKey", this.SrcSecretKey);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FsPath", this.FsPath);
        this.setParamSimple(map, prefix + "CoverType", this.CoverType);
        this.setParamSimple(map, prefix + "SrcService", this.SrcService);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketAddress", this.BucketAddress);
        this.setParamSimple(map, prefix + "ListAddress", this.ListAddress);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "BucketPath", this.BucketPath);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

