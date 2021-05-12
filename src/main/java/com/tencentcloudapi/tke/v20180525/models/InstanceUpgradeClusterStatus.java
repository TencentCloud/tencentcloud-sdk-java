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

public class InstanceUpgradeClusterStatus extends AbstractModel{

    /**
    * pod总数
    */
    @SerializedName("PodTotal")
    @Expose
    private Long PodTotal;

    /**
    * NotReady pod总数
    */
    @SerializedName("NotReadyPod")
    @Expose
    private Long NotReadyPod;

    /**
     * Get pod总数 
     * @return PodTotal pod总数
     */
    public Long getPodTotal() {
        return this.PodTotal;
    }

    /**
     * Set pod总数
     * @param PodTotal pod总数
     */
    public void setPodTotal(Long PodTotal) {
        this.PodTotal = PodTotal;
    }

    /**
     * Get NotReady pod总数 
     * @return NotReadyPod NotReady pod总数
     */
    public Long getNotReadyPod() {
        return this.NotReadyPod;
    }

    /**
     * Set NotReady pod总数
     * @param NotReadyPod NotReady pod总数
     */
    public void setNotReadyPod(Long NotReadyPod) {
        this.NotReadyPod = NotReadyPod;
    }

    public InstanceUpgradeClusterStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceUpgradeClusterStatus(InstanceUpgradeClusterStatus source) {
        if (source.PodTotal != null) {
            this.PodTotal = new Long(source.PodTotal);
        }
        if (source.NotReadyPod != null) {
            this.NotReadyPod = new Long(source.NotReadyPod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodTotal", this.PodTotal);
        this.setParamSimple(map, prefix + "NotReadyPod", this.NotReadyPod);

    }
}

