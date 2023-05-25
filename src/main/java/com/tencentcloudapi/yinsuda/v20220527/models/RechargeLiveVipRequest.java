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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RechargeLiveVipRequest extends AbstractModel{

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 用户标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 交易流水号，用于标记此次充值记录，多次充值记录传入相同的 TradeSerialNo 会判断为失败，可用于防止重提提交造成重复计费。
    */
    @SerializedName("TradeSerialNo")
    @Expose
    private String TradeSerialNo;

    /**
    * 房间标识。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 充值会员天数。
取值有：
<li>31</li>
<li>93</li>
<li>186</li>
<li>372</li>
    */
    @SerializedName("VipDays")
    @Expose
    private Long VipDays;

    /**
    * 充值分类。取值有：room_card-包月房卡; 其他-保留。
    */
    @SerializedName("GiveType")
    @Expose
    private String GiveType;

    /**
    * 播放场景。默认为Live
<li>Live：直播</li><li>Chat：语聊</li>
    */
    @SerializedName("PlayScene")
    @Expose
    private String PlayScene;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 用户标识。 
     * @return UserId 用户标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户标识。
     * @param UserId 用户标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 交易流水号，用于标记此次充值记录，多次充值记录传入相同的 TradeSerialNo 会判断为失败，可用于防止重提提交造成重复计费。 
     * @return TradeSerialNo 交易流水号，用于标记此次充值记录，多次充值记录传入相同的 TradeSerialNo 会判断为失败，可用于防止重提提交造成重复计费。
     */
    public String getTradeSerialNo() {
        return this.TradeSerialNo;
    }

    /**
     * Set 交易流水号，用于标记此次充值记录，多次充值记录传入相同的 TradeSerialNo 会判断为失败，可用于防止重提提交造成重复计费。
     * @param TradeSerialNo 交易流水号，用于标记此次充值记录，多次充值记录传入相同的 TradeSerialNo 会判断为失败，可用于防止重提提交造成重复计费。
     */
    public void setTradeSerialNo(String TradeSerialNo) {
        this.TradeSerialNo = TradeSerialNo;
    }

    /**
     * Get 房间标识。 
     * @return RoomId 房间标识。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间标识。
     * @param RoomId 房间标识。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 充值会员天数。
取值有：
<li>31</li>
<li>93</li>
<li>186</li>
<li>372</li> 
     * @return VipDays 充值会员天数。
取值有：
<li>31</li>
<li>93</li>
<li>186</li>
<li>372</li>
     */
    public Long getVipDays() {
        return this.VipDays;
    }

    /**
     * Set 充值会员天数。
取值有：
<li>31</li>
<li>93</li>
<li>186</li>
<li>372</li>
     * @param VipDays 充值会员天数。
取值有：
<li>31</li>
<li>93</li>
<li>186</li>
<li>372</li>
     */
    public void setVipDays(Long VipDays) {
        this.VipDays = VipDays;
    }

    /**
     * Get 充值分类。取值有：room_card-包月房卡; 其他-保留。 
     * @return GiveType 充值分类。取值有：room_card-包月房卡; 其他-保留。
     */
    public String getGiveType() {
        return this.GiveType;
    }

    /**
     * Set 充值分类。取值有：room_card-包月房卡; 其他-保留。
     * @param GiveType 充值分类。取值有：room_card-包月房卡; 其他-保留。
     */
    public void setGiveType(String GiveType) {
        this.GiveType = GiveType;
    }

    /**
     * Get 播放场景。默认为Live
<li>Live：直播</li><li>Chat：语聊</li> 
     * @return PlayScene 播放场景。默认为Live
<li>Live：直播</li><li>Chat：语聊</li>
     */
    public String getPlayScene() {
        return this.PlayScene;
    }

    /**
     * Set 播放场景。默认为Live
<li>Live：直播</li><li>Chat：语聊</li>
     * @param PlayScene 播放场景。默认为Live
<li>Live：直播</li><li>Chat：语聊</li>
     */
    public void setPlayScene(String PlayScene) {
        this.PlayScene = PlayScene;
    }

    public RechargeLiveVipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RechargeLiveVipRequest(RechargeLiveVipRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TradeSerialNo != null) {
            this.TradeSerialNo = new String(source.TradeSerialNo);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.VipDays != null) {
            this.VipDays = new Long(source.VipDays);
        }
        if (source.GiveType != null) {
            this.GiveType = new String(source.GiveType);
        }
        if (source.PlayScene != null) {
            this.PlayScene = new String(source.PlayScene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TradeSerialNo", this.TradeSerialNo);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "VipDays", this.VipDays);
        this.setParamSimple(map, prefix + "GiveType", this.GiveType);
        this.setParamSimple(map, prefix + "PlayScene", this.PlayScene);

    }
}

