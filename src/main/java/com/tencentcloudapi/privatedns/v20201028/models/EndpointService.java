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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndpointService extends AbstractModel {

    /**
    * <p>子网剩余IP数</p>
    */
    @SerializedName("SubnetLessIp")
    @Expose
    private Long SubnetLessIp;

    /**
     * Get <p>子网剩余IP数</p> 
     * @return SubnetLessIp <p>子网剩余IP数</p>
     */
    public Long getSubnetLessIp() {
        return this.SubnetLessIp;
    }

    /**
     * Set <p>子网剩余IP数</p>
     * @param SubnetLessIp <p>子网剩余IP数</p>
     */
    public void setSubnetLessIp(Long SubnetLessIp) {
        this.SubnetLessIp = SubnetLessIp;
    }

    public EndpointService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointService(EndpointService source) {
        if (source.SubnetLessIp != null) {
            this.SubnetLessIp = new Long(source.SubnetLessIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetLessIp", this.SubnetLessIp);

    }
}

