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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttackSourceEventsRequest extends AbstractModel {

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 开始日期
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 结束日期
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 接口DescribeAttackSource 返回的EventInfoParam
    */
    @SerializedName("EventInfoParam")
    @Expose
    private String EventInfoParam;

    /**
    * 限制分页条数默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 起始步长默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 主机uuid 
     * @return Uuid 主机uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
     * @param Uuid 主机uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 开始日期 
     * @return BeginDate 开始日期
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 开始日期
     * @param BeginDate 开始日期
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 结束日期 
     * @return EndDate 结束日期
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期
     * @param EndDate 结束日期
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 接口DescribeAttackSource 返回的EventInfoParam 
     * @return EventInfoParam 接口DescribeAttackSource 返回的EventInfoParam
     */
    public String getEventInfoParam() {
        return this.EventInfoParam;
    }

    /**
     * Set 接口DescribeAttackSource 返回的EventInfoParam
     * @param EventInfoParam 接口DescribeAttackSource 返回的EventInfoParam
     */
    public void setEventInfoParam(String EventInfoParam) {
        this.EventInfoParam = EventInfoParam;
    }

    /**
     * Get 限制分页条数默认10 
     * @return Limit 限制分页条数默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制分页条数默认10
     * @param Limit 限制分页条数默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 起始步长默认0 
     * @return Offset 起始步长默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始步长默认0
     * @param Offset 起始步长默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAttackSourceEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackSourceEventsRequest(DescribeAttackSourceEventsRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.EventInfoParam != null) {
            this.EventInfoParam = new String(source.EventInfoParam);
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
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "EventInfoParam", this.EventInfoParam);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

