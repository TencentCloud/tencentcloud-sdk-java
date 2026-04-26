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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNotebookRequest extends AbstractModel {

    /**
    * <p>notebook id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>名称。不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>（不允许修改）计算资源付费模式 ，可选值为：<br>PREPAID：预付费，即包年包月<br>POSTPAID_BY_HOUR：按小时后付费</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>计算资源配置</p>
    */
    @SerializedName("ResourceConf")
    @Expose
    private ResourceConf ResourceConf;

    /**
    * <p>是否自动停止</p>
    */
    @SerializedName("AutoStopping")
    @Expose
    private Boolean AutoStopping;

    /**
    * <p>是否访问公网</p>
    */
    @SerializedName("DirectInternetAccess")
    @Expose
    private Boolean DirectInternetAccess;

    /**
    * <p>是否ROOT权限</p>
    */
    @SerializedName("RootAccess")
    @Expose
    private Boolean RootAccess;

    /**
    * <p>是否上报日志</p>
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * <p>资源组ID(for预付费)</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>（不允许修改）Vpc-Id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>（不允许修改）子网Id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>存储卷大小，单位GB</p>
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * <p>（不允许修改）存储的类型。取值包含：<br>    FREE:    预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
    */
    @SerializedName("VolumeSourceType")
    @Expose
    private String VolumeSourceType;

    /**
    * <p>（不允许修改）CFS存储的配置</p>
    */
    @SerializedName("VolumeSourceCFS")
    @Expose
    private CFSConfig VolumeSourceCFS;

    /**
    * <p>日志配置</p>
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * <p>生命周期脚本的ID</p>
    */
    @SerializedName("LifecycleScriptId")
    @Expose
    private String LifecycleScriptId;

    /**
    * <p>默认GIT存储库的ID</p>
    */
    @SerializedName("DefaultCodeRepoId")
    @Expose
    private String DefaultCodeRepoId;

    /**
    * <p>其他GIT存储库的ID，最多3个</p>
    */
    @SerializedName("AdditionalCodeRepoIds")
    @Expose
    private String [] AdditionalCodeRepoIds;

    /**
    * <p>自动停止时间，单位小时</p>
    */
    @SerializedName("AutomaticStopTime")
    @Expose
    private Long AutomaticStopTime;

    /**
    * <p>标签配置</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>数据配置，只支持WEDATA_HDFS</p>
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * <p>镜像信息</p>
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * <p>镜像类型，包括SYSTEM、TCR、CCR</p>
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * <p>SSH配置</p>
    */
    @SerializedName("SSHConfig")
    @Expose
    private SSHConfig SSHConfig;

    /**
    * <p>自定义环境变量</p>
    */
    @SerializedName("Envs")
    @Expose
    private EnvVar [] Envs;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>notebook id</p> 
     * @return Id <p>notebook id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>notebook id</p>
     * @param Id <p>notebook id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>名称。不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p> 
     * @return Name <p>名称。不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称。不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     * @param Name <p>名称。不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>（不允许修改）计算资源付费模式 ，可选值为：<br>PREPAID：预付费，即包年包月<br>POSTPAID_BY_HOUR：按小时后付费</p> 
     * @return ChargeType <p>（不允许修改）计算资源付费模式 ，可选值为：<br>PREPAID：预付费，即包年包月<br>POSTPAID_BY_HOUR：按小时后付费</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>（不允许修改）计算资源付费模式 ，可选值为：<br>PREPAID：预付费，即包年包月<br>POSTPAID_BY_HOUR：按小时后付费</p>
     * @param ChargeType <p>（不允许修改）计算资源付费模式 ，可选值为：<br>PREPAID：预付费，即包年包月<br>POSTPAID_BY_HOUR：按小时后付费</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>计算资源配置</p> 
     * @return ResourceConf <p>计算资源配置</p>
     */
    public ResourceConf getResourceConf() {
        return this.ResourceConf;
    }

    /**
     * Set <p>计算资源配置</p>
     * @param ResourceConf <p>计算资源配置</p>
     */
    public void setResourceConf(ResourceConf ResourceConf) {
        this.ResourceConf = ResourceConf;
    }

    /**
     * Get <p>是否自动停止</p> 
     * @return AutoStopping <p>是否自动停止</p>
     */
    public Boolean getAutoStopping() {
        return this.AutoStopping;
    }

    /**
     * Set <p>是否自动停止</p>
     * @param AutoStopping <p>是否自动停止</p>
     */
    public void setAutoStopping(Boolean AutoStopping) {
        this.AutoStopping = AutoStopping;
    }

    /**
     * Get <p>是否访问公网</p> 
     * @return DirectInternetAccess <p>是否访问公网</p>
     */
    public Boolean getDirectInternetAccess() {
        return this.DirectInternetAccess;
    }

    /**
     * Set <p>是否访问公网</p>
     * @param DirectInternetAccess <p>是否访问公网</p>
     */
    public void setDirectInternetAccess(Boolean DirectInternetAccess) {
        this.DirectInternetAccess = DirectInternetAccess;
    }

    /**
     * Get <p>是否ROOT权限</p> 
     * @return RootAccess <p>是否ROOT权限</p>
     */
    public Boolean getRootAccess() {
        return this.RootAccess;
    }

    /**
     * Set <p>是否ROOT权限</p>
     * @param RootAccess <p>是否ROOT权限</p>
     */
    public void setRootAccess(Boolean RootAccess) {
        this.RootAccess = RootAccess;
    }

    /**
     * Get <p>是否上报日志</p> 
     * @return LogEnable <p>是否上报日志</p>
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set <p>是否上报日志</p>
     * @param LogEnable <p>是否上报日志</p>
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get <p>资源组ID(for预付费)</p> 
     * @return ResourceGroupId <p>资源组ID(for预付费)</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>资源组ID(for预付费)</p>
     * @param ResourceGroupId <p>资源组ID(for预付费)</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>（不允许修改）Vpc-Id</p> 
     * @return VpcId <p>（不允许修改）Vpc-Id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>（不允许修改）Vpc-Id</p>
     * @param VpcId <p>（不允许修改）Vpc-Id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>（不允许修改）子网Id</p> 
     * @return SubnetId <p>（不允许修改）子网Id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>（不允许修改）子网Id</p>
     * @param SubnetId <p>（不允许修改）子网Id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>存储卷大小，单位GB</p> 
     * @return VolumeSizeInGB <p>存储卷大小，单位GB</p>
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set <p>存储卷大小，单位GB</p>
     * @param VolumeSizeInGB <p>存储卷大小，单位GB</p>
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
    }

    /**
     * Get <p>（不允许修改）存储的类型。取值包含：<br>    FREE:    预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p> 
     * @return VolumeSourceType <p>（不允许修改）存储的类型。取值包含：<br>    FREE:    预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
     */
    public String getVolumeSourceType() {
        return this.VolumeSourceType;
    }

    /**
     * Set <p>（不允许修改）存储的类型。取值包含：<br>    FREE:    预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
     * @param VolumeSourceType <p>（不允许修改）存储的类型。取值包含：<br>    FREE:    预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
     */
    public void setVolumeSourceType(String VolumeSourceType) {
        this.VolumeSourceType = VolumeSourceType;
    }

    /**
     * Get <p>（不允许修改）CFS存储的配置</p> 
     * @return VolumeSourceCFS <p>（不允许修改）CFS存储的配置</p>
     */
    public CFSConfig getVolumeSourceCFS() {
        return this.VolumeSourceCFS;
    }

    /**
     * Set <p>（不允许修改）CFS存储的配置</p>
     * @param VolumeSourceCFS <p>（不允许修改）CFS存储的配置</p>
     */
    public void setVolumeSourceCFS(CFSConfig VolumeSourceCFS) {
        this.VolumeSourceCFS = VolumeSourceCFS;
    }

    /**
     * Get <p>日志配置</p> 
     * @return LogConfig <p>日志配置</p>
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>日志配置</p>
     * @param LogConfig <p>日志配置</p>
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get <p>生命周期脚本的ID</p> 
     * @return LifecycleScriptId <p>生命周期脚本的ID</p>
     */
    public String getLifecycleScriptId() {
        return this.LifecycleScriptId;
    }

    /**
     * Set <p>生命周期脚本的ID</p>
     * @param LifecycleScriptId <p>生命周期脚本的ID</p>
     */
    public void setLifecycleScriptId(String LifecycleScriptId) {
        this.LifecycleScriptId = LifecycleScriptId;
    }

    /**
     * Get <p>默认GIT存储库的ID</p> 
     * @return DefaultCodeRepoId <p>默认GIT存储库的ID</p>
     */
    public String getDefaultCodeRepoId() {
        return this.DefaultCodeRepoId;
    }

    /**
     * Set <p>默认GIT存储库的ID</p>
     * @param DefaultCodeRepoId <p>默认GIT存储库的ID</p>
     */
    public void setDefaultCodeRepoId(String DefaultCodeRepoId) {
        this.DefaultCodeRepoId = DefaultCodeRepoId;
    }

    /**
     * Get <p>其他GIT存储库的ID，最多3个</p> 
     * @return AdditionalCodeRepoIds <p>其他GIT存储库的ID，最多3个</p>
     */
    public String [] getAdditionalCodeRepoIds() {
        return this.AdditionalCodeRepoIds;
    }

    /**
     * Set <p>其他GIT存储库的ID，最多3个</p>
     * @param AdditionalCodeRepoIds <p>其他GIT存储库的ID，最多3个</p>
     */
    public void setAdditionalCodeRepoIds(String [] AdditionalCodeRepoIds) {
        this.AdditionalCodeRepoIds = AdditionalCodeRepoIds;
    }

    /**
     * Get <p>自动停止时间，单位小时</p> 
     * @return AutomaticStopTime <p>自动停止时间，单位小时</p>
     */
    public Long getAutomaticStopTime() {
        return this.AutomaticStopTime;
    }

    /**
     * Set <p>自动停止时间，单位小时</p>
     * @param AutomaticStopTime <p>自动停止时间，单位小时</p>
     */
    public void setAutomaticStopTime(Long AutomaticStopTime) {
        this.AutomaticStopTime = AutomaticStopTime;
    }

    /**
     * Get <p>标签配置</p> 
     * @return Tags <p>标签配置</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签配置</p>
     * @param Tags <p>标签配置</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>数据配置，只支持WEDATA_HDFS</p> 
     * @return DataConfigs <p>数据配置，只支持WEDATA_HDFS</p>
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set <p>数据配置，只支持WEDATA_HDFS</p>
     * @param DataConfigs <p>数据配置，只支持WEDATA_HDFS</p>
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get <p>镜像信息</p> 
     * @return ImageInfo <p>镜像信息</p>
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set <p>镜像信息</p>
     * @param ImageInfo <p>镜像信息</p>
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get <p>镜像类型，包括SYSTEM、TCR、CCR</p> 
     * @return ImageType <p>镜像类型，包括SYSTEM、TCR、CCR</p>
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set <p>镜像类型，包括SYSTEM、TCR、CCR</p>
     * @param ImageType <p>镜像类型，包括SYSTEM、TCR、CCR</p>
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get <p>SSH配置</p> 
     * @return SSHConfig <p>SSH配置</p>
     */
    public SSHConfig getSSHConfig() {
        return this.SSHConfig;
    }

    /**
     * Set <p>SSH配置</p>
     * @param SSHConfig <p>SSH配置</p>
     */
    public void setSSHConfig(SSHConfig SSHConfig) {
        this.SSHConfig = SSHConfig;
    }

    /**
     * Get <p>自定义环境变量</p> 
     * @return Envs <p>自定义环境变量</p>
     */
    public EnvVar [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>自定义环境变量</p>
     * @param Envs <p>自定义环境变量</p>
     */
    public void setEnvs(EnvVar [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyNotebookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNotebookRequest(ModifyNotebookRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceConf != null) {
            this.ResourceConf = new ResourceConf(source.ResourceConf);
        }
        if (source.AutoStopping != null) {
            this.AutoStopping = new Boolean(source.AutoStopping);
        }
        if (source.DirectInternetAccess != null) {
            this.DirectInternetAccess = new Boolean(source.DirectInternetAccess);
        }
        if (source.RootAccess != null) {
            this.RootAccess = new Boolean(source.RootAccess);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
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
        if (source.VolumeSizeInGB != null) {
            this.VolumeSizeInGB = new Long(source.VolumeSizeInGB);
        }
        if (source.VolumeSourceType != null) {
            this.VolumeSourceType = new String(source.VolumeSourceType);
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
        if (source.SSHConfig != null) {
            this.SSHConfig = new SSHConfig(source.SSHConfig);
        }
        if (source.Envs != null) {
            this.Envs = new EnvVar[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new EnvVar(source.Envs[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "ResourceConf.", this.ResourceConf);
        this.setParamSimple(map, prefix + "AutoStopping", this.AutoStopping);
        this.setParamSimple(map, prefix + "DirectInternetAccess", this.DirectInternetAccess);
        this.setParamSimple(map, prefix + "RootAccess", this.RootAccess);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamSimple(map, prefix + "VolumeSourceType", this.VolumeSourceType);
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
        this.setParamObj(map, prefix + "SSHConfig.", this.SSHConfig);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

