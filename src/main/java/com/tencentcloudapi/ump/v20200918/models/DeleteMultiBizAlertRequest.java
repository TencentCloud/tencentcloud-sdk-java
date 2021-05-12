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

public class DeleteMultiBizAlertRequest extends AbstractModel{

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
    * 点位ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 摄像头ID
    */
    @SerializedName("CameraId")
    @Expose
    private Long CameraId;

    /**
    * 消警动作:
1: 误报
2: 正报合规
3: 正报不合规，整改完成
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 图片base64字符串
    */
    @SerializedName("Image")
    @Expose
    private String Image;

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
     * Get 消警动作:
1: 误报
2: 正报合规
3: 正报不合规，整改完成 
     * @return ActionType 消警动作:
1: 误报
2: 正报合规
3: 正报不合规，整改完成
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 消警动作:
1: 误报
2: 正报合规
3: 正报不合规，整改完成
     * @param ActionType 消警动作:
1: 误报
2: 正报合规
3: 正报不合规，整改完成
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 图片base64字符串 
     * @return Image 图片base64字符串
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片base64字符串
     * @param Image 图片base64字符串
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    public DeleteMultiBizAlertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMultiBizAlertRequest(DeleteMultiBizAlertRequest source) {
        if (source.GroupCode != null) {
            this.GroupCode = new String(source.GroupCode);
        }
        if (source.MallId != null) {
            this.MallId = new Long(source.MallId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.CameraId != null) {
            this.CameraId = new Long(source.CameraId);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupCode", this.GroupCode);
        this.setParamSimple(map, prefix + "MallId", this.MallId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

