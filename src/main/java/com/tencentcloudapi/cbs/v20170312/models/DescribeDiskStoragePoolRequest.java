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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskStoragePoolRequest extends AbstractModel{

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 指定需要查询的独享集群ID列表，该入参不能与Filters一起使用。
    */
    @SerializedName("CdcIds")
    @Expose
    private String [] CdcIds;

    /**
    * 过滤条件。参数不支持同时指定`CdcIds`和`Filters`。<br><li>cdc-id - Array of String - 是否必填：否 -（过滤条件）按独享集群ID过滤。<br><li>zone - Array of String - 是否必填：否 -（过滤条件）按独享集群所在[可用区](/document/product/213/15753#ZoneInfo)过滤。<br><li>cage-id - Array of String - 是否必填：否 -（过滤条件）按独享集群所在围笼的ID过滤。<br><li>disk-type - Array of String - 是否必填：否 -（过滤条件）按照云盘介质类型过滤。(CLOUD_BASIC：表示普通云硬盘 | CLOUD_PREMIUM：表示高性能云硬盘。| CLOUD_SSD：SSD表示SSD云硬盘。)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 指定需要查询的独享集群ID列表，该入参不能与Filters一起使用。 
     * @return CdcIds 指定需要查询的独享集群ID列表，该入参不能与Filters一起使用。
     */
    public String [] getCdcIds() {
        return this.CdcIds;
    }

    /**
     * Set 指定需要查询的独享集群ID列表，该入参不能与Filters一起使用。
     * @param CdcIds 指定需要查询的独享集群ID列表，该入参不能与Filters一起使用。
     */
    public void setCdcIds(String [] CdcIds) {
        this.CdcIds = CdcIds;
    }

    /**
     * Get 过滤条件。参数不支持同时指定`CdcIds`和`Filters`。<br><li>cdc-id - Array of String - 是否必填：否 -（过滤条件）按独享集群ID过滤。<br><li>zone - Array of String - 是否必填：否 -（过滤条件）按独享集群所在[可用区](/document/product/213/15753#ZoneInfo)过滤。<br><li>cage-id - Array of String - 是否必填：否 -（过滤条件）按独享集群所在围笼的ID过滤。<br><li>disk-type - Array of String - 是否必填：否 -（过滤条件）按照云盘介质类型过滤。(CLOUD_BASIC：表示普通云硬盘 | CLOUD_PREMIUM：表示高性能云硬盘。| CLOUD_SSD：SSD表示SSD云硬盘。) 
     * @return Filters 过滤条件。参数不支持同时指定`CdcIds`和`Filters`。<br><li>cdc-id - Array of String - 是否必填：否 -（过滤条件）按独享集群ID过滤。<br><li>zone - Array of String - 是否必填：否 -（过滤条件）按独享集群所在[可用区](/document/product/213/15753#ZoneInfo)过滤。<br><li>cage-id - Array of String - 是否必填：否 -（过滤条件）按独享集群所在围笼的ID过滤。<br><li>disk-type - Array of String - 是否必填：否 -（过滤条件）按照云盘介质类型过滤。(CLOUD_BASIC：表示普通云硬盘 | CLOUD_PREMIUM：表示高性能云硬盘。| CLOUD_SSD：SSD表示SSD云硬盘。)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。参数不支持同时指定`CdcIds`和`Filters`。<br><li>cdc-id - Array of String - 是否必填：否 -（过滤条件）按独享集群ID过滤。<br><li>zone - Array of String - 是否必填：否 -（过滤条件）按独享集群所在[可用区](/document/product/213/15753#ZoneInfo)过滤。<br><li>cage-id - Array of String - 是否必填：否 -（过滤条件）按独享集群所在围笼的ID过滤。<br><li>disk-type - Array of String - 是否必填：否 -（过滤条件）按照云盘介质类型过滤。(CLOUD_BASIC：表示普通云硬盘 | CLOUD_PREMIUM：表示高性能云硬盘。| CLOUD_SSD：SSD表示SSD云硬盘。)
     * @param Filters 过滤条件。参数不支持同时指定`CdcIds`和`Filters`。<br><li>cdc-id - Array of String - 是否必填：否 -（过滤条件）按独享集群ID过滤。<br><li>zone - Array of String - 是否必填：否 -（过滤条件）按独享集群所在[可用区](/document/product/213/15753#ZoneInfo)过滤。<br><li>cage-id - Array of String - 是否必填：否 -（过滤条件）按独享集群所在围笼的ID过滤。<br><li>disk-type - Array of String - 是否必填：否 -（过滤条件）按照云盘介质类型过滤。(CLOUD_BASIC：表示普通云硬盘 | CLOUD_PREMIUM：表示高性能云硬盘。| CLOUD_SSD：SSD表示SSD云硬盘。)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeDiskStoragePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskStoragePoolRequest(DescribeDiskStoragePoolRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CdcIds != null) {
            this.CdcIds = new String[source.CdcIds.length];
            for (int i = 0; i < source.CdcIds.length; i++) {
                this.CdcIds[i] = new String(source.CdcIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "CdcIds.", this.CdcIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

