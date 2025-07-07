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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareArea extends AbstractModel {

    /**
    * 地域名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地域标识。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 地域ID。
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
     * Get 地域名称。 
     * @return Name 地域名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 地域名称。
     * @param Name 地域名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地域标识。 
     * @return Area 地域标识。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域标识。
     * @param Area 地域标识。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 地域ID。 
     * @return AreaId 地域ID。
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set 地域ID。
     * @param AreaId 地域ID。
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    public ShareArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareArea(ShareArea source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);

    }
}

