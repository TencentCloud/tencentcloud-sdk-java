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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CanFixVulInfo extends AbstractModel {

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 该漏洞可修复的主机信息
    */
    @SerializedName("HostList")
    @Expose
    private VulInfoHostInfo [] HostList;

    /**
    * 修复提示tag
    */
    @SerializedName("FixTag")
    @Expose
    private String [] FixTag;

    /**
    * 漏洞分类1 web cms漏洞,2应用漏洞,4linux软件漏洞,5windows系统漏洞
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
     * Get 漏洞id 
     * @return VulId 漏洞id
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

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
     * Get 该漏洞可修复的主机信息 
     * @return HostList 该漏洞可修复的主机信息
     */
    public VulInfoHostInfo [] getHostList() {
        return this.HostList;
    }

    /**
     * Set 该漏洞可修复的主机信息
     * @param HostList 该漏洞可修复的主机信息
     */
    public void setHostList(VulInfoHostInfo [] HostList) {
        this.HostList = HostList;
    }

    /**
     * Get 修复提示tag 
     * @return FixTag 修复提示tag
     */
    public String [] getFixTag() {
        return this.FixTag;
    }

    /**
     * Set 修复提示tag
     * @param FixTag 修复提示tag
     */
    public void setFixTag(String [] FixTag) {
        this.FixTag = FixTag;
    }

    /**
     * Get 漏洞分类1 web cms漏洞,2应用漏洞,4linux软件漏洞,5windows系统漏洞 
     * @return VulCategory 漏洞分类1 web cms漏洞,2应用漏洞,4linux软件漏洞,5windows系统漏洞
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 漏洞分类1 web cms漏洞,2应用漏洞,4linux软件漏洞,5windows系统漏洞
     * @param VulCategory 漏洞分类1 web cms漏洞,2应用漏洞,4linux软件漏洞,5windows系统漏洞
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    public CanFixVulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CanFixVulInfo(CanFixVulInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.HostList != null) {
            this.HostList = new VulInfoHostInfo[source.HostList.length];
            for (int i = 0; i < source.HostList.length; i++) {
                this.HostList[i] = new VulInfoHostInfo(source.HostList[i]);
            }
        }
        if (source.FixTag != null) {
            this.FixTag = new String[source.FixTag.length];
            for (int i = 0; i < source.FixTag.length; i++) {
                this.FixTag[i] = new String(source.FixTag[i]);
            }
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamArrayObj(map, prefix + "HostList.", this.HostList);
        this.setParamArraySimple(map, prefix + "FixTag.", this.FixTag);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);

    }
}

