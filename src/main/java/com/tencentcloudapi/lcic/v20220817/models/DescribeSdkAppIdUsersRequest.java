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

public class DescribeSdkAppIdUsersRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分页，默认值为1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 分页数据限制，默认值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 应用ID 
     * @return SdkAppId 应用ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID
     * @param SdkAppId 应用ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分页，默认值为1 
     * @return Page 分页，默认值为1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页，默认值为1
     * @param Page 分页，默认值为1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 分页数据限制，默认值为20 
     * @return Limit 分页数据限制，默认值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页数据限制，默认值为20
     * @param Limit 分页数据限制，默认值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSdkAppIdUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSdkAppIdUsersRequest(DescribeSdkAppIdUsersRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

