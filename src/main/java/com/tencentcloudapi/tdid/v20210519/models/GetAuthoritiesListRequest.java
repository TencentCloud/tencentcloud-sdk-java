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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAuthoritiesListRequest extends AbstractModel{

    /**
    * 页码，从1开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Did信息
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 权威认证 1:已认证，2:未认证
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 页码，从1开始 
     * @return PageNumber 页码，从1开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，从1开始
     * @param PageNumber 页码，从1开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页大小 
     * @return PageSize 每页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小
     * @param PageSize 每页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Did信息 
     * @return Did Did信息
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set Did信息
     * @param Did Did信息
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 权威认证 1:已认证，2:未认证 
     * @return Status 权威认证 1:已认证，2:未认证
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 权威认证 1:已认证，2:未认证
     * @param Status 权威认证 1:已认证，2:未认证
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GetAuthoritiesListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAuthoritiesListRequest(GetAuthoritiesListRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

