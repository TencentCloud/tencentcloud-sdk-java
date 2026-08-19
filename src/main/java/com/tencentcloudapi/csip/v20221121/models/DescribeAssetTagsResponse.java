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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetTagsResponse extends AbstractModel {

    /**
    * 资产数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 资产集合
    */
    @SerializedName("AssetTags")
    @Expose
    private AssetTagItem [] AssetTags;

    /**
    * 自动打标策略是否开启集合
    */
    @SerializedName("AutoTaggingEnabledList")
    @Expose
    private AttributeOptionSet [] AutoTaggingEnabledList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产数量 
     * @return TotalCount 资产数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 资产数量
     * @param TotalCount 资产数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 资产集合 
     * @return AssetTags 资产集合
     */
    public AssetTagItem [] getAssetTags() {
        return this.AssetTags;
    }

    /**
     * Set 资产集合
     * @param AssetTags 资产集合
     */
    public void setAssetTags(AssetTagItem [] AssetTags) {
        this.AssetTags = AssetTags;
    }

    /**
     * Get 自动打标策略是否开启集合 
     * @return AutoTaggingEnabledList 自动打标策略是否开启集合
     */
    public AttributeOptionSet [] getAutoTaggingEnabledList() {
        return this.AutoTaggingEnabledList;
    }

    /**
     * Set 自动打标策略是否开启集合
     * @param AutoTaggingEnabledList 自动打标策略是否开启集合
     */
    public void setAutoTaggingEnabledList(AttributeOptionSet [] AutoTaggingEnabledList) {
        this.AutoTaggingEnabledList = AutoTaggingEnabledList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetTagsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetTagsResponse(DescribeAssetTagsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AssetTags != null) {
            this.AssetTags = new AssetTagItem[source.AssetTags.length];
            for (int i = 0; i < source.AssetTags.length; i++) {
                this.AssetTags[i] = new AssetTagItem(source.AssetTags[i]);
            }
        }
        if (source.AutoTaggingEnabledList != null) {
            this.AutoTaggingEnabledList = new AttributeOptionSet[source.AutoTaggingEnabledList.length];
            for (int i = 0; i < source.AutoTaggingEnabledList.length; i++) {
                this.AutoTaggingEnabledList[i] = new AttributeOptionSet(source.AutoTaggingEnabledList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AssetTags.", this.AssetTags);
        this.setParamArrayObj(map, prefix + "AutoTaggingEnabledList.", this.AutoTaggingEnabledList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

