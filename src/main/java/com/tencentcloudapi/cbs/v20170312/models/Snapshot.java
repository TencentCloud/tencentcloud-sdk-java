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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Snapshot extends AbstractModel {

    /**
    * <p>快照所在的位置。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>是否为跨地域复制的快照。取值范围：</p><ul>    <li>true：表示为跨地域复制的快照。</li>    <li>false：本地域的快照。</li></ul>
    */
    @SerializedName("CopyFromRemote")
    @Expose
    private Boolean CopyFromRemote;

    /**
    * <p>快照的状态。取值范围：</p><ul>    <li>NORMAL：正常</li>    <li>CREATING：创建中</li>    <li>ROLLBACKING：回滚中</li>    <li>COPYING_FROM_REMOTE：跨地域复制中</li>    <li>CHECKING_COPIED：复制校验中</li>    <li>TORECYCLE：待回收</li></ul>
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * <p>是否为永久快照。取值范围：</p><ul>    <li>true：永久快照</li>    <li>false：非永久快照</li></ul>
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * <p>快照名称，用户自定义的快照别名。调用<a href="/document/product/362/15650">ModifySnapshotAttribute</a>可修改此字段。</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>快照到期时间。如果快照为永久保留，此字段为空。</p>
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p>
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * <p>快照关联的镜像列表。</p>
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * <p>快照当前被共享数。</p>
    */
    @SerializedName("ShareReference")
    @Expose
    private Long ShareReference;

    /**
    * <p>快照类型，目前该项取值可以为<code>PRIVATE_SNAPSHOT</code>（私有快照）或者<code>SHARED_SNAPSHOT</code>（共享快照）</p>
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * <p>创建此快照的云硬盘大小，单位GiB。</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>创建此快照的云硬盘ID。</p>
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * <p>快照正在跨地域复制的目的地域，若没有则返回<code>[]</code>。</p>
    */
    @SerializedName("CopyingToRegions")
    @Expose
    private String [] CopyingToRegions;

    /**
    * <p>是否为加密盘创建的快照。取值范围：</p><ul>    <li>true：该快照为加密盘创建的</li>    <li>false：非加密盘创建的快照</li></ul>
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * <p>快照的创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>快照关联的镜像个数。</p>
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * <p>创建此快照的云硬盘类型。取值范围：</p><ul>    <li>SYSTEM_DISK：系统盘</li>    <li>DATA_DISK：数据盘</li></ul>
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * <p>快照ID。</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>快照开始共享的时间。</p>
    */
    @SerializedName("TimeStartShare")
    @Expose
    private String TimeStartShare;

    /**
    * <p>快照绑定的标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>快照是否锁定。取值范围：</p><ul>    <li>true：已锁定</li>    <li>false：未锁定</li></ul>
    */
    @SerializedName("IsLocked")
    @Expose
    private Boolean IsLocked;

    /**
    * <p>快照记录的最新修改时间</p>
    */
    @SerializedName("LatestModifyTime")
    @Expose
    private String LatestModifyTime;

    /**
    * <p>自动快照策略ID，仅当该快照由自动快照策略方式创建时才会返回。</p>
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
     * Get <p>快照所在的位置。</p> 
     * @return Placement <p>快照所在的位置。</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>快照所在的位置。</p>
     * @param Placement <p>快照所在的位置。</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>是否为跨地域复制的快照。取值范围：</p><ul>    <li>true：表示为跨地域复制的快照。</li>    <li>false：本地域的快照。</li></ul> 
     * @return CopyFromRemote <p>是否为跨地域复制的快照。取值范围：</p><ul>    <li>true：表示为跨地域复制的快照。</li>    <li>false：本地域的快照。</li></ul>
     */
    public Boolean getCopyFromRemote() {
        return this.CopyFromRemote;
    }

    /**
     * Set <p>是否为跨地域复制的快照。取值范围：</p><ul>    <li>true：表示为跨地域复制的快照。</li>    <li>false：本地域的快照。</li></ul>
     * @param CopyFromRemote <p>是否为跨地域复制的快照。取值范围：</p><ul>    <li>true：表示为跨地域复制的快照。</li>    <li>false：本地域的快照。</li></ul>
     */
    public void setCopyFromRemote(Boolean CopyFromRemote) {
        this.CopyFromRemote = CopyFromRemote;
    }

    /**
     * Get <p>快照的状态。取值范围：</p><ul>    <li>NORMAL：正常</li>    <li>CREATING：创建中</li>    <li>ROLLBACKING：回滚中</li>    <li>COPYING_FROM_REMOTE：跨地域复制中</li>    <li>CHECKING_COPIED：复制校验中</li>    <li>TORECYCLE：待回收</li></ul> 
     * @return SnapshotState <p>快照的状态。取值范围：</p><ul>    <li>NORMAL：正常</li>    <li>CREATING：创建中</li>    <li>ROLLBACKING：回滚中</li>    <li>COPYING_FROM_REMOTE：跨地域复制中</li>    <li>CHECKING_COPIED：复制校验中</li>    <li>TORECYCLE：待回收</li></ul>
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * Set <p>快照的状态。取值范围：</p><ul>    <li>NORMAL：正常</li>    <li>CREATING：创建中</li>    <li>ROLLBACKING：回滚中</li>    <li>COPYING_FROM_REMOTE：跨地域复制中</li>    <li>CHECKING_COPIED：复制校验中</li>    <li>TORECYCLE：待回收</li></ul>
     * @param SnapshotState <p>快照的状态。取值范围：</p><ul>    <li>NORMAL：正常</li>    <li>CREATING：创建中</li>    <li>ROLLBACKING：回滚中</li>    <li>COPYING_FROM_REMOTE：跨地域复制中</li>    <li>CHECKING_COPIED：复制校验中</li>    <li>TORECYCLE：待回收</li></ul>
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * Get <p>是否为永久快照。取值范围：</p><ul>    <li>true：永久快照</li>    <li>false：非永久快照</li></ul> 
     * @return IsPermanent <p>是否为永久快照。取值范围：</p><ul>    <li>true：永久快照</li>    <li>false：非永久快照</li></ul>
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set <p>是否为永久快照。取值范围：</p><ul>    <li>true：永久快照</li>    <li>false：非永久快照</li></ul>
     * @param IsPermanent <p>是否为永久快照。取值范围：</p><ul>    <li>true：永久快照</li>    <li>false：非永久快照</li></ul>
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get <p>快照名称，用户自定义的快照别名。调用<a href="/document/product/362/15650">ModifySnapshotAttribute</a>可修改此字段。</p> 
     * @return SnapshotName <p>快照名称，用户自定义的快照别名。调用<a href="/document/product/362/15650">ModifySnapshotAttribute</a>可修改此字段。</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>快照名称，用户自定义的快照别名。调用<a href="/document/product/362/15650">ModifySnapshotAttribute</a>可修改此字段。</p>
     * @param SnapshotName <p>快照名称，用户自定义的快照别名。调用<a href="/document/product/362/15650">ModifySnapshotAttribute</a>可修改此字段。</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>快照到期时间。如果快照为永久保留，此字段为空。</p> 
     * @return DeadlineTime <p>快照到期时间。如果快照为永久保留，此字段为空。</p>
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>快照到期时间。如果快照为永久保留，此字段为空。</p>
     * @param DeadlineTime <p>快照到期时间。如果快照为永久保留，此字段为空。</p>
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p> 
     * @return Percent <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p>
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p>
     * @param Percent <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p>
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>快照关联的镜像列表。</p> 
     * @return Images <p>快照关联的镜像列表。</p>
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>快照关联的镜像列表。</p>
     * @param Images <p>快照关联的镜像列表。</p>
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>快照当前被共享数。</p> 
     * @return ShareReference <p>快照当前被共享数。</p>
     */
    public Long getShareReference() {
        return this.ShareReference;
    }

    /**
     * Set <p>快照当前被共享数。</p>
     * @param ShareReference <p>快照当前被共享数。</p>
     */
    public void setShareReference(Long ShareReference) {
        this.ShareReference = ShareReference;
    }

    /**
     * Get <p>快照类型，目前该项取值可以为<code>PRIVATE_SNAPSHOT</code>（私有快照）或者<code>SHARED_SNAPSHOT</code>（共享快照）</p> 
     * @return SnapshotType <p>快照类型，目前该项取值可以为<code>PRIVATE_SNAPSHOT</code>（私有快照）或者<code>SHARED_SNAPSHOT</code>（共享快照）</p>
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set <p>快照类型，目前该项取值可以为<code>PRIVATE_SNAPSHOT</code>（私有快照）或者<code>SHARED_SNAPSHOT</code>（共享快照）</p>
     * @param SnapshotType <p>快照类型，目前该项取值可以为<code>PRIVATE_SNAPSHOT</code>（私有快照）或者<code>SHARED_SNAPSHOT</code>（共享快照）</p>
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * Get <p>创建此快照的云硬盘大小，单位GiB。</p> 
     * @return DiskSize <p>创建此快照的云硬盘大小，单位GiB。</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>创建此快照的云硬盘大小，单位GiB。</p>
     * @param DiskSize <p>创建此快照的云硬盘大小，单位GiB。</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>创建此快照的云硬盘ID。</p> 
     * @return DiskId <p>创建此快照的云硬盘ID。</p>
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>创建此快照的云硬盘ID。</p>
     * @param DiskId <p>创建此快照的云硬盘ID。</p>
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get <p>快照正在跨地域复制的目的地域，若没有则返回<code>[]</code>。</p> 
     * @return CopyingToRegions <p>快照正在跨地域复制的目的地域，若没有则返回<code>[]</code>。</p>
     */
    public String [] getCopyingToRegions() {
        return this.CopyingToRegions;
    }

    /**
     * Set <p>快照正在跨地域复制的目的地域，若没有则返回<code>[]</code>。</p>
     * @param CopyingToRegions <p>快照正在跨地域复制的目的地域，若没有则返回<code>[]</code>。</p>
     */
    public void setCopyingToRegions(String [] CopyingToRegions) {
        this.CopyingToRegions = CopyingToRegions;
    }

    /**
     * Get <p>是否为加密盘创建的快照。取值范围：</p><ul>    <li>true：该快照为加密盘创建的</li>    <li>false：非加密盘创建的快照</li></ul> 
     * @return Encrypt <p>是否为加密盘创建的快照。取值范围：</p><ul>    <li>true：该快照为加密盘创建的</li>    <li>false：非加密盘创建的快照</li></ul>
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set <p>是否为加密盘创建的快照。取值范围：</p><ul>    <li>true：该快照为加密盘创建的</li>    <li>false：非加密盘创建的快照</li></ul>
     * @param Encrypt <p>是否为加密盘创建的快照。取值范围：</p><ul>    <li>true：该快照为加密盘创建的</li>    <li>false：非加密盘创建的快照</li></ul>
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get <p>快照的创建时间。</p> 
     * @return CreateTime <p>快照的创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>快照的创建时间。</p>
     * @param CreateTime <p>快照的创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>快照关联的镜像个数。</p> 
     * @return ImageCount <p>快照关联的镜像个数。</p>
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set <p>快照关联的镜像个数。</p>
     * @param ImageCount <p>快照关联的镜像个数。</p>
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get <p>创建此快照的云硬盘类型。取值范围：</p><ul>    <li>SYSTEM_DISK：系统盘</li>    <li>DATA_DISK：数据盘</li></ul> 
     * @return DiskUsage <p>创建此快照的云硬盘类型。取值范围：</p><ul>    <li>SYSTEM_DISK：系统盘</li>    <li>DATA_DISK：数据盘</li></ul>
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set <p>创建此快照的云硬盘类型。取值范围：</p><ul>    <li>SYSTEM_DISK：系统盘</li>    <li>DATA_DISK：数据盘</li></ul>
     * @param DiskUsage <p>创建此快照的云硬盘类型。取值范围：</p><ul>    <li>SYSTEM_DISK：系统盘</li>    <li>DATA_DISK：数据盘</li></ul>
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get <p>快照ID。</p> 
     * @return SnapshotId <p>快照ID。</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>快照ID。</p>
     * @param SnapshotId <p>快照ID。</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>快照开始共享的时间。</p> 
     * @return TimeStartShare <p>快照开始共享的时间。</p>
     */
    public String getTimeStartShare() {
        return this.TimeStartShare;
    }

    /**
     * Set <p>快照开始共享的时间。</p>
     * @param TimeStartShare <p>快照开始共享的时间。</p>
     */
    public void setTimeStartShare(String TimeStartShare) {
        this.TimeStartShare = TimeStartShare;
    }

    /**
     * Get <p>快照绑定的标签列表。</p> 
     * @return Tags <p>快照绑定的标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>快照绑定的标签列表。</p>
     * @param Tags <p>快照绑定的标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>快照是否锁定。取值范围：</p><ul>    <li>true：已锁定</li>    <li>false：未锁定</li></ul> 
     * @return IsLocked <p>快照是否锁定。取值范围：</p><ul>    <li>true：已锁定</li>    <li>false：未锁定</li></ul>
     */
    public Boolean getIsLocked() {
        return this.IsLocked;
    }

    /**
     * Set <p>快照是否锁定。取值范围：</p><ul>    <li>true：已锁定</li>    <li>false：未锁定</li></ul>
     * @param IsLocked <p>快照是否锁定。取值范围：</p><ul>    <li>true：已锁定</li>    <li>false：未锁定</li></ul>
     */
    public void setIsLocked(Boolean IsLocked) {
        this.IsLocked = IsLocked;
    }

    /**
     * Get <p>快照记录的最新修改时间</p> 
     * @return LatestModifyTime <p>快照记录的最新修改时间</p>
     */
    public String getLatestModifyTime() {
        return this.LatestModifyTime;
    }

    /**
     * Set <p>快照记录的最新修改时间</p>
     * @param LatestModifyTime <p>快照记录的最新修改时间</p>
     */
    public void setLatestModifyTime(String LatestModifyTime) {
        this.LatestModifyTime = LatestModifyTime;
    }

    /**
     * Get <p>自动快照策略ID，仅当该快照由自动快照策略方式创建时才会返回。</p> 
     * @return AutoSnapshotPolicyId <p>自动快照策略ID，仅当该快照由自动快照策略方式创建时才会返回。</p>
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set <p>自动快照策略ID，仅当该快照由自动快照策略方式创建时才会返回。</p>
     * @param AutoSnapshotPolicyId <p>自动快照策略ID，仅当该快照由自动快照策略方式创建时才会返回。</p>
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
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
        if (source.IsLocked != null) {
            this.IsLocked = new Boolean(source.IsLocked);
        }
        if (source.LatestModifyTime != null) {
            this.LatestModifyTime = new String(source.LatestModifyTime);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
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
        this.setParamSimple(map, prefix + "IsLocked", this.IsLocked);
        this.setParamSimple(map, prefix + "LatestModifyTime", this.LatestModifyTime);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);

    }
}

