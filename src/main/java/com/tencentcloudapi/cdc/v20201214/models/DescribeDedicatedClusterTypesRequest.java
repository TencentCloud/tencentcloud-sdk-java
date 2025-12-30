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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterTypesRequest extends AbstractModel {

    /**
    * <p>模糊匹配专用集群配置名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>待查询的专用集群配置id列表</p>
    */
    @SerializedName("DedicatedClusterTypeIds")
    @Expose
    private String [] DedicatedClusterTypeIds;

    /**
    * <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否只查询计算规格类型</p>
    */
    @SerializedName("IsCompute")
    @Expose
    private Boolean IsCompute;

    /**
     * Get <p>模糊匹配专用集群配置名称</p> 
     * @return Name <p>模糊匹配专用集群配置名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模糊匹配专用集群配置名称</p>
     * @param Name <p>模糊匹配专用集群配置名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>待查询的专用集群配置id列表</p> 
     * @return DedicatedClusterTypeIds <p>待查询的专用集群配置id列表</p>
     */
    public String [] getDedicatedClusterTypeIds() {
        return this.DedicatedClusterTypeIds;
    }

    /**
     * Set <p>待查询的专用集群配置id列表</p>
     * @param DedicatedClusterTypeIds <p>待查询的专用集群配置id列表</p>
     */
    public void setDedicatedClusterTypeIds(String [] DedicatedClusterTypeIds) {
        this.DedicatedClusterTypeIds = DedicatedClusterTypeIds;
    }

    /**
     * Get <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p> 
     * @return Offset <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     * @param Offset <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否只查询计算规格类型</p> 
     * @return IsCompute <p>是否只查询计算规格类型</p>
     */
    public Boolean getIsCompute() {
        return this.IsCompute;
    }

    /**
     * Set <p>是否只查询计算规格类型</p>
     * @param IsCompute <p>是否只查询计算规格类型</p>
     */
    public void setIsCompute(Boolean IsCompute) {
        this.IsCompute = IsCompute;
    }

    public DescribeDedicatedClusterTypesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterTypesRequest(DescribeDedicatedClusterTypesRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DedicatedClusterTypeIds != null) {
            this.DedicatedClusterTypeIds = new String[source.DedicatedClusterTypeIds.length];
            for (int i = 0; i < source.DedicatedClusterTypeIds.length; i++) {
                this.DedicatedClusterTypeIds[i] = new String(source.DedicatedClusterTypeIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.IsCompute != null) {
            this.IsCompute = new Boolean(source.IsCompute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "DedicatedClusterTypeIds.", this.DedicatedClusterTypeIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "IsCompute", this.IsCompute);

    }
}

