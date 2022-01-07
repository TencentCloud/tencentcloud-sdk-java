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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChargeDetail extends AbstractModel{

    /**
    * 一比一时间时间戳，13位。
    */
    @SerializedName("ReqTime")
    @Expose
    private String ReqTime;

    /**
    * 一比一请求的唯一标记。
    */
    @SerializedName("Seq")
    @Expose
    private String Seq;

    /**
    * 一比一时使用的、脱敏后的身份证号。
    */
    @SerializedName("Idcard")
    @Expose
    private String Idcard;

    /**
    * 一比一时使用的、脱敏后的姓名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 一比一的相似度。0-100，保留2位小数。
    */
    @SerializedName("Sim")
    @Expose
    private String Sim;

    /**
    * 本次详情是否收费。
    */
    @SerializedName("IsNeedCharge")
    @Expose
    private Boolean IsNeedCharge;

    /**
    * 收费类型，比对、核身、混合部署。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 本次活体一比一最终结果。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 本次活体一比一最终结果描述。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get 一比一时间时间戳，13位。 
     * @return ReqTime 一比一时间时间戳，13位。
     */
    public String getReqTime() {
        return this.ReqTime;
    }

    /**
     * Set 一比一时间时间戳，13位。
     * @param ReqTime 一比一时间时间戳，13位。
     */
    public void setReqTime(String ReqTime) {
        this.ReqTime = ReqTime;
    }

    /**
     * Get 一比一请求的唯一标记。 
     * @return Seq 一比一请求的唯一标记。
     */
    public String getSeq() {
        return this.Seq;
    }

    /**
     * Set 一比一请求的唯一标记。
     * @param Seq 一比一请求的唯一标记。
     */
    public void setSeq(String Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 一比一时使用的、脱敏后的身份证号。 
     * @return Idcard 一比一时使用的、脱敏后的身份证号。
     */
    public String getIdcard() {
        return this.Idcard;
    }

    /**
     * Set 一比一时使用的、脱敏后的身份证号。
     * @param Idcard 一比一时使用的、脱敏后的身份证号。
     */
    public void setIdcard(String Idcard) {
        this.Idcard = Idcard;
    }

    /**
     * Get 一比一时使用的、脱敏后的姓名。 
     * @return Name 一比一时使用的、脱敏后的姓名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 一比一时使用的、脱敏后的姓名。
     * @param Name 一比一时使用的、脱敏后的姓名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 一比一的相似度。0-100，保留2位小数。 
     * @return Sim 一比一的相似度。0-100，保留2位小数。
     */
    public String getSim() {
        return this.Sim;
    }

    /**
     * Set 一比一的相似度。0-100，保留2位小数。
     * @param Sim 一比一的相似度。0-100，保留2位小数。
     */
    public void setSim(String Sim) {
        this.Sim = Sim;
    }

    /**
     * Get 本次详情是否收费。 
     * @return IsNeedCharge 本次详情是否收费。
     */
    public Boolean getIsNeedCharge() {
        return this.IsNeedCharge;
    }

    /**
     * Set 本次详情是否收费。
     * @param IsNeedCharge 本次详情是否收费。
     */
    public void setIsNeedCharge(Boolean IsNeedCharge) {
        this.IsNeedCharge = IsNeedCharge;
    }

    /**
     * Get 收费类型，比对、核身、混合部署。 
     * @return ChargeType 收费类型，比对、核身、混合部署。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 收费类型，比对、核身、混合部署。
     * @param ChargeType 收费类型，比对、核身、混合部署。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 本次活体一比一最终结果。 
     * @return ErrorCode 本次活体一比一最终结果。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 本次活体一比一最终结果。
     * @param ErrorCode 本次活体一比一最终结果。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 本次活体一比一最终结果描述。 
     * @return ErrorMessage 本次活体一比一最终结果描述。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 本次活体一比一最终结果描述。
     * @param ErrorMessage 本次活体一比一最终结果描述。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public ChargeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChargeDetail(ChargeDetail source) {
        if (source.ReqTime != null) {
            this.ReqTime = new String(source.ReqTime);
        }
        if (source.Seq != null) {
            this.Seq = new String(source.Seq);
        }
        if (source.Idcard != null) {
            this.Idcard = new String(source.Idcard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sim != null) {
            this.Sim = new String(source.Sim);
        }
        if (source.IsNeedCharge != null) {
            this.IsNeedCharge = new Boolean(source.IsNeedCharge);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReqTime", this.ReqTime);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "Idcard", this.Idcard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "IsNeedCharge", this.IsNeedCharge);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

