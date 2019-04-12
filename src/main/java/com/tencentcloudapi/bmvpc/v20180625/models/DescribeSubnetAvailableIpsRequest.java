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

public class DescribeSubnetAvailableIpsRequest  extends AbstractModel{

    /**
    * 私有网络子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * CIDR前缀，例如10.0.1
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
     * 获取私有网络子网ID
     * @return SubnetId 私有网络子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络子网ID
     * @param SubnetId 私有网络子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取CIDR前缀，例如10.0.1
     * @return Cidr CIDR前缀，例如10.0.1
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * 设置CIDR前缀，例如10.0.1
     * @param Cidr CIDR前缀，例如10.0.1
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);

    }
}

