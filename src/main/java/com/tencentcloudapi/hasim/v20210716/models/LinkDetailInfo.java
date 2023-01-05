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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinkDetailInfo extends AbstractModel{

    /**
    * 云兔连接ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 卡片状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 激活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 数据用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataUse")
    @Expose
    private Float DataUse;

    /**
    * 语音用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioUse")
    @Expose
    private Long AudioUse;

    /**
    * 短信用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmsUse")
    @Expose
    private Long SmsUse;

    /**
    * 在线状态 0 未激活 1 在线 2 离线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkedState")
    @Expose
    private Long LinkedState;

    /**
    * 预期策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TacticID")
    @Expose
    private Long TacticID;

    /**
    * 策略下发状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TacticStatus")
    @Expose
    private Long TacticStatus;

    /**
    * 策略下发成功过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TacticExpireTime")
    @Expose
    private String TacticExpireTime;

    /**
    * 高级日志预期状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsActiveLog")
    @Expose
    private Boolean IsActiveLog;

    /**
    * 运营商 1移动 2联通 3电信
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TeleOperator")
    @Expose
    private Long TeleOperator;

    /**
    * 设备最新上报信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Report")
    @Expose
    private DeviceReport Report;

    /**
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 运营商ICCID信息集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cards")
    @Expose
    private TeleOperatorCard [] Cards;

    /**
    * 云兔实际卡片ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CardID")
    @Expose
    private String CardID;

    /**
     * Get 云兔连接ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 云兔连接ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 云兔连接ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 云兔连接ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 卡片状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 卡片状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 卡片状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 卡片状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 激活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 数据用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataUse 数据用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDataUse() {
        return this.DataUse;
    }

    /**
     * Set 数据用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataUse 数据用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataUse(Float DataUse) {
        this.DataUse = DataUse;
    }

    /**
     * Get 语音用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioUse 语音用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAudioUse() {
        return this.AudioUse;
    }

    /**
     * Set 语音用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioUse 语音用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioUse(Long AudioUse) {
        this.AudioUse = AudioUse;
    }

    /**
     * Get 短信用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmsUse 短信用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSmsUse() {
        return this.SmsUse;
    }

    /**
     * Set 短信用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmsUse 短信用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmsUse(Long SmsUse) {
        this.SmsUse = SmsUse;
    }

    /**
     * Get 在线状态 0 未激活 1 在线 2 离线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkedState 在线状态 0 未激活 1 在线 2 离线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLinkedState() {
        return this.LinkedState;
    }

    /**
     * Set 在线状态 0 未激活 1 在线 2 离线
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkedState 在线状态 0 未激活 1 在线 2 离线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkedState(Long LinkedState) {
        this.LinkedState = LinkedState;
    }

    /**
     * Get 预期策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TacticID 预期策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTacticID() {
        return this.TacticID;
    }

    /**
     * Set 预期策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TacticID 预期策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTacticID(Long TacticID) {
        this.TacticID = TacticID;
    }

    /**
     * Get 策略下发状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TacticStatus 策略下发状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTacticStatus() {
        return this.TacticStatus;
    }

    /**
     * Set 策略下发状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TacticStatus 策略下发状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTacticStatus(Long TacticStatus) {
        this.TacticStatus = TacticStatus;
    }

    /**
     * Get 策略下发成功过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TacticExpireTime 策略下发成功过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTacticExpireTime() {
        return this.TacticExpireTime;
    }

    /**
     * Set 策略下发成功过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TacticExpireTime 策略下发成功过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTacticExpireTime(String TacticExpireTime) {
        this.TacticExpireTime = TacticExpireTime;
    }

    /**
     * Get 高级日志预期状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsActiveLog 高级日志预期状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsActiveLog() {
        return this.IsActiveLog;
    }

    /**
     * Set 高级日志预期状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsActiveLog 高级日志预期状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsActiveLog(Boolean IsActiveLog) {
        this.IsActiveLog = IsActiveLog;
    }

    /**
     * Get 运营商 1移动 2联通 3电信
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TeleOperator 运营商 1移动 2联通 3电信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTeleOperator() {
        return this.TeleOperator;
    }

    /**
     * Set 运营商 1移动 2联通 3电信
注意：此字段可能返回 null，表示取不到有效值。
     * @param TeleOperator 运营商 1移动 2联通 3电信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTeleOperator(Long TeleOperator) {
        this.TeleOperator = TeleOperator;
    }

    /**
     * Get 设备最新上报信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Report 设备最新上报信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceReport getReport() {
        return this.Report;
    }

    /**
     * Set 设备最新上报信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Report 设备最新上报信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReport(DeviceReport Report) {
        this.Report = Report;
    }

    /**
     * Get 标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 运营商ICCID信息集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cards 运营商ICCID信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TeleOperatorCard [] getCards() {
        return this.Cards;
    }

    /**
     * Set 运营商ICCID信息集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cards 运营商ICCID信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCards(TeleOperatorCard [] Cards) {
        this.Cards = Cards;
    }

    /**
     * Get 云兔实际卡片ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CardID 云兔实际卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCardID() {
        return this.CardID;
    }

    /**
     * Set 云兔实际卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CardID 云兔实际卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCardID(String CardID) {
        this.CardID = CardID;
    }

    public LinkDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkDetailInfo(LinkDetailInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.DataUse != null) {
            this.DataUse = new Float(source.DataUse);
        }
        if (source.AudioUse != null) {
            this.AudioUse = new Long(source.AudioUse);
        }
        if (source.SmsUse != null) {
            this.SmsUse = new Long(source.SmsUse);
        }
        if (source.LinkedState != null) {
            this.LinkedState = new Long(source.LinkedState);
        }
        if (source.TacticID != null) {
            this.TacticID = new Long(source.TacticID);
        }
        if (source.TacticStatus != null) {
            this.TacticStatus = new Long(source.TacticStatus);
        }
        if (source.TacticExpireTime != null) {
            this.TacticExpireTime = new String(source.TacticExpireTime);
        }
        if (source.IsActiveLog != null) {
            this.IsActiveLog = new Boolean(source.IsActiveLog);
        }
        if (source.TeleOperator != null) {
            this.TeleOperator = new Long(source.TeleOperator);
        }
        if (source.Report != null) {
            this.Report = new DeviceReport(source.Report);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Cards != null) {
            this.Cards = new TeleOperatorCard[source.Cards.length];
            for (int i = 0; i < source.Cards.length; i++) {
                this.Cards[i] = new TeleOperatorCard(source.Cards[i]);
            }
        }
        if (source.CardID != null) {
            this.CardID = new String(source.CardID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DataUse", this.DataUse);
        this.setParamSimple(map, prefix + "AudioUse", this.AudioUse);
        this.setParamSimple(map, prefix + "SmsUse", this.SmsUse);
        this.setParamSimple(map, prefix + "LinkedState", this.LinkedState);
        this.setParamSimple(map, prefix + "TacticID", this.TacticID);
        this.setParamSimple(map, prefix + "TacticStatus", this.TacticStatus);
        this.setParamSimple(map, prefix + "TacticExpireTime", this.TacticExpireTime);
        this.setParamSimple(map, prefix + "IsActiveLog", this.IsActiveLog);
        this.setParamSimple(map, prefix + "TeleOperator", this.TeleOperator);
        this.setParamObj(map, prefix + "Report.", this.Report);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Cards.", this.Cards);
        this.setParamSimple(map, prefix + "CardID", this.CardID);

    }
}

