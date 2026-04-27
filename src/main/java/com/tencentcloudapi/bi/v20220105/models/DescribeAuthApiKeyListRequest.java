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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuthApiKeyListRequest extends AbstractModel {

    /**
    * <p>全部</p><p>默认值：false</p>
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * <p>页码</p><p>默认值：0</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>分页大小</p><p>默认值：10</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>关键字过滤</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get <p>全部</p><p>默认值：false</p> 
     * @return AllPage <p>全部</p><p>默认值：false</p>
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set <p>全部</p><p>默认值：false</p>
     * @param AllPage <p>全部</p><p>默认值：false</p>
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get <p>页码</p><p>默认值：0</p> 
     * @return PageNo <p>页码</p><p>默认值：0</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>页码</p><p>默认值：0</p>
     * @param PageNo <p>页码</p><p>默认值：0</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>分页大小</p><p>默认值：10</p> 
     * @return PageSize <p>分页大小</p><p>默认值：10</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小</p><p>默认值：10</p>
     * @param PageSize <p>分页大小</p><p>默认值：10</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>关键字过滤</p> 
     * @return Keyword <p>关键字过滤</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键字过滤</p>
     * @param Keyword <p>关键字过滤</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeAuthApiKeyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuthApiKeyListRequest(DescribeAuthApiKeyListRequest source) {
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

