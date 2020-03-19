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

public class CreateModuleRequest extends AbstractModel{

    /**
    * 模块名称，如视频直播模块。限制：模块名称不得以空格开头，长度不得超过60个字符。
    */
    @SerializedName("ModuleName")
    @Expose
    private String ModuleName;

    /**
    * 默认带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。
    */
    @SerializedName("DefaultBandWidth")
    @Expose
    private Long DefaultBandWidth;

    /**
    * 默认镜像，如img-qsdf3ff2。
    */
    @SerializedName("DefaultImageId")
    @Expose
    private String DefaultImageId;

    /**
    * 机型ID。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 默认系统盘大小，单位：G，默认大小为50G。范围不得超过系统盘上下限制，详看DescribeConfig。
    */
    @SerializedName("DefaultSystemDiskSize")
    @Expose
    private Long DefaultSystemDiskSize;

    /**
    * 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。
    */
    @SerializedName("DefaultDataDiskSize")
    @Expose
    private Long DefaultDataDiskSize;

    /**
     * Get 模块名称，如视频直播模块。限制：模块名称不得以空格开头，长度不得超过60个字符。 
     * @return ModuleName 模块名称，如视频直播模块。限制：模块名称不得以空格开头，长度不得超过60个字符。
     */
    public String getModuleName() {
        return this.ModuleName;
    }

    /**
     * Set 模块名称，如视频直播模块。限制：模块名称不得以空格开头，长度不得超过60个字符。
     * @param ModuleName 模块名称，如视频直播模块。限制：模块名称不得以空格开头，长度不得超过60个字符。
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    /**
     * Get 默认带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。 
     * @return DefaultBandWidth 默认带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。
     */
    public Long getDefaultBandWidth() {
        return this.DefaultBandWidth;
    }

    /**
     * Set 默认带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。
     * @param DefaultBandWidth 默认带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。
     */
    public void setDefaultBandWidth(Long DefaultBandWidth) {
        this.DefaultBandWidth = DefaultBandWidth;
    }

    /**
     * Get 默认镜像，如img-qsdf3ff2。 
     * @return DefaultImageId 默认镜像，如img-qsdf3ff2。
     */
    public String getDefaultImageId() {
        return this.DefaultImageId;
    }

    /**
     * Set 默认镜像，如img-qsdf3ff2。
     * @param DefaultImageId 默认镜像，如img-qsdf3ff2。
     */
    public void setDefaultImageId(String DefaultImageId) {
        this.DefaultImageId = DefaultImageId;
    }

    /**
     * Get 机型ID。 
     * @return InstanceType 机型ID。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机型ID。
     * @param InstanceType 机型ID。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 默认系统盘大小，单位：G，默认大小为50G。范围不得超过系统盘上下限制，详看DescribeConfig。 
     * @return DefaultSystemDiskSize 默认系统盘大小，单位：G，默认大小为50G。范围不得超过系统盘上下限制，详看DescribeConfig。
     */
    public Long getDefaultSystemDiskSize() {
        return this.DefaultSystemDiskSize;
    }

    /**
     * Set 默认系统盘大小，单位：G，默认大小为50G。范围不得超过系统盘上下限制，详看DescribeConfig。
     * @param DefaultSystemDiskSize 默认系统盘大小，单位：G，默认大小为50G。范围不得超过系统盘上下限制，详看DescribeConfig。
     */
    public void setDefaultSystemDiskSize(Long DefaultSystemDiskSize) {
        this.DefaultSystemDiskSize = DefaultSystemDiskSize;
    }

    /**
     * Get 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。 
     * @return DefaultDataDiskSize 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。
     */
    public Long getDefaultDataDiskSize() {
        return this.DefaultDataDiskSize;
    }

    /**
     * Set 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。
     * @param DefaultDataDiskSize 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。
     */
    public void setDefaultDataDiskSize(Long DefaultDataDiskSize) {
        this.DefaultDataDiskSize = DefaultDataDiskSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleName", this.ModuleName);
        this.setParamSimple(map, prefix + "DefaultBandWidth", this.DefaultBandWidth);
        this.setParamSimple(map, prefix + "DefaultImageId", this.DefaultImageId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DefaultSystemDiskSize", this.DefaultSystemDiskSize);
        this.setParamSimple(map, prefix + "DefaultDataDiskSize", this.DefaultDataDiskSize);

    }
}

