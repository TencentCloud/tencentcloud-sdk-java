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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageSourcesRequest extends AbstractModel {

    /**
    * 页数，取值范围为[1, 1000]。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页大小，取值范围为[1, 1000]。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Location Id，查询该location下面所有source。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Source的类型，分直播Live和点播VOD。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 页数，取值范围为[1, 1000]。 
     * @return PageNum 页数，取值范围为[1, 1000]。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页数，取值范围为[1, 1000]。
     * @param PageNum 页数，取值范围为[1, 1000]。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页大小，取值范围为[1, 1000]。 
     * @return PageSize 每页大小，取值范围为[1, 1000]。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小，取值范围为[1, 1000]。
     * @param PageSize 每页大小，取值范围为[1, 1000]。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Location Id，查询该location下面所有source。 
     * @return LocationId Location Id，查询该location下面所有source。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Location Id，查询该location下面所有source。
     * @param LocationId Location Id，查询该location下面所有source。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Source的类型，分直播Live和点播VOD。 
     * @return Type Source的类型，分直播Live和点播VOD。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Source的类型，分直播Live和点播VOD。
     * @param Type Source的类型，分直播Live和点播VOD。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeStreamPackageSourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageSourcesRequest(DescribeStreamPackageSourcesRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

