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

public class StaffSkillGroupList extends AbstractModel{

    /**
    * 技能组ID
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * 座席在技能组中的优先级（1为最高，5最低，默认3）
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

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
     * Get 座席在技能组中的优先级（1为最高，5最低，默认3） 
     * @return Priority 座席在技能组中的优先级（1为最高，5最低，默认3）
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 座席在技能组中的优先级（1为最高，5最低，默认3）
     * @param Priority 座席在技能组中的优先级（1为最高，5最低，默认3）
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public StaffSkillGroupList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffSkillGroupList(StaffSkillGroupList source) {
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

