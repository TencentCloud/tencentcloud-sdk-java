/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeDiskAssociatedAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * 要查询的云硬盘ID，通过[DescribeDisks](https://tcloud4api.woa.com/document/product/362/15601?!preview&!document=1)接口查询。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get 要查询的云硬盘ID，通过[DescribeDisks](https://tcloud4api.woa.com/document/product/362/15601?!preview&!document=1)接口查询。 
     * @return DiskId 要查询的云硬盘ID，通过[DescribeDisks](https://tcloud4api.woa.com/document/product/362/15601?!preview&!document=1)接口查询。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 要查询的云硬盘ID，通过[DescribeDisks](https://tcloud4api.woa.com/document/product/362/15601?!preview&!document=1)接口查询。
     * @param DiskId 要查询的云硬盘ID，通过[DescribeDisks](https://tcloud4api.woa.com/document/product/362/15601?!preview&!document=1)接口查询。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    public DescribeDiskAssociatedAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskAssociatedAutoSnapshotPolicyRequest(DescribeDiskAssociatedAutoSnapshotPolicyRequest source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

