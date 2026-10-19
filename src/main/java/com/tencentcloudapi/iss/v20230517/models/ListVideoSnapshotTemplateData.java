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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVideoSnapshotTemplateData extends AbstractModel {

    /**
    * <p>总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>排序参数</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>排序顺序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数目</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>截图模板列表</p>
    */
    @SerializedName("List")
    @Expose
    private VideoSnapshotTemplateInfo [] List;

    /**
     * Get <p>总数</p> 
     * @return TotalCount <p>总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数</p>
     * @param TotalCount <p>总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>排序参数</p> 
     * @return Sort <p>排序参数</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序参数</p>
     * @param Sort <p>排序参数</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>排序顺序</p> 
     * @return Order <p>排序顺序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序顺序</p>
     * @param Order <p>排序顺序</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>页码</p> 
     * @return PageNumber <p>页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p>
     * @param PageNumber <p>页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数目</p> 
     * @return PageSize <p>每页数目</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数目</p>
     * @param PageSize <p>每页数目</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>截图模板列表</p> 
     * @return List <p>截图模板列表</p>
     */
    public VideoSnapshotTemplateInfo [] getList() {
        return this.List;
    }

    /**
     * Set <p>截图模板列表</p>
     * @param List <p>截图模板列表</p>
     */
    public void setList(VideoSnapshotTemplateInfo [] List) {
        this.List = List;
    }

    public ListVideoSnapshotTemplateData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVideoSnapshotTemplateData(ListVideoSnapshotTemplateData source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.List != null) {
            this.List = new VideoSnapshotTemplateInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new VideoSnapshotTemplateInfo(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

