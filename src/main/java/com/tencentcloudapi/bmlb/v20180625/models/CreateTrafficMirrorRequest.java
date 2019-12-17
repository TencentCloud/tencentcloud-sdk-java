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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTrafficMirrorRequest extends AbstractModel{

    /**
    * 流量镜像实例别名。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 流量镜像实例所属的私有网络ID，形如：vpc-xxx。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 流量镜像实例别名。 
     * @return Alias 流量镜像实例别名。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 流量镜像实例别名。
     * @param Alias 流量镜像实例别名。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 流量镜像实例所属的私有网络ID，形如：vpc-xxx。 
     * @return VpcId 流量镜像实例所属的私有网络ID，形如：vpc-xxx。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 流量镜像实例所属的私有网络ID，形如：vpc-xxx。
     * @param VpcId 流量镜像实例所属的私有网络ID，形如：vpc-xxx。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

