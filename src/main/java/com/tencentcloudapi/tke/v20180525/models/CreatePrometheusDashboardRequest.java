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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrometheusDashboardRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 面板组名称
    */
    @SerializedName("DashboardName")
    @Expose
    private String DashboardName;

    /**
    * 面板列表
每一项是一个grafana dashboard的json定义
    */
    @SerializedName("Contents")
    @Expose
    private String [] Contents;

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
     * Get 面板组名称 
     * @return DashboardName 面板组名称
     */
    public String getDashboardName() {
        return this.DashboardName;
    }

    /**
     * Set 面板组名称
     * @param DashboardName 面板组名称
     */
    public void setDashboardName(String DashboardName) {
        this.DashboardName = DashboardName;
    }

    /**
     * Get 面板列表
每一项是一个grafana dashboard的json定义 
     * @return Contents 面板列表
每一项是一个grafana dashboard的json定义
     */
    public String [] getContents() {
        return this.Contents;
    }

    /**
     * Set 面板列表
每一项是一个grafana dashboard的json定义
     * @param Contents 面板列表
每一项是一个grafana dashboard的json定义
     */
    public void setContents(String [] Contents) {
        this.Contents = Contents;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DashboardName", this.DashboardName);
        this.setParamArraySimple(map, prefix + "Contents.", this.Contents);

    }
}

