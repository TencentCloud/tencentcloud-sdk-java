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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLicenseRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 资源包ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * url地址分组
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
     * Get 资源包ID 
     * @return ResourceIds 资源包ID
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源包ID
     * @param ResourceIds 资源包ID
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get url地址分组 
     * @return Group url地址分组
     */
    public Long getGroup() {
        return this.Group;
    }

    /**
     * Set url地址分组
     * @param Group url地址分组
     */
    public void setGroup(Long Group) {
        this.Group = Group;
    }

    public CreateLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLicenseRequest(CreateLicenseRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
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
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "Group", this.Group);

    }
}

