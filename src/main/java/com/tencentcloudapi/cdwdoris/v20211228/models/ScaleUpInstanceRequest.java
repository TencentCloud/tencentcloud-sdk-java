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

public class ScaleUpInstanceRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点规格
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 角色（MASTER/CORE），MASTER 对应 FE，CORE对应BE
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 前端鉴权使用，后端API调用传false，传true不会执行变配
    */
    @SerializedName("CheckAuth")
    @Expose
    private Boolean CheckAuth;

    /**
    * 是否滚动重启
    */
    @SerializedName("RollingRestart")
    @Expose
    private Boolean RollingRestart;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点规格 
     * @return SpecName 节点规格
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 节点规格
     * @param SpecName 节点规格
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 角色（MASTER/CORE），MASTER 对应 FE，CORE对应BE 
     * @return Type 角色（MASTER/CORE），MASTER 对应 FE，CORE对应BE
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 角色（MASTER/CORE），MASTER 对应 FE，CORE对应BE
     * @param Type 角色（MASTER/CORE），MASTER 对应 FE，CORE对应BE
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 前端鉴权使用，后端API调用传false，传true不会执行变配 
     * @return CheckAuth 前端鉴权使用，后端API调用传false，传true不会执行变配
     */
    public Boolean getCheckAuth() {
        return this.CheckAuth;
    }

    /**
     * Set 前端鉴权使用，后端API调用传false，传true不会执行变配
     * @param CheckAuth 前端鉴权使用，后端API调用传false，传true不会执行变配
     */
    public void setCheckAuth(Boolean CheckAuth) {
        this.CheckAuth = CheckAuth;
    }

    /**
     * Get 是否滚动重启 
     * @return RollingRestart 是否滚动重启
     */
    public Boolean getRollingRestart() {
        return this.RollingRestart;
    }

    /**
     * Set 是否滚动重启
     * @param RollingRestart 是否滚动重启
     */
    public void setRollingRestart(Boolean RollingRestart) {
        this.RollingRestart = RollingRestart;
    }

    public ScaleUpInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleUpInstanceRequest(ScaleUpInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CheckAuth != null) {
            this.CheckAuth = new Boolean(source.CheckAuth);
        }
        if (source.RollingRestart != null) {
            this.RollingRestart = new Boolean(source.RollingRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CheckAuth", this.CheckAuth);
        this.setParamSimple(map, prefix + "RollingRestart", this.RollingRestart);

    }
}

