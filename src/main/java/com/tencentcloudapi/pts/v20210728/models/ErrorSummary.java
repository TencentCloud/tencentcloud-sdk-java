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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorSummary extends AbstractModel{

    /**
    * 状态码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 结果码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 错误出现次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 错误率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rate")
    @Expose
    private Float Rate;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 请求协议类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
     * Get 状态码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 结果码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 结果码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 结果码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 错误出现次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 错误出现次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 错误出现次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 错误出现次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 错误率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rate 错误率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRate() {
        return this.Rate;
    }

    /**
     * Set 错误率
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rate 错误率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 请求协议类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Proto 请求协议类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 请求协议类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Proto 请求协议类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    public ErrorSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorSummary(ErrorSummary source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Rate != null) {
            this.Rate = new Float(source.Rate);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Proto", this.Proto);

    }
}

