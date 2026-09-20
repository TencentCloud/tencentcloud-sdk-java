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

public class ModifySessionSpaceRequest extends AbstractModel {

    /**
    * <p>需要修改的会话空间唯一标识。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>修改后的会话空间名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>修改后的会话空间描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>需要修改的会话空间唯一标识。</p> 
     * @return SpaceId <p>需要修改的会话空间唯一标识。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>需要修改的会话空间唯一标识。</p>
     * @param SpaceId <p>需要修改的会话空间唯一标识。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>修改后的会话空间名称。</p> 
     * @return Name <p>修改后的会话空间名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>修改后的会话空间名称。</p>
     * @param Name <p>修改后的会话空间名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>修改后的会话空间描述。</p> 
     * @return Description <p>修改后的会话空间描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>修改后的会话空间描述。</p>
     * @param Description <p>修改后的会话空间描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifySessionSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySessionSpaceRequest(ModifySessionSpaceRequest source) {
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

