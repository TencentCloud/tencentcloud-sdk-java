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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CameraZones extends AbstractModel{

    /**
    * 摄像头ID
    */
    @SerializedName("CameraId")
    @Expose
    private Long CameraId;

    /**
    * 摄像头名称
    */
    @SerializedName("CameraName")
    @Expose
    private String CameraName;

    /**
    * 摄像头功能:
1: 人脸
2: 人体
    */
    @SerializedName("CameraFeature")
    @Expose
    private Long CameraFeature;

    /**
    * 摄像头IP
    */
    @SerializedName("CameraIp")
    @Expose
    private String CameraIp;

    /**
    * 摄像头状态:
0: 异常 (不再使用)
1: 正常 (不再使用)
10: 初始化
11: 未知状态 (因服务内部错误产生)
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 正常
    */
    @SerializedName("CameraState")
    @Expose
    private Long CameraState;

    /**
    * 点位列表
    */
    @SerializedName("Zones")
    @Expose
    private BunkZone [] Zones;

    /**
    * 像素:
130W(1280*960)
200W(1920*1080)
400W(2560*1440)
    */
    @SerializedName("Pixel")
    @Expose
    private String Pixel;

    /**
    * 相机Rtsp地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTSP")
    @Expose
    private String RTSP;

    /**
     * Get 摄像头ID 
     * @return CameraId 摄像头ID
     */
    public Long getCameraId() {
        return this.CameraId;
    }

    /**
     * Set 摄像头ID
     * @param CameraId 摄像头ID
     */
    public void setCameraId(Long CameraId) {
        this.CameraId = CameraId;
    }

    /**
     * Get 摄像头名称 
     * @return CameraName 摄像头名称
     */
    public String getCameraName() {
        return this.CameraName;
    }

    /**
     * Set 摄像头名称
     * @param CameraName 摄像头名称
     */
    public void setCameraName(String CameraName) {
        this.CameraName = CameraName;
    }

    /**
     * Get 摄像头功能:
1: 人脸
2: 人体 
     * @return CameraFeature 摄像头功能:
1: 人脸
2: 人体
     */
    public Long getCameraFeature() {
        return this.CameraFeature;
    }

    /**
     * Set 摄像头功能:
1: 人脸
2: 人体
     * @param CameraFeature 摄像头功能:
1: 人脸
2: 人体
     */
    public void setCameraFeature(Long CameraFeature) {
        this.CameraFeature = CameraFeature;
    }

    /**
     * Get 摄像头IP 
     * @return CameraIp 摄像头IP
     */
    public String getCameraIp() {
        return this.CameraIp;
    }

    /**
     * Set 摄像头IP
     * @param CameraIp 摄像头IP
     */
    public void setCameraIp(String CameraIp) {
        this.CameraIp = CameraIp;
    }

    /**
     * Get 摄像头状态:
0: 异常 (不再使用)
1: 正常 (不再使用)
10: 初始化
11: 未知状态 (因服务内部错误产生)
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 正常 
     * @return CameraState 摄像头状态:
0: 异常 (不再使用)
1: 正常 (不再使用)
10: 初始化
11: 未知状态 (因服务内部错误产生)
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 正常
     */
    public Long getCameraState() {
        return this.CameraState;
    }

    /**
     * Set 摄像头状态:
0: 异常 (不再使用)
1: 正常 (不再使用)
10: 初始化
11: 未知状态 (因服务内部错误产生)
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 正常
     * @param CameraState 摄像头状态:
0: 异常 (不再使用)
1: 正常 (不再使用)
10: 初始化
11: 未知状态 (因服务内部错误产生)
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 正常
     */
    public void setCameraState(Long CameraState) {
        this.CameraState = CameraState;
    }

    /**
     * Get 点位列表 
     * @return Zones 点位列表
     */
    public BunkZone [] getZones() {
        return this.Zones;
    }

    /**
     * Set 点位列表
     * @param Zones 点位列表
     */
    public void setZones(BunkZone [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 像素:
130W(1280*960)
200W(1920*1080)
400W(2560*1440) 
     * @return Pixel 像素:
130W(1280*960)
200W(1920*1080)
400W(2560*1440)
     */
    public String getPixel() {
        return this.Pixel;
    }

    /**
     * Set 像素:
130W(1280*960)
200W(1920*1080)
400W(2560*1440)
     * @param Pixel 像素:
130W(1280*960)
200W(1920*1080)
400W(2560*1440)
     */
    public void setPixel(String Pixel) {
        this.Pixel = Pixel;
    }

    /**
     * Get 相机Rtsp地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTSP 相机Rtsp地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRTSP() {
        return this.RTSP;
    }

    /**
     * Set 相机Rtsp地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTSP 相机Rtsp地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTSP(String RTSP) {
        this.RTSP = RTSP;
    }

    public CameraZones() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CameraZones(CameraZones source) {
        if (source.CameraId != null) {
            this.CameraId = new Long(source.CameraId);
        }
        if (source.CameraName != null) {
            this.CameraName = new String(source.CameraName);
        }
        if (source.CameraFeature != null) {
            this.CameraFeature = new Long(source.CameraFeature);
        }
        if (source.CameraIp != null) {
            this.CameraIp = new String(source.CameraIp);
        }
        if (source.CameraState != null) {
            this.CameraState = new Long(source.CameraState);
        }
        if (source.Zones != null) {
            this.Zones = new BunkZone[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new BunkZone(source.Zones[i]);
            }
        }
        if (source.Pixel != null) {
            this.Pixel = new String(source.Pixel);
        }
        if (source.RTSP != null) {
            this.RTSP = new String(source.RTSP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "CameraName", this.CameraName);
        this.setParamSimple(map, prefix + "CameraFeature", this.CameraFeature);
        this.setParamSimple(map, prefix + "CameraIp", this.CameraIp);
        this.setParamSimple(map, prefix + "CameraState", this.CameraState);
        this.setParamArrayObj(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "Pixel", this.Pixel);
        this.setParamSimple(map, prefix + "RTSP", this.RTSP);

    }
}

