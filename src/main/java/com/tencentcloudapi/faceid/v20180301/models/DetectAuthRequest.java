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

public class DetectAuthRequest extends AbstractModel{

    /**
    * 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请加慧眼小助手微信（faceid001）进行咨询。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 本接口不需要传递此参数。
    */
    @SerializedName("TerminalType")
    @Expose
    private String TerminalType;

    /**
    * 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 认证结束后重定向的回调链接地址。最长长度1024位。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 透传字段，在获取验证结果时返回。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 用于人脸比对的照片，图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请加慧眼小助手微信（faceid001）进行咨询。 
     * @return RuleId 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请加慧眼小助手微信（faceid001）进行咨询。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请加慧眼小助手微信（faceid001）进行咨询。
     * @param RuleId 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请加慧眼小助手微信（faceid001）进行咨询。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 本接口不需要传递此参数。 
     * @return TerminalType 本接口不需要传递此参数。
     */
    public String getTerminalType() {
        return this.TerminalType;
    }

    /**
     * Set 本接口不需要传递此参数。
     * @param TerminalType 本接口不需要传递此参数。
     */
    public void setTerminalType(String TerminalType) {
        this.TerminalType = TerminalType;
    }

    /**
     * Get 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。 
     * @return IdCard 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     * @param IdCard 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。 
     * @return Name 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     * @param Name 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 认证结束后重定向的回调链接地址。最长长度1024位。 
     * @return RedirectUrl 认证结束后重定向的回调链接地址。最长长度1024位。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 认证结束后重定向的回调链接地址。最长长度1024位。
     * @param RedirectUrl 认证结束后重定向的回调链接地址。最长长度1024位。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 透传字段，在获取验证结果时返回。 
     * @return Extra 透传字段，在获取验证结果时返回。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传字段，在获取验证结果时返回。
     * @param Extra 透传字段，在获取验证结果时返回。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 用于人脸比对的照片，图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，仅支持jpg、png格式。 
     * @return ImageBase64 用于人脸比对的照片，图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 用于人脸比对的照片，图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
     * @param ImageBase64 用于人脸比对的照片，图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "TerminalType", this.TerminalType);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);

    }
}

