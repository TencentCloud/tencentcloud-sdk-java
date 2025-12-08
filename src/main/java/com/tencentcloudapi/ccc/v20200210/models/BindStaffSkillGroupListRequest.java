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

public class BindStaffSkillGroupListRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 座席邮箱
    */
    @SerializedName("StaffEmail")
    @Expose
    private String StaffEmail;

    /**
    * 绑定技能组列表(必填)
    */
    @SerializedName("StaffSkillGroupList")
    @Expose
    private StaffSkillGroupList [] StaffSkillGroupList;

    /**
    * 绑定技能组列表
    */
    @SerializedName("SkillGroupList")
    @Expose
    private Long [] SkillGroupList;

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
     * Get 座席邮箱 
     * @return StaffEmail 座席邮箱
     */
    public String getStaffEmail() {
        return this.StaffEmail;
    }

    /**
     * Set 座席邮箱
     * @param StaffEmail 座席邮箱
     */
    public void setStaffEmail(String StaffEmail) {
        this.StaffEmail = StaffEmail;
    }

    /**
     * Get 绑定技能组列表(必填) 
     * @return StaffSkillGroupList 绑定技能组列表(必填)
     */
    public StaffSkillGroupList [] getStaffSkillGroupList() {
        return this.StaffSkillGroupList;
    }

    /**
     * Set 绑定技能组列表(必填)
     * @param StaffSkillGroupList 绑定技能组列表(必填)
     */
    public void setStaffSkillGroupList(StaffSkillGroupList [] StaffSkillGroupList) {
        this.StaffSkillGroupList = StaffSkillGroupList;
    }

    /**
     * Get 绑定技能组列表 
     * @return SkillGroupList 绑定技能组列表
     * @deprecated
     */
    @Deprecated
    public Long [] getSkillGroupList() {
        return this.SkillGroupList;
    }

    /**
     * Set 绑定技能组列表
     * @param SkillGroupList 绑定技能组列表
     * @deprecated
     */
    @Deprecated
    public void setSkillGroupList(Long [] SkillGroupList) {
        this.SkillGroupList = SkillGroupList;
    }

    public BindStaffSkillGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindStaffSkillGroupListRequest(BindStaffSkillGroupListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StaffEmail != null) {
            this.StaffEmail = new String(source.StaffEmail);
        }
        if (source.StaffSkillGroupList != null) {
            this.StaffSkillGroupList = new StaffSkillGroupList[source.StaffSkillGroupList.length];
            for (int i = 0; i < source.StaffSkillGroupList.length; i++) {
                this.StaffSkillGroupList[i] = new StaffSkillGroupList(source.StaffSkillGroupList[i]);
            }
        }
        if (source.SkillGroupList != null) {
            this.SkillGroupList = new Long[source.SkillGroupList.length];
            for (int i = 0; i < source.SkillGroupList.length; i++) {
                this.SkillGroupList[i] = new Long(source.SkillGroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StaffEmail", this.StaffEmail);
        this.setParamArrayObj(map, prefix + "StaffSkillGroupList.", this.StaffSkillGroupList);
        this.setParamArraySimple(map, prefix + "SkillGroupList.", this.SkillGroupList);

    }
}

