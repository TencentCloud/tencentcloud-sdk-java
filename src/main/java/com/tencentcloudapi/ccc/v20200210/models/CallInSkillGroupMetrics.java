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

public class CallInSkillGroupMetrics extends AbstractModel{

    /**
    * 技能组ID
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * 数据指标
    */
    @SerializedName("Metrics")
    @Expose
    private CallInMetrics Metrics;

    /**
    * 技能组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
     * Get 数据指标 
     * @return Metrics 数据指标
     */
    public CallInMetrics getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 数据指标
     * @param Metrics 数据指标
     */
    public void setMetrics(CallInMetrics Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 技能组名称 
     * @return Name 技能组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 技能组名称
     * @param Name 技能组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CallInSkillGroupMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallInSkillGroupMetrics(CallInSkillGroupMetrics source) {
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.Metrics != null) {
            this.Metrics = new CallInMetrics(source.Metrics);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

