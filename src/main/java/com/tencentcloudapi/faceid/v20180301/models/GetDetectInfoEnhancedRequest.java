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

public class GetDetectInfoEnhancedRequest extends AbstractModel {

    /**
    * 人脸核身流程的标识，调用[DetectAuth](https://cloud.tencent.com/document/product/1007/31816)接口时生成。
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
    * 用于细分客户使用场景，由腾讯侧在线下对接时分配。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 指定拉取的结果信息。
- 取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息；5：意愿核身朗读模式相关结果；6：意愿核身问答/点头模式相关结果）。
- 例如 13 表示拉取文本类、视频最佳截图信息。
- 默认值：0
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
    * 从活体视频中截取一定张数的自截帧。
- 默认值为0，最大值为10，超出10的最多只给10张。
- InfoType需要包含3。
    */
    @SerializedName("BestFramesCount")
    @Expose
    private Long BestFramesCount;

    /**
    * 是否对身份证照片进行裁边。
- 默认为false。
- InfoType需要包含2。
    */
    @SerializedName("IsCutIdCardImage")
    @Expose
    private Boolean IsCutIdCardImage;

    /**
    * 是否需要从身份证中抠出头像。
- 默认为false。
- InfoType需要包含2。
    */
    @SerializedName("IsNeedIdCardAvatar")
    @Expose
    private Boolean IsNeedIdCardAvatar;

    /**
    * 已弃用。
    */
    @SerializedName("IsEncrypt")
    @Expose
    private Boolean IsEncrypt;

    /**
    * 是否需要对返回中的敏感信息进行加密。
- 只需指定加密算法Algorithm即可，其余字段传入默认值。
- 敏感信息包括：Response.Text.IdCard、Response.Text.Name、Response.Text.OcrIdCard、Response.Text.OcrName。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * 是否对回包整体进行加密。
    */
    @SerializedName("IsEncryptResponse")
    @Expose
    private Boolean IsEncryptResponse;

    /**
    * 是否需要返回认证中间过程的刷脸重试视频，默认不开启，多段视频需要存储到COS空间中，因此开启后还需要额外开启数据存储服务才可生效。详见[数据存储指引](https://cloud.tencent.com/document/product/1007/104229)。
    */
    @SerializedName("IsReturnAllVideo")
    @Expose
    private Boolean IsReturnAllVideo;

    /**
     * Get 人脸核身流程的标识，调用[DetectAuth](https://cloud.tencent.com/document/product/1007/31816)接口时生成。 
     * @return BizToken 人脸核身流程的标识，调用[DetectAuth](https://cloud.tencent.com/document/product/1007/31816)接口时生成。
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set 人脸核身流程的标识，调用[DetectAuth](https://cloud.tencent.com/document/product/1007/31816)接口时生成。
     * @param BizToken 人脸核身流程的标识，调用[DetectAuth](https://cloud.tencent.com/document/product/1007/31816)接口时生成。
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    /**
     * Get 用于细分客户使用场景，由腾讯侧在线下对接时分配。 
     * @return RuleId 用于细分客户使用场景，由腾讯侧在线下对接时分配。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 用于细分客户使用场景，由腾讯侧在线下对接时分配。
     * @param RuleId 用于细分客户使用场景，由腾讯侧在线下对接时分配。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 指定拉取的结果信息。
- 取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息；5：意愿核身朗读模式相关结果；6：意愿核身问答/点头模式相关结果）。
- 例如 13 表示拉取文本类、视频最佳截图信息。
- 默认值：0 
     * @return InfoType 指定拉取的结果信息。
- 取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息；5：意愿核身朗读模式相关结果；6：意愿核身问答/点头模式相关结果）。
- 例如 13 表示拉取文本类、视频最佳截图信息。
- 默认值：0
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 指定拉取的结果信息。
- 取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息；5：意愿核身朗读模式相关结果；6：意愿核身问答/点头模式相关结果）。
- 例如 13 表示拉取文本类、视频最佳截图信息。
- 默认值：0
     * @param InfoType 指定拉取的结果信息。
- 取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息；5：意愿核身朗读模式相关结果；6：意愿核身问答/点头模式相关结果）。
- 例如 13 表示拉取文本类、视频最佳截图信息。
- 默认值：0
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 从活体视频中截取一定张数的自截帧。
- 默认值为0，最大值为10，超出10的最多只给10张。
- InfoType需要包含3。 
     * @return BestFramesCount 从活体视频中截取一定张数的自截帧。
- 默认值为0，最大值为10，超出10的最多只给10张。
- InfoType需要包含3。
     */
    public Long getBestFramesCount() {
        return this.BestFramesCount;
    }

    /**
     * Set 从活体视频中截取一定张数的自截帧。
- 默认值为0，最大值为10，超出10的最多只给10张。
- InfoType需要包含3。
     * @param BestFramesCount 从活体视频中截取一定张数的自截帧。
- 默认值为0，最大值为10，超出10的最多只给10张。
- InfoType需要包含3。
     */
    public void setBestFramesCount(Long BestFramesCount) {
        this.BestFramesCount = BestFramesCount;
    }

    /**
     * Get 是否对身份证照片进行裁边。
- 默认为false。
- InfoType需要包含2。 
     * @return IsCutIdCardImage 是否对身份证照片进行裁边。
- 默认为false。
- InfoType需要包含2。
     */
    public Boolean getIsCutIdCardImage() {
        return this.IsCutIdCardImage;
    }

    /**
     * Set 是否对身份证照片进行裁边。
- 默认为false。
- InfoType需要包含2。
     * @param IsCutIdCardImage 是否对身份证照片进行裁边。
- 默认为false。
- InfoType需要包含2。
     */
    public void setIsCutIdCardImage(Boolean IsCutIdCardImage) {
        this.IsCutIdCardImage = IsCutIdCardImage;
    }

    /**
     * Get 是否需要从身份证中抠出头像。
- 默认为false。
- InfoType需要包含2。 
     * @return IsNeedIdCardAvatar 是否需要从身份证中抠出头像。
- 默认为false。
- InfoType需要包含2。
     */
    public Boolean getIsNeedIdCardAvatar() {
        return this.IsNeedIdCardAvatar;
    }

    /**
     * Set 是否需要从身份证中抠出头像。
- 默认为false。
- InfoType需要包含2。
     * @param IsNeedIdCardAvatar 是否需要从身份证中抠出头像。
- 默认为false。
- InfoType需要包含2。
     */
    public void setIsNeedIdCardAvatar(Boolean IsNeedIdCardAvatar) {
        this.IsNeedIdCardAvatar = IsNeedIdCardAvatar;
    }

    /**
     * Get 已弃用。 
     * @return IsEncrypt 已弃用。
     */
    public Boolean getIsEncrypt() {
        return this.IsEncrypt;
    }

    /**
     * Set 已弃用。
     * @param IsEncrypt 已弃用。
     */
    public void setIsEncrypt(Boolean IsEncrypt) {
        this.IsEncrypt = IsEncrypt;
    }

    /**
     * Get 是否需要对返回中的敏感信息进行加密。
- 只需指定加密算法Algorithm即可，其余字段传入默认值。
- 敏感信息包括：Response.Text.IdCard、Response.Text.Name、Response.Text.OcrIdCard、Response.Text.OcrName。 
     * @return Encryption 是否需要对返回中的敏感信息进行加密。
- 只需指定加密算法Algorithm即可，其余字段传入默认值。
- 敏感信息包括：Response.Text.IdCard、Response.Text.Name、Response.Text.OcrIdCard、Response.Text.OcrName。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 是否需要对返回中的敏感信息进行加密。
- 只需指定加密算法Algorithm即可，其余字段传入默认值。
- 敏感信息包括：Response.Text.IdCard、Response.Text.Name、Response.Text.OcrIdCard、Response.Text.OcrName。
     * @param Encryption 是否需要对返回中的敏感信息进行加密。
- 只需指定加密算法Algorithm即可，其余字段传入默认值。
- 敏感信息包括：Response.Text.IdCard、Response.Text.Name、Response.Text.OcrIdCard、Response.Text.OcrName。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 是否对回包整体进行加密。 
     * @return IsEncryptResponse 是否对回包整体进行加密。
     */
    public Boolean getIsEncryptResponse() {
        return this.IsEncryptResponse;
    }

    /**
     * Set 是否对回包整体进行加密。
     * @param IsEncryptResponse 是否对回包整体进行加密。
     */
    public void setIsEncryptResponse(Boolean IsEncryptResponse) {
        this.IsEncryptResponse = IsEncryptResponse;
    }

    /**
     * Get 是否需要返回认证中间过程的刷脸重试视频，默认不开启，多段视频需要存储到COS空间中，因此开启后还需要额外开启数据存储服务才可生效。详见[数据存储指引](https://cloud.tencent.com/document/product/1007/104229)。 
     * @return IsReturnAllVideo 是否需要返回认证中间过程的刷脸重试视频，默认不开启，多段视频需要存储到COS空间中，因此开启后还需要额外开启数据存储服务才可生效。详见[数据存储指引](https://cloud.tencent.com/document/product/1007/104229)。
     */
    public Boolean getIsReturnAllVideo() {
        return this.IsReturnAllVideo;
    }

    /**
     * Set 是否需要返回认证中间过程的刷脸重试视频，默认不开启，多段视频需要存储到COS空间中，因此开启后还需要额外开启数据存储服务才可生效。详见[数据存储指引](https://cloud.tencent.com/document/product/1007/104229)。
     * @param IsReturnAllVideo 是否需要返回认证中间过程的刷脸重试视频，默认不开启，多段视频需要存储到COS空间中，因此开启后还需要额外开启数据存储服务才可生效。详见[数据存储指引](https://cloud.tencent.com/document/product/1007/104229)。
     */
    public void setIsReturnAllVideo(Boolean IsReturnAllVideo) {
        this.IsReturnAllVideo = IsReturnAllVideo;
    }

    public GetDetectInfoEnhancedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDetectInfoEnhancedRequest(GetDetectInfoEnhancedRequest source) {
        if (source.BizToken != null) {
            this.BizToken = new String(source.BizToken);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.InfoType != null) {
            this.InfoType = new String(source.InfoType);
        }
        if (source.BestFramesCount != null) {
            this.BestFramesCount = new Long(source.BestFramesCount);
        }
        if (source.IsCutIdCardImage != null) {
            this.IsCutIdCardImage = new Boolean(source.IsCutIdCardImage);
        }
        if (source.IsNeedIdCardAvatar != null) {
            this.IsNeedIdCardAvatar = new Boolean(source.IsNeedIdCardAvatar);
        }
        if (source.IsEncrypt != null) {
            this.IsEncrypt = new Boolean(source.IsEncrypt);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.IsEncryptResponse != null) {
            this.IsEncryptResponse = new Boolean(source.IsEncryptResponse);
        }
        if (source.IsReturnAllVideo != null) {
            this.IsReturnAllVideo = new Boolean(source.IsReturnAllVideo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "BestFramesCount", this.BestFramesCount);
        this.setParamSimple(map, prefix + "IsCutIdCardImage", this.IsCutIdCardImage);
        this.setParamSimple(map, prefix + "IsNeedIdCardAvatar", this.IsNeedIdCardAvatar);
        this.setParamSimple(map, prefix + "IsEncrypt", this.IsEncrypt);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "IsEncryptResponse", this.IsEncryptResponse);
        this.setParamSimple(map, prefix + "IsReturnAllVideo", this.IsReturnAllVideo);

    }
}

