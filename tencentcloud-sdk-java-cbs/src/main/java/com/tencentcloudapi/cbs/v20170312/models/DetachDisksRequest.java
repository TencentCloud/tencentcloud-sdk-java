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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachDisksRequest extends AbstractModel{

    /**
    * 将要解挂的云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询，单次请求最多可解挂10块弹性云盘。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 对于非共享型云盘，会忽略该参数；对于共享型云盘，该参数表示要从哪个CVM实例上解挂云盘。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 将要解挂的云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询，单次请求最多可解挂10块弹性云盘。 
     * @return DiskIds 将要解挂的云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询，单次请求最多可解挂10块弹性云盘。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 将要解挂的云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询，单次请求最多可解挂10块弹性云盘。
     * @param DiskIds 将要解挂的云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询，单次请求最多可解挂10块弹性云盘。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 对于非共享型云盘，会忽略该参数；对于共享型云盘，该参数表示要从哪个CVM实例上解挂云盘。 
     * @return InstanceId 对于非共享型云盘，会忽略该参数；对于共享型云盘，该参数表示要从哪个CVM实例上解挂云盘。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 对于非共享型云盘，会忽略该参数；对于共享型云盘，该参数表示要从哪个CVM实例上解挂云盘。
     * @param InstanceId 对于非共享型云盘，会忽略该参数；对于共享型云盘，该参数表示要从哪个CVM实例上解挂云盘。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

