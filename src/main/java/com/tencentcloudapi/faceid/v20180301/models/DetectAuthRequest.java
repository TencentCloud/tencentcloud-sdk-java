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

public class DetectAuthRequest  extends AbstractModel{

    /**
    * 规则Id。a-zA-Z0-9组合。最长长度32位。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 终端类型。可选值有：weixinh5, weixinh5native, h5, tinyappsdk, iossdk, androidsdk。只有值为"weixinh5"时会返回跳转URL。
    */
    @SerializedName("TerminalType")
    @Expose
    private String TerminalType;

    /**
    * 身份证号或者是客户系统内部的唯一用户id。（传uid的时候只能使用ImageBase64传的照片进行一比一）a-zA-Z0-9组合。最长长度32位。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。最长长度32位。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 回调地址。最长长度1024位。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 额外参数，会在getDetectInfo时带回去。最长长度1024位。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 用于一比一时的照片base64。此时必须传入IdCard。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * 获取规则Id。a-zA-Z0-9组合。最长长度32位。
     * @return RuleId 规则Id。a-zA-Z0-9组合。最长长度32位。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则Id。a-zA-Z0-9组合。最长长度32位。
     * @param RuleId 规则Id。a-zA-Z0-9组合。最长长度32位。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取终端类型。可选值有：weixinh5, weixinh5native, h5, tinyappsdk, iossdk, androidsdk。只有值为"weixinh5"时会返回跳转URL。
     * @return TerminalType 终端类型。可选值有：weixinh5, weixinh5native, h5, tinyappsdk, iossdk, androidsdk。只有值为"weixinh5"时会返回跳转URL。
     */
    public String getTerminalType() {
        return this.TerminalType;
    }

    /**
     * 设置终端类型。可选值有：weixinh5, weixinh5native, h5, tinyappsdk, iossdk, androidsdk。只有值为"weixinh5"时会返回跳转URL。
     * @param TerminalType 终端类型。可选值有：weixinh5, weixinh5native, h5, tinyappsdk, iossdk, androidsdk。只有值为"weixinh5"时会返回跳转URL。
     */
    public void setTerminalType(String TerminalType) {
        this.TerminalType = TerminalType;
    }

    /**
     * 获取身份证号或者是客户系统内部的唯一用户id。（传uid的时候只能使用ImageBase64传的照片进行一比一）a-zA-Z0-9组合。最长长度32位。
     * @return IdCard 身份证号或者是客户系统内部的唯一用户id。（传uid的时候只能使用ImageBase64传的照片进行一比一）a-zA-Z0-9组合。最长长度32位。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * 设置身份证号或者是客户系统内部的唯一用户id。（传uid的时候只能使用ImageBase64传的照片进行一比一）a-zA-Z0-9组合。最长长度32位。
     * @param IdCard 身份证号或者是客户系统内部的唯一用户id。（传uid的时候只能使用ImageBase64传的照片进行一比一）a-zA-Z0-9组合。最长长度32位。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * 获取姓名。最长长度32位。
     * @return Name 姓名。最长长度32位。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置姓名。最长长度32位。
     * @param Name 姓名。最长长度32位。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取回调地址。最长长度1024位。
     * @return RedirectUrl 回调地址。最长长度1024位。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * 设置回调地址。最长长度1024位。
     * @param RedirectUrl 回调地址。最长长度1024位。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * 获取额外参数，会在getDetectInfo时带回去。最长长度1024位。
     * @return Extra 额外参数，会在getDetectInfo时带回去。最长长度1024位。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * 设置额外参数，会在getDetectInfo时带回去。最长长度1024位。
     * @param Extra 额外参数，会在getDetectInfo时带回去。最长长度1024位。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * 获取用于一比一时的照片base64。此时必须传入IdCard。
     * @return ImageBase64 用于一比一时的照片base64。此时必须传入IdCard。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * 设置用于一比一时的照片base64。此时必须传入IdCard。
     * @param ImageBase64 用于一比一时的照片base64。此时必须传入IdCard。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * 内部实现，用户禁止调用
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

