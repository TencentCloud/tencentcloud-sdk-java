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

public class ResourceInfo  extends AbstractModel{

    /**
    * 用户购买的资源id，全局唯一
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
    * 购买时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Integer CreateTime;

    /**
    * 到期时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Integer ExpireTime;

    /**
    * 0-未绑定，1-已绑定
    */
    @SerializedName("IsBind")
    @Expose
    private Integer IsBind;

    /**
    * 用户绑定app的基本信息
    */
    @SerializedName("BindInfo")
    @Expose
    private BindInfo BindInfo;

    /**
    * 资源名称，如应用加固，漏洞扫描
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * 获取用户购买的资源id，全局唯一
     * @return ResourceId 用户购买的资源id，全局唯一
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * 设置用户购买的资源id，全局唯一
     * @param ResourceId 用户购买的资源id，全局唯一
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 获取资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736
     * @return Pid 资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736
     * @param Pid 资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 获取购买时间戳
     * @return CreateTime 购买时间戳
     */
    public Integer getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置购买时间戳
     * @param CreateTime 购买时间戳
     */
    public void setCreateTime(Integer CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取到期时间戳
     * @return ExpireTime 到期时间戳
     */
    public Integer getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * 设置到期时间戳
     * @param ExpireTime 到期时间戳
     */
    public void setExpireTime(Integer ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * 获取0-未绑定，1-已绑定
     * @return IsBind 0-未绑定，1-已绑定
     */
    public Integer getIsBind() {
        return this.IsBind;
    }

    /**
     * 设置0-未绑定，1-已绑定
     * @param IsBind 0-未绑定，1-已绑定
     */
    public void setIsBind(Integer IsBind) {
        this.IsBind = IsBind;
    }

    /**
     * 获取用户绑定app的基本信息
     * @return BindInfo 用户绑定app的基本信息
     */
    public BindInfo getBindInfo() {
        return this.BindInfo;
    }

    /**
     * 设置用户绑定app的基本信息
     * @param BindInfo 用户绑定app的基本信息
     */
    public void setBindInfo(BindInfo BindInfo) {
        this.BindInfo = BindInfo;
    }

    /**
     * 获取资源名称，如应用加固，漏洞扫描
     * @return ResourceName 资源名称，如应用加固，漏洞扫描
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * 设置资源名称，如应用加固，漏洞扫描
     * @param ResourceName 资源名称，如应用加固，漏洞扫描
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsBind", this.IsBind);
        this.setParamObj(map, prefix + "BindInfo.", this.BindInfo);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

