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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllocationRuleSummaryRequest extends AbstractModel {

    /**
    * 每次获取数据量，最大值1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 月份，不传默认当前月
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 公摊策略类型，用于筛选。
枚举值如下： 
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 公摊规则名称或分账单元名称，用于模糊筛选。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 每次获取数据量，最大值1000 
     * @return Limit 每次获取数据量，最大值1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次获取数据量，最大值1000
     * @param Limit 每次获取数据量，最大值1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 月份，不传默认当前月 
     * @return Month 月份，不传默认当前月
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 月份，不传默认当前月
     * @param Month 月份，不传默认当前月
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 公摊策略类型，用于筛选。
枚举值如下： 
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊 
     * @return Type 公摊策略类型，用于筛选。
枚举值如下： 
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 公摊策略类型，用于筛选。
枚举值如下： 
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     * @param Type 公摊策略类型，用于筛选。
枚举值如下： 
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 公摊规则名称或分账单元名称，用于模糊筛选。 
     * @return Name 公摊规则名称或分账单元名称，用于模糊筛选。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 公摊规则名称或分账单元名称，用于模糊筛选。
     * @param Name 公摊规则名称或分账单元名称，用于模糊筛选。
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

