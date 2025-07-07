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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RumAreaInfo extends AbstractModel {

    /**
    * 片区Id
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * 片区状态(1=有效，2=无效)
    */
    @SerializedName("AreaStatus")
    @Expose
    private Long AreaStatus;

    /**
    * 片区名称
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
    * 片区Key
    */
    @SerializedName("AreaKey")
    @Expose
    private String AreaKey;

    /**
    * 地域码表 id
    */
    @SerializedName("AreaRegionID")
    @Expose
    private String AreaRegionID;

    /**
    * 地域码表 code 如 ap-xxx（xxx 为地域词）
    */
    @SerializedName("AreaRegionCode")
    @Expose
    private String AreaRegionCode;

    /**
    * 地域缩写
    */
    @SerializedName("AreaAbbr")
    @Expose
    private String AreaAbbr;

    /**
     * Get 片区Id 
     * @return AreaId 片区Id
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set 片区Id
     * @param AreaId 片区Id
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get 片区状态(1=有效，2=无效) 
     * @return AreaStatus 片区状态(1=有效，2=无效)
     */
    public Long getAreaStatus() {
        return this.AreaStatus;
    }

    /**
     * Set 片区状态(1=有效，2=无效)
     * @param AreaStatus 片区状态(1=有效，2=无效)
     */
    public void setAreaStatus(Long AreaStatus) {
        this.AreaStatus = AreaStatus;
    }

    /**
     * Get 片区名称 
     * @return AreaName 片区名称
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set 片区名称
     * @param AreaName 片区名称
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * Get 片区Key 
     * @return AreaKey 片区Key
     */
    public String getAreaKey() {
        return this.AreaKey;
    }

    /**
     * Set 片区Key
     * @param AreaKey 片区Key
     */
    public void setAreaKey(String AreaKey) {
        this.AreaKey = AreaKey;
    }

    /**
     * Get 地域码表 id 
     * @return AreaRegionID 地域码表 id
     */
    public String getAreaRegionID() {
        return this.AreaRegionID;
    }

    /**
     * Set 地域码表 id
     * @param AreaRegionID 地域码表 id
     */
    public void setAreaRegionID(String AreaRegionID) {
        this.AreaRegionID = AreaRegionID;
    }

    /**
     * Get 地域码表 code 如 ap-xxx（xxx 为地域词） 
     * @return AreaRegionCode 地域码表 code 如 ap-xxx（xxx 为地域词）
     */
    public String getAreaRegionCode() {
        return this.AreaRegionCode;
    }

    /**
     * Set 地域码表 code 如 ap-xxx（xxx 为地域词）
     * @param AreaRegionCode 地域码表 code 如 ap-xxx（xxx 为地域词）
     */
    public void setAreaRegionCode(String AreaRegionCode) {
        this.AreaRegionCode = AreaRegionCode;
    }

    /**
     * Get 地域缩写 
     * @return AreaAbbr 地域缩写
     */
    public String getAreaAbbr() {
        return this.AreaAbbr;
    }

    /**
     * Set 地域缩写
     * @param AreaAbbr 地域缩写
     */
    public void setAreaAbbr(String AreaAbbr) {
        this.AreaAbbr = AreaAbbr;
    }

    public RumAreaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RumAreaInfo(RumAreaInfo source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.AreaStatus != null) {
            this.AreaStatus = new Long(source.AreaStatus);
        }
        if (source.AreaName != null) {
            this.AreaName = new String(source.AreaName);
        }
        if (source.AreaKey != null) {
            this.AreaKey = new String(source.AreaKey);
        }
        if (source.AreaRegionID != null) {
            this.AreaRegionID = new String(source.AreaRegionID);
        }
        if (source.AreaRegionCode != null) {
            this.AreaRegionCode = new String(source.AreaRegionCode);
        }
        if (source.AreaAbbr != null) {
            this.AreaAbbr = new String(source.AreaAbbr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "AreaStatus", this.AreaStatus);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);
        this.setParamSimple(map, prefix + "AreaKey", this.AreaKey);
        this.setParamSimple(map, prefix + "AreaRegionID", this.AreaRegionID);
        this.setParamSimple(map, prefix + "AreaRegionCode", this.AreaRegionCode);
        this.setParamSimple(map, prefix + "AreaAbbr", this.AreaAbbr);

    }
}

