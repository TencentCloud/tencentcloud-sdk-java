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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageTaskTemplateInfo extends AbstractModel {

    /**
    * 任务集合信息
    */
    @SerializedName("Items")
    @Expose
    private CodeTemplateDetail [] Items;

    /**
    * 总页数
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * 总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 当前页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 任务集合信息 
     * @return Items 任务集合信息
     */
    public CodeTemplateDetail [] getItems() {
        return this.Items;
    }

    /**
     * Set 任务集合信息
     * @param Items 任务集合信息
     */
    public void setItems(CodeTemplateDetail [] Items) {
        this.Items = Items;
    }

    /**
     * Get 总页数 
     * @return PageCount 总页数
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set 总页数
     * @param PageCount 总页数
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get 总数量 
     * @return TotalCount 总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
     * @param TotalCount 总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 当前页 
     * @return PageNumber 当前页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页
     * @param PageNumber 当前页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示数 
     * @return PageSize 每页显示数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示数
     * @param PageSize 每页显示数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public PageTaskTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageTaskTemplateInfo(PageTaskTemplateInfo source) {
        if (source.Items != null) {
            this.Items = new CodeTemplateDetail[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CodeTemplateDetail(source.Items[i]);
            }
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

