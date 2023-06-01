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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLibSamplesResponse extends AbstractModel{

    /**
    * 删除成功的数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 每个关键词删除的结果
    */
    @SerializedName("Details")
    @Expose
    private DeleteSampleDetails [] Details;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除成功的数量 
     * @return Count 删除成功的数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 删除成功的数量
     * @param Count 删除成功的数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 每个关键词删除的结果 
     * @return Details 每个关键词删除的结果
     */
    public DeleteSampleDetails [] getDetails() {
        return this.Details;
    }

    /**
     * Set 每个关键词删除的结果
     * @param Details 每个关键词删除的结果
     */
    public void setDetails(DeleteSampleDetails [] Details) {
        this.Details = Details;
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

    public DeleteLibSamplesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLibSamplesResponse(DeleteLibSamplesResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Details != null) {
            this.Details = new DeleteSampleDetails[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new DeleteSampleDetails(source.Details[i]);
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
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

