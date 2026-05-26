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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubnetAllocation extends AbstractModel {

    /**
    * <p>子网 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>分配比例（百分比），所有 Ratio 之和必须等于 100</p>
    */
    @SerializedName("Ratio")
    @Expose
    private Long Ratio;

    /**
     * Get <p>子网 ID</p> 
     * @return SubnetId <p>子网 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID</p>
     * @param SubnetId <p>子网 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>分配比例（百分比），所有 Ratio 之和必须等于 100</p> 
     * @return Ratio <p>分配比例（百分比），所有 Ratio 之和必须等于 100</p>
     */
    public Long getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>分配比例（百分比），所有 Ratio 之和必须等于 100</p>
     * @param Ratio <p>分配比例（百分比），所有 Ratio 之和必须等于 100</p>
     */
    public void setRatio(Long Ratio) {
        this.Ratio = Ratio;
    }

    public SubnetAllocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubnetAllocation(SubnetAllocation source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Ratio != null) {
            this.Ratio = new Long(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

