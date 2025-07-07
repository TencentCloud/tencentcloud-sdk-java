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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForceSchedule extends AbstractModel {

    /**
    * -
    */
    @SerializedName("AffinityList")
    @Expose
    private Affinity [] AffinityList;

    /**
    * -
    */
    @SerializedName("AntiAffinityList")
    @Expose
    private Affinity [] AntiAffinityList;

    /**
     * Get - 
     * @return AffinityList -
     */
    public Affinity [] getAffinityList() {
        return this.AffinityList;
    }

    /**
     * Set -
     * @param AffinityList -
     */
    public void setAffinityList(Affinity [] AffinityList) {
        this.AffinityList = AffinityList;
    }

    /**
     * Get - 
     * @return AntiAffinityList -
     */
    public Affinity [] getAntiAffinityList() {
        return this.AntiAffinityList;
    }

    /**
     * Set -
     * @param AntiAffinityList -
     */
    public void setAntiAffinityList(Affinity [] AntiAffinityList) {
        this.AntiAffinityList = AntiAffinityList;
    }

    public ForceSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForceSchedule(ForceSchedule source) {
        if (source.AffinityList != null) {
            this.AffinityList = new Affinity[source.AffinityList.length];
            for (int i = 0; i < source.AffinityList.length; i++) {
                this.AffinityList[i] = new Affinity(source.AffinityList[i]);
            }
        }
        if (source.AntiAffinityList != null) {
            this.AntiAffinityList = new Affinity[source.AntiAffinityList.length];
            for (int i = 0; i < source.AntiAffinityList.length; i++) {
                this.AntiAffinityList[i] = new Affinity(source.AntiAffinityList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AffinityList.", this.AffinityList);
        this.setParamArrayObj(map, prefix + "AntiAffinityList.", this.AntiAffinityList);

    }
}

