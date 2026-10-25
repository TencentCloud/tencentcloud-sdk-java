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

public class ListVolumesRsp extends AbstractModel {

    /**
    * 数据卷信息
    */
    @SerializedName("Items")
    @Expose
    private Volume [] Items;

    /**
    * 总数据卷数量
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 分页信息
    */
    @SerializedName("NextPageToken")
    @Expose
    private String NextPageToken;

    /**
     * Get 数据卷信息 
     * @return Items 数据卷信息
     */
    public Volume [] getItems() {
        return this.Items;
    }

    /**
     * Set 数据卷信息
     * @param Items 数据卷信息
     */
    public void setItems(Volume [] Items) {
        this.Items = Items;
    }

    /**
     * Get 总数据卷数量 
     * @return TotalCount 总数据卷数量
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数据卷数量
     * @param TotalCount 总数据卷数量
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 分页信息 
     * @return NextPageToken 分页信息
     */
    public String getNextPageToken() {
        return this.NextPageToken;
    }

    /**
     * Set 分页信息
     * @param NextPageToken 分页信息
     */
    public void setNextPageToken(String NextPageToken) {
        this.NextPageToken = NextPageToken;
    }

    public ListVolumesRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVolumesRsp(ListVolumesRsp source) {
        if (source.Items != null) {
            this.Items = new Volume[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Volume(source.Items[i]);
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

