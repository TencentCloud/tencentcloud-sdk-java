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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 是否内部APP
    */
    @SerializedName("IsInternalApp")
    @Expose
    private Long IsInternalApp;

    /**
    * 应用标识
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 标识
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * 可用区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区状态
    */
    @SerializedName("ZoneStatus")
    @Expose
    private Long ZoneStatus;

    /**
    * 额外标识
    */
    @SerializedName("Exflag")
    @Expose
    private String Exflag;

    /**
    * true为售罄，false为未售罄
    */
    @SerializedName("SoldOut")
    @Expose
    private String SoldOut;

    /**
    * 标准版售罄信息
    */
    @SerializedName("SalesInfo")
    @Expose
    private SaleInfo [] SalesInfo;

    /**
    * 额外标识
    */
    @SerializedName("ExtraFlag")
    @Expose
    private String ExtraFlag;

    /**
     * Get 可用区 
     * @return ZoneId 可用区
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区
     * @param ZoneId 可用区
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 是否内部APP 
     * @return IsInternalApp 是否内部APP
     */
    public Long getIsInternalApp() {
        return this.IsInternalApp;
    }

    /**
     * Set 是否内部APP
     * @param IsInternalApp 是否内部APP
     */
    public void setIsInternalApp(Long IsInternalApp) {
        this.IsInternalApp = IsInternalApp;
    }

    /**
     * Get 应用标识 
     * @return AppId 应用标识
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用标识
     * @param AppId 应用标识
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 标识 
     * @return Flag 标识
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set 标识
     * @param Flag 标识
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 可用区名称 
     * @return ZoneName 可用区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区名称
     * @param ZoneName 可用区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 可用区状态 
     * @return ZoneStatus 可用区状态
     */
    public Long getZoneStatus() {
        return this.ZoneStatus;
    }

    /**
     * Set 可用区状态
     * @param ZoneStatus 可用区状态
     */
    public void setZoneStatus(Long ZoneStatus) {
        this.ZoneStatus = ZoneStatus;
    }

    /**
     * Get 额外标识 
     * @return Exflag 额外标识
     * @deprecated
     */
    @Deprecated
    public String getExflag() {
        return this.Exflag;
    }

    /**
     * Set 额外标识
     * @param Exflag 额外标识
     * @deprecated
     */
    @Deprecated
    public void setExflag(String Exflag) {
        this.Exflag = Exflag;
    }

    /**
     * Get true为售罄，false为未售罄 
     * @return SoldOut true为售罄，false为未售罄
     */
    public String getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set true为售罄，false为未售罄
     * @param SoldOut true为售罄，false为未售罄
     */
    public void setSoldOut(String SoldOut) {
        this.SoldOut = SoldOut;
    }

    /**
     * Get 标准版售罄信息 
     * @return SalesInfo 标准版售罄信息
     */
    public SaleInfo [] getSalesInfo() {
        return this.SalesInfo;
    }

    /**
     * Set 标准版售罄信息
     * @param SalesInfo 标准版售罄信息
     */
    public void setSalesInfo(SaleInfo [] SalesInfo) {
        this.SalesInfo = SalesInfo;
    }

    /**
     * Get 额外标识 
     * @return ExtraFlag 额外标识
     */
    public String getExtraFlag() {
        return this.ExtraFlag;
    }

    /**
     * Set 额外标识
     * @param ExtraFlag 额外标识
     */
    public void setExtraFlag(String ExtraFlag) {
        this.ExtraFlag = ExtraFlag;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IsInternalApp != null) {
            this.IsInternalApp = new Long(source.IsInternalApp);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Flag != null) {
            this.Flag = new Boolean(source.Flag);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneStatus != null) {
            this.ZoneStatus = new Long(source.ZoneStatus);
        }
        if (source.Exflag != null) {
            this.Exflag = new String(source.Exflag);
        }
        if (source.SoldOut != null) {
            this.SoldOut = new String(source.SoldOut);
        }
        if (source.SalesInfo != null) {
            this.SalesInfo = new SaleInfo[source.SalesInfo.length];
            for (int i = 0; i < source.SalesInfo.length; i++) {
                this.SalesInfo[i] = new SaleInfo(source.SalesInfo[i]);
            }
        }
        if (source.ExtraFlag != null) {
            this.ExtraFlag = new String(source.ExtraFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsInternalApp", this.IsInternalApp);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneStatus", this.ZoneStatus);
        this.setParamSimple(map, prefix + "Exflag", this.Exflag);
        this.setParamSimple(map, prefix + "SoldOut", this.SoldOut);
        this.setParamArrayObj(map, prefix + "SalesInfo.", this.SalesInfo);
        this.setParamSimple(map, prefix + "ExtraFlag", this.ExtraFlag);

    }
}

