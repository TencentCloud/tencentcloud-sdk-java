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

public class SnapshotGroup extends AbstractModel {

    /**
    * 快照组ID。
    */
    @SerializedName("SnapshotGroupId")
    @Expose
    private String SnapshotGroupId;

    /**
    * 快照组类型。NORMAL: 普通快照组，非一致性快照。
    */
    @SerializedName("SnapshotGroupType")
    @Expose
    private String SnapshotGroupType;

    /**
    * 快照组是否包含系统盘快照。
    */
    @SerializedName("ContainRootSnapshot")
    @Expose
    private Boolean ContainRootSnapshot;

    /**
    * 快照组包含的快照ID列表。
    */
    @SerializedName("SnapshotIdSet")
    @Expose
    private String [] SnapshotIdSet;

    /**
    * <ul>
    <li>NORMAL: 正常</li>
    <li>CREATING: 创建中</li>
    <li>ROLLBACKING: 回滚中</li>
</ul>
    */
    @SerializedName("SnapshotGroupState")
    @Expose
    private String SnapshotGroupState;

    /**
    * 快照组创建进度。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 快照组创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 快照组最新修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 快照组关联的镜像列表。
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * 快照组名称。
    */
    @SerializedName("SnapshotGroupName")
    @Expose
    private String SnapshotGroupName;

    /**
    * 快照组关联的镜像数量。
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * 快照组是否永久保留
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 快照组到期时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 来源自动快照策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
     * Get 快照组ID。 
     * @return SnapshotGroupId 快照组ID。
     */
    public String getSnapshotGroupId() {
        return this.SnapshotGroupId;
    }

    /**
     * Set 快照组ID。
     * @param SnapshotGroupId 快照组ID。
     */
    public void setSnapshotGroupId(String SnapshotGroupId) {
        this.SnapshotGroupId = SnapshotGroupId;
    }

    /**
     * Get 快照组类型。NORMAL: 普通快照组，非一致性快照。 
     * @return SnapshotGroupType 快照组类型。NORMAL: 普通快照组，非一致性快照。
     */
    public String getSnapshotGroupType() {
        return this.SnapshotGroupType;
    }

    /**
     * Set 快照组类型。NORMAL: 普通快照组，非一致性快照。
     * @param SnapshotGroupType 快照组类型。NORMAL: 普通快照组，非一致性快照。
     */
    public void setSnapshotGroupType(String SnapshotGroupType) {
        this.SnapshotGroupType = SnapshotGroupType;
    }

    /**
     * Get 快照组是否包含系统盘快照。 
     * @return ContainRootSnapshot 快照组是否包含系统盘快照。
     */
    public Boolean getContainRootSnapshot() {
        return this.ContainRootSnapshot;
    }

    /**
     * Set 快照组是否包含系统盘快照。
     * @param ContainRootSnapshot 快照组是否包含系统盘快照。
     */
    public void setContainRootSnapshot(Boolean ContainRootSnapshot) {
        this.ContainRootSnapshot = ContainRootSnapshot;
    }

    /**
     * Get 快照组包含的快照ID列表。 
     * @return SnapshotIdSet 快照组包含的快照ID列表。
     */
    public String [] getSnapshotIdSet() {
        return this.SnapshotIdSet;
    }

    /**
     * Set 快照组包含的快照ID列表。
     * @param SnapshotIdSet 快照组包含的快照ID列表。
     */
    public void setSnapshotIdSet(String [] SnapshotIdSet) {
        this.SnapshotIdSet = SnapshotIdSet;
    }

    /**
     * Get <ul>
    <li>NORMAL: 正常</li>
    <li>CREATING: 创建中</li>
    <li>ROLLBACKING: 回滚中</li>
</ul> 
     * @return SnapshotGroupState <ul>
    <li>NORMAL: 正常</li>
    <li>CREATING: 创建中</li>
    <li>ROLLBACKING: 回滚中</li>
</ul>
     */
    public String getSnapshotGroupState() {
        return this.SnapshotGroupState;
    }

    /**
     * Set <ul>
    <li>NORMAL: 正常</li>
    <li>CREATING: 创建中</li>
    <li>ROLLBACKING: 回滚中</li>
</ul>
     * @param SnapshotGroupState <ul>
    <li>NORMAL: 正常</li>
    <li>CREATING: 创建中</li>
    <li>ROLLBACKING: 回滚中</li>
</ul>
     */
    public void setSnapshotGroupState(String SnapshotGroupState) {
        this.SnapshotGroupState = SnapshotGroupState;
    }

    /**
     * Get 快照组创建进度。 
     * @return Percent 快照组创建进度。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 快照组创建进度。
     * @param Percent 快照组创建进度。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 快照组创建时间。 
     * @return CreateTime 快照组创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 快照组创建时间。
     * @param CreateTime 快照组创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 快照组最新修改时间 
     * @return ModifyTime 快照组最新修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 快照组最新修改时间
     * @param ModifyTime 快照组最新修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 快照组关联的镜像列表。 
     * @return Images 快照组关联的镜像列表。
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set 快照组关联的镜像列表。
     * @param Images 快照组关联的镜像列表。
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get 快照组名称。 
     * @return SnapshotGroupName 快照组名称。
     */
    public String getSnapshotGroupName() {
        return this.SnapshotGroupName;
    }

    /**
     * Set 快照组名称。
     * @param SnapshotGroupName 快照组名称。
     */
    public void setSnapshotGroupName(String SnapshotGroupName) {
        this.SnapshotGroupName = SnapshotGroupName;
    }

    /**
     * Get 快照组关联的镜像数量。 
     * @return ImageCount 快照组关联的镜像数量。
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set 快照组关联的镜像数量。
     * @param ImageCount 快照组关联的镜像数量。
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get 快照组是否永久保留 
     * @return IsPermanent 快照组是否永久保留
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 快照组是否永久保留
     * @param IsPermanent 快照组是否永久保留
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 快照组到期时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineTime 快照组到期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 快照组到期时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineTime 快照组到期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 来源自动快照策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSnapshotPolicyId 来源自动快照策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set 来源自动快照策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSnapshotPolicyId 来源自动快照策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    public SnapshotGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotGroup(SnapshotGroup source) {
        if (source.SnapshotGroupId != null) {
            this.SnapshotGroupId = new String(source.SnapshotGroupId);
        }
        if (source.SnapshotGroupType != null) {
            this.SnapshotGroupType = new String(source.SnapshotGroupType);
        }
        if (source.ContainRootSnapshot != null) {
            this.ContainRootSnapshot = new Boolean(source.ContainRootSnapshot);
        }
        if (source.SnapshotIdSet != null) {
            this.SnapshotIdSet = new String[source.SnapshotIdSet.length];
            for (int i = 0; i < source.SnapshotIdSet.length; i++) {
                this.SnapshotIdSet[i] = new String(source.SnapshotIdSet[i]);
            }
        }
        if (source.SnapshotGroupState != null) {
            this.SnapshotGroupState = new String(source.SnapshotGroupState);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Images != null) {
            this.Images = new Image[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new Image(source.Images[i]);
            }
        }
        if (source.SnapshotGroupName != null) {
            this.SnapshotGroupName = new String(source.SnapshotGroupName);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotGroupId", this.SnapshotGroupId);
        this.setParamSimple(map, prefix + "SnapshotGroupType", this.SnapshotGroupType);
        this.setParamSimple(map, prefix + "ContainRootSnapshot", this.ContainRootSnapshot);
        this.setParamArraySimple(map, prefix + "SnapshotIdSet.", this.SnapshotIdSet);
        this.setParamSimple(map, prefix + "SnapshotGroupState", this.SnapshotGroupState);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "SnapshotGroupName", this.SnapshotGroupName);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);

    }
}

