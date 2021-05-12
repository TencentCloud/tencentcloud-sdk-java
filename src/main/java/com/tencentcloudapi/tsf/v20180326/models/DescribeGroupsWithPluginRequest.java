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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupsWithPluginRequest extends AbstractModel{

    /**
    * 插件ID
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 绑定/未绑定: true / false
    */
    @SerializedName("Bound")
    @Expose
    private Boolean Bound;

    /**
    * 翻页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页记录数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 网关实体ID
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
     * Get 插件ID 
     * @return PluginId 插件ID
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件ID
     * @param PluginId 插件ID
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 绑定/未绑定: true / false 
     * @return Bound 绑定/未绑定: true / false
     */
    public Boolean getBound() {
        return this.Bound;
    }

    /**
     * Set 绑定/未绑定: true / false
     * @param Bound 绑定/未绑定: true / false
     */
    public void setBound(Boolean Bound) {
        this.Bound = Bound;
    }

    /**
     * Get 翻页偏移量 
     * @return Offset 翻页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量
     * @param Offset 翻页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页记录数量 
     * @return Limit 每页记录数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页记录数量
     * @param Limit 每页记录数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键字 
     * @return SearchWord 搜索关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键字
     * @param SearchWord 搜索关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 网关实体ID 
     * @return GatewayInstanceId 网关实体ID
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实体ID
     * @param GatewayInstanceId 网关实体ID
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    public DescribeGroupsWithPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupsWithPluginRequest(DescribeGroupsWithPluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Bound != null) {
            this.Bound = new Boolean(source.Bound);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "Bound", this.Bound);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);

    }
}

