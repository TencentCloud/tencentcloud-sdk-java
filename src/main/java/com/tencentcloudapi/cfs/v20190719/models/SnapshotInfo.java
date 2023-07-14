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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotInfo extends AbstractModel{

    /**
    * 创建快照时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 快照状态，createing-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 快照大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 保留时长天
    */
    @SerializedName("AliveDay")
    @Expose
    private Long AliveDay;

    /**
    * 快照进度百分比，1表示1%
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 帐号ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 快照删除时间
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * 文件系统名称
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * 快照标签
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 快照类型, general为通用系列快照，turbo为Turbo系列快照
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * 实际快照时间，反应快照对应文件系统某个时刻的数据。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
     * Get 创建快照时间 
     * @return CreationTime 创建快照时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建快照时间
     * @param CreationTime 创建快照时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 快照名称 
     * @return SnapshotName 快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
     * @param SnapshotName 快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照ID 
     * @return SnapshotId 快照ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照ID
     * @param SnapshotId 快照ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 快照状态，createing-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败 
     * @return Status 快照状态，createing-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 快照状态，createing-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败
     * @param Status 快照状态，createing-创建中；available-运行中；deleting-删除中；rollbacking-new 创建新文件系统中；create-failed 创建失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 快照大小 
     * @return Size 快照大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 快照大小
     * @param Size 快照大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 保留时长天 
     * @return AliveDay 保留时长天
     */
    public Long getAliveDay() {
        return this.AliveDay;
    }

    /**
     * Set 保留时长天
     * @param AliveDay 保留时长天
     */
    public void setAliveDay(Long AliveDay) {
        this.AliveDay = AliveDay;
    }

    /**
     * Get 快照进度百分比，1表示1% 
     * @return Percent 快照进度百分比，1表示1%
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 快照进度百分比，1表示1%
     * @param Percent 快照进度百分比，1表示1%
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 帐号ID 
     * @return AppId 帐号ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 帐号ID
     * @param AppId 帐号ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 快照删除时间 
     * @return DeleteTime 快照删除时间
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 快照删除时间
     * @param DeleteTime 快照删除时间
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 文件系统名称 
     * @return FsName 文件系统名称
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set 文件系统名称
     * @param FsName 文件系统名称
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get 快照标签 
     * @return Tags 快照标签
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 快照标签
     * @param Tags 快照标签
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 快照类型, general为通用系列快照，turbo为Turbo系列快照
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotType 快照类型, general为通用系列快照，turbo为Turbo系列快照
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set 快照类型, general为通用系列快照，turbo为Turbo系列快照
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotType 快照类型, general为通用系列快照，turbo为Turbo系列快照
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * Get 实际快照时间，反应快照对应文件系统某个时刻的数据。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotTime 实际快照时间，反应快照对应文件系统某个时刻的数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set 实际快照时间，反应快照对应文件系统某个时刻的数据。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotTime 实际快照时间，反应快照对应文件系统某个时刻的数据。
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

