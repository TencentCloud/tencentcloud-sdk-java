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

public class ModifyGPUResourceGroupRequest extends AbstractModel {

    /**
    * GPU 资源组 ID，必填、非空，最多 64 字节。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 新的资源组名称；去除首尾空白后不能为空，最多 128 字节，UTF-8 中文通常占 3 字节。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get GPU 资源组 ID，必填、非空，最多 64 字节。 
     * @return ResourceGroupId GPU 资源组 ID，必填、非空，最多 64 字节。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set GPU 资源组 ID，必填、非空，最多 64 字节。
     * @param ResourceGroupId GPU 资源组 ID，必填、非空，最多 64 字节。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 新的资源组名称；去除首尾空白后不能为空，最多 128 字节，UTF-8 中文通常占 3 字节。 
     * @return Name 新的资源组名称；去除首尾空白后不能为空，最多 128 字节，UTF-8 中文通常占 3 字节。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 新的资源组名称；去除首尾空白后不能为空，最多 128 字节，UTF-8 中文通常占 3 字节。
     * @param Name 新的资源组名称；去除首尾空白后不能为空，最多 128 字节，UTF-8 中文通常占 3 字节。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModifyGPUResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGPUResourceGroupRequest(ModifyGPUResourceGroupRequest source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

