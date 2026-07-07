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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelNamesRequest extends AbstractModel {

    /**
    * <p>分页偏移量（&gt;=0）</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量（1-100）</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤PrivateCustom类型自建模型。如果传递了此参数，则只返回具有相同VPC Id的模型。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get <p>分页偏移量（&gt;=0）</p> 
     * @return Offset <p>分页偏移量（&gt;=0）</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量（&gt;=0）</p>
     * @param Offset <p>分页偏移量（&gt;=0）</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量（1-100）</p> 
     * @return Limit <p>每页数量（1-100）</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量（1-100）</p>
     * @param Limit <p>每页数量（1-100）</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤PrivateCustom类型自建模型。如果传递了此参数，则只返回具有相同VPC Id的模型。</p> 
     * @return VpcId <p>过滤PrivateCustom类型自建模型。如果传递了此参数，则只返回具有相同VPC Id的模型。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>过滤PrivateCustom类型自建模型。如果传递了此参数，则只返回具有相同VPC Id的模型。</p>
     * @param VpcId <p>过滤PrivateCustom类型自建模型。如果传递了此参数，则只返回具有相同VPC Id的模型。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public DescribeModelNamesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelNamesRequest(DescribeModelNamesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

