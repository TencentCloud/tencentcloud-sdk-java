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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcConfig  extends AbstractModel{

    /**
    * 私有网络 的 id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网的 id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * 获取私有网络 的 id
     * @return VpcId 私有网络 的 id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络 的 id
     * @param VpcId 私有网络 的 id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网的 id
     * @return SubnetId 子网的 id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网的 id
     * @param SubnetId 子网的 id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

