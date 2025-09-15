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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpcInfo extends AbstractModel {

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 1 新建 2 指定
    */
    @SerializedName("CreateType")
    @Expose
    private Long CreateType;

    /**
    * 子网ID列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 1 新建 2 指定 
     * @return CreateType 1 新建 2 指定
     */
    public Long getCreateType() {
        return this.CreateType;
    }

    /**
     * Set 1 新建 2 指定
     * @param CreateType 1 新建 2 指定
     */
    public void setCreateType(Long CreateType) {
        this.CreateType = CreateType;
    }

    /**
     * Get 子网ID列表 
     * @return SubnetIds 子网ID列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID列表
     * @param SubnetIds 子网ID列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    public CreateVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcInfo(CreateVpcInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CreateType != null) {
            this.CreateType = new Long(source.CreateType);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CreateType", this.CreateType);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);

    }
}

