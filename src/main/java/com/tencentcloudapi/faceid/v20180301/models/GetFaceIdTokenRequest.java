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

public class GetFaceIdTokenRequest extends AbstractModel{

    /**
    * 本地上传照片(LOCAL)、商业库(BUSINESS)
    */
    @SerializedName("CompareLib")
    @Expose
    private String CompareLib;

    /**
    * CompareLib为商业库时必传。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * CompareLib为商业库库时必传。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * CompareLib为上传照片比对时必传，Base64后图片最大8MB。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * SDK中生成的Meta字符串
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
    * 透传参数 1000长度字符串
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get 本地上传照片(LOCAL)、商业库(BUSINESS) 
     * @return CompareLib 本地上传照片(LOCAL)、商业库(BUSINESS)
     */
    public String getCompareLib() {
        return this.CompareLib;
    }

    /**
     * Set 本地上传照片(LOCAL)、商业库(BUSINESS)
     * @param CompareLib 本地上传照片(LOCAL)、商业库(BUSINESS)
     */
    public void setCompareLib(String CompareLib) {
        this.CompareLib = CompareLib;
    }

    /**
     * Get CompareLib为商业库时必传。 
     * @return IdCard CompareLib为商业库时必传。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set CompareLib为商业库时必传。
     * @param IdCard CompareLib为商业库时必传。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get CompareLib为商业库库时必传。 
     * @return Name CompareLib为商业库库时必传。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set CompareLib为商业库库时必传。
     * @param Name CompareLib为商业库库时必传。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get CompareLib为上传照片比对时必传，Base64后图片最大8MB。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。 
     * @return ImageBase64 CompareLib为上传照片比对时必传，Base64后图片最大8MB。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set CompareLib为上传照片比对时必传，Base64后图片最大8MB。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     * @param ImageBase64 CompareLib为上传照片比对时必传，Base64后图片最大8MB。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get SDK中生成的Meta字符串 
     * @return Meta SDK中生成的Meta字符串
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set SDK中生成的Meta字符串
     * @param Meta SDK中生成的Meta字符串
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    /**
     * Get 透传参数 1000长度字符串 
     * @return Extra 透传参数 1000长度字符串
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传参数 1000长度字符串
     * @param Extra 透传参数 1000长度字符串
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
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

    }
}

