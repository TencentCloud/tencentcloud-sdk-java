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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionSpaceRequest extends AbstractModel {

    /**
    * <p>需要查询的会话空间唯一标识。</p><p>入参限制：必填，不能为空。</p><p>可通过 CreateSessionSpace 或 DescribeSessionSpaces 获取，不应自行构造。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get <p>需要查询的会话空间唯一标识。</p><p>入参限制：必填，不能为空。</p><p>可通过 CreateSessionSpace 或 DescribeSessionSpaces 获取，不应自行构造。</p> 
     * @return SpaceId <p>需要查询的会话空间唯一标识。</p><p>入参限制：必填，不能为空。</p><p>可通过 CreateSessionSpace 或 DescribeSessionSpaces 获取，不应自行构造。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>需要查询的会话空间唯一标识。</p><p>入参限制：必填，不能为空。</p><p>可通过 CreateSessionSpace 或 DescribeSessionSpaces 获取，不应自行构造。</p>
     * @param SpaceId <p>需要查询的会话空间唯一标识。</p><p>入参限制：必填，不能为空。</p><p>可通过 CreateSessionSpace 或 DescribeSessionSpaces 获取，不应自行构造。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public DescribeSessionSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionSpaceRequest(DescribeSessionSpaceRequest source) {
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

