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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionZoneRequest extends AbstractModel {

    /**
    * 服务
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 是否是国际站
    */
    @SerializedName("IsInternationalSite")
    @Expose
    private Boolean IsInternationalSite;

    /**
     * Get 服务 
     * @return Service 服务
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务
     * @param Service 服务
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 是否是国际站 
     * @return IsInternationalSite 是否是国际站
     */
    public Boolean getIsInternationalSite() {
        return this.IsInternationalSite;
    }

    /**
     * Set 是否是国际站
     * @param IsInternationalSite 是否是国际站
     */
    public void setIsInternationalSite(Boolean IsInternationalSite) {
        this.IsInternationalSite = IsInternationalSite;
    }

    public DescribeRegionZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegionZoneRequest(DescribeRegionZoneRequest source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.IsInternationalSite != null) {
            this.IsInternationalSite = new Boolean(source.IsInternationalSite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "IsInternationalSite", this.IsInternationalSite);

    }
}

