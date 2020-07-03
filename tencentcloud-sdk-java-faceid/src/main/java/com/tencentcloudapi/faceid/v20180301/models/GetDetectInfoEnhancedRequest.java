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

public class GetDetectInfoEnhancedRequest extends AbstractModel{

    /**
    * 人脸核身流程的标识，调用DetectAuth接口时生成。
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
    * 指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息）。
如 134表示拉取文本类、视频最佳截图信息、视频信息。
默认值：0
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
    * 从活体视频中截取一定张数的最佳帧。默认为0，最大为10，超出10的最多只给10张。（InfoType需要包含3）
    */
    @SerializedName("BestFramesCount")
    @Expose
    private Long BestFramesCount;

    /**
    * 是否对身份证照片进行裁边。默认为false。（InfoType需要包含2）
    */
    @SerializedName("IsCutIdCardImage")
    @Expose
    private Boolean IsCutIdCardImage;

    /**
    * 是否需要从身份证中抠出头像。默认为false。（InfoType需要包含2）
    */
    @SerializedName("IsNeedIdCardAvatar")
    @Expose
    private Boolean IsNeedIdCardAvatar;

    /**
     * Get 人脸核身流程的标识，调用DetectAuth接口时生成。 
     * @return BizToken 人脸核身流程的标识，调用DetectAuth接口时生成。
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set 人脸核身流程的标识，调用DetectAuth接口时生成。
     * @param BizToken 人脸核身流程的标识，调用DetectAuth接口时生成。
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
     * Get 指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息）。
如 134表示拉取文本类、视频最佳截图信息、视频信息。
默认值：0 
     * @return InfoType 指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息）。
如 134表示拉取文本类、视频最佳截图信息、视频信息。
默认值：0
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息）。
如 134表示拉取文本类、视频最佳截图信息、视频信息。
默认值：0
     * @param InfoType 指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证信息；3：视频最佳截图信息；4：视频信息）。
如 134表示拉取文本类、视频最佳截图信息、视频信息。
默认值：0
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 从活体视频中截取一定张数的最佳帧。默认为0，最大为10，超出10的最多只给10张。（InfoType需要包含3） 
     * @return BestFramesCount 从活体视频中截取一定张数的最佳帧。默认为0，最大为10，超出10的最多只给10张。（InfoType需要包含3）
     */
    public Long getBestFramesCount() {
        return this.BestFramesCount;
    }

    /**
     * Set 从活体视频中截取一定张数的最佳帧。默认为0，最大为10，超出10的最多只给10张。（InfoType需要包含3）
     * @param BestFramesCount 从活体视频中截取一定张数的最佳帧。默认为0，最大为10，超出10的最多只给10张。（InfoType需要包含3）
     */
    public void setBestFramesCount(Long BestFramesCount) {
        this.BestFramesCount = BestFramesCount;
    }

    /**
     * Get 是否对身份证照片进行裁边。默认为false。（InfoType需要包含2） 
     * @return IsCutIdCardImage 是否对身份证照片进行裁边。默认为false。（InfoType需要包含2）
     */
    public Boolean getIsCutIdCardImage() {
        return this.IsCutIdCardImage;
    }

    /**
     * Set 是否对身份证照片进行裁边。默认为false。（InfoType需要包含2）
     * @param IsCutIdCardImage 是否对身份证照片进行裁边。默认为false。（InfoType需要包含2）
     */
    public void setIsCutIdCardImage(Boolean IsCutIdCardImage) {
        this.IsCutIdCardImage = IsCutIdCardImage;
    }

    /**
     * Get 是否需要从身份证中抠出头像。默认为false。（InfoType需要包含2） 
     * @return IsNeedIdCardAvatar 是否需要从身份证中抠出头像。默认为false。（InfoType需要包含2）
     */
    public Boolean getIsNeedIdCardAvatar() {
        return this.IsNeedIdCardAvatar;
    }

    /**
     * Set 是否需要从身份证中抠出头像。默认为false。（InfoType需要包含2）
     * @param IsNeedIdCardAvatar 是否需要从身份证中抠出头像。默认为false。（InfoType需要包含2）
     */
    public void setIsNeedIdCardAvatar(Boolean IsNeedIdCardAvatar) {
        this.IsNeedIdCardAvatar = IsNeedIdCardAvatar;
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

    }
}

