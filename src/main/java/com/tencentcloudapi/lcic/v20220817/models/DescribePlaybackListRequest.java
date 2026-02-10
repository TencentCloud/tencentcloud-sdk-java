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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlaybackListRequest extends AbstractModel {

    /**
    * <p>低代码平台的SdkAppId。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>分页查询当前页数，从1开始递增</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>默认10条，最大上限为100条</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>低代码平台的SdkAppId。</p> 
     * @return SdkAppId <p>低代码平台的SdkAppId。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>低代码平台的SdkAppId。</p>
     * @param SdkAppId <p>低代码平台的SdkAppId。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>分页查询当前页数，从1开始递增</p> 
     * @return Page <p>分页查询当前页数，从1开始递增</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>分页查询当前页数，从1开始递增</p>
     * @param Page <p>分页查询当前页数，从1开始递增</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>默认10条，最大上限为100条</p> 
     * @return Limit <p>默认10条，最大上限为100条</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>默认10条，最大上限为100条</p>
     * @param Limit <p>默认10条，最大上限为100条</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePlaybackListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlaybackListRequest(DescribePlaybackListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

