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

public class DescribeCSRRequest extends AbstractModel {

    /**
    * <p>CSR ID标识</p>
    */
    @SerializedName("CSRId")
    @Expose
    private Long CSRId;

    /**
     * Get <p>CSR ID标识</p> 
     * @return CSRId <p>CSR ID标识</p>
     */
    public Long getCSRId() {
        return this.CSRId;
    }

    /**
     * Set <p>CSR ID标识</p>
     * @param CSRId <p>CSR ID标识</p>
     */
    public void setCSRId(Long CSRId) {
        this.CSRId = CSRId;
    }

    public DescribeCSRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCSRRequest(DescribeCSRRequest source) {
        if (source.CSRId != null) {
            this.CSRId = new Long(source.CSRId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CSRId", this.CSRId);

    }
}

