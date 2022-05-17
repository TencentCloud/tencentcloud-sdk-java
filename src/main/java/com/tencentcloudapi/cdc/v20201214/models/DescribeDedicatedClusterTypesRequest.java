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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterTypesRequest extends AbstractModel{

    /**
    * 模糊匹配专用集群配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 待查询的专用集群配置id列表
    */
    @SerializedName("DedicatedClusterTypeIds")
    @Expose
    private String [] DedicatedClusterTypeIds;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否只查询计算规格类型
    */
    @SerializedName("IsCompute")
    @Expose
    private Boolean IsCompute;

    /**
     * Get 模糊匹配专用集群配置名称 
     * @return Name 模糊匹配专用集群配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模糊匹配专用集群配置名称
     * @param Name 模糊匹配专用集群配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 待查询的专用集群配置id列表 
     * @return DedicatedClusterTypeIds 待查询的专用集群配置id列表
     */
    public String [] getDedicatedClusterTypeIds() {
        return this.DedicatedClusterTypeIds;
    }

    /**
     * Set 待查询的专用集群配置id列表
     * @param DedicatedClusterTypeIds 待查询的专用集群配置id列表
     */
    public void setDedicatedClusterTypeIds(String [] DedicatedClusterTypeIds) {
        this.DedicatedClusterTypeIds = DedicatedClusterTypeIds;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否只查询计算规格类型 
     * @return IsCompute 是否只查询计算规格类型
     */
    public Boolean getIsCompute() {
        return this.IsCompute;
    }

    /**
     * Set 是否只查询计算规格类型
     * @param IsCompute 是否只查询计算规格类型
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

