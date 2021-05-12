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

public class CameraConfig extends AbstractModel{

    /**
    * 集团编码
    */
    @SerializedName("GroupCode")
    @Expose
    private String GroupCode;

    /**
    * 广场ID
    */
    @SerializedName("MallId")
    @Expose
    private Long MallId;

    /**
    * 楼层ID
    */
    @SerializedName("FloorId")
    @Expose
    private Long FloorId;

    /**
    * 摄像头ID
    */
    @SerializedName("CameraId")
    @Expose
    private Long CameraId;

    /**
    * 摄像头IP
    */
    @SerializedName("CameraIp")
    @Expose
    private String CameraIp;

    /**
    * 摄像头Mac
    */
    @SerializedName("CameraMac")
    @Expose
    private String CameraMac;

    /**
    * 摄像头类型:
1: 码流机
2: AI相机
    */
    @SerializedName("CameraType")
    @Expose
    private Long CameraType;

    /**
    * 摄像头功能:
1: 人脸
2: 人体
    */
    @SerializedName("CameraFeature")
    @Expose
    private Long CameraFeature;

    /**
    * 摄像头是否启用:
0: 下线
1: 启用
    */
    @SerializedName("CameraState")
    @Expose
    private Long CameraState;

    /**
    * 点位ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区
    */
    @SerializedName("ZoneType")
    @Expose
    private Long ZoneType;

    /**
    * 配置
    */
    @SerializedName("Config")
    @Expose
    private Config Config;

    /**
    * 宽
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 集团编码 
     * @return GroupCode 集团编码
     */
    public String getGroupCode() {
        return this.GroupCode;
    }

    /**
     * Set 集团编码
     * @param GroupCode 集团编码
     */
    public void setGroupCode(String GroupCode) {
        this.GroupCode = GroupCode;
    }

    /**
     * Get 广场ID 
     * @return MallId 广场ID
     */
    public Long getMallId() {
        return this.MallId;
    }

    /**
     * Set 广场ID
     * @param MallId 广场ID
     */
    public void setMallId(Long MallId) {
        this.MallId = MallId;
    }

    /**
     * Get 楼层ID 
     * @return FloorId 楼层ID
     */
    public Long getFloorId() {
        return this.FloorId;
    }

    /**
     * Set 楼层ID
     * @param FloorId 楼层ID
     */
    public void setFloorId(Long FloorId) {
        this.FloorId = FloorId;
    }

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
     * Get 摄像头Mac 
     * @return CameraMac 摄像头Mac
     */
    public String getCameraMac() {
        return this.CameraMac;
    }

    /**
     * Set 摄像头Mac
     * @param CameraMac 摄像头Mac
     */
    public void setCameraMac(String CameraMac) {
        this.CameraMac = CameraMac;
    }

    /**
     * Get 摄像头类型:
1: 码流机
2: AI相机 
     * @return CameraType 摄像头类型:
1: 码流机
2: AI相机
     */
    public Long getCameraType() {
        return this.CameraType;
    }

    /**
     * Set 摄像头类型:
1: 码流机
2: AI相机
     * @param CameraType 摄像头类型:
1: 码流机
2: AI相机
     */
    public void setCameraType(Long CameraType) {
        this.CameraType = CameraType;
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
     * Get 摄像头是否启用:
0: 下线
1: 启用 
     * @return CameraState 摄像头是否启用:
0: 下线
1: 启用
     */
    public Long getCameraState() {
        return this.CameraState;
    }

    /**
     * Set 摄像头是否启用:
0: 下线
1: 启用
     * @param CameraState 摄像头是否启用:
0: 下线
1: 启用
     */
    public void setCameraState(Long CameraState) {
        this.CameraState = CameraState;
    }

    /**
     * Get 点位ID 
     * @return ZoneId 点位ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 点位ID
     * @param ZoneId 点位ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区 
     * @return ZoneType 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区
     */
    public Long getZoneType() {
        return this.ZoneType;
    }

    /**
     * Set 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区
     * @param ZoneType 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区
     */
    public void setZoneType(Long ZoneType) {
        this.ZoneType = ZoneType;
    }

    /**
     * Get 配置 
     * @return Config 配置
     */
    public Config getConfig() {
        return this.Config;
    }

    /**
     * Set 配置
     * @param Config 配置
     */
    public void setConfig(Config Config) {
        this.Config = Config;
    }

    /**
     * Get 宽 
     * @return Width 宽
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽
     * @param Width 宽
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高 
     * @return Height 高
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高
     * @param Height 高
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public CameraConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CameraConfig(CameraConfig source) {
        if (source.GroupCode != null) {
            this.GroupCode = new String(source.GroupCode);
        }
        if (source.MallId != null) {
            this.MallId = new Long(source.MallId);
        }
        if (source.FloorId != null) {
            this.FloorId = new Long(source.FloorId);
        }
        if (source.CameraId != null) {
            this.CameraId = new Long(source.CameraId);
        }
        if (source.CameraIp != null) {
            this.CameraIp = new String(source.CameraIp);
        }
        if (source.CameraMac != null) {
            this.CameraMac = new String(source.CameraMac);
        }
        if (source.CameraType != null) {
            this.CameraType = new Long(source.CameraType);
        }
        if (source.CameraFeature != null) {
            this.CameraFeature = new Long(source.CameraFeature);
        }
        if (source.CameraState != null) {
            this.CameraState = new Long(source.CameraState);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneType != null) {
            this.ZoneType = new Long(source.ZoneType);
        }
        if (source.Config != null) {
            this.Config = new Config(source.Config);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupCode", this.GroupCode);
        this.setParamSimple(map, prefix + "MallId", this.MallId);
        this.setParamSimple(map, prefix + "FloorId", this.FloorId);
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "CameraIp", this.CameraIp);
        this.setParamSimple(map, prefix + "CameraMac", this.CameraMac);
        this.setParamSimple(map, prefix + "CameraType", this.CameraType);
        this.setParamSimple(map, prefix + "CameraFeature", this.CameraFeature);
        this.setParamSimple(map, prefix + "CameraState", this.CameraState);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneType", this.ZoneType);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

