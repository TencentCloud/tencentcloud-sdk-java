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

public class DescribeDeviceDetailListPageData extends AbstractModel {

    /**
    * 终端详情响应对象集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private DescribeDeviceDetailListData [] Items;

    /**
    * 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Page")
    @Expose
    private Paging Page;

    /**
     * Get 终端详情响应对象集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 终端详情响应对象集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeDeviceDetailListData [] getItems() {
        return this.Items;
    }

    /**
     * Set 终端详情响应对象集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 终端详情响应对象集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(DescribeDeviceDetailListData [] Items) {
        this.Items = Items;
    }

    /**
     * Get 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Page 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Paging getPage() {
        return this.Page;
    }

    /**
     * Set 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Page 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPage(Paging Page) {
        this.Page = Page;
    }

    public DescribeDeviceDetailListPageData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceDetailListPageData(DescribeDeviceDetailListPageData source) {
        if (source.Items != null) {
            this.Items = new DescribeDeviceDetailListData[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DescribeDeviceDetailListData(source.Items[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Paging(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamObj(map, prefix + "Page.", this.Page);

    }
}

