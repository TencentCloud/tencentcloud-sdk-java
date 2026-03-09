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

public class SnapshotInfo extends AbstractModel {

    /**
    * <p>创建快照时间</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>快照名称</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>快照ID</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>快照状态，creating-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>地域名称</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>文件系统ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>快照大小</p><p>单位：MiB</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>保留时长天</p>
    */
    @SerializedName("AliveDay")
    @Expose
    private Long AliveDay;

    /**
    * <p>快照进度百分比，1表示1% 范围1-100</p>
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * <p>账号ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>快照删除时间</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * <p>文件系统名称</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>快照标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>快照类型，general为通用系列快照，turbo为Turbo系列快照</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * <p>实际快照时间，反映快照对应文件系统某个时刻的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
     * Get <p>创建快照时间</p> 
     * @return CreationTime <p>创建快照时间</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>创建快照时间</p>
     * @param CreationTime <p>创建快照时间</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>快照名称</p> 
     * @return SnapshotName <p>快照名称</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>快照名称</p>
     * @param SnapshotName <p>快照名称</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>快照ID</p> 
     * @return SnapshotId <p>快照ID</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>快照ID</p>
     * @param SnapshotId <p>快照ID</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>快照状态，creating-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败</p> 
     * @return Status <p>快照状态，creating-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>快照状态，creating-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败</p>
     * @param Status <p>快照状态，creating-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>地域名称</p> 
     * @return RegionName <p>地域名称</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名称</p>
     * @param RegionName <p>地域名称</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>文件系统ID</p> 
     * @return FileSystemId <p>文件系统ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统ID</p>
     * @param FileSystemId <p>文件系统ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>快照大小</p><p>单位：MiB</p> 
     * @return Size <p>快照大小</p><p>单位：MiB</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>快照大小</p><p>单位：MiB</p>
     * @param Size <p>快照大小</p><p>单位：MiB</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>保留时长天</p> 
     * @return AliveDay <p>保留时长天</p>
     */
    public Long getAliveDay() {
        return this.AliveDay;
    }

    /**
     * Set <p>保留时长天</p>
     * @param AliveDay <p>保留时长天</p>
     */
    public void setAliveDay(Long AliveDay) {
        this.AliveDay = AliveDay;
    }

    /**
     * Get <p>快照进度百分比，1表示1% 范围1-100</p> 
     * @return Percent <p>快照进度百分比，1表示1% 范围1-100</p>
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>快照进度百分比，1表示1% 范围1-100</p>
     * @param Percent <p>快照进度百分比，1表示1% 范围1-100</p>
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>账号ID</p> 
     * @return AppId <p>账号ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号ID</p>
     * @param AppId <p>账号ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>快照删除时间</p> 
     * @return DeleteTime <p>快照删除时间</p>
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>快照删除时间</p>
     * @param DeleteTime <p>快照删除时间</p>
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <p>文件系统名称</p> 
     * @return FsName <p>文件系统名称</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>文件系统名称</p>
     * @param FsName <p>文件系统名称</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>快照标签</p> 
     * @return Tags <p>快照标签</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>快照标签</p>
     * @param Tags <p>快照标签</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>快照类型，general为通用系列快照，turbo为Turbo系列快照</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotType <p>快照类型，general为通用系列快照，turbo为Turbo系列快照</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set <p>快照类型，general为通用系列快照，turbo为Turbo系列快照</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotType <p>快照类型，general为通用系列快照，turbo为Turbo系列快照</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * Get <p>实际快照时间，反映快照对应文件系统某个时刻的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotTime <p>实际快照时间，反映快照对应文件系统某个时刻的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set <p>实际快照时间，反映快照对应文件系统某个时刻的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotTime <p>实际快照时间，反映快照对应文件系统某个时刻的数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    public SnapshotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotInfo(SnapshotInfo source) {
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.AliveDay != null) {
            this.AliveDay = new Long(source.AliveDay);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.SnapshotType != null) {
            this.SnapshotType = new String(source.SnapshotType);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "AliveDay", this.AliveDay);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SnapshotType", this.SnapshotType);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);

    }
}

