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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRsgAsGroupResponse extends AbstractModel {

    /**
    * 所创建的资源组的伸缩组
    */
    @SerializedName("RsgAsGroup")
    @Expose
    private RsgAsGroup RsgAsGroup;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 所创建的资源组的伸缩组 
     * @return RsgAsGroup 所创建的资源组的伸缩组
     */
    public RsgAsGroup getRsgAsGroup() {
        return this.RsgAsGroup;
    }

    /**
     * Set 所创建的资源组的伸缩组
     * @param RsgAsGroup 所创建的资源组的伸缩组
     */
    public void setRsgAsGroup(RsgAsGroup RsgAsGroup) {
        this.RsgAsGroup = RsgAsGroup;
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

    public CreateRsgAsGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRsgAsGroupResponse(CreateRsgAsGroupResponse source) {
        if (source.RsgAsGroup != null) {
            this.RsgAsGroup = new RsgAsGroup(source.RsgAsGroup);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RsgAsGroup.", this.RsgAsGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

