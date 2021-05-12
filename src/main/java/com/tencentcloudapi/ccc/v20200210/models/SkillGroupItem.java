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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillGroupItem extends AbstractModel{

    /**
    * 技能组ID
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * 技能组名称
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 类型：IM、TEL、ALL（全媒体）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 技能组ID 
     * @return SkillGroupId 技能组ID
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 技能组ID
     * @param SkillGroupId 技能组ID
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get 技能组名称 
     * @return SkillGroupName 技能组名称
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set 技能组名称
     * @param SkillGroupName 技能组名称
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 类型：IM、TEL、ALL（全媒体） 
     * @return Type 类型：IM、TEL、ALL（全媒体）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型：IM、TEL、ALL（全媒体）
     * @param Type 类型：IM、TEL、ALL（全媒体）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SkillGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillGroupItem(SkillGroupItem source) {
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

