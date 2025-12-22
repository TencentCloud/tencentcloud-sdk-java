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

public class VersionPodInstance extends AbstractModel {

    /**
    * 实例webshell链接
    */
    @SerializedName("Webshell")
    @Expose
    private String Webshell;

    /**
    * 实例Id
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 实例webshell链接 
     * @return Webshell 实例webshell链接
     */
    public String getWebshell() {
        return this.Webshell;
    }

    /**
     * Set 实例webshell链接
     * @param Webshell 实例webshell链接
     */
    public void setWebshell(String Webshell) {
        this.Webshell = Webshell;
    }

    /**
     * Get 实例Id 
     * @return PodId 实例Id
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set 实例Id
     * @param PodId 实例Id
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get 实例状态 
     * @return Status 实例状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public VersionPodInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionPodInstance(VersionPodInstance source) {
        if (source.Webshell != null) {
            this.Webshell = new String(source.Webshell);
        }
        if (source.PodId != null) {
            this.PodId = new String(source.PodId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Webshell", this.Webshell);
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

