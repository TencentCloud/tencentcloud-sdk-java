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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcQuotaRequest extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("TypeIds")
    @Expose
    private Long [] TypeIds;

    /**
     * Get 类型 
     * @return TypeIds 类型
     */
    public Long [] getTypeIds() {
        return this.TypeIds;
    }

    /**
     * Set 类型
     * @param TypeIds 类型
     */
    public void setTypeIds(Long [] TypeIds) {
        this.TypeIds = TypeIds;
    }

    public DescribeVpcQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcQuotaRequest(DescribeVpcQuotaRequest source) {
        if (source.TypeIds != null) {
            this.TypeIds = new Long[source.TypeIds.length];
            for (int i = 0; i < source.TypeIds.length; i++) {
                this.TypeIds[i] = new Long(source.TypeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TypeIds.", this.TypeIds);

    }
}

