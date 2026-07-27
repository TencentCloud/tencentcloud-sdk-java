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
    * <p>迁移任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>迁移方式标志位，默认为0。0：桶迁移；1：清单迁移</p>
    */
    @SerializedName("MigrationType")
    @Expose
    private Long MigrationType;

    /**
    * <p>迁移模式，默认为0。0: 全量迁移</p>
    */
    @SerializedName("MigrationMode")
    @Expose
    private Long MigrationMode;

    /**
    * <p>数据源账号的 SecretId</p>
    */
    @SerializedName("SrcSecretId")
    @Expose
    private String SrcSecretId;

    /**
    * <p>数据源账号的 SecretKey</p>
    */
    @SerializedName("SrcSecretKey")
    @Expose
    private String SrcSecretKey;

    /**
    * <p>文件系统实例 ID，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>文件系统路径</p>
    */
    @SerializedName("FsPath")
    @Expose
    private String FsPath;

    /**
    * <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p>
    */
    @SerializedName("CoverType")
    @Expose
    private Long CoverType;

    /**
    * <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul>
    */
    @SerializedName("SrcService")
    @Expose
    private String SrcService;

    /**
    * <p>数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>数据源桶地域</p>
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * <p>数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p>
    */
    @SerializedName("BucketAddress")
    @Expose
    private String BucketAddress;

    /**
    * <p>清单地址，迁移方式为清单迁移时必填</p>
    */
    @SerializedName("ListAddress")
    @Expose
    private String ListAddress;

    /**
    * <p>目标文件系统名称</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>源桶路径，默认为 /</p>
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

    /**
    * <p>迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get <p>迁移任务名称</p> 
     * @return TaskName <p>迁移任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>迁移任务名称</p>
     * @param TaskName <p>迁移任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>迁移方式标志位，默认为0。0：桶迁移；1：清单迁移</p> 
     * @return MigrationType <p>迁移方式标志位，默认为0。0：桶迁移；1：清单迁移</p>
     */
    public Long getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set <p>迁移方式标志位，默认为0。0：桶迁移；1：清单迁移</p>
     * @param MigrationType <p>迁移方式标志位，默认为0。0：桶迁移；1：清单迁移</p>
     */
    public void setMigrationType(Long MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get <p>迁移模式，默认为0。0: 全量迁移</p> 
     * @return MigrationMode <p>迁移模式，默认为0。0: 全量迁移</p>
     */
    public Long getMigrationMode() {
        return this.MigrationMode;
    }

    /**
     * Set <p>迁移模式，默认为0。0: 全量迁移</p>
     * @param MigrationMode <p>迁移模式，默认为0。0: 全量迁移</p>
     */
    public void setMigrationMode(Long MigrationMode) {
        this.MigrationMode = MigrationMode;
    }

    /**
     * Get <p>数据源账号的 SecretId</p> 
     * @return SrcSecretId <p>数据源账号的 SecretId</p>
     */
    public String getSrcSecretId() {
        return this.SrcSecretId;
    }

    /**
     * Set <p>数据源账号的 SecretId</p>
     * @param SrcSecretId <p>数据源账号的 SecretId</p>
     */
    public void setSrcSecretId(String SrcSecretId) {
        this.SrcSecretId = SrcSecretId;
    }

    /**
     * Get <p>数据源账号的 SecretKey</p> 
     * @return SrcSecretKey <p>数据源账号的 SecretKey</p>
     */
    public String getSrcSecretKey() {
        return this.SrcSecretKey;
    }

    /**
     * Set <p>数据源账号的 SecretKey</p>
     * @param SrcSecretKey <p>数据源账号的 SecretKey</p>
     */
    public void setSrcSecretKey(String SrcSecretKey) {
        this.SrcSecretKey = SrcSecretKey;
    }

    /**
     * Get <p>文件系统实例 ID，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p> 
     * @return FileSystemId <p>文件系统实例 ID，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统实例 ID，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p>
     * @param FileSystemId <p>文件系统实例 ID，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>文件系统路径</p> 
     * @return FsPath <p>文件系统路径</p>
     */
    public String getFsPath() {
        return this.FsPath;
    }

    /**
     * Set <p>文件系统路径</p>
     * @param FsPath <p>文件系统路径</p>
     */
    public void setFsPath(String FsPath) {
        this.FsPath = FsPath;
    }

    /**
     * Get <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p> 
     * @return CoverType <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p>
     */
    public Long getCoverType() {
        return this.CoverType;
    }

    /**
     * Set <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p>
     * @param CoverType <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p>
     */
    public void setCoverType(Long CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul> 
     * @return SrcService <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul>
     */
    public String getSrcService() {
        return this.SrcService;
    }

    /**
     * Set <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul>
     * @param SrcService <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul>
     */
    public void setSrcService(String SrcService) {
        this.SrcService = SrcService;
    }

    /**
     * Get <p>数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p> 
     * @return BucketName <p>数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p>
     * @param BucketName <p>数据源桶名称；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>数据源桶地域</p> 
     * @return BucketRegion <p>数据源桶地域</p>
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set <p>数据源桶地域</p>
     * @param BucketRegion <p>数据源桶地域</p>
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get <p>数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p> 
     * @return BucketAddress <p>数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p>
     */
    public String getBucketAddress() {
        return this.BucketAddress;
    }

    /**
     * Set <p>数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p>
     * @param BucketAddress <p>数据源桶地址；桶迁移时，BucketName 和 BucketAddress 必填其一，清单迁移时无需填写此参数</p>
     */
    public void setBucketAddress(String BucketAddress) {
        this.BucketAddress = BucketAddress;
    }

    /**
     * Get <p>清单地址，迁移方式为清单迁移时必填</p> 
     * @return ListAddress <p>清单地址，迁移方式为清单迁移时必填</p>
     */
    public String getListAddress() {
        return this.ListAddress;
    }

    /**
     * Set <p>清单地址，迁移方式为清单迁移时必填</p>
     * @param ListAddress <p>清单地址，迁移方式为清单迁移时必填</p>
     */
    public void setListAddress(String ListAddress) {
        this.ListAddress = ListAddress;
    }

    /**
     * Get <p>目标文件系统名称</p> 
     * @return FsName <p>目标文件系统名称</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>目标文件系统名称</p>
     * @param FsName <p>目标文件系统名称</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>源桶路径，默认为 /</p> 
     * @return BucketPath <p>源桶路径，默认为 /</p>
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set <p>源桶路径，默认为 /</p>
     * @param BucketPath <p>源桶路径，默认为 /</p>
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
    }

    /**
     * Get <p>迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0</p> 
     * @return Direction <p>迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0</p>
     * @param Direction <p>迁移方向；0：对象存储迁移至文件系统，1：文件系统迁移至对象存储。默认为0</p>
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

