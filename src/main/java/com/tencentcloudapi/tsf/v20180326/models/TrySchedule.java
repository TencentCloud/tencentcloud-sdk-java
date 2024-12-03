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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrySchedule extends AbstractModel {

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffinityList")
    @Expose
    private Affinity [] AffinityList;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AntiAffinityList")
    @Expose
    private Affinity [] AntiAffinityList;

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffinityList -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Affinity [] getAffinityList() {
        return this.AffinityList;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffinityList -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffinityList(Affinity [] AffinityList) {
        this.AffinityList = AffinityList;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AntiAffinityList -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Affinity [] getAntiAffinityList() {
        return this.AntiAffinityList;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param AntiAffinityList -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAntiAffinityList(Affinity [] AntiAffinityList) {
        this.AntiAffinityList = AntiAffinityList;
    }

    public TrySchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrySchedule(TrySchedule source) {
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

