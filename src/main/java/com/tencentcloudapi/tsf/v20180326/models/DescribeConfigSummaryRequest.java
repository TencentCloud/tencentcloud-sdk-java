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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigSummaryRequest extends AbstractModel{

    /**
    * 应用ID，不传入时查询全量
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按时间排序：creation_time；按名称排序：config_name
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 升序传 0，降序传 1
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 无
    */
    @SerializedName("ConfigTagList")
    @Expose
    private String [] ConfigTagList;

    /**
    * 无
    */
    @SerializedName("DisableProgramAuthCheck")
    @Expose
    private Boolean DisableProgramAuthCheck;

    /**
    * 无
    */
    @SerializedName("ConfigIdList")
    @Expose
    private String [] ConfigIdList;

    /**
     * Get 应用ID，不传入时查询全量 
     * @return ApplicationId 应用ID，不传入时查询全量
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID，不传入时查询全量
     * @param ApplicationId 应用ID，不传入时查询全量
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量 
     * @return SearchWord 查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
     * @param SearchWord 查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条数，默认为20 
     * @return Limit 每页条数，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数，默认为20
     * @param Limit 每页条数，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按时间排序：creation_time；按名称排序：config_name 
     * @return OrderBy 按时间排序：creation_time；按名称排序：config_name
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 按时间排序：creation_time；按名称排序：config_name
     * @param OrderBy 按时间排序：creation_time；按名称排序：config_name
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 升序传 0，降序传 1 
     * @return OrderType 升序传 0，降序传 1
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 升序传 0，降序传 1
     * @param OrderType 升序传 0，降序传 1
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 无 
     * @return ConfigTagList 无
     */
    public String [] getConfigTagList() {
        return this.ConfigTagList;
    }

    /**
     * Set 无
     * @param ConfigTagList 无
     */
    public void setConfigTagList(String [] ConfigTagList) {
        this.ConfigTagList = ConfigTagList;
    }

    /**
     * Get 无 
     * @return DisableProgramAuthCheck 无
     */
    public Boolean getDisableProgramAuthCheck() {
        return this.DisableProgramAuthCheck;
    }

    /**
     * Set 无
     * @param DisableProgramAuthCheck 无
     */
    public void setDisableProgramAuthCheck(Boolean DisableProgramAuthCheck) {
        this.DisableProgramAuthCheck = DisableProgramAuthCheck;
    }

    /**
     * Get 无 
     * @return ConfigIdList 无
     */
    public String [] getConfigIdList() {
        return this.ConfigIdList;
    }

    /**
     * Set 无
     * @param ConfigIdList 无
     */
    public void setConfigIdList(String [] ConfigIdList) {
        this.ConfigIdList = ConfigIdList;
    }

    public DescribeConfigSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigSummaryRequest(DescribeConfigSummaryRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.ConfigTagList != null) {
            this.ConfigTagList = new String[source.ConfigTagList.length];
            for (int i = 0; i < source.ConfigTagList.length; i++) {
                this.ConfigTagList[i] = new String(source.ConfigTagList[i]);
            }
        }
        if (source.DisableProgramAuthCheck != null) {
            this.DisableProgramAuthCheck = new Boolean(source.DisableProgramAuthCheck);
        }
        if (source.ConfigIdList != null) {
            this.ConfigIdList = new String[source.ConfigIdList.length];
            for (int i = 0; i < source.ConfigIdList.length; i++) {
                this.ConfigIdList[i] = new String(source.ConfigIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "ConfigTagList.", this.ConfigTagList);
        this.setParamSimple(map, prefix + "DisableProgramAuthCheck", this.DisableProgramAuthCheck);
        this.setParamArraySimple(map, prefix + "ConfigIdList.", this.ConfigIdList);

    }
}

