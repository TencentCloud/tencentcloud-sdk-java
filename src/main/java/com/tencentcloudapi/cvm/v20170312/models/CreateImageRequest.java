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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRequest  extends AbstractModel{

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 需要制作镜像的实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像描述
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 软关机失败时是否执行强制关机以制作镜像
    */
    @SerializedName("ForcePoweroff")
    @Expose
    private String ForcePoweroff;

    /**
    * 创建Windows镜像时是否启用Sysprep
    */
    @SerializedName("Sysprep")
    @Expose
    private String Sysprep;

    /**
    * 实例处于运行中时，是否允许关机执行制作镜像任务。
    */
    @SerializedName("Reboot")
    @Expose
    private String Reboot;

    /**
    * 实例需要制作镜像的数据盘Id
    */
    @SerializedName("DataDiskIds")
    @Expose
    private String [] DataDiskIds;

    /**
    * 需要制作镜像的快照Id,必须包含一个系统盘快照
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * 检测请求的合法性，但不会对操作的资源产生任何影响
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * 获取镜像名称
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * 设置镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * 获取需要制作镜像的实例ID
     * @return InstanceId 需要制作镜像的实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置需要制作镜像的实例ID
     * @param InstanceId 需要制作镜像的实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取镜像描述
     * @return ImageDescription 镜像描述
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * 设置镜像描述
     * @param ImageDescription 镜像描述
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * 获取软关机失败时是否执行强制关机以制作镜像
     * @return ForcePoweroff 软关机失败时是否执行强制关机以制作镜像
     */
    public String getForcePoweroff() {
        return this.ForcePoweroff;
    }

    /**
     * 设置软关机失败时是否执行强制关机以制作镜像
     * @param ForcePoweroff 软关机失败时是否执行强制关机以制作镜像
     */
    public void setForcePoweroff(String ForcePoweroff) {
        this.ForcePoweroff = ForcePoweroff;
    }

    /**
     * 获取创建Windows镜像时是否启用Sysprep
     * @return Sysprep 创建Windows镜像时是否启用Sysprep
     */
    public String getSysprep() {
        return this.Sysprep;
    }

    /**
     * 设置创建Windows镜像时是否启用Sysprep
     * @param Sysprep 创建Windows镜像时是否启用Sysprep
     */
    public void setSysprep(String Sysprep) {
        this.Sysprep = Sysprep;
    }

    /**
     * 获取实例处于运行中时，是否允许关机执行制作镜像任务。
     * @return Reboot 实例处于运行中时，是否允许关机执行制作镜像任务。
     */
    public String getReboot() {
        return this.Reboot;
    }

    /**
     * 设置实例处于运行中时，是否允许关机执行制作镜像任务。
     * @param Reboot 实例处于运行中时，是否允许关机执行制作镜像任务。
     */
    public void setReboot(String Reboot) {
        this.Reboot = Reboot;
    }

    /**
     * 获取实例需要制作镜像的数据盘Id
     * @return DataDiskIds 实例需要制作镜像的数据盘Id
     */
    public String [] getDataDiskIds() {
        return this.DataDiskIds;
    }

    /**
     * 设置实例需要制作镜像的数据盘Id
     * @param DataDiskIds 实例需要制作镜像的数据盘Id
     */
    public void setDataDiskIds(String [] DataDiskIds) {
        this.DataDiskIds = DataDiskIds;
    }

    /**
     * 获取需要制作镜像的快照Id,必须包含一个系统盘快照
     * @return SnapshotIds 需要制作镜像的快照Id,必须包含一个系统盘快照
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * 设置需要制作镜像的快照Id,必须包含一个系统盘快照
     * @param SnapshotIds 需要制作镜像的快照Id,必须包含一个系统盘快照
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * 获取检测请求的合法性，但不会对操作的资源产生任何影响
     * @return DryRun 检测请求的合法性，但不会对操作的资源产生任何影响
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * 设置检测请求的合法性，但不会对操作的资源产生任何影响
     * @param DryRun 检测请求的合法性，但不会对操作的资源产生任何影响
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ForcePoweroff", this.ForcePoweroff);
        this.setParamSimple(map, prefix + "Sysprep", this.Sysprep);
        this.setParamSimple(map, prefix + "Reboot", this.Reboot);
        this.setParamArraySimple(map, prefix + "DataDiskIds.", this.DataDiskIds);
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

