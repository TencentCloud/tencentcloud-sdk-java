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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbZoneSellConf extends AbstractModel {

    /**
    * 可用区状态。可能的返回值为：1-上线；3-停售；4-不展示
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 可用区中文名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 实例类型是否为自定义类型
    */
    @SerializedName("IsCustom")
    @Expose
    private Boolean IsCustom;

    /**
    * 是否支持灾备
    */
    @SerializedName("IsSupportDr")
    @Expose
    private Boolean IsSupportDr;

    /**
    * 是否支持私有网络
    */
    @SerializedName("IsSupportVpc")
    @Expose
    private Boolean IsSupportVpc;

    /**
    * 小时计费实例最大售卖数量
    */
    @SerializedName("HourInstanceSaleMaxNum")
    @Expose
    private Long HourInstanceSaleMaxNum;

    /**
    * 是否为默认可用区
    */
    @SerializedName("IsDefaultZone")
    @Expose
    private Boolean IsDefaultZone;

    /**
    * 是否为黑石区
    */
    @SerializedName("IsBm")
    @Expose
    private Boolean IsBm;

    /**
    * 支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
    */
    @SerializedName("PayType")
    @Expose
    private String [] PayType;

    /**
    * 数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
    */
    @SerializedName("ProtectMode")
    @Expose
    private String [] ProtectMode;

    /**
    * 可用区名称
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 多可用区信息
    */
    @SerializedName("ZoneConf")
    @Expose
    private ZoneConf ZoneConf;

    /**
    * 可支持的灾备可用区信息
    */
    @SerializedName("DrZone")
    @Expose
    private String [] DrZone;

    /**
    * 是否支持跨可用区只读
    */
    @SerializedName("IsSupportRemoteRo")
    @Expose
    private Boolean IsSupportRemoteRo;

    /**
    * 可支持的跨可用区只读区信息
    */
    @SerializedName("RemoteRoZone")
    @Expose
    private String [] RemoteRoZone;

    /**
    * 独享型可用区状态。可能的返回值为：1-上线；3-停售；4-不展示
    */
    @SerializedName("ExClusterStatus")
    @Expose
    private Long ExClusterStatus;

    /**
    * 独享型可支持的跨可用区只读区信息
    */
    @SerializedName("ExClusterRemoteRoZone")
    @Expose
    private String [] ExClusterRemoteRoZone;

    /**
    * 独享型多可用区信息
    */
    @SerializedName("ExClusterZoneConf")
    @Expose
    private ZoneConf ExClusterZoneConf;

    /**
    * 售卖实例类型数组，其中configIds的值与configs结构体中的id一一对应。
    */
    @SerializedName("SellType")
    @Expose
    private CdbSellType [] SellType;

    /**
    * 可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 是否支持ipv6
    */
    @SerializedName("IsSupportIpv6")
    @Expose
    private Boolean IsSupportIpv6;

    /**
    * 可支持的售卖数据库引擎类型
    */
    @SerializedName("EngineType")
    @Expose
    private String [] EngineType;

    /**
    * 云盘版实例在当前可用区的售卖状态。可能的返回值为：1-上线；3-停售；4-不展示
    */
    @SerializedName("CloudNativeClusterStatus")
    @Expose
    private Long CloudNativeClusterStatus;

    /**
    * 云盘版或者单节点基础型支持的磁盘类型。
    */
    @SerializedName("DiskTypeConf")
    @Expose
    private DiskTypeConfigItem [] DiskTypeConf;

    /**
     * Get 可用区状态。可能的返回值为：1-上线；3-停售；4-不展示 
     * @return Status 可用区状态。可能的返回值为：1-上线；3-停售；4-不展示
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 可用区状态。可能的返回值为：1-上线；3-停售；4-不展示
     * @param Status 可用区状态。可能的返回值为：1-上线；3-停售；4-不展示
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 可用区中文名称 
     * @return ZoneName 可用区中文名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区中文名称
     * @param ZoneName 可用区中文名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 实例类型是否为自定义类型 
     * @return IsCustom 实例类型是否为自定义类型
     */
    public Boolean getIsCustom() {
        return this.IsCustom;
    }

    /**
     * Set 实例类型是否为自定义类型
     * @param IsCustom 实例类型是否为自定义类型
     */
    public void setIsCustom(Boolean IsCustom) {
        this.IsCustom = IsCustom;
    }

    /**
     * Get 是否支持灾备 
     * @return IsSupportDr 是否支持灾备
     */
    public Boolean getIsSupportDr() {
        return this.IsSupportDr;
    }

    /**
     * Set 是否支持灾备
     * @param IsSupportDr 是否支持灾备
     */
    public void setIsSupportDr(Boolean IsSupportDr) {
        this.IsSupportDr = IsSupportDr;
    }

    /**
     * Get 是否支持私有网络 
     * @return IsSupportVpc 是否支持私有网络
     */
    public Boolean getIsSupportVpc() {
        return this.IsSupportVpc;
    }

    /**
     * Set 是否支持私有网络
     * @param IsSupportVpc 是否支持私有网络
     */
    public void setIsSupportVpc(Boolean IsSupportVpc) {
        this.IsSupportVpc = IsSupportVpc;
    }

    /**
     * Get 小时计费实例最大售卖数量 
     * @return HourInstanceSaleMaxNum 小时计费实例最大售卖数量
     */
    public Long getHourInstanceSaleMaxNum() {
        return this.HourInstanceSaleMaxNum;
    }

    /**
     * Set 小时计费实例最大售卖数量
     * @param HourInstanceSaleMaxNum 小时计费实例最大售卖数量
     */
    public void setHourInstanceSaleMaxNum(Long HourInstanceSaleMaxNum) {
        this.HourInstanceSaleMaxNum = HourInstanceSaleMaxNum;
    }

    /**
     * Get 是否为默认可用区 
     * @return IsDefaultZone 是否为默认可用区
     */
    public Boolean getIsDefaultZone() {
        return this.IsDefaultZone;
    }

    /**
     * Set 是否为默认可用区
     * @param IsDefaultZone 是否为默认可用区
     */
    public void setIsDefaultZone(Boolean IsDefaultZone) {
        this.IsDefaultZone = IsDefaultZone;
    }

    /**
     * Get 是否为黑石区 
     * @return IsBm 是否为黑石区
     */
    public Boolean getIsBm() {
        return this.IsBm;
    }

    /**
     * Set 是否为黑石区
     * @param IsBm 是否为黑石区
     */
    public void setIsBm(Boolean IsBm) {
        this.IsBm = IsBm;
    }

    /**
     * Get 支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费 
     * @return PayType 支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
     */
    public String [] getPayType() {
        return this.PayType;
    }

    /**
     * Set 支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
     * @param PayType 支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
     */
    public void setPayType(String [] PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 数据复制类型。0-异步复制；1-半同步复制；2-强同步复制 
     * @return ProtectMode 数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
     */
    public String [] getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set 数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
     * @param ProtectMode 数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
     */
    public void setProtectMode(String [] ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get 可用区名称 
     * @return Zone 可用区名称
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称
     * @param Zone 可用区名称
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 多可用区信息 
     * @return ZoneConf 多可用区信息
     */
    public ZoneConf getZoneConf() {
        return this.ZoneConf;
    }

    /**
     * Set 多可用区信息
     * @param ZoneConf 多可用区信息
     */
    public void setZoneConf(ZoneConf ZoneConf) {
        this.ZoneConf = ZoneConf;
    }

    /**
     * Get 可支持的灾备可用区信息 
     * @return DrZone 可支持的灾备可用区信息
     */
    public String [] getDrZone() {
        return this.DrZone;
    }

    /**
     * Set 可支持的灾备可用区信息
     * @param DrZone 可支持的灾备可用区信息
     */
    public void setDrZone(String [] DrZone) {
        this.DrZone = DrZone;
    }

    /**
     * Get 是否支持跨可用区只读 
     * @return IsSupportRemoteRo 是否支持跨可用区只读
     */
    public Boolean getIsSupportRemoteRo() {
        return this.IsSupportRemoteRo;
    }

    /**
     * Set 是否支持跨可用区只读
     * @param IsSupportRemoteRo 是否支持跨可用区只读
     */
    public void setIsSupportRemoteRo(Boolean IsSupportRemoteRo) {
        this.IsSupportRemoteRo = IsSupportRemoteRo;
    }

    /**
     * Get 可支持的跨可用区只读区信息 
     * @return RemoteRoZone 可支持的跨可用区只读区信息
     */
    public String [] getRemoteRoZone() {
        return this.RemoteRoZone;
    }

    /**
     * Set 可支持的跨可用区只读区信息
     * @param RemoteRoZone 可支持的跨可用区只读区信息
     */
    public void setRemoteRoZone(String [] RemoteRoZone) {
        this.RemoteRoZone = RemoteRoZone;
    }

    /**
     * Get 独享型可用区状态。可能的返回值为：1-上线；3-停售；4-不展示 
     * @return ExClusterStatus 独享型可用区状态。可能的返回值为：1-上线；3-停售；4-不展示
     */
    public Long getExClusterStatus() {
        return this.ExClusterStatus;
    }

    /**
     * Set 独享型可用区状态。可能的返回值为：1-上线；3-停售；4-不展示
     * @param ExClusterStatus 独享型可用区状态。可能的返回值为：1-上线；3-停售；4-不展示
     */
    public void setExClusterStatus(Long ExClusterStatus) {
        this.ExClusterStatus = ExClusterStatus;
    }

    /**
     * Get 独享型可支持的跨可用区只读区信息 
     * @return ExClusterRemoteRoZone 独享型可支持的跨可用区只读区信息
     */
    public String [] getExClusterRemoteRoZone() {
        return this.ExClusterRemoteRoZone;
    }

    /**
     * Set 独享型可支持的跨可用区只读区信息
     * @param ExClusterRemoteRoZone 独享型可支持的跨可用区只读区信息
     */
    public void setExClusterRemoteRoZone(String [] ExClusterRemoteRoZone) {
        this.ExClusterRemoteRoZone = ExClusterRemoteRoZone;
    }

    /**
     * Get 独享型多可用区信息 
     * @return ExClusterZoneConf 独享型多可用区信息
     */
    public ZoneConf getExClusterZoneConf() {
        return this.ExClusterZoneConf;
    }

    /**
     * Set 独享型多可用区信息
     * @param ExClusterZoneConf 独享型多可用区信息
     */
    public void setExClusterZoneConf(ZoneConf ExClusterZoneConf) {
        this.ExClusterZoneConf = ExClusterZoneConf;
    }

    /**
     * Get 售卖实例类型数组，其中configIds的值与configs结构体中的id一一对应。 
     * @return SellType 售卖实例类型数组，其中configIds的值与configs结构体中的id一一对应。
     */
    public CdbSellType [] getSellType() {
        return this.SellType;
    }

    /**
     * Set 售卖实例类型数组，其中configIds的值与configs结构体中的id一一对应。
     * @param SellType 售卖实例类型数组，其中configIds的值与configs结构体中的id一一对应。
     */
    public void setSellType(CdbSellType [] SellType) {
        this.SellType = SellType;
    }

    /**
     * Get 可用区id 
     * @return ZoneId 可用区id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区id
     * @param ZoneId 可用区id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 是否支持ipv6 
     * @return IsSupportIpv6 是否支持ipv6
     */
    public Boolean getIsSupportIpv6() {
        return this.IsSupportIpv6;
    }

    /**
     * Set 是否支持ipv6
     * @param IsSupportIpv6 是否支持ipv6
     */
    public void setIsSupportIpv6(Boolean IsSupportIpv6) {
        this.IsSupportIpv6 = IsSupportIpv6;
    }

    /**
     * Get 可支持的售卖数据库引擎类型 
     * @return EngineType 可支持的售卖数据库引擎类型
     */
    public String [] getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 可支持的售卖数据库引擎类型
     * @param EngineType 可支持的售卖数据库引擎类型
     */
    public void setEngineType(String [] EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 云盘版实例在当前可用区的售卖状态。可能的返回值为：1-上线；3-停售；4-不展示 
     * @return CloudNativeClusterStatus 云盘版实例在当前可用区的售卖状态。可能的返回值为：1-上线；3-停售；4-不展示
     */
    public Long getCloudNativeClusterStatus() {
        return this.CloudNativeClusterStatus;
    }

    /**
     * Set 云盘版实例在当前可用区的售卖状态。可能的返回值为：1-上线；3-停售；4-不展示
     * @param CloudNativeClusterStatus 云盘版实例在当前可用区的售卖状态。可能的返回值为：1-上线；3-停售；4-不展示
     */
    public void setCloudNativeClusterStatus(Long CloudNativeClusterStatus) {
        this.CloudNativeClusterStatus = CloudNativeClusterStatus;
    }

    /**
     * Get 云盘版或者单节点基础型支持的磁盘类型。 
     * @return DiskTypeConf 云盘版或者单节点基础型支持的磁盘类型。
     */
    public DiskTypeConfigItem [] getDiskTypeConf() {
        return this.DiskTypeConf;
    }

    /**
     * Set 云盘版或者单节点基础型支持的磁盘类型。
     * @param DiskTypeConf 云盘版或者单节点基础型支持的磁盘类型。
     */
    public void setDiskTypeConf(DiskTypeConfigItem [] DiskTypeConf) {
        this.DiskTypeConf = DiskTypeConf;
    }

    public CdbZoneSellConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbZoneSellConf(CdbZoneSellConf source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.IsCustom != null) {
            this.IsCustom = new Boolean(source.IsCustom);
        }
        if (source.IsSupportDr != null) {
            this.IsSupportDr = new Boolean(source.IsSupportDr);
        }
        if (source.IsSupportVpc != null) {
            this.IsSupportVpc = new Boolean(source.IsSupportVpc);
        }
        if (source.HourInstanceSaleMaxNum != null) {
            this.HourInstanceSaleMaxNum = new Long(source.HourInstanceSaleMaxNum);
        }
        if (source.IsDefaultZone != null) {
            this.IsDefaultZone = new Boolean(source.IsDefaultZone);
        }
        if (source.IsBm != null) {
            this.IsBm = new Boolean(source.IsBm);
        }
        if (source.PayType != null) {
            this.PayType = new String[source.PayType.length];
            for (int i = 0; i < source.PayType.length; i++) {
                this.PayType[i] = new String(source.PayType[i]);
            }
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new String[source.ProtectMode.length];
            for (int i = 0; i < source.ProtectMode.length; i++) {
                this.ProtectMode[i] = new String(source.ProtectMode[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneConf != null) {
            this.ZoneConf = new ZoneConf(source.ZoneConf);
        }
        if (source.DrZone != null) {
            this.DrZone = new String[source.DrZone.length];
            for (int i = 0; i < source.DrZone.length; i++) {
                this.DrZone[i] = new String(source.DrZone[i]);
            }
        }
        if (source.IsSupportRemoteRo != null) {
            this.IsSupportRemoteRo = new Boolean(source.IsSupportRemoteRo);
        }
        if (source.RemoteRoZone != null) {
            this.RemoteRoZone = new String[source.RemoteRoZone.length];
            for (int i = 0; i < source.RemoteRoZone.length; i++) {
                this.RemoteRoZone[i] = new String(source.RemoteRoZone[i]);
            }
        }
        if (source.ExClusterStatus != null) {
            this.ExClusterStatus = new Long(source.ExClusterStatus);
        }
        if (source.ExClusterRemoteRoZone != null) {
            this.ExClusterRemoteRoZone = new String[source.ExClusterRemoteRoZone.length];
            for (int i = 0; i < source.ExClusterRemoteRoZone.length; i++) {
                this.ExClusterRemoteRoZone[i] = new String(source.ExClusterRemoteRoZone[i]);
            }
        }
        if (source.ExClusterZoneConf != null) {
            this.ExClusterZoneConf = new ZoneConf(source.ExClusterZoneConf);
        }
        if (source.SellType != null) {
            this.SellType = new CdbSellType[source.SellType.length];
            for (int i = 0; i < source.SellType.length; i++) {
                this.SellType[i] = new CdbSellType(source.SellType[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.IsSupportIpv6 != null) {
            this.IsSupportIpv6 = new Boolean(source.IsSupportIpv6);
        }
        if (source.EngineType != null) {
            this.EngineType = new String[source.EngineType.length];
            for (int i = 0; i < source.EngineType.length; i++) {
                this.EngineType[i] = new String(source.EngineType[i]);
            }
        }
        if (source.CloudNativeClusterStatus != null) {
            this.CloudNativeClusterStatus = new Long(source.CloudNativeClusterStatus);
        }
        if (source.DiskTypeConf != null) {
            this.DiskTypeConf = new DiskTypeConfigItem[source.DiskTypeConf.length];
            for (int i = 0; i < source.DiskTypeConf.length; i++) {
                this.DiskTypeConf[i] = new DiskTypeConfigItem(source.DiskTypeConf[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "IsCustom", this.IsCustom);
        this.setParamSimple(map, prefix + "IsSupportDr", this.IsSupportDr);
        this.setParamSimple(map, prefix + "IsSupportVpc", this.IsSupportVpc);
        this.setParamSimple(map, prefix + "HourInstanceSaleMaxNum", this.HourInstanceSaleMaxNum);
        this.setParamSimple(map, prefix + "IsDefaultZone", this.IsDefaultZone);
        this.setParamSimple(map, prefix + "IsBm", this.IsBm);
        this.setParamArraySimple(map, prefix + "PayType.", this.PayType);
        this.setParamArraySimple(map, prefix + "ProtectMode.", this.ProtectMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "ZoneConf.", this.ZoneConf);
        this.setParamArraySimple(map, prefix + "DrZone.", this.DrZone);
        this.setParamSimple(map, prefix + "IsSupportRemoteRo", this.IsSupportRemoteRo);
        this.setParamArraySimple(map, prefix + "RemoteRoZone.", this.RemoteRoZone);
        this.setParamSimple(map, prefix + "ExClusterStatus", this.ExClusterStatus);
        this.setParamArraySimple(map, prefix + "ExClusterRemoteRoZone.", this.ExClusterRemoteRoZone);
        this.setParamObj(map, prefix + "ExClusterZoneConf.", this.ExClusterZoneConf);
        this.setParamArrayObj(map, prefix + "SellType.", this.SellType);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsSupportIpv6", this.IsSupportIpv6);
        this.setParamArraySimple(map, prefix + "EngineType.", this.EngineType);
        this.setParamSimple(map, prefix + "CloudNativeClusterStatus", this.CloudNativeClusterStatus);
        this.setParamArrayObj(map, prefix + "DiskTypeConf.", this.DiskTypeConf);

    }
}

