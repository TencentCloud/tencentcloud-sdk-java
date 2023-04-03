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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCrossBorderCcnRegionBandwidthLimitsRequest extends AbstractModel{

    /**
    * 过滤条件，目前`value`值个数只支持一个，可支持的字段有：
<li>`source-region` 源地域，值形如：`["ap-guangzhou"]`</li> <li>`destination-region` 目的地域，值形如：`["ap-shanghai"]`</li> <li>`ccn-ids` 云联网ID数组，值形如：`["ccn-12345678"]`</li> <li>`user-account-id` 用户账号ID，值形如`["12345678"]`</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单页返回数据量可选值0到100之间的整数，默认20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 过滤条件，目前`value`值个数只支持一个，可支持的字段有：
<li>`source-region` 源地域，值形如：`["ap-guangzhou"]`</li> <li>`destination-region` 目的地域，值形如：`["ap-shanghai"]`</li> <li>`ccn-ids` 云联网ID数组，值形如：`["ccn-12345678"]`</li> <li>`user-account-id` 用户账号ID，值形如`["12345678"]`</li> 
     * @return Filters 过滤条件，目前`value`值个数只支持一个，可支持的字段有：
<li>`source-region` 源地域，值形如：`["ap-guangzhou"]`</li> <li>`destination-region` 目的地域，值形如：`["ap-shanghai"]`</li> <li>`ccn-ids` 云联网ID数组，值形如：`["ccn-12345678"]`</li> <li>`user-account-id` 用户账号ID，值形如`["12345678"]`</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，目前`value`值个数只支持一个，可支持的字段有：
<li>`source-region` 源地域，值形如：`["ap-guangzhou"]`</li> <li>`destination-region` 目的地域，值形如：`["ap-shanghai"]`</li> <li>`ccn-ids` 云联网ID数组，值形如：`["ccn-12345678"]`</li> <li>`user-account-id` 用户账号ID，值形如`["12345678"]`</li>
     * @param Filters 过滤条件，目前`value`值个数只支持一个，可支持的字段有：
<li>`source-region` 源地域，值形如：`["ap-guangzhou"]`</li> <li>`destination-region` 目的地域，值形如：`["ap-shanghai"]`</li> <li>`ccn-ids` 云联网ID数组，值形如：`["ccn-12345678"]`</li> <li>`user-account-id` 用户账号ID，值形如`["12345678"]`</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认0。 
     * @return Offset 偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0。
     * @param Offset 偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单页返回数据量可选值0到100之间的整数，默认20。 
     * @return Limit 单页返回数据量可选值0到100之间的整数，默认20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页返回数据量可选值0到100之间的整数，默认20。
     * @param Limit 单页返回数据量可选值0到100之间的整数，默认20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCrossBorderCcnRegionBandwidthLimitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossBorderCcnRegionBandwidthLimitsRequest(DescribeCrossBorderCcnRegionBandwidthLimitsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

