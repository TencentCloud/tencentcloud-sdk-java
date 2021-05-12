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

public class Config extends AbstractModel{

    /**
    * 摄像头厂商:
H: 海康
D: 大华
Y: 英飞拓
L: 联纵
    */
    @SerializedName("CameraProducer")
    @Expose
    private String CameraProducer;

    /**
    * rtsp 地址
    */
    @SerializedName("RTSP")
    @Expose
    private String RTSP;

    /**
    * 摄像头帧率
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 解码帧率
    */
    @SerializedName("DecodeFps")
    @Expose
    private Long DecodeFps;

    /**
    * 是否做客流计算:
0: 否
1: 是
    */
    @SerializedName("PassengerFlow")
    @Expose
    private Long PassengerFlow;

    /**
    * 是否打开人脸曝光:
0: 关闭
1: 开启
    */
    @SerializedName("FaceExpose")
    @Expose
    private Long FaceExpose;

    /**
    * 门线标注
    */
    @SerializedName("MallArea")
    @Expose
    private Point [] MallArea;

    /**
    * 店门标注
    */
    @SerializedName("ShopArea")
    @Expose
    private Point [] ShopArea;

    /**
    * 检测区标注
    */
    @SerializedName("TrackAreas")
    @Expose
    private Polygon [] TrackAreas;

    /**
    * 点位列表（品类区）
    */
    @SerializedName("Zones")
    @Expose
    private ZoneArea [] Zones;

    /**
     * Get 摄像头厂商:
H: 海康
D: 大华
Y: 英飞拓
L: 联纵 
     * @return CameraProducer 摄像头厂商:
H: 海康
D: 大华
Y: 英飞拓
L: 联纵
     */
    public String getCameraProducer() {
        return this.CameraProducer;
    }

    /**
     * Set 摄像头厂商:
H: 海康
D: 大华
Y: 英飞拓
L: 联纵
     * @param CameraProducer 摄像头厂商:
H: 海康
D: 大华
Y: 英飞拓
L: 联纵
     */
    public void setCameraProducer(String CameraProducer) {
        this.CameraProducer = CameraProducer;
    }

    /**
     * Get rtsp 地址 
     * @return RTSP rtsp 地址
     */
    public String getRTSP() {
        return this.RTSP;
    }

    /**
     * Set rtsp 地址
     * @param RTSP rtsp 地址
     */
    public void setRTSP(String RTSP) {
        this.RTSP = RTSP;
    }

    /**
     * Get 摄像头帧率 
     * @return Fps 摄像头帧率
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 摄像头帧率
     * @param Fps 摄像头帧率
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 解码帧率 
     * @return DecodeFps 解码帧率
     */
    public Long getDecodeFps() {
        return this.DecodeFps;
    }

    /**
     * Set 解码帧率
     * @param DecodeFps 解码帧率
     */
    public void setDecodeFps(Long DecodeFps) {
        this.DecodeFps = DecodeFps;
    }

    /**
     * Get 是否做客流计算:
0: 否
1: 是 
     * @return PassengerFlow 是否做客流计算:
0: 否
1: 是
     */
    public Long getPassengerFlow() {
        return this.PassengerFlow;
    }

    /**
     * Set 是否做客流计算:
0: 否
1: 是
     * @param PassengerFlow 是否做客流计算:
0: 否
1: 是
     */
    public void setPassengerFlow(Long PassengerFlow) {
        this.PassengerFlow = PassengerFlow;
    }

    /**
     * Get 是否打开人脸曝光:
0: 关闭
1: 开启 
     * @return FaceExpose 是否打开人脸曝光:
0: 关闭
1: 开启
     */
    public Long getFaceExpose() {
        return this.FaceExpose;
    }

    /**
     * Set 是否打开人脸曝光:
0: 关闭
1: 开启
     * @param FaceExpose 是否打开人脸曝光:
0: 关闭
1: 开启
     */
    public void setFaceExpose(Long FaceExpose) {
        this.FaceExpose = FaceExpose;
    }

    /**
     * Get 门线标注 
     * @return MallArea 门线标注
     */
    public Point [] getMallArea() {
        return this.MallArea;
    }

    /**
     * Set 门线标注
     * @param MallArea 门线标注
     */
    public void setMallArea(Point [] MallArea) {
        this.MallArea = MallArea;
    }

    /**
     * Get 店门标注 
     * @return ShopArea 店门标注
     */
    public Point [] getShopArea() {
        return this.ShopArea;
    }

    /**
     * Set 店门标注
     * @param ShopArea 店门标注
     */
    public void setShopArea(Point [] ShopArea) {
        this.ShopArea = ShopArea;
    }

    /**
     * Get 检测区标注 
     * @return TrackAreas 检测区标注
     */
    public Polygon [] getTrackAreas() {
        return this.TrackAreas;
    }

    /**
     * Set 检测区标注
     * @param TrackAreas 检测区标注
     */
    public void setTrackAreas(Polygon [] TrackAreas) {
        this.TrackAreas = TrackAreas;
    }

    /**
     * Get 点位列表（品类区） 
     * @return Zones 点位列表（品类区）
     */
    public ZoneArea [] getZones() {
        return this.Zones;
    }

    /**
     * Set 点位列表（品类区）
     * @param Zones 点位列表（品类区）
     */
    public void setZones(ZoneArea [] Zones) {
        this.Zones = Zones;
    }

    public Config() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Config(Config source) {
        if (source.CameraProducer != null) {
            this.CameraProducer = new String(source.CameraProducer);
        }
        if (source.RTSP != null) {
            this.RTSP = new String(source.RTSP);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.DecodeFps != null) {
            this.DecodeFps = new Long(source.DecodeFps);
        }
        if (source.PassengerFlow != null) {
            this.PassengerFlow = new Long(source.PassengerFlow);
        }
        if (source.FaceExpose != null) {
            this.FaceExpose = new Long(source.FaceExpose);
        }
        if (source.MallArea != null) {
            this.MallArea = new Point[source.MallArea.length];
            for (int i = 0; i < source.MallArea.length; i++) {
                this.MallArea[i] = new Point(source.MallArea[i]);
            }
        }
        if (source.ShopArea != null) {
            this.ShopArea = new Point[source.ShopArea.length];
            for (int i = 0; i < source.ShopArea.length; i++) {
                this.ShopArea[i] = new Point(source.ShopArea[i]);
            }
        }
        if (source.TrackAreas != null) {
            this.TrackAreas = new Polygon[source.TrackAreas.length];
            for (int i = 0; i < source.TrackAreas.length; i++) {
                this.TrackAreas[i] = new Polygon(source.TrackAreas[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new ZoneArea[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new ZoneArea(source.Zones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CameraProducer", this.CameraProducer);
        this.setParamSimple(map, prefix + "RTSP", this.RTSP);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "DecodeFps", this.DecodeFps);
        this.setParamSimple(map, prefix + "PassengerFlow", this.PassengerFlow);
        this.setParamSimple(map, prefix + "FaceExpose", this.FaceExpose);
        this.setParamArrayObj(map, prefix + "MallArea.", this.MallArea);
        this.setParamArrayObj(map, prefix + "ShopArea.", this.ShopArea);
        this.setParamArrayObj(map, prefix + "TrackAreas.", this.TrackAreas);
        this.setParamArrayObj(map, prefix + "Zones.", this.Zones);

    }
}

