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

public class DescribeClusterKubeconfigRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 默认false 获取内网，是否获取外网访问的kubeconfig
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
     * Get 默认false 获取内网，是否获取外网访问的kubeconfig 
     * @return IsExtranet 默认false 获取内网，是否获取外网访问的kubeconfig
     */
    public Boolean getIsExtranet() {
        return this.IsExtranet;
    }

    /**
     * Set 默认false 获取内网，是否获取外网访问的kubeconfig
     * @param IsExtranet 默认false 获取内网，是否获取外网访问的kubeconfig
     */
    public void setIsExtranet(Boolean IsExtranet) {
        this.IsExtranet = IsExtranet;
    }

    public DescribeClusterKubeconfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterKubeconfigRequest(DescribeClusterKubeconfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.IsExtranet != null) {
            this.IsExtranet = new Boolean(source.IsExtranet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "IsExtranet", this.IsExtranet);

    }
}

