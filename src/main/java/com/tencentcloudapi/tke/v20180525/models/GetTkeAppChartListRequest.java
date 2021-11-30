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

public class GetTkeAppChartListRequest extends AbstractModel{

    /**
    * app类型，取值log,scheduler,network,storage,monitor,dns,image,other,invisible
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * app支持的操作系统，取值arm32、arm64、amd64
    */
    @SerializedName("Arch")
    @Expose
    private String Arch;

    /**
    * 集群类型，取值tke、eks
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get app类型，取值log,scheduler,network,storage,monitor,dns,image,other,invisible 
     * @return Kind app类型，取值log,scheduler,network,storage,monitor,dns,image,other,invisible
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set app类型，取值log,scheduler,network,storage,monitor,dns,image,other,invisible
     * @param Kind app类型，取值log,scheduler,network,storage,monitor,dns,image,other,invisible
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get app支持的操作系统，取值arm32、arm64、amd64 
     * @return Arch app支持的操作系统，取值arm32、arm64、amd64
     */
    public String getArch() {
        return this.Arch;
    }

    /**
     * Set app支持的操作系统，取值arm32、arm64、amd64
     * @param Arch app支持的操作系统，取值arm32、arm64、amd64
     */
    public void setArch(String Arch) {
        this.Arch = Arch;
    }

    /**
     * Get 集群类型，取值tke、eks 
     * @return ClusterType 集群类型，取值tke、eks
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，取值tke、eks
     * @param ClusterType 集群类型，取值tke、eks
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public GetTkeAppChartListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTkeAppChartListRequest(GetTkeAppChartListRequest source) {
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Arch != null) {
            this.Arch = new String(source.Arch);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Arch", this.Arch);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

