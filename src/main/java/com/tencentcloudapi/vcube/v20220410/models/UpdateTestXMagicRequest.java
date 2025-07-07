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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTestXMagicRequest extends AbstractModel {

    /**
    * 优图美视功能Id
    */
    @SerializedName("XMagicId")
    @Expose
    private Long XMagicId;

    /**
    * XMagic套餐包Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 优图美视功能Id 
     * @return XMagicId 优图美视功能Id
     */
    public Long getXMagicId() {
        return this.XMagicId;
    }

    /**
     * Set 优图美视功能Id
     * @param XMagicId 优图美视功能Id
     */
    public void setXMagicId(Long XMagicId) {
        this.XMagicId = XMagicId;
    }

    /**
     * Get XMagic套餐包Id 
     * @return ResourceId XMagic套餐包Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set XMagic套餐包Id
     * @param ResourceId XMagic套餐包Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public UpdateTestXMagicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTestXMagicRequest(UpdateTestXMagicRequest source) {
        if (source.XMagicId != null) {
            this.XMagicId = new Long(source.XMagicId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "XMagicId", this.XMagicId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

