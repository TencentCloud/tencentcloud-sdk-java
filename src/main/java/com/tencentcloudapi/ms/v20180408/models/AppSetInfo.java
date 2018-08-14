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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppSetInfo  extends AbstractModel{

    /**
    * 任务唯一标识
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * app的名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * app的包名
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
    * app的版本号
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * app的md5
    */
    @SerializedName("AppMd5")
    @Expose
    private String AppMd5;

    /**
    * app的大小
    */
    @SerializedName("AppSize")
    @Expose
    private Integer AppSize;

    /**
    * 加固服务版本
    */
    @SerializedName("ServiceEdition")
    @Expose
    private String ServiceEdition;

    /**
    * 加固结果返回码
    */
    @SerializedName("ShieldCode")
    @Expose
    private Integer ShieldCode;

    /**
    * 加固后的APP下载地址
    */
    @SerializedName("AppUrl")
    @Expose
    private String AppUrl;

    /**
    * 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
    */
    @SerializedName("TaskStatus")
    @Expose
    private Integer TaskStatus;

    /**
    * 请求的客户端ip
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 提交加固时间
    */
    @SerializedName("TaskTime")
    @Expose
    private Integer TaskTime;

    /**
    * app的图标url
    */
    @SerializedName("AppIconUrl")
    @Expose
    private String AppIconUrl;

    /**
    * 加固后app的md5
    */
    @SerializedName("ShieldMd5")
    @Expose
    private String ShieldMd5;

    /**
    * 加固后app的大小
    */
    @SerializedName("ShieldSize")
    @Expose
    private Integer ShieldSize;

    /**
     * 获取任务唯一标识
     * @return ItemId 任务唯一标识
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * 设置任务唯一标识
     * @param ItemId 任务唯一标识
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * 获取app的名称
     * @return AppName app的名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置app的名称
     * @param AppName app的名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取app的包名
     * @return AppPkgName app的包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * 设置app的包名
     * @param AppPkgName app的包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * 获取app的版本号
     * @return AppVersion app的版本号
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * 设置app的版本号
     * @param AppVersion app的版本号
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * 获取app的md5
     * @return AppMd5 app的md5
     */
    public String getAppMd5() {
        return this.AppMd5;
    }

    /**
     * 设置app的md5
     * @param AppMd5 app的md5
     */
    public void setAppMd5(String AppMd5) {
        this.AppMd5 = AppMd5;
    }

    /**
     * 获取app的大小
     * @return AppSize app的大小
     */
    public Integer getAppSize() {
        return this.AppSize;
    }

    /**
     * 设置app的大小
     * @param AppSize app的大小
     */
    public void setAppSize(Integer AppSize) {
        this.AppSize = AppSize;
    }

    /**
     * 获取加固服务版本
     * @return ServiceEdition 加固服务版本
     */
    public String getServiceEdition() {
        return this.ServiceEdition;
    }

    /**
     * 设置加固服务版本
     * @param ServiceEdition 加固服务版本
     */
    public void setServiceEdition(String ServiceEdition) {
        this.ServiceEdition = ServiceEdition;
    }

    /**
     * 获取加固结果返回码
     * @return ShieldCode 加固结果返回码
     */
    public Integer getShieldCode() {
        return this.ShieldCode;
    }

    /**
     * 设置加固结果返回码
     * @param ShieldCode 加固结果返回码
     */
    public void setShieldCode(Integer ShieldCode) {
        this.ShieldCode = ShieldCode;
    }

    /**
     * 获取加固后的APP下载地址
     * @return AppUrl 加固后的APP下载地址
     */
    public String getAppUrl() {
        return this.AppUrl;
    }

    /**
     * 设置加固后的APP下载地址
     * @param AppUrl 加固后的APP下载地址
     */
    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    /**
     * 获取任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @return TaskStatus 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public Integer getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @param TaskStatus 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public void setTaskStatus(Integer TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取请求的客户端ip
     * @return ClientIp 请求的客户端ip
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * 设置请求的客户端ip
     * @param ClientIp 请求的客户端ip
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * 获取提交加固时间
     * @return TaskTime 提交加固时间
     */
    public Integer getTaskTime() {
        return this.TaskTime;
    }

    /**
     * 设置提交加固时间
     * @param TaskTime 提交加固时间
     */
    public void setTaskTime(Integer TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * 获取app的图标url
     * @return AppIconUrl app的图标url
     */
    public String getAppIconUrl() {
        return this.AppIconUrl;
    }

    /**
     * 设置app的图标url
     * @param AppIconUrl app的图标url
     */
    public void setAppIconUrl(String AppIconUrl) {
        this.AppIconUrl = AppIconUrl;
    }

    /**
     * 获取加固后app的md5
     * @return ShieldMd5 加固后app的md5
     */
    public String getShieldMd5() {
        return this.ShieldMd5;
    }

    /**
     * 设置加固后app的md5
     * @param ShieldMd5 加固后app的md5
     */
    public void setShieldMd5(String ShieldMd5) {
        this.ShieldMd5 = ShieldMd5;
    }

    /**
     * 获取加固后app的大小
     * @return ShieldSize 加固后app的大小
     */
    public Integer getShieldSize() {
        return this.ShieldSize;
    }

    /**
     * 设置加固后app的大小
     * @param ShieldSize 加固后app的大小
     */
    public void setShieldSize(Integer ShieldSize) {
        this.ShieldSize = ShieldSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "AppMd5", this.AppMd5);
        this.setParamSimple(map, prefix + "AppSize", this.AppSize);
        this.setParamSimple(map, prefix + "ServiceEdition", this.ServiceEdition);
        this.setParamSimple(map, prefix + "ShieldCode", this.ShieldCode);
        this.setParamSimple(map, prefix + "AppUrl", this.AppUrl);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "AppIconUrl", this.AppIconUrl);
        this.setParamSimple(map, prefix + "ShieldMd5", this.ShieldMd5);
        this.setParamSimple(map, prefix + "ShieldSize", this.ShieldSize);

    }
}

