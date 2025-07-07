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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakFamilyInfo extends AbstractModel {

    /**
    * 机型类别信息。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private InstanceFamilyTypeConfig InstanceFamily;

    /**
    * 基础数据峰值信息。
    */
    @SerializedName("PeakBaseSet")
    @Expose
    private PeakBase [] PeakBaseSet;

    /**
     * Get 机型类别信息。 
     * @return InstanceFamily 机型类别信息。
     */
    public InstanceFamilyTypeConfig getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 机型类别信息。
     * @param InstanceFamily 机型类别信息。
     */
    public void setInstanceFamily(InstanceFamilyTypeConfig InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 基础数据峰值信息。 
     * @return PeakBaseSet 基础数据峰值信息。
     */
    public PeakBase [] getPeakBaseSet() {
        return this.PeakBaseSet;
    }

    /**
     * Set 基础数据峰值信息。
     * @param PeakBaseSet 基础数据峰值信息。
     */
    public void setPeakBaseSet(PeakBase [] PeakBaseSet) {
        this.PeakBaseSet = PeakBaseSet;
    }

    public PeakFamilyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakFamilyInfo(PeakFamilyInfo source) {
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new InstanceFamilyTypeConfig(source.InstanceFamily);
        }
        if (source.PeakBaseSet != null) {
            this.PeakBaseSet = new PeakBase[source.PeakBaseSet.length];
            for (int i = 0; i < source.PeakBaseSet.length; i++) {
                this.PeakBaseSet[i] = new PeakBase(source.PeakBaseSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceFamily.", this.InstanceFamily);
        this.setParamArrayObj(map, prefix + "PeakBaseSet.", this.PeakBaseSet);

    }
}

