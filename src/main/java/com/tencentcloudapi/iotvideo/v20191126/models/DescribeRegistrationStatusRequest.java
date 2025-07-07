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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegistrationStatusRequest extends AbstractModel {

    /**
    * 终端用户的唯一ID列表，0<元素数量<=100
    */
    @SerializedName("CunionIds")
    @Expose
    private String [] CunionIds;

    /**
     * Get 终端用户的唯一ID列表，0<元素数量<=100 
     * @return CunionIds 终端用户的唯一ID列表，0<元素数量<=100
     */
    public String [] getCunionIds() {
        return this.CunionIds;
    }

    /**
     * Set 终端用户的唯一ID列表，0<元素数量<=100
     * @param CunionIds 终端用户的唯一ID列表，0<元素数量<=100
     */
    public void setCunionIds(String [] CunionIds) {
        this.CunionIds = CunionIds;
    }

    public DescribeRegistrationStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegistrationStatusRequest(DescribeRegistrationStatusRequest source) {
        if (source.CunionIds != null) {
            this.CunionIds = new String[source.CunionIds.length];
            for (int i = 0; i < source.CunionIds.length; i++) {
                this.CunionIds[i] = new String(source.CunionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CunionIds.", this.CunionIds);

    }
}

