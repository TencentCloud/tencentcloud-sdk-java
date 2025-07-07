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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWorkspacesAttributeRequest extends AbstractModel {

    /**
    * 工作空间列表
    */
    @SerializedName("SpaceIds")
    @Expose
    private String [] SpaceIds;

    /**
    * 修改后的工作空间名称。可任意命名，但不得超过60个字符。
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
     * Get 工作空间列表 
     * @return SpaceIds 工作空间列表
     */
    public String [] getSpaceIds() {
        return this.SpaceIds;
    }

    /**
     * Set 工作空间列表
     * @param SpaceIds 工作空间列表
     */
    public void setSpaceIds(String [] SpaceIds) {
        this.SpaceIds = SpaceIds;
    }

    /**
     * Get 修改后的工作空间名称。可任意命名，但不得超过60个字符。 
     * @return SpaceName 修改后的工作空间名称。可任意命名，但不得超过60个字符。
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set 修改后的工作空间名称。可任意命名，但不得超过60个字符。
     * @param SpaceName 修改后的工作空间名称。可任意命名，但不得超过60个字符。
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    public ModifyWorkspacesAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkspacesAttributeRequest(ModifyWorkspacesAttributeRequest source) {
        if (source.SpaceIds != null) {
            this.SpaceIds = new String[source.SpaceIds.length];
            for (int i = 0; i < source.SpaceIds.length; i++) {
                this.SpaceIds[i] = new String(source.SpaceIds[i]);
            }
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SpaceIds.", this.SpaceIds);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);

    }
}

