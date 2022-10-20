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

public class VulTopRankingInfo extends AbstractModel{

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 威胁等级,CRITICAL:严重 HIGH:高/MIDDLE:中/LOW:低
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 影响的镜像数
    */
    @SerializedName("AffectedImageCount")
    @Expose
    private Long AffectedImageCount;

    /**
    * 影响的容器数
    */
    @SerializedName("AffectedContainerCount")
    @Expose
    private Long AffectedContainerCount;

    /**
    * 漏洞ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 漏洞PocID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

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
     * Get 威胁等级,CRITICAL:严重 HIGH:高/MIDDLE:中/LOW:低 
     * @return Level 威胁等级,CRITICAL:严重 HIGH:高/MIDDLE:中/LOW:低
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 威胁等级,CRITICAL:严重 HIGH:高/MIDDLE:中/LOW:低
     * @param Level 威胁等级,CRITICAL:严重 HIGH:高/MIDDLE:中/LOW:低
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 影响的镜像数 
     * @return AffectedImageCount 影响的镜像数
     */
    public Long getAffectedImageCount() {
        return this.AffectedImageCount;
    }

    /**
     * Set 影响的镜像数
     * @param AffectedImageCount 影响的镜像数
     */
    public void setAffectedImageCount(Long AffectedImageCount) {
        this.AffectedImageCount = AffectedImageCount;
    }

    /**
     * Get 影响的容器数 
     * @return AffectedContainerCount 影响的容器数
     */
    public Long getAffectedContainerCount() {
        return this.AffectedContainerCount;
    }

    /**
     * Set 影响的容器数
     * @param AffectedContainerCount 影响的容器数
     */
    public void setAffectedContainerCount(Long AffectedContainerCount) {
        this.AffectedContainerCount = AffectedContainerCount;
    }

    /**
     * Get 漏洞ID 
     * @return ID 漏洞ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 漏洞ID
     * @param ID 漏洞ID
     */
    public void setID(Long ID) {
        this.ID = ID;
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

    public VulTopRankingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulTopRankingInfo(VulTopRankingInfo source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.AffectedImageCount != null) {
            this.AffectedImageCount = new Long(source.AffectedImageCount);
        }
        if (source.AffectedContainerCount != null) {
            this.AffectedContainerCount = new Long(source.AffectedContainerCount);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "AffectedImageCount", this.AffectedImageCount);
        this.setParamSimple(map, prefix + "AffectedContainerCount", this.AffectedContainerCount);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);

    }
}

