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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceStatistics extends AbstractModel{

    /**
    * Vpc实例ID，例如：vpc-f1xjkw1b。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例ID，例如：subnet-bthucmmy。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 当前已使用的IP总数。
    */
    @SerializedName("Ip")
    @Expose
    private Long Ip;

    /**
    * 资源统计信息。
    */
    @SerializedName("ResourceStatisticsItemSet")
    @Expose
    private ResourceStatisticsItem [] ResourceStatisticsItemSet;

    /**
     * Get Vpc实例ID，例如：vpc-f1xjkw1b。 
     * @return VpcId Vpc实例ID，例如：vpc-f1xjkw1b。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc实例ID，例如：vpc-f1xjkw1b。
     * @param VpcId Vpc实例ID，例如：vpc-f1xjkw1b。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网实例ID，例如：subnet-bthucmmy。 
     * @return SubnetId 子网实例ID，例如：subnet-bthucmmy。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID，例如：subnet-bthucmmy。
     * @param SubnetId 子网实例ID，例如：subnet-bthucmmy。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 当前已使用的IP总数。 
     * @return Ip 当前已使用的IP总数。
     */
    public Long getIp() {
        return this.Ip;
    }

    /**
     * Set 当前已使用的IP总数。
     * @param Ip 当前已使用的IP总数。
     */
    public void setIp(Long Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 资源统计信息。 
     * @return ResourceStatisticsItemSet 资源统计信息。
     */
    public ResourceStatisticsItem [] getResourceStatisticsItemSet() {
        return this.ResourceStatisticsItemSet;
    }

    /**
     * Set 资源统计信息。
     * @param ResourceStatisticsItemSet 资源统计信息。
     */
    public void setResourceStatisticsItemSet(ResourceStatisticsItem [] ResourceStatisticsItemSet) {
        this.ResourceStatisticsItemSet = ResourceStatisticsItemSet;
    }

    public ResourceStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceStatistics(ResourceStatistics source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Ip != null) {
            this.Ip = new Long(source.Ip);
        }
        if (source.ResourceStatisticsItemSet != null) {
            this.ResourceStatisticsItemSet = new ResourceStatisticsItem[source.ResourceStatisticsItemSet.length];
            for (int i = 0; i < source.ResourceStatisticsItemSet.length; i++) {
                this.ResourceStatisticsItemSet[i] = new ResourceStatisticsItem(source.ResourceStatisticsItemSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamArrayObj(map, prefix + "ResourceStatisticsItemSet.", this.ResourceStatisticsItemSet);

    }
}

