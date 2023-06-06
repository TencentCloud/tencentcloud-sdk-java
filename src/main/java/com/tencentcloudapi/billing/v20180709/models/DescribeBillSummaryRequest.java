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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryRequest extends AbstractModel{

    /**
    * 账单月份，格式为2023-04
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 账单维度类型，枚举值如下：business、project、region、payMode、tag
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 标签键，GroupType=tag获取标签维度账单时传
    */
    @SerializedName("TagKey")
    @Expose
    private String [] TagKey;

    /**
     * Get 账单月份，格式为2023-04 
     * @return Month 账单月份，格式为2023-04
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 账单月份，格式为2023-04
     * @param Month 账单月份，格式为2023-04
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 账单维度类型，枚举值如下：business、project、region、payMode、tag 
     * @return GroupType 账单维度类型，枚举值如下：business、project、region、payMode、tag
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 账单维度类型，枚举值如下：business、project、region、payMode、tag
     * @param GroupType 账单维度类型，枚举值如下：business、project、region、payMode、tag
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 标签键，GroupType=tag获取标签维度账单时传 
     * @return TagKey 标签键，GroupType=tag获取标签维度账单时传
     */
    public String [] getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签键，GroupType=tag获取标签维度账单时传
     * @param TagKey 标签键，GroupType=tag获取标签维度账单时传
     */
    public void setTagKey(String [] TagKey) {
        this.TagKey = TagKey;
    }

    public DescribeBillSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryRequest(DescribeBillSummaryRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.TagKey != null) {
            this.TagKey = new String[source.TagKey.length];
            for (int i = 0; i < source.TagKey.length; i++) {
                this.TagKey[i] = new String(source.TagKey[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArraySimple(map, prefix + "TagKey.", this.TagKey);

    }
}

