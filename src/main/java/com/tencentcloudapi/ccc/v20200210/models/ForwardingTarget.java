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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardingTarget extends AbstractModel {

    /**
    * 呼转目标类型 1 座席 2 技能组 3 分机
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 呼转目标为座席的账号 Type 为 1 时填写
    */
    @SerializedName("StaffUserId")
    @Expose
    private String StaffUserId;

    /**
    * 呼转目标为技能组的 ID，Type 为 2 时填写
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * 呼转目标为分机的账号，Type 为 3 时填写
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get 呼转目标类型 1 座席 2 技能组 3 分机 
     * @return Type 呼转目标类型 1 座席 2 技能组 3 分机
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 呼转目标类型 1 座席 2 技能组 3 分机
     * @param Type 呼转目标类型 1 座席 2 技能组 3 分机
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 呼转目标为座席的账号 Type 为 1 时填写 
     * @return StaffUserId 呼转目标为座席的账号 Type 为 1 时填写
     */
    public String getStaffUserId() {
        return this.StaffUserId;
    }

    /**
     * Set 呼转目标为座席的账号 Type 为 1 时填写
     * @param StaffUserId 呼转目标为座席的账号 Type 为 1 时填写
     */
    public void setStaffUserId(String StaffUserId) {
        this.StaffUserId = StaffUserId;
    }

    /**
     * Get 呼转目标为技能组的 ID，Type 为 2 时填写 
     * @return SkillGroupId 呼转目标为技能组的 ID，Type 为 2 时填写
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 呼转目标为技能组的 ID，Type 为 2 时填写
     * @param SkillGroupId 呼转目标为技能组的 ID，Type 为 2 时填写
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get 呼转目标为分机的账号，Type 为 3 时填写 
     * @return Extension 呼转目标为分机的账号，Type 为 3 时填写
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set 呼转目标为分机的账号，Type 为 3 时填写
     * @param Extension 呼转目标为分机的账号，Type 为 3 时填写
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public ForwardingTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardingTarget(ForwardingTarget source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.StaffUserId != null) {
            this.StaffUserId = new String(source.StaffUserId);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StaffUserId", this.StaffUserId);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

