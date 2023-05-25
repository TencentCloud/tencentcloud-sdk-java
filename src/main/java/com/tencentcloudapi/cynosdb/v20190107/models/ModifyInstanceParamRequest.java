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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 集群参数列表
    */
    @SerializedName("ClusterParamList")
    @Expose
    private ModifyParamItem [] ClusterParamList;

    /**
    * 实例参数列表
    */
    @SerializedName("InstanceParamList")
    @Expose
    private ModifyParamItem [] InstanceParamList;

    /**
    * yes：在运维时间窗内修改，no：立即执行（默认值）
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

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
     * Get 实例ID 
     * @return InstanceIds 实例ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID
     * @param InstanceIds 实例ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 集群参数列表 
     * @return ClusterParamList 集群参数列表
     */
    public ModifyParamItem [] getClusterParamList() {
        return this.ClusterParamList;
    }

    /**
     * Set 集群参数列表
     * @param ClusterParamList 集群参数列表
     */
    public void setClusterParamList(ModifyParamItem [] ClusterParamList) {
        this.ClusterParamList = ClusterParamList;
    }

    /**
     * Get 实例参数列表 
     * @return InstanceParamList 实例参数列表
     */
    public ModifyParamItem [] getInstanceParamList() {
        return this.InstanceParamList;
    }

    /**
     * Set 实例参数列表
     * @param InstanceParamList 实例参数列表
     */
    public void setInstanceParamList(ModifyParamItem [] InstanceParamList) {
        this.InstanceParamList = InstanceParamList;
    }

    /**
     * Get yes：在运维时间窗内修改，no：立即执行（默认值） 
     * @return IsInMaintainPeriod yes：在运维时间窗内修改，no：立即执行（默认值）
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set yes：在运维时间窗内修改，no：立即执行（默认值）
     * @param IsInMaintainPeriod yes：在运维时间窗内修改，no：立即执行（默认值）
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    public ModifyInstanceParamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamRequest(ModifyInstanceParamRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ClusterParamList != null) {
            this.ClusterParamList = new ModifyParamItem[source.ClusterParamList.length];
            for (int i = 0; i < source.ClusterParamList.length; i++) {
                this.ClusterParamList[i] = new ModifyParamItem(source.ClusterParamList[i]);
            }
        }
        if (source.InstanceParamList != null) {
            this.InstanceParamList = new ModifyParamItem[source.InstanceParamList.length];
            for (int i = 0; i < source.InstanceParamList.length; i++) {
                this.InstanceParamList[i] = new ModifyParamItem(source.InstanceParamList[i]);
            }
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ClusterParamList.", this.ClusterParamList);
        this.setParamArrayObj(map, prefix + "InstanceParamList.", this.InstanceParamList);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);

    }
}

