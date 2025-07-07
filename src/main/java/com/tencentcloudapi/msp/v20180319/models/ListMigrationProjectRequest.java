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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListMigrationProjectRequest extends AbstractModel {

    /**
    * 记录起始数，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回条数，默认值为500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 记录起始数，默认值为0 
     * @return Offset 记录起始数，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录起始数，默认值为0
     * @param Offset 记录起始数，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回条数，默认值为500 
     * @return Limit 返回条数，默认值为500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回条数，默认值为500
     * @param Limit 返回条数，默认值为500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListMigrationProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListMigrationProjectRequest(ListMigrationProjectRequest source) {
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

