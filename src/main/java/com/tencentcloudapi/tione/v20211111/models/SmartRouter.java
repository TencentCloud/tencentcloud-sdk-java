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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartRouter extends AbstractModel {

    /**
    * 智能路由开关状态（true=已开启，false=未开启/已停止）
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 绑定的服务组 ID（一对一）
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * 组件列表（gateway + scheduler；repeated 为未来扩展预留）
    */
    @SerializedName("ComponentList")
    @Expose
    private SmartRouterComponent [] ComponentList;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 智能路由开关状态（true=已开启，false=未开启/已停止） 
     * @return Enabled 智能路由开关状态（true=已开启，false=未开启/已停止）
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 智能路由开关状态（true=已开启，false=未开启/已停止）
     * @param Enabled 智能路由开关状态（true=已开启，false=未开启/已停止）
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 绑定的服务组 ID（一对一） 
     * @return ServiceGroupId 绑定的服务组 ID（一对一）
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 绑定的服务组 ID（一对一）
     * @param ServiceGroupId 绑定的服务组 ID（一对一）
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get 组件列表（gateway + scheduler；repeated 为未来扩展预留） 
     * @return ComponentList 组件列表（gateway + scheduler；repeated 为未来扩展预留）
     */
    public SmartRouterComponent [] getComponentList() {
        return this.ComponentList;
    }

    /**
     * Set 组件列表（gateway + scheduler；repeated 为未来扩展预留）
     * @param ComponentList 组件列表（gateway + scheduler；repeated 为未来扩展预留）
     */
    public void setComponentList(SmartRouterComponent [] ComponentList) {
        this.ComponentList = ComponentList;
    }

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SmartRouter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartRouter(SmartRouter source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.ComponentList != null) {
            this.ComponentList = new SmartRouterComponent[source.ComponentList.length];
            for (int i = 0; i < source.ComponentList.length; i++) {
                this.ComponentList[i] = new SmartRouterComponent(source.ComponentList[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamArrayObj(map, prefix + "ComponentList.", this.ComponentList);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

