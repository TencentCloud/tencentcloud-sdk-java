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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecInfoRequest extends AbstractModel {

    /**
    * 待查询可用区。当前支持的可用区，请参见[地域与可用区](https://cloud.tencent.com/document/product/240/3637)。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 待查询可用区。当前支持的可用区，请参见[地域与可用区](https://cloud.tencent.com/document/product/240/3637)。 
     * @return Zone 待查询可用区。当前支持的可用区，请参见[地域与可用区](https://cloud.tencent.com/document/product/240/3637)。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 待查询可用区。当前支持的可用区，请参见[地域与可用区](https://cloud.tencent.com/document/product/240/3637)。
     * @param Zone 待查询可用区。当前支持的可用区，请参见[地域与可用区](https://cloud.tencent.com/document/product/240/3637)。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public DescribeSpecInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecInfoRequest(DescribeSpecInfoRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

