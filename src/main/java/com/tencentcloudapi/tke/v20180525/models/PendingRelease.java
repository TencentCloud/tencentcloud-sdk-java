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

public class PendingRelease extends AbstractModel {

    /**
    * 应用状态详情
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 应用ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

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
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get 应用状态详情 
     * @return Condition 应用状态详情
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 应用状态详情
     * @param Condition 应用状态详情
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 应用ID 
     * @return ID 应用ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 应用ID
     * @param ID 应用ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

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

    public PendingRelease() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PendingRelease(PendingRelease source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

