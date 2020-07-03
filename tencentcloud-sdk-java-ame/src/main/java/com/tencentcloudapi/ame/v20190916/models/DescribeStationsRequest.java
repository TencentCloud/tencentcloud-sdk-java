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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStationsRequest extends AbstractModel{

    /**
    * 条数，必须大于0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * offset (Default = 0)，(当前页-1) * Limit
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 条数，必须大于0 
     * @return Limit 条数，必须大于0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数，必须大于0
     * @param Limit 条数，必须大于0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get offset (Default = 0)，(当前页-1) * Limit 
     * @return Offset offset (Default = 0)，(当前页-1) * Limit
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set offset (Default = 0)，(当前页-1) * Limit
     * @param Offset offset (Default = 0)，(当前页-1) * Limit
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

