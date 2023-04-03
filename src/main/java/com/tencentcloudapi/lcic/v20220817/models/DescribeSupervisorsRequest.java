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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSupervisorsRequest extends AbstractModel{

    /**
    * 低代码互动课堂的SdkAppId。

    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 每页数据量，最大100。 不填默认20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页查询当前页数，从1开始递增，不填默认为1。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 低代码互动课堂的SdkAppId。
 
     * @return SdkAppId 低代码互动课堂的SdkAppId。

     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。

     * @param SdkAppId 低代码互动课堂的SdkAppId。

     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 每页数据量，最大100。 不填默认20. 
     * @return Limit 每页数据量，最大100。 不填默认20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据量，最大100。 不填默认20.
     * @param Limit 每页数据量，最大100。 不填默认20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页查询当前页数，从1开始递增，不填默认为1。 
     * @return Page 分页查询当前页数，从1开始递增，不填默认为1。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页查询当前页数，从1开始递增，不填默认为1。
     * @param Page 分页查询当前页数，从1开始递增，不填默认为1。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public DescribeSupervisorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupervisorsRequest(DescribeSupervisorsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

