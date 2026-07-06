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

public class DeleteSkillShareRequest extends AbstractModel {

    /**
    * <p>申请备注，必填（弹窗&quot;申请备注&quot;）</p>
    */
    @SerializedName("ApplyRemark")
    @Expose
    private String ApplyRemark;

    /**
    * <p>原 Skill ID，必填（前端无须感知 _shared 后缀）</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>空间ID，必填</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>原版本 ID，必填（与 CreateSkillShare 上架时传的同一 version_id）</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get <p>申请备注，必填（弹窗&quot;申请备注&quot;）</p> 
     * @return ApplyRemark <p>申请备注，必填（弹窗&quot;申请备注&quot;）</p>
     */
    public String getApplyRemark() {
        return this.ApplyRemark;
    }

    /**
     * Set <p>申请备注，必填（弹窗&quot;申请备注&quot;）</p>
     * @param ApplyRemark <p>申请备注，必填（弹窗&quot;申请备注&quot;）</p>
     */
    public void setApplyRemark(String ApplyRemark) {
        this.ApplyRemark = ApplyRemark;
    }

    /**
     * Get <p>原 Skill ID，必填（前端无须感知 _shared 后缀）</p> 
     * @return SkillId <p>原 Skill ID，必填（前端无须感知 _shared 后缀）</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>原 Skill ID，必填（前端无须感知 _shared 后缀）</p>
     * @param SkillId <p>原 Skill ID，必填（前端无须感知 _shared 后缀）</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>空间ID，必填</p> 
     * @return SpaceId <p>空间ID，必填</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间ID，必填</p>
     * @param SpaceId <p>空间ID，必填</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>原版本 ID，必填（与 CreateSkillShare 上架时传的同一 version_id）</p> 
     * @return VersionId <p>原版本 ID，必填（与 CreateSkillShare 上架时传的同一 version_id）</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>原版本 ID，必填（与 CreateSkillShare 上架时传的同一 version_id）</p>
     * @param VersionId <p>原版本 ID，必填（与 CreateSkillShare 上架时传的同一 version_id）</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public DeleteSkillShareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSkillShareRequest(DeleteSkillShareRequest source) {
        if (source.ApplyRemark != null) {
            this.ApplyRemark = new String(source.ApplyRemark);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyRemark", this.ApplyRemark);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

