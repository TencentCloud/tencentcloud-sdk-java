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

public class AgentItem extends AbstractModel {

    /**
    * Agent 业务 ID（全局唯一，数字字符串形态）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * Agent 描述；未填写时缺省
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 头像 URL；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * 创建时间，RFC3339 UTC 格式（如 2026-06-01T09:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间，RFC3339 UTC 格式（如 2026-09-10T15:20:00Z）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Agent 级 A2A 开关。false 恒输出（未开启不等于字段缺失）；A2AEndpoint / A2AStatus 由本接口在 A2A 开启时直接下发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AEnabled")
    @Expose
    private Boolean A2AEnabled;

    /**
    * 历史会话总数（t_managed_agent_sessions 未软删计数，含全部状态）。注意与 DescribeAgent.ActiveSessionCount（活跃会话数）口径不同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionCount")
    @Expose
    private Long SessionCount;

    /**
    * 最新版本的模型标识，取 latest_version_id 指向版本的 model；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 最新版本 ID（latest_version_id 转字符串，19 位雪花数字形态）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersionId")
    @Expose
    private String LatestVersionId;

    /**
    * 最新版本名（可能为 default / test-N / prod-N 任意类型）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersionName")
    @Expose
    private String LatestVersionName;

    /**
    * 对外 A2A card 发现地址（Agent Card JSON 地址），仅 A2AEnabled=true 的行下发；未注册 / registry 读失败时缺省
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AEndpoint")
    @Expose
    private String A2AEndpoint;

    /**
    * A2A 注册态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN，仅 A2AEnabled=true 的行下发，与 DescribeAgent.A2AConfig.A2AStatus 同枚举；用于「开关已开但地址尚未生成」的空态文案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AStatus")
    @Expose
    private String A2AStatus;

    /**
    * 公网链接访问开关。false 恒输出（未开启不等于字段缺失）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicApiEnabled")
    @Expose
    private Boolean PublicApiEnabled;

    /**
    * 公网访问地址，仅 PublicApiEnabled=true 的行下发。固定拼法 https://{AgentId}-{region}.{endpoint_suffix}，与 DescribeAgentPublicAccess.Url 同规则；endpoint_suffix 未配置时为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicApiUrl")
    @Expose
    private String PublicApiUrl;

    /**
    * 创建人 UIN（建号时落库的 sub_account_uin；主账号自建时为主账号 uin）。注意语义为「实际操作建号的账号」
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 绑定的 OneID 企业账号 ID（数字字符串形态，如 1438693592234206274）；空=未绑定（缺省）。与 DescribeAgent.AgentInfo.AccountId 同源同语义；创建时可选传入，之后不可变
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * Get Agent 业务 ID（全局唯一，数字字符串形态）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId Agent 业务 ID（全局唯一，数字字符串形态）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent 业务 ID（全局唯一，数字字符串形态）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId Agent 业务 ID（全局唯一，数字字符串形态）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Agent 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentName Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentName Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get Agent 描述；未填写时缺省
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description Agent 描述；未填写时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Agent 描述；未填写时缺省
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description Agent 描述；未填写时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 头像 URL；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvatarUrl 头像 URL；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 头像 URL；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvatarUrl 头像 URL；未设置时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get 创建时间，RFC3339 UTC 格式（如 2026-06-01T09:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间，RFC3339 UTC 格式（如 2026-06-01T09:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，RFC3339 UTC 格式（如 2026-06-01T09:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间，RFC3339 UTC 格式（如 2026-06-01T09:00:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间，RFC3339 UTC 格式（如 2026-09-10T15:20:00Z）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 更新时间，RFC3339 UTC 格式（如 2026-09-10T15:20:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 更新时间，RFC3339 UTC 格式（如 2026-09-10T15:20:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 更新时间，RFC3339 UTC 格式（如 2026-09-10T15:20:00Z）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Agent 级 A2A 开关。false 恒输出（未开启不等于字段缺失）；A2AEndpoint / A2AStatus 由本接口在 A2A 开启时直接下发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AEnabled Agent 级 A2A 开关。false 恒输出（未开启不等于字段缺失）；A2AEndpoint / A2AStatus 由本接口在 A2A 开启时直接下发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getA2AEnabled() {
        return this.A2AEnabled;
    }

    /**
     * Set Agent 级 A2A 开关。false 恒输出（未开启不等于字段缺失）；A2AEndpoint / A2AStatus 由本接口在 A2A 开启时直接下发
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AEnabled Agent 级 A2A 开关。false 恒输出（未开启不等于字段缺失）；A2AEndpoint / A2AStatus 由本接口在 A2A 开启时直接下发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AEnabled(Boolean A2AEnabled) {
        this.A2AEnabled = A2AEnabled;
    }

    /**
     * Get 历史会话总数（t_managed_agent_sessions 未软删计数，含全部状态）。注意与 DescribeAgent.ActiveSessionCount（活跃会话数）口径不同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionCount 历史会话总数（t_managed_agent_sessions 未软删计数，含全部状态）。注意与 DescribeAgent.ActiveSessionCount（活跃会话数）口径不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionCount() {
        return this.SessionCount;
    }

    /**
     * Set 历史会话总数（t_managed_agent_sessions 未软删计数，含全部状态）。注意与 DescribeAgent.ActiveSessionCount（活跃会话数）口径不同
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionCount 历史会话总数（t_managed_agent_sessions 未软删计数，含全部状态）。注意与 DescribeAgent.ActiveSessionCount（活跃会话数）口径不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionCount(Long SessionCount) {
        this.SessionCount = SessionCount;
    }

    /**
     * Get 最新版本的模型标识，取 latest_version_id 指向版本的 model；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 最新版本的模型标识，取 latest_version_id 指向版本的 model；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 最新版本的模型标识，取 latest_version_id 指向版本的 model；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 最新版本的模型标识，取 latest_version_id 指向版本的 model；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 最新版本 ID（latest_version_id 转字符串，19 位雪花数字形态）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersionId 最新版本 ID（latest_version_id 转字符串，19 位雪花数字形态）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersionId() {
        return this.LatestVersionId;
    }

    /**
     * Set 最新版本 ID（latest_version_id 转字符串，19 位雪花数字形态）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersionId 最新版本 ID（latest_version_id 转字符串，19 位雪花数字形态）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersionId(String LatestVersionId) {
        this.LatestVersionId = LatestVersionId;
    }

    /**
     * Get 最新版本名（可能为 default / test-N / prod-N 任意类型）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersionName 最新版本名（可能为 default / test-N / prod-N 任意类型）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersionName() {
        return this.LatestVersionName;
    }

    /**
     * Set 最新版本名（可能为 default / test-N / prod-N 任意类型）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersionName 最新版本名（可能为 default / test-N / prod-N 任意类型）；Agent 尚无版本时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersionName(String LatestVersionName) {
        this.LatestVersionName = LatestVersionName;
    }

    /**
     * Get 对外 A2A card 发现地址（Agent Card JSON 地址），仅 A2AEnabled=true 的行下发；未注册 / registry 读失败时缺省
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AEndpoint 对外 A2A card 发现地址（Agent Card JSON 地址），仅 A2AEnabled=true 的行下发；未注册 / registry 读失败时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2AEndpoint() {
        return this.A2AEndpoint;
    }

    /**
     * Set 对外 A2A card 发现地址（Agent Card JSON 地址），仅 A2AEnabled=true 的行下发；未注册 / registry 读失败时缺省
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AEndpoint 对外 A2A card 发现地址（Agent Card JSON 地址），仅 A2AEnabled=true 的行下发；未注册 / registry 读失败时缺省
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AEndpoint(String A2AEndpoint) {
        this.A2AEndpoint = A2AEndpoint;
    }

    /**
     * Get A2A 注册态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN，仅 A2AEnabled=true 的行下发，与 DescribeAgent.A2AConfig.A2AStatus 同枚举；用于「开关已开但地址尚未生成」的空态文案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AStatus A2A 注册态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN，仅 A2AEnabled=true 的行下发，与 DescribeAgent.A2AConfig.A2AStatus 同枚举；用于「开关已开但地址尚未生成」的空态文案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2AStatus() {
        return this.A2AStatus;
    }

    /**
     * Set A2A 注册态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN，仅 A2AEnabled=true 的行下发，与 DescribeAgent.A2AConfig.A2AStatus 同枚举；用于「开关已开但地址尚未生成」的空态文案
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AStatus A2A 注册态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN，仅 A2AEnabled=true 的行下发，与 DescribeAgent.A2AConfig.A2AStatus 同枚举；用于「开关已开但地址尚未生成」的空态文案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AStatus(String A2AStatus) {
        this.A2AStatus = A2AStatus;
    }

    /**
     * Get 公网链接访问开关。false 恒输出（未开启不等于字段缺失）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicApiEnabled 公网链接访问开关。false 恒输出（未开启不等于字段缺失）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPublicApiEnabled() {
        return this.PublicApiEnabled;
    }

    /**
     * Set 公网链接访问开关。false 恒输出（未开启不等于字段缺失）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicApiEnabled 公网链接访问开关。false 恒输出（未开启不等于字段缺失）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicApiEnabled(Boolean PublicApiEnabled) {
        this.PublicApiEnabled = PublicApiEnabled;
    }

    /**
     * Get 公网访问地址，仅 PublicApiEnabled=true 的行下发。固定拼法 https://{AgentId}-{region}.{endpoint_suffix}，与 DescribeAgentPublicAccess.Url 同规则；endpoint_suffix 未配置时为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicApiUrl 公网访问地址，仅 PublicApiEnabled=true 的行下发。固定拼法 https://{AgentId}-{region}.{endpoint_suffix}，与 DescribeAgentPublicAccess.Url 同规则；endpoint_suffix 未配置时为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicApiUrl() {
        return this.PublicApiUrl;
    }

    /**
     * Set 公网访问地址，仅 PublicApiEnabled=true 的行下发。固定拼法 https://{AgentId}-{region}.{endpoint_suffix}，与 DescribeAgentPublicAccess.Url 同规则；endpoint_suffix 未配置时为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicApiUrl 公网访问地址，仅 PublicApiEnabled=true 的行下发。固定拼法 https://{AgentId}-{region}.{endpoint_suffix}，与 DescribeAgentPublicAccess.Url 同规则；endpoint_suffix 未配置时为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicApiUrl(String PublicApiUrl) {
        this.PublicApiUrl = PublicApiUrl;
    }

    /**
     * Get 创建人 UIN（建号时落库的 sub_account_uin；主账号自建时为主账号 uin）。注意语义为「实际操作建号的账号」
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 创建人 UIN（建号时落库的 sub_account_uin；主账号自建时为主账号 uin）。注意语义为「实际操作建号的账号」
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建人 UIN（建号时落库的 sub_account_uin；主账号自建时为主账号 uin）。注意语义为「实际操作建号的账号」
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 创建人 UIN（建号时落库的 sub_account_uin；主账号自建时为主账号 uin）。注意语义为「实际操作建号的账号」
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 绑定的 OneID 企业账号 ID（数字字符串形态，如 1438693592234206274）；空=未绑定（缺省）。与 DescribeAgent.AgentInfo.AccountId 同源同语义；创建时可选传入，之后不可变
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountId 绑定的 OneID 企业账号 ID（数字字符串形态，如 1438693592234206274）；空=未绑定（缺省）。与 DescribeAgent.AgentInfo.AccountId 同源同语义；创建时可选传入，之后不可变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 绑定的 OneID 企业账号 ID（数字字符串形态，如 1438693592234206274）；空=未绑定（缺省）。与 DescribeAgent.AgentInfo.AccountId 同源同语义；创建时可选传入，之后不可变
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountId 绑定的 OneID 企业账号 ID（数字字符串形态，如 1438693592234206274）；空=未绑定（缺省）。与 DescribeAgent.AgentInfo.AccountId 同源同语义；创建时可选传入，之后不可变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public AgentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentItem(AgentItem source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AvatarUrl != null) {
            this.AvatarUrl = new String(source.AvatarUrl);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.A2AEnabled != null) {
            this.A2AEnabled = new Boolean(source.A2AEnabled);
        }
        if (source.SessionCount != null) {
            this.SessionCount = new Long(source.SessionCount);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.LatestVersionId != null) {
            this.LatestVersionId = new String(source.LatestVersionId);
        }
        if (source.LatestVersionName != null) {
            this.LatestVersionName = new String(source.LatestVersionName);
        }
        if (source.A2AEndpoint != null) {
            this.A2AEndpoint = new String(source.A2AEndpoint);
        }
        if (source.A2AStatus != null) {
            this.A2AStatus = new String(source.A2AStatus);
        }
        if (source.PublicApiEnabled != null) {
            this.PublicApiEnabled = new Boolean(source.PublicApiEnabled);
        }
        if (source.PublicApiUrl != null) {
            this.PublicApiUrl = new String(source.PublicApiUrl);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "A2AEnabled", this.A2AEnabled);
        this.setParamSimple(map, prefix + "SessionCount", this.SessionCount);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "LatestVersionId", this.LatestVersionId);
        this.setParamSimple(map, prefix + "LatestVersionName", this.LatestVersionName);
        this.setParamSimple(map, prefix + "A2AEndpoint", this.A2AEndpoint);
        this.setParamSimple(map, prefix + "A2AStatus", this.A2AStatus);
        this.setParamSimple(map, prefix + "PublicApiEnabled", this.PublicApiEnabled);
        this.setParamSimple(map, prefix + "PublicApiUrl", this.PublicApiUrl);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);

    }
}

