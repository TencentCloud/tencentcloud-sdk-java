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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlossaryEntriesRequest extends AbstractModel {

    /**
    * 术语库 ID。可通过 DescribeGlossaries 接口获取。
    */
    @SerializedName("GlossaryId")
    @Expose
    private String GlossaryId;

    /**
    * 页码。默认为 1。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页大小。默认为 20，最大值为 200。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 术语库 ID。可通过 DescribeGlossaries 接口获取。 
     * @return GlossaryId 术语库 ID。可通过 DescribeGlossaries 接口获取。
     */
    public String getGlossaryId() {
        return this.GlossaryId;
    }

    /**
     * Set 术语库 ID。可通过 DescribeGlossaries 接口获取。
     * @param GlossaryId 术语库 ID。可通过 DescribeGlossaries 接口获取。
     */
    public void setGlossaryId(String GlossaryId) {
        this.GlossaryId = GlossaryId;
    }

    /**
     * Get 页码。默认为 1。 
     * @return Page 页码。默认为 1。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码。默认为 1。
     * @param Page 页码。默认为 1。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页大小。默认为 20，最大值为 200。 
     * @return PageSize 每页大小。默认为 20，最大值为 200。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小。默认为 20，最大值为 200。
     * @param PageSize 每页大小。默认为 20，最大值为 200。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeGlossaryEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlossaryEntriesRequest(DescribeGlossaryEntriesRequest source) {
        if (source.GlossaryId != null) {
            this.GlossaryId = new String(source.GlossaryId);
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
        this.setParamSimple(map, prefix + "GlossaryId", this.GlossaryId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

