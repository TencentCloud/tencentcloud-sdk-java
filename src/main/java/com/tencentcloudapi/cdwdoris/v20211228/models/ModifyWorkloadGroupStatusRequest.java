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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWorkloadGroupStatusRequest extends AbstractModel {

    /**
    * <p>集群id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否开启资源组：open-开启、close-关闭</p>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * <p>rolling_restart滚动\restart立即，存算分离开通时的Pod重建方式，默认滚动</p>
    */
    @SerializedName("RestartType")
    @Expose
    private String RestartType;

    /**
     * Get <p>集群id</p> 
     * @return InstanceId <p>集群id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群id</p>
     * @param InstanceId <p>集群id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否开启资源组：open-开启、close-关闭</p> 
     * @return OperationType <p>是否开启资源组：open-开启、close-关闭</p>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>是否开启资源组：open-开启、close-关闭</p>
     * @param OperationType <p>是否开启资源组：open-开启、close-关闭</p>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get <p>rolling_restart滚动\restart立即，存算分离开通时的Pod重建方式，默认滚动</p> 
     * @return RestartType <p>rolling_restart滚动\restart立即，存算分离开通时的Pod重建方式，默认滚动</p>
     */
    public String getRestartType() {
        return this.RestartType;
    }

    /**
     * Set <p>rolling_restart滚动\restart立即，存算分离开通时的Pod重建方式，默认滚动</p>
     * @param RestartType <p>rolling_restart滚动\restart立即，存算分离开通时的Pod重建方式，默认滚动</p>
     */
    public void setRestartType(String RestartType) {
        this.RestartType = RestartType;
    }

    public ModifyWorkloadGroupStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkloadGroupStatusRequest(ModifyWorkloadGroupStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.RestartType != null) {
            this.RestartType = new String(source.RestartType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "RestartType", this.RestartType);

    }
}

