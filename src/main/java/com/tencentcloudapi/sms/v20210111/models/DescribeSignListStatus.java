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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSignListStatus extends AbstractModel {

    /**
    * 签名ID。
    */
    @SerializedName("SignId")
    @Expose
    private Long SignId;

    /**
    * 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 申请签名状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。
    */
    @SerializedName("ReviewReply")
    @Expose
    private String ReviewReply;

    /**
    * 签名名称。
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * 提交审核时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。
注：国际短信不涉及，默认为0。
    */
    @SerializedName("QualificationId")
    @Expose
    private Long QualificationId;

    /**
    * 国内短信的资质名称。
注：国际短信不涉及，默认为空。
    */
    @SerializedName("QualificationName")
    @Expose
    private String QualificationName;

    /**
    * 国内短信的资质状态。其中0表示待审核，1表示已通过，2表示已拒绝，3表示待补充后提交，4表示变更后待审核，5表示变更后被驳回。可参考 [实名资质审核状态说明](https://cloud.tencent.com/document/product/382/13444#.E5.AE.A1.E6.A0.B8.E7.8A.B6.E6.80.81.E8.AF.B4.E6.98.8E) 。
注：国际短信不涉及，默认为0。
    */
    @SerializedName("QualificationStatusCode")
    @Expose
    private Long QualificationStatusCode;

    /**
     * Get 签名ID。 
     * @return SignId 签名ID。
     */
    public Long getSignId() {
        return this.SignId;
    }

    /**
     * Set 签名ID。
     * @param SignId 签名ID。
     */
    public void setSignId(Long SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。 
     * @return International 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
     * @param International 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get 申请签名状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。 
     * @return StatusCode 申请签名状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 申请签名状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。
     * @param StatusCode 申请签名状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。 
     * @return ReviewReply 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。
     */
    public String getReviewReply() {
        return this.ReviewReply;
    }

    /**
     * Set 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。
     * @param ReviewReply 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。
     */
    public void setReviewReply(String ReviewReply) {
        this.ReviewReply = ReviewReply;
    }

    /**
     * Get 签名名称。 
     * @return SignName 签名名称。
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set 签名名称。
     * @param SignName 签名名称。
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get 提交审核时间，UNIX 时间戳（单位：秒）。 
     * @return CreateTime 提交审核时间，UNIX 时间戳（单位：秒）。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 提交审核时间，UNIX 时间戳（单位：秒）。
     * @param CreateTime 提交审核时间，UNIX 时间戳（单位：秒）。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。
注：国际短信不涉及，默认为0。 
     * @return QualificationId 国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。
注：国际短信不涉及，默认为0。
     */
    public Long getQualificationId() {
        return this.QualificationId;
    }

    /**
     * Set 国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。
注：国际短信不涉及，默认为0。
     * @param QualificationId 国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。
注：国际短信不涉及，默认为0。
     */
    public void setQualificationId(Long QualificationId) {
        this.QualificationId = QualificationId;
    }

    /**
     * Get 国内短信的资质名称。
注：国际短信不涉及，默认为空。 
     * @return QualificationName 国内短信的资质名称。
注：国际短信不涉及，默认为空。
     */
    public String getQualificationName() {
        return this.QualificationName;
    }

    /**
     * Set 国内短信的资质名称。
注：国际短信不涉及，默认为空。
     * @param QualificationName 国内短信的资质名称。
注：国际短信不涉及，默认为空。
     */
    public void setQualificationName(String QualificationName) {
        this.QualificationName = QualificationName;
    }

    /**
     * Get 国内短信的资质状态。其中0表示待审核，1表示已通过，2表示已拒绝，3表示待补充后提交，4表示变更后待审核，5表示变更后被驳回。可参考 [实名资质审核状态说明](https://cloud.tencent.com/document/product/382/13444#.E5.AE.A1.E6.A0.B8.E7.8A.B6.E6.80.81.E8.AF.B4.E6.98.8E) 。
注：国际短信不涉及，默认为0。 
     * @return QualificationStatusCode 国内短信的资质状态。其中0表示待审核，1表示已通过，2表示已拒绝，3表示待补充后提交，4表示变更后待审核，5表示变更后被驳回。可参考 [实名资质审核状态说明](https://cloud.tencent.com/document/product/382/13444#.E5.AE.A1.E6.A0.B8.E7.8A.B6.E6.80.81.E8.AF.B4.E6.98.8E) 。
注：国际短信不涉及，默认为0。
     */
    public Long getQualificationStatusCode() {
        return this.QualificationStatusCode;
    }

    /**
     * Set 国内短信的资质状态。其中0表示待审核，1表示已通过，2表示已拒绝，3表示待补充后提交，4表示变更后待审核，5表示变更后被驳回。可参考 [实名资质审核状态说明](https://cloud.tencent.com/document/product/382/13444#.E5.AE.A1.E6.A0.B8.E7.8A.B6.E6.80.81.E8.AF.B4.E6.98.8E) 。
注：国际短信不涉及，默认为0。
     * @param QualificationStatusCode 国内短信的资质状态。其中0表示待审核，1表示已通过，2表示已拒绝，3表示待补充后提交，4表示变更后待审核，5表示变更后被驳回。可参考 [实名资质审核状态说明](https://cloud.tencent.com/document/product/382/13444#.E5.AE.A1.E6.A0.B8.E7.8A.B6.E6.80.81.E8.AF.B4.E6.98.8E) 。
注：国际短信不涉及，默认为0。
     */
    public void setQualificationStatusCode(Long QualificationStatusCode) {
        this.QualificationStatusCode = QualificationStatusCode;
    }

    public DescribeSignListStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSignListStatus(DescribeSignListStatus source) {
        if (source.SignId != null) {
            this.SignId = new Long(source.SignId);
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.ReviewReply != null) {
            this.ReviewReply = new String(source.ReviewReply);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.QualificationId != null) {
            this.QualificationId = new Long(source.QualificationId);
        }
        if (source.QualificationName != null) {
            this.QualificationName = new String(source.QualificationName);
        }
        if (source.QualificationStatusCode != null) {
            this.QualificationStatusCode = new Long(source.QualificationStatusCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ReviewReply", this.ReviewReply);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "QualificationId", this.QualificationId);
        this.setParamSimple(map, prefix + "QualificationName", this.QualificationName);
        this.setParamSimple(map, prefix + "QualificationStatusCode", this.QualificationStatusCode);

    }
}

