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

public class Endoscopy extends AbstractModel {

    /**
    * 活检部位
    */
    @SerializedName("BiopsyPart")
    @Expose
    private BiopsyPart BiopsyPart;

    /**
    * 可见描述
    */
    @SerializedName("Desc")
    @Expose
    private EndoscopyDesc Desc;

    /**
    * 结论
    */
    @SerializedName("Summary")
    @Expose
    private Summary Summary;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 活检部位 
     * @return BiopsyPart 活检部位
     */
    public BiopsyPart getBiopsyPart() {
        return this.BiopsyPart;
    }

    /**
     * Set 活检部位
     * @param BiopsyPart 活检部位
     */
    public void setBiopsyPart(BiopsyPart BiopsyPart) {
        this.BiopsyPart = BiopsyPart;
    }

    /**
     * Get 可见描述 
     * @return Desc 可见描述
     */
    public EndoscopyDesc getDesc() {
        return this.Desc;
    }

    /**
     * Set 可见描述
     * @param Desc 可见描述
     */
    public void setDesc(EndoscopyDesc Desc) {
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

    public Endoscopy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Endoscopy(Endoscopy source) {
        if (source.BiopsyPart != null) {
            this.BiopsyPart = new BiopsyPart(source.BiopsyPart);
        }
        if (source.Desc != null) {
            this.Desc = new EndoscopyDesc(source.Desc);
        }
        if (source.Summary != null) {
            this.Summary = new Summary(source.Summary);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BiopsyPart.", this.BiopsyPart);
        this.setParamObj(map, prefix + "Desc.", this.Desc);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

