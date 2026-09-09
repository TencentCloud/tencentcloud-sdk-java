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
    * <p>审批ID</p>
    */
    @SerializedName("ApprovalId")
    @Expose
    private String ApprovalId;

    /**
    * <p>共享后关联的新 skill_id</p>
    */
    @SerializedName("ShareSkillId")
    @Expose
    private String ShareSkillId;

    /**
    * <p>共享版本，如 1.0.0</p>
    */
    @SerializedName("ShareVersion")
    @Expose
    private String ShareVersion;

    /**
    * <p>共享版本ID</p>
    */
    @SerializedName("ShareVersionId")
    @Expose
    private String ShareVersionId;

    /**
    * <p>原 skill_id</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>共享状态</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 未共享 |<br>| 1 | 已共享 |<br>| 2 | 审批中 |</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>企业共享范围</p>
    */
    @SerializedName("CorpShareConfig")
    @Expose
    private SkillCorpShareConfig CorpShareConfig;

    /**
     * Get <p>审批ID</p> 
     * @return ApprovalId <p>审批ID</p>
     */
    public String getApprovalId() {
        return this.ApprovalId;
    }

    /**
     * Set <p>审批ID</p>
     * @param ApprovalId <p>审批ID</p>
     */
    public void setApprovalId(String ApprovalId) {
        this.ApprovalId = ApprovalId;
    }

    /**
     * Get <p>共享后关联的新 skill_id</p> 
     * @return ShareSkillId <p>共享后关联的新 skill_id</p>
     */
    public String getShareSkillId() {
        return this.ShareSkillId;
    }

    /**
     * Set <p>共享后关联的新 skill_id</p>
     * @param ShareSkillId <p>共享后关联的新 skill_id</p>
     */
    public void setShareSkillId(String ShareSkillId) {
        this.ShareSkillId = ShareSkillId;
    }

    /**
     * Get <p>共享版本，如 1.0.0</p> 
     * @return ShareVersion <p>共享版本，如 1.0.0</p>
     */
    public String getShareVersion() {
        return this.ShareVersion;
    }

    /**
     * Set <p>共享版本，如 1.0.0</p>
     * @param ShareVersion <p>共享版本，如 1.0.0</p>
     */
    public void setShareVersion(String ShareVersion) {
        this.ShareVersion = ShareVersion;
    }

    /**
     * Get <p>共享版本ID</p> 
     * @return ShareVersionId <p>共享版本ID</p>
     */
    public String getShareVersionId() {
        return this.ShareVersionId;
    }

    /**
     * Set <p>共享版本ID</p>
     * @param ShareVersionId <p>共享版本ID</p>
     */
    public void setShareVersionId(String ShareVersionId) {
        this.ShareVersionId = ShareVersionId;
    }

    /**
     * Get <p>原 skill_id</p> 
     * @return SkillId <p>原 skill_id</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>原 skill_id</p>
     * @param SkillId <p>原 skill_id</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>共享状态</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 未共享 |<br>| 1 | 已共享 |<br>| 2 | 审批中 |</p> 
     * @return Status <p>共享状态</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 未共享 |<br>| 1 | 已共享 |<br>| 2 | 审批中 |</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>共享状态</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 未共享 |<br>| 1 | 已共享 |<br>| 2 | 审批中 |</p>
     * @param Status <p>共享状态</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 未共享 |<br>| 1 | 已共享 |<br>| 2 | 审批中 |</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>企业共享范围</p> 
     * @return CorpShareConfig <p>企业共享范围</p>
     */
    public SkillCorpShareConfig getCorpShareConfig() {
        return this.CorpShareConfig;
    }

    /**
     * Set <p>企业共享范围</p>
     * @param CorpShareConfig <p>企业共享范围</p>
     */
    public void setCorpShareConfig(SkillCorpShareConfig CorpShareConfig) {
        this.CorpShareConfig = CorpShareConfig;
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
        if (source.CorpShareConfig != null) {
            this.CorpShareConfig = new SkillCorpShareConfig(source.CorpShareConfig);
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
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);

    }
}

