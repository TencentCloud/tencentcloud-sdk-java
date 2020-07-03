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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViolationUrl extends AbstractModel{

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 违规资源原始访问 URL
    */
    @SerializedName("RealUrl")
    @Expose
    private String RealUrl;

    /**
    * 快照路径，用于控制台展示违规内容快照
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 违规资源当前状态
forbid：已封禁
release：已解封
delay ： 延迟处理
reject ：申诉驳回，状态仍为封禁态
complain：申诉进行中
    */
    @SerializedName("UrlStatus")
    @Expose
    private String UrlStatus;

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
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 违规资源原始访问 URL 
     * @return RealUrl 违规资源原始访问 URL
     */
    public String getRealUrl() {
        return this.RealUrl;
    }

    /**
     * Set 违规资源原始访问 URL
     * @param RealUrl 违规资源原始访问 URL
     */
    public void setRealUrl(String RealUrl) {
        this.RealUrl = RealUrl;
    }

    /**
     * Get 快照路径，用于控制台展示违规内容快照 
     * @return DownloadUrl 快照路径，用于控制台展示违规内容快照
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 快照路径，用于控制台展示违规内容快照
     * @param DownloadUrl 快照路径，用于控制台展示违规内容快照
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 违规资源当前状态
forbid：已封禁
release：已解封
delay ： 延迟处理
reject ：申诉驳回，状态仍为封禁态
complain：申诉进行中 
     * @return UrlStatus 违规资源当前状态
forbid：已封禁
release：已解封
delay ： 延迟处理
reject ：申诉驳回，状态仍为封禁态
complain：申诉进行中
     */
    public String getUrlStatus() {
        return this.UrlStatus;
    }

    /**
     * Set 违规资源当前状态
forbid：已封禁
release：已解封
delay ： 延迟处理
reject ：申诉驳回，状态仍为封禁态
complain：申诉进行中
     * @param UrlStatus 违规资源当前状态
forbid：已封禁
release：已解封
delay ： 延迟处理
reject ：申诉驳回，状态仍为封禁态
complain：申诉进行中
     */
    public void setUrlStatus(String UrlStatus) {
        this.UrlStatus = UrlStatus;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RealUrl", this.RealUrl);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "UrlStatus", this.UrlStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

