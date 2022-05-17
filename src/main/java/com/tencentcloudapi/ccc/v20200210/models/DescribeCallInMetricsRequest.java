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

public class DescribeCallInMetricsRequest extends AbstractModel{

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 是否返回技能组维度信息，默认“是”
    */
    @SerializedName("EnabledSkillGroup")
    @Expose
    private Boolean EnabledSkillGroup;

    /**
    * 是否返回线路维度信息，默认“否”
    */
    @SerializedName("EnabledNumber")
    @Expose
    private Boolean EnabledNumber;

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
     * Get 是否返回技能组维度信息，默认“是” 
     * @return EnabledSkillGroup 是否返回技能组维度信息，默认“是”
     */
    public Boolean getEnabledSkillGroup() {
        return this.EnabledSkillGroup;
    }

    /**
     * Set 是否返回技能组维度信息，默认“是”
     * @param EnabledSkillGroup 是否返回技能组维度信息，默认“是”
     */
    public void setEnabledSkillGroup(Boolean EnabledSkillGroup) {
        this.EnabledSkillGroup = EnabledSkillGroup;
    }

    /**
     * Get 是否返回线路维度信息，默认“否” 
     * @return EnabledNumber 是否返回线路维度信息，默认“否”
     */
    public Boolean getEnabledNumber() {
        return this.EnabledNumber;
    }

    /**
     * Set 是否返回线路维度信息，默认“否”
     * @param EnabledNumber 是否返回线路维度信息，默认“否”
     */
    public void setEnabledNumber(Boolean EnabledNumber) {
        this.EnabledNumber = EnabledNumber;
    }

    public DescribeCallInMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallInMetricsRequest(DescribeCallInMetricsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.EnabledSkillGroup != null) {
            this.EnabledSkillGroup = new Boolean(source.EnabledSkillGroup);
        }
        if (source.EnabledNumber != null) {
            this.EnabledNumber = new Boolean(source.EnabledNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "EnabledSkillGroup", this.EnabledSkillGroup);
        this.setParamSimple(map, prefix + "EnabledNumber", this.EnabledNumber);

    }
}

