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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityAPIResourceRequest extends AbstractModel {

    /**
    * 站点 ID。	
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    *  API 资源列表。
    */
    @SerializedName("APIResources")
    @Expose
    private APIResource [] APIResources;

    /**
     * Get 站点 ID。	 
     * @return ZoneId 站点 ID。	
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。	
     * @param ZoneId 站点 ID。	
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get  API 资源列表。 
     * @return APIResources  API 资源列表。
     */
    public APIResource [] getAPIResources() {
        return this.APIResources;
    }

    /**
     * Set  API 资源列表。
     * @param APIResources  API 资源列表。
     */
    public void setAPIResources(APIResource [] APIResources) {
        this.APIResources = APIResources;
    }

    public CreateSecurityAPIResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityAPIResourceRequest(CreateSecurityAPIResourceRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.APIResources != null) {
            this.APIResources = new APIResource[source.APIResources.length];
            for (int i = 0; i < source.APIResources.length; i++) {
                this.APIResources[i] = new APIResource(source.APIResources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "APIResources.", this.APIResources);

    }
}

