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

public class DescribeExposureAutoTagAttributeResponse extends AbstractModel {

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetTypeList")
    @Expose
    private ExposeAssetTypeItem [] AssetTypeList;

    /**
    * <p>标签集合</p>
    */
    @SerializedName("TagList")
    @Expose
    private AttributeOptionSet [] TagList;

    /**
    * <p>开放状态集合</p>
    */
    @SerializedName("OpenStatusList")
    @Expose
    private AttributeOptionSet [] OpenStatusList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资产类型</p> 
     * @return AssetTypeList <p>资产类型</p>
     */
    public ExposeAssetTypeItem [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetTypeList <p>资产类型</p>
     */
    public void setAssetTypeList(ExposeAssetTypeItem [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get <p>标签集合</p> 
     * @return TagList <p>标签集合</p>
     */
    public AttributeOptionSet [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>标签集合</p>
     * @param TagList <p>标签集合</p>
     */
    public void setTagList(AttributeOptionSet [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>开放状态集合</p> 
     * @return OpenStatusList <p>开放状态集合</p>
     */
    public AttributeOptionSet [] getOpenStatusList() {
        return this.OpenStatusList;
    }

    /**
     * Set <p>开放状态集合</p>
     * @param OpenStatusList <p>开放状态集合</p>
     */
    public void setOpenStatusList(AttributeOptionSet [] OpenStatusList) {
        this.OpenStatusList = OpenStatusList;
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

    public DescribeExposureAutoTagAttributeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExposureAutoTagAttributeResponse(DescribeExposureAutoTagAttributeResponse source) {
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new ExposeAssetTypeItem[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new ExposeAssetTypeItem(source.AssetTypeList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new AttributeOptionSet[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new AttributeOptionSet(source.TagList[i]);
            }
        }
        if (source.OpenStatusList != null) {
            this.OpenStatusList = new AttributeOptionSet[source.OpenStatusList.length];
            for (int i = 0; i < source.OpenStatusList.length; i++) {
                this.OpenStatusList[i] = new AttributeOptionSet(source.OpenStatusList[i]);
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
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArrayObj(map, prefix + "OpenStatusList.", this.OpenStatusList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

