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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTrialLicenseRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 功能 ID 数组
    */
    @SerializedName("FeatureIds")
    @Expose
    private Long [] FeatureIds;

    /**
    * Url分组
    */
    @SerializedName("Group")
    @Expose
    private Long Group;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 功能 ID 数组 
     * @return FeatureIds 功能 ID 数组
     */
    public Long [] getFeatureIds() {
        return this.FeatureIds;
    }

    /**
     * Set 功能 ID 数组
     * @param FeatureIds 功能 ID 数组
     */
    public void setFeatureIds(Long [] FeatureIds) {
        this.FeatureIds = FeatureIds;
    }

    /**
     * Get Url分组 
     * @return Group Url分组
     */
    public Long getGroup() {
        return this.Group;
    }

    /**
     * Set Url分组
     * @param Group Url分组
     */
    public void setGroup(Long Group) {
        this.Group = Group;
    }

    public CreateTrialLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrialLicenseRequest(CreateTrialLicenseRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.FeatureIds != null) {
            this.FeatureIds = new Long[source.FeatureIds.length];
            for (int i = 0; i < source.FeatureIds.length; i++) {
                this.FeatureIds[i] = new Long(source.FeatureIds[i]);
            }
        }
        if (source.Group != null) {
            this.Group = new Long(source.Group);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArraySimple(map, prefix + "FeatureIds.", this.FeatureIds);
        this.setParamSimple(map, prefix + "Group", this.Group);

    }
}

