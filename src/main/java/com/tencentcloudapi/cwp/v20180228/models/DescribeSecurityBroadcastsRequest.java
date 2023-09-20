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

public class DescribeSecurityBroadcastsRequest extends AbstractModel{

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 需要返回的数量，默认为10 ，0=全部
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 筛选发布日期：开始时间
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 筛选发布日期：结束时间
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 过滤安全播报类型：0-紧急通知，1-功能更新，2-行业荣誉，3-版本发布
    */
    @SerializedName("BroadcastType")
    @Expose
    private String BroadcastType;

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
     * Get 需要返回的数量，默认为10 ，0=全部 
     * @return Limit 需要返回的数量，默认为10 ，0=全部
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10 ，0=全部
     * @param Limit 需要返回的数量，默认为10 ，0=全部
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 筛选发布日期：开始时间 
     * @return BeginDate 筛选发布日期：开始时间
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 筛选发布日期：开始时间
     * @param BeginDate 筛选发布日期：开始时间
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 筛选发布日期：结束时间 
     * @return EndDate 筛选发布日期：结束时间
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 筛选发布日期：结束时间
     * @param EndDate 筛选发布日期：结束时间
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 过滤安全播报类型：0-紧急通知，1-功能更新，2-行业荣誉，3-版本发布 
     * @return BroadcastType 过滤安全播报类型：0-紧急通知，1-功能更新，2-行业荣誉，3-版本发布
     */
    public String getBroadcastType() {
        return this.BroadcastType;
    }

    /**
     * Set 过滤安全播报类型：0-紧急通知，1-功能更新，2-行业荣誉，3-版本发布
     * @param BroadcastType 过滤安全播报类型：0-紧急通知，1-功能更新，2-行业荣誉，3-版本发布
     */
    public void setBroadcastType(String BroadcastType) {
        this.BroadcastType = BroadcastType;
    }

    public DescribeSecurityBroadcastsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityBroadcastsRequest(DescribeSecurityBroadcastsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.BroadcastType != null) {
            this.BroadcastType = new String(source.BroadcastType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "BroadcastType", this.BroadcastType);

    }
}

