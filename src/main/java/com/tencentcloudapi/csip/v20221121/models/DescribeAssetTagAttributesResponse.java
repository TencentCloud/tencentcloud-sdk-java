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

public class DescribeAssetTagAttributesResponse extends AbstractModel {

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("FilterConditions")
    @Expose
    private FilterDataObject [] FilterConditions;

    /**
    * <p>打标策略通用属性</p>
    */
    @SerializedName("TaggingAttributes")
    @Expose
    private FilterDataObject [] TaggingAttributes;

    /**
    * <p>已有标签键列表</p>
    */
    @SerializedName("TagKeyList")
    @Expose
    private FilterDataObject [] TagKeyList;

    /**
    * <p>可选颜色列表</p>
    */
    @SerializedName("ColorOptions")
    @Expose
    private FilterDataObject [] ColorOptions;

    /**
    * <p>资产类型列表</p>
    */
    @SerializedName("AssetTypeList")
    @Expose
    private FilterDataObject [] AssetTypeList;

    /**
    * <p>标签树</p>
    */
    @SerializedName("TagTree")
    @Expose
    private AssetTagTreeNode [] TagTree;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>过滤条件</p> 
     * @return FilterConditions <p>过滤条件</p>
     */
    public FilterDataObject [] getFilterConditions() {
        return this.FilterConditions;
    }

    /**
     * Set <p>过滤条件</p>
     * @param FilterConditions <p>过滤条件</p>
     */
    public void setFilterConditions(FilterDataObject [] FilterConditions) {
        this.FilterConditions = FilterConditions;
    }

    /**
     * Get <p>打标策略通用属性</p> 
     * @return TaggingAttributes <p>打标策略通用属性</p>
     */
    public FilterDataObject [] getTaggingAttributes() {
        return this.TaggingAttributes;
    }

    /**
     * Set <p>打标策略通用属性</p>
     * @param TaggingAttributes <p>打标策略通用属性</p>
     */
    public void setTaggingAttributes(FilterDataObject [] TaggingAttributes) {
        this.TaggingAttributes = TaggingAttributes;
    }

    /**
     * Get <p>已有标签键列表</p> 
     * @return TagKeyList <p>已有标签键列表</p>
     */
    public FilterDataObject [] getTagKeyList() {
        return this.TagKeyList;
    }

    /**
     * Set <p>已有标签键列表</p>
     * @param TagKeyList <p>已有标签键列表</p>
     */
    public void setTagKeyList(FilterDataObject [] TagKeyList) {
        this.TagKeyList = TagKeyList;
    }

    /**
     * Get <p>可选颜色列表</p> 
     * @return ColorOptions <p>可选颜色列表</p>
     */
    public FilterDataObject [] getColorOptions() {
        return this.ColorOptions;
    }

    /**
     * Set <p>可选颜色列表</p>
     * @param ColorOptions <p>可选颜色列表</p>
     */
    public void setColorOptions(FilterDataObject [] ColorOptions) {
        this.ColorOptions = ColorOptions;
    }

    /**
     * Get <p>资产类型列表</p> 
     * @return AssetTypeList <p>资产类型列表</p>
     */
    public FilterDataObject [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set <p>资产类型列表</p>
     * @param AssetTypeList <p>资产类型列表</p>
     */
    public void setAssetTypeList(FilterDataObject [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get <p>标签树</p> 
     * @return TagTree <p>标签树</p>
     */
    public AssetTagTreeNode [] getTagTree() {
        return this.TagTree;
    }

    /**
     * Set <p>标签树</p>
     * @param TagTree <p>标签树</p>
     */
    public void setTagTree(AssetTagTreeNode [] TagTree) {
        this.TagTree = TagTree;
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

    public DescribeAssetTagAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetTagAttributesResponse(DescribeAssetTagAttributesResponse source) {
        if (source.FilterConditions != null) {
            this.FilterConditions = new FilterDataObject[source.FilterConditions.length];
            for (int i = 0; i < source.FilterConditions.length; i++) {
                this.FilterConditions[i] = new FilterDataObject(source.FilterConditions[i]);
            }
        }
        if (source.TaggingAttributes != null) {
            this.TaggingAttributes = new FilterDataObject[source.TaggingAttributes.length];
            for (int i = 0; i < source.TaggingAttributes.length; i++) {
                this.TaggingAttributes[i] = new FilterDataObject(source.TaggingAttributes[i]);
            }
        }
        if (source.TagKeyList != null) {
            this.TagKeyList = new FilterDataObject[source.TagKeyList.length];
            for (int i = 0; i < source.TagKeyList.length; i++) {
                this.TagKeyList[i] = new FilterDataObject(source.TagKeyList[i]);
            }
        }
        if (source.ColorOptions != null) {
            this.ColorOptions = new FilterDataObject[source.ColorOptions.length];
            for (int i = 0; i < source.ColorOptions.length; i++) {
                this.ColorOptions[i] = new FilterDataObject(source.ColorOptions[i]);
            }
        }
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new FilterDataObject[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new FilterDataObject(source.AssetTypeList[i]);
            }
        }
        if (source.TagTree != null) {
            this.TagTree = new AssetTagTreeNode[source.TagTree.length];
            for (int i = 0; i < source.TagTree.length; i++) {
                this.TagTree[i] = new AssetTagTreeNode(source.TagTree[i]);
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
        this.setParamArrayObj(map, prefix + "FilterConditions.", this.FilterConditions);
        this.setParamArrayObj(map, prefix + "TaggingAttributes.", this.TaggingAttributes);
        this.setParamArrayObj(map, prefix + "TagKeyList.", this.TagKeyList);
        this.setParamArrayObj(map, prefix + "ColorOptions.", this.ColorOptions);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "TagTree.", this.TagTree);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

