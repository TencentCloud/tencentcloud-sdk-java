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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrAlertTargetForIgnore extends AbstractModel {

    /**
    * 告警主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 告警所属账号ID（跨账号，前端必传）
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 告警唯一标识
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * 主机UUID（可选）
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 实例ID（可选，用于白名单删除）
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 告警主键ID 
     * @return Id 告警主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 告警主键ID
     * @param Id 告警主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 告警所属账号ID（跨账号，前端必传） 
     * @return AppId 告警所属账号ID（跨账号，前端必传）
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 告警所属账号ID（跨账号，前端必传）
     * @param AppId 告警所属账号ID（跨账号，前端必传）
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 告警唯一标识 
     * @return AlertId 告警唯一标识
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set 告警唯一标识
     * @param AlertId 告警唯一标识
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get 主机UUID（可选） 
     * @return Quuid 主机UUID（可选）
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机UUID（可选）
     * @param Quuid 主机UUID（可选）
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 实例ID（可选，用于白名单删除） 
     * @return InstanceId 实例ID（可选，用于白名单删除）
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID（可选，用于白名单删除）
     * @param InstanceId 实例ID（可选，用于白名单删除）
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public EdrAlertTargetForIgnore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertTargetForIgnore(EdrAlertTargetForIgnore source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

