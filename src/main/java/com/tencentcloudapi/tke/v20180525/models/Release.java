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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Release extends AbstractModel {

    /**
    * 应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 应用当前版本
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
    * 应用状态，参考 Helm 发布状态。
可选值及其释义如下：
• ​​unknown​​: 状态未知
• ​​deployed​​: 已成功部署
• ​​uninstalled​​: 已卸载
• ​​superseded​​: 已被新版本替代
• ​​failed​​: 部署失败
• ​​uninstalling​​: 正在卸载中
• ​​pending-install​​: 等待安装/安装进行中
• ​​pending-upgrade​​: 等待升级/升级进行中
• ​​pending-rollback​​: 等待回滚/回滚进行中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 制品名称
    */
    @SerializedName("ChartName")
    @Expose
    private String ChartName;

    /**
    * 制品版本
    */
    @SerializedName("ChartVersion")
    @Expose
    private String ChartVersion;

    /**
    * 制品应用版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 应用描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 应用名称 
     * @return Name 应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
     * @param Name 应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用命名空间 
     * @return Namespace 应用命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 应用命名空间
     * @param Namespace 应用命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 应用当前版本 
     * @return Revision 应用当前版本
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set 应用当前版本
     * @param Revision 应用当前版本
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    /**
     * Get 应用状态，参考 Helm 发布状态。
可选值及其释义如下：
• ​​unknown​​: 状态未知
• ​​deployed​​: 已成功部署
• ​​uninstalled​​: 已卸载
• ​​superseded​​: 已被新版本替代
• ​​failed​​: 部署失败
• ​​uninstalling​​: 正在卸载中
• ​​pending-install​​: 等待安装/安装进行中
• ​​pending-upgrade​​: 等待升级/升级进行中
• ​​pending-rollback​​: 等待回滚/回滚进行中 
     * @return Status 应用状态，参考 Helm 发布状态。
可选值及其释义如下：
• ​​unknown​​: 状态未知
• ​​deployed​​: 已成功部署
• ​​uninstalled​​: 已卸载
• ​​superseded​​: 已被新版本替代
• ​​failed​​: 部署失败
• ​​uninstalling​​: 正在卸载中
• ​​pending-install​​: 等待安装/安装进行中
• ​​pending-upgrade​​: 等待升级/升级进行中
• ​​pending-rollback​​: 等待回滚/回滚进行中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 应用状态，参考 Helm 发布状态。
可选值及其释义如下：
• ​​unknown​​: 状态未知
• ​​deployed​​: 已成功部署
• ​​uninstalled​​: 已卸载
• ​​superseded​​: 已被新版本替代
• ​​failed​​: 部署失败
• ​​uninstalling​​: 正在卸载中
• ​​pending-install​​: 等待安装/安装进行中
• ​​pending-upgrade​​: 等待升级/升级进行中
• ​​pending-rollback​​: 等待回滚/回滚进行中
     * @param Status 应用状态，参考 Helm 发布状态。
可选值及其释义如下：
• ​​unknown​​: 状态未知
• ​​deployed​​: 已成功部署
• ​​uninstalled​​: 已卸载
• ​​superseded​​: 已被新版本替代
• ​​failed​​: 部署失败
• ​​uninstalling​​: 正在卸载中
• ​​pending-install​​: 等待安装/安装进行中
• ​​pending-upgrade​​: 等待升级/升级进行中
• ​​pending-rollback​​: 等待回滚/回滚进行中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 制品名称 
     * @return ChartName 制品名称
     */
    public String getChartName() {
        return this.ChartName;
    }

    /**
     * Set 制品名称
     * @param ChartName 制品名称
     */
    public void setChartName(String ChartName) {
        this.ChartName = ChartName;
    }

    /**
     * Get 制品版本 
     * @return ChartVersion 制品版本
     */
    public String getChartVersion() {
        return this.ChartVersion;
    }

    /**
     * Set 制品版本
     * @param ChartVersion 制品版本
     */
    public void setChartVersion(String ChartVersion) {
        this.ChartVersion = ChartVersion;
    }

    /**
     * Get 制品应用版本 
     * @return AppVersion 制品应用版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 制品应用版本
     * @param AppVersion 制品应用版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 应用描述 
     * @return Description 应用描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 应用描述
     * @param Description 应用描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Release() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Release(Release source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ChartName != null) {
            this.ChartName = new String(source.ChartName);
        }
        if (source.ChartVersion != null) {
            this.ChartVersion = new String(source.ChartVersion);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ChartName", this.ChartName);
        this.setParamSimple(map, prefix + "ChartVersion", this.ChartVersion);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

