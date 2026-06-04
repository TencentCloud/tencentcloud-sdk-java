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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillShare extends AbstractModel {

    /**
    * 审批ID
    */
    @SerializedName("ApprovalId")
    @Expose
    private String ApprovalId;

    /**
    * 共享后关联的新 skill_id
    */
    @SerializedName("ShareSkillId")
    @Expose
    private String ShareSkillId;

    /**
    * 共享版本，如 1.0.0
    */
    @SerializedName("ShareVersion")
    @Expose
    private String ShareVersion;

    /**
    * 共享版本ID
    */
    @SerializedName("ShareVersionId")
    @Expose
    private String ShareVersionId;

    /**
    * 原 skill_id
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * 共享状态

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 未共享 |
| 1 | 已共享 |
| 2 | 审批中 |
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 审批ID 
     * @return ApprovalId 审批ID
     */
    public String getApprovalId() {
        return this.ApprovalId;
    }

    /**
     * Set 审批ID
     * @param ApprovalId 审批ID
     */
    public void setApprovalId(String ApprovalId) {
        this.ApprovalId = ApprovalId;
    }

    /**
     * Get 共享后关联的新 skill_id 
     * @return ShareSkillId 共享后关联的新 skill_id
     */
    public String getShareSkillId() {
        return this.ShareSkillId;
    }

    /**
     * Set 共享后关联的新 skill_id
     * @param ShareSkillId 共享后关联的新 skill_id
     */
    public void setShareSkillId(String ShareSkillId) {
        this.ShareSkillId = ShareSkillId;
    }

    /**
     * Get 共享版本，如 1.0.0 
     * @return ShareVersion 共享版本，如 1.0.0
     */
    public String getShareVersion() {
        return this.ShareVersion;
    }

    /**
     * Set 共享版本，如 1.0.0
     * @param ShareVersion 共享版本，如 1.0.0
     */
    public void setShareVersion(String ShareVersion) {
        this.ShareVersion = ShareVersion;
    }

    /**
     * Get 共享版本ID 
     * @return ShareVersionId 共享版本ID
     */
    public String getShareVersionId() {
        return this.ShareVersionId;
    }

    /**
     * Set 共享版本ID
     * @param ShareVersionId 共享版本ID
     */
    public void setShareVersionId(String ShareVersionId) {
        this.ShareVersionId = ShareVersionId;
    }

    /**
     * Get 原 skill_id 
     * @return SkillId 原 skill_id
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set 原 skill_id
     * @param SkillId 原 skill_id
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get 共享状态

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 未共享 |
| 1 | 已共享 |
| 2 | 审批中 | 
     * @return Status 共享状态

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 未共享 |
| 1 | 已共享 |
| 2 | 审批中 |
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 共享状态

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 未共享 |
| 1 | 已共享 |
| 2 | 审批中 |
     * @param Status 共享状态

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 未共享 |
| 1 | 已共享 |
| 2 | 审批中 |
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SkillShare() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillShare(SkillShare source) {
        if (source.ApprovalId != null) {
            this.ApprovalId = new String(source.ApprovalId);
        }
        if (source.ShareSkillId != null) {
            this.ShareSkillId = new String(source.ShareSkillId);
        }
        if (source.ShareVersion != null) {
            this.ShareVersion = new String(source.ShareVersion);
        }
        if (source.ShareVersionId != null) {
            this.ShareVersionId = new String(source.ShareVersionId);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalId", this.ApprovalId);
        this.setParamSimple(map, prefix + "ShareSkillId", this.ShareSkillId);
        this.setParamSimple(map, prefix + "ShareVersion", this.ShareVersion);
        this.setParamSimple(map, prefix + "ShareVersionId", this.ShareVersionId);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

