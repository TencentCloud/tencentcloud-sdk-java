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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubnetRequest extends AbstractModel {

    /**
    * 返回数量。Limit需要在[1, 100]之间。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量。偏移量最小为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询指定VpcId下的子网信息。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 过滤条件
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 返回数量。Limit需要在[1, 100]之间。 
     * @return Limit 返回数量。Limit需要在[1, 100]之间。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量。Limit需要在[1, 100]之间。
     * @param Limit 返回数量。Limit需要在[1, 100]之间。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量。偏移量最小为0。 
     * @return Offset 偏移量。偏移量最小为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。偏移量最小为0。
     * @param Offset 偏移量。偏移量最小为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询指定VpcId下的子网信息。 
     * @return VpcId 查询指定VpcId下的子网信息。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 查询指定VpcId下的子网信息。
     * @param VpcId 查询指定VpcId下的子网信息。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 过滤条件 
     * @return SearchWord 过滤条件
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 过滤条件
     * @param SearchWord 过滤条件
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeSubnetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubnetRequest(DescribeSubnetRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

