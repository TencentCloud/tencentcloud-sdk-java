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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel {

    /**
    * <p>按月购买时长（1～100）月</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>续费标记（0:用户未设置，1:自动续费 2:不自动续费）</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
     * Get <p>按月购买时长（1～100）月</p> 
     * @return Period <p>按月购买时长（1～100）月</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>按月购买时长（1～100）月</p>
     * @param Period <p>按月购买时长（1～100）月</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>续费标记（0:用户未设置，1:自动续费 2:不自动续费）</p> 
     * @return RenewFlag <p>续费标记（0:用户未设置，1:自动续费 2:不自动续费）</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标记（0:用户未设置，1:自动续费 2:不自动续费）</p>
     * @param RenewFlag <p>续费标记（0:用户未设置，1:自动续费 2:不自动续费）</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public InstanceChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceChargePrepaid(InstanceChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

