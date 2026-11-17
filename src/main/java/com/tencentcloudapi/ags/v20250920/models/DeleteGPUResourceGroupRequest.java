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

public class DeleteGPUResourceGroupRequest extends AbstractModel {

    /**
    * 待删除的 GPU 资源组 ID，必填、非空，最多 64 字节。资源组必须属于当前租户，且已清空有效 GPU 实例、占用绑定和关联沙箱工具。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
     * Get 待删除的 GPU 资源组 ID，必填、非空，最多 64 字节。资源组必须属于当前租户，且已清空有效 GPU 实例、占用绑定和关联沙箱工具。 
     * @return ResourceGroupId 待删除的 GPU 资源组 ID，必填、非空，最多 64 字节。资源组必须属于当前租户，且已清空有效 GPU 实例、占用绑定和关联沙箱工具。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 待删除的 GPU 资源组 ID，必填、非空，最多 64 字节。资源组必须属于当前租户，且已清空有效 GPU 实例、占用绑定和关联沙箱工具。
     * @param ResourceGroupId 待删除的 GPU 资源组 ID，必填、非空，最多 64 字节。资源组必须属于当前租户，且已清空有效 GPU 实例、占用绑定和关联沙箱工具。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    public DeleteGPUResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGPUResourceGroupRequest(DeleteGPUResourceGroupRequest source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);

    }
}

