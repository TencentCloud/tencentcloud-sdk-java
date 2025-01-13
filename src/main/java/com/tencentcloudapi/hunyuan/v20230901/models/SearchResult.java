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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchResult extends AbstractModel {

    /**
    * 搜索引文序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 搜索引文标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 搜索引文链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 搜索引文站点名
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 搜索引文图标
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
     * Get 搜索引文序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 搜索引文序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 搜索引文序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 搜索引文序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 搜索引文标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 搜索引文标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 搜索引文标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 搜索引文标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 搜索引文链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 搜索引文链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 搜索引文链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 搜索引文链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 搜索引文站点名 
     * @return Text 搜索引文站点名
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 搜索引文站点名
     * @param Text 搜索引文站点名
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 搜索引文图标 
     * @return Icon 搜索引文图标
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 搜索引文图标
     * @param Icon 搜索引文图标
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    public SearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchResult(SearchResult source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Icon", this.Icon);

    }
}

