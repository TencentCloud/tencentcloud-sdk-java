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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunVpcInfo extends AbstractModel {

    /**
    * vpc的id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 创建类型(0=继承; 1=新建; 2=指定)
    */
    @SerializedName("CreateType")
    @Expose
    private Long CreateType;

    /**
     * Get vpc的id 
     * @return VpcId vpc的id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc的id
     * @param VpcId vpc的id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetIds 子网id
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网id
     * @param SubnetIds 子网id
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 创建类型(0=继承; 1=新建; 2=指定) 
     * @return CreateType 创建类型(0=继承; 1=新建; 2=指定)
     */
    public Long getCreateType() {
        return this.CreateType;
    }

    /**
     * Set 创建类型(0=继承; 1=新建; 2=指定)
     * @param CreateType 创建类型(0=继承; 1=新建; 2=指定)
     */
    public void setCreateType(Long CreateType) {
        this.CreateType = CreateType;
    }

    public CloudBaseRunVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunVpcInfo(CloudBaseRunVpcInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.CreateType != null) {
            this.CreateType = new Long(source.CreateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "CreateType", this.CreateType);

    }
}

