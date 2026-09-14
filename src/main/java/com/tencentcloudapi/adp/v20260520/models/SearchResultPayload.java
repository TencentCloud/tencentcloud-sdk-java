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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchResultPayload extends AbstractModel {

    /**
    * <p>图谱附加信息（JSON 字符串）</p>
    */
    @SerializedName("GraphData")
    @Expose
    private String GraphData;

    /**
    * <p>命中的图片 URL 列表</p>
    */
    @SerializedName("ImageUrlList")
    @Expose
    private String [] ImageUrlList;

    /**
    * <p>表格附加信息（JSON 字符串）</p>
    */
    @SerializedName("SheetInfo")
    @Expose
    private String SheetInfo;

    /**
     * Get <p>图谱附加信息（JSON 字符串）</p> 
     * @return GraphData <p>图谱附加信息（JSON 字符串）</p>
     */
    public String getGraphData() {
        return this.GraphData;
    }

    /**
     * Set <p>图谱附加信息（JSON 字符串）</p>
     * @param GraphData <p>图谱附加信息（JSON 字符串）</p>
     */
    public void setGraphData(String GraphData) {
        this.GraphData = GraphData;
    }

    /**
     * Get <p>命中的图片 URL 列表</p> 
     * @return ImageUrlList <p>命中的图片 URL 列表</p>
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set <p>命中的图片 URL 列表</p>
     * @param ImageUrlList <p>命中的图片 URL 列表</p>
     */
    public void setImageUrlList(String [] ImageUrlList) {
        this.ImageUrlList = ImageUrlList;
    }

    /**
     * Get <p>表格附加信息（JSON 字符串）</p> 
     * @return SheetInfo <p>表格附加信息（JSON 字符串）</p>
     */
    public String getSheetInfo() {
        return this.SheetInfo;
    }

    /**
     * Set <p>表格附加信息（JSON 字符串）</p>
     * @param SheetInfo <p>表格附加信息（JSON 字符串）</p>
     */
    public void setSheetInfo(String SheetInfo) {
        this.SheetInfo = SheetInfo;
    }

    public SearchResultPayload() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchResultPayload(SearchResultPayload source) {
        if (source.GraphData != null) {
            this.GraphData = new String(source.GraphData);
        }
        if (source.ImageUrlList != null) {
            this.ImageUrlList = new String[source.ImageUrlList.length];
            for (int i = 0; i < source.ImageUrlList.length; i++) {
                this.ImageUrlList[i] = new String(source.ImageUrlList[i]);
            }
        }
        if (source.SheetInfo != null) {
            this.SheetInfo = new String(source.SheetInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GraphData", this.GraphData);
        this.setParamArraySimple(map, prefix + "ImageUrlList.", this.ImageUrlList);
        this.setParamSimple(map, prefix + "SheetInfo", this.SheetInfo);

    }
}

