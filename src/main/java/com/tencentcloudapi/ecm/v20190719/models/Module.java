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
    * 模块Id。
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 模块名称。
    */
    @SerializedName("ModuleName")
    @Expose
    private String ModuleName;

    /**
    * 模块状态：
NORMAL：正常。
DELETING：删除中 
DELETEFAILED：删除失败。
    */
    @SerializedName("ModuleState")
    @Expose
    private String ModuleState;

    /**
    * 默认系统盘大小。
    */
    @SerializedName("DefaultSystemDiskSize")
    @Expose
    private Long DefaultSystemDiskSize;

    /**
    * 默认数据盘大小。
    */
    @SerializedName("DefaultDataDiskSize")
    @Expose
    private Long DefaultDataDiskSize;

    /**
    * 默认机型。
    */
    @SerializedName("InstanceTypeConfig")
    @Expose
    private InstanceTypeConfig InstanceTypeConfig;

    /**
    * 默认镜像。
    */
    @SerializedName("DefaultImage")
    @Expose
    private Image DefaultImage;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 默认出带宽。
    */
    @SerializedName("DefaultBandwidth")
    @Expose
    private Long DefaultBandwidth;

    /**
    * 标签集合。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 是否关闭IP直通。
    */
    @SerializedName("CloseIpDirect")
    @Expose
    private Long CloseIpDirect;

    /**
    * 默认安全组id列表。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 默认入带宽。
    */
    @SerializedName("DefaultBandwidthIn")
    @Expose
    private Long DefaultBandwidthIn;

    /**
    * 自定义脚本数据
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

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
     * Get 模块Id。 
     * @return ModuleId 模块Id。
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块Id。
     * @param ModuleId 模块Id。
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 模块名称。 
     * @return ModuleName 模块名称。
     */
    public String getModuleName() {
        return this.ModuleName;
    }

    /**
     * Set 模块名称。
     * @param ModuleName 模块名称。
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    /**
     * Get 模块状态：
NORMAL：正常。
DELETING：删除中 
DELETEFAILED：删除失败。 
     * @return ModuleState 模块状态：
NORMAL：正常。
DELETING：删除中 
DELETEFAILED：删除失败。
     */
    public String getModuleState() {
        return this.ModuleState;
    }

    /**
     * Set 模块状态：
NORMAL：正常。
DELETING：删除中 
DELETEFAILED：删除失败。
     * @param ModuleState 模块状态：
NORMAL：正常。
DELETING：删除中 
DELETEFAILED：删除失败。
     */
    public void setModuleState(String ModuleState) {
        this.ModuleState = ModuleState;
    }

    /**
     * Get 默认系统盘大小。 
     * @return DefaultSystemDiskSize 默认系统盘大小。
     */
    public Long getDefaultSystemDiskSize() {
        return this.DefaultSystemDiskSize;
    }

    /**
     * Set 默认系统盘大小。
     * @param DefaultSystemDiskSize 默认系统盘大小。
     */
    public void setDefaultSystemDiskSize(Long DefaultSystemDiskSize) {
        this.DefaultSystemDiskSize = DefaultSystemDiskSize;
    }

    /**
     * Get 默认数据盘大小。 
     * @return DefaultDataDiskSize 默认数据盘大小。
     */
    public Long getDefaultDataDiskSize() {
        return this.DefaultDataDiskSize;
    }

    /**
     * Set 默认数据盘大小。
     * @param DefaultDataDiskSize 默认数据盘大小。
     */
    public void setDefaultDataDiskSize(Long DefaultDataDiskSize) {
        this.DefaultDataDiskSize = DefaultDataDiskSize;
    }

    /**
     * Get 默认机型。 
     * @return InstanceTypeConfig 默认机型。
     */
    public InstanceTypeConfig getInstanceTypeConfig() {
        return this.InstanceTypeConfig;
    }

    /**
     * Set 默认机型。
     * @param InstanceTypeConfig 默认机型。
     */
    public void setInstanceTypeConfig(InstanceTypeConfig InstanceTypeConfig) {
        this.InstanceTypeConfig = InstanceTypeConfig;
    }

    /**
     * Get 默认镜像。 
     * @return DefaultImage 默认镜像。
     */
    public Image getDefaultImage() {
        return this.DefaultImage;
    }

    /**
     * Set 默认镜像。
     * @param DefaultImage 默认镜像。
     */
    public void setDefaultImage(Image DefaultImage) {
        this.DefaultImage = DefaultImage;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 默认出带宽。 
     * @return DefaultBandwidth 默认出带宽。
     */
    public Long getDefaultBandwidth() {
        return this.DefaultBandwidth;
    }

    /**
     * Set 默认出带宽。
     * @param DefaultBandwidth 默认出带宽。
     */
    public void setDefaultBandwidth(Long DefaultBandwidth) {
        this.DefaultBandwidth = DefaultBandwidth;
    }

    /**
     * Get 标签集合。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 标签集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签集合。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 是否关闭IP直通。 
     * @return CloseIpDirect 是否关闭IP直通。
     */
    public Long getCloseIpDirect() {
        return this.CloseIpDirect;
    }

    /**
     * Set 是否关闭IP直通。
     * @param CloseIpDirect 是否关闭IP直通。
     */
    public void setCloseIpDirect(Long CloseIpDirect) {
        this.CloseIpDirect = CloseIpDirect;
    }

    /**
     * Get 默认安全组id列表。 
     * @return SecurityGroupIds 默认安全组id列表。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 默认安全组id列表。
     * @param SecurityGroupIds 默认安全组id列表。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 默认入带宽。 
     * @return DefaultBandwidthIn 默认入带宽。
     */
    public Long getDefaultBandwidthIn() {
        return this.DefaultBandwidthIn;
    }

    /**
     * Set 默认入带宽。
     * @param DefaultBandwidthIn 默认入带宽。
     */
    public void setDefaultBandwidthIn(Long DefaultBandwidthIn) {
        this.DefaultBandwidthIn = DefaultBandwidthIn;
    }

    /**
     * Get 自定义脚本数据 
     * @return UserData 自定义脚本数据
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 自定义脚本数据
     * @param UserData 自定义脚本数据
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
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

    public Module() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Module(Module source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.ModuleName != null) {
            this.ModuleName = new String(source.ModuleName);
        }
        if (source.ModuleState != null) {
            this.ModuleState = new String(source.ModuleState);
        }
        if (source.DefaultSystemDiskSize != null) {
            this.DefaultSystemDiskSize = new Long(source.DefaultSystemDiskSize);
        }
        if (source.DefaultDataDiskSize != null) {
            this.DefaultDataDiskSize = new Long(source.DefaultDataDiskSize);
        }
        if (source.InstanceTypeConfig != null) {
            this.InstanceTypeConfig = new InstanceTypeConfig(source.InstanceTypeConfig);
        }
        if (source.DefaultImage != null) {
            this.DefaultImage = new Image(source.DefaultImage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DefaultBandwidth != null) {
            this.DefaultBandwidth = new Long(source.DefaultBandwidth);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.CloseIpDirect != null) {
            this.CloseIpDirect = new Long(source.CloseIpDirect);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.DefaultBandwidthIn != null) {
            this.DefaultBandwidthIn = new Long(source.DefaultBandwidthIn);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
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
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "ModuleName", this.ModuleName);
        this.setParamSimple(map, prefix + "ModuleState", this.ModuleState);
        this.setParamSimple(map, prefix + "DefaultSystemDiskSize", this.DefaultSystemDiskSize);
        this.setParamSimple(map, prefix + "DefaultDataDiskSize", this.DefaultDataDiskSize);
        this.setParamObj(map, prefix + "InstanceTypeConfig.", this.InstanceTypeConfig);
        this.setParamObj(map, prefix + "DefaultImage.", this.DefaultImage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DefaultBandwidth", this.DefaultBandwidth);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "CloseIpDirect", this.CloseIpDirect);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "DefaultBandwidthIn", this.DefaultBandwidthIn);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);

    }
}

