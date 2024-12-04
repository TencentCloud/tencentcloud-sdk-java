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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNewsRequest extends AbstractModel {

    /**
    * 页码，从0开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数据量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 页码，从0开始 
     * @return PageNumber 页码，从0开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，从0开始
     * @param PageNumber 页码，从0开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数据量 
     * @return PageSize 每页数据量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数据量
     * @param PageSize 每页数据量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeNewsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNewsRequest(DescribeNewsRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

