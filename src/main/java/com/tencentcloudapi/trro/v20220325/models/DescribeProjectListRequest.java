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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectListRequest extends AbstractModel{

    /**
    * 每页返回的最大项目数量，不填默认为10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前页码，不填默认为1（首页）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get 每页返回的最大项目数量，不填默认为10 
     * @return PageSize 每页返回的最大项目数量，不填默认为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页返回的最大项目数量，不填默认为10
     * @param PageSize 每页返回的最大项目数量，不填默认为10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前页码，不填默认为1（首页） 
     * @return PageNumber 当前页码，不填默认为1（首页）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页码，不填默认为1（首页）
     * @param PageNumber 当前页码，不填默认为1（首页）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public DescribeProjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectListRequest(DescribeProjectListRequest source) {
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
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

