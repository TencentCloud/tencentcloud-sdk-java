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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAlarmRulesResult extends AbstractModel {

    /**
    * 分页的页数，当前页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页总页数
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * 所有的告警规则个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 告警规则信息列表
    */
    @SerializedName("Items")
    @Expose
    private AlarmRuleData [] Items;

    /**
     * Get 分页的页数，当前页数 
     * @return PageNumber 分页的页数，当前页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页的页数，当前页数
     * @param PageNumber 分页的页数，当前页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的条数 
     * @return PageSize 每页显示的条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的条数
     * @param PageSize 每页显示的条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页总页数 
     * @return TotalPageNumber 分页总页数
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set 分页总页数
     * @param TotalPageNumber 分页总页数
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get 所有的告警规则个数 
     * @return TotalCount 所有的告警规则个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 所有的告警规则个数
     * @param TotalCount 所有的告警规则个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 告警规则信息列表 
     * @return Items 告警规则信息列表
     */
    public AlarmRuleData [] getItems() {
        return this.Items;
    }

    /**
     * Set 告警规则信息列表
     * @param Items 告警规则信息列表
     */
    public void setItems(AlarmRuleData [] Items) {
        this.Items = Items;
    }

    public ListAlarmRulesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAlarmRulesResult(ListAlarmRulesResult source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new AlarmRuleData[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new AlarmRuleData(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

