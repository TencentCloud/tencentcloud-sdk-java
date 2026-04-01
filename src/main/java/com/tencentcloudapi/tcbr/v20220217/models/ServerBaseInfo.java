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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerBaseInfo extends AbstractModel {

    /**
    * <p>服务名</p>
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * <p>默认服务域名</p>
    */
    @SerializedName("DefaultDomainName")
    @Expose
    private String DefaultDomainName;

    /**
    * <p>自定义域名</p>
    */
    @SerializedName("CustomDomainName")
    @Expose
    private String CustomDomainName;

    /**
    * <p>服务状态：creating/create_failed/freezing/freeze_fail/froze/unfreezing/unfreeze_fail/normal/deleting/delete_failed/abnormal</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>create_failed： 创建失败</li><li>freezing： 冻结中</li><li>freeze_fail： 冻结失败</li><li>froze： 已冻结</li><li>unfreezing： 解冻中</li><li>unfreeze_fail： 解冻失败</li><li>normal： 正常</li><li>deleting： 删除中</li><li>delete_failed： 删除失败</li><li>abnormal： 服务异常</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>公网访问类型</p>
    */
    @SerializedName("AccessTypes")
    @Expose
    private String [] AccessTypes;

    /**
    * <p>展示自定义域名</p>
    */
    @SerializedName("CustomDomainNames")
    @Expose
    private String [] CustomDomainNames;

    /**
    * <p>服务类型: function 云函数2.0；container 容器服务</p>
    */
    @SerializedName("ServerType")
    @Expose
    private String ServerType;

    /**
    * <p>流量类型，目前只有 FLOW</p>
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>服务名</p> 
     * @return ServerName <p>服务名</p>
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set <p>服务名</p>
     * @param ServerName <p>服务名</p>
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get <p>默认服务域名</p> 
     * @return DefaultDomainName <p>默认服务域名</p>
     */
    public String getDefaultDomainName() {
        return this.DefaultDomainName;
    }

    /**
     * Set <p>默认服务域名</p>
     * @param DefaultDomainName <p>默认服务域名</p>
     */
    public void setDefaultDomainName(String DefaultDomainName) {
        this.DefaultDomainName = DefaultDomainName;
    }

    /**
     * Get <p>自定义域名</p> 
     * @return CustomDomainName <p>自定义域名</p>
     */
    public String getCustomDomainName() {
        return this.CustomDomainName;
    }

    /**
     * Set <p>自定义域名</p>
     * @param CustomDomainName <p>自定义域名</p>
     */
    public void setCustomDomainName(String CustomDomainName) {
        this.CustomDomainName = CustomDomainName;
    }

    /**
     * Get <p>服务状态：creating/create_failed/freezing/freeze_fail/froze/unfreezing/unfreeze_fail/normal/deleting/delete_failed/abnormal</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>create_failed： 创建失败</li><li>freezing： 冻结中</li><li>freeze_fail： 冻结失败</li><li>froze： 已冻结</li><li>unfreezing： 解冻中</li><li>unfreeze_fail： 解冻失败</li><li>normal： 正常</li><li>deleting： 删除中</li><li>delete_failed： 删除失败</li><li>abnormal： 服务异常</li></ul> 
     * @return Status <p>服务状态：creating/create_failed/freezing/freeze_fail/froze/unfreezing/unfreeze_fail/normal/deleting/delete_failed/abnormal</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>create_failed： 创建失败</li><li>freezing： 冻结中</li><li>freeze_fail： 冻结失败</li><li>froze： 已冻结</li><li>unfreezing： 解冻中</li><li>unfreeze_fail： 解冻失败</li><li>normal： 正常</li><li>deleting： 删除中</li><li>delete_failed： 删除失败</li><li>abnormal： 服务异常</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>服务状态：creating/create_failed/freezing/freeze_fail/froze/unfreezing/unfreeze_fail/normal/deleting/delete_failed/abnormal</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>create_failed： 创建失败</li><li>freezing： 冻结中</li><li>freeze_fail： 冻结失败</li><li>froze： 已冻结</li><li>unfreezing： 解冻中</li><li>unfreeze_fail： 解冻失败</li><li>normal： 正常</li><li>deleting： 删除中</li><li>delete_failed： 删除失败</li><li>abnormal： 服务异常</li></ul>
     * @param Status <p>服务状态：creating/create_failed/freezing/freeze_fail/froze/unfreezing/unfreeze_fail/normal/deleting/delete_failed/abnormal</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>create_failed： 创建失败</li><li>freezing： 冻结中</li><li>freeze_fail： 冻结失败</li><li>froze： 已冻结</li><li>unfreezing： 解冻中</li><li>unfreeze_fail： 解冻失败</li><li>normal： 正常</li><li>deleting： 删除中</li><li>delete_failed： 删除失败</li><li>abnormal： 服务异常</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>公网访问类型</p> 
     * @return AccessTypes <p>公网访问类型</p>
     */
    public String [] getAccessTypes() {
        return this.AccessTypes;
    }

    /**
     * Set <p>公网访问类型</p>
     * @param AccessTypes <p>公网访问类型</p>
     */
    public void setAccessTypes(String [] AccessTypes) {
        this.AccessTypes = AccessTypes;
    }

    /**
     * Get <p>展示自定义域名</p> 
     * @return CustomDomainNames <p>展示自定义域名</p>
     */
    public String [] getCustomDomainNames() {
        return this.CustomDomainNames;
    }

    /**
     * Set <p>展示自定义域名</p>
     * @param CustomDomainNames <p>展示自定义域名</p>
     */
    public void setCustomDomainNames(String [] CustomDomainNames) {
        this.CustomDomainNames = CustomDomainNames;
    }

    /**
     * Get <p>服务类型: function 云函数2.0；container 容器服务</p> 
     * @return ServerType <p>服务类型: function 云函数2.0；container 容器服务</p>
     */
    public String getServerType() {
        return this.ServerType;
    }

    /**
     * Set <p>服务类型: function 云函数2.0；container 容器服务</p>
     * @param ServerType <p>服务类型: function 云函数2.0；container 容器服务</p>
     */
    public void setServerType(String ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get <p>流量类型，目前只有 FLOW</p> 
     * @return TrafficType <p>流量类型，目前只有 FLOW</p>
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set <p>流量类型，目前只有 FLOW</p>
     * @param TrafficType <p>流量类型，目前只有 FLOW</p>
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ServerBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerBaseInfo(ServerBaseInfo source) {
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.DefaultDomainName != null) {
            this.DefaultDomainName = new String(source.DefaultDomainName);
        }
        if (source.CustomDomainName != null) {
            this.CustomDomainName = new String(source.CustomDomainName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AccessTypes != null) {
            this.AccessTypes = new String[source.AccessTypes.length];
            for (int i = 0; i < source.AccessTypes.length; i++) {
                this.AccessTypes[i] = new String(source.AccessTypes[i]);
            }
        }
        if (source.CustomDomainNames != null) {
            this.CustomDomainNames = new String[source.CustomDomainNames.length];
            for (int i = 0; i < source.CustomDomainNames.length; i++) {
                this.CustomDomainNames[i] = new String(source.CustomDomainNames[i]);
            }
        }
        if (source.ServerType != null) {
            this.ServerType = new String(source.ServerType);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "DefaultDomainName", this.DefaultDomainName);
        this.setParamSimple(map, prefix + "CustomDomainName", this.CustomDomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "AccessTypes.", this.AccessTypes);
        this.setParamArraySimple(map, prefix + "CustomDomainNames.", this.CustomDomainNames);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

