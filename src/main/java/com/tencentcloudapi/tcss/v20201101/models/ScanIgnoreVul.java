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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanIgnoreVul extends AbstractModel{

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞CVEID
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * 漏洞PocID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * 忽略的仓库镜像数
    */
    @SerializedName("RegistryImageCount")
    @Expose
    private Long RegistryImageCount;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否忽略所有镜像：0：否/1：是
    */
    @SerializedName("IsIgnoreAll")
    @Expose
    private Long IsIgnoreAll;

    /**
    * 忽略的本地镜像数
    */
    @SerializedName("LocalImageCount")
    @Expose
    private Long LocalImageCount;

    /**
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 漏洞CVEID 
     * @return CVEID 漏洞CVEID
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set 漏洞CVEID
     * @param CVEID 漏洞CVEID
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get 漏洞PocID 
     * @return PocID 漏洞PocID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set 漏洞PocID
     * @param PocID 漏洞PocID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get 忽略的仓库镜像数 
     * @return RegistryImageCount 忽略的仓库镜像数
     */
    public Long getRegistryImageCount() {
        return this.RegistryImageCount;
    }

    /**
     * Set 忽略的仓库镜像数
     * @param RegistryImageCount 忽略的仓库镜像数
     */
    public void setRegistryImageCount(Long RegistryImageCount) {
        this.RegistryImageCount = RegistryImageCount;
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
     * Get 是否忽略所有镜像：0：否/1：是 
     * @return IsIgnoreAll 是否忽略所有镜像：0：否/1：是
     */
    public Long getIsIgnoreAll() {
        return this.IsIgnoreAll;
    }

    /**
     * Set 是否忽略所有镜像：0：否/1：是
     * @param IsIgnoreAll 是否忽略所有镜像：0：否/1：是
     */
    public void setIsIgnoreAll(Long IsIgnoreAll) {
        this.IsIgnoreAll = IsIgnoreAll;
    }

    /**
     * Get 忽略的本地镜像数 
     * @return LocalImageCount 忽略的本地镜像数
     */
    public Long getLocalImageCount() {
        return this.LocalImageCount;
    }

    /**
     * Set 忽略的本地镜像数
     * @param LocalImageCount 忽略的本地镜像数
     */
    public void setLocalImageCount(Long LocalImageCount) {
        this.LocalImageCount = LocalImageCount;
    }

    public ScanIgnoreVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanIgnoreVul(ScanIgnoreVul source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.RegistryImageCount != null) {
            this.RegistryImageCount = new Long(source.RegistryImageCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsIgnoreAll != null) {
            this.IsIgnoreAll = new Long(source.IsIgnoreAll);
        }
        if (source.LocalImageCount != null) {
            this.LocalImageCount = new Long(source.LocalImageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "RegistryImageCount", this.RegistryImageCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsIgnoreAll", this.IsIgnoreAll);
        this.setParamSimple(map, prefix + "LocalImageCount", this.LocalImageCount);

    }
}

