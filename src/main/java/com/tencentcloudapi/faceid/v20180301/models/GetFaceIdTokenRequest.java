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

public class GetFaceIdTokenRequest extends AbstractModel {

    /**
    * <p>比对库。</p><ul><li>取值范围：<br>LOCAL：本地上传照片。<br>BUSINESS：商业库。</li></ul>
    */
    @SerializedName("CompareLib")
    @Expose
    private String CompareLib;

    /**
    * <p>身份证。</p><ul><li>CompareLib为商业库时必传。</li></ul>
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>姓名。</p><ul><li>CompareLib为商业库时必传。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>图片的Base64。</p><ul><li>CompareLib为上传照片比对时必传。</li><li>Base64后图片最大8MB。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>SDK中生成的Meta字符串。</p>
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
    * <p>透传参数。</p><ul><li>1000长度字符串</li></ul>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>是否使用cos桶。</p><ul><li>默认为false。</li><li>设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。</li><li>开通地址见https://console.cloud.tencent.com/faceid/cos</li><li>【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。</li></ul>
    */
    @SerializedName("UseCos")
    @Expose
    private Boolean UseCos;

    /**
    * <p>敏感数据加密信息。对传入信息（姓名、身份证号、自传照片）有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>用于细分客户使用场景。</p><ul><li>申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。</li><li>如有疑问，请添加腾讯云人脸核身小助手进行咨询。</li></ul>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>SDK和用户设备的元信息。该字段的值由HuiYan SDK以JSON字符串格式返回。  说明：不要修改返回值，直接传递即可。</p>
    */
    @SerializedName("MetaData")
    @Expose
    private String MetaData;

    /**
     * Get <p>比对库。</p><ul><li>取值范围：<br>LOCAL：本地上传照片。<br>BUSINESS：商业库。</li></ul> 
     * @return CompareLib <p>比对库。</p><ul><li>取值范围：<br>LOCAL：本地上传照片。<br>BUSINESS：商业库。</li></ul>
     */
    public String getCompareLib() {
        return this.CompareLib;
    }

    /**
     * Set <p>比对库。</p><ul><li>取值范围：<br>LOCAL：本地上传照片。<br>BUSINESS：商业库。</li></ul>
     * @param CompareLib <p>比对库。</p><ul><li>取值范围：<br>LOCAL：本地上传照片。<br>BUSINESS：商业库。</li></ul>
     */
    public void setCompareLib(String CompareLib) {
        this.CompareLib = CompareLib;
    }

    /**
     * Get <p>身份证。</p><ul><li>CompareLib为商业库时必传。</li></ul> 
     * @return IdCard <p>身份证。</p><ul><li>CompareLib为商业库时必传。</li></ul>
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>身份证。</p><ul><li>CompareLib为商业库时必传。</li></ul>
     * @param IdCard <p>身份证。</p><ul><li>CompareLib为商业库时必传。</li></ul>
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>姓名。</p><ul><li>CompareLib为商业库时必传。</li></ul> 
     * @return Name <p>姓名。</p><ul><li>CompareLib为商业库时必传。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名。</p><ul><li>CompareLib为商业库时必传。</li></ul>
     * @param Name <p>姓名。</p><ul><li>CompareLib为商业库时必传。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>图片的Base64。</p><ul><li>CompareLib为上传照片比对时必传。</li><li>Base64后图片最大8MB。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul> 
     * @return ImageBase64 <p>图片的Base64。</p><ul><li>CompareLib为上传照片比对时必传。</li><li>Base64后图片最大8MB。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的Base64。</p><ul><li>CompareLib为上传照片比对时必传。</li><li>Base64后图片最大8MB。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     * @param ImageBase64 <p>图片的Base64。</p><ul><li>CompareLib为上传照片比对时必传。</li><li>Base64后图片最大8MB。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>SDK中生成的Meta字符串。</p> 
     * @return Meta <p>SDK中生成的Meta字符串。</p>
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set <p>SDK中生成的Meta字符串。</p>
     * @param Meta <p>SDK中生成的Meta字符串。</p>
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    /**
     * Get <p>透传参数。</p><ul><li>1000长度字符串</li></ul> 
     * @return Extra <p>透传参数。</p><ul><li>1000长度字符串</li></ul>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>透传参数。</p><ul><li>1000长度字符串</li></ul>
     * @param Extra <p>透传参数。</p><ul><li>1000长度字符串</li></ul>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>是否使用cos桶。</p><ul><li>默认为false。</li><li>设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。</li><li>开通地址见https://console.cloud.tencent.com/faceid/cos</li><li>【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。</li></ul> 
     * @return UseCos <p>是否使用cos桶。</p><ul><li>默认为false。</li><li>设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。</li><li>开通地址见https://console.cloud.tencent.com/faceid/cos</li><li>【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。</li></ul>
     */
    public Boolean getUseCos() {
        return this.UseCos;
    }

    /**
     * Set <p>是否使用cos桶。</p><ul><li>默认为false。</li><li>设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。</li><li>开通地址见https://console.cloud.tencent.com/faceid/cos</li><li>【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。</li></ul>
     * @param UseCos <p>是否使用cos桶。</p><ul><li>默认为false。</li><li>设置该参数为true后，核身过程中的视频图片将会存储在人脸核身控制台授权cos的bucket中，拉取结果时会返回对应资源完整cos地址。</li><li>开通地址见https://console.cloud.tencent.com/faceid/cos</li><li>【注意】选择该参数为true后将不返回base64数据，请根据接入情况谨慎修改。</li></ul>
     */
    public void setUseCos(Boolean UseCos) {
        this.UseCos = UseCos;
    }

    /**
     * Get <p>敏感数据加密信息。对传入信息（姓名、身份证号、自传照片）有加密需求的用户可使用此参数，详情请点击左侧链接。</p> 
     * @return Encryption <p>敏感数据加密信息。对传入信息（姓名、身份证号、自传照片）有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>敏感数据加密信息。对传入信息（姓名、身份证号、自传照片）有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     * @param Encryption <p>敏感数据加密信息。对传入信息（姓名、身份证号、自传照片）有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>用于细分客户使用场景。</p><ul><li>申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。</li><li>如有疑问，请添加腾讯云人脸核身小助手进行咨询。</li></ul> 
     * @return RuleId <p>用于细分客户使用场景。</p><ul><li>申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。</li><li>如有疑问，请添加腾讯云人脸核身小助手进行咨询。</li></ul>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>用于细分客户使用场景。</p><ul><li>申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。</li><li>如有疑问，请添加腾讯云人脸核身小助手进行咨询。</li></ul>
     * @param RuleId <p>用于细分客户使用场景。</p><ul><li>申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。</li><li>如有疑问，请添加腾讯云人脸核身小助手进行咨询。</li></ul>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>SDK和用户设备的元信息。该字段的值由HuiYan SDK以JSON字符串格式返回。  说明：不要修改返回值，直接传递即可。</p> 
     * @return MetaData <p>SDK和用户设备的元信息。该字段的值由HuiYan SDK以JSON字符串格式返回。  说明：不要修改返回值，直接传递即可。</p>
     */
    public String getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>SDK和用户设备的元信息。该字段的值由HuiYan SDK以JSON字符串格式返回。  说明：不要修改返回值，直接传递即可。</p>
     * @param MetaData <p>SDK和用户设备的元信息。该字段的值由HuiYan SDK以JSON字符串格式返回。  说明：不要修改返回值，直接传递即可。</p>
     */
    public void setMetaData(String MetaData) {
        this.MetaData = MetaData;
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
        if (source.MetaData != null) {
            this.MetaData = new String(source.MetaData);
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
        this.setParamSimple(map, prefix + "MetaData", this.MetaData);

    }
}

