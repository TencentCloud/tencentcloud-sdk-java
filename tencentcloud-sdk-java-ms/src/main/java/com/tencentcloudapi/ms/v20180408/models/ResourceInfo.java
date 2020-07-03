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

public class ResourceInfo extends AbstractModel{

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
    private Long Pid;

    /**
    * 购买时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 到期时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 0-未绑定，1-已绑定
    */
    @SerializedName("IsBind")
    @Expose
    private Long IsBind;

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
     * Get 用户购买的资源id，全局唯一 
     * @return ResourceId 用户购买的资源id，全局唯一
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 用户购买的资源id，全局唯一
     * @param ResourceId 用户购买的资源id，全局唯一
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736 
     * @return Pid 资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736
     * @param Pid 资源的pid，MTP加固-12767，应用加固-12750 MTP反作弊-12766 源代码混淆-12736
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 购买时间戳 
     * @return CreateTime 购买时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 购买时间戳
     * @param CreateTime 购买时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 到期时间戳 
     * @return ExpireTime 到期时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间戳
     * @param ExpireTime 到期时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 0-未绑定，1-已绑定 
     * @return IsBind 0-未绑定，1-已绑定
     */
    public Long getIsBind() {
        return this.IsBind;
    }

    /**
     * Set 0-未绑定，1-已绑定
     * @param IsBind 0-未绑定，1-已绑定
     */
    public void setIsBind(Long IsBind) {
        this.IsBind = IsBind;
    }

    /**
     * Get 用户绑定app的基本信息 
     * @return BindInfo 用户绑定app的基本信息
     */
    public BindInfo getBindInfo() {
        return this.BindInfo;
    }

    /**
     * Set 用户绑定app的基本信息
     * @param BindInfo 用户绑定app的基本信息
     */
    public void setBindInfo(BindInfo BindInfo) {
        this.BindInfo = BindInfo;
    }

    /**
     * Get 资源名称，如应用加固，漏洞扫描 
     * @return ResourceName 资源名称，如应用加固，漏洞扫描
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称，如应用加固，漏洞扫描
     * @param ResourceName 资源名称，如应用加固，漏洞扫描
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Internal implementation, normal users should not use it.
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

