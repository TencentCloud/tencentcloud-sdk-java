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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryExceedingInfoRequest extends AbstractModel{

    /**
    * 超额日期。格式为yyyy-MM-dd。
    */
    @SerializedName("TimeStr")
    @Expose
    private String TimeStr;

    /**
    * 维度。目前支持三个维度: AGENT, ANCHOR, ORDER。不填默认使用AGENT维度。
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 分页信息。不填默认Index为1，Count为100。
    */
    @SerializedName("PageNumber")
    @Expose
    private Paging PageNumber;

    /**
     * Get 超额日期。格式为yyyy-MM-dd。 
     * @return TimeStr 超额日期。格式为yyyy-MM-dd。
     */
    public String getTimeStr() {
        return this.TimeStr;
    }

    /**
     * Set 超额日期。格式为yyyy-MM-dd。
     * @param TimeStr 超额日期。格式为yyyy-MM-dd。
     */
    public void setTimeStr(String TimeStr) {
        this.TimeStr = TimeStr;
    }

    /**
     * Get 维度。目前支持三个维度: AGENT, ANCHOR, ORDER。不填默认使用AGENT维度。 
     * @return Dimension 维度。目前支持三个维度: AGENT, ANCHOR, ORDER。不填默认使用AGENT维度。
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 维度。目前支持三个维度: AGENT, ANCHOR, ORDER。不填默认使用AGENT维度。
     * @param Dimension 维度。目前支持三个维度: AGENT, ANCHOR, ORDER。不填默认使用AGENT维度。
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 分页信息。不填默认Index为1，Count为100。 
     * @return PageNumber 分页信息。不填默认Index为1，Count为100。
     */
    public Paging getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页信息。不填默认Index为1，Count为100。
     * @param PageNumber 分页信息。不填默认Index为1，Count为100。
     */
    public void setPageNumber(Paging PageNumber) {
        this.PageNumber = PageNumber;
    }

    public QueryExceedingInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryExceedingInfoRequest(QueryExceedingInfoRequest source) {
        if (source.TimeStr != null) {
            this.TimeStr = new String(source.TimeStr);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Paging(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeStr", this.TimeStr);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamObj(map, prefix + "PageNumber.", this.PageNumber);

    }
}

