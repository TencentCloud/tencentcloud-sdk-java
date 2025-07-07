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

public class ResultInfo extends AbstractModel {

    /**
    * 段落文本
    */
    @SerializedName("Text")
    @Expose
    private BaseInfo Text;

    /**
    * 结论详情
    */
    @SerializedName("Items")
    @Expose
    private BaseInfo [] Items;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 段落文本 
     * @return Text 段落文本
     */
    public BaseInfo getText() {
        return this.Text;
    }

    /**
     * Set 段落文本
     * @param Text 段落文本
     */
    public void setText(BaseInfo Text) {
        this.Text = Text;
    }

    /**
     * Get 结论详情 
     * @return Items 结论详情
     */
    public BaseInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 结论详情
     * @param Items 结论详情
     */
    public void setItems(BaseInfo [] Items) {
        this.Items = Items;
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

    public ResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultInfo(ResultInfo source) {
        if (source.Text != null) {
            this.Text = new BaseInfo(source.Text);
        }
        if (source.Items != null) {
            this.Items = new BaseInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new BaseInfo(source.Items[i]);
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
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

