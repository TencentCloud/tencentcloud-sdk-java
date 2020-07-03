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

public class DeleteInterfacesRequest extends AbstractModel{

    /**
    * 物理机ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 子网的唯一ID列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

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
     * Get 子网的唯一ID列表 
     * @return SubnetIds 子网的唯一ID列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网的唯一ID列表
     * @param SubnetIds 子网的唯一ID列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);

    }
}

