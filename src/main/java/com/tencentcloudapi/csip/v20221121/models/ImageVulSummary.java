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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageVulSummary extends AbstractModel {

    /**
    * <p>所有者账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>所有者账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>所有者账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("FirstFoundTime")
    @Expose
    private String FirstFoundTime;

    /**
    * <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * <p>影响镜像数</p>
    */
    @SerializedName("AffectImageCount")
    @Expose
    private Long AffectImageCount;

    /**
    * <p>漏洞信息</p>
    */
    @SerializedName("VulInfo")
    @Expose
    private ImageVulBaseInfo VulInfo;

    /**
    * <p>记录id</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get <p>所有者账号名</p> 
     * @return OwnerAccountName <p>所有者账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>所有者账号名</p>
     * @param OwnerAccountName <p>所有者账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>所有者账号uin</p> 
     * @return OwnerUin <p>所有者账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>所有者账号uin</p>
     * @param OwnerUin <p>所有者账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>所有者账号appid</p> 
     * @return OwnerAppId <p>所有者账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>所有者账号appid</p>
     * @param OwnerAppId <p>所有者账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return FirstFoundTime <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getFirstFoundTime() {
        return this.FirstFoundTime;
    }

    /**
     * Set <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param FirstFoundTime <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setFirstFoundTime(String FirstFoundTime) {
        this.FirstFoundTime = FirstFoundTime;
    }

    /**
     * Get <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestFoundTime <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param LatestFoundTime <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get <p>影响镜像数</p> 
     * @return AffectImageCount <p>影响镜像数</p>
     */
    public Long getAffectImageCount() {
        return this.AffectImageCount;
    }

    /**
     * Set <p>影响镜像数</p>
     * @param AffectImageCount <p>影响镜像数</p>
     */
    public void setAffectImageCount(Long AffectImageCount) {
        this.AffectImageCount = AffectImageCount;
    }

    /**
     * Get <p>漏洞信息</p> 
     * @return VulInfo <p>漏洞信息</p>
     */
    public ImageVulBaseInfo getVulInfo() {
        return this.VulInfo;
    }

    /**
     * Set <p>漏洞信息</p>
     * @param VulInfo <p>漏洞信息</p>
     */
    public void setVulInfo(ImageVulBaseInfo VulInfo) {
        this.VulInfo = VulInfo;
    }

    /**
     * Get <p>记录id</p> 
     * @return ID <p>记录id</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>记录id</p>
     * @param ID <p>记录id</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ImageVulSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVulSummary(ImageVulSummary source) {
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.FirstFoundTime != null) {
            this.FirstFoundTime = new String(source.FirstFoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.AffectImageCount != null) {
            this.AffectImageCount = new Long(source.AffectImageCount);
        }
        if (source.VulInfo != null) {
            this.VulInfo = new ImageVulBaseInfo(source.VulInfo);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "FirstFoundTime", this.FirstFoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "AffectImageCount", this.AffectImageCount);
        this.setParamObj(map, prefix + "VulInfo.", this.VulInfo);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

