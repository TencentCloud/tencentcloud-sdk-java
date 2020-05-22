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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageContentGjh extends AbstractModel{

    /**
    * 具体消息内容
    */
    @SerializedName("Media")
    @Expose
    private MediaGjh Media;

    /**
    * 发表该信息的用户的信息
    */
    @SerializedName("User")
    @Expose
    private UserInfoGjh User;

    /**
    * 发表该消息的设备的消息
    */
    @SerializedName("Msg")
    @Expose
    private ContentMsgGjh Msg;

    /**
     * Get 具体消息内容 
     * @return Media 具体消息内容
     */
    public MediaGjh getMedia() {
        return this.Media;
    }

    /**
     * Set 具体消息内容
     * @param Media 具体消息内容
     */
    public void setMedia(MediaGjh Media) {
        this.Media = Media;
    }

    /**
     * Get 发表该信息的用户的信息 
     * @return User 发表该信息的用户的信息
     */
    public UserInfoGjh getUser() {
        return this.User;
    }

    /**
     * Set 发表该信息的用户的信息
     * @param User 发表该信息的用户的信息
     */
    public void setUser(UserInfoGjh User) {
        this.User = User;
    }

    /**
     * Get 发表该消息的设备的消息 
     * @return Msg 发表该消息的设备的消息
     */
    public ContentMsgGjh getMsg() {
        return this.Msg;
    }

    /**
     * Set 发表该消息的设备的消息
     * @param Msg 发表该消息的设备的消息
     */
    public void setMsg(ContentMsgGjh Msg) {
        this.Msg = Msg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Media.", this.Media);
        this.setParamObj(map, prefix + "User.", this.User);
        this.setParamObj(map, prefix + "Msg.", this.Msg);

    }
}

