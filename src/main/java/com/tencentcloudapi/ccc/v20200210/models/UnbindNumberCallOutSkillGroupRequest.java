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

public class UnbindNumberCallOutSkillGroupRequest extends AbstractModel{

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 待解绑的号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 待解绑的技能组Id列表
    */
    @SerializedName("SkillGroupIds")
    @Expose
    private Long [] SkillGroupIds;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 待解绑的号码 
     * @return Number 待解绑的号码
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 待解绑的号码
     * @param Number 待解绑的号码
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 待解绑的技能组Id列表 
     * @return SkillGroupIds 待解绑的技能组Id列表
     */
    public Long [] getSkillGroupIds() {
        return this.SkillGroupIds;
    }

    /**
     * Set 待解绑的技能组Id列表
     * @param SkillGroupIds 待解绑的技能组Id列表
     */
    public void setSkillGroupIds(Long [] SkillGroupIds) {
        this.SkillGroupIds = SkillGroupIds;
    }

    public UnbindNumberCallOutSkillGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindNumberCallOutSkillGroupRequest(UnbindNumberCallOutSkillGroupRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.SkillGroupIds != null) {
            this.SkillGroupIds = new Long[source.SkillGroupIds.length];
            for (int i = 0; i < source.SkillGroupIds.length; i++) {
                this.SkillGroupIds[i] = new Long(source.SkillGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamArraySimple(map, prefix + "SkillGroupIds.", this.SkillGroupIds);

    }
}

