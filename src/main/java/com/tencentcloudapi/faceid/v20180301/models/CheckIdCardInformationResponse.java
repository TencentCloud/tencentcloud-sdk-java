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

public class CheckIdCardInformationResponse extends AbstractModel{

    /**
    * 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 业务结果描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 民族
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 出生日期
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 身份证号
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * 身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。
    */
    @SerializedName("Portrait")
    @Expose
    private String Portrait;

    /**
    * 告警信息，当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息，Code 告警码列表和释义：

-9101 身份证边框不完整告警，
-9102 身份证复印件告警，
-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证 PS 告警。
-8001 图片模糊告警
多个会 |  隔开如 "-9101|-9106|-9104"
    */
    @SerializedName("Warnings")
    @Expose
    private String Warnings;

    /**
    * 图片质量分数，当请求Config中配置图片模糊告警该参数才有意义，取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。
    */
    @SerializedName("Quality")
    @Expose
    private Float Quality;

    /**
    * 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一） 
     * @return Sim 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
     * @param Sim 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
    }

    /**
     * Get 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分 
     * @return Result 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     * @param Result 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 业务结果描述。 
     * @return Description 业务结果描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务结果描述。
     * @param Description 业务结果描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 性别 
     * @return Sex 性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
     * @param Sex 性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 民族 
     * @return Nation 民族
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 民族
     * @param Nation 民族
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 出生日期 
     * @return Birth 出生日期
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set 出生日期
     * @param Birth 出生日期
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 身份证号 
     * @return IdNum 身份证号
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set 身份证号
     * @param IdNum 身份证号
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get 身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。 
     * @return Portrait 身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。
     */
    public String getPortrait() {
        return this.Portrait;
    }

    /**
     * Set 身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。
     * @param Portrait 身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。
     */
    public void setPortrait(String Portrait) {
        this.Portrait = Portrait;
    }

    /**
     * Get 告警信息，当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息，Code 告警码列表和释义：

-9101 身份证边框不完整告警，
-9102 身份证复印件告警，
-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证 PS 告警。
-8001 图片模糊告警
多个会 |  隔开如 "-9101|-9106|-9104" 
     * @return Warnings 告警信息，当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息，Code 告警码列表和释义：

-9101 身份证边框不完整告警，
-9102 身份证复印件告警，
-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证 PS 告警。
-8001 图片模糊告警
多个会 |  隔开如 "-9101|-9106|-9104"
     */
    public String getWarnings() {
        return this.Warnings;
    }

    /**
     * Set 告警信息，当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息，Code 告警码列表和释义：

-9101 身份证边框不完整告警，
-9102 身份证复印件告警，
-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证 PS 告警。
-8001 图片模糊告警
多个会 |  隔开如 "-9101|-9106|-9104"
     * @param Warnings 告警信息，当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息，Code 告警码列表和释义：

-9101 身份证边框不完整告警，
-9102 身份证复印件告警，
-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证 PS 告警。
-8001 图片模糊告警
多个会 |  隔开如 "-9101|-9106|-9104"
     */
    public void setWarnings(String Warnings) {
        this.Warnings = Warnings;
    }

    /**
     * Get 图片质量分数，当请求Config中配置图片模糊告警该参数才有意义，取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。 
     * @return Quality 图片质量分数，当请求Config中配置图片模糊告警该参数才有意义，取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。
     */
    public Float getQuality() {
        return this.Quality;
    }

    /**
     * Set 图片质量分数，当请求Config中配置图片模糊告警该参数才有意义，取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。
     * @param Quality 图片质量分数，当请求Config中配置图片模糊告警该参数才有意义，取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。
     */
    public void setQuality(Float Quality) {
        this.Quality = Quality;
    }

    /**
     * Get 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encryption 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encryption 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CheckIdCardInformationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIdCardInformationResponse(CheckIdCardInformationResponse source) {
        if (source.Sim != null) {
            this.Sim = new Float(source.Sim);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Birth != null) {
            this.Birth = new String(source.Birth);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Portrait != null) {
            this.Portrait = new String(source.Portrait);
        }
        if (source.Warnings != null) {
            this.Warnings = new String(source.Warnings);
        }
        if (source.Quality != null) {
            this.Quality = new Float(source.Quality);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Portrait", this.Portrait);
        this.setParamSimple(map, prefix + "Warnings", this.Warnings);
        this.setParamSimple(map, prefix + "Quality", this.Quality);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

