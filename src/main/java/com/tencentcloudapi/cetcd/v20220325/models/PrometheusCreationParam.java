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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusCreationParam extends AbstractModel {

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 保存时长，只支持天单位
12d = 12天
    */
    @SerializedName("DataRetention")
    @Expose
    private Long DataRetention;

    /**
    * grafana用户名
    */
    @SerializedName("GrafanaUserName")
    @Expose
    private String GrafanaUserName;

    /**
    * grafana密码
    */
    @SerializedName("GrafanaPassword")
    @Expose
    private String GrafanaPassword;

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 保存时长，只支持天单位
12d = 12天 
     * @return DataRetention 保存时长，只支持天单位
12d = 12天
     */
    public Long getDataRetention() {
        return this.DataRetention;
    }

    /**
     * Set 保存时长，只支持天单位
12d = 12天
     * @param DataRetention 保存时长，只支持天单位
12d = 12天
     */
    public void setDataRetention(Long DataRetention) {
        this.DataRetention = DataRetention;
    }

    /**
     * Get grafana用户名 
     * @return GrafanaUserName grafana用户名
     */
    public String getGrafanaUserName() {
        return this.GrafanaUserName;
    }

    /**
     * Set grafana用户名
     * @param GrafanaUserName grafana用户名
     */
    public void setGrafanaUserName(String GrafanaUserName) {
        this.GrafanaUserName = GrafanaUserName;
    }

    /**
     * Get grafana密码 
     * @return GrafanaPassword grafana密码
     */
    public String getGrafanaPassword() {
        return this.GrafanaPassword;
    }

    /**
     * Set grafana密码
     * @param GrafanaPassword grafana密码
     */
    public void setGrafanaPassword(String GrafanaPassword) {
        this.GrafanaPassword = GrafanaPassword;
    }

    public PrometheusCreationParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusCreationParam(PrometheusCreationParam source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DataRetention != null) {
            this.DataRetention = new Long(source.DataRetention);
        }
        if (source.GrafanaUserName != null) {
            this.GrafanaUserName = new String(source.GrafanaUserName);
        }
        if (source.GrafanaPassword != null) {
            this.GrafanaPassword = new String(source.GrafanaPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DataRetention", this.DataRetention);
        this.setParamSimple(map, prefix + "GrafanaUserName", this.GrafanaUserName);
        this.setParamSimple(map, prefix + "GrafanaPassword", this.GrafanaPassword);

    }
}

