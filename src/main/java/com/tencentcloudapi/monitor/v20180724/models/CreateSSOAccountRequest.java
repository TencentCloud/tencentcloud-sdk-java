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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSSOAccountRequest extends AbstractModel {

    /**
    * <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户账号 ID ，例如：10000000</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>权限(只取数组中的第一个，其中 Organization 暂未使用，可不填)</p>
    */
    @SerializedName("Role")
    @Expose
    private GrafanaAccountRole [] Role;

    /**
    * <p>备注</p>
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
     * Get <p>Grafana 实例 ID，例如：grafana-abcdefgh</p> 
     * @return InstanceId <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     * @param InstanceId <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户账号 ID ，例如：10000000</p> 
     * @return UserId <p>用户账号 ID ，例如：10000000</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户账号 ID ，例如：10000000</p>
     * @param UserId <p>用户账号 ID ，例如：10000000</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>权限(只取数组中的第一个，其中 Organization 暂未使用，可不填)</p> 
     * @return Role <p>权限(只取数组中的第一个，其中 Organization 暂未使用，可不填)</p>
     */
    public GrafanaAccountRole [] getRole() {
        return this.Role;
    }

    /**
     * Set <p>权限(只取数组中的第一个，其中 Organization 暂未使用，可不填)</p>
     * @param Role <p>权限(只取数组中的第一个，其中 Organization 暂未使用，可不填)</p>
     */
    public void setRole(GrafanaAccountRole [] Role) {
        this.Role = Role;
    }

    /**
     * Get <p>备注</p> 
     * @return Notes <p>备注</p>
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set <p>备注</p>
     * @param Notes <p>备注</p>
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public CreateSSOAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSSOAccountRequest(CreateSSOAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Role != null) {
            this.Role = new GrafanaAccountRole[source.Role.length];
            for (int i = 0; i < source.Role.length; i++) {
                this.Role[i] = new GrafanaAccountRole(source.Role[i]);
            }
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "Role.", this.Role);
        this.setParamSimple(map, prefix + "Notes", this.Notes);

    }
}

