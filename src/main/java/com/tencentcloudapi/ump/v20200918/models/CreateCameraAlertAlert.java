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

public class CreateCameraAlertAlert extends AbstractModel{

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
    * 相机ID
    */
    @SerializedName("CameraId")
    @Expose
    private Long CameraId;

    /**
    * 时间戳,ms,默认为告警请求到达时间
    */
    @SerializedName("CaptureTime")
    @Expose
    private Long CaptureTime;

    /**
    * 图片base64编码
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 移动告警
    */
    @SerializedName("MoveAlert")
    @Expose
    private CreateCameraAlertsMoveAlert MoveAlert;

    /**
    * 遮挡告警
    */
    @SerializedName("CoverAlert")
    @Expose
    private CreateCameraAlertsCoverAlert CoverAlert;

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
     * Get 相机ID 
     * @return CameraId 相机ID
     */
    public Long getCameraId() {
        return this.CameraId;
    }

    /**
     * Set 相机ID
     * @param CameraId 相机ID
     */
    public void setCameraId(Long CameraId) {
        this.CameraId = CameraId;
    }

    /**
     * Get 时间戳,ms,默认为告警请求到达时间 
     * @return CaptureTime 时间戳,ms,默认为告警请求到达时间
     */
    public Long getCaptureTime() {
        return this.CaptureTime;
    }

    /**
     * Set 时间戳,ms,默认为告警请求到达时间
     * @param CaptureTime 时间戳,ms,默认为告警请求到达时间
     */
    public void setCaptureTime(Long CaptureTime) {
        this.CaptureTime = CaptureTime;
    }

    /**
     * Get 图片base64编码 
     * @return Image 图片base64编码
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片base64编码
     * @param Image 图片base64编码
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 移动告警 
     * @return MoveAlert 移动告警
     */
    public CreateCameraAlertsMoveAlert getMoveAlert() {
        return this.MoveAlert;
    }

    /**
     * Set 移动告警
     * @param MoveAlert 移动告警
     */
    public void setMoveAlert(CreateCameraAlertsMoveAlert MoveAlert) {
        this.MoveAlert = MoveAlert;
    }

    /**
     * Get 遮挡告警 
     * @return CoverAlert 遮挡告警
     */
    public CreateCameraAlertsCoverAlert getCoverAlert() {
        return this.CoverAlert;
    }

    /**
     * Set 遮挡告警
     * @param CoverAlert 遮挡告警
     */
    public void setCoverAlert(CreateCameraAlertsCoverAlert CoverAlert) {
        this.CoverAlert = CoverAlert;
    }

    public CreateCameraAlertAlert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCameraAlertAlert(CreateCameraAlertAlert source) {
        if (source.GroupCode != null) {
            this.GroupCode = new String(source.GroupCode);
        }
        if (source.MallId != null) {
            this.MallId = new Long(source.MallId);
        }
        if (source.CameraId != null) {
            this.CameraId = new Long(source.CameraId);
        }
        if (source.CaptureTime != null) {
            this.CaptureTime = new Long(source.CaptureTime);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.MoveAlert != null) {
            this.MoveAlert = new CreateCameraAlertsMoveAlert(source.MoveAlert);
        }
        if (source.CoverAlert != null) {
            this.CoverAlert = new CreateCameraAlertsCoverAlert(source.CoverAlert);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupCode", this.GroupCode);
        this.setParamSimple(map, prefix + "MallId", this.MallId);
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "CaptureTime", this.CaptureTime);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamObj(map, prefix + "MoveAlert.", this.MoveAlert);
        this.setParamObj(map, prefix + "CoverAlert.", this.CoverAlert);

    }
}

