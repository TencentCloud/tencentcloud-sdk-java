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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMaliciousRequestsRequest extends AbstractModel {

    /**
    * 恶意请求记录ID数组，(最大100条)
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 是否删除全部
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
     * Get 恶意请求记录ID数组，(最大100条) 
     * @return Ids 恶意请求记录ID数组，(最大100条)
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 恶意请求记录ID数组，(最大100条)
     * @param Ids 恶意请求记录ID数组，(最大100条)
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 是否删除全部 
     * @return All 是否删除全部
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否删除全部
     * @param All 是否删除全部
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    public DeleteMaliciousRequestsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMaliciousRequestsRequest(DeleteMaliciousRequestsRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "All", this.All);

    }
}

