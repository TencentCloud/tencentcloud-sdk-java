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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatArchivingDetail extends AbstractModel{

    /**
    * 消息id
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 动作名称，switch表示切换企微账号，send表示企微普通消息
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 消息类型，当Action != "switch"时存在，例如video, text, voice 等，和企微开放文档一一对应
https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgType")
    @Expose
    private String MsgType;

    /**
    * 消息发送人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 消息接收人列表，注意接收人可能只有一个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToList")
    @Expose
    private String [] ToList;

    /**
    * 如果是群消息，则不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 消息发送的时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgTime")
    @Expose
    private Long MsgTime;

    /**
    * MsgType=video时的消息体，忽略此字段，见BodyJson字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Video")
    @Expose
    private ChatArchivingMsgTypeVideo Video;

    /**
    * 根据MsgType的不同取值，解析内容不同，参考：https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BodyJson")
    @Expose
    private String BodyJson;

    /**
     * Get 消息id 
     * @return MsgId 消息id
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息id
     * @param MsgId 消息id
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 动作名称，switch表示切换企微账号，send表示企微普通消息 
     * @return Action 动作名称，switch表示切换企微账号，send表示企微普通消息
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作名称，switch表示切换企微账号，send表示企微普通消息
     * @param Action 动作名称，switch表示切换企微账号，send表示企微普通消息
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 消息类型，当Action != "switch"时存在，例如video, text, voice 等，和企微开放文档一一对应
https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgType 消息类型，当Action != "switch"时存在，例如video, text, voice 等，和企微开放文档一一对应
https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgType() {
        return this.MsgType;
    }

    /**
     * Set 消息类型，当Action != "switch"时存在，例如video, text, voice 等，和企微开放文档一一对应
https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgType 消息类型，当Action != "switch"时存在，例如video, text, voice 等，和企微开放文档一一对应
https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgType(String MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get 消息发送人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return From 消息发送人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 消息发送人
注意：此字段可能返回 null，表示取不到有效值。
     * @param From 消息发送人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 消息接收人列表，注意接收人可能只有一个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToList 消息接收人列表，注意接收人可能只有一个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getToList() {
        return this.ToList;
    }

    /**
     * Set 消息接收人列表，注意接收人可能只有一个
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToList 消息接收人列表，注意接收人可能只有一个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToList(String [] ToList) {
        this.ToList = ToList;
    }

    /**
     * Get 如果是群消息，则不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomId 如果是群消息，则不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 如果是群消息，则不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomId 如果是群消息，则不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 消息发送的时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgTime 消息发送的时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgTime() {
        return this.MsgTime;
    }

    /**
     * Set 消息发送的时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgTime 消息发送的时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgTime(Long MsgTime) {
        this.MsgTime = MsgTime;
    }

    /**
     * Get MsgType=video时的消息体，忽略此字段，见BodyJson字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Video MsgType=video时的消息体，忽略此字段，见BodyJson字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChatArchivingMsgTypeVideo getVideo() {
        return this.Video;
    }

    /**
     * Set MsgType=video时的消息体，忽略此字段，见BodyJson字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Video MsgType=video时的消息体，忽略此字段，见BodyJson字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideo(ChatArchivingMsgTypeVideo Video) {
        this.Video = Video;
    }

    /**
     * Get 根据MsgType的不同取值，解析内容不同，参考：https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BodyJson 根据MsgType的不同取值，解析内容不同，参考：https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBodyJson() {
        return this.BodyJson;
    }

    /**
     * Set 根据MsgType的不同取值，解析内容不同，参考：https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。
     * @param BodyJson 根据MsgType的不同取值，解析内容不同，参考：https://open.work.weixin.qq.com/api/doc/90000/90135/91774
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBodyJson(String BodyJson) {
        this.BodyJson = BodyJson;
    }

    public ChatArchivingDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatArchivingDetail(ChatArchivingDetail source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.MsgType != null) {
            this.MsgType = new String(source.MsgType);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.ToList != null) {
            this.ToList = new String[source.ToList.length];
            for (int i = 0; i < source.ToList.length; i++) {
                this.ToList[i] = new String(source.ToList[i]);
            }
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.MsgTime != null) {
            this.MsgTime = new Long(source.MsgTime);
        }
        if (source.Video != null) {
            this.Video = new ChatArchivingMsgTypeVideo(source.Video);
        }
        if (source.BodyJson != null) {
            this.BodyJson = new String(source.BodyJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamArraySimple(map, prefix + "ToList.", this.ToList);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "MsgTime", this.MsgTime);
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamSimple(map, prefix + "BodyJson", this.BodyJson);

    }
}

