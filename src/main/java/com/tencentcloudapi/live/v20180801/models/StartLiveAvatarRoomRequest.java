/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartLiveAvatarRoomRequest extends AbstractModel {

    /**
    * <p>数字人直播间 ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>目标地址描述。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>推流目标地址。</p>
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

    /**
    * <p>操作者。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul>
    */
    @SerializedName("RoomType")
    @Expose
    private String RoomType;

    /**
    * <p>交互模式下的协议，支持rtmp和trtc，默认是rtmp</p>
    */
    @SerializedName("SessionProtocol")
    @Expose
    private String SessionProtocol;

    /**
    * <p>使用trtc协议时，在trtc的appid</p>
    */
    @SerializedName("TrtcSdkAppId")
    @Expose
    private String TrtcSdkAppId;

    /**
    * <p>进入房间时需要用UserSign来校验权限</p>
    */
    @SerializedName("TrtcUserSig")
    @Expose
    private String TrtcUserSig;

    /**
    * <p>要进入的房间</p>
    */
    @SerializedName("TrtcRoomId")
    @Expose
    private String TrtcRoomId;

    /**
     * Get <p>数字人直播间 ID。</p> 
     * @return RoomId <p>数字人直播间 ID。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>数字人直播间 ID。</p>
     * @param RoomId <p>数字人直播间 ID。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>目标地址描述。</p> 
     * @return Comment <p>目标地址描述。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>目标地址描述。</p>
     * @param Comment <p>目标地址描述。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>推流目标地址。</p> 
     * @return ToUrl <p>推流目标地址。</p>
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set <p>推流目标地址。</p>
     * @param ToUrl <p>推流目标地址。</p>
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * Get <p>操作者。</p> 
     * @return Operator <p>操作者。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者。</p>
     * @param Operator <p>操作者。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul> 
     * @return RoomType <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul>
     */
    public String getRoomType() {
        return this.RoomType;
    }

    /**
     * Set <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul>
     * @param RoomType <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul>
     */
    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get <p>交互模式下的协议，支持rtmp和trtc，默认是rtmp</p> 
     * @return SessionProtocol <p>交互模式下的协议，支持rtmp和trtc，默认是rtmp</p>
     */
    public String getSessionProtocol() {
        return this.SessionProtocol;
    }

    /**
     * Set <p>交互模式下的协议，支持rtmp和trtc，默认是rtmp</p>
     * @param SessionProtocol <p>交互模式下的协议，支持rtmp和trtc，默认是rtmp</p>
     */
    public void setSessionProtocol(String SessionProtocol) {
        this.SessionProtocol = SessionProtocol;
    }

    /**
     * Get <p>使用trtc协议时，在trtc的appid</p> 
     * @return TrtcSdkAppId <p>使用trtc协议时，在trtc的appid</p>
     */
    public String getTrtcSdkAppId() {
        return this.TrtcSdkAppId;
    }

    /**
     * Set <p>使用trtc协议时，在trtc的appid</p>
     * @param TrtcSdkAppId <p>使用trtc协议时，在trtc的appid</p>
     */
    public void setTrtcSdkAppId(String TrtcSdkAppId) {
        this.TrtcSdkAppId = TrtcSdkAppId;
    }

    /**
     * Get <p>进入房间时需要用UserSign来校验权限</p> 
     * @return TrtcUserSig <p>进入房间时需要用UserSign来校验权限</p>
     */
    public String getTrtcUserSig() {
        return this.TrtcUserSig;
    }

    /**
     * Set <p>进入房间时需要用UserSign来校验权限</p>
     * @param TrtcUserSig <p>进入房间时需要用UserSign来校验权限</p>
     */
    public void setTrtcUserSig(String TrtcUserSig) {
        this.TrtcUserSig = TrtcUserSig;
    }

    /**
     * Get <p>要进入的房间</p> 
     * @return TrtcRoomId <p>要进入的房间</p>
     */
    public String getTrtcRoomId() {
        return this.TrtcRoomId;
    }

    /**
     * Set <p>要进入的房间</p>
     * @param TrtcRoomId <p>要进入的房间</p>
     */
    public void setTrtcRoomId(String TrtcRoomId) {
        this.TrtcRoomId = TrtcRoomId;
    }

    public StartLiveAvatarRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartLiveAvatarRoomRequest(StartLiveAvatarRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ToUrl != null) {
            this.ToUrl = new String(source.ToUrl);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.RoomType != null) {
            this.RoomType = new String(source.RoomType);
        }
        if (source.SessionProtocol != null) {
            this.SessionProtocol = new String(source.SessionProtocol);
        }
        if (source.TrtcSdkAppId != null) {
            this.TrtcSdkAppId = new String(source.TrtcSdkAppId);
        }
        if (source.TrtcUserSig != null) {
            this.TrtcUserSig = new String(source.TrtcUserSig);
        }
        if (source.TrtcRoomId != null) {
            this.TrtcRoomId = new String(source.TrtcRoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ToUrl", this.ToUrl);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "RoomType", this.RoomType);
        this.setParamSimple(map, prefix + "SessionProtocol", this.SessionProtocol);
        this.setParamSimple(map, prefix + "TrtcSdkAppId", this.TrtcSdkAppId);
        this.setParamSimple(map, prefix + "TrtcUserSig", this.TrtcUserSig);
        this.setParamSimple(map, prefix + "TrtcRoomId", this.TrtcRoomId);

    }
}

