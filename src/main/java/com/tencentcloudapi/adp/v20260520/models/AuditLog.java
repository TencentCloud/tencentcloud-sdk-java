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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLog extends AbstractModel {

    /**
    * <p>员工信息</p>
    */
    @SerializedName("AccountInfo")
    @Expose
    private AccountInfo AccountInfo;

    /**
    * <p>应用业务id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>应用名称</p><p>操作日志触发时的名称</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>操作时间</p><p>参数格式：秒时间戳</p>
    */
    @SerializedName("OperateTime")
    @Expose
    private String OperateTime;

    /**
    * <p>操作类型</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>操作对象</p>
    */
    @SerializedName("Biz")
    @Expose
    private String Biz;

    /**
    * <p>操作内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>操作唯一ID</p>
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
     * Get <p>员工信息</p> 
     * @return AccountInfo <p>员工信息</p>
     */
    public AccountInfo getAccountInfo() {
        return this.AccountInfo;
    }

    /**
     * Set <p>员工信息</p>
     * @param AccountInfo <p>员工信息</p>
     */
    public void setAccountInfo(AccountInfo AccountInfo) {
        this.AccountInfo = AccountInfo;
    }

    /**
     * Get <p>应用业务id</p> 
     * @return AppId <p>应用业务id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用业务id</p>
     * @param AppId <p>应用业务id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>应用名称</p><p>操作日志触发时的名称</p> 
     * @return AppName <p>应用名称</p><p>操作日志触发时的名称</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>应用名称</p><p>操作日志触发时的名称</p>
     * @param AppName <p>应用名称</p><p>操作日志触发时的名称</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>操作时间</p><p>参数格式：秒时间戳</p> 
     * @return OperateTime <p>操作时间</p><p>参数格式：秒时间戳</p>
     */
    public String getOperateTime() {
        return this.OperateTime;
    }

    /**
     * Set <p>操作时间</p><p>参数格式：秒时间戳</p>
     * @param OperateTime <p>操作时间</p><p>参数格式：秒时间戳</p>
     */
    public void setOperateTime(String OperateTime) {
        this.OperateTime = OperateTime;
    }

    /**
     * Get <p>操作类型</p> 
     * @return Action <p>操作类型</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>操作类型</p>
     * @param Action <p>操作类型</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>操作对象</p> 
     * @return Biz <p>操作对象</p>
     */
    public String getBiz() {
        return this.Biz;
    }

    /**
     * Set <p>操作对象</p>
     * @param Biz <p>操作对象</p>
     */
    public void setBiz(String Biz) {
        this.Biz = Biz;
    }

    /**
     * Get <p>操作内容</p> 
     * @return Content <p>操作内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>操作内容</p>
     * @param Content <p>操作内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>操作唯一ID</p> 
     * @return UniqueId <p>操作唯一ID</p>
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set <p>操作唯一ID</p>
     * @param UniqueId <p>操作唯一ID</p>
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.AccountInfo != null) {
            this.AccountInfo = new AccountInfo(source.AccountInfo);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.OperateTime != null) {
            this.OperateTime = new String(source.OperateTime);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Biz != null) {
            this.Biz = new String(source.Biz);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.UniqueId != null) {
            this.UniqueId = new String(source.UniqueId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccountInfo.", this.AccountInfo);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "OperateTime", this.OperateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Biz", this.Biz);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);

    }
}

