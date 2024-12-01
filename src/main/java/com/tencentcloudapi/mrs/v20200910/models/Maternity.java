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

public class Maternity extends AbstractModel {

    /**
    * 描述部分
    */
    @SerializedName("Desc")
    @Expose
    private MaternityDesc Desc;

    /**
    * 结论部分
    */
    @SerializedName("Summary")
    @Expose
    private MaternitySummary Summary;

    /**
    * 报告原文
    */
    @SerializedName("OcrText")
    @Expose
    private String OcrText;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 描述部分 
     * @return Desc 描述部分
     */
    public MaternityDesc getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述部分
     * @param Desc 描述部分
     */
    public void setDesc(MaternityDesc Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 结论部分 
     * @return Summary 结论部分
     */
    public MaternitySummary getSummary() {
        return this.Summary;
    }

    /**
     * Set 结论部分
     * @param Summary 结论部分
     */
    public void setSummary(MaternitySummary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 报告原文 
     * @return OcrText 报告原文
     */
    public String getOcrText() {
        return this.OcrText;
    }

    /**
     * Set 报告原文
     * @param OcrText 报告原文
     */
    public void setOcrText(String OcrText) {
        this.OcrText = OcrText;
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

    public Maternity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Maternity(Maternity source) {
        if (source.Desc != null) {
            this.Desc = new MaternityDesc(source.Desc);
        }
        if (source.Summary != null) {
            this.Summary = new MaternitySummary(source.Summary);
        }
        if (source.OcrText != null) {
            this.OcrText = new String(source.OcrText);
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
        this.setParamSimple(map, prefix + "OcrText", this.OcrText);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

