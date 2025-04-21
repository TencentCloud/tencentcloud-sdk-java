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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebPage extends AbstractModel {

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 网页摘要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 网页收录时间。可能为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Markdown 格式的网页正文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get url 
     * @return Url url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set url
     * @param Url url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 网页摘要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary 网页摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 网页摘要
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary 网页摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 网页收录时间。可能为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 网页收录时间。可能为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 网页收录时间。可能为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 网页收录时间。可能为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Markdown 格式的网页正文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content Markdown 格式的网页正文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Markdown 格式的网页正文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content Markdown 格式的网页正文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public WebPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebPage(WebPage source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

