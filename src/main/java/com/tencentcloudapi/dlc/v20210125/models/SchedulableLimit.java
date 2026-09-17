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

public class SchedulableLimit extends AbstractModel {

    /**
    * <p>四层计费项，与 ResourceQuota[].ResourceSpec.BillingItem 同值</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * <p>该计费项下单 worker/executor 可申请的最大可调度资源量，单位随计费项资源类型：CPU 计费项为 CU 数，GPU 计费项为 GU（卡）数</p>
    */
    @SerializedName("MaxSchedulableUnits")
    @Expose
    private Long MaxSchedulableUnits;

    /**
     * Get <p>四层计费项，与 ResourceQuota[].ResourceSpec.BillingItem 同值</p> 
     * @return BillingItem <p>四层计费项，与 ResourceQuota[].ResourceSpec.BillingItem 同值</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>四层计费项，与 ResourceQuota[].ResourceSpec.BillingItem 同值</p>
     * @param BillingItem <p>四层计费项，与 ResourceQuota[].ResourceSpec.BillingItem 同值</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get <p>该计费项下单 worker/executor 可申请的最大可调度资源量，单位随计费项资源类型：CPU 计费项为 CU 数，GPU 计费项为 GU（卡）数</p> 
     * @return MaxSchedulableUnits <p>该计费项下单 worker/executor 可申请的最大可调度资源量，单位随计费项资源类型：CPU 计费项为 CU 数，GPU 计费项为 GU（卡）数</p>
     */
    public Long getMaxSchedulableUnits() {
        return this.MaxSchedulableUnits;
    }

    /**
     * Set <p>该计费项下单 worker/executor 可申请的最大可调度资源量，单位随计费项资源类型：CPU 计费项为 CU 数，GPU 计费项为 GU（卡）数</p>
     * @param MaxSchedulableUnits <p>该计费项下单 worker/executor 可申请的最大可调度资源量，单位随计费项资源类型：CPU 计费项为 CU 数，GPU 计费项为 GU（卡）数</p>
     */
    public void setMaxSchedulableUnits(Long MaxSchedulableUnits) {
        this.MaxSchedulableUnits = MaxSchedulableUnits;
    }

    public SchedulableLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulableLimit(SchedulableLimit source) {
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.MaxSchedulableUnits != null) {
            this.MaxSchedulableUnits = new Long(source.MaxSchedulableUnits);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "MaxSchedulableUnits", this.MaxSchedulableUnits);

    }
}

