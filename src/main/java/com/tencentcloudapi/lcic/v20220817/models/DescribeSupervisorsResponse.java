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

public class DescribeSupervisorsResponse extends AbstractModel{

    /**
    * 数据总量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 分页查询当前页数
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 当前页数据量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 巡课列表
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据总量 
     * @return Total 数据总量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 数据总量
     * @param Total 数据总量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 分页查询当前页数 
     * @return Page 分页查询当前页数
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页查询当前页数
     * @param Page 分页查询当前页数
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 当前页数据量 
     * @return Limit 当前页数据量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 当前页数据量
     * @param Limit 当前页数据量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 巡课列表 
     * @return UserIds 巡课列表
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 巡课列表
     * @param UserIds 巡课列表
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSupervisorsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupervisorsResponse(DescribeSupervisorsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

