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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubnetByDeviceRequest extends AbstractModel{

    /**
    * 物理机ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 子网类型。0: 物理机子网; 7: DOCKER子网 8: 虚拟子网
    */
    @SerializedName("Types")
    @Expose
    private Long [] Types;

    /**
    * 查询的起始位置。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询的个数。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 物理机ID 
     * @return InstanceId 物理机ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 物理机ID
     * @param InstanceId 物理机ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 子网类型。0: 物理机子网; 7: DOCKER子网 8: 虚拟子网 
     * @return Types 子网类型。0: 物理机子网; 7: DOCKER子网 8: 虚拟子网
     */
    public Long [] getTypes() {
        return this.Types;
    }

    /**
     * Set 子网类型。0: 物理机子网; 7: DOCKER子网 8: 虚拟子网
     * @param Types 子网类型。0: 物理机子网; 7: DOCKER子网 8: 虚拟子网
     */
    public void setTypes(Long [] Types) {
        this.Types = Types;
    }

    /**
     * Get 查询的起始位置。 
     * @return Offset 查询的起始位置。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询的起始位置。
     * @param Offset 查询的起始位置。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询的个数。 
     * @return Limit 查询的个数。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询的个数。
     * @param Limit 查询的个数。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

