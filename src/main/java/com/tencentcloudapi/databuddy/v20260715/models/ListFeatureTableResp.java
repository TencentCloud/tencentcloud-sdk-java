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

public class ListFeatureTableResp extends AbstractModel {

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 返回列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private FeatureTable [] Items;

    /**
    * 下一页token，为空表示没有更多数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextPageToken")
    @Expose
    private String NextPageToken;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 返回列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FeatureTable [] getItems() {
        return this.Items;
    }

    /**
     * Set 返回列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 返回列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(FeatureTable [] Items) {
        this.Items = Items;
    }

    /**
     * Get 下一页token，为空表示没有更多数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextPageToken 下一页token，为空表示没有更多数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextPageToken() {
        return this.NextPageToken;
    }

    /**
     * Set 下一页token，为空表示没有更多数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextPageToken 下一页token，为空表示没有更多数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextPageToken(String NextPageToken) {
        this.NextPageToken = NextPageToken;
    }

    public ListFeatureTableResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFeatureTableResp(ListFeatureTableResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new FeatureTable[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new FeatureTable(source.Items[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "NextPageToken", this.NextPageToken);

    }
}

