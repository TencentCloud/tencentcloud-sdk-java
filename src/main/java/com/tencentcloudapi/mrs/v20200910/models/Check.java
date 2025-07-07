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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Check extends AbstractModel {

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private Desc Desc;

    /**
    * 结论
    */
    @SerializedName("Summary")
    @Expose
    private Summary Summary;

    /**
    * 检查报告块标题
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
     * Get 描述 
     * @return Desc 描述
     */
    public Desc getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(Desc Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 结论 
     * @return Summary 结论
     */
    public Summary getSummary() {
        return this.Summary;
    }

    /**
     * Set 结论
     * @param Summary 结论
     */
    public void setSummary(Summary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 检查报告块标题 
     * @return BlockTitle 检查报告块标题
     */
    public BlockTitle [] getBlockTitle() {
        return this.BlockTitle;
    }

    /**
     * Set 检查报告块标题
     * @param BlockTitle 检查报告块标题
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

    public Check() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Check(Check source) {
        if (source.Desc != null) {
            this.Desc = new Desc(source.Desc);
        }
        if (source.Summary != null) {
            this.Summary = new Summary(source.Summary);
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
        this.setParamObj(map, prefix + "Desc.", this.Desc);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamArrayObj(map, prefix + "BlockTitle.", this.BlockTitle);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

