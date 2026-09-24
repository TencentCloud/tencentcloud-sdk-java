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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudRecordVersion extends AbstractModel {

    /**
    * <p>Version ID；格式 <code>rv-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>所属 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>Version 递增序号（1 起）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Revision")
    @Expose
    private Long Revision;

    /**
    * <p>Version 状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>审批模式；创建时锁定，后续变更 Registry 审批模式不影响本 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApprovalMode")
    @Expose
    private String ApprovalMode;

    /**
    * <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>创建时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Version 别名（可选）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>协议描述符对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Descriptors")
    @Expose
    private String Descriptors;

    /**
    * <p>内容来源。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>规范化来源配置对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceConfig")
    @Expose
    private String SourceConfig;

    /**
    * <p>内容状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentStatus")
    @Expose
    private String ContentStatus;

    /**
    * <p>READY 内容 SHA-256。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentSHA256")
    @Expose
    private String ContentSHA256;

    /**
    * <p>READY 内容字节数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentSizeBytes")
    @Expose
    private Long ContentSizeBytes;

    /**
    * <p>配置内容规范化后的 SHA-256（用于幂等去重）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigSHA256")
    @Expose
    private String ConfigSHA256;

    /**
    * <p>创建者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorSubAccountUin")
    @Expose
    private String CreatorSubAccountUin;

    /**
    * <p>Version 历次审批动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApprovalActions")
    @Expose
    private CloudVersionApprovalAction [] ApprovalActions;

    /**
    * <p>TAR 内容成功校验、完成物化并进入 READY 的时间；MANUAL / URL_IMPORT 或尚未 READY 的 TAR_PACKAGE 均为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentReadyTime")
    @Expose
    private String ContentReadyTime;

    /**
    * <p>本次 Version 的变更原因，最大 4096 字符；不可修改。Revision 1 或未填写时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChangeLog")
    @Expose
    private String ChangeLog;

    /**
    * <p>当前绑定该 Version 的 Label Name 列表（例如 stable / latest 或自定义 Label 名称）。未绑定 Label 不在此返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
     * Get <p>Version ID；格式 <code>rv-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId <p>Version ID；格式 <code>rv-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>Version ID；格式 <code>rv-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId <p>Version ID；格式 <code>rv-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>所属 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId <p>所属 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>所属 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId <p>所属 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>Version 递增序号（1 起）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Revision <p>Version 递增序号（1 起）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRevision() {
        return this.Revision;
    }

    /**
     * Set <p>Version 递增序号（1 起）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Revision <p>Version 递增序号（1 起）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRevision(Long Revision) {
        this.Revision = Revision;
    }

    /**
     * Get <p>Version 状态。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>Version 状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Version 状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>Version 状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>审批模式；创建时锁定，后续变更 Registry 审批模式不影响本 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApprovalMode <p>审批模式；创建时锁定，后续变更 Registry 审批模式不影响本 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApprovalMode() {
        return this.ApprovalMode;
    }

    /**
     * Set <p>审批模式；创建时锁定，后续变更 Registry 审批模式不影响本 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApprovalMode <p>审批模式；创建时锁定，后续变更 Registry 审批模式不影响本 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApprovalMode(String ApprovalMode) {
        this.ApprovalMode = ApprovalMode;
    }

    /**
     * Get <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>创建时间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Version 别名（可选）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName <p>Version 别名（可选）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>Version 别名（可选）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName <p>Version 别名（可选）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>协议描述符对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Descriptors <p>协议描述符对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptors() {
        return this.Descriptors;
    }

    /**
     * Set <p>协议描述符对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Descriptors <p>协议描述符对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptors(String Descriptors) {
        this.Descriptors = Descriptors;
    }

    /**
     * Get <p>内容来源。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType <p>内容来源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>内容来源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType <p>内容来源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>规范化来源配置对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceConfig <p>规范化来源配置对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceConfig() {
        return this.SourceConfig;
    }

    /**
     * Set <p>规范化来源配置对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceConfig <p>规范化来源配置对象。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceConfig(String SourceConfig) {
        this.SourceConfig = SourceConfig;
    }

    /**
     * Get <p>内容状态。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentStatus <p>内容状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentStatus() {
        return this.ContentStatus;
    }

    /**
     * Set <p>内容状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentStatus <p>内容状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentStatus(String ContentStatus) {
        this.ContentStatus = ContentStatus;
    }

    /**
     * Get <p>READY 内容 SHA-256。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentSHA256 <p>READY 内容 SHA-256。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentSHA256() {
        return this.ContentSHA256;
    }

    /**
     * Set <p>READY 内容 SHA-256。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentSHA256 <p>READY 内容 SHA-256。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentSHA256(String ContentSHA256) {
        this.ContentSHA256 = ContentSHA256;
    }

    /**
     * Get <p>READY 内容字节数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentSizeBytes <p>READY 内容字节数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContentSizeBytes() {
        return this.ContentSizeBytes;
    }

    /**
     * Set <p>READY 内容字节数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentSizeBytes <p>READY 内容字节数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentSizeBytes(Long ContentSizeBytes) {
        this.ContentSizeBytes = ContentSizeBytes;
    }

    /**
     * Get <p>配置内容规范化后的 SHA-256（用于幂等去重）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigSHA256 <p>配置内容规范化后的 SHA-256（用于幂等去重）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigSHA256() {
        return this.ConfigSHA256;
    }

    /**
     * Set <p>配置内容规范化后的 SHA-256（用于幂等去重）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigSHA256 <p>配置内容规范化后的 SHA-256（用于幂等去重）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigSHA256(String ConfigSHA256) {
        this.ConfigSHA256 = ConfigSHA256;
    }

    /**
     * Get <p>创建者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorSubAccountUin <p>创建者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorSubAccountUin() {
        return this.CreatorSubAccountUin;
    }

    /**
     * Set <p>创建者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorSubAccountUin <p>创建者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorSubAccountUin(String CreatorSubAccountUin) {
        this.CreatorSubAccountUin = CreatorSubAccountUin;
    }

    /**
     * Get <p>Version 历次审批动作。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApprovalActions <p>Version 历次审批动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudVersionApprovalAction [] getApprovalActions() {
        return this.ApprovalActions;
    }

    /**
     * Set <p>Version 历次审批动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApprovalActions <p>Version 历次审批动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApprovalActions(CloudVersionApprovalAction [] ApprovalActions) {
        this.ApprovalActions = ApprovalActions;
    }

    /**
     * Get <p>TAR 内容成功校验、完成物化并进入 READY 的时间；MANUAL / URL_IMPORT 或尚未 READY 的 TAR_PACKAGE 均为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentReadyTime <p>TAR 内容成功校验、完成物化并进入 READY 的时间；MANUAL / URL_IMPORT 或尚未 READY 的 TAR_PACKAGE 均为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentReadyTime() {
        return this.ContentReadyTime;
    }

    /**
     * Set <p>TAR 内容成功校验、完成物化并进入 READY 的时间；MANUAL / URL_IMPORT 或尚未 READY 的 TAR_PACKAGE 均为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentReadyTime <p>TAR 内容成功校验、完成物化并进入 READY 的时间；MANUAL / URL_IMPORT 或尚未 READY 的 TAR_PACKAGE 均为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentReadyTime(String ContentReadyTime) {
        this.ContentReadyTime = ContentReadyTime;
    }

    /**
     * Get <p>本次 Version 的变更原因，最大 4096 字符；不可修改。Revision 1 或未填写时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChangeLog <p>本次 Version 的变更原因，最大 4096 字符；不可修改。Revision 1 或未填写时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChangeLog() {
        return this.ChangeLog;
    }

    /**
     * Set <p>本次 Version 的变更原因，最大 4096 字符；不可修改。Revision 1 或未填写时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChangeLog <p>本次 Version 的变更原因，最大 4096 字符；不可修改。Revision 1 或未填写时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChangeLog(String ChangeLog) {
        this.ChangeLog = ChangeLog;
    }

    /**
     * Get <p>当前绑定该 Version 的 Label Name 列表（例如 stable / latest 或自定义 Label 名称）。未绑定 Label 不在此返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelSet <p>当前绑定该 Version 的 Label Name 列表（例如 stable / latest 或自定义 Label 名称）。未绑定 Label 不在此返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set <p>当前绑定该 Version 的 Label Name 列表（例如 stable / latest 或自定义 Label 名称）。未绑定 Label 不在此返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelSet <p>当前绑定该 Version 的 Label Name 列表（例如 stable / latest 或自定义 Label 名称）。未绑定 Label 不在此返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    public CloudRecordVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudRecordVersion(CloudRecordVersion source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Revision != null) {
            this.Revision = new Long(source.Revision);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ApprovalMode != null) {
            this.ApprovalMode = new String(source.ApprovalMode);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Descriptors != null) {
            this.Descriptors = new String(source.Descriptors);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceConfig != null) {
            this.SourceConfig = new String(source.SourceConfig);
        }
        if (source.ContentStatus != null) {
            this.ContentStatus = new String(source.ContentStatus);
        }
        if (source.ContentSHA256 != null) {
            this.ContentSHA256 = new String(source.ContentSHA256);
        }
        if (source.ContentSizeBytes != null) {
            this.ContentSizeBytes = new Long(source.ContentSizeBytes);
        }
        if (source.ConfigSHA256 != null) {
            this.ConfigSHA256 = new String(source.ConfigSHA256);
        }
        if (source.CreatorSubAccountUin != null) {
            this.CreatorSubAccountUin = new String(source.CreatorSubAccountUin);
        }
        if (source.ApprovalActions != null) {
            this.ApprovalActions = new CloudVersionApprovalAction[source.ApprovalActions.length];
            for (int i = 0; i < source.ApprovalActions.length; i++) {
                this.ApprovalActions[i] = new CloudVersionApprovalAction(source.ApprovalActions[i]);
            }
        }
        if (source.ContentReadyTime != null) {
            this.ContentReadyTime = new String(source.ContentReadyTime);
        }
        if (source.ChangeLog != null) {
            this.ChangeLog = new String(source.ChangeLog);
        }
        if (source.LabelSet != null) {
            this.LabelSet = new String[source.LabelSet.length];
            for (int i = 0; i < source.LabelSet.length; i++) {
                this.LabelSet[i] = new String(source.LabelSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApprovalMode", this.ApprovalMode);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Descriptors", this.Descriptors);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceConfig", this.SourceConfig);
        this.setParamSimple(map, prefix + "ContentStatus", this.ContentStatus);
        this.setParamSimple(map, prefix + "ContentSHA256", this.ContentSHA256);
        this.setParamSimple(map, prefix + "ContentSizeBytes", this.ContentSizeBytes);
        this.setParamSimple(map, prefix + "ConfigSHA256", this.ConfigSHA256);
        this.setParamSimple(map, prefix + "CreatorSubAccountUin", this.CreatorSubAccountUin);
        this.setParamArrayObj(map, prefix + "ApprovalActions.", this.ApprovalActions);
        this.setParamSimple(map, prefix + "ContentReadyTime", this.ContentReadyTime);
        this.setParamSimple(map, prefix + "ChangeLog", this.ChangeLog);
        this.setParamArraySimple(map, prefix + "LabelSet.", this.LabelSet);

    }
}

