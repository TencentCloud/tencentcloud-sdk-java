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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServeParticipant extends AbstractModel {

    /**
    * 座席邮箱
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 座席电话
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 振铃时间戳，Unix 秒级时间戳
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * 接听时间戳，Unix 秒级时间戳
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * 结束时间戳，Unix 秒级时间戳
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * 录音 ID，能够索引到座席侧的录音
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 参与者类型，"staffSeat", "outboundSeat", "staffPhoneSeat"
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 转接来源座席信息
    */
    @SerializedName("TransferFrom")
    @Expose
    private String TransferFrom;

    /**
    * 转接来源参与者类型，取值与 Type 一致
    */
    @SerializedName("TransferFromType")
    @Expose
    private String TransferFromType;

    /**
    * 转接去向座席信息
    */
    @SerializedName("TransferTo")
    @Expose
    private String TransferTo;

    /**
    * 转接去向参与者类型，取值与 Type 一致
    */
    @SerializedName("TransferToType")
    @Expose
    private String TransferToType;

    /**
    * 技能组 ID
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * 结束状态
    */
    @SerializedName("EndStatusString")
    @Expose
    private String EndStatusString;

    /**
    * 录音 URL
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * 参与者序号，从 0 开始
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * 开始时间戳，Unix 秒级时间戳
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 技能组名称
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * 录音转存第三方COS地址
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
     * Get 座席邮箱 
     * @return Mail 座席邮箱
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 座席邮箱
     * @param Mail 座席邮箱
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 座席电话 
     * @return Phone 座席电话
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 座席电话
     * @param Phone 座席电话
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 振铃时间戳，Unix 秒级时间戳 
     * @return RingTimestamp 振铃时间戳，Unix 秒级时间戳
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set 振铃时间戳，Unix 秒级时间戳
     * @param RingTimestamp 振铃时间戳，Unix 秒级时间戳
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get 接听时间戳，Unix 秒级时间戳 
     * @return AcceptTimestamp 接听时间戳，Unix 秒级时间戳
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set 接听时间戳，Unix 秒级时间戳
     * @param AcceptTimestamp 接听时间戳，Unix 秒级时间戳
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get 结束时间戳，Unix 秒级时间戳 
     * @return EndedTimestamp 结束时间戳，Unix 秒级时间戳
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set 结束时间戳，Unix 秒级时间戳
     * @param EndedTimestamp 结束时间戳，Unix 秒级时间戳
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get 录音 ID，能够索引到座席侧的录音 
     * @return RecordId 录音 ID，能够索引到座席侧的录音
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 录音 ID，能够索引到座席侧的录音
     * @param RecordId 录音 ID，能够索引到座席侧的录音
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 参与者类型，"staffSeat", "outboundSeat", "staffPhoneSeat" 
     * @return Type 参与者类型，"staffSeat", "outboundSeat", "staffPhoneSeat"
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参与者类型，"staffSeat", "outboundSeat", "staffPhoneSeat"
     * @param Type 参与者类型，"staffSeat", "outboundSeat", "staffPhoneSeat"
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 转接来源座席信息 
     * @return TransferFrom 转接来源座席信息
     */
    public String getTransferFrom() {
        return this.TransferFrom;
    }

    /**
     * Set 转接来源座席信息
     * @param TransferFrom 转接来源座席信息
     */
    public void setTransferFrom(String TransferFrom) {
        this.TransferFrom = TransferFrom;
    }

    /**
     * Get 转接来源参与者类型，取值与 Type 一致 
     * @return TransferFromType 转接来源参与者类型，取值与 Type 一致
     */
    public String getTransferFromType() {
        return this.TransferFromType;
    }

    /**
     * Set 转接来源参与者类型，取值与 Type 一致
     * @param TransferFromType 转接来源参与者类型，取值与 Type 一致
     */
    public void setTransferFromType(String TransferFromType) {
        this.TransferFromType = TransferFromType;
    }

    /**
     * Get 转接去向座席信息 
     * @return TransferTo 转接去向座席信息
     */
    public String getTransferTo() {
        return this.TransferTo;
    }

    /**
     * Set 转接去向座席信息
     * @param TransferTo 转接去向座席信息
     */
    public void setTransferTo(String TransferTo) {
        this.TransferTo = TransferTo;
    }

    /**
     * Get 转接去向参与者类型，取值与 Type 一致 
     * @return TransferToType 转接去向参与者类型，取值与 Type 一致
     */
    public String getTransferToType() {
        return this.TransferToType;
    }

    /**
     * Set 转接去向参与者类型，取值与 Type 一致
     * @param TransferToType 转接去向参与者类型，取值与 Type 一致
     */
    public void setTransferToType(String TransferToType) {
        this.TransferToType = TransferToType;
    }

    /**
     * Get 技能组 ID 
     * @return SkillGroupId 技能组 ID
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 技能组 ID
     * @param SkillGroupId 技能组 ID
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get 结束状态 
     * @return EndStatusString 结束状态
     */
    public String getEndStatusString() {
        return this.EndStatusString;
    }

    /**
     * Set 结束状态
     * @param EndStatusString 结束状态
     */
    public void setEndStatusString(String EndStatusString) {
        this.EndStatusString = EndStatusString;
    }

    /**
     * Get 录音 URL 
     * @return RecordURL 录音 URL
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set 录音 URL
     * @param RecordURL 录音 URL
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get 参与者序号，从 0 开始 
     * @return Sequence 参与者序号，从 0 开始
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set 参与者序号，从 0 开始
     * @param Sequence 参与者序号，从 0 开始
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get 开始时间戳，Unix 秒级时间戳 
     * @return StartTimestamp 开始时间戳，Unix 秒级时间戳
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 开始时间戳，Unix 秒级时间戳
     * @param StartTimestamp 开始时间戳，Unix 秒级时间戳
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get 技能组名称 
     * @return SkillGroupName 技能组名称
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set 技能组名称
     * @param SkillGroupName 技能组名称
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get 录音转存第三方COS地址 
     * @return CustomRecordURL 录音转存第三方COS地址
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set 录音转存第三方COS地址
     * @param CustomRecordURL 录音转存第三方COS地址
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    public ServeParticipant() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServeParticipant(ServeParticipant source) {
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.RingTimestamp != null) {
            this.RingTimestamp = new Long(source.RingTimestamp);
        }
        if (source.AcceptTimestamp != null) {
            this.AcceptTimestamp = new Long(source.AcceptTimestamp);
        }
        if (source.EndedTimestamp != null) {
            this.EndedTimestamp = new Long(source.EndedTimestamp);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TransferFrom != null) {
            this.TransferFrom = new String(source.TransferFrom);
        }
        if (source.TransferFromType != null) {
            this.TransferFromType = new String(source.TransferFromType);
        }
        if (source.TransferTo != null) {
            this.TransferTo = new String(source.TransferTo);
        }
        if (source.TransferToType != null) {
            this.TransferToType = new String(source.TransferToType);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.EndStatusString != null) {
            this.EndStatusString = new String(source.EndStatusString);
        }
        if (source.RecordURL != null) {
            this.RecordURL = new String(source.RecordURL);
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.CustomRecordURL != null) {
            this.CustomRecordURL = new String(source.CustomRecordURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "RingTimestamp", this.RingTimestamp);
        this.setParamSimple(map, prefix + "AcceptTimestamp", this.AcceptTimestamp);
        this.setParamSimple(map, prefix + "EndedTimestamp", this.EndedTimestamp);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TransferFrom", this.TransferFrom);
        this.setParamSimple(map, prefix + "TransferFromType", this.TransferFromType);
        this.setParamSimple(map, prefix + "TransferTo", this.TransferTo);
        this.setParamSimple(map, prefix + "TransferToType", this.TransferToType);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "EndStatusString", this.EndStatusString);
        this.setParamSimple(map, prefix + "RecordURL", this.RecordURL);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);

    }
}

