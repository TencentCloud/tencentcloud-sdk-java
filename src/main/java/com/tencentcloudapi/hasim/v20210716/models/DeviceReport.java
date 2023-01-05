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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceReport extends AbstractModel{

    /**
    * 移动设备ID
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 经度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lng")
    @Expose
    private String Lng;

    /**
    * 维度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lat")
    @Expose
    private String Lat;

    /**
    * 运营商基站ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lac")
    @Expose
    private String Lac;

    /**
    * 小区CellID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cell")
    @Expose
    private String Cell;

    /**
    * 当前上报运营商ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 信号强度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rss")
    @Expose
    private Long Rss;

    /**
    * 运营商: 1 移动 2 联通 3 电信
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tele")
    @Expose
    private Long Tele;

    /**
    * 当前设备策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tid")
    @Expose
    private Long Tid;

    /**
    * 心跳间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ping")
    @Expose
    private Long Ping;

    /**
    * 网络延迟,单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Delay")
    @Expose
    private Long Delay;

    /**
    * 高级日志启停状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Log")
    @Expose
    private Long Log;

    /**
    * 设备型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DevType")
    @Expose
    private String DevType;

    /**
    * 设备型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DevModel")
    @Expose
    private String DevModel;

    /**
    * 设备版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 设备刷新时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadTime")
    @Expose
    private String UploadTime;

    /**
    * 网络环境: 0 正常 1 弱网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 每月第一次上报心跳时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonthFirstTime")
    @Expose
    private String MonthFirstTime;

    /**
     * Get 移动设备ID 
     * @return Imei 移动设备ID
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 移动设备ID
     * @param Imei 移动设备ID
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get 经度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lng 经度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLng() {
        return this.Lng;
    }

    /**
     * Set 经度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lng 经度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLng(String Lng) {
        this.Lng = Lng;
    }

    /**
     * Get 维度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lat 维度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLat() {
        return this.Lat;
    }

    /**
     * Set 维度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lat 维度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    /**
     * Get 运营商基站ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lac 运营商基站ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLac() {
        return this.Lac;
    }

    /**
     * Set 运营商基站ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lac 运营商基站ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLac(String Lac) {
        this.Lac = Lac;
    }

    /**
     * Get 小区CellID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cell 小区CellID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCell() {
        return this.Cell;
    }

    /**
     * Set 小区CellID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cell 小区CellID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCell(String Cell) {
        this.Cell = Cell;
    }

    /**
     * Get 当前上报运营商ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Iccid 当前上报运营商ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 当前上报运营商ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Iccid 当前上报运营商ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Get 信号强度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rss 信号强度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRss() {
        return this.Rss;
    }

    /**
     * Set 信号强度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rss 信号强度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRss(Long Rss) {
        this.Rss = Rss;
    }

    /**
     * Get 运营商: 1 移动 2 联通 3 电信
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tele 运营商: 1 移动 2 联通 3 电信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTele() {
        return this.Tele;
    }

    /**
     * Set 运营商: 1 移动 2 联通 3 电信
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tele 运营商: 1 移动 2 联通 3 电信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTele(Long Tele) {
        this.Tele = Tele;
    }

    /**
     * Get 当前设备策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tid 当前设备策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTid() {
        return this.Tid;
    }

    /**
     * Set 当前设备策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tid 当前设备策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTid(Long Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 心跳间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ping 心跳间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPing() {
        return this.Ping;
    }

    /**
     * Set 心跳间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ping 心跳间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPing(Long Ping) {
        this.Ping = Ping;
    }

    /**
     * Get 网络延迟,单位毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Delay 网络延迟,单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelay() {
        return this.Delay;
    }

    /**
     * Set 网络延迟,单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Delay 网络延迟,单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelay(Long Delay) {
        this.Delay = Delay;
    }

    /**
     * Get 高级日志启停状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Log 高级日志启停状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLog() {
        return this.Log;
    }

    /**
     * Set 高级日志启停状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Log 高级日志启停状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLog(Long Log) {
        this.Log = Log;
    }

    /**
     * Get 设备型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DevType 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDevType() {
        return this.DevType;
    }

    /**
     * Set 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DevType 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevType(String DevType) {
        this.DevType = DevType;
    }

    /**
     * Get 设备型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DevModel 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDevModel() {
        return this.DevModel;
    }

    /**
     * Set 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DevModel 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevModel(String DevModel) {
        this.DevModel = DevModel;
    }

    /**
     * Get 设备版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 设备版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 设备版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 设备版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 设备刷新时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadTime 设备刷新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadTime() {
        return this.UploadTime;
    }

    /**
     * Set 设备刷新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadTime 设备刷新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadTime(String UploadTime) {
        this.UploadTime = UploadTime;
    }

    /**
     * Get 网络环境: 0 正常 1 弱网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 网络环境: 0 正常 1 弱网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 网络环境: 0 正常 1 弱网
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 网络环境: 0 正常 1 弱网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 每月第一次上报心跳时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonthFirstTime 每月第一次上报心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonthFirstTime() {
        return this.MonthFirstTime;
    }

    /**
     * Set 每月第一次上报心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonthFirstTime 每月第一次上报心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonthFirstTime(String MonthFirstTime) {
        this.MonthFirstTime = MonthFirstTime;
    }

    public DeviceReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceReport(DeviceReport source) {
        if (source.Imei != null) {
            this.Imei = new String(source.Imei);
        }
        if (source.Lng != null) {
            this.Lng = new String(source.Lng);
        }
        if (source.Lat != null) {
            this.Lat = new String(source.Lat);
        }
        if (source.Lac != null) {
            this.Lac = new String(source.Lac);
        }
        if (source.Cell != null) {
            this.Cell = new String(source.Cell);
        }
        if (source.Iccid != null) {
            this.Iccid = new String(source.Iccid);
        }
        if (source.Rss != null) {
            this.Rss = new Long(source.Rss);
        }
        if (source.Tele != null) {
            this.Tele = new Long(source.Tele);
        }
        if (source.Tid != null) {
            this.Tid = new Long(source.Tid);
        }
        if (source.Ping != null) {
            this.Ping = new Long(source.Ping);
        }
        if (source.Delay != null) {
            this.Delay = new Long(source.Delay);
        }
        if (source.Log != null) {
            this.Log = new Long(source.Log);
        }
        if (source.DevType != null) {
            this.DevType = new String(source.DevType);
        }
        if (source.DevModel != null) {
            this.DevModel = new String(source.DevModel);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.UploadTime != null) {
            this.UploadTime = new String(source.UploadTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MonthFirstTime != null) {
            this.MonthFirstTime = new String(source.MonthFirstTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Lng", this.Lng);
        this.setParamSimple(map, prefix + "Lat", this.Lat);
        this.setParamSimple(map, prefix + "Lac", this.Lac);
        this.setParamSimple(map, prefix + "Cell", this.Cell);
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "Rss", this.Rss);
        this.setParamSimple(map, prefix + "Tele", this.Tele);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "Ping", this.Ping);
        this.setParamSimple(map, prefix + "Delay", this.Delay);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "DevType", this.DevType);
        this.setParamSimple(map, prefix + "DevModel", this.DevModel);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UploadTime", this.UploadTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MonthFirstTime", this.MonthFirstTime);

    }
}

