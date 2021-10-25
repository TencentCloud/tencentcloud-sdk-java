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
    * 是否关闭IP直通。取值范围：
true：表示关闭IP直通
false：表示开通IP直通
    */
    @SerializedName("CloseIpDirect")
    @Expose
    private Boolean CloseIpDirect;

    /**
    * 标签列表。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 模块默认安全组列表
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * 默认入带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。
    */
    @SerializedName("DefaultBandWidthIn")
    @Expose
    private Long DefaultBandWidthIn;

    /**
    * 是否禁止分配外网IP
    */
    @SerializedName("DisableWanIp")
    @Expose
    private Boolean DisableWanIp;

    /**
    * 系统盘信息。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 数据盘信息。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

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
     * Get 是否关闭IP直通。取值范围：
true：表示关闭IP直通
false：表示开通IP直通 
     * @return CloseIpDirect 是否关闭IP直通。取值范围：
true：表示关闭IP直通
false：表示开通IP直通
     */
    public Boolean getCloseIpDirect() {
        return this.CloseIpDirect;
    }

    /**
     * Set 是否关闭IP直通。取值范围：
true：表示关闭IP直通
false：表示开通IP直通
     * @param CloseIpDirect 是否关闭IP直通。取值范围：
true：表示关闭IP直通
false：表示开通IP直通
     */
    public void setCloseIpDirect(Boolean CloseIpDirect) {
        this.CloseIpDirect = CloseIpDirect;
    }

    /**
     * Get 标签列表。 
     * @return TagSpecification 标签列表。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签列表。
     * @param TagSpecification 标签列表。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 模块默认安全组列表 
     * @return SecurityGroups 模块默认安全组列表
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set 模块默认安全组列表
     * @param SecurityGroups 模块默认安全组列表
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get 默认入带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。 
     * @return DefaultBandWidthIn 默认入带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。
     */
    public Long getDefaultBandWidthIn() {
        return this.DefaultBandWidthIn;
    }

    /**
     * Set 默认入带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。
     * @param DefaultBandWidthIn 默认入带宽，单位：M。范围不得超过带宽上下限，详看DescribeConfig。
     */
    public void setDefaultBandWidthIn(Long DefaultBandWidthIn) {
        this.DefaultBandWidthIn = DefaultBandWidthIn;
    }

    /**
     * Get 是否禁止分配外网IP 
     * @return DisableWanIp 是否禁止分配外网IP
     */
    public Boolean getDisableWanIp() {
        return this.DisableWanIp;
    }

    /**
     * Set 是否禁止分配外网IP
     * @param DisableWanIp 是否禁止分配外网IP
     */
    public void setDisableWanIp(Boolean DisableWanIp) {
        this.DisableWanIp = DisableWanIp;
    }

    /**
     * Get 系统盘信息。 
     * @return SystemDisk 系统盘信息。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘信息。
     * @param SystemDisk 系统盘信息。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 数据盘信息。 
     * @return DataDisks 数据盘信息。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 数据盘信息。
     * @param DataDisks 数据盘信息。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    public CreateModuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModuleRequest(CreateModuleRequest source) {
        if (source.ModuleName != null) {
            this.ModuleName = new String(source.ModuleName);
        }
        if (source.DefaultBandWidth != null) {
            this.DefaultBandWidth = new Long(source.DefaultBandWidth);
        }
        if (source.DefaultImageId != null) {
            this.DefaultImageId = new String(source.DefaultImageId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DefaultSystemDiskSize != null) {
            this.DefaultSystemDiskSize = new Long(source.DefaultSystemDiskSize);
        }
        if (source.DefaultDataDiskSize != null) {
            this.DefaultDataDiskSize = new Long(source.DefaultDataDiskSize);
        }
        if (source.CloseIpDirect != null) {
            this.CloseIpDirect = new Boolean(source.CloseIpDirect);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.DefaultBandWidthIn != null) {
            this.DefaultBandWidthIn = new Long(source.DefaultBandWidthIn);
        }
        if (source.DisableWanIp != null) {
            this.DisableWanIp = new Boolean(source.DisableWanIp);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "CloseIpDirect", this.CloseIpDirect);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "DefaultBandWidthIn", this.DefaultBandWidthIn);
        this.setParamSimple(map, prefix + "DisableWanIp", this.DisableWanIp);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);

    }
}

