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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFilterResultListRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 开始时间，格式为 年-月-日，如: 2018-07-11
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束时间，格式为 年-月-日，如: 2018-07-11
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认值为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 应用ID 
     * @return BizId 应用ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID
     * @param BizId 应用ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 开始时间，格式为 年-月-日，如: 2018-07-11 
     * @return StartDate 开始时间，格式为 年-月-日，如: 2018-07-11
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始时间，格式为 年-月-日，如: 2018-07-11
     * @param StartDate 开始时间，格式为 年-月-日，如: 2018-07-11
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束时间，格式为 年-月-日，如: 2018-07-11 
     * @return EndDate 结束时间，格式为 年-月-日，如: 2018-07-11
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束时间，格式为 年-月-日，如: 2018-07-11
     * @param EndDate 结束时间，格式为 年-月-日，如: 2018-07-11
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 偏移量，默认值为0。 
     * @return Offset 偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0。
     * @param Offset 偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为10，最大值为100。 
     * @return Limit 返回数量，默认值为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为10，最大值为100。
     * @param Limit 返回数量，默认值为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

