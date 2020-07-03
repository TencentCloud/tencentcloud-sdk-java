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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleRecord extends AbstractModel{

    /**
    * 案件编号。
    */
    @SerializedName("AccountNum")
    @Expose
    private String AccountNum;

    /**
    * 外呼日期。
    */
    @SerializedName("BizDate")
    @Expose
    private String BizDate;

    /**
    * 开始呼叫时间。
    */
    @SerializedName("CallStartTime")
    @Expose
    private String CallStartTime;

    /**
    * 主叫号码。
    */
    @SerializedName("CallerPhone")
    @Expose
    private String CallerPhone;

    /**
    * 呼叫方向，O为呼出，I为呼入。
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 通话时长。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 产品ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 录音下载链接。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordCosUrl")
    @Expose
    private String RecordCosUrl;

    /**
     * Get 案件编号。 
     * @return AccountNum 案件编号。
     */
    public String getAccountNum() {
        return this.AccountNum;
    }

    /**
     * Set 案件编号。
     * @param AccountNum 案件编号。
     */
    public void setAccountNum(String AccountNum) {
        this.AccountNum = AccountNum;
    }

    /**
     * Get 外呼日期。 
     * @return BizDate 外呼日期。
     */
    public String getBizDate() {
        return this.BizDate;
    }

    /**
     * Set 外呼日期。
     * @param BizDate 外呼日期。
     */
    public void setBizDate(String BizDate) {
        this.BizDate = BizDate;
    }

    /**
     * Get 开始呼叫时间。 
     * @return CallStartTime 开始呼叫时间。
     */
    public String getCallStartTime() {
        return this.CallStartTime;
    }

    /**
     * Set 开始呼叫时间。
     * @param CallStartTime 开始呼叫时间。
     */
    public void setCallStartTime(String CallStartTime) {
        this.CallStartTime = CallStartTime;
    }

    /**
     * Get 主叫号码。 
     * @return CallerPhone 主叫号码。
     */
    public String getCallerPhone() {
        return this.CallerPhone;
    }

    /**
     * Set 主叫号码。
     * @param CallerPhone 主叫号码。
     */
    public void setCallerPhone(String CallerPhone) {
        this.CallerPhone = CallerPhone;
    }

    /**
     * Get 呼叫方向，O为呼出，I为呼入。 
     * @return Direction 呼叫方向，O为呼出，I为呼入。
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 呼叫方向，O为呼出，I为呼入。
     * @param Direction 呼叫方向，O为呼出，I为呼入。
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 通话时长。 
     * @return Duration 通话时长。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 通话时长。
     * @param Duration 通话时长。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 产品ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 产品ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 产品ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 录音下载链接。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordCosUrl 录音下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordCosUrl() {
        return this.RecordCosUrl;
    }

    /**
     * Set 录音下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordCosUrl 录音下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordCosUrl(String RecordCosUrl) {
        this.RecordCosUrl = RecordCosUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountNum", this.AccountNum);
        this.setParamSimple(map, prefix + "BizDate", this.BizDate);
        this.setParamSimple(map, prefix + "CallStartTime", this.CallStartTime);
        this.setParamSimple(map, prefix + "CallerPhone", this.CallerPhone);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "RecordCosUrl", this.RecordCosUrl);

    }
}

