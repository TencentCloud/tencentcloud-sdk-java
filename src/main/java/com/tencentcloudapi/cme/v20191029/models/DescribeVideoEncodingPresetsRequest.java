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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoEncodingPresetsRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 要查询的配置 ID 列表。填写该参数则按照配置 ID 进行查询。
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 分页大小，默认20。最大值50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页起始，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 要查询的配置 ID 列表。填写该参数则按照配置 ID 进行查询。 
     * @return Ids 要查询的配置 ID 列表。填写该参数则按照配置 ID 进行查询。
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 要查询的配置 ID 列表。填写该参数则按照配置 ID 进行查询。
     * @param Ids 要查询的配置 ID 列表。填写该参数则按照配置 ID 进行查询。
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 分页大小，默认20。最大值50。 
     * @return Limit 分页大小，默认20。最大值50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认20。最大值50。
     * @param Limit 分页大小，默认20。最大值50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页起始，默认0。 
     * @return Offset 分页起始，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始，默认0。
     * @param Offset 分页起始，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeVideoEncodingPresetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoEncodingPresetsRequest(DescribeVideoEncodingPresetsRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
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
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

