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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlueprintBundlesRequest extends AbstractModel {

    /**
    * 镜像ID。可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。当前仅支持传入镜像类型为游戏专区(“GAME_PORTAL”)的镜像Id。
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * 套餐ID列表。可以通过DescribeBlueprintBundles接口返回的BundleId获取。
    */
    @SerializedName("BundleIds")
    @Expose
    private String [] BundleIds;

    /**
    * 返回数量，默认为 20，最大值为 100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为 0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 镜像ID。可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。当前仅支持传入镜像类型为游戏专区(“GAME_PORTAL”)的镜像Id。 
     * @return BlueprintId 镜像ID。可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。当前仅支持传入镜像类型为游戏专区(“GAME_PORTAL”)的镜像Id。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 镜像ID。可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。当前仅支持传入镜像类型为游戏专区(“GAME_PORTAL”)的镜像Id。
     * @param BlueprintId 镜像ID。可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。当前仅支持传入镜像类型为游戏专区(“GAME_PORTAL”)的镜像Id。
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get 套餐ID列表。可以通过DescribeBlueprintBundles接口返回的BundleId获取。 
     * @return BundleIds 套餐ID列表。可以通过DescribeBlueprintBundles接口返回的BundleId获取。
     */
    public String [] getBundleIds() {
        return this.BundleIds;
    }

    /**
     * Set 套餐ID列表。可以通过DescribeBlueprintBundles接口返回的BundleId获取。
     * @param BundleIds 套餐ID列表。可以通过DescribeBlueprintBundles接口返回的BundleId获取。
     */
    public void setBundleIds(String [] BundleIds) {
        this.BundleIds = BundleIds;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Limit 返回数量，默认为 20，最大值为 100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     * @param Limit 返回数量，默认为 20，最大值为 100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为 0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Offset 偏移量，默认为 0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     * @param Offset 偏移量，默认为 0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeBlueprintBundlesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlueprintBundlesRequest(DescribeBlueprintBundlesRequest source) {
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.BundleIds != null) {
            this.BundleIds = new String[source.BundleIds.length];
            for (int i = 0; i < source.BundleIds.length; i++) {
                this.BundleIds[i] = new String(source.BundleIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamArraySimple(map, prefix + "BundleIds.", this.BundleIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

