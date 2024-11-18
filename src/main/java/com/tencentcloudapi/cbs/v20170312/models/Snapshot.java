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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Snapshot extends AbstractModel {

    /**
    * 快照所在的位置。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 是否为跨地域复制的快照。取值范围：
<ul>
    <li>true：表示为跨地域复制的快照。</li>
    <li>false：本地域的快照。</li>
</ul>
    */
    @SerializedName("CopyFromRemote")
    @Expose
    private Boolean CopyFromRemote;

    /**
    * 快照的状态。取值范围：
<ul>
    <li>NORMAL：正常</li>
    <li>CREATING：创建中</li>
    <li>ROLLBACKING：回滚中</li>
    <li>COPYING_FROM_REMOTE：跨地域复制中</li>
    <li>CHECKING_COPIED：复制校验中</li>
    <li>TORECYCLE：待回收</li>
</ul>
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * 是否为永久快照。取值范围：
<ul>
    <li>true：永久快照</li>
    <li>false：非永久快照</li>
</ul>
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照到期时间。如果快照为永久保留，此字段为空。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 快照创建进度百分比，快照创建成功后此字段恒为100。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 快照关联的镜像列表。
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * 快照当前被共享数。
    */
    @SerializedName("ShareReference")
    @Expose
    private Long ShareReference;

    /**
    * 快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * 创建此快照的云硬盘大小，单位GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 创建此快照的云硬盘ID。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 快照正在跨地域复制的目的地域，默认取值为[]。
    */
    @SerializedName("CopyingToRegions")
    @Expose
    private String [] CopyingToRegions;

    /**
    * 是否为加密盘创建的快照。取值范围：
<ul>
    <li>true：该快照为加密盘创建的</li>
    <li>false：非加密盘创建的快照</li>
</ul>
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * 快照的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 快照关联的镜像个数。
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * 创建此快照的云硬盘类型。取值范围：
<ul>
    <li>SYSTEM_DISK：系统盘</li>
    <li>DATA_DISK：数据盘</li>
</ul>

    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 快照ID。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 快照开始共享的时间。
    */
    @SerializedName("TimeStartShare")
    @Expose
    private String TimeStartShare;

    /**
    * 快照绑定的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 快照所在的位置。 
     * @return Placement 快照所在的位置。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 快照所在的位置。
     * @param Placement 快照所在的位置。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 是否为跨地域复制的快照。取值范围：
<ul>
    <li>true：表示为跨地域复制的快照。</li>
    <li>false：本地域的快照。</li>
</ul> 
     * @return CopyFromRemote 是否为跨地域复制的快照。取值范围：
<ul>
    <li>true：表示为跨地域复制的快照。</li>
    <li>false：本地域的快照。</li>
</ul>
     */
    public Boolean getCopyFromRemote() {
        return this.CopyFromRemote;
    }

    /**
     * Set 是否为跨地域复制的快照。取值范围：
<ul>
    <li>true：表示为跨地域复制的快照。</li>
    <li>false：本地域的快照。</li>
</ul>
     * @param CopyFromRemote 是否为跨地域复制的快照。取值范围：
<ul>
    <li>true：表示为跨地域复制的快照。</li>
    <li>false：本地域的快照。</li>
</ul>
     */
    public void setCopyFromRemote(Boolean CopyFromRemote) {
        this.CopyFromRemote = CopyFromRemote;
    }

    /**
     * Get 快照的状态。取值范围：
<ul>
    <li>NORMAL：正常</li>
    <li>CREATING：创建中</li>
    <li>ROLLBACKING：回滚中</li>
    <li>COPYING_FROM_REMOTE：跨地域复制中</li>
    <li>CHECKING_COPIED：复制校验中</li>
    <li>TORECYCLE：待回收</li>
</ul> 
     * @return SnapshotState 快照的状态。取值范围：
<ul>
    <li>NORMAL：正常</li>
    <li>CREATING：创建中</li>
    <li>ROLLBACKING：回滚中</li>
    <li>COPYING_FROM_REMOTE：跨地域复制中</li>
    <li>CHECKING_COPIED：复制校验中</li>
    <li>TORECYCLE：待回收</li>
</ul>
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * Set 快照的状态。取值范围：
<ul>
    <li>NORMAL：正常</li>
    <li>CREATING：创建中</li>
    <li>ROLLBACKING：回滚中</li>
    <li>COPYING_FROM_REMOTE：跨地域复制中</li>
    <li>CHECKING_COPIED：复制校验中</li>
    <li>TORECYCLE：待回收</li>
</ul>
     * @param SnapshotState 快照的状态。取值范围：
<ul>
    <li>NORMAL：正常</li>
    <li>CREATING：创建中</li>
    <li>ROLLBACKING：回滚中</li>
    <li>COPYING_FROM_REMOTE：跨地域复制中</li>
    <li>CHECKING_COPIED：复制校验中</li>
    <li>TORECYCLE：待回收</li>
</ul>
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * Get 是否为永久快照。取值范围：
<ul>
    <li>true：永久快照</li>
    <li>false：非永久快照</li>
</ul> 
     * @return IsPermanent 是否为永久快照。取值范围：
<ul>
    <li>true：永久快照</li>
    <li>false：非永久快照</li>
</ul>
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 是否为永久快照。取值范围：
<ul>
    <li>true：永久快照</li>
    <li>false：非永久快照</li>
</ul>
     * @param IsPermanent 是否为永久快照。取值范围：
<ul>
    <li>true：永久快照</li>
    <li>false：非永久快照</li>
</ul>
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。 
     * @return SnapshotName 快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
     * @param SnapshotName 快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照到期时间。如果快照为永久保留，此字段为空。 
     * @return DeadlineTime 快照到期时间。如果快照为永久保留，此字段为空。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 快照到期时间。如果快照为永久保留，此字段为空。
     * @param DeadlineTime 快照到期时间。如果快照为永久保留，此字段为空。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 快照创建进度百分比，快照创建成功后此字段恒为100。 
     * @return Percent 快照创建进度百分比，快照创建成功后此字段恒为100。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 快照创建进度百分比，快照创建成功后此字段恒为100。
     * @param Percent 快照创建进度百分比，快照创建成功后此字段恒为100。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 快照关联的镜像列表。 
     * @return Images 快照关联的镜像列表。
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set 快照关联的镜像列表。
     * @param Images 快照关联的镜像列表。
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get 快照当前被共享数。 
     * @return ShareReference 快照当前被共享数。
     */
    public Long getShareReference() {
        return this.ShareReference;
    }

    /**
     * Set 快照当前被共享数。
     * @param ShareReference 快照当前被共享数。
     */
    public void setShareReference(Long ShareReference) {
        this.ShareReference = ShareReference;
    }

    /**
     * Get 快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT 
     * @return SnapshotType 快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set 快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
     * @param SnapshotType 快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * Get 创建此快照的云硬盘大小，单位GB。 
     * @return DiskSize 创建此快照的云硬盘大小，单位GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 创建此快照的云硬盘大小，单位GB。
     * @param DiskSize 创建此快照的云硬盘大小，单位GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 创建此快照的云硬盘ID。 
     * @return DiskId 创建此快照的云硬盘ID。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 创建此快照的云硬盘ID。
     * @param DiskId 创建此快照的云硬盘ID。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 快照正在跨地域复制的目的地域，默认取值为[]。 
     * @return CopyingToRegions 快照正在跨地域复制的目的地域，默认取值为[]。
     */
    public String [] getCopyingToRegions() {
        return this.CopyingToRegions;
    }

    /**
     * Set 快照正在跨地域复制的目的地域，默认取值为[]。
     * @param CopyingToRegions 快照正在跨地域复制的目的地域，默认取值为[]。
     */
    public void setCopyingToRegions(String [] CopyingToRegions) {
        this.CopyingToRegions = CopyingToRegions;
    }

    /**
     * Get 是否为加密盘创建的快照。取值范围：
<ul>
    <li>true：该快照为加密盘创建的</li>
    <li>false：非加密盘创建的快照</li>
</ul> 
     * @return Encrypt 是否为加密盘创建的快照。取值范围：
<ul>
    <li>true：该快照为加密盘创建的</li>
    <li>false：非加密盘创建的快照</li>
</ul>
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 是否为加密盘创建的快照。取值范围：
<ul>
    <li>true：该快照为加密盘创建的</li>
    <li>false：非加密盘创建的快照</li>
</ul>
     * @param Encrypt 是否为加密盘创建的快照。取值范围：
<ul>
    <li>true：该快照为加密盘创建的</li>
    <li>false：非加密盘创建的快照</li>
</ul>
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 快照的创建时间。 
     * @return CreateTime 快照的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 快照的创建时间。
     * @param CreateTime 快照的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 快照关联的镜像个数。 
     * @return ImageCount 快照关联的镜像个数。
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set 快照关联的镜像个数。
     * @param ImageCount 快照关联的镜像个数。
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get 创建此快照的云硬盘类型。取值范围：
<ul>
    <li>SYSTEM_DISK：系统盘</li>
    <li>DATA_DISK：数据盘</li>
</ul>
 
     * @return DiskUsage 创建此快照的云硬盘类型。取值范围：
<ul>
    <li>SYSTEM_DISK：系统盘</li>
    <li>DATA_DISK：数据盘</li>
</ul>

     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 创建此快照的云硬盘类型。取值范围：
<ul>
    <li>SYSTEM_DISK：系统盘</li>
    <li>DATA_DISK：数据盘</li>
</ul>

     * @param DiskUsage 创建此快照的云硬盘类型。取值范围：
<ul>
    <li>SYSTEM_DISK：系统盘</li>
    <li>DATA_DISK：数据盘</li>
</ul>

     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 快照ID。 
     * @return SnapshotId 快照ID。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照ID。
     * @param SnapshotId 快照ID。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 快照开始共享的时间。 
     * @return TimeStartShare 快照开始共享的时间。
     */
    public String getTimeStartShare() {
        return this.TimeStartShare;
    }

    /**
     * Set 快照开始共享的时间。
     * @param TimeStartShare 快照开始共享的时间。
     */
    public void setTimeStartShare(String TimeStartShare) {
        this.TimeStartShare = TimeStartShare;
    }

    /**
     * Get 快照绑定的标签列表。 
     * @return Tags 快照绑定的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 快照绑定的标签列表。
     * @param Tags 快照绑定的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public Snapshot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Snapshot(Snapshot source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.CopyFromRemote != null) {
            this.CopyFromRemote = new Boolean(source.CopyFromRemote);
        }
        if (source.SnapshotState != null) {
            this.SnapshotState = new String(source.SnapshotState);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.Images != null) {
            this.Images = new Image[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new Image(source.Images[i]);
            }
        }
        if (source.ShareReference != null) {
            this.ShareReference = new Long(source.ShareReference);
        }
        if (source.SnapshotType != null) {
            this.SnapshotType = new String(source.SnapshotType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.CopyingToRegions != null) {
            this.CopyingToRegions = new String[source.CopyingToRegions.length];
            for (int i = 0; i < source.CopyingToRegions.length; i++) {
                this.CopyingToRegions[i] = new String(source.CopyingToRegions[i]);
            }
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.TimeStartShare != null) {
            this.TimeStartShare = new String(source.TimeStartShare);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CopyFromRemote", this.CopyFromRemote);
        this.setParamSimple(map, prefix + "SnapshotState", this.SnapshotState);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ShareReference", this.ShareReference);
        this.setParamSimple(map, prefix + "SnapshotType", this.SnapshotType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamArraySimple(map, prefix + "CopyingToRegions.", this.CopyingToRegions);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "TimeStartShare", this.TimeStartShare);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

