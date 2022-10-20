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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnlinkClusterRequest extends AbstractModel{

    /**
    * 网格Id
    */
    @SerializedName("MeshId")
    @Expose
    private String MeshId;

    /**
    * 取消关联的集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 网格Id 
     * @return MeshId 网格Id
     */
    public String getMeshId() {
        return this.MeshId;
    }

    /**
     * Set 网格Id
     * @param MeshId 网格Id
     */
    public void setMeshId(String MeshId) {
        this.MeshId = MeshId;
    }

    /**
     * Get 取消关联的集群Id 
     * @return ClusterId 取消关联的集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 取消关联的集群Id
     * @param ClusterId 取消关联的集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public UnlinkClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnlinkClusterRequest(UnlinkClusterRequest source) {
        if (source.MeshId != null) {
            this.MeshId = new String(source.MeshId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MeshId", this.MeshId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

