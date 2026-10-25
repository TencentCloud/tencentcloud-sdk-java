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

public class ListModelsRsp extends AbstractModel {

    /**
    * 模型列表
    */
    @SerializedName("Items")
    @Expose
    private ModelInfo [] Items;

    /**
    * 总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 分页令牌
    */
    @SerializedName("NextPageToken")
    @Expose
    private String NextPageToken;

    /**
     * Get 模型列表 
     * @return Items 模型列表
     */
    public ModelInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 模型列表
     * @param Items 模型列表
     */
    public void setItems(ModelInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get 总数量 
     * @return TotalCount 总数量
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
     * @param TotalCount 总数量
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 分页令牌 
     * @return NextPageToken 分页令牌
     */
    public String getNextPageToken() {
        return this.NextPageToken;
    }

    /**
     * Set 分页令牌
     * @param NextPageToken 分页令牌
     */
    public void setNextPageToken(String NextPageToken) {
        this.NextPageToken = NextPageToken;
    }

    public ListModelsRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListModelsRsp(ListModelsRsp source) {
        if (source.Items != null) {
            this.Items = new ModelInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ModelInfo(source.Items[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "NextPageToken", this.NextPageToken);

    }
}

