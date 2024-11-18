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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCollaboratorsRequest extends AbstractModel {

    /**
    * 分页的条数，默认是20条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页的起始值，默认从0开始。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 分页的条数，默认是20条。 
     * @return Limit 分页的条数，默认是20条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的条数，默认是20条。
     * @param Limit 分页的条数，默认是20条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页的起始值，默认从0开始。 
     * @return Offset 分页的起始值，默认从0开始。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的起始值，默认从0开始。
     * @param Offset 分页的起始值，默认从0开始。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListCollaboratorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCollaboratorsRequest(ListCollaboratorsRequest source) {
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

