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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitializeDisksRequest extends AbstractModel {

    /**
    * 待重新初始化的云硬盘ID列表，可以通过[DescribeDisks](/document/product/362/16315)接口查询， 单次初始化限制20块以内
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
     * Get 待重新初始化的云硬盘ID列表，可以通过[DescribeDisks](/document/product/362/16315)接口查询， 单次初始化限制20块以内 
     * @return DiskIds 待重新初始化的云硬盘ID列表，可以通过[DescribeDisks](/document/product/362/16315)接口查询， 单次初始化限制20块以内
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 待重新初始化的云硬盘ID列表，可以通过[DescribeDisks](/document/product/362/16315)接口查询， 单次初始化限制20块以内
     * @param DiskIds 待重新初始化的云硬盘ID列表，可以通过[DescribeDisks](/document/product/362/16315)接口查询， 单次初始化限制20块以内
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    public InitializeDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InitializeDisksRequest(InitializeDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);

    }
}

