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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteClusterEndpointRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）
    */
    @SerializedName("IsExtranet")
    @Expose
    private Boolean IsExtranet;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE） 
     * @return IsExtranet 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）
     */
    public Boolean getIsExtranet() {
        return this.IsExtranet;
    }

    /**
     * Set 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）
     * @param IsExtranet 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）
     */
    public void setIsExtranet(Boolean IsExtranet) {
        this.IsExtranet = IsExtranet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "IsExtranet", this.IsExtranet);

    }
}

