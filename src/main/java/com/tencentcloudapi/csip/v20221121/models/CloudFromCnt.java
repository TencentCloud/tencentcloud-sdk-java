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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudFromCnt extends AbstractModel {

    /**
    * <p>云服务器类型</p>
    */
    @SerializedName("CloudFrom")
    @Expose
    private Long CloudFrom;

    /**
    * <p>机器数量</p>
    */
    @SerializedName("MachineCnt")
    @Expose
    private Long MachineCnt;

    /**
     * Get <p>云服务器类型</p> 
     * @return CloudFrom <p>云服务器类型</p>
     */
    public Long getCloudFrom() {
        return this.CloudFrom;
    }

    /**
     * Set <p>云服务器类型</p>
     * @param CloudFrom <p>云服务器类型</p>
     */
    public void setCloudFrom(Long CloudFrom) {
        this.CloudFrom = CloudFrom;
    }

    /**
     * Get <p>机器数量</p> 
     * @return MachineCnt <p>机器数量</p>
     */
    public Long getMachineCnt() {
        return this.MachineCnt;
    }

    /**
     * Set <p>机器数量</p>
     * @param MachineCnt <p>机器数量</p>
     */
    public void setMachineCnt(Long MachineCnt) {
        this.MachineCnt = MachineCnt;
    }

    public CloudFromCnt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudFromCnt(CloudFromCnt source) {
        if (source.CloudFrom != null) {
            this.CloudFrom = new Long(source.CloudFrom);
        }
        if (source.MachineCnt != null) {
            this.MachineCnt = new Long(source.MachineCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudFrom", this.CloudFrom);
        this.setParamSimple(map, prefix + "MachineCnt", this.MachineCnt);

    }
}

