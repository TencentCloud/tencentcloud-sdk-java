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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentDutyTasksRequest extends AbstractModel {

    /**
    * 查询开始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 列表查询数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 查询开始位置 
     * @return Offset 查询开始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询开始位置
     * @param Offset 查询开始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 列表查询数量 
     * @return Limit 列表查询数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表查询数量
     * @param Limit 列表查询数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAgentDutyTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentDutyTasksRequest(DescribeAgentDutyTasksRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

