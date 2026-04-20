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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConnectResourcesRequest extends AbstractModel {

    /**
    * <p>连接源类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>连接源名称的关键字查询,支持模糊匹配</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>分页偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为1000 (超过1000,则限制为1000)</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>连接源的关键字查询, 根据地域查询本地域内连接管理列表中的连接(仅支持包含region输入的连接源)</p>
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
     * Get <p>连接源类型</p> 
     * @return Type <p>连接源类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>连接源类型</p>
     * @param Type <p>连接源类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>连接源名称的关键字查询,支持模糊匹配</p> 
     * @return SearchWord <p>连接源名称的关键字查询,支持模糊匹配</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>连接源名称的关键字查询,支持模糊匹配</p>
     * @param SearchWord <p>连接源名称的关键字查询,支持模糊匹配</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>分页偏移量，默认为0</p> 
     * @return Offset <p>分页偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认为0</p>
     * @param Offset <p>分页偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为1000 (超过1000,则限制为1000)</p> 
     * @return Limit <p>返回数量，默认为20，最大值为1000 (超过1000,则限制为1000)</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为1000 (超过1000,则限制为1000)</p>
     * @param Limit <p>返回数量，默认为20，最大值为1000 (超过1000,则限制为1000)</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>连接源的关键字查询, 根据地域查询本地域内连接管理列表中的连接(仅支持包含region输入的连接源)</p> 
     * @return ResourceRegion <p>连接源的关键字查询, 根据地域查询本地域内连接管理列表中的连接(仅支持包含region输入的连接源)</p>
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set <p>连接源的关键字查询, 根据地域查询本地域内连接管理列表中的连接(仅支持包含region输入的连接源)</p>
     * @param ResourceRegion <p>连接源的关键字查询, 根据地域查询本地域内连接管理列表中的连接(仅支持包含region输入的连接源)</p>
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    public DescribeConnectResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConnectResourcesRequest(DescribeConnectResourcesRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);

    }
}

