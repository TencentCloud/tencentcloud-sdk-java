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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageCntStats extends AbstractModel{

    /**
    * 统计日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 物模型上行消息数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpMsgCnt")
    @Expose
    private Long UpMsgCnt;

    /**
    * 物模型下行消息数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownMsgCnt")
    @Expose
    private Long DownMsgCnt;

    /**
    * ntp消息数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NtpMsgCnt")
    @Expose
    private Long NtpMsgCnt;

    /**
     * Get 统计日期 
     * @return Date 统计日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 统计日期
     * @param Date 统计日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 物模型上行消息数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpMsgCnt 物模型上行消息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpMsgCnt() {
        return this.UpMsgCnt;
    }

    /**
     * Set 物模型上行消息数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpMsgCnt 物模型上行消息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpMsgCnt(Long UpMsgCnt) {
        this.UpMsgCnt = UpMsgCnt;
    }

    /**
     * Get 物模型下行消息数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownMsgCnt 物模型下行消息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDownMsgCnt() {
        return this.DownMsgCnt;
    }

    /**
     * Set 物模型下行消息数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownMsgCnt 物模型下行消息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownMsgCnt(Long DownMsgCnt) {
        this.DownMsgCnt = DownMsgCnt;
    }

    /**
     * Get ntp消息数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NtpMsgCnt ntp消息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNtpMsgCnt() {
        return this.NtpMsgCnt;
    }

    /**
     * Set ntp消息数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NtpMsgCnt ntp消息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNtpMsgCnt(Long NtpMsgCnt) {
        this.NtpMsgCnt = NtpMsgCnt;
    }

    public MessageCntStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageCntStats(MessageCntStats source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.UpMsgCnt != null) {
            this.UpMsgCnt = new Long(source.UpMsgCnt);
        }
        if (source.DownMsgCnt != null) {
            this.DownMsgCnt = new Long(source.DownMsgCnt);
        }
        if (source.NtpMsgCnt != null) {
            this.NtpMsgCnt = new Long(source.NtpMsgCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "UpMsgCnt", this.UpMsgCnt);
        this.setParamSimple(map, prefix + "DownMsgCnt", this.DownMsgCnt);
        this.setParamSimple(map, prefix + "NtpMsgCnt", this.NtpMsgCnt);

    }
}

