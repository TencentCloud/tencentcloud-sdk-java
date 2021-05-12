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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodParameter extends AbstractModel{

    /**
    * TKE或EKS集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 自定义权限
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 自定义参数
    */
    @SerializedName("Parameter")
    @Expose
    private String Parameter;

    /**
     * Get TKE或EKS集群ID 
     * @return ClusterId TKE或EKS集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set TKE或EKS集群ID
     * @param ClusterId TKE或EKS集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 自定义权限 
     * @return Config 自定义权限
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 自定义权限
     * @param Config 自定义权限
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 自定义参数 
     * @return Parameter 自定义参数
     */
    public String getParameter() {
        return this.Parameter;
    }

    /**
     * Set 自定义参数
     * @param Parameter 自定义参数
     */
    public void setParameter(String Parameter) {
        this.Parameter = Parameter;
    }

    public PodParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodParameter(PodParameter source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Parameter != null) {
            this.Parameter = new String(source.Parameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Parameter", this.Parameter);

    }
}

