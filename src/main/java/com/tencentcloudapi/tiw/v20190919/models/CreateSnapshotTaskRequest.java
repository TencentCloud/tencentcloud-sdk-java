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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotTaskRequest extends AbstractModel{

    /**
    * 白板相关参数
    */
    @SerializedName("Whiteboard")
    @Expose
    private SnapshotWhiteboard Whiteboard;

    /**
    * 白板房间SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 白板房间号
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 白板板书生成结果通知回调地址
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

    /**
    * 白板板书文件COS存储参数， 不填默认存储在公共存储桶，公共存储桶的数据仅保存3天
    */
    @SerializedName("COS")
    @Expose
    private SnapshotCOS COS;

    /**
     * Get 白板相关参数 
     * @return Whiteboard 白板相关参数
     */
    public SnapshotWhiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set 白板相关参数
     * @param Whiteboard 白板相关参数
     */
    public void setWhiteboard(SnapshotWhiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    /**
     * Get 白板房间SdkAppId 
     * @return SdkAppId 白板房间SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 白板房间SdkAppId
     * @param SdkAppId 白板房间SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 白板房间号 
     * @return RoomId 白板房间号
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 白板房间号
     * @param RoomId 白板房间号
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 白板板书生成结果通知回调地址 
     * @return CallbackURL 白板板书生成结果通知回调地址
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set 白板板书生成结果通知回调地址
     * @param CallbackURL 白板板书生成结果通知回调地址
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    /**
     * Get 白板板书文件COS存储参数， 不填默认存储在公共存储桶，公共存储桶的数据仅保存3天 
     * @return COS 白板板书文件COS存储参数， 不填默认存储在公共存储桶，公共存储桶的数据仅保存3天
     */
    public SnapshotCOS getCOS() {
        return this.COS;
    }

    /**
     * Set 白板板书文件COS存储参数， 不填默认存储在公共存储桶，公共存储桶的数据仅保存3天
     * @param COS 白板板书文件COS存储参数， 不填默认存储在公共存储桶，公共存储桶的数据仅保存3天
     */
    public void setCOS(SnapshotCOS COS) {
        this.COS = COS;
    }

    public CreateSnapshotTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotTaskRequest(CreateSnapshotTaskRequest source) {
        if (source.Whiteboard != null) {
            this.Whiteboard = new SnapshotWhiteboard(source.Whiteboard);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
        if (source.COS != null) {
            this.COS = new SnapshotCOS(source.COS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Whiteboard.", this.Whiteboard);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);
        this.setParamObj(map, prefix + "COS.", this.COS);

    }
}

