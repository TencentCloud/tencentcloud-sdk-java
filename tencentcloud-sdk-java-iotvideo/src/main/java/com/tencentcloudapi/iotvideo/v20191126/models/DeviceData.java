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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceData extends AbstractModel{

    /**
    * 设备TID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 激活时间 0代表未激活
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveTime")
    @Expose
    private Long ActiveTime;

    /**
    * 设备是否被禁用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * 固件版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 设备在线状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private Long LastOnlineTime;

    /**
    * 物模型json数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IotModel")
    @Expose
    private String IotModel;

    /**
    * 设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 产品ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备初始证书信息，base64编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * 设备私钥下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhiteBoxSoUrl")
    @Expose
    private String WhiteBoxSoUrl;

    /**
    * 设备推流状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamStatus")
    @Expose
    private Boolean StreamStatus;

    /**
     * Get 设备TID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tid 设备TID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tid 设备TID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 激活时间 0代表未激活
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveTime 激活时间 0代表未激活
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 激活时间 0代表未激活
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveTime 激活时间 0代表未激活
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveTime(Long ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 设备是否被禁用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disabled 设备是否被禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 设备是否被禁用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disabled 设备是否被禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get 固件版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtaVersion 固件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 固件版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtaVersion 固件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 设备在线状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Online 设备在线状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 设备在线状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Online 设备在线状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOnlineTime 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastOnlineTime() {
        return this.LastOnlineTime;
    }

    /**
     * Set 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOnlineTime 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOnlineTime(Long LastOnlineTime) {
        this.LastOnlineTime = LastOnlineTime;
    }

    /**
     * Get 物模型json数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IotModel 物模型json数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIotModel() {
        return this.IotModel;
    }

    /**
     * Set 物模型json数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param IotModel 物模型json数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIotModel(String IotModel) {
        this.IotModel = IotModel;
    }

    /**
     * Get 设备名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 产品ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备初始证书信息，base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate 设备初始证书信息，base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 设备初始证书信息，base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate 设备初始证书信息，base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 设备私钥下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhiteBoxSoUrl 设备私钥下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWhiteBoxSoUrl() {
        return this.WhiteBoxSoUrl;
    }

    /**
     * Set 设备私钥下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhiteBoxSoUrl 设备私钥下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhiteBoxSoUrl(String WhiteBoxSoUrl) {
        this.WhiteBoxSoUrl = WhiteBoxSoUrl;
    }

    /**
     * Get 设备推流状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamStatus 设备推流状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStreamStatus() {
        return this.StreamStatus;
    }

    /**
     * Set 设备推流状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamStatus 设备推流状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamStatus(Boolean StreamStatus) {
        this.StreamStatus = StreamStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);
        this.setParamSimple(map, prefix + "IotModel", this.IotModel);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "WhiteBoxSoUrl", this.WhiteBoxSoUrl);
        this.setParamSimple(map, prefix + "StreamStatus", this.StreamStatus);

    }
}

