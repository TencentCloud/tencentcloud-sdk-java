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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentVersionItem extends AbstractModel {

    /**
    * 版本 ID（雪花算法生成的数字字符串，唯一标识）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 版本名称，形如 default / test-N / prod-N（N 为同类型版本的自增序号）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 版本类型（服务端按 VersionName 派生）：DEFAULT（默认版本，可编辑）/ TEST（测试版本，可编辑）/ PROD（生产版本，内容冻结）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionType")
    @Expose
    private String VersionType;

    /**
    * 版本绑定的模型标识；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 版本运行时使用的沙箱模板业务 ID；空字符串表示使用默认沙箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SandboxTemplateId")
    @Expose
    private String SandboxTemplateId;

    /**
    * 版本状态：DRAFT（草稿）/ ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>该版本累计承接的会话总数（历史累计值，只增不减）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionCount")
    @Expose
    private Long SessionCount;

    /**
    * 创建时间，RFC3339 UTC 格式（如 2026-08-01T10:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间，RFC3339 UTC 格式（如 2026-08-10T15:30:00Z）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get 版本 ID（雪花算法生成的数字字符串，唯一标识）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId 版本 ID（雪花算法生成的数字字符串，唯一标识）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本 ID（雪花算法生成的数字字符串，唯一标识）
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId 版本 ID（雪花算法生成的数字字符串，唯一标识）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 版本名称，形如 default / test-N / prod-N（N 为同类型版本的自增序号）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 版本名称，形如 default / test-N / prod-N（N 为同类型版本的自增序号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称，形如 default / test-N / prod-N（N 为同类型版本的自增序号）
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 版本名称，形如 default / test-N / prod-N（N 为同类型版本的自增序号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 版本类型（服务端按 VersionName 派生）：DEFAULT（默认版本，可编辑）/ TEST（测试版本，可编辑）/ PROD（生产版本，内容冻结）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionType 版本类型（服务端按 VersionName 派生）：DEFAULT（默认版本，可编辑）/ TEST（测试版本，可编辑）/ PROD（生产版本，内容冻结）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionType() {
        return this.VersionType;
    }

    /**
     * Set 版本类型（服务端按 VersionName 派生）：DEFAULT（默认版本，可编辑）/ TEST（测试版本，可编辑）/ PROD（生产版本，内容冻结）
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionType 版本类型（服务端按 VersionName 派生）：DEFAULT（默认版本，可编辑）/ TEST（测试版本，可编辑）/ PROD（生产版本，内容冻结）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionType(String VersionType) {
        this.VersionType = VersionType;
    }

    /**
     * Get 版本绑定的模型标识；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 版本绑定的模型标识；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 版本绑定的模型标识；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 版本绑定的模型标识；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 版本运行时使用的沙箱模板业务 ID；空字符串表示使用默认沙箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SandboxTemplateId 版本运行时使用的沙箱模板业务 ID；空字符串表示使用默认沙箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSandboxTemplateId() {
        return this.SandboxTemplateId;
    }

    /**
     * Set 版本运行时使用的沙箱模板业务 ID；空字符串表示使用默认沙箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param SandboxTemplateId 版本运行时使用的沙箱模板业务 ID；空字符串表示使用默认沙箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSandboxTemplateId(String SandboxTemplateId) {
        this.SandboxTemplateId = SandboxTemplateId;
    }

    /**
     * Get 版本状态：DRAFT（草稿）/ ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 版本状态：DRAFT（草稿）/ ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态：DRAFT（草稿）/ ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 版本状态：DRAFT（草稿）/ ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>该版本累计承接的会话总数（历史累计值，只增不减）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionCount <p>该版本累计承接的会话总数（历史累计值，只增不减）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionCount() {
        return this.SessionCount;
    }

    /**
     * Set <p>该版本累计承接的会话总数（历史累计值，只增不减）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionCount <p>该版本累计承接的会话总数（历史累计值，只增不减）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionCount(Long SessionCount) {
        this.SessionCount = SessionCount;
    }

    /**
     * Get 创建时间，RFC3339 UTC 格式（如 2026-08-01T10:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间，RFC3339 UTC 格式（如 2026-08-01T10:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，RFC3339 UTC 格式（如 2026-08-01T10:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间，RFC3339 UTC 格式（如 2026-08-01T10:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间，RFC3339 UTC 格式（如 2026-08-10T15:30:00Z）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 更新时间，RFC3339 UTC 格式（如 2026-08-10T15:30:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 更新时间，RFC3339 UTC 格式（如 2026-08-10T15:30:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 更新时间，RFC3339 UTC 格式（如 2026-08-10T15:30:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public AgentVersionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentVersionItem(AgentVersionItem source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.VersionType != null) {
            this.VersionType = new String(source.VersionType);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.SandboxTemplateId != null) {
            this.SandboxTemplateId = new String(source.SandboxTemplateId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SessionCount != null) {
            this.SessionCount = new Long(source.SessionCount);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "VersionType", this.VersionType);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "SandboxTemplateId", this.SandboxTemplateId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SessionCount", this.SessionCount);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

