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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExclusiveHSM extends AbstractModel {

    /**
    * 独享集群Id
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * 独享集群名称
    */
    @SerializedName("HsmClusterName")
    @Expose
    private String HsmClusterName;

    /**
     * Get 独享集群Id 
     * @return HsmClusterId 独享集群Id
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set 独享集群Id
     * @param HsmClusterId 独享集群Id
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get 独享集群名称 
     * @return HsmClusterName 独享集群名称
     */
    public String getHsmClusterName() {
        return this.HsmClusterName;
    }

    /**
     * Set 独享集群名称
     * @param HsmClusterName 独享集群名称
     */
    public void setHsmClusterName(String HsmClusterName) {
        this.HsmClusterName = HsmClusterName;
    }

    public ExclusiveHSM() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExclusiveHSM(ExclusiveHSM source) {
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.HsmClusterName != null) {
            this.HsmClusterName = new String(source.HsmClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "HsmClusterName", this.HsmClusterName);

    }
}

