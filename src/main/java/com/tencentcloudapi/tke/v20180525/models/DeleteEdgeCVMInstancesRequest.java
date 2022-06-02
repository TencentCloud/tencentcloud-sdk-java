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

public class DeleteEdgeCVMInstancesRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * cvm id集合
    */
    @SerializedName("CvmIdSet")
    @Expose
    private String [] CvmIdSet;

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
     * Get cvm id集合 
     * @return CvmIdSet cvm id集合
     */
    public String [] getCvmIdSet() {
        return this.CvmIdSet;
    }

    /**
     * Set cvm id集合
     * @param CvmIdSet cvm id集合
     */
    public void setCvmIdSet(String [] CvmIdSet) {
        this.CvmIdSet = CvmIdSet;
    }

    public DeleteEdgeCVMInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEdgeCVMInstancesRequest(DeleteEdgeCVMInstancesRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.CvmIdSet != null) {
            this.CvmIdSet = new String[source.CvmIdSet.length];
            for (int i = 0; i < source.CvmIdSet.length; i++) {
                this.CvmIdSet[i] = new String(source.CvmIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamArraySimple(map, prefix + "CvmIdSet.", this.CvmIdSet);

    }
}

