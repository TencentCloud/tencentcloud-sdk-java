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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReservedPreDomainInfoRequest extends AbstractModel {

    /**
    * 域名,每次最多支持500条域名查询
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * 状态，用于筛选，可不填写(1. 成功 2. 失败（失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成 5. 预约 6. 竞价)
    */
    @SerializedName("ReservedStatus")
    @Expose
    private Long ReservedStatus;

    /**
    * 根据预约时间排序，仅支持："desc","asc"。
    */
    @SerializedName("ReservedTimeSort")
    @Expose
    private String ReservedTimeSort;

    /**
    * 条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 域名,每次最多支持500条域名查询 
     * @return DomainList 域名,每次最多支持500条域名查询
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 域名,每次最多支持500条域名查询
     * @param DomainList 域名,每次最多支持500条域名查询
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 状态，用于筛选，可不填写(1. 成功 2. 失败（失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成 5. 预约 6. 竞价) 
     * @return ReservedStatus 状态，用于筛选，可不填写(1. 成功 2. 失败（失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成 5. 预约 6. 竞价)
     */
    public Long getReservedStatus() {
        return this.ReservedStatus;
    }

    /**
     * Set 状态，用于筛选，可不填写(1. 成功 2. 失败（失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成 5. 预约 6. 竞价)
     * @param ReservedStatus 状态，用于筛选，可不填写(1. 成功 2. 失败（失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成 5. 预约 6. 竞价)
     */
    public void setReservedStatus(Long ReservedStatus) {
        this.ReservedStatus = ReservedStatus;
    }

    /**
     * Get 根据预约时间排序，仅支持："desc","asc"。 
     * @return ReservedTimeSort 根据预约时间排序，仅支持："desc","asc"。
     */
    public String getReservedTimeSort() {
        return this.ReservedTimeSort;
    }

    /**
     * Set 根据预约时间排序，仅支持："desc","asc"。
     * @param ReservedTimeSort 根据预约时间排序，仅支持："desc","asc"。
     */
    public void setReservedTimeSort(String ReservedTimeSort) {
        this.ReservedTimeSort = ReservedTimeSort;
    }

    /**
     * Get 条数 
     * @return Limit 条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数
     * @param Limit 条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeReservedPreDomainInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReservedPreDomainInfoRequest(DescribeReservedPreDomainInfoRequest source) {
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
        if (source.ReservedStatus != null) {
            this.ReservedStatus = new Long(source.ReservedStatus);
        }
        if (source.ReservedTimeSort != null) {
            this.ReservedTimeSort = new String(source.ReservedTimeSort);
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
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "ReservedStatus", this.ReservedStatus);
        this.setParamSimple(map, prefix + "ReservedTimeSort", this.ReservedTimeSort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

