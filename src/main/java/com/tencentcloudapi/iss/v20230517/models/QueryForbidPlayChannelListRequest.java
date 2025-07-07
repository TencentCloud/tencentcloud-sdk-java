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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryForbidPlayChannelListRequest extends AbstractModel {

    /**
    * 子用户uin，也可以是主用户的uin
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 每页最大数量，最大为200，超过按照200返回
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 第几页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get 子用户uin，也可以是主用户的uin 
     * @return UserId 子用户uin，也可以是主用户的uin
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 子用户uin，也可以是主用户的uin
     * @param UserId 子用户uin，也可以是主用户的uin
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 每页最大数量，最大为200，超过按照200返回 
     * @return PageSize 每页最大数量，最大为200，超过按照200返回
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页最大数量，最大为200，超过按照200返回
     * @param PageSize 每页最大数量，最大为200，超过按照200返回
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 第几页 
     * @return PageNumber 第几页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 第几页
     * @param PageNumber 第几页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public QueryForbidPlayChannelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryForbidPlayChannelListRequest(QueryForbidPlayChannelListRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

