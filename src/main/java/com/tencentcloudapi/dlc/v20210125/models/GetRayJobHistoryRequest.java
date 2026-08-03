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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRayJobHistoryRequest extends AbstractModel {

    /**
    * ray-jobID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 当前页码（从1开始）
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 页数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get ray-jobID 
     * @return Id ray-jobID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ray-jobID
     * @param Id ray-jobID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 当前页码（从1开始） 
     * @return Page 当前页码（从1开始）
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 当前页码（从1开始）
     * @param Page 当前页码（从1开始）
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 页数 
     * @return PageSize 页数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页数
     * @param PageSize 页数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public GetRayJobHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRayJobHistoryRequest(GetRayJobHistoryRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

