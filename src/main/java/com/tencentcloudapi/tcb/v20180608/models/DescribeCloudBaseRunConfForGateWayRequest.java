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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunConfForGateWayRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvID")
    @Expose
    private String EnvID;

    /**
    * vpc信息
    */
    @SerializedName("VpcID")
    @Expose
    private String VpcID;

    /**
     * Get 环境ID 
     * @return EnvID 环境ID
     */
    public String getEnvID() {
        return this.EnvID;
    }

    /**
     * Set 环境ID
     * @param EnvID 环境ID
     */
    public void setEnvID(String EnvID) {
        this.EnvID = EnvID;
    }

    /**
     * Get vpc信息 
     * @return VpcID vpc信息
     */
    public String getVpcID() {
        return this.VpcID;
    }

    /**
     * Set vpc信息
     * @param VpcID vpc信息
     */
    public void setVpcID(String VpcID) {
        this.VpcID = VpcID;
    }

    public DescribeCloudBaseRunConfForGateWayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunConfForGateWayRequest(DescribeCloudBaseRunConfForGateWayRequest source) {
        if (source.EnvID != null) {
            this.EnvID = new String(source.EnvID);
        }
        if (source.VpcID != null) {
            this.VpcID = new String(source.VpcID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvID", this.EnvID);
        this.setParamSimple(map, prefix + "VpcID", this.VpcID);

    }
}

