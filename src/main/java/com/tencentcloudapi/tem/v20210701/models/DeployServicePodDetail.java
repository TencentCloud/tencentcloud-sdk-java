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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployServicePodDetail extends AbstractModel {

    /**
    * pod Id
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * pod状态
    */
    @SerializedName("PodStatus")
    @Expose
    private String [] PodStatus;

    /**
    * pod版本
    */
    @SerializedName("PodVersion")
    @Expose
    private String PodVersion;

    /**
    * pod创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * pod所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * webshell地址
    */
    @SerializedName("Webshell")
    @Expose
    private String Webshell;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get pod Id 
     * @return PodId pod Id
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set pod Id
     * @param PodId pod Id
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get pod状态 
     * @return PodStatus pod状态
     */
    public String [] getPodStatus() {
        return this.PodStatus;
    }

    /**
     * Set pod状态
     * @param PodStatus pod状态
     */
    public void setPodStatus(String [] PodStatus) {
        this.PodStatus = PodStatus;
    }

    /**
     * Get pod版本 
     * @return PodVersion pod版本
     */
    public String getPodVersion() {
        return this.PodVersion;
    }

    /**
     * Set pod版本
     * @param PodVersion pod版本
     */
    public void setPodVersion(String PodVersion) {
        this.PodVersion = PodVersion;
    }

    /**
     * Get pod创建时间 
     * @return CreateTime pod创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set pod创建时间
     * @param CreateTime pod创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get pod所在可用区 
     * @return Zone pod所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set pod所在可用区
     * @param Zone pod所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get webshell地址 
     * @return Webshell webshell地址
     */
    public String getWebshell() {
        return this.Webshell;
    }

    /**
     * Set webshell地址
     * @param Webshell webshell地址
     */
    public void setWebshell(String Webshell) {
        this.Webshell = Webshell;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DeployServicePodDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployServicePodDetail(DeployServicePodDetail source) {
        if (source.PodId != null) {
            this.PodId = new String(source.PodId);
        }
        if (source.PodStatus != null) {
            this.PodStatus = new String[source.PodStatus.length];
            for (int i = 0; i < source.PodStatus.length; i++) {
                this.PodStatus[i] = new String(source.PodStatus[i]);
            }
        }
        if (source.PodVersion != null) {
            this.PodVersion = new String(source.PodVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Webshell != null) {
            this.Webshell = new String(source.Webshell);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamArraySimple(map, prefix + "PodStatus.", this.PodStatus);
        this.setParamSimple(map, prefix + "PodVersion", this.PodVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Webshell", this.Webshell);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

