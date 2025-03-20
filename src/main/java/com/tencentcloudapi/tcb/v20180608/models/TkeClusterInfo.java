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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TkeClusterInfo extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群的vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 版本内网CLB所在子网Id
    */
    @SerializedName("VersionClbSubnetId")
    @Expose
    private String VersionClbSubnetId;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群的vpcId 
     * @return VpcId 集群的vpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群的vpcId
     * @param VpcId 集群的vpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 版本内网CLB所在子网Id 
     * @return VersionClbSubnetId 版本内网CLB所在子网Id
     */
    public String getVersionClbSubnetId() {
        return this.VersionClbSubnetId;
    }

    /**
     * Set 版本内网CLB所在子网Id
     * @param VersionClbSubnetId 版本内网CLB所在子网Id
     */
    public void setVersionClbSubnetId(String VersionClbSubnetId) {
        this.VersionClbSubnetId = VersionClbSubnetId;
    }

    public TkeClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TkeClusterInfo(TkeClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VersionClbSubnetId != null) {
            this.VersionClbSubnetId = new String(source.VersionClbSubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VersionClbSubnetId", this.VersionClbSubnetId);

    }
}

