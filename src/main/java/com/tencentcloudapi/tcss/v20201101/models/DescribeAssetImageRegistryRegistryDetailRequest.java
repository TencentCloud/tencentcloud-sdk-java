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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryRegistryDetailRequest extends AbstractModel {

    /**
    * 仓库唯一id
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
     * Get 仓库唯一id 
     * @return RegistryId 仓库唯一id
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 仓库唯一id
     * @param RegistryId 仓库唯一id
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    public DescribeAssetImageRegistryRegistryDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryRegistryDetailRequest(DescribeAssetImageRegistryRegistryDetailRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);

    }
}

