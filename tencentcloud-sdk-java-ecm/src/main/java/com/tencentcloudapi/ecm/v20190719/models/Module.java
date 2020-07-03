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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Module extends AbstractModel{

    /**
    * 模块Id
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 模块名称
    */
    @SerializedName("ModuleName")
    @Expose
    private String ModuleName;

    /**
    * 模块状态：
NORMAL：正常
DELETING：删除中 
DELETEFAILED：删除失败
    */
    @SerializedName("ModuleState")
    @Expose
    private String ModuleState;

    /**
    * 默认系统盘大小
    */
    @SerializedName("DefaultSystemDiskSize")
    @Expose
    private Long DefaultSystemDiskSize;

    /**
    * 默认数据盘大小
    */
    @SerializedName("DefaultDataDiskSize")
    @Expose
    private Long DefaultDataDiskSize;

    /**
    * 默认机型
    */
    @SerializedName("InstanceTypeConfig")
    @Expose
    private InstanceTypeConfig InstanceTypeConfig;

    /**
    * 默认镜像
    */
    @SerializedName("DefaultImage")
    @Expose
    private Image DefaultImage;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 默认带宽
    */
    @SerializedName("DefaultBandwidth")
    @Expose
    private Long DefaultBandwidth;

    /**
     * Get 模块Id 
     * @return ModuleId 模块Id
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块Id
     * @param ModuleId 模块Id
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 模块名称 
     * @return ModuleName 模块名称
     */
    public String getModuleName() {
        return this.ModuleName;
    }

    /**
     * Set 模块名称
     * @param ModuleName 模块名称
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    /**
     * Get 模块状态：
NORMAL：正常
DELETING：删除中 
DELETEFAILED：删除失败 
     * @return ModuleState 模块状态：
NORMAL：正常
DELETING：删除中 
DELETEFAILED：删除失败
     */
    public String getModuleState() {
        return this.ModuleState;
    }

    /**
     * Set 模块状态：
NORMAL：正常
DELETING：删除中 
DELETEFAILED：删除失败
     * @param ModuleState 模块状态：
NORMAL：正常
DELETING：删除中 
DELETEFAILED：删除失败
     */
    public void setModuleState(String ModuleState) {
        this.ModuleState = ModuleState;
    }

    /**
     * Get 默认系统盘大小 
     * @return DefaultSystemDiskSize 默认系统盘大小
     */
    public Long getDefaultSystemDiskSize() {
        return this.DefaultSystemDiskSize;
    }

    /**
     * Set 默认系统盘大小
     * @param DefaultSystemDiskSize 默认系统盘大小
     */
    public void setDefaultSystemDiskSize(Long DefaultSystemDiskSize) {
        this.DefaultSystemDiskSize = DefaultSystemDiskSize;
    }

    /**
     * Get 默认数据盘大小 
     * @return DefaultDataDiskSize 默认数据盘大小
     */
    public Long getDefaultDataDiskSize() {
        return this.DefaultDataDiskSize;
    }

    /**
     * Set 默认数据盘大小
     * @param DefaultDataDiskSize 默认数据盘大小
     */
    public void setDefaultDataDiskSize(Long DefaultDataDiskSize) {
        this.DefaultDataDiskSize = DefaultDataDiskSize;
    }

    /**
     * Get 默认机型 
     * @return InstanceTypeConfig 默认机型
     */
    public InstanceTypeConfig getInstanceTypeConfig() {
        return this.InstanceTypeConfig;
    }

    /**
     * Set 默认机型
     * @param InstanceTypeConfig 默认机型
     */
    public void setInstanceTypeConfig(InstanceTypeConfig InstanceTypeConfig) {
        this.InstanceTypeConfig = InstanceTypeConfig;
    }

    /**
     * Get 默认镜像 
     * @return DefaultImage 默认镜像
     */
    public Image getDefaultImage() {
        return this.DefaultImage;
    }

    /**
     * Set 默认镜像
     * @param DefaultImage 默认镜像
     */
    public void setDefaultImage(Image DefaultImage) {
        this.DefaultImage = DefaultImage;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 默认带宽 
     * @return DefaultBandwidth 默认带宽
     */
    public Long getDefaultBandwidth() {
        return this.DefaultBandwidth;
    }

    /**
     * Set 默认带宽
     * @param DefaultBandwidth 默认带宽
     */
    public void setDefaultBandwidth(Long DefaultBandwidth) {
        this.DefaultBandwidth = DefaultBandwidth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "ModuleName", this.ModuleName);
        this.setParamSimple(map, prefix + "ModuleState", this.ModuleState);
        this.setParamSimple(map, prefix + "DefaultSystemDiskSize", this.DefaultSystemDiskSize);
        this.setParamSimple(map, prefix + "DefaultDataDiskSize", this.DefaultDataDiskSize);
        this.setParamObj(map, prefix + "InstanceTypeConfig.", this.InstanceTypeConfig);
        this.setParamObj(map, prefix + "DefaultImage.", this.DefaultImage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DefaultBandwidth", this.DefaultBandwidth);

    }
}

