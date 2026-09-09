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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChannelListRequest extends AbstractModel {

    /**
    * <p>应用业务ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>渠道场景：0-B端场景，1-C端场景</p>
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
    * <p>过滤条件（可选，支持ChannelType/ChannelStatus等维度）</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>页码（从1开始）</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量（最大100）</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>应用业务ID</p> 
     * @return AppId <p>应用业务ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用业务ID</p>
     * @param AppId <p>应用业务ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>渠道场景：0-B端场景，1-C端场景</p> 
     * @return Scene <p>渠道场景：0-B端场景，1-C端场景</p>
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set <p>渠道场景：0-B端场景，1-C端场景</p>
     * @param Scene <p>渠道场景：0-B端场景，1-C端场景</p>
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>过滤条件（可选，支持ChannelType/ChannelStatus等维度）</p> 
     * @return FilterList <p>过滤条件（可选，支持ChannelType/ChannelStatus等维度）</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>过滤条件（可选，支持ChannelType/ChannelStatus等维度）</p>
     * @param FilterList <p>过滤条件（可选，支持ChannelType/ChannelStatus等维度）</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>页码（从1开始）</p> 
     * @return PageNumber <p>页码（从1开始）</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码（从1开始）</p>
     * @param PageNumber <p>页码（从1开始）</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量（最大100）</p> 
     * @return PageSize <p>每页数量（最大100）</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量（最大100）</p>
     * @param PageSize <p>每页数量（最大100）</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeChannelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChannelListRequest(DescribeChannelListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

