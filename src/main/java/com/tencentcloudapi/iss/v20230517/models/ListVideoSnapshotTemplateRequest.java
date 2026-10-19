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

public class ListVideoSnapshotTemplateRequest extends AbstractModel {

    /**
    * <p>模板名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>排序参数</p><p>默认值：update_time</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>排序顺序</p><p>枚举值：</p><ul><li>desc： 降序</li><li>asc： 生序</li></ul><p>默认值：desc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>页码</p><p>默认值：1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数目</p><p>默认值：20</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>模板名称</p> 
     * @return Name <p>模板名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模板名称</p>
     * @param Name <p>模板名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul> 
     * @return Type <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     * @param Type <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>排序参数</p><p>默认值：update_time</p> 
     * @return Sort <p>排序参数</p><p>默认值：update_time</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序参数</p><p>默认值：update_time</p>
     * @param Sort <p>排序参数</p><p>默认值：update_time</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>排序顺序</p><p>枚举值：</p><ul><li>desc： 降序</li><li>asc： 生序</li></ul><p>默认值：desc</p> 
     * @return Order <p>排序顺序</p><p>枚举值：</p><ul><li>desc： 降序</li><li>asc： 生序</li></ul><p>默认值：desc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序顺序</p><p>枚举值：</p><ul><li>desc： 降序</li><li>asc： 生序</li></ul><p>默认值：desc</p>
     * @param Order <p>排序顺序</p><p>枚举值：</p><ul><li>desc： 降序</li><li>asc： 生序</li></ul><p>默认值：desc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>页码</p><p>默认值：1</p> 
     * @return PageNumber <p>页码</p><p>默认值：1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p><p>默认值：1</p>
     * @param PageNumber <p>页码</p><p>默认值：1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数目</p><p>默认值：20</p> 
     * @return PageSize <p>每页数目</p><p>默认值：20</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数目</p><p>默认值：20</p>
     * @param PageSize <p>每页数目</p><p>默认值：20</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListVideoSnapshotTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVideoSnapshotTemplateRequest(ListVideoSnapshotTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

