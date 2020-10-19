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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetsRequest extends AbstractModel{

    /**
    * 生成包支持的可部署 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
    */
    @SerializedName("AssetRegion")
    @Expose
    private String AssetRegion;

    /**
    * 偏移，代表页数，与asset实际数量相关
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 前端界面每页显示的最大条数，不超过100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索条件，支持包ID或包名字过滤，该字段会逐步废弃，建议使用 Filters 字段
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
     * Get 生成包支持的可部署 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8) 
     * @return AssetRegion 生成包支持的可部署 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public String getAssetRegion() {
        return this.AssetRegion;
    }

    /**
     * Set 生成包支持的可部署 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     * @param AssetRegion 生成包支持的可部署 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public void setAssetRegion(String AssetRegion) {
        this.AssetRegion = AssetRegion;
    }

    /**
     * Get 偏移，代表页数，与asset实际数量相关 
     * @return Offset 偏移，代表页数，与asset实际数量相关
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移，代表页数，与asset实际数量相关
     * @param Offset 偏移，代表页数，与asset实际数量相关
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 前端界面每页显示的最大条数，不超过100 
     * @return Limit 前端界面每页显示的最大条数，不超过100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 前端界面每页显示的最大条数，不超过100
     * @param Limit 前端界面每页显示的最大条数，不超过100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索条件，支持包ID或包名字过滤，该字段会逐步废弃，建议使用 Filters 字段 
     * @return Filter 搜索条件，支持包ID或包名字过滤，该字段会逐步废弃，建议使用 Filters 字段
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 搜索条件，支持包ID或包名字过滤，该字段会逐步废弃，建议使用 Filters 字段
     * @param Filter 搜索条件，支持包ID或包名字过滤，该字段会逐步废弃，建议使用 Filters 字段
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetRegion", this.AssetRegion);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

