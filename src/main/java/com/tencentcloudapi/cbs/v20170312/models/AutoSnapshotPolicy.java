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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoSnapshotPolicy extends AbstractModel{

    /**
    * 定期快照策略ID。
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * 定期快照策略名称。
    */
    @SerializedName("AutoSnapshotPolicyName")
    @Expose
    private String AutoSnapshotPolicyName;

    /**
    * 定期快照策略的状态。取值范围：<br><li>NORMAL：正常<br><li>ISOLATED：已隔离。
    */
    @SerializedName("AutoSnapshotPolicyState")
    @Expose
    private String AutoSnapshotPolicyState;

    /**
    * 定期快照策略是否激活。
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * 使用该定期快照策略创建出来的快照是否永久保留。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 使用该定期快照策略创建出来的快照保留天数。
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * 定期快照策略的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 定期快照下次触发的时间。
    */
    @SerializedName("NextTriggerTime")
    @Expose
    private String NextTriggerTime;

    /**
    * 定期快照的执行策略。
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * 已绑定当前定期快照策略的云盘ID列表。
    */
    @SerializedName("DiskIdSet")
    @Expose
    private String [] DiskIdSet;

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
     * Get 定期快照策略的状态。取值范围：<br><li>NORMAL：正常<br><li>ISOLATED：已隔离。 
     * @return AutoSnapshotPolicyState 定期快照策略的状态。取值范围：<br><li>NORMAL：正常<br><li>ISOLATED：已隔离。
     */
    public String getAutoSnapshotPolicyState() {
        return this.AutoSnapshotPolicyState;
    }

    /**
     * Set 定期快照策略的状态。取值范围：<br><li>NORMAL：正常<br><li>ISOLATED：已隔离。
     * @param AutoSnapshotPolicyState 定期快照策略的状态。取值范围：<br><li>NORMAL：正常<br><li>ISOLATED：已隔离。
     */
    public void setAutoSnapshotPolicyState(String AutoSnapshotPolicyState) {
        this.AutoSnapshotPolicyState = AutoSnapshotPolicyState;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyName", this.AutoSnapshotPolicyName);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyState", this.AutoSnapshotPolicyState);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "NextTriggerTime", this.NextTriggerTime);
        this.setParamArrayObj(map, prefix + "Policy.", this.Policy);
        this.setParamArraySimple(map, prefix + "DiskIdSet.", this.DiskIdSet);

    }
}

