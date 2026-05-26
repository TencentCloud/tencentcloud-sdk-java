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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMemoryPlusSpaceRequest extends AbstractModel {

    /**
    * <p>指定查询的 Memory 实例 ID。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get <p>指定查询的 Memory 实例 ID。</p> 
     * @return SpaceId <p>指定查询的 Memory 实例 ID。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>指定查询的 Memory 实例 ID。</p>
     * @param SpaceId <p>指定查询的 Memory 实例 ID。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public DescribeMemoryPlusSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMemoryPlusSpaceRequest(DescribeMemoryPlusSpaceRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);

    }
}

