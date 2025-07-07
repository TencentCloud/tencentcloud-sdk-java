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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApiAnalyzeStatusRequest extends AbstractModel {

    /**
    * 开关状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要批量开启的实体列表
    */
    @SerializedName("TargetList")
    @Expose
    private TargetEntity [] TargetList;

    /**
     * Get 开关状态 
     * @return Status 开关状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态
     * @param Status 开关状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要批量开启的实体列表 
     * @return TargetList 需要批量开启的实体列表
     */
    public TargetEntity [] getTargetList() {
        return this.TargetList;
    }

    /**
     * Set 需要批量开启的实体列表
     * @param TargetList 需要批量开启的实体列表
     */
    public void setTargetList(TargetEntity [] TargetList) {
        this.TargetList = TargetList;
    }

    public ModifyApiAnalyzeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiAnalyzeStatusRequest(ModifyApiAnalyzeStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TargetList != null) {
            this.TargetList = new TargetEntity[source.TargetList.length];
            for (int i = 0; i < source.TargetList.length; i++) {
                this.TargetList[i] = new TargetEntity(source.TargetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "TargetList.", this.TargetList);

    }
}

