/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNotebookRequest extends AbstractModel{

    /**
    * 名称。不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 计算资源付费模式 ，可选值为：
PREPAID：预付费，即包年包月
POSTPAID_BY_HOUR：按小时后付费
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 计算资源配置
    */
    @SerializedName("ResourceConf")
    @Expose
    private ResourceConf ResourceConf;

    /**
    * 是否上报日志
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * 是否ROOT权限
    */
    @SerializedName("RootAccess")
    @Expose
    private Boolean RootAccess;

    /**
    * 是否自动停止
    */
    @SerializedName("AutoStopping")
    @Expose
    private Boolean AutoStopping;

    /**
    * 是否访问公网
    */
    @SerializedName("DirectInternetAccess")
    @Expose
    private Boolean DirectInternetAccess;

    /**
    * 资源组ID(for预付费)
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * Vpc-Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 存储的类型。取值包含： 
    FREE:    预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
    */
    @SerializedName("VolumeSourceType")
    @Expose
    private String VolumeSourceType;

    /**
    * 存储卷大小，单位GB
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * CFS存储的配置
    */
    @SerializedName("VolumeSourceCFS")
    @Expose
    private CFSConfig VolumeSourceCFS;

    /**
    * 日志配置
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * 生命周期脚本的ID
    */
    @SerializedName("LifecycleScriptId")
    @Expose
    private String LifecycleScriptId;

    /**
    * 默认GIT存储库的ID
    */
    @SerializedName("DefaultCodeRepoId")
    @Expose
    private String DefaultCodeRepoId;

    /**
    * 其他GIT存储库的ID，最多3个
    */
    @SerializedName("AdditionalCodeRepoIds")
    @Expose
    private String [] AdditionalCodeRepoIds;

    /**
    * 自动停止时间，单位小时
    */
    @SerializedName("AutomaticStopTime")
    @Expose
    private Long AutomaticStopTime;

    /**
    * 标签配置
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 数据配置
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * 镜像信息
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 镜像类型
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
     * Get 名称。不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头 
     * @return Name 名称。不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称。不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     * @param Name 名称。不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 计算资源付费模式 ，可选值为：
PREPAID：预付费，即包年包月
POSTPAID_BY_HOUR：按小时后付费 
     * @return ChargeType 计算资源付费模式 ，可选值为：
PREPAID：预付费，即包年包月
POSTPAID_BY_HOUR：按小时后付费
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计算资源付费模式 ，可选值为：
PREPAID：预付费，即包年包月
POSTPAID_BY_HOUR：按小时后付费
     * @param ChargeType 计算资源付费模式 ，可选值为：
PREPAID：预付费，即包年包月
POSTPAID_BY_HOUR：按小时后付费
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 计算资源配置 
     * @return ResourceConf 计算资源配置
     */
    public ResourceConf getResourceConf() {
        return this.ResourceConf;
    }

    /**
     * Set 计算资源配置
     * @param ResourceConf 计算资源配置
     */
    public void setResourceConf(ResourceConf ResourceConf) {
        this.ResourceConf = ResourceConf;
    }

    /**
     * Get 是否上报日志 
     * @return LogEnable 是否上报日志
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set 是否上报日志
     * @param LogEnable 是否上报日志
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get 是否ROOT权限 
     * @return RootAccess 是否ROOT权限
     */
    public Boolean getRootAccess() {
        return this.RootAccess;
    }

    /**
     * Set 是否ROOT权限
     * @param RootAccess 是否ROOT权限
     */
    public void setRootAccess(Boolean RootAccess) {
        this.RootAccess = RootAccess;
    }

    /**
     * Get 是否自动停止 
     * @return AutoStopping 是否自动停止
     */
    public Boolean getAutoStopping() {
        return this.AutoStopping;
    }

    /**
     * Set 是否自动停止
     * @param AutoStopping 是否自动停止
     */
    public void setAutoStopping(Boolean AutoStopping) {
        this.AutoStopping = AutoStopping;
    }

    /**
     * Get 是否访问公网 
     * @return DirectInternetAccess 是否访问公网
     */
    public Boolean getDirectInternetAccess() {
        return this.DirectInternetAccess;
    }

    /**
     * Set 是否访问公网
     * @param DirectInternetAccess 是否访问公网
     */
    public void setDirectInternetAccess(Boolean DirectInternetAccess) {
        this.DirectInternetAccess = DirectInternetAccess;
    }

    /**
     * Get 资源组ID(for预付费) 
     * @return ResourceGroupId 资源组ID(for预付费)
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组ID(for预付费)
     * @param ResourceGroupId 资源组ID(for预付费)
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get Vpc-Id 
     * @return VpcId Vpc-Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc-Id
     * @param VpcId Vpc-Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网Id 
     * @return SubnetId 子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id
     * @param SubnetId 子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 存储的类型。取值包含： 
    FREE:    预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo 
     * @return VolumeSourceType 存储的类型。取值包含： 
    FREE:    预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
     */
    public String getVolumeSourceType() {
        return this.VolumeSourceType;
    }

    /**
     * Set 存储的类型。取值包含： 
    FREE:    预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
     * @param VolumeSourceType 存储的类型。取值包含： 
    FREE:    预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
     */
    public void setVolumeSourceType(String VolumeSourceType) {
        this.VolumeSourceType = VolumeSourceType;
    }

    /**
     * Get 存储卷大小，单位GB 
     * @return VolumeSizeInGB 存储卷大小，单位GB
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set 存储卷大小，单位GB
     * @param VolumeSizeInGB 存储卷大小，单位GB
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
    }

    /**
     * Get CFS存储的配置 
     * @return VolumeSourceCFS CFS存储的配置
     */
    public CFSConfig getVolumeSourceCFS() {
        return this.VolumeSourceCFS;
    }

    /**
     * Set CFS存储的配置
     * @param VolumeSourceCFS CFS存储的配置
     */
    public void setVolumeSourceCFS(CFSConfig VolumeSourceCFS) {
        this.VolumeSourceCFS = VolumeSourceCFS;
    }

    /**
     * Get 日志配置 
     * @return LogConfig 日志配置
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set 日志配置
     * @param LogConfig 日志配置
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get 生命周期脚本的ID 
     * @return LifecycleScriptId 生命周期脚本的ID
     */
    public String getLifecycleScriptId() {
        return this.LifecycleScriptId;
    }

    /**
     * Set 生命周期脚本的ID
     * @param LifecycleScriptId 生命周期脚本的ID
     */
    public void setLifecycleScriptId(String LifecycleScriptId) {
        this.LifecycleScriptId = LifecycleScriptId;
    }

    /**
     * Get 默认GIT存储库的ID 
     * @return DefaultCodeRepoId 默认GIT存储库的ID
     */
    public String getDefaultCodeRepoId() {
        return this.DefaultCodeRepoId;
    }

    /**
     * Set 默认GIT存储库的ID
     * @param DefaultCodeRepoId 默认GIT存储库的ID
     */
    public void setDefaultCodeRepoId(String DefaultCodeRepoId) {
        this.DefaultCodeRepoId = DefaultCodeRepoId;
    }

    /**
     * Get 其他GIT存储库的ID，最多3个 
     * @return AdditionalCodeRepoIds 其他GIT存储库的ID，最多3个
     */
    public String [] getAdditionalCodeRepoIds() {
        return this.AdditionalCodeRepoIds;
    }

    /**
     * Set 其他GIT存储库的ID，最多3个
     * @param AdditionalCodeRepoIds 其他GIT存储库的ID，最多3个
     */
    public void setAdditionalCodeRepoIds(String [] AdditionalCodeRepoIds) {
        this.AdditionalCodeRepoIds = AdditionalCodeRepoIds;
    }

    /**
     * Get 自动停止时间，单位小时 
     * @return AutomaticStopTime 自动停止时间，单位小时
     */
    public Long getAutomaticStopTime() {
        return this.AutomaticStopTime;
    }

    /**
     * Set 自动停止时间，单位小时
     * @param AutomaticStopTime 自动停止时间，单位小时
     */
    public void setAutomaticStopTime(Long AutomaticStopTime) {
        this.AutomaticStopTime = AutomaticStopTime;
    }

    /**
     * Get 标签配置 
     * @return Tags 标签配置
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签配置
     * @param Tags 标签配置
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 数据配置 
     * @return DataConfigs 数据配置
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set 数据配置
     * @param DataConfigs 数据配置
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get 镜像信息 
     * @return ImageInfo 镜像信息
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 镜像信息
     * @param ImageInfo 镜像信息
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 镜像类型 
     * @return ImageType 镜像类型
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型
     * @param ImageType 镜像类型
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public CreateNotebookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNotebookRequest(CreateNotebookRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceConf != null) {
            this.ResourceConf = new ResourceConf(source.ResourceConf);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
        }
        if (source.RootAccess != null) {
            this.RootAccess = new Boolean(source.RootAccess);
        }
        if (source.AutoStopping != null) {
            this.AutoStopping = new Boolean(source.AutoStopping);
        }
        if (source.DirectInternetAccess != null) {
            this.DirectInternetAccess = new Boolean(source.DirectInternetAccess);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VolumeSourceType != null) {
            this.VolumeSourceType = new String(source.VolumeSourceType);
        }
        if (source.VolumeSizeInGB != null) {
            this.VolumeSizeInGB = new Long(source.VolumeSizeInGB);
        }
        if (source.VolumeSourceCFS != null) {
            this.VolumeSourceCFS = new CFSConfig(source.VolumeSourceCFS);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
        if (source.LifecycleScriptId != null) {
            this.LifecycleScriptId = new String(source.LifecycleScriptId);
        }
        if (source.DefaultCodeRepoId != null) {
            this.DefaultCodeRepoId = new String(source.DefaultCodeRepoId);
        }
        if (source.AdditionalCodeRepoIds != null) {
            this.AdditionalCodeRepoIds = new String[source.AdditionalCodeRepoIds.length];
            for (int i = 0; i < source.AdditionalCodeRepoIds.length; i++) {
                this.AdditionalCodeRepoIds[i] = new String(source.AdditionalCodeRepoIds[i]);
            }
        }
        if (source.AutomaticStopTime != null) {
            this.AutomaticStopTime = new Long(source.AutomaticStopTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DataConfigs != null) {
            this.DataConfigs = new DataConfig[source.DataConfigs.length];
            for (int i = 0; i < source.DataConfigs.length; i++) {
                this.DataConfigs[i] = new DataConfig(source.DataConfigs[i]);
            }
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "ResourceConf.", this.ResourceConf);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamSimple(map, prefix + "RootAccess", this.RootAccess);
        this.setParamSimple(map, prefix + "AutoStopping", this.AutoStopping);
        this.setParamSimple(map, prefix + "DirectInternetAccess", this.DirectInternetAccess);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VolumeSourceType", this.VolumeSourceType);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamObj(map, prefix + "VolumeSourceCFS.", this.VolumeSourceCFS);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "LifecycleScriptId", this.LifecycleScriptId);
        this.setParamSimple(map, prefix + "DefaultCodeRepoId", this.DefaultCodeRepoId);
        this.setParamArraySimple(map, prefix + "AdditionalCodeRepoIds.", this.AdditionalCodeRepoIds);
        this.setParamSimple(map, prefix + "AutomaticStopTime", this.AutomaticStopTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "DataConfigs.", this.DataConfigs);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);

    }
}

