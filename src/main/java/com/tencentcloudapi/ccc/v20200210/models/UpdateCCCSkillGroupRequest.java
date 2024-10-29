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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCCCSkillGroupRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 技能组ID
    */
    @SerializedName("SkillGroupID")
    @Expose
    private Long SkillGroupID;

    /**
    * 修改后的技能组名字
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * 修改后的最大并发数,同振最大为2
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * true同振，false顺振
    */
    @SerializedName("RingAll")
    @Expose
    private Boolean RingAll;

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
     * Get 技能组ID 
     * @return SkillGroupID 技能组ID
     */
    public Long getSkillGroupID() {
        return this.SkillGroupID;
    }

    /**
     * Set 技能组ID
     * @param SkillGroupID 技能组ID
     */
    public void setSkillGroupID(Long SkillGroupID) {
        this.SkillGroupID = SkillGroupID;
    }

    /**
     * Get 修改后的技能组名字 
     * @return SkillGroupName 修改后的技能组名字
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set 修改后的技能组名字
     * @param SkillGroupName 修改后的技能组名字
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get 修改后的最大并发数,同振最大为2 
     * @return MaxConcurrency 修改后的最大并发数,同振最大为2
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 修改后的最大并发数,同振最大为2
     * @param MaxConcurrency 修改后的最大并发数,同振最大为2
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get true同振，false顺振 
     * @return RingAll true同振，false顺振
     */
    public Boolean getRingAll() {
        return this.RingAll;
    }

    /**
     * Set true同振，false顺振
     * @param RingAll true同振，false顺振
     */
    public void setRingAll(Boolean RingAll) {
        this.RingAll = RingAll;
    }

    public UpdateCCCSkillGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCCCSkillGroupRequest(UpdateCCCSkillGroupRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SkillGroupID != null) {
            this.SkillGroupID = new Long(source.SkillGroupID);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.RingAll != null) {
            this.RingAll = new Boolean(source.RingAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SkillGroupID", this.SkillGroupID);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "RingAll", this.RingAll);

    }
}

