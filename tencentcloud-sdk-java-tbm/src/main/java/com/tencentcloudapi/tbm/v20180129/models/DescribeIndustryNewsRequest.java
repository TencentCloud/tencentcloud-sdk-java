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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndustryNewsRequest extends AbstractModel{

    /**
    * 行业ID
    */
    @SerializedName("IndustryId")
    @Expose
    private String IndustryId;

    /**
    * 查询开始时间
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 查询结束时间
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 是否显示列表，若为 true，则返回文章列表
    */
    @SerializedName("ShowList")
    @Expose
    private Boolean ShowList;

    /**
    * 查询偏移，默认从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询条数上限，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 行业ID 
     * @return IndustryId 行业ID
     */
    public String getIndustryId() {
        return this.IndustryId;
    }

    /**
     * Set 行业ID
     * @param IndustryId 行业ID
     */
    public void setIndustryId(String IndustryId) {
        this.IndustryId = IndustryId;
    }

    /**
     * Get 查询开始时间 
     * @return StartDate 查询开始时间
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 查询开始时间
     * @param StartDate 查询开始时间
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 查询结束时间 
     * @return EndDate 查询结束时间
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 查询结束时间
     * @param EndDate 查询结束时间
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 是否显示列表，若为 true，则返回文章列表 
     * @return ShowList 是否显示列表，若为 true，则返回文章列表
     */
    public Boolean getShowList() {
        return this.ShowList;
    }

    /**
     * Set 是否显示列表，若为 true，则返回文章列表
     * @param ShowList 是否显示列表，若为 true，则返回文章列表
     */
    public void setShowList(Boolean ShowList) {
        this.ShowList = ShowList;
    }

    /**
     * Get 查询偏移，默认从0开始 
     * @return Offset 查询偏移，默认从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移，默认从0开始
     * @param Offset 查询偏移，默认从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询条数上限，默认20 
     * @return Limit 查询条数上限，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询条数上限，默认20
     * @param Limit 查询条数上限，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndustryId", this.IndustryId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ShowList", this.ShowList);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

