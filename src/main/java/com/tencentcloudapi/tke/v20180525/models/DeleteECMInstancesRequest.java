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

public class DeleteECMInstancesRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * ecm id集合
    */
    @SerializedName("EcmIdSet")
    @Expose
    private String [] EcmIdSet;

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get ecm id集合 
     * @return EcmIdSet ecm id集合
     */
    public String [] getEcmIdSet() {
        return this.EcmIdSet;
    }

    /**
     * Set ecm id集合
     * @param EcmIdSet ecm id集合
     */
    public void setEcmIdSet(String [] EcmIdSet) {
        this.EcmIdSet = EcmIdSet;
    }

    public DeleteECMInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteECMInstancesRequest(DeleteECMInstancesRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.EcmIdSet != null) {
            this.EcmIdSet = new String[source.EcmIdSet.length];
            for (int i = 0; i < source.EcmIdSet.length; i++) {
                this.EcmIdSet[i] = new String(source.EcmIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamArraySimple(map, prefix + "EcmIdSet.", this.EcmIdSet);

    }
}

