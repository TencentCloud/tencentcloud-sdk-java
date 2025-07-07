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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel {

    /**
    * 业务用户ID 如填写，会根据账号历史恶意情况，判定消息有害结果，特别是有利于可疑恶意情况下的辅助判断。账号可以填写微信uin、QQ号、微信openid、QQopenid、字符串等。该字段和账号类别确定唯一账号。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 该字段表示业务用户ID对应的账号类型，取值：1-微信uin，2-QQ号，3-微信群uin，4-qq群号，5-微信openid，6-QQopenid，7-其它string。
该字段与账号ID参数（UserId）配合使用可确定唯一账号。
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 用户昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 性别 默认0 未知 1 男性 2 女性
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 年龄 默认0 未知
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 用户等级，默认0 未知 1 低 2 中 3 高
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户简介，长度不超过5000字
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 用户头像图片链接
    */
    @SerializedName("HeadUrl")
    @Expose
    private String HeadUrl;

    /**
    * 群聊场景房间ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 群聊场景群ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 群聊场景群用户数
    */
    @SerializedName("GroupSize")
    @Expose
    private Long GroupSize;

    /**
    * 消息接收者ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private String ReceiverId;

    /**
    * 消息生成时间，毫秒
    */
    @SerializedName("SendTime")
    @Expose
    private String SendTime;

    /**
     * Get 业务用户ID 如填写，会根据账号历史恶意情况，判定消息有害结果，特别是有利于可疑恶意情况下的辅助判断。账号可以填写微信uin、QQ号、微信openid、QQopenid、字符串等。该字段和账号类别确定唯一账号。 
     * @return UserId 业务用户ID 如填写，会根据账号历史恶意情况，判定消息有害结果，特别是有利于可疑恶意情况下的辅助判断。账号可以填写微信uin、QQ号、微信openid、QQopenid、字符串等。该字段和账号类别确定唯一账号。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 业务用户ID 如填写，会根据账号历史恶意情况，判定消息有害结果，特别是有利于可疑恶意情况下的辅助判断。账号可以填写微信uin、QQ号、微信openid、QQopenid、字符串等。该字段和账号类别确定唯一账号。
     * @param UserId 业务用户ID 如填写，会根据账号历史恶意情况，判定消息有害结果，特别是有利于可疑恶意情况下的辅助判断。账号可以填写微信uin、QQ号、微信openid、QQopenid、字符串等。该字段和账号类别确定唯一账号。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 该字段表示业务用户ID对应的账号类型，取值：1-微信uin，2-QQ号，3-微信群uin，4-qq群号，5-微信openid，6-QQopenid，7-其它string。
该字段与账号ID参数（UserId）配合使用可确定唯一账号。 
     * @return AccountType 该字段表示业务用户ID对应的账号类型，取值：1-微信uin，2-QQ号，3-微信群uin，4-qq群号，5-微信openid，6-QQopenid，7-其它string。
该字段与账号ID参数（UserId）配合使用可确定唯一账号。
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 该字段表示业务用户ID对应的账号类型，取值：1-微信uin，2-QQ号，3-微信群uin，4-qq群号，5-微信openid，6-QQopenid，7-其它string。
该字段与账号ID参数（UserId）配合使用可确定唯一账号。
     * @param AccountType 该字段表示业务用户ID对应的账号类型，取值：1-微信uin，2-QQ号，3-微信群uin，4-qq群号，5-微信openid，6-QQopenid，7-其它string。
该字段与账号ID参数（UserId）配合使用可确定唯一账号。
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 用户昵称 
     * @return Nickname 用户昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 用户昵称
     * @param Nickname 用户昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 性别 默认0 未知 1 男性 2 女性 
     * @return Gender 性别 默认0 未知 1 男性 2 女性
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 性别 默认0 未知 1 男性 2 女性
     * @param Gender 性别 默认0 未知 1 男性 2 女性
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 年龄 默认0 未知 
     * @return Age 年龄 默认0 未知
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 年龄 默认0 未知
     * @param Age 年龄 默认0 未知
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 用户等级，默认0 未知 1 低 2 中 3 高 
     * @return Level 用户等级，默认0 未知 1 低 2 中 3 高
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 用户等级，默认0 未知 1 低 2 中 3 高
     * @param Level 用户等级，默认0 未知 1 低 2 中 3 高
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 手机号 
     * @return Phone 手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
     * @param Phone 手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户简介，长度不超过5000字 
     * @return Desc 用户简介，长度不超过5000字
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 用户简介，长度不超过5000字
     * @param Desc 用户简介，长度不超过5000字
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 用户头像图片链接 
     * @return HeadUrl 用户头像图片链接
     */
    public String getHeadUrl() {
        return this.HeadUrl;
    }

    /**
     * Set 用户头像图片链接
     * @param HeadUrl 用户头像图片链接
     */
    public void setHeadUrl(String HeadUrl) {
        this.HeadUrl = HeadUrl;
    }

    /**
     * Get 群聊场景房间ID 
     * @return RoomId 群聊场景房间ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 群聊场景房间ID
     * @param RoomId 群聊场景房间ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 群聊场景群ID 
     * @return GroupId 群聊场景群ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群聊场景群ID
     * @param GroupId 群聊场景群ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 群聊场景群用户数 
     * @return GroupSize 群聊场景群用户数
     */
    public Long getGroupSize() {
        return this.GroupSize;
    }

    /**
     * Set 群聊场景群用户数
     * @param GroupSize 群聊场景群用户数
     */
    public void setGroupSize(Long GroupSize) {
        this.GroupSize = GroupSize;
    }

    /**
     * Get 消息接收者ID 
     * @return ReceiverId 消息接收者ID
     */
    public String getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set 消息接收者ID
     * @param ReceiverId 消息接收者ID
     */
    public void setReceiverId(String ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get 消息生成时间，毫秒 
     * @return SendTime 消息生成时间，毫秒
     */
    public String getSendTime() {
        return this.SendTime;
    }

    /**
     * Set 消息生成时间，毫秒
     * @param SendTime 消息生成时间，毫秒
     */
    public void setSendTime(String SendTime) {
        this.SendTime = SendTime;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.HeadUrl != null) {
            this.HeadUrl = new String(source.HeadUrl);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupSize != null) {
            this.GroupSize = new Long(source.GroupSize);
        }
        if (source.ReceiverId != null) {
            this.ReceiverId = new String(source.ReceiverId);
        }
        if (source.SendTime != null) {
            this.SendTime = new String(source.SendTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "HeadUrl", this.HeadUrl);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupSize", this.GroupSize);
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);

    }
}

