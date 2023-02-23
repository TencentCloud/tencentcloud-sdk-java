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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceNetInfo extends AbstractModel{

    /**
    * 网络类型：
0:数据
1:Wi-Fi
2:有线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 启用/禁用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEnable")
    @Expose
    private Boolean DataEnable;

    /**
    * 上行限速
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadLimit")
    @Expose
    private String UploadLimit;

    /**
    * 下行限速
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadLimit")
    @Expose
    private String DownloadLimit;

    /**
    * 接收实时速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataRx")
    @Expose
    private Long DataRx;

    /**
    * 发送实时速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataTx")
    @Expose
    private Long DataTx;

    /**
    * 运营商类型：
1: 中国移动；
2: 中国电信; 
3: 中国联通
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vendor")
    @Expose
    private Long Vendor;

    /**
    * 连接状态：
0:无连接
1:连接中
2:已连接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 公网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 信号强度/单位：dbm
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignalStrength")
    @Expose
    private Long SignalStrength;

    /**
    * 数据网络类型：
-1 ：无效值   
2：2G 
3：3G 
4：4G 
5：5G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rat")
    @Expose
    private Long Rat;

    /**
    * 网卡名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetInfoName")
    @Expose
    private String NetInfoName;

    /**
    * 下行实时速率（浮点数类型代替上一版本DataRx的整型）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownRate")
    @Expose
    private Float DownRate;

    /**
    * 上行实时速率（浮点数类型代替上一版本TxRate的整型）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpRate")
    @Expose
    private Float UpRate;

    /**
     * Get 网络类型：
0:数据
1:Wi-Fi
2:有线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 网络类型：
0:数据
1:Wi-Fi
2:有线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 网络类型：
0:数据
1:Wi-Fi
2:有线
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 网络类型：
0:数据
1:Wi-Fi
2:有线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 启用/禁用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEnable 启用/禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDataEnable() {
        return this.DataEnable;
    }

    /**
     * Set 启用/禁用
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEnable 启用/禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEnable(Boolean DataEnable) {
        this.DataEnable = DataEnable;
    }

    /**
     * Get 上行限速
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadLimit 上行限速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadLimit() {
        return this.UploadLimit;
    }

    /**
     * Set 上行限速
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadLimit 上行限速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadLimit(String UploadLimit) {
        this.UploadLimit = UploadLimit;
    }

    /**
     * Get 下行限速
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadLimit 下行限速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadLimit() {
        return this.DownloadLimit;
    }

    /**
     * Set 下行限速
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadLimit 下行限速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadLimit(String DownloadLimit) {
        this.DownloadLimit = DownloadLimit;
    }

    /**
     * Get 接收实时速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataRx 接收实时速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataRx() {
        return this.DataRx;
    }

    /**
     * Set 接收实时速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataRx 接收实时速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataRx(Long DataRx) {
        this.DataRx = DataRx;
    }

    /**
     * Get 发送实时速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataTx 发送实时速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataTx() {
        return this.DataTx;
    }

    /**
     * Set 发送实时速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataTx 发送实时速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataTx(Long DataTx) {
        this.DataTx = DataTx;
    }

    /**
     * Get 运营商类型：
1: 中国移动；
2: 中国电信; 
3: 中国联通
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vendor 运营商类型：
1: 中国移动；
2: 中国电信; 
3: 中国联通
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVendor() {
        return this.Vendor;
    }

    /**
     * Set 运营商类型：
1: 中国移动；
2: 中国电信; 
3: 中国联通
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vendor 运营商类型：
1: 中国移动；
2: 中国电信; 
3: 中国联通
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVendor(Long Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get 连接状态：
0:无连接
1:连接中
2:已连接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 连接状态：
0:无连接
1:连接中
2:已连接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 连接状态：
0:无连接
1:连接中
2:已连接
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 连接状态：
0:无连接
1:连接中
2:已连接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 公网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 信号强度/单位：dbm
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignalStrength 信号强度/单位：dbm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSignalStrength() {
        return this.SignalStrength;
    }

    /**
     * Set 信号强度/单位：dbm
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignalStrength 信号强度/单位：dbm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignalStrength(Long SignalStrength) {
        this.SignalStrength = SignalStrength;
    }

    /**
     * Get 数据网络类型：
-1 ：无效值   
2：2G 
3：3G 
4：4G 
5：5G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rat 数据网络类型：
-1 ：无效值   
2：2G 
3：3G 
4：4G 
5：5G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRat() {
        return this.Rat;
    }

    /**
     * Set 数据网络类型：
-1 ：无效值   
2：2G 
3：3G 
4：4G 
5：5G
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rat 数据网络类型：
-1 ：无效值   
2：2G 
3：3G 
4：4G 
5：5G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRat(Long Rat) {
        this.Rat = Rat;
    }

    /**
     * Get 网卡名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetInfoName 网卡名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetInfoName() {
        return this.NetInfoName;
    }

    /**
     * Set 网卡名
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetInfoName 网卡名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetInfoName(String NetInfoName) {
        this.NetInfoName = NetInfoName;
    }

    /**
     * Get 下行实时速率（浮点数类型代替上一版本DataRx的整型）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownRate 下行实时速率（浮点数类型代替上一版本DataRx的整型）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDownRate() {
        return this.DownRate;
    }

    /**
     * Set 下行实时速率（浮点数类型代替上一版本DataRx的整型）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownRate 下行实时速率（浮点数类型代替上一版本DataRx的整型）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownRate(Float DownRate) {
        this.DownRate = DownRate;
    }

    /**
     * Get 上行实时速率（浮点数类型代替上一版本TxRate的整型）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpRate 上行实时速率（浮点数类型代替上一版本TxRate的整型）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUpRate() {
        return this.UpRate;
    }

    /**
     * Set 上行实时速率（浮点数类型代替上一版本TxRate的整型）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpRate 上行实时速率（浮点数类型代替上一版本TxRate的整型）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpRate(Float UpRate) {
        this.UpRate = UpRate;
    }

    public DeviceNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceNetInfo(DeviceNetInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DataEnable != null) {
            this.DataEnable = new Boolean(source.DataEnable);
        }
        if (source.UploadLimit != null) {
            this.UploadLimit = new String(source.UploadLimit);
        }
        if (source.DownloadLimit != null) {
            this.DownloadLimit = new String(source.DownloadLimit);
        }
        if (source.DataRx != null) {
            this.DataRx = new Long(source.DataRx);
        }
        if (source.DataTx != null) {
            this.DataTx = new Long(source.DataTx);
        }
        if (source.Vendor != null) {
            this.Vendor = new Long(source.Vendor);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.SignalStrength != null) {
            this.SignalStrength = new Long(source.SignalStrength);
        }
        if (source.Rat != null) {
            this.Rat = new Long(source.Rat);
        }
        if (source.NetInfoName != null) {
            this.NetInfoName = new String(source.NetInfoName);
        }
        if (source.DownRate != null) {
            this.DownRate = new Float(source.DownRate);
        }
        if (source.UpRate != null) {
            this.UpRate = new Float(source.UpRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DataEnable", this.DataEnable);
        this.setParamSimple(map, prefix + "UploadLimit", this.UploadLimit);
        this.setParamSimple(map, prefix + "DownloadLimit", this.DownloadLimit);
        this.setParamSimple(map, prefix + "DataRx", this.DataRx);
        this.setParamSimple(map, prefix + "DataTx", this.DataTx);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "SignalStrength", this.SignalStrength);
        this.setParamSimple(map, prefix + "Rat", this.Rat);
        this.setParamSimple(map, prefix + "NetInfoName", this.NetInfoName);
        this.setParamSimple(map, prefix + "DownRate", this.DownRate);
        this.setParamSimple(map, prefix + "UpRate", this.UpRate);

    }
}

