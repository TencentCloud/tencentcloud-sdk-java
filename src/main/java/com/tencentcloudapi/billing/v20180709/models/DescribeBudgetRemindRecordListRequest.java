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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBudgetRemindRecordListRequest extends AbstractModel {

    /**
    * 页码，整型
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 每页数目，整型
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 预算基础信息关联id
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
     * Get 页码，整型 
     * @return PageNo 页码，整型
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码，整型
     * @param PageNo 页码，整型
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 每页数目，整型 
     * @return PageSize 每页数目，整型
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目，整型
     * @param PageSize 每页数目，整型
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 预算基础信息关联id 
     * @return BudgetId 预算基础信息关联id
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set 预算基础信息关联id
     * @param BudgetId 预算基础信息关联id
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    public DescribeBudgetRemindRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBudgetRemindRecordListRequest(DescribeBudgetRemindRecordListRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);

    }
}

