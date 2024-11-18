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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdTokenRequest extends AbstractModel {

    /**
    * 比对库。
- 取值范围：
LOCAL：本地上传照片。
BUSINESS：商业库。
    */
    @SerializedName("CompareLib")
    @Expose
    private String CompareLib;

    /**
    * 身份证。
- CompareLib为商业库时必传。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。
- CompareLib为商业库时必传。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 图片的Base64。
- CompareLib为上传照片比对时必传。
- Base64后图片最大8MB。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * SDK中生成的Meta字符串。
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
    * 透传参数。
- 1000长度字符串
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 是否使用cos桶。
- 默认为false。
- 设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。
- 开通地址见https://console.cloud.tencent.com/faceid/cos
- 【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。
    */
    @SerializedName("UseCos")
    @Expose
    private Boolean UseCos;

    /**
    * 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * 用于细分客户使用场景。
- 申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。
- 如有疑问，请添加腾讯云人脸核身小助手进行咨询。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 比对库。
- 取值范围：
LOCAL：本地上传照片。
BUSINESS：商业库。 
     * @return CompareLib 比对库。
- 取值范围：
LOCAL：本地上传照片。
BUSINESS：商业库。
     */
    public String getCompareLib() {
        return this.CompareLib;
    }

    /**
     * Set 比对库。
- 取值范围：
LOCAL：本地上传照片。
BUSINESS：商业库。
     * @param CompareLib 比对库。
- 取值范围：
LOCAL：本地上传照片。
BUSINESS：商业库。
     */
    public void setCompareLib(String CompareLib) {
        this.CompareLib = CompareLib;
    }

    /**
     * Get 身份证。
- CompareLib为商业库时必传。 
     * @return IdCard 身份证。
- CompareLib为商业库时必传。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份证。
- CompareLib为商业库时必传。
     * @param IdCard 身份证。
- CompareLib为商业库时必传。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名。
- CompareLib为商业库时必传。 
     * @return Name 姓名。
- CompareLib为商业库时必传。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名。
- CompareLib为商业库时必传。
     * @param Name 姓名。
- CompareLib为商业库时必传。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 图片的Base64。
- CompareLib为上传照片比对时必传。
- Base64后图片最大8MB。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。 
     * @return ImageBase64 图片的Base64。
- CompareLib为上传照片比对时必传。
- Base64后图片最大8MB。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的Base64。
- CompareLib为上传照片比对时必传。
- Base64后图片最大8MB。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     * @param ImageBase64 图片的Base64。
- CompareLib为上传照片比对时必传。
- Base64后图片最大8MB。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get SDK中生成的Meta字符串。 
     * @return Meta SDK中生成的Meta字符串。
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set SDK中生成的Meta字符串。
     * @param Meta SDK中生成的Meta字符串。
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    /**
     * Get 透传参数。
- 1000长度字符串 
     * @return Extra 透传参数。
- 1000长度字符串
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传参数。
- 1000长度字符串
     * @param Extra 透传参数。
- 1000长度字符串
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 是否使用cos桶。
- 默认为false。
- 设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。
- 开通地址见https://console.cloud.tencent.com/faceid/cos
- 【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。 
     * @return UseCos 是否使用cos桶。
- 默认为false。
- 设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。
- 开通地址见https://console.cloud.tencent.com/faceid/cos
- 【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。
     */
    public Boolean getUseCos() {
        return this.UseCos;
    }

    /**
     * Set 是否使用cos桶。
- 默认为false。
- 设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。
- 开通地址见https://console.cloud.tencent.com/faceid/cos
- 【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。
     * @param UseCos 是否使用cos桶。
- 默认为false。
- 设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。
- 开通地址见https://console.cloud.tencent.com/faceid/cos
- 【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。
     */
    public void setUseCos(Boolean UseCos) {
        this.UseCos = UseCos;
    }

    /**
     * Get 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。 
     * @return Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     * @param Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 用于细分客户使用场景。
- 申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。
- 如有疑问，请添加腾讯云人脸核身小助手进行咨询。 
     * @return RuleId 用于细分客户使用场景。
- 申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。
- 如有疑问，请添加腾讯云人脸核身小助手进行咨询。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 用于细分客户使用场景。
- 申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。
- 如有疑问，请添加腾讯云人脸核身小助手进行咨询。
     * @param RuleId 用于细分客户使用场景。
- 申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。
- 如有疑问，请添加腾讯云人脸核身小助手进行咨询。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public GetFaceIdTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceIdTokenRequest(GetFaceIdTokenRequest source) {
        if (source.CompareLib != null) {
            this.CompareLib = new String(source.CompareLib);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Meta != null) {
            this.Meta = new String(source.Meta);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.UseCos != null) {
            this.UseCos = new Boolean(source.UseCos);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompareLib", this.CompareLib);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "Meta", this.Meta);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "UseCos", this.UseCos);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

