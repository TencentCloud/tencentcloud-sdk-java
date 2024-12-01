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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Indicator extends AbstractModel {

    /**
    * 检验指标项
    */
    @SerializedName("Indicators")
    @Expose
    private IndicatorItem [] Indicators;

    /**
    * 检验报告块标题
    */
    @SerializedName("BlockTitle")
    @Expose
    private BlockTitle [] BlockTitle;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 检验指标项 
     * @return Indicators 检验指标项
     */
    public IndicatorItem [] getIndicators() {
        return this.Indicators;
    }

    /**
     * Set 检验指标项
     * @param Indicators 检验指标项
     */
    public void setIndicators(IndicatorItem [] Indicators) {
        this.Indicators = Indicators;
    }

    /**
     * Get 检验报告块标题 
     * @return BlockTitle 检验报告块标题
     */
    public BlockTitle [] getBlockTitle() {
        return this.BlockTitle;
    }

    /**
     * Set 检验报告块标题
     * @param BlockTitle 检验报告块标题
     */
    public void setBlockTitle(BlockTitle [] BlockTitle) {
        this.BlockTitle = BlockTitle;
    }

    /**
     * Get 数据在原PDF文件中的第几页 
     * @return Page 数据在原PDF文件中的第几页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 数据在原PDF文件中的第几页
     * @param Page 数据在原PDF文件中的第几页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public Indicator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Indicator(Indicator source) {
        if (source.Indicators != null) {
            this.Indicators = new IndicatorItem[source.Indicators.length];
            for (int i = 0; i < source.Indicators.length; i++) {
                this.Indicators[i] = new IndicatorItem(source.Indicators[i]);
            }
        }
        if (source.BlockTitle != null) {
            this.BlockTitle = new BlockTitle[source.BlockTitle.length];
            for (int i = 0; i < source.BlockTitle.length; i++) {
                this.BlockTitle[i] = new BlockTitle(source.BlockTitle[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Indicators.", this.Indicators);
        this.setParamArrayObj(map, prefix + "BlockTitle.", this.BlockTitle);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

