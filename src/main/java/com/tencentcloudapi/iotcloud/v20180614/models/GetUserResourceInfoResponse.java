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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUserResourceInfoResponse extends AbstractModel{

    /**
    * 已使用的资源字节数
    */
    @SerializedName("UsedSize")
    @Expose
    private Long UsedSize;

    /**
    * 可以使用资源的总大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已使用的资源字节数 
     * @return UsedSize 已使用的资源字节数
     */
    public Long getUsedSize() {
        return this.UsedSize;
    }

    /**
     * Set 已使用的资源字节数
     * @param UsedSize 已使用的资源字节数
     */
    public void setUsedSize(Long UsedSize) {
        this.UsedSize = UsedSize;
    }

    /**
     * Get 可以使用资源的总大小 
     * @return Limit 可以使用资源的总大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 可以使用资源的总大小
     * @param Limit 可以使用资源的总大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    public GetUserResourceInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUserResourceInfoResponse(GetUserResourceInfoResponse source) {
        if (source.UsedSize != null) {
            this.UsedSize = new Long(source.UsedSize);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedSize", this.UsedSize);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

