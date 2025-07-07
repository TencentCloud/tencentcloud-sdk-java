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

public class GetEidResultRequest extends AbstractModel {

    /**
    * E证通流程的唯一标识，调用[GetEidToken](https://cloud.tencent.com/document/product/1007/54089)接口时生成。
    */
    @SerializedName("EidToken")
    @Expose
    private String EidToken;

    /**
    * 指定需要拉取的结果信息。
- 取值范围：
     0：全部。
    1：文本类。
    2：身份证信息。
    3：最佳截图信息。
    5：意愿核身朗读模式相关结果。
    6：意愿核身问答/点头模式相关结果。
- 例如 13表示拉取文本类、最佳截图信息。
- 默认值：0
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
    * 从活体视频中截取一定张数的最佳帧。
- 默认为0，最大为3，超出3的最多只给3张。
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
     * Get E证通流程的唯一标识，调用[GetEidToken](https://cloud.tencent.com/document/product/1007/54089)接口时生成。 
     * @return EidToken E证通流程的唯一标识，调用[GetEidToken](https://cloud.tencent.com/document/product/1007/54089)接口时生成。
     */
    public String getEidToken() {
        return this.EidToken;
    }

    /**
     * Set E证通流程的唯一标识，调用[GetEidToken](https://cloud.tencent.com/document/product/1007/54089)接口时生成。
     * @param EidToken E证通流程的唯一标识，调用[GetEidToken](https://cloud.tencent.com/document/product/1007/54089)接口时生成。
     */
    public void setEidToken(String EidToken) {
        this.EidToken = EidToken;
    }

    /**
     * Get 指定需要拉取的结果信息。
- 取值范围：
     0：全部。
    1：文本类。
    2：身份证信息。
    3：最佳截图信息。
    5：意愿核身朗读模式相关结果。
    6：意愿核身问答/点头模式相关结果。
- 例如 13表示拉取文本类、最佳截图信息。
- 默认值：0 
     * @return InfoType 指定需要拉取的结果信息。
- 取值范围：
     0：全部。
    1：文本类。
    2：身份证信息。
    3：最佳截图信息。
    5：意愿核身朗读模式相关结果。
    6：意愿核身问答/点头模式相关结果。
- 例如 13表示拉取文本类、最佳截图信息。
- 默认值：0
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 指定需要拉取的结果信息。
- 取值范围：
     0：全部。
    1：文本类。
    2：身份证信息。
    3：最佳截图信息。
    5：意愿核身朗读模式相关结果。
    6：意愿核身问答/点头模式相关结果。
- 例如 13表示拉取文本类、最佳截图信息。
- 默认值：0
     * @param InfoType 指定需要拉取的结果信息。
- 取值范围：
     0：全部。
    1：文本类。
    2：身份证信息。
    3：最佳截图信息。
    5：意愿核身朗读模式相关结果。
    6：意愿核身问答/点头模式相关结果。
- 例如 13表示拉取文本类、最佳截图信息。
- 默认值：0
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 从活体视频中截取一定张数的最佳帧。
- 默认为0，最大为3，超出3的最多只给3张。
- InfoType需要包含3。 
     * @return BestFramesCount 从活体视频中截取一定张数的最佳帧。
- 默认为0，最大为3，超出3的最多只给3张。
- InfoType需要包含3。
     */
    public Long getBestFramesCount() {
        return this.BestFramesCount;
    }

    /**
     * Set 从活体视频中截取一定张数的最佳帧。
- 默认为0，最大为3，超出3的最多只给3张。
- InfoType需要包含3。
     * @param BestFramesCount 从活体视频中截取一定张数的最佳帧。
- 默认为0，最大为3，超出3的最多只给3张。
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

    public GetEidResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEidResultRequest(GetEidResultRequest source) {
        if (source.EidToken != null) {
            this.EidToken = new String(source.EidToken);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EidToken", this.EidToken);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "BestFramesCount", this.BestFramesCount);
        this.setParamSimple(map, prefix + "IsCutIdCardImage", this.IsCutIdCardImage);
        this.setParamSimple(map, prefix + "IsNeedIdCardAvatar", this.IsNeedIdCardAvatar);

    }
}

