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

public class DescribeAllocationRuleSummaryRequest extends AbstractModel {

    /**
    * <p>每次获取数据量，最大值1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>月份，不传默认当前月</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>公摊策略类型，用于筛选。<br>枚举值如下：<br>1 - 自定义分摊占比<br>2 - 等比分摊<br>3 - 按占比分摊</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>公摊规则名称或分账单元名称，用于模糊筛选。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>每次获取数据量，最大值1000</p> 
     * @return Limit <p>每次获取数据量，最大值1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每次获取数据量，最大值1000</p>
     * @param Limit <p>每次获取数据量，最大值1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量</p> 
     * @return Offset <p>分页偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量</p>
     * @param Offset <p>分页偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>月份，不传默认当前月</p> 
     * @return Month <p>月份，不传默认当前月</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>月份，不传默认当前月</p>
     * @param Month <p>月份，不传默认当前月</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>公摊策略类型，用于筛选。<br>枚举值如下：<br>1 - 自定义分摊占比<br>2 - 等比分摊<br>3 - 按占比分摊</p> 
     * @return Type <p>公摊策略类型，用于筛选。<br>枚举值如下：<br>1 - 自定义分摊占比<br>2 - 等比分摊<br>3 - 按占比分摊</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>公摊策略类型，用于筛选。<br>枚举值如下：<br>1 - 自定义分摊占比<br>2 - 等比分摊<br>3 - 按占比分摊</p>
     * @param Type <p>公摊策略类型，用于筛选。<br>枚举值如下：<br>1 - 自定义分摊占比<br>2 - 等比分摊<br>3 - 按占比分摊</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>公摊规则名称或分账单元名称，用于模糊筛选。</p> 
     * @return Name <p>公摊规则名称或分账单元名称，用于模糊筛选。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>公摊规则名称或分账单元名称，用于模糊筛选。</p>
     * @param Name <p>公摊规则名称或分账单元名称，用于模糊筛选。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeAllocationRuleSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationRuleSummaryRequest(DescribeAllocationRuleSummaryRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

