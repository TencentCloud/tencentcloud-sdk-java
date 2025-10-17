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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDLPEdgeNodesPageData extends AbstractModel {

    /**
    * 分页信息
    */
    @SerializedName("Page")
    @Expose
    private Paging Page;

    /**
    * 节点列表
    */
    @SerializedName("Items")
    @Expose
    private DescribeDLPEdgeNodesRspItem [] Items;

    /**
     * Get 分页信息 
     * @return Page 分页信息
     */
    public Paging getPage() {
        return this.Page;
    }

    /**
     * Set 分页信息
     * @param Page 分页信息
     */
    public void setPage(Paging Page) {
        this.Page = Page;
    }

    /**
     * Get 节点列表 
     * @return Items 节点列表
     */
    public DescribeDLPEdgeNodesRspItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 节点列表
     * @param Items 节点列表
     */
    public void setItems(DescribeDLPEdgeNodesRspItem [] Items) {
        this.Items = Items;
    }

    public DescribeDLPEdgeNodesPageData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLPEdgeNodesPageData(DescribeDLPEdgeNodesPageData source) {
        if (source.Page != null) {
            this.Page = new Paging(source.Page);
        }
        if (source.Items != null) {
            this.Items = new DescribeDLPEdgeNodesRspItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DescribeDLPEdgeNodesRspItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Page.", this.Page);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

