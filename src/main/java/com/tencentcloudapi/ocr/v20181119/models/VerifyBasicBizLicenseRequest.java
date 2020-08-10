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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyBasicBizLicenseRequest extends AbstractModel{

    /**
    * 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 用于入参是营业执照图片的场景，表示需要校验的参数：RegNum（注册号或者统一社会信用代码），Name（企业名称），Address（经营地址）。选择后会返回相关参数校验结果。RegNum为必选，Name和Address可选。
格式为{RegNum: true, Name:true/false, Address:true/false}

设置方式参考：
Config = Json.stringify({"Name":true,"Address":true})
API 3.0 Explorer 设置方式参考：
Config = {"Name":true,"Address":true}
    */
    @SerializedName("ImageConfig")
    @Expose
    private String ImageConfig;

    /**
    * 用于入参是文本的场景，RegNum表示注册号或者统一社会信用代码。RegNum为必选项。
    */
    @SerializedName("RegNum")
    @Expose
    private String RegNum;

    /**
    * 用于入参是文本的场景，Name表示企业名称。Name为可选项，填写后会返回Name的校验结果。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用于入参是文本的场景，Address表示经营地址，填写后会返回Name的校验结果。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 1表示输出注册资本字段（单位：万元），其他值表示不输出。默认不输出。
    */
    @SerializedName("RegCapital")
    @Expose
    private Long RegCapital;

    /**
     * Get 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageUrl 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageUrl 用于入参是营业执照图片的场景，ImageBase64和ImageUrl必选一个输入。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 用于入参是营业执照图片的场景，表示需要校验的参数：RegNum（注册号或者统一社会信用代码），Name（企业名称），Address（经营地址）。选择后会返回相关参数校验结果。RegNum为必选，Name和Address可选。
格式为{RegNum: true, Name:true/false, Address:true/false}

设置方式参考：
Config = Json.stringify({"Name":true,"Address":true})
API 3.0 Explorer 设置方式参考：
Config = {"Name":true,"Address":true} 
     * @return ImageConfig 用于入参是营业执照图片的场景，表示需要校验的参数：RegNum（注册号或者统一社会信用代码），Name（企业名称），Address（经营地址）。选择后会返回相关参数校验结果。RegNum为必选，Name和Address可选。
格式为{RegNum: true, Name:true/false, Address:true/false}

设置方式参考：
Config = Json.stringify({"Name":true,"Address":true})
API 3.0 Explorer 设置方式参考：
Config = {"Name":true,"Address":true}
     */
    public String getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set 用于入参是营业执照图片的场景，表示需要校验的参数：RegNum（注册号或者统一社会信用代码），Name（企业名称），Address（经营地址）。选择后会返回相关参数校验结果。RegNum为必选，Name和Address可选。
格式为{RegNum: true, Name:true/false, Address:true/false}

设置方式参考：
Config = Json.stringify({"Name":true,"Address":true})
API 3.0 Explorer 设置方式参考：
Config = {"Name":true,"Address":true}
     * @param ImageConfig 用于入参是营业执照图片的场景，表示需要校验的参数：RegNum（注册号或者统一社会信用代码），Name（企业名称），Address（经营地址）。选择后会返回相关参数校验结果。RegNum为必选，Name和Address可选。
格式为{RegNum: true, Name:true/false, Address:true/false}

设置方式参考：
Config = Json.stringify({"Name":true,"Address":true})
API 3.0 Explorer 设置方式参考：
Config = {"Name":true,"Address":true}
     */
    public void setImageConfig(String ImageConfig) {
        this.ImageConfig = ImageConfig;
    }

    /**
     * Get 用于入参是文本的场景，RegNum表示注册号或者统一社会信用代码。RegNum为必选项。 
     * @return RegNum 用于入参是文本的场景，RegNum表示注册号或者统一社会信用代码。RegNum为必选项。
     */
    public String getRegNum() {
        return this.RegNum;
    }

    /**
     * Set 用于入参是文本的场景，RegNum表示注册号或者统一社会信用代码。RegNum为必选项。
     * @param RegNum 用于入参是文本的场景，RegNum表示注册号或者统一社会信用代码。RegNum为必选项。
     */
    public void setRegNum(String RegNum) {
        this.RegNum = RegNum;
    }

    /**
     * Get 用于入参是文本的场景，Name表示企业名称。Name为可选项，填写后会返回Name的校验结果。 
     * @return Name 用于入参是文本的场景，Name表示企业名称。Name为可选项，填写后会返回Name的校验结果。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用于入参是文本的场景，Name表示企业名称。Name为可选项，填写后会返回Name的校验结果。
     * @param Name 用于入参是文本的场景，Name表示企业名称。Name为可选项，填写后会返回Name的校验结果。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用于入参是文本的场景，Address表示经营地址，填写后会返回Name的校验结果。 
     * @return Address 用于入参是文本的场景，Address表示经营地址，填写后会返回Name的校验结果。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 用于入参是文本的场景，Address表示经营地址，填写后会返回Name的校验结果。
     * @param Address 用于入参是文本的场景，Address表示经营地址，填写后会返回Name的校验结果。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 1表示输出注册资本字段（单位：万元），其他值表示不输出。默认不输出。 
     * @return RegCapital 1表示输出注册资本字段（单位：万元），其他值表示不输出。默认不输出。
     */
    public Long getRegCapital() {
        return this.RegCapital;
    }

    /**
     * Set 1表示输出注册资本字段（单位：万元），其他值表示不输出。默认不输出。
     * @param RegCapital 1表示输出注册资本字段（单位：万元），其他值表示不输出。默认不输出。
     */
    public void setRegCapital(Long RegCapital) {
        this.RegCapital = RegCapital;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageConfig", this.ImageConfig);
        this.setParamSimple(map, prefix + "RegNum", this.RegNum);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "RegCapital", this.RegCapital);

    }
}

