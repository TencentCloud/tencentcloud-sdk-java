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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OnlineTaxiItinerary extends AbstractModel {

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 识别出的字段名称
    */
    @SerializedName("Content")
    @Expose
    private OnlineTaxiItineraryInfo [] Content;

    /**
     * Get 发票名称 
     * @return Title 发票名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 发票名称
     * @param Title 发票名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 识别出的字段名称 
     * @return Content 识别出的字段名称
     */
    public OnlineTaxiItineraryInfo [] getContent() {
        return this.Content;
    }

    /**
     * Set 识别出的字段名称
     * @param Content 识别出的字段名称
     */
    public void setContent(OnlineTaxiItineraryInfo [] Content) {
        this.Content = Content;
    }

    public OnlineTaxiItinerary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OnlineTaxiItinerary(OnlineTaxiItinerary source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new OnlineTaxiItineraryInfo[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new OnlineTaxiItineraryInfo(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

