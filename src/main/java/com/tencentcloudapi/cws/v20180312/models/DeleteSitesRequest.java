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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSitesRequest extends AbstractModel {

    /**
    * 站点ID列表
    */
    @SerializedName("SiteIds")
    @Expose
    private Long [] SiteIds;

    /**
     * Get 站点ID列表 
     * @return SiteIds 站点ID列表
     */
    public Long [] getSiteIds() {
        return this.SiteIds;
    }

    /**
     * Set 站点ID列表
     * @param SiteIds 站点ID列表
     */
    public void setSiteIds(Long [] SiteIds) {
        this.SiteIds = SiteIds;
    }

    public DeleteSitesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSitesRequest(DeleteSitesRequest source) {
        if (source.SiteIds != null) {
            this.SiteIds = new Long[source.SiteIds.length];
            for (int i = 0; i < source.SiteIds.length; i++) {
                this.SiteIds[i] = new Long(source.SiteIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SiteIds.", this.SiteIds);

    }
}

