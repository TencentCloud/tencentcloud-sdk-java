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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindDSPAResourceCosBucketsResponse extends AbstractModel{

    /**
    * 绑定结果数组
    */
    @SerializedName("CosTaskResults")
    @Expose
    private CosTaskResult [] CosTaskResults;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 绑定结果数组 
     * @return CosTaskResults 绑定结果数组
     */
    public CosTaskResult [] getCosTaskResults() {
        return this.CosTaskResults;
    }

    /**
     * Set 绑定结果数组
     * @param CosTaskResults 绑定结果数组
     */
    public void setCosTaskResults(CosTaskResult [] CosTaskResults) {
        this.CosTaskResults = CosTaskResults;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public BindDSPAResourceCosBucketsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindDSPAResourceCosBucketsResponse(BindDSPAResourceCosBucketsResponse source) {
        if (source.CosTaskResults != null) {
            this.CosTaskResults = new CosTaskResult[source.CosTaskResults.length];
            for (int i = 0; i < source.CosTaskResults.length; i++) {
                this.CosTaskResults[i] = new CosTaskResult(source.CosTaskResults[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CosTaskResults.", this.CosTaskResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

