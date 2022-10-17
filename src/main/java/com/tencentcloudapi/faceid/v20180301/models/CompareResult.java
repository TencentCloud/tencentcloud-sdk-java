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

public class CompareResult extends AbstractModel{

    /**
    * 最终比对结果
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 最终比对结果描述
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 本次活体SDK生成的活体算法数据包
    */
    @SerializedName("LiveData")
    @Expose
    private FileInfo LiveData;

    /**
    * 本次用户活体验证过程的视频，url链接有效期10分钟。
    */
    @SerializedName("LiveVideo")
    @Expose
    private FileInfo LiveVideo;

    /**
    * 活体认证结果码
    */
    @SerializedName("LiveErrorCode")
    @Expose
    private String LiveErrorCode;

    /**
    * 活体认证结果描述
    */
    @SerializedName("LiveErrorMsg")
    @Expose
    private String LiveErrorMsg;

    /**
    * 本次活体的最佳人像截图，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrame")
    @Expose
    private FileInfo BestFrame;

    /**
    * 证件照头像截图，url链接有效期10分钟。
    */
    @SerializedName("ProfileImage")
    @Expose
    private FileInfo ProfileImage;

    /**
    * 人脸比对结果码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareErrorCode")
    @Expose
    private String CompareErrorCode;

    /**
    * 人脸比对结果描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareErrorMsg")
    @Expose
    private String CompareErrorMsg;

    /**
    * 相似度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * 该字段废弃
    */
    @SerializedName("IsNeedCharge")
    @Expose
    private Boolean IsNeedCharge;

    /**
    * 用户编辑后的证件照信息，如果DisableChangeOcrResult为true禁用编辑无该值。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string
- ID string
- Name string
- Address string
- Type string 证件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CardInfoInputJson")
    @Expose
    private FileInfo CardInfoInputJson;

    /**
    * 本次认证的请求标识。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 最终比对结果 
     * @return ErrorCode 最终比对结果
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 最终比对结果
     * @param ErrorCode 最终比对结果
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 最终比对结果描述 
     * @return ErrorMsg 最终比对结果描述
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 最终比对结果描述
     * @param ErrorMsg 最终比对结果描述
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 本次活体SDK生成的活体算法数据包 
     * @return LiveData 本次活体SDK生成的活体算法数据包
     */
    public FileInfo getLiveData() {
        return this.LiveData;
    }

    /**
     * Set 本次活体SDK生成的活体算法数据包
     * @param LiveData 本次活体SDK生成的活体算法数据包
     */
    public void setLiveData(FileInfo LiveData) {
        this.LiveData = LiveData;
    }

    /**
     * Get 本次用户活体验证过程的视频，url链接有效期10分钟。 
     * @return LiveVideo 本次用户活体验证过程的视频，url链接有效期10分钟。
     */
    public FileInfo getLiveVideo() {
        return this.LiveVideo;
    }

    /**
     * Set 本次用户活体验证过程的视频，url链接有效期10分钟。
     * @param LiveVideo 本次用户活体验证过程的视频，url链接有效期10分钟。
     */
    public void setLiveVideo(FileInfo LiveVideo) {
        this.LiveVideo = LiveVideo;
    }

    /**
     * Get 活体认证结果码 
     * @return LiveErrorCode 活体认证结果码
     */
    public String getLiveErrorCode() {
        return this.LiveErrorCode;
    }

    /**
     * Set 活体认证结果码
     * @param LiveErrorCode 活体认证结果码
     */
    public void setLiveErrorCode(String LiveErrorCode) {
        this.LiveErrorCode = LiveErrorCode;
    }

    /**
     * Get 活体认证结果描述 
     * @return LiveErrorMsg 活体认证结果描述
     */
    public String getLiveErrorMsg() {
        return this.LiveErrorMsg;
    }

    /**
     * Set 活体认证结果描述
     * @param LiveErrorMsg 活体认证结果描述
     */
    public void setLiveErrorMsg(String LiveErrorMsg) {
        this.LiveErrorMsg = LiveErrorMsg;
    }

    /**
     * Get 本次活体的最佳人像截图，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrame 本次活体的最佳人像截图，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set 本次活体的最佳人像截图，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrame 本次活体的最佳人像截图，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrame(FileInfo BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get 证件照头像截图，url链接有效期10分钟。 
     * @return ProfileImage 证件照头像截图，url链接有效期10分钟。
     */
    public FileInfo getProfileImage() {
        return this.ProfileImage;
    }

    /**
     * Set 证件照头像截图，url链接有效期10分钟。
     * @param ProfileImage 证件照头像截图，url链接有效期10分钟。
     */
    public void setProfileImage(FileInfo ProfileImage) {
        this.ProfileImage = ProfileImage;
    }

    /**
     * Get 人脸比对结果码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareErrorCode 人脸比对结果码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareErrorCode() {
        return this.CompareErrorCode;
    }

    /**
     * Set 人脸比对结果码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareErrorCode 人脸比对结果码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareErrorCode(String CompareErrorCode) {
        this.CompareErrorCode = CompareErrorCode;
    }

    /**
     * Get 人脸比对结果描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareErrorMsg 人脸比对结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareErrorMsg() {
        return this.CompareErrorMsg;
    }

    /**
     * Set 人脸比对结果描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareErrorMsg 人脸比对结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareErrorMsg(String CompareErrorMsg) {
        this.CompareErrorMsg = CompareErrorMsg;
    }

    /**
     * Get 相似度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sim 相似度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set 相似度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sim 相似度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
    }

    /**
     * Get 该字段废弃 
     * @return IsNeedCharge 该字段废弃
     */
    public Boolean getIsNeedCharge() {
        return this.IsNeedCharge;
    }

    /**
     * Set 该字段废弃
     * @param IsNeedCharge 该字段废弃
     */
    public void setIsNeedCharge(Boolean IsNeedCharge) {
        this.IsNeedCharge = IsNeedCharge;
    }

    /**
     * Get 用户编辑后的证件照信息，如果DisableChangeOcrResult为true禁用编辑无该值。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string
- ID string
- Name string
- Address string
- Type string 证件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CardInfoInputJson 用户编辑后的证件照信息，如果DisableChangeOcrResult为true禁用编辑无该值。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string
- ID string
- Name string
- Address string
- Type string 证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo getCardInfoInputJson() {
        return this.CardInfoInputJson;
    }

    /**
     * Set 用户编辑后的证件照信息，如果DisableChangeOcrResult为true禁用编辑无该值。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string
- ID string
- Name string
- Address string
- Type string 证件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CardInfoInputJson 用户编辑后的证件照信息，如果DisableChangeOcrResult为true禁用编辑无该值。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string
- ID string
- Name string
- Address string
- Type string 证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCardInfoInputJson(FileInfo CardInfoInputJson) {
        this.CardInfoInputJson = CardInfoInputJson;
    }

    /**
     * Get 本次认证的请求标识。 
     * @return RequestId 本次认证的请求标识。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 本次认证的请求标识。
     * @param RequestId 本次认证的请求标识。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CompareResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareResult(CompareResult source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.LiveData != null) {
            this.LiveData = new FileInfo(source.LiveData);
        }
        if (source.LiveVideo != null) {
            this.LiveVideo = new FileInfo(source.LiveVideo);
        }
        if (source.LiveErrorCode != null) {
            this.LiveErrorCode = new String(source.LiveErrorCode);
        }
        if (source.LiveErrorMsg != null) {
            this.LiveErrorMsg = new String(source.LiveErrorMsg);
        }
        if (source.BestFrame != null) {
            this.BestFrame = new FileInfo(source.BestFrame);
        }
        if (source.ProfileImage != null) {
            this.ProfileImage = new FileInfo(source.ProfileImage);
        }
        if (source.CompareErrorCode != null) {
            this.CompareErrorCode = new String(source.CompareErrorCode);
        }
        if (source.CompareErrorMsg != null) {
            this.CompareErrorMsg = new String(source.CompareErrorMsg);
        }
        if (source.Sim != null) {
            this.Sim = new Float(source.Sim);
        }
        if (source.IsNeedCharge != null) {
            this.IsNeedCharge = new Boolean(source.IsNeedCharge);
        }
        if (source.CardInfoInputJson != null) {
            this.CardInfoInputJson = new FileInfo(source.CardInfoInputJson);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamObj(map, prefix + "LiveData.", this.LiveData);
        this.setParamObj(map, prefix + "LiveVideo.", this.LiveVideo);
        this.setParamSimple(map, prefix + "LiveErrorCode", this.LiveErrorCode);
        this.setParamSimple(map, prefix + "LiveErrorMsg", this.LiveErrorMsg);
        this.setParamObj(map, prefix + "BestFrame.", this.BestFrame);
        this.setParamObj(map, prefix + "ProfileImage.", this.ProfileImage);
        this.setParamSimple(map, prefix + "CompareErrorCode", this.CompareErrorCode);
        this.setParamSimple(map, prefix + "CompareErrorMsg", this.CompareErrorMsg);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "IsNeedCharge", this.IsNeedCharge);
        this.setParamObj(map, prefix + "CardInfoInputJson.", this.CardInfoInputJson);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

