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

public class AutoSnapshotPolicy extends AbstractModel {

    /**
    * 已绑定当前定期快照策略的云盘ID列表。
    */
    @SerializedName("DiskIdSet")
    @Expose
    private String [] DiskIdSet;

    /**
    * 定期快照策略是否激活。
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * 定期快照策略的状态。取值范围：
<ul>
  <li>NORMAL：正常</li>
  <li>ISOLATED：已隔离</li>
</ul>
    */
    @SerializedName("AutoSnapshotPolicyState")
    @Expose
    private String AutoSnapshotPolicyState;

    /**
    * 是否是跨账号复制快照快照, 1：是, 0: 不是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCopyToRemote")
    @Expose
    private Long IsCopyToRemote;

    /**
    * 使用该定期快照策略创建出来的快照是否永久保留。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 定期快照下次触发的时间。
    */
    @SerializedName("NextTriggerTime")
    @Expose
    private String NextTriggerTime;

    /**
    * 定期快照策略名称。
    */
    @SerializedName("AutoSnapshotPolicyName")
    @Expose
    private String AutoSnapshotPolicyName;

    /**
    * 定期快照策略ID。
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * 定期快照的执行策略。
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * 定期快照策略的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 使用该定期快照策略创建出来的快照保留天数。
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * 复制的目标账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CopyToAccountUin")
    @Expose
    private String CopyToAccountUin;

    /**
    * 已绑定当前定期快照策略的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 该定期快照创建的快照可以保留的月数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionMonths")
    @Expose
    private Long RetentionMonths;

    /**
    * 该定期快照创建的快照最大保留数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionAmount")
    @Expose
    private Long RetentionAmount;

    /**
    * 定期快照高级保留策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedRetentionPolicy")
    @Expose
    private AdvancedRetentionPolicy AdvancedRetentionPolicy;

    /**
    * 该复制快照策略的源端账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CopyFromAccountUin")
    @Expose
    private String CopyFromAccountUin;

    /**
    * 标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 已绑定当前定期快照策略的云盘ID列表。 
     * @return DiskIdSet 已绑定当前定期快照策略的云盘ID列表。
     */
    public String [] getDiskIdSet() {
        return this.DiskIdSet;
    }

    /**
     * Set 已绑定当前定期快照策略的云盘ID列表。
     * @param DiskIdSet 已绑定当前定期快照策略的云盘ID列表。
     */
    public void setDiskIdSet(String [] DiskIdSet) {
        this.DiskIdSet = DiskIdSet;
    }

    /**
     * Get 定期快照策略是否激活。 
     * @return IsActivated 定期快照策略是否激活。
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 定期快照策略是否激活。
     * @param IsActivated 定期快照策略是否激活。
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get 定期快照策略的状态。取值范围：
<ul>
  <li>NORMAL：正常</li>
  <li>ISOLATED：已隔离</li>
</ul> 
     * @return AutoSnapshotPolicyState 定期快照策略的状态。取值范围：
<ul>
  <li>NORMAL：正常</li>
  <li>ISOLATED：已隔离</li>
</ul>
     */
    public String getAutoSnapshotPolicyState() {
        return this.AutoSnapshotPolicyState;
    }

    /**
     * Set 定期快照策略的状态。取值范围：
<ul>
  <li>NORMAL：正常</li>
  <li>ISOLATED：已隔离</li>
</ul>
     * @param AutoSnapshotPolicyState 定期快照策略的状态。取值范围：
<ul>
  <li>NORMAL：正常</li>
  <li>ISOLATED：已隔离</li>
</ul>
     */
    public void setAutoSnapshotPolicyState(String AutoSnapshotPolicyState) {
        this.AutoSnapshotPolicyState = AutoSnapshotPolicyState;
    }

    /**
     * Get 是否是跨账号复制快照快照, 1：是, 0: 不是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCopyToRemote 是否是跨账号复制快照快照, 1：是, 0: 不是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCopyToRemote() {
        return this.IsCopyToRemote;
    }

    /**
     * Set 是否是跨账号复制快照快照, 1：是, 0: 不是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCopyToRemote 是否是跨账号复制快照快照, 1：是, 0: 不是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCopyToRemote(Long IsCopyToRemote) {
        this.IsCopyToRemote = IsCopyToRemote;
    }

    /**
     * Get 使用该定期快照策略创建出来的快照是否永久保留。 
     * @return IsPermanent 使用该定期快照策略创建出来的快照是否永久保留。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 使用该定期快照策略创建出来的快照是否永久保留。
     * @param IsPermanent 使用该定期快照策略创建出来的快照是否永久保留。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 定期快照下次触发的时间。 
     * @return NextTriggerTime 定期快照下次触发的时间。
     */
    public String getNextTriggerTime() {
        return this.NextTriggerTime;
    }

    /**
     * Set 定期快照下次触发的时间。
     * @param NextTriggerTime 定期快照下次触发的时间。
     */
    public void setNextTriggerTime(String NextTriggerTime) {
        this.NextTriggerTime = NextTriggerTime;
    }

    /**
     * Get 定期快照策略名称。 
     * @return AutoSnapshotPolicyName 定期快照策略名称。
     */
    public String getAutoSnapshotPolicyName() {
        return this.AutoSnapshotPolicyName;
    }

    /**
     * Set 定期快照策略名称。
     * @param AutoSnapshotPolicyName 定期快照策略名称。
     */
    public void setAutoSnapshotPolicyName(String AutoSnapshotPolicyName) {
        this.AutoSnapshotPolicyName = AutoSnapshotPolicyName;
    }

    /**
     * Get 定期快照策略ID。 
     * @return AutoSnapshotPolicyId 定期快照策略ID。
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set 定期快照策略ID。
     * @param AutoSnapshotPolicyId 定期快照策略ID。
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get 定期快照的执行策略。 
     * @return Policy 定期快照的执行策略。
     */
    public Policy [] getPolicy() {
        return this.Policy;
    }

    /**
     * Set 定期快照的执行策略。
     * @param Policy 定期快照的执行策略。
     */
    public void setPolicy(Policy [] Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 定期快照策略的创建时间。 
     * @return CreateTime 定期快照策略的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 定期快照策略的创建时间。
     * @param CreateTime 定期快照策略的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 使用该定期快照策略创建出来的快照保留天数。 
     * @return RetentionDays 使用该定期快照策略创建出来的快照保留天数。
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set 使用该定期快照策略创建出来的快照保留天数。
     * @param RetentionDays 使用该定期快照策略创建出来的快照保留天数。
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get 复制的目标账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CopyToAccountUin 复制的目标账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCopyToAccountUin() {
        return this.CopyToAccountUin;
    }

    /**
     * Set 复制的目标账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CopyToAccountUin 复制的目标账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCopyToAccountUin(String CopyToAccountUin) {
        this.CopyToAccountUin = CopyToAccountUin;
    }

    /**
     * Get 已绑定当前定期快照策略的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIdSet 已绑定当前定期快照策略的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 已绑定当前定期快照策略的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIdSet 已绑定当前定期快照策略的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 该定期快照创建的快照可以保留的月数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionMonths 该定期快照创建的快照可以保留的月数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetentionMonths() {
        return this.RetentionMonths;
    }

    /**
     * Set 该定期快照创建的快照可以保留的月数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionMonths 该定期快照创建的快照可以保留的月数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionMonths(Long RetentionMonths) {
        this.RetentionMonths = RetentionMonths;
    }

    /**
     * Get 该定期快照创建的快照最大保留数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionAmount 该定期快照创建的快照最大保留数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetentionAmount() {
        return this.RetentionAmount;
    }

    /**
     * Set 该定期快照创建的快照最大保留数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionAmount 该定期快照创建的快照最大保留数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionAmount(Long RetentionAmount) {
        this.RetentionAmount = RetentionAmount;
    }

    /**
     * Get 定期快照高级保留策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedRetentionPolicy 定期快照高级保留策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedRetentionPolicy getAdvancedRetentionPolicy() {
        return this.AdvancedRetentionPolicy;
    }

    /**
     * Set 定期快照高级保留策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedRetentionPolicy 定期快照高级保留策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedRetentionPolicy(AdvancedRetentionPolicy AdvancedRetentionPolicy) {
        this.AdvancedRetentionPolicy = AdvancedRetentionPolicy;
    }

    /**
     * Get 该复制快照策略的源端账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CopyFromAccountUin 该复制快照策略的源端账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCopyFromAccountUin() {
        return this.CopyFromAccountUin;
    }

    /**
     * Set 该复制快照策略的源端账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CopyFromAccountUin 该复制快照策略的源端账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCopyFromAccountUin(String CopyFromAccountUin) {
        this.CopyFromAccountUin = CopyFromAccountUin;
    }

    /**
     * Get 标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public AutoSnapshotPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoSnapshotPolicy(AutoSnapshotPolicy source) {
        if (source.DiskIdSet != null) {
            this.DiskIdSet = new String[source.DiskIdSet.length];
            for (int i = 0; i < source.DiskIdSet.length; i++) {
                this.DiskIdSet[i] = new String(source.DiskIdSet[i]);
            }
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Boolean(source.IsActivated);
        }
        if (source.AutoSnapshotPolicyState != null) {
            this.AutoSnapshotPolicyState = new String(source.AutoSnapshotPolicyState);
        }
        if (source.IsCopyToRemote != null) {
            this.IsCopyToRemote = new Long(source.IsCopyToRemote);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.NextTriggerTime != null) {
            this.NextTriggerTime = new String(source.NextTriggerTime);
        }
        if (source.AutoSnapshotPolicyName != null) {
            this.AutoSnapshotPolicyName = new String(source.AutoSnapshotPolicyName);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.Policy != null) {
            this.Policy = new Policy[source.Policy.length];
            for (int i = 0; i < source.Policy.length; i++) {
                this.Policy[i] = new Policy(source.Policy[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
        if (source.CopyToAccountUin != null) {
            this.CopyToAccountUin = new String(source.CopyToAccountUin);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.RetentionMonths != null) {
            this.RetentionMonths = new Long(source.RetentionMonths);
        }
        if (source.RetentionAmount != null) {
            this.RetentionAmount = new Long(source.RetentionAmount);
        }
        if (source.AdvancedRetentionPolicy != null) {
            this.AdvancedRetentionPolicy = new AdvancedRetentionPolicy(source.AdvancedRetentionPolicy);
        }
        if (source.CopyFromAccountUin != null) {
            this.CopyFromAccountUin = new String(source.CopyFromAccountUin);
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
        this.setParamArraySimple(map, prefix + "DiskIdSet.", this.DiskIdSet);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyState", this.AutoSnapshotPolicyState);
        this.setParamSimple(map, prefix + "IsCopyToRemote", this.IsCopyToRemote);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "NextTriggerTime", this.NextTriggerTime);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyName", this.AutoSnapshotPolicyName);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamArrayObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamSimple(map, prefix + "CopyToAccountUin", this.CopyToAccountUin);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "RetentionMonths", this.RetentionMonths);
        this.setParamSimple(map, prefix + "RetentionAmount", this.RetentionAmount);
        this.setParamObj(map, prefix + "AdvancedRetentionPolicy.", this.AdvancedRetentionPolicy);
        this.setParamSimple(map, prefix + "CopyFromAccountUin", this.CopyFromAccountUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

