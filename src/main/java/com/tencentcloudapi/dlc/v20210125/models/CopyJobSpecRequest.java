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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyJobSpecRequest extends AbstractModel {

    /**
    * <p>原配置ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>新配置名称（可选，留空则自动命名为 &#39;原名-copy&#39;）</p>
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
     * Get <p>原配置ID</p> 
     * @return SpecId <p>原配置ID</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>原配置ID</p>
     * @param SpecId <p>原配置ID</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>新配置名称（可选，留空则自动命名为 &#39;原名-copy&#39;）</p> 
     * @return NewName <p>新配置名称（可选，留空则自动命名为 &#39;原名-copy&#39;）</p>
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set <p>新配置名称（可选，留空则自动命名为 &#39;原名-copy&#39;）</p>
     * @param NewName <p>新配置名称（可选，留空则自动命名为 &#39;原名-copy&#39;）</p>
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    public CopyJobSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyJobSpecRequest(CopyJobSpecRequest source) {
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.NewName != null) {
            this.NewName = new String(source.NewName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "NewName", this.NewName);

    }
}

