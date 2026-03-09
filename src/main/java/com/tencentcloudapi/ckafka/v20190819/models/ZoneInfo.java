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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * <p>可用区</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>是否内部APP</p><p>枚举值：</p><ul><li>0： 外部</li><li>1： 内部</li></ul><p>默认值：0</p>
    */
    @SerializedName("IsInternalApp")
    @Expose
    private Long IsInternalApp;

    /**
    * <p>应用标识</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>可用区是否售罄标识，true表示已售罄，false表示未售罄。</p>
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * <p>可用区名称</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>可用区状态</p><p>枚举值：</p><ul><li>3： 开启</li><li>4： 关闭</li></ul><p>可用区状态以SoldOut为准</p>
    */
    @SerializedName("ZoneStatus")
    @Expose
    private Long ZoneStatus;

    /**
    * <p>额外标识</p>
    */
    @SerializedName("Exflag")
    @Expose
    private String Exflag;

    /**
    * <p>true为售罄，false为未售罄</p>
    */
    @SerializedName("SoldOut")
    @Expose
    private String SoldOut;

    /**
    * <p>标准版售罄信息</p>
    */
    @SerializedName("SalesInfo")
    @Expose
    private SaleInfo [] SalesInfo;

    /**
    * <p>额外标识</p>
    */
    @SerializedName("ExtraFlag")
    @Expose
    private String ExtraFlag;

    /**
     * Get <p>可用区</p> 
     * @return ZoneId <p>可用区</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区</p>
     * @param ZoneId <p>可用区</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>是否内部APP</p><p>枚举值：</p><ul><li>0： 外部</li><li>1： 内部</li></ul><p>默认值：0</p> 
     * @return IsInternalApp <p>是否内部APP</p><p>枚举值：</p><ul><li>0： 外部</li><li>1： 内部</li></ul><p>默认值：0</p>
     */
    public Long getIsInternalApp() {
        return this.IsInternalApp;
    }

    /**
     * Set <p>是否内部APP</p><p>枚举值：</p><ul><li>0： 外部</li><li>1： 内部</li></ul><p>默认值：0</p>
     * @param IsInternalApp <p>是否内部APP</p><p>枚举值：</p><ul><li>0： 外部</li><li>1： 内部</li></ul><p>默认值：0</p>
     */
    public void setIsInternalApp(Long IsInternalApp) {
        this.IsInternalApp = IsInternalApp;
    }

    /**
     * Get <p>应用标识</p> 
     * @return AppId <p>应用标识</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用标识</p>
     * @param AppId <p>应用标识</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>可用区是否售罄标识，true表示已售罄，false表示未售罄。</p> 
     * @return Flag <p>可用区是否售罄标识，true表示已售罄，false表示未售罄。</p>
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set <p>可用区是否售罄标识，true表示已售罄，false表示未售罄。</p>
     * @param Flag <p>可用区是否售罄标识，true表示已售罄，false表示未售罄。</p>
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get <p>可用区名称</p> 
     * @return ZoneName <p>可用区名称</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>可用区名称</p>
     * @param ZoneName <p>可用区名称</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>可用区状态</p><p>枚举值：</p><ul><li>3： 开启</li><li>4： 关闭</li></ul><p>可用区状态以SoldOut为准</p> 
     * @return ZoneStatus <p>可用区状态</p><p>枚举值：</p><ul><li>3： 开启</li><li>4： 关闭</li></ul><p>可用区状态以SoldOut为准</p>
     */
    public Long getZoneStatus() {
        return this.ZoneStatus;
    }

    /**
     * Set <p>可用区状态</p><p>枚举值：</p><ul><li>3： 开启</li><li>4： 关闭</li></ul><p>可用区状态以SoldOut为准</p>
     * @param ZoneStatus <p>可用区状态</p><p>枚举值：</p><ul><li>3： 开启</li><li>4： 关闭</li></ul><p>可用区状态以SoldOut为准</p>
     */
    public void setZoneStatus(Long ZoneStatus) {
        this.ZoneStatus = ZoneStatus;
    }

    /**
     * Get <p>额外标识</p> 
     * @return Exflag <p>额外标识</p>
     * @deprecated
     */
    @Deprecated
    public String getExflag() {
        return this.Exflag;
    }

    /**
     * Set <p>额外标识</p>
     * @param Exflag <p>额外标识</p>
     * @deprecated
     */
    @Deprecated
    public void setExflag(String Exflag) {
        this.Exflag = Exflag;
    }

    /**
     * Get <p>true为售罄，false为未售罄</p> 
     * @return SoldOut <p>true为售罄，false为未售罄</p>
     */
    public String getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set <p>true为售罄，false为未售罄</p>
     * @param SoldOut <p>true为售罄，false为未售罄</p>
     */
    public void setSoldOut(String SoldOut) {
        this.SoldOut = SoldOut;
    }

    /**
     * Get <p>标准版售罄信息</p> 
     * @return SalesInfo <p>标准版售罄信息</p>
     */
    public SaleInfo [] getSalesInfo() {
        return this.SalesInfo;
    }

    /**
     * Set <p>标准版售罄信息</p>
     * @param SalesInfo <p>标准版售罄信息</p>
     */
    public void setSalesInfo(SaleInfo [] SalesInfo) {
        this.SalesInfo = SalesInfo;
    }

    /**
     * Get <p>额外标识</p> 
     * @return ExtraFlag <p>额外标识</p>
     */
    public String getExtraFlag() {
        return this.ExtraFlag;
    }

    /**
     * Set <p>额外标识</p>
     * @param ExtraFlag <p>额外标识</p>
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

