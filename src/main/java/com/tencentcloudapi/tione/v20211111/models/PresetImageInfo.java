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

public class PresetImageInfo extends AbstractModel {

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>镜像仓库名称</p>
    */
    @SerializedName("ImageRepo")
    @Expose
    private String ImageRepo;

    /**
    * <p>镜像标签</p>
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * <p>镜像url地址</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>镜像的大小</p>
    */
    @SerializedName("ImageSize")
    @Expose
    private String ImageSize;

    /**
    * <p>镜像描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>适用模块</p>
    */
    @SerializedName("ApplicableModuleList")
    @Expose
    private String [] ApplicableModuleList;

    /**
    * <p>使用场景</p>
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
    * <p>框架名称</p>
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * <p>框架版本</p>
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
    * <p>芯片类型</p>
    */
    @SerializedName("ChipTypeList")
    @Expose
    private String [] ChipTypeList;

    /**
    * <p>运行库版本</p>
    */
    @SerializedName("ComputeLibVersion")
    @Expose
    private String ComputeLibVersion;

    /**
    * <p>python版本</p>
    */
    @SerializedName("PythonVersion")
    @Expose
    private String PythonVersion;

    /**
    * <p>操作系统</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>运行库列表</p>
    */
    @SerializedName("RuntimeLibList")
    @Expose
    private RuntimeLib [] RuntimeLibList;

    /**
    * <p>支持的gpu列表</p>
    */
    @SerializedName("SupportGpuList")
    @Expose
    private String [] SupportGpuList;

    /**
    * <p>扩展属性</p>
    */
    @SerializedName("ExtraAttributeList")
    @Expose
    private Attribute [] ExtraAttributeList;

    /**
    * <p>是否支持分布式部署</p>
    */
    @SerializedName("SupportDistributedDeploy")
    @Expose
    private Boolean SupportDistributedDeploy;

    /**
    * <p>是否最新稳定版本</p>
    */
    @SerializedName("IsLatestStable")
    @Expose
    private Boolean IsLatestStable;

    /**
    * <p>镜像的名称</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>镜像版本号（内部）</p>
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>录入时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>镜像类型</p><p>枚举值：</p><ul><li>TCR： TCR类型的镜像</li></ul>
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
     * Get <p>镜像id</p> 
     * @return ImageId <p>镜像id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageId <p>镜像id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>镜像仓库名称</p> 
     * @return ImageRepo <p>镜像仓库名称</p>
     */
    public String getImageRepo() {
        return this.ImageRepo;
    }

    /**
     * Set <p>镜像仓库名称</p>
     * @param ImageRepo <p>镜像仓库名称</p>
     */
    public void setImageRepo(String ImageRepo) {
        this.ImageRepo = ImageRepo;
    }

    /**
     * Get <p>镜像标签</p> 
     * @return ImageTag <p>镜像标签</p>
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set <p>镜像标签</p>
     * @param ImageTag <p>镜像标签</p>
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get <p>镜像url地址</p> 
     * @return ImageUrl <p>镜像url地址</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>镜像url地址</p>
     * @param ImageUrl <p>镜像url地址</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>镜像的大小</p> 
     * @return ImageSize <p>镜像的大小</p>
     */
    public String getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set <p>镜像的大小</p>
     * @param ImageSize <p>镜像的大小</p>
     */
    public void setImageSize(String ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get <p>镜像描述</p> 
     * @return Description <p>镜像描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>镜像描述</p>
     * @param Description <p>镜像描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>适用模块</p> 
     * @return ApplicableModuleList <p>适用模块</p>
     */
    public String [] getApplicableModuleList() {
        return this.ApplicableModuleList;
    }

    /**
     * Set <p>适用模块</p>
     * @param ApplicableModuleList <p>适用模块</p>
     */
    public void setApplicableModuleList(String [] ApplicableModuleList) {
        this.ApplicableModuleList = ApplicableModuleList;
    }

    /**
     * Get <p>使用场景</p> 
     * @return Scenario <p>使用场景</p>
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set <p>使用场景</p>
     * @param Scenario <p>使用场景</p>
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
    }

    /**
     * Get <p>框架名称</p> 
     * @return Framework <p>框架名称</p>
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set <p>框架名称</p>
     * @param Framework <p>框架名称</p>
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get <p>框架版本</p> 
     * @return FrameworkVersion <p>框架版本</p>
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set <p>框架版本</p>
     * @param FrameworkVersion <p>框架版本</p>
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    /**
     * Get <p>芯片类型</p> 
     * @return ChipTypeList <p>芯片类型</p>
     */
    public String [] getChipTypeList() {
        return this.ChipTypeList;
    }

    /**
     * Set <p>芯片类型</p>
     * @param ChipTypeList <p>芯片类型</p>
     */
    public void setChipTypeList(String [] ChipTypeList) {
        this.ChipTypeList = ChipTypeList;
    }

    /**
     * Get <p>运行库版本</p> 
     * @return ComputeLibVersion <p>运行库版本</p>
     */
    public String getComputeLibVersion() {
        return this.ComputeLibVersion;
    }

    /**
     * Set <p>运行库版本</p>
     * @param ComputeLibVersion <p>运行库版本</p>
     */
    public void setComputeLibVersion(String ComputeLibVersion) {
        this.ComputeLibVersion = ComputeLibVersion;
    }

    /**
     * Get <p>python版本</p> 
     * @return PythonVersion <p>python版本</p>
     */
    public String getPythonVersion() {
        return this.PythonVersion;
    }

    /**
     * Set <p>python版本</p>
     * @param PythonVersion <p>python版本</p>
     */
    public void setPythonVersion(String PythonVersion) {
        this.PythonVersion = PythonVersion;
    }

    /**
     * Get <p>操作系统</p> 
     * @return OS <p>操作系统</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>操作系统</p>
     * @param OS <p>操作系统</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>运行库列表</p> 
     * @return RuntimeLibList <p>运行库列表</p>
     */
    public RuntimeLib [] getRuntimeLibList() {
        return this.RuntimeLibList;
    }

    /**
     * Set <p>运行库列表</p>
     * @param RuntimeLibList <p>运行库列表</p>
     */
    public void setRuntimeLibList(RuntimeLib [] RuntimeLibList) {
        this.RuntimeLibList = RuntimeLibList;
    }

    /**
     * Get <p>支持的gpu列表</p> 
     * @return SupportGpuList <p>支持的gpu列表</p>
     */
    public String [] getSupportGpuList() {
        return this.SupportGpuList;
    }

    /**
     * Set <p>支持的gpu列表</p>
     * @param SupportGpuList <p>支持的gpu列表</p>
     */
    public void setSupportGpuList(String [] SupportGpuList) {
        this.SupportGpuList = SupportGpuList;
    }

    /**
     * Get <p>扩展属性</p> 
     * @return ExtraAttributeList <p>扩展属性</p>
     */
    public Attribute [] getExtraAttributeList() {
        return this.ExtraAttributeList;
    }

    /**
     * Set <p>扩展属性</p>
     * @param ExtraAttributeList <p>扩展属性</p>
     */
    public void setExtraAttributeList(Attribute [] ExtraAttributeList) {
        this.ExtraAttributeList = ExtraAttributeList;
    }

    /**
     * Get <p>是否支持分布式部署</p> 
     * @return SupportDistributedDeploy <p>是否支持分布式部署</p>
     */
    public Boolean getSupportDistributedDeploy() {
        return this.SupportDistributedDeploy;
    }

    /**
     * Set <p>是否支持分布式部署</p>
     * @param SupportDistributedDeploy <p>是否支持分布式部署</p>
     */
    public void setSupportDistributedDeploy(Boolean SupportDistributedDeploy) {
        this.SupportDistributedDeploy = SupportDistributedDeploy;
    }

    /**
     * Get <p>是否最新稳定版本</p> 
     * @return IsLatestStable <p>是否最新稳定版本</p>
     */
    public Boolean getIsLatestStable() {
        return this.IsLatestStable;
    }

    /**
     * Set <p>是否最新稳定版本</p>
     * @param IsLatestStable <p>是否最新稳定版本</p>
     */
    public void setIsLatestStable(Boolean IsLatestStable) {
        this.IsLatestStable = IsLatestStable;
    }

    /**
     * Get <p>镜像的名称</p> 
     * @return ImageName <p>镜像的名称</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像的名称</p>
     * @param ImageName <p>镜像的名称</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>镜像版本号（内部）</p> 
     * @return Version <p>镜像版本号（内部）</p>
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>镜像版本号（内部）</p>
     * @param Version <p>镜像版本号（内部）</p>
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>录入时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return CreateTime <p>录入时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>录入时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     * @param CreateTime <p>录入时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return UpdateTime <p>更新时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     * @param UpdateTime <p>更新时间</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>镜像类型</p><p>枚举值：</p><ul><li>TCR： TCR类型的镜像</li></ul> 
     * @return ImageType <p>镜像类型</p><p>枚举值：</p><ul><li>TCR： TCR类型的镜像</li></ul>
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set <p>镜像类型</p><p>枚举值：</p><ul><li>TCR： TCR类型的镜像</li></ul>
     * @param ImageType <p>镜像类型</p><p>枚举值：</p><ul><li>TCR： TCR类型的镜像</li></ul>
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public PresetImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PresetImageInfo(PresetImageInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageRepo != null) {
            this.ImageRepo = new String(source.ImageRepo);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new String(source.ImageSize);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ApplicableModuleList != null) {
            this.ApplicableModuleList = new String[source.ApplicableModuleList.length];
            for (int i = 0; i < source.ApplicableModuleList.length; i++) {
                this.ApplicableModuleList[i] = new String(source.ApplicableModuleList[i]);
            }
        }
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
        }
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
        if (source.ChipTypeList != null) {
            this.ChipTypeList = new String[source.ChipTypeList.length];
            for (int i = 0; i < source.ChipTypeList.length; i++) {
                this.ChipTypeList[i] = new String(source.ChipTypeList[i]);
            }
        }
        if (source.ComputeLibVersion != null) {
            this.ComputeLibVersion = new String(source.ComputeLibVersion);
        }
        if (source.PythonVersion != null) {
            this.PythonVersion = new String(source.PythonVersion);
        }
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.RuntimeLibList != null) {
            this.RuntimeLibList = new RuntimeLib[source.RuntimeLibList.length];
            for (int i = 0; i < source.RuntimeLibList.length; i++) {
                this.RuntimeLibList[i] = new RuntimeLib(source.RuntimeLibList[i]);
            }
        }
        if (source.SupportGpuList != null) {
            this.SupportGpuList = new String[source.SupportGpuList.length];
            for (int i = 0; i < source.SupportGpuList.length; i++) {
                this.SupportGpuList[i] = new String(source.SupportGpuList[i]);
            }
        }
        if (source.ExtraAttributeList != null) {
            this.ExtraAttributeList = new Attribute[source.ExtraAttributeList.length];
            for (int i = 0; i < source.ExtraAttributeList.length; i++) {
                this.ExtraAttributeList[i] = new Attribute(source.ExtraAttributeList[i]);
            }
        }
        if (source.SupportDistributedDeploy != null) {
            this.SupportDistributedDeploy = new Boolean(source.SupportDistributedDeploy);
        }
        if (source.IsLatestStable != null) {
            this.IsLatestStable = new Boolean(source.IsLatestStable);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageRepo", this.ImageRepo);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "ApplicableModuleList.", this.ApplicableModuleList);
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamArraySimple(map, prefix + "ChipTypeList.", this.ChipTypeList);
        this.setParamSimple(map, prefix + "ComputeLibVersion", this.ComputeLibVersion);
        this.setParamSimple(map, prefix + "PythonVersion", this.PythonVersion);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamArrayObj(map, prefix + "RuntimeLibList.", this.RuntimeLibList);
        this.setParamArraySimple(map, prefix + "SupportGpuList.", this.SupportGpuList);
        this.setParamArrayObj(map, prefix + "ExtraAttributeList.", this.ExtraAttributeList);
        this.setParamSimple(map, prefix + "SupportDistributedDeploy", this.SupportDistributedDeploy);
        this.setParamSimple(map, prefix + "IsLatestStable", this.IsLatestStable);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);

    }
}

