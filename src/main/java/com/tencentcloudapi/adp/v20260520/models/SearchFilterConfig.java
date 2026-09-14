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

public class SearchFilterConfig extends AbstractModel {

    /**
    * <p>是否仅检索选中标签，true:仅检索带有选中标签的知识，false:同时检索带有选中标签和不带任何标签的知识</p>
    */
    @SerializedName("OnlyRetrievalSelectedLabel")
    @Expose
    private Boolean OnlyRetrievalSelectedLabel;

    /**
    * <p>检索过滤</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchFilter")
    @Expose
    private SearchFilter SearchFilter;

    /**
     * Get <p>是否仅检索选中标签，true:仅检索带有选中标签的知识，false:同时检索带有选中标签和不带任何标签的知识</p> 
     * @return OnlyRetrievalSelectedLabel <p>是否仅检索选中标签，true:仅检索带有选中标签的知识，false:同时检索带有选中标签和不带任何标签的知识</p>
     */
    public Boolean getOnlyRetrievalSelectedLabel() {
        return this.OnlyRetrievalSelectedLabel;
    }

    /**
     * Set <p>是否仅检索选中标签，true:仅检索带有选中标签的知识，false:同时检索带有选中标签和不带任何标签的知识</p>
     * @param OnlyRetrievalSelectedLabel <p>是否仅检索选中标签，true:仅检索带有选中标签的知识，false:同时检索带有选中标签和不带任何标签的知识</p>
     */
    public void setOnlyRetrievalSelectedLabel(Boolean OnlyRetrievalSelectedLabel) {
        this.OnlyRetrievalSelectedLabel = OnlyRetrievalSelectedLabel;
    }

    /**
     * Get <p>检索过滤</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchFilter <p>检索过滤</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchFilter getSearchFilter() {
        return this.SearchFilter;
    }

    /**
     * Set <p>检索过滤</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchFilter <p>检索过滤</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchFilter(SearchFilter SearchFilter) {
        this.SearchFilter = SearchFilter;
    }

    public SearchFilterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFilterConfig(SearchFilterConfig source) {
        if (source.OnlyRetrievalSelectedLabel != null) {
            this.OnlyRetrievalSelectedLabel = new Boolean(source.OnlyRetrievalSelectedLabel);
        }
        if (source.SearchFilter != null) {
            this.SearchFilter = new SearchFilter(source.SearchFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OnlyRetrievalSelectedLabel", this.OnlyRetrievalSelectedLabel);
        this.setParamObj(map, prefix + "SearchFilter.", this.SearchFilter);

    }
}

