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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenEventsCnt extends AbstractModel {

    /**
    * 展示内容：待处理风险总数，影响资产总数
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 事件总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * name 具体展示内容类型： 攻击事件, 潜在风险, 失陷资产, 潜在风险资产
Value: 事件统计数
    */
    @SerializedName("Category")
    @Expose
    private ScreenNameValue [] Category;

    /**
     * Get 展示内容：待处理风险总数，影响资产总数 
     * @return Title 展示内容：待处理风险总数，影响资产总数
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 展示内容：待处理风险总数，影响资产总数
     * @param Title 展示内容：待处理风险总数，影响资产总数
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 事件总数 
     * @return Total 事件总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 事件总数
     * @param Total 事件总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get name 具体展示内容类型： 攻击事件, 潜在风险, 失陷资产, 潜在风险资产
Value: 事件统计数 
     * @return Category name 具体展示内容类型： 攻击事件, 潜在风险, 失陷资产, 潜在风险资产
Value: 事件统计数
     */
    public ScreenNameValue [] getCategory() {
        return this.Category;
    }

    /**
     * Set name 具体展示内容类型： 攻击事件, 潜在风险, 失陷资产, 潜在风险资产
Value: 事件统计数
     * @param Category name 具体展示内容类型： 攻击事件, 潜在风险, 失陷资产, 潜在风险资产
Value: 事件统计数
     */
    public void setCategory(ScreenNameValue [] Category) {
        this.Category = Category;
    }

    public ScreenEventsCnt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenEventsCnt(ScreenEventsCnt source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Category != null) {
            this.Category = new ScreenNameValue[source.Category.length];
            for (int i = 0; i < source.Category.length; i++) {
                this.Category[i] = new ScreenNameValue(source.Category[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Category.", this.Category);

    }
}

