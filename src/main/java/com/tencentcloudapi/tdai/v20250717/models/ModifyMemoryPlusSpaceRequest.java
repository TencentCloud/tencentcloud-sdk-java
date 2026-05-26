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

public class ModifyMemoryPlusSpaceRequest extends AbstractModel {

    /**
    * <p>指定需要修改的 Memory 实例 ID。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>指定修改后的实例名称。支持 60 个字符内 的中英文、数字、中划线（-）及下划线（_）。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>指定修改后的实例描述。最多支持 200 个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>指定需要修改的 Memory 实例 ID。</p> 
     * @return SpaceId <p>指定需要修改的 Memory 实例 ID。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>指定需要修改的 Memory 实例 ID。</p>
     * @param SpaceId <p>指定需要修改的 Memory 实例 ID。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>指定修改后的实例名称。支持 60 个字符内 的中英文、数字、中划线（-）及下划线（_）。</p> 
     * @return Name <p>指定修改后的实例名称。支持 60 个字符内 的中英文、数字、中划线（-）及下划线（_）。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>指定修改后的实例名称。支持 60 个字符内 的中英文、数字、中划线（-）及下划线（_）。</p>
     * @param Name <p>指定修改后的实例名称。支持 60 个字符内 的中英文、数字、中划线（-）及下划线（_）。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>指定修改后的实例描述。最多支持 200 个字符。</p> 
     * @return Description <p>指定修改后的实例描述。最多支持 200 个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>指定修改后的实例描述。最多支持 200 个字符。</p>
     * @param Description <p>指定修改后的实例描述。最多支持 200 个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyMemoryPlusSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMemoryPlusSpaceRequest(ModifyMemoryPlusSpaceRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

