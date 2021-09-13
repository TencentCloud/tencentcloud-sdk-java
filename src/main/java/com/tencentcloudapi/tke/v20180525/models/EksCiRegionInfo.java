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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EksCiRegionInfo extends AbstractModel{

    /**
    * 地域别名，形如gz
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 地域名，形如ap-guangzhou
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 地域别名，形如gz 
     * @return Alias 地域别名，形如gz
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 地域别名，形如gz
     * @param Alias 地域别名，形如gz
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 地域名，形如ap-guangzhou 
     * @return RegionName 地域名，形如ap-guangzhou
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名，形如ap-guangzhou
     * @param RegionName 地域名，形如ap-guangzhou
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public EksCiRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EksCiRegionInfo(EksCiRegionInfo source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

