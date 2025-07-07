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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGlobalRoutesRequest extends AbstractModel {

    /**
    * VPC唯一Id。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 全局路由实例唯一Id列表。
    */
    @SerializedName("GlobalRouteIds")
    @Expose
    private String [] GlobalRouteIds;

    /**
     * Get VPC唯一Id。 
     * @return VpcId VPC唯一Id。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC唯一Id。
     * @param VpcId VPC唯一Id。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 全局路由实例唯一Id列表。 
     * @return GlobalRouteIds 全局路由实例唯一Id列表。
     */
    public String [] getGlobalRouteIds() {
        return this.GlobalRouteIds;
    }

    /**
     * Set 全局路由实例唯一Id列表。
     * @param GlobalRouteIds 全局路由实例唯一Id列表。
     */
    public void setGlobalRouteIds(String [] GlobalRouteIds) {
        this.GlobalRouteIds = GlobalRouteIds;
    }

    public DeleteGlobalRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGlobalRoutesRequest(DeleteGlobalRoutesRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.GlobalRouteIds != null) {
            this.GlobalRouteIds = new String[source.GlobalRouteIds.length];
            for (int i = 0; i < source.GlobalRouteIds.length; i++) {
                this.GlobalRouteIds[i] = new String(source.GlobalRouteIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "GlobalRouteIds.", this.GlobalRouteIds);

    }
}

