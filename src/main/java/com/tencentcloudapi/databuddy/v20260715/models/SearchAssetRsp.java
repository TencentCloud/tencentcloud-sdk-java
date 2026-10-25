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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchAssetRsp extends AbstractModel {

    /**
    * 结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private SearchResult [] Items;

    /**
    * 分页token，不为空时表示还有下一页数据，作为参数PageToken传递
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextPageToken")
    @Expose
    private String NextPageToken;

    /**
     * Get 结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchResult [] getItems() {
        return this.Items;
    }

    /**
     * Set 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(SearchResult [] Items) {
        this.Items = Items;
    }

    /**
     * Get 分页token，不为空时表示还有下一页数据，作为参数PageToken传递
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextPageToken 分页token，不为空时表示还有下一页数据，作为参数PageToken传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextPageToken() {
        return this.NextPageToken;
    }

    /**
     * Set 分页token，不为空时表示还有下一页数据，作为参数PageToken传递
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextPageToken 分页token，不为空时表示还有下一页数据，作为参数PageToken传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextPageToken(String NextPageToken) {
        this.NextPageToken = NextPageToken;
    }

    public SearchAssetRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchAssetRsp(SearchAssetRsp source) {
        if (source.Items != null) {
            this.Items = new SearchResult[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SearchResult(source.Items[i]);
            }
        }
        if (source.NextPageToken != null) {
            this.NextPageToken = new String(source.NextPageToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "NextPageToken", this.NextPageToken);

    }
}

