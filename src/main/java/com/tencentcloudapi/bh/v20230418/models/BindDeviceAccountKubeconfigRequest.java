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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindDeviceAccountKubeconfigRequest extends AbstractModel {

    /**
    * 容器账号Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 容器账号凭据
    */
    @SerializedName("Kubeconfig")
    @Expose
    private String Kubeconfig;

    /**
    * 托管维度。1-集群
    */
    @SerializedName("ManageDimension")
    @Expose
    private Long ManageDimension;

    /**
     * Get 容器账号Id 
     * @return Id 容器账号Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 容器账号Id
     * @param Id 容器账号Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 容器账号凭据 
     * @return Kubeconfig 容器账号凭据
     */
    public String getKubeconfig() {
        return this.Kubeconfig;
    }

    /**
     * Set 容器账号凭据
     * @param Kubeconfig 容器账号凭据
     */
    public void setKubeconfig(String Kubeconfig) {
        this.Kubeconfig = Kubeconfig;
    }

    /**
     * Get 托管维度。1-集群 
     * @return ManageDimension 托管维度。1-集群
     */
    public Long getManageDimension() {
        return this.ManageDimension;
    }

    /**
     * Set 托管维度。1-集群
     * @param ManageDimension 托管维度。1-集群
     */
    public void setManageDimension(Long ManageDimension) {
        this.ManageDimension = ManageDimension;
    }

    public BindDeviceAccountKubeconfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindDeviceAccountKubeconfigRequest(BindDeviceAccountKubeconfigRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Kubeconfig != null) {
            this.Kubeconfig = new String(source.Kubeconfig);
        }
        if (source.ManageDimension != null) {
            this.ManageDimension = new Long(source.ManageDimension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Kubeconfig", this.Kubeconfig);
        this.setParamSimple(map, prefix + "ManageDimension", this.ManageDimension);

    }
}

