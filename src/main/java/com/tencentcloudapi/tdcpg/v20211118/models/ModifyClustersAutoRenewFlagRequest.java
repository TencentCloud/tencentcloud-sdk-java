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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClustersAutoRenewFlagRequest extends AbstractModel{

    /**
    * 集群ID列表
    */
    @SerializedName("ClusterIdSet")
    @Expose
    private String [] ClusterIdSet;

    /**
    * 是否自动续费，0-不 1-是。默认为0，只有当集群的PayMode为PREPAID时生效。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get 集群ID列表 
     * @return ClusterIdSet 集群ID列表
     */
    public String [] getClusterIdSet() {
        return this.ClusterIdSet;
    }

    /**
     * Set 集群ID列表
     * @param ClusterIdSet 集群ID列表
     */
    public void setClusterIdSet(String [] ClusterIdSet) {
        this.ClusterIdSet = ClusterIdSet;
    }

    /**
     * Get 是否自动续费，0-不 1-是。默认为0，只有当集群的PayMode为PREPAID时生效。 
     * @return AutoRenewFlag 是否自动续费，0-不 1-是。默认为0，只有当集群的PayMode为PREPAID时生效。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费，0-不 1-是。默认为0，只有当集群的PayMode为PREPAID时生效。
     * @param AutoRenewFlag 是否自动续费，0-不 1-是。默认为0，只有当集群的PayMode为PREPAID时生效。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public ModifyClustersAutoRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClustersAutoRenewFlagRequest(ModifyClustersAutoRenewFlagRequest source) {
        if (source.ClusterIdSet != null) {
            this.ClusterIdSet = new String[source.ClusterIdSet.length];
            for (int i = 0; i < source.ClusterIdSet.length; i++) {
                this.ClusterIdSet[i] = new String(source.ClusterIdSet[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIdSet.", this.ClusterIdSet);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

