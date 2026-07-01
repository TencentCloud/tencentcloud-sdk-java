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

public class EdrAlertTarget extends AbstractModel {

    /**
    * <p>告警主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>告警所属账号ID（跨账号，前端必传）</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>告警唯一标识</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * <p>主机UUID（可选，由列表带回透传）</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>实例ID（可选，由列表带回透传，用于安全中心标签富化）</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>告警子类型</p>
    */
    @SerializedName("AlertSubType")
    @Expose
    private String AlertSubType;

    /**
     * Get <p>告警主键ID</p> 
     * @return Id <p>告警主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>告警主键ID</p>
     * @param Id <p>告警主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>告警所属账号ID（跨账号，前端必传）</p> 
     * @return AppId <p>告警所属账号ID（跨账号，前端必传）</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>告警所属账号ID（跨账号，前端必传）</p>
     * @param AppId <p>告警所属账号ID（跨账号，前端必传）</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>告警唯一标识</p> 
     * @return AlertId <p>告警唯一标识</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>告警唯一标识</p>
     * @param AlertId <p>告警唯一标识</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get <p>主机UUID（可选，由列表带回透传）</p> 
     * @return Quuid <p>主机UUID（可选，由列表带回透传）</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机UUID（可选，由列表带回透传）</p>
     * @param Quuid <p>主机UUID（可选，由列表带回透传）</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>实例ID（可选，由列表带回透传，用于安全中心标签富化）</p> 
     * @return InstanceId <p>实例ID（可选，由列表带回透传，用于安全中心标签富化）</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID（可选，由列表带回透传，用于安全中心标签富化）</p>
     * @param InstanceId <p>实例ID（可选，由列表带回透传，用于安全中心标签富化）</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>告警子类型</p> 
     * @return AlertSubType <p>告警子类型</p>
     */
    public String getAlertSubType() {
        return this.AlertSubType;
    }

    /**
     * Set <p>告警子类型</p>
     * @param AlertSubType <p>告警子类型</p>
     */
    public void setAlertSubType(String AlertSubType) {
        this.AlertSubType = AlertSubType;
    }

    public EdrAlertTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertTarget(EdrAlertTarget source) {
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
        if (source.AlertSubType != null) {
            this.AlertSubType = new String(source.AlertSubType);
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
        this.setParamSimple(map, prefix + "AlertSubType", this.AlertSubType);

    }
}

