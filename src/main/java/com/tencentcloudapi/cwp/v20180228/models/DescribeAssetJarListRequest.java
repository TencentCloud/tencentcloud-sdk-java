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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetJarListRequest extends AbstractModel{

    /**
    * 需要返回的数量，默认为10，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name- string - 是否必填：否 - 包名</li>
<li>Type- uint - 是否必填：否 - 类型	
1: 应用程序
2 : 系统类库
3 : Web服务自带库
4 : 其他依赖包</li>
<li>Status- string - 是否必填：否 - 是否可执行：0否，1是</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 服务器Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 服务器Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 需要返回的数量，默认为10，最大值为100 
     * @return Limit 需要返回的数量，默认为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100
     * @param Limit 需要返回的数量，默认为10，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name- string - 是否必填：否 - 包名</li>
<li>Type- uint - 是否必填：否 - 类型	
1: 应用程序
2 : 系统类库
3 : Web服务自带库
4 : 其他依赖包</li>
<li>Status- string - 是否必填：否 - 是否可执行：0否，1是</li> 
     * @return Filters 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name- string - 是否必填：否 - 包名</li>
<li>Type- uint - 是否必填：否 - 类型	
1: 应用程序
2 : 系统类库
3 : Web服务自带库
4 : 其他依赖包</li>
<li>Status- string - 是否必填：否 - 是否可执行：0否，1是</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name- string - 是否必填：否 - 包名</li>
<li>Type- uint - 是否必填：否 - 类型	
1: 应用程序
2 : 系统类库
3 : Web服务自带库
4 : 其他依赖包</li>
<li>Status- string - 是否必填：否 - 是否可执行：0否，1是</li>
     * @param Filters 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Name- string - 是否必填：否 - 包名</li>
<li>Type- uint - 是否必填：否 - 类型	
1: 应用程序
2 : 系统类库
3 : Web服务自带库
4 : 其他依赖包</li>
<li>Status- string - 是否必填：否 - 是否可执行：0否，1是</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 服务器Uuid 
     * @return Uuid 服务器Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器Uuid
     * @param Uuid 服务器Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 服务器Quuid 
     * @return Quuid 服务器Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器Quuid
     * @param Quuid 服务器Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public DescribeAssetJarListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetJarListRequest(DescribeAssetJarListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

