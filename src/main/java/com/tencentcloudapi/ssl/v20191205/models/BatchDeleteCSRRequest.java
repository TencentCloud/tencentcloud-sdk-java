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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDeleteCSRRequest extends AbstractModel {

    /**
    * 要删除的CSR Id标识。最多100个
    */
    @SerializedName("CSRIds")
    @Expose
    private Long [] CSRIds;

    /**
     * Get 要删除的CSR Id标识。最多100个 
     * @return CSRIds 要删除的CSR Id标识。最多100个
     */
    public Long [] getCSRIds() {
        return this.CSRIds;
    }

    /**
     * Set 要删除的CSR Id标识。最多100个
     * @param CSRIds 要删除的CSR Id标识。最多100个
     */
    public void setCSRIds(Long [] CSRIds) {
        this.CSRIds = CSRIds;
    }

    public BatchDeleteCSRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteCSRRequest(BatchDeleteCSRRequest source) {
        if (source.CSRIds != null) {
            this.CSRIds = new Long[source.CSRIds.length];
            for (int i = 0; i < source.CSRIds.length; i++) {
                this.CSRIds[i] = new Long(source.CSRIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CSRIds.", this.CSRIds);

    }
}

