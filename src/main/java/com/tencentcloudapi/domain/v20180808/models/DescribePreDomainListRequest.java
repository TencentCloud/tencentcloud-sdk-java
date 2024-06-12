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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePreDomainListRequest extends AbstractModel {

    /**
    * 页码，默认为1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 条数，默认为20
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 用于结束时间筛选
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 用户指定上架时间筛选
    */
    @SerializedName("UpTime")
    @Expose
    private String UpTime;

    /**
     * Get 页码，默认为1 
     * @return Page 页码，默认为1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码，默认为1
     * @param Page 页码，默认为1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 条数，默认为20 
     * @return Size 条数，默认为20
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 条数，默认为20
     * @param Size 条数，默认为20
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 用于结束时间筛选 
     * @return EndTime 用于结束时间筛选
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 用于结束时间筛选
     * @param EndTime 用于结束时间筛选
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 用户指定上架时间筛选 
     * @return UpTime 用户指定上架时间筛选
     */
    public String getUpTime() {
        return this.UpTime;
    }

    /**
     * Set 用户指定上架时间筛选
     * @param UpTime 用户指定上架时间筛选
     */
    public void setUpTime(String UpTime) {
        this.UpTime = UpTime;
    }

    public DescribePreDomainListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePreDomainListRequest(DescribePreDomainListRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.UpTime != null) {
            this.UpTime = new String(source.UpTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UpTime", this.UpTime);

    }
}

