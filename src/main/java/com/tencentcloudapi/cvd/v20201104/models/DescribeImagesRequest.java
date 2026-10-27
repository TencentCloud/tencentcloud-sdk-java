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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesRequest extends AbstractModel {

    /**
    * <p>拉取页号</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页拉取个数</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Name取值：[&quot;ImageID&quot;,&quot;Name&quot;,&quot;ImageType&quot;,&quot;ImageState&quot;,&quot;Region&quot;,&quot;InstanceType&quot;]<br>注意：filter中没有ImageID或ImageState过滤条件，后台默认不返回INVISIBLE的镜像信息</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>拉取页号</p> 
     * @return PageNumber <p>拉取页号</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>拉取页号</p>
     * @param PageNumber <p>拉取页号</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页拉取个数</p> 
     * @return PageSize <p>每页拉取个数</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页拉取个数</p>
     * @param PageSize <p>每页拉取个数</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Name取值：[&quot;ImageID&quot;,&quot;Name&quot;,&quot;ImageType&quot;,&quot;ImageState&quot;,&quot;Region&quot;,&quot;InstanceType&quot;]<br>注意：filter中没有ImageID或ImageState过滤条件，后台默认不返回INVISIBLE的镜像信息</p> 
     * @return Filters <p>Name取值：[&quot;ImageID&quot;,&quot;Name&quot;,&quot;ImageType&quot;,&quot;ImageState&quot;,&quot;Region&quot;,&quot;InstanceType&quot;]<br>注意：filter中没有ImageID或ImageState过滤条件，后台默认不返回INVISIBLE的镜像信息</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Name取值：[&quot;ImageID&quot;,&quot;Name&quot;,&quot;ImageType&quot;,&quot;ImageState&quot;,&quot;Region&quot;,&quot;InstanceType&quot;]<br>注意：filter中没有ImageID或ImageState过滤条件，后台默认不返回INVISIBLE的镜像信息</p>
     * @param Filters <p>Name取值：[&quot;ImageID&quot;,&quot;Name&quot;,&quot;ImageType&quot;,&quot;ImageState&quot;,&quot;Region&quot;,&quot;InstanceType&quot;]<br>注意：filter中没有ImageID或ImageState过滤条件，后台默认不返回INVISIBLE的镜像信息</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesRequest(DescribeImagesRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

