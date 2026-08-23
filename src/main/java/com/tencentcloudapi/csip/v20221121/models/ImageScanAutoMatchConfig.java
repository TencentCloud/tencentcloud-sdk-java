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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageScanAutoMatchConfig extends AbstractModel {

    /**
    * <p>匹配方式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>RUNNING_CONTAINER： 容器集群上运行的镜像</li><li>LATEST_VERSION： 最新版本镜像</li><li>LOCAL_HOST： 主机节点上运行的镜像</li></ul>
    */
    @SerializedName("Modes")
    @Expose
    private String [] Modes;

    /**
    * <p>集群id</p>
    */
    @SerializedName("Clusters")
    @Expose
    private String [] Clusters;

    /**
     * Get <p>匹配方式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>RUNNING_CONTAINER： 容器集群上运行的镜像</li><li>LATEST_VERSION： 最新版本镜像</li><li>LOCAL_HOST： 主机节点上运行的镜像</li></ul> 
     * @return Modes <p>匹配方式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>RUNNING_CONTAINER： 容器集群上运行的镜像</li><li>LATEST_VERSION： 最新版本镜像</li><li>LOCAL_HOST： 主机节点上运行的镜像</li></ul>
     */
    public String [] getModes() {
        return this.Modes;
    }

    /**
     * Set <p>匹配方式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>RUNNING_CONTAINER： 容器集群上运行的镜像</li><li>LATEST_VERSION： 最新版本镜像</li><li>LOCAL_HOST： 主机节点上运行的镜像</li></ul>
     * @param Modes <p>匹配方式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>RUNNING_CONTAINER： 容器集群上运行的镜像</li><li>LATEST_VERSION： 最新版本镜像</li><li>LOCAL_HOST： 主机节点上运行的镜像</li></ul>
     */
    public void setModes(String [] Modes) {
        this.Modes = Modes;
    }

    /**
     * Get <p>集群id</p> 
     * @return Clusters <p>集群id</p>
     */
    public String [] getClusters() {
        return this.Clusters;
    }

    /**
     * Set <p>集群id</p>
     * @param Clusters <p>集群id</p>
     */
    public void setClusters(String [] Clusters) {
        this.Clusters = Clusters;
    }

    public ImageScanAutoMatchConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScanAutoMatchConfig(ImageScanAutoMatchConfig source) {
        if (source.Modes != null) {
            this.Modes = new String[source.Modes.length];
            for (int i = 0; i < source.Modes.length; i++) {
                this.Modes[i] = new String(source.Modes[i]);
            }
        }
        if (source.Clusters != null) {
            this.Clusters = new String[source.Clusters.length];
            for (int i = 0; i < source.Clusters.length; i++) {
                this.Clusters[i] = new String(source.Clusters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Modes.", this.Modes);
        this.setParamArraySimple(map, prefix + "Clusters.", this.Clusters);

    }
}

