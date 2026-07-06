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
    * <p>请求时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReqTime")
    @Expose
    private String ReqTime;

    /**
    * <p>本次活体一比一请求的唯一标记。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seq")
    @Expose
    private String Seq;

    /**
    * <p>参与本次活体一比一的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Idcard")
    @Expose
    private String Idcard;

    /**
    * <p>参与本次活体一比一的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>本次活体一比一的相似度。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sim")
    @Expose
    private String Sim;

    /**
    * <p>本次活体一比一是否收费</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNeedCharge")
    @Expose
    private Boolean IsNeedCharge;

    /**
    * <p>本次活体一比一最终结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errcode")
    @Expose
    private Long Errcode;

    /**
    * <p>本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errmsg")
    @Expose
    private String Errmsg;

    /**
    * <p>本次活体结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Livestatus")
    @Expose
    private Long Livestatus;

    /**
    * <p>本次活体结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Livemsg")
    @Expose
    private String Livemsg;

    /**
    * <p>本次一比一结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comparestatus")
    @Expose
    private Long Comparestatus;

    /**
    * <p>本次一比一结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comparemsg")
    @Expose
    private String Comparemsg;

    /**
    * <p>比对库源类型。包括：商业库；业务方自有库（用户上传照片、客户的混合库、混合部署库）；二次验证库；人工审核库；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareLibType")
    @Expose
    private String CompareLibType;

    /**
    * <p>枚举活体检测类型：<br>0：未知<br>1：数字活体<br>2：动作活体<br>3：静默活体<br>4：一闪活体（动作+光线）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessMode")
    @Expose
    private Long LivenessMode;

    /**
     * Get <p>请求时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReqTime <p>请求时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReqTime() {
        return this.ReqTime;
    }

    /**
     * Set <p>请求时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReqTime <p>请求时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReqTime(String ReqTime) {
        this.ReqTime = ReqTime;
    }

    /**
     * Get <p>本次活体一比一请求的唯一标记。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seq <p>本次活体一比一请求的唯一标记。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeq() {
        return this.Seq;
    }

    /**
     * Set <p>本次活体一比一请求的唯一标记。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seq <p>本次活体一比一请求的唯一标记。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeq(String Seq) {
        this.Seq = Seq;
    }

    /**
     * Get <p>参与本次活体一比一的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Idcard <p>参与本次活体一比一的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdcard() {
        return this.Idcard;
    }

    /**
     * Set <p>参与本次活体一比一的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Idcard <p>参与本次活体一比一的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdcard(String Idcard) {
        this.Idcard = Idcard;
    }

    /**
     * Get <p>参与本次活体一比一的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>参与本次活体一比一的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>参与本次活体一比一的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>参与本次活体一比一的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>本次活体一比一的相似度。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sim <p>本次活体一比一的相似度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSim() {
        return this.Sim;
    }

    /**
     * Set <p>本次活体一比一的相似度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sim <p>本次活体一比一的相似度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSim(String Sim) {
        this.Sim = Sim;
    }

    /**
     * Get <p>本次活体一比一是否收费</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNeedCharge <p>本次活体一比一是否收费</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNeedCharge() {
        return this.IsNeedCharge;
    }

    /**
     * Set <p>本次活体一比一是否收费</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNeedCharge <p>本次活体一比一是否收费</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNeedCharge(Boolean IsNeedCharge) {
        this.IsNeedCharge = IsNeedCharge;
    }

    /**
     * Get <p>本次活体一比一最终结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errcode <p>本次活体一比一最终结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrcode() {
        return this.Errcode;
    }

    /**
     * Set <p>本次活体一比一最终结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errcode <p>本次活体一比一最终结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrcode(Long Errcode) {
        this.Errcode = Errcode;
    }

    /**
     * Get <p>本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errmsg <p>本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrmsg() {
        return this.Errmsg;
    }

    /**
     * Set <p>本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errmsg <p>本次活体一比一最终结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrmsg(String Errmsg) {
        this.Errmsg = Errmsg;
    }

    /**
     * Get <p>本次活体结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Livestatus <p>本次活体结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLivestatus() {
        return this.Livestatus;
    }

    /**
     * Set <p>本次活体结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Livestatus <p>本次活体结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivestatus(Long Livestatus) {
        this.Livestatus = Livestatus;
    }

    /**
     * Get <p>本次活体结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Livemsg <p>本次活体结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLivemsg() {
        return this.Livemsg;
    }

    /**
     * Set <p>本次活体结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Livemsg <p>本次活体结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivemsg(String Livemsg) {
        this.Livemsg = Livemsg;
    }

    /**
     * Get <p>本次一比一结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comparestatus <p>本次一比一结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getComparestatus() {
        return this.Comparestatus;
    }

    /**
     * Set <p>本次一比一结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comparestatus <p>本次一比一结果。0为成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparestatus(Long Comparestatus) {
        this.Comparestatus = Comparestatus;
    }

    /**
     * Get <p>本次一比一结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comparemsg <p>本次一比一结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComparemsg() {
        return this.Comparemsg;
    }

    /**
     * Set <p>本次一比一结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comparemsg <p>本次一比一结果描述。（仅描述用，文案更新时不会通知。）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparemsg(String Comparemsg) {
        this.Comparemsg = Comparemsg;
    }

    /**
     * Get <p>比对库源类型。包括：商业库；业务方自有库（用户上传照片、客户的混合库、混合部署库）；二次验证库；人工审核库；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareLibType <p>比对库源类型。包括：商业库；业务方自有库（用户上传照片、客户的混合库、混合部署库）；二次验证库；人工审核库；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareLibType() {
        return this.CompareLibType;
    }

    /**
     * Set <p>比对库源类型。包括：商业库；业务方自有库（用户上传照片、客户的混合库、混合部署库）；二次验证库；人工审核库；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareLibType <p>比对库源类型。包括：商业库；业务方自有库（用户上传照片、客户的混合库、混合部署库）；二次验证库；人工审核库；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareLibType(String CompareLibType) {
        this.CompareLibType = CompareLibType;
    }

    /**
     * Get <p>枚举活体检测类型：<br>0：未知<br>1：数字活体<br>2：动作活体<br>3：静默活体<br>4：一闪活体（动作+光线）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessMode <p>枚举活体检测类型：<br>0：未知<br>1：数字活体<br>2：动作活体<br>3：静默活体<br>4：一闪活体（动作+光线）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLivenessMode() {
        return this.LivenessMode;
    }

    /**
     * Set <p>枚举活体检测类型：<br>0：未知<br>1：数字活体<br>2：动作活体<br>3：静默活体<br>4：一闪活体（动作+光线）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessMode <p>枚举活体检测类型：<br>0：未知<br>1：数字活体<br>2：动作活体<br>3：静默活体<br>4：一闪活体（动作+光线）</p>
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

