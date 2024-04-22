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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleInfo extends AbstractModel {

    /**
    * IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * HostIP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 原始IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginIP")
    @Expose
    private String OriginIP;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 资产ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 纬度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * 经度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 企业名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 家族团伙
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Family")
    @Expose
    private String Family;

    /**
    * 病毒名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * MD5值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 恶意进程文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 1:主机资产 2:域名资产 3:网络资产
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
    * 来源日志分析的信息字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromLogAnalysisData")
    @Expose
    private KeyValue [] FromLogAnalysisData;

    /**
     * Get IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get HostIP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIP HostIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set HostIP
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIP HostIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 原始IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginIP 原始IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginIP() {
        return this.OriginIP;
    }

    /**
     * Set 原始IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginIP 原始IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginIP(String OriginIP) {
        this.OriginIP = OriginIP;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 资产ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID 资产ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 资产ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID 资产ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Country 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 纬度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Latitude 纬度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 纬度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Latitude 纬度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 经度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Longitude 经度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 经度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Longitude 经度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Info 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Info 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 企业名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Account 账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Account 账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 家族团伙
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Family 家族团伙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFamily() {
        return this.Family;
    }

    /**
     * Set 家族团伙
注意：此字段可能返回 null，表示取不到有效值。
     * @param Family 家族团伙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFamily(String Family) {
        this.Family = Family;
    }

    /**
     * Get 病毒名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusName 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusName 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get MD5值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MD5 MD5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set MD5值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MD5 MD5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 恶意进程文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 恶意进程文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 恶意进程文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 恶意进程文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 1:主机资产 2:域名资产 3:网络资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 1:主机资产 2:域名资产 3:网络资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 1:主机资产 2:域名资产 3:网络资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 1:主机资产 2:域名资产 3:网络资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 来源日志分析的信息字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromLogAnalysisData 来源日志分析的信息字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValue [] getFromLogAnalysisData() {
        return this.FromLogAnalysisData;
    }

    /**
     * Set 来源日志分析的信息字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromLogAnalysisData 来源日志分析的信息字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromLogAnalysisData(KeyValue [] FromLogAnalysisData) {
        this.FromLogAnalysisData = FromLogAnalysisData;
    }

    public RoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleInfo(RoleInfo source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.OriginIP != null) {
            this.OriginIP = new String(source.OriginIP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Latitude != null) {
            this.Latitude = new String(source.Latitude);
        }
        if (source.Longitude != null) {
            this.Longitude = new String(source.Longitude);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Family != null) {
            this.Family = new String(source.Family);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
        }
        if (source.FromLogAnalysisData != null) {
            this.FromLogAnalysisData = new KeyValue[source.FromLogAnalysisData.length];
            for (int i = 0; i < source.FromLogAnalysisData.length; i++) {
                this.FromLogAnalysisData[i] = new KeyValue(source.FromLogAnalysisData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "OriginIP", this.OriginIP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Family", this.Family);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArrayObj(map, prefix + "FromLogAnalysisData.", this.FromLogAnalysisData);

    }
}

