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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAppResourceItem extends AbstractModel {

    /**
    * <p>服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>服务部署版本</p>
    */
    @SerializedName("DeployedRef")
    @Expose
    private String DeployedRef;

    /**
    * <p>服务动作</p>
    */
    @SerializedName("DiffCategory")
    @Expose
    private String DiffCategory;

    /**
    * <p>服务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>服务名称</p> 
     * @return ServiceName <p>服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名称</p>
     * @param ServiceName <p>服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul> 
     * @return ServiceType <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul>
     * @param ServiceType <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>服务部署版本</p> 
     * @return DeployedRef <p>服务部署版本</p>
     */
    public String getDeployedRef() {
        return this.DeployedRef;
    }

    /**
     * Set <p>服务部署版本</p>
     * @param DeployedRef <p>服务部署版本</p>
     */
    public void setDeployedRef(String DeployedRef) {
        this.DeployedRef = DeployedRef;
    }

    /**
     * Get <p>服务动作</p> 
     * @return DiffCategory <p>服务动作</p>
     */
    public String getDiffCategory() {
        return this.DiffCategory;
    }

    /**
     * Set <p>服务动作</p>
     * @param DiffCategory <p>服务动作</p>
     */
    public void setDiffCategory(String DiffCategory) {
        this.DiffCategory = DiffCategory;
    }

    /**
     * Get <p>服务状态</p> 
     * @return Status <p>服务状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>服务状态</p>
     * @param Status <p>服务状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CloudAppResourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAppResourceItem(CloudAppResourceItem source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.DeployedRef != null) {
            this.DeployedRef = new String(source.DeployedRef);
        }
        if (source.DiffCategory != null) {
            this.DiffCategory = new String(source.DiffCategory);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "DeployedRef", this.DeployedRef);
        this.setParamSimple(map, prefix + "DiffCategory", this.DiffCategory);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

