/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPodNumRequest extends AbstractModel {

    /**
    * 集群Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务编号
    */
    @SerializedName("ServiceGroup")
    @Expose
    private Long ServiceGroup;

    /**
    * 角色编号
    */
    @SerializedName("ServiceType")
    @Expose
    private Long ServiceType;

    /**
    * 期望Pod数量
    */
    @SerializedName("PodNum")
    @Expose
    private Long PodNum;

    /**
     * Get 集群Id 
     * @return InstanceId 集群Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群Id
     * @param InstanceId 集群Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务编号 
     * @return ServiceGroup 服务编号
     */
    public Long getServiceGroup() {
        return this.ServiceGroup;
    }

    /**
     * Set 服务编号
     * @param ServiceGroup 服务编号
     */
    public void setServiceGroup(Long ServiceGroup) {
        this.ServiceGroup = ServiceGroup;
    }

    /**
     * Get 角色编号 
     * @return ServiceType 角色编号
     */
    public Long getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 角色编号
     * @param ServiceType 角色编号
     */
    public void setServiceType(Long ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 期望Pod数量 
     * @return PodNum 期望Pod数量
     */
    public Long getPodNum() {
        return this.PodNum;
    }

    /**
     * Set 期望Pod数量
     * @param PodNum 期望Pod数量
     */
    public void setPodNum(Long PodNum) {
        this.PodNum = PodNum;
    }

    public ModifyPodNumRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPodNumRequest(ModifyPodNumRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceGroup != null) {
            this.ServiceGroup = new Long(source.ServiceGroup);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new Long(source.ServiceType);
        }
        if (source.PodNum != null) {
            this.PodNum = new Long(source.PodNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceGroup", this.ServiceGroup);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "PodNum", this.PodNum);

    }
}

