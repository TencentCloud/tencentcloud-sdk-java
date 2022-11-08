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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageRegionInfo extends AbstractModel{

    /**
    * 存储地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 存储地域描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 状态，是否开通，取值有：
<li>opened：已经开通。</li>
<li>unopened：未开通。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否默认的存储地域，true：是；false：否。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 存储区域，取值有：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 存储地域。 
     * @return Region 存储地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 存储地域。
     * @param Region 存储地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 存储地域描述信息。 
     * @return Description 存储地域描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 存储地域描述信息。
     * @param Description 存储地域描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 状态，是否开通，取值有：
<li>opened：已经开通。</li>
<li>unopened：未开通。</li> 
     * @return Status 状态，是否开通，取值有：
<li>opened：已经开通。</li>
<li>unopened：未开通。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，是否开通，取值有：
<li>opened：已经开通。</li>
<li>unopened：未开通。</li>
     * @param Status 状态，是否开通，取值有：
<li>opened：已经开通。</li>
<li>unopened：未开通。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否默认的存储地域，true：是；false：否。 
     * @return IsDefault 是否默认的存储地域，true：是；false：否。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认的存储地域，true：是；false：否。
     * @param IsDefault 是否默认的存储地域，true：是；false：否。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 存储区域，取值有：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li> 
     * @return Area 存储区域，取值有：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 存储区域，取值有：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     * @param Area 存储区域，取值有：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public StorageRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageRegionInfo(StorageRegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

