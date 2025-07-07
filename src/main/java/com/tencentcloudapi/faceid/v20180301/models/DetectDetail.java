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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectDetail extends AbstractModel {

    /**
    * 请求时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReqTime")
    @Expose
    private String ReqTime;

    /**
    * 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seq")
    @Expose
    private String Seq;

    /**
    * 参与本次活体一比一的身份证号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Idcard")
    @Expose
    private String Idcard;

    /**
    * 参与本次活体一比一的姓名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 本次活体一比一的相似度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sim")
    @Expose
    private String Sim;

    /**
    * 本次活体一比一是否收费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNeedCharge")
    @Expose
    private Boolean IsNeedCharge;

    /**
    * 本次活体一比一最终结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errcode")
    @Expose
    private Long Errcode;

    /**
    * 本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errmsg")
    @Expose
    private String Errmsg;

    /**
    * 本次活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Livestatus")
    @Expose
    private Long Livestatus;

    /**
    * 本次活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Livemsg")
    @Expose
    private String Livemsg;

    /**
    * 本次一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comparestatus")
    @Expose
    private Long Comparestatus;

    /**
    * 本次一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comparemsg")
    @Expose
    private String Comparemsg;

    /**
    * 比对库源类型。包括：
公安商业库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareLibType")
    @Expose
    private String CompareLibType;

    /**
    * 枚举活体检测类型：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessMode")
    @Expose
    private Long LivenessMode;

    /**
     * Get 请求时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReqTime 请求时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReqTime() {
        return this.ReqTime;
    }

    /**
     * Set 请求时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReqTime 请求时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReqTime(String ReqTime) {
        this.ReqTime = ReqTime;
    }

    /**
     * Get 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seq 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeq() {
        return this.Seq;
    }

    /**
     * Set 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seq 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeq(String Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 参与本次活体一比一的身份证号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Idcard 参与本次活体一比一的身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdcard() {
        return this.Idcard;
    }

    /**
     * Set 参与本次活体一比一的身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Idcard 参与本次活体一比一的身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdcard(String Idcard) {
        this.Idcard = Idcard;
    }

    /**
     * Get 参与本次活体一比一的姓名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 参与本次活体一比一的姓名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参与本次活体一比一的姓名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 参与本次活体一比一的姓名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 本次活体一比一的相似度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sim 本次活体一比一的相似度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSim() {
        return this.Sim;
    }

    /**
     * Set 本次活体一比一的相似度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sim 本次活体一比一的相似度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSim(String Sim) {
        this.Sim = Sim;
    }

    /**
     * Get 本次活体一比一是否收费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNeedCharge 本次活体一比一是否收费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNeedCharge() {
        return this.IsNeedCharge;
    }

    /**
     * Set 本次活体一比一是否收费
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNeedCharge 本次活体一比一是否收费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNeedCharge(Boolean IsNeedCharge) {
        this.IsNeedCharge = IsNeedCharge;
    }

    /**
     * Get 本次活体一比一最终结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errcode 本次活体一比一最终结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrcode() {
        return this.Errcode;
    }

    /**
     * Set 本次活体一比一最终结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errcode 本次活体一比一最终结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrcode(Long Errcode) {
        this.Errcode = Errcode;
    }

    /**
     * Get 本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errmsg 本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrmsg() {
        return this.Errmsg;
    }

    /**
     * Set 本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errmsg 本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrmsg(String Errmsg) {
        this.Errmsg = Errmsg;
    }

    /**
     * Get 本次活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Livestatus 本次活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLivestatus() {
        return this.Livestatus;
    }

    /**
     * Set 本次活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Livestatus 本次活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivestatus(Long Livestatus) {
        this.Livestatus = Livestatus;
    }

    /**
     * Get 本次活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Livemsg 本次活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLivemsg() {
        return this.Livemsg;
    }

    /**
     * Set 本次活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Livemsg 本次活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivemsg(String Livemsg) {
        this.Livemsg = Livemsg;
    }

    /**
     * Get 本次一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comparestatus 本次一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getComparestatus() {
        return this.Comparestatus;
    }

    /**
     * Set 本次一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comparestatus 本次一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparestatus(Long Comparestatus) {
        this.Comparestatus = Comparestatus;
    }

    /**
     * Get 本次一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comparemsg 本次一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComparemsg() {
        return this.Comparemsg;
    }

    /**
     * Set 本次一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comparemsg 本次一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparemsg(String Comparemsg) {
        this.Comparemsg = Comparemsg;
    }

    /**
     * Get 比对库源类型。包括：
公安商业库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareLibType 比对库源类型。包括：
公安商业库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareLibType() {
        return this.CompareLibType;
    }

    /**
     * Set 比对库源类型。包括：
公安商业库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareLibType 比对库源类型。包括：
公安商业库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareLibType(String CompareLibType) {
        this.CompareLibType = CompareLibType;
    }

    /**
     * Get 枚举活体检测类型：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessMode 枚举活体检测类型：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLivenessMode() {
        return this.LivenessMode;
    }

    /**
     * Set 枚举活体检测类型：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessMode 枚举活体检测类型：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessMode(Long LivenessMode) {
        this.LivenessMode = LivenessMode;
    }

    public DetectDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectDetail(DetectDetail source) {
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
        if (source.Errcode != null) {
            this.Errcode = new Long(source.Errcode);
        }
        if (source.Errmsg != null) {
            this.Errmsg = new String(source.Errmsg);
        }
        if (source.Livestatus != null) {
            this.Livestatus = new Long(source.Livestatus);
        }
        if (source.Livemsg != null) {
            this.Livemsg = new String(source.Livemsg);
        }
        if (source.Comparestatus != null) {
            this.Comparestatus = new Long(source.Comparestatus);
        }
        if (source.Comparemsg != null) {
            this.Comparemsg = new String(source.Comparemsg);
        }
        if (source.CompareLibType != null) {
            this.CompareLibType = new String(source.CompareLibType);
        }
        if (source.LivenessMode != null) {
            this.LivenessMode = new Long(source.LivenessMode);
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
        this.setParamSimple(map, prefix + "Errcode", this.Errcode);
        this.setParamSimple(map, prefix + "Errmsg", this.Errmsg);
        this.setParamSimple(map, prefix + "Livestatus", this.Livestatus);
        this.setParamSimple(map, prefix + "Livemsg", this.Livemsg);
        this.setParamSimple(map, prefix + "Comparestatus", this.Comparestatus);
        this.setParamSimple(map, prefix + "Comparemsg", this.Comparemsg);
        this.setParamSimple(map, prefix + "CompareLibType", this.CompareLibType);
        this.setParamSimple(map, prefix + "LivenessMode", this.LivenessMode);

    }
}

