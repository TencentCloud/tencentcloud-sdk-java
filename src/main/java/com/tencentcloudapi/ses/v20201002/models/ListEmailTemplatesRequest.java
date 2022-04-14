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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEmailTemplatesRequest extends AbstractModel{

    /**
    * 获取模板数据量，用于分页
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 获取模板偏移值，用于分页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 获取模板数据量，用于分页 
     * @return Limit 获取模板数据量，用于分页
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 获取模板数据量，用于分页
     * @param Limit 获取模板数据量，用于分页
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 获取模板偏移值，用于分页 
     * @return Offset 获取模板偏移值，用于分页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 获取模板偏移值，用于分页
     * @param Offset 获取模板偏移值，用于分页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListEmailTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEmailTemplatesRequest(ListEmailTemplatesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

