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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCheckModeRequest extends AbstractModel{

    /**
    * 要设置的集群ID列表
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 集群检查模式(正常模式"Cluster_Normal"、主动模式"Cluster_Actived"、不设置"Cluster_Unset")
    */
    @SerializedName("ClusterCheckMode")
    @Expose
    private String ClusterCheckMode;

    /**
    * 0不设置 1打开 2关闭
    */
    @SerializedName("ClusterAutoCheck")
    @Expose
    private Long ClusterAutoCheck;

    /**
     * Get 要设置的集群ID列表 
     * @return ClusterIds 要设置的集群ID列表
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 要设置的集群ID列表
     * @param ClusterIds 要设置的集群ID列表
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 集群检查模式(正常模式"Cluster_Normal"、主动模式"Cluster_Actived"、不设置"Cluster_Unset") 
     * @return ClusterCheckMode 集群检查模式(正常模式"Cluster_Normal"、主动模式"Cluster_Actived"、不设置"Cluster_Unset")
     */
    public String getClusterCheckMode() {
        return this.ClusterCheckMode;
    }

    /**
     * Set 集群检查模式(正常模式"Cluster_Normal"、主动模式"Cluster_Actived"、不设置"Cluster_Unset")
     * @param ClusterCheckMode 集群检查模式(正常模式"Cluster_Normal"、主动模式"Cluster_Actived"、不设置"Cluster_Unset")
     */
    public void setClusterCheckMode(String ClusterCheckMode) {
        this.ClusterCheckMode = ClusterCheckMode;
    }

    /**
     * Get 0不设置 1打开 2关闭 
     * @return ClusterAutoCheck 0不设置 1打开 2关闭
     */
    public Long getClusterAutoCheck() {
        return this.ClusterAutoCheck;
    }

    /**
     * Set 0不设置 1打开 2关闭
     * @param ClusterAutoCheck 0不设置 1打开 2关闭
     */
    public void setClusterAutoCheck(Long ClusterAutoCheck) {
        this.ClusterAutoCheck = ClusterAutoCheck;
    }

    public SetCheckModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetCheckModeRequest(SetCheckModeRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.ClusterCheckMode != null) {
            this.ClusterCheckMode = new String(source.ClusterCheckMode);
        }
        if (source.ClusterAutoCheck != null) {
            this.ClusterAutoCheck = new Long(source.ClusterAutoCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "ClusterCheckMode", this.ClusterCheckMode);
        this.setParamSimple(map, prefix + "ClusterAutoCheck", this.ClusterAutoCheck);

    }
}

