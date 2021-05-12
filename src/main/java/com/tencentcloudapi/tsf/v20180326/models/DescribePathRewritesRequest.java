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

public class DescribePathRewritesRequest extends AbstractModel{

    /**
    * 网关部署组ID
    */
    @SerializedName("GatewayGroupId")
    @Expose
    private String GatewayGroupId;

    /**
    * 根据正则表达式或替换的内容模糊查询
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 网关部署组ID 
     * @return GatewayGroupId 网关部署组ID
     */
    public String getGatewayGroupId() {
        return this.GatewayGroupId;
    }

    /**
     * Set 网关部署组ID
     * @param GatewayGroupId 网关部署组ID
     */
    public void setGatewayGroupId(String GatewayGroupId) {
        this.GatewayGroupId = GatewayGroupId;
    }

    /**
     * Get 根据正则表达式或替换的内容模糊查询 
     * @return SearchWord 根据正则表达式或替换的内容模糊查询
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 根据正则表达式或替换的内容模糊查询
     * @param SearchWord 根据正则表达式或替换的内容模糊查询
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 每页数量 
     * @return Limit 每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量
     * @param Limit 每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 起始偏移量 
     * @return Offset 起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始偏移量
     * @param Offset 起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribePathRewritesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePathRewritesRequest(DescribePathRewritesRequest source) {
        if (source.GatewayGroupId != null) {
            this.GatewayGroupId = new String(source.GatewayGroupId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
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
        this.setParamSimple(map, prefix + "GatewayGroupId", this.GatewayGroupId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

