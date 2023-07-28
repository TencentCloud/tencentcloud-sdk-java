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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRoomEventRequest extends AbstractModel{

    /**
    * 房间Id。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 应用Id。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 起始页，1开始。keyword为空时有效。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页个数。keyword为空时有效。一次性最多200条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索事件类型。有以下事件类型:
RoomStart:房间开始
RoomEnd:房间结束
MemberJoin:成员加入
MemberQuit:成员退出
RecordFinish:录制结束
CameraOn: 摄像头打开
CameraOff: 摄像头关闭
MicOn: 麦克风打开
MicOff: 麦克风关闭
ScreenOn: 屏幕共享打开
ScreenOff: 屏幕共享关闭
VisibleOn: 页面可见
VisibleOff: 页面不可见
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 房间Id。 
     * @return RoomId 房间Id。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间Id。
     * @param RoomId 房间Id。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 应用Id。 
     * @return SdkAppId 应用Id。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用Id。
     * @param SdkAppId 应用Id。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 起始页，1开始。keyword为空时有效。 
     * @return Page 起始页，1开始。keyword为空时有效。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 起始页，1开始。keyword为空时有效。
     * @param Page 起始页，1开始。keyword为空时有效。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页个数。keyword为空时有效。一次性最多200条。 
     * @return Limit 每页个数。keyword为空时有效。一次性最多200条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页个数。keyword为空时有效。一次性最多200条。
     * @param Limit 每页个数。keyword为空时有效。一次性最多200条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索事件类型。有以下事件类型:
RoomStart:房间开始
RoomEnd:房间结束
MemberJoin:成员加入
MemberQuit:成员退出
RecordFinish:录制结束
CameraOn: 摄像头打开
CameraOff: 摄像头关闭
MicOn: 麦克风打开
MicOff: 麦克风关闭
ScreenOn: 屏幕共享打开
ScreenOff: 屏幕共享关闭
VisibleOn: 页面可见
VisibleOff: 页面不可见 
     * @return Keyword 搜索事件类型。有以下事件类型:
RoomStart:房间开始
RoomEnd:房间结束
MemberJoin:成员加入
MemberQuit:成员退出
RecordFinish:录制结束
CameraOn: 摄像头打开
CameraOff: 摄像头关闭
MicOn: 麦克风打开
MicOff: 麦克风关闭
ScreenOn: 屏幕共享打开
ScreenOff: 屏幕共享关闭
VisibleOn: 页面可见
VisibleOff: 页面不可见
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索事件类型。有以下事件类型:
RoomStart:房间开始
RoomEnd:房间结束
MemberJoin:成员加入
MemberQuit:成员退出
RecordFinish:录制结束
CameraOn: 摄像头打开
CameraOff: 摄像头关闭
MicOn: 麦克风打开
MicOff: 麦克风关闭
ScreenOn: 屏幕共享打开
ScreenOff: 屏幕共享关闭
VisibleOn: 页面可见
VisibleOff: 页面不可见
     * @param Keyword 搜索事件类型。有以下事件类型:
RoomStart:房间开始
RoomEnd:房间结束
MemberJoin:成员加入
MemberQuit:成员退出
RecordFinish:录制结束
CameraOn: 摄像头打开
CameraOff: 摄像头关闭
MicOn: 麦克风打开
MicOff: 麦克风关闭
ScreenOn: 屏幕共享打开
ScreenOff: 屏幕共享关闭
VisibleOn: 页面可见
VisibleOff: 页面不可见
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public GetRoomEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRoomEventRequest(GetRoomEventRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

