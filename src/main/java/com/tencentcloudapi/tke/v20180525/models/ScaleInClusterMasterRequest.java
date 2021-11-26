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

public class ScaleInClusterMasterRequest extends AbstractModel{

    /**
    * 集群实例ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * master缩容选项
    */
    @SerializedName("ScaleInMasters")
    @Expose
    private ScaleInMaster [] ScaleInMasters;

    /**
     * Get 集群实例ID 
     * @return ClusterId 集群实例ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群实例ID
     * @param ClusterId 集群实例ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get master缩容选项 
     * @return ScaleInMasters master缩容选项
     */
    public ScaleInMaster [] getScaleInMasters() {
        return this.ScaleInMasters;
    }

    /**
     * Set master缩容选项
     * @param ScaleInMasters master缩容选项
     */
    public void setScaleInMasters(ScaleInMaster [] ScaleInMasters) {
        this.ScaleInMasters = ScaleInMasters;
    }

    public ScaleInClusterMasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleInClusterMasterRequest(ScaleInClusterMasterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ScaleInMasters != null) {
            this.ScaleInMasters = new ScaleInMaster[source.ScaleInMasters.length];
            for (int i = 0; i < source.ScaleInMasters.length; i++) {
                this.ScaleInMasters[i] = new ScaleInMaster(source.ScaleInMasters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ScaleInMasters.", this.ScaleInMasters);

    }
}

