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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MlFlowResourceConfig extends AbstractModel {

    /**
    * <p>资源 ID（规格模式必填）</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * <p>购买份数（规格模式必填，每 Pod 的规格倍数）</p>
    */
    @SerializedName("Spec")
    @Expose
    private Long Spec;

    /**
    * <p>pod CPU 核数（手动模式必填，单 Pod 粒度）</p>
    */
    @SerializedName("PodCpu")
    @Expose
    private Long PodCpu;

    /**
    * <p>pod 内存大小 GB（手动模式必填，单 Pod 粒度）</p>
    */
    @SerializedName("PodMem")
    @Expose
    private Long PodMem;

    /**
     * Get <p>资源 ID（规格模式必填）</p> 
     * @return BillingItem <p>资源 ID（规格模式必填）</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>资源 ID（规格模式必填）</p>
     * @param BillingItem <p>资源 ID（规格模式必填）</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get <p>购买份数（规格模式必填，每 Pod 的规格倍数）</p> 
     * @return Spec <p>购买份数（规格模式必填，每 Pod 的规格倍数）</p>
     */
    public Long getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>购买份数（规格模式必填，每 Pod 的规格倍数）</p>
     * @param Spec <p>购买份数（规格模式必填，每 Pod 的规格倍数）</p>
     */
    public void setSpec(Long Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>pod CPU 核数（手动模式必填，单 Pod 粒度）</p> 
     * @return PodCpu <p>pod CPU 核数（手动模式必填，单 Pod 粒度）</p>
     */
    public Long getPodCpu() {
        return this.PodCpu;
    }

    /**
     * Set <p>pod CPU 核数（手动模式必填，单 Pod 粒度）</p>
     * @param PodCpu <p>pod CPU 核数（手动模式必填，单 Pod 粒度）</p>
     */
    public void setPodCpu(Long PodCpu) {
        this.PodCpu = PodCpu;
    }

    /**
     * Get <p>pod 内存大小 GB（手动模式必填，单 Pod 粒度）</p> 
     * @return PodMem <p>pod 内存大小 GB（手动模式必填，单 Pod 粒度）</p>
     */
    public Long getPodMem() {
        return this.PodMem;
    }

    /**
     * Set <p>pod 内存大小 GB（手动模式必填，单 Pod 粒度）</p>
     * @param PodMem <p>pod 内存大小 GB（手动模式必填，单 Pod 粒度）</p>
     */
    public void setPodMem(Long PodMem) {
        this.PodMem = PodMem;
    }

    public MlFlowResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MlFlowResourceConfig(MlFlowResourceConfig source) {
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.Spec != null) {
            this.Spec = new Long(source.Spec);
        }
        if (source.PodCpu != null) {
            this.PodCpu = new Long(source.PodCpu);
        }
        if (source.PodMem != null) {
            this.PodMem = new Long(source.PodMem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "PodCpu", this.PodCpu);
        this.setParamSimple(map, prefix + "PodMem", this.PodMem);

    }
}

