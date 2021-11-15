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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAnchorRequest extends AbstractModel{

    /**
    * 主播业务ID，唯一
    */
    @SerializedName("AnchorUid")
    @Expose
    private String AnchorUid;

    /**
    * 主播姓名
    */
    @SerializedName("AnchorName")
    @Expose
    private String AnchorName;

    /**
    * 主播电话
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
    */
    @SerializedName("AnchorPhone")
    @Expose
    private String AnchorPhone;

    /**
    * 主播邮箱
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
    */
    @SerializedName("AnchorEmail")
    @Expose
    private String AnchorEmail;

    /**
    * 主播地址
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
    */
    @SerializedName("AnchorAddress")
    @Expose
    private String AnchorAddress;

    /**
    * 主播身份证号
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
    */
    @SerializedName("AnchorIdNo")
    @Expose
    private String AnchorIdNo;

    /**
    * 主播类型
__KMusic__:全民K歌
__QMusic__:QQ音乐
__WeChat__:微信视频号
    */
    @SerializedName("AnchorType")
    @Expose
    private String AnchorType;

    /**
    * 主播扩展信息
    */
    @SerializedName("AnchorExtendInfo")
    @Expose
    private AnchorExtendInfo [] AnchorExtendInfo;

    /**
     * Get 主播业务ID，唯一 
     * @return AnchorUid 主播业务ID，唯一
     */
    public String getAnchorUid() {
        return this.AnchorUid;
    }

    /**
     * Set 主播业务ID，唯一
     * @param AnchorUid 主播业务ID，唯一
     */
    public void setAnchorUid(String AnchorUid) {
        this.AnchorUid = AnchorUid;
    }

    /**
     * Get 主播姓名 
     * @return AnchorName 主播姓名
     */
    public String getAnchorName() {
        return this.AnchorName;
    }

    /**
     * Set 主播姓名
     * @param AnchorName 主播姓名
     */
    public void setAnchorName(String AnchorName) {
        this.AnchorName = AnchorName;
    }

    /**
     * Get 主播电话
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密 
     * @return AnchorPhone 主播电话
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     */
    public String getAnchorPhone() {
        return this.AnchorPhone;
    }

    /**
     * Set 主播电话
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     * @param AnchorPhone 主播电话
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     */
    public void setAnchorPhone(String AnchorPhone) {
        this.AnchorPhone = AnchorPhone;
    }

    /**
     * Get 主播邮箱
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密 
     * @return AnchorEmail 主播邮箱
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     */
    public String getAnchorEmail() {
        return this.AnchorEmail;
    }

    /**
     * Set 主播邮箱
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     * @param AnchorEmail 主播邮箱
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     */
    public void setAnchorEmail(String AnchorEmail) {
        this.AnchorEmail = AnchorEmail;
    }

    /**
     * Get 主播地址
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密 
     * @return AnchorAddress 主播地址
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     */
    public String getAnchorAddress() {
        return this.AnchorAddress;
    }

    /**
     * Set 主播地址
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     * @param AnchorAddress 主播地址
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     */
    public void setAnchorAddress(String AnchorAddress) {
        this.AnchorAddress = AnchorAddress;
    }

    /**
     * Get 主播身份证号
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密 
     * @return AnchorIdNo 主播身份证号
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     */
    public String getAnchorIdNo() {
        return this.AnchorIdNo;
    }

    /**
     * Set 主播身份证号
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     * @param AnchorIdNo 主播身份证号
_敏感信息_ 使用 __AES128-CBC-PKCS#7__ 加密
     */
    public void setAnchorIdNo(String AnchorIdNo) {
        this.AnchorIdNo = AnchorIdNo;
    }

    /**
     * Get 主播类型
__KMusic__:全民K歌
__QMusic__:QQ音乐
__WeChat__:微信视频号 
     * @return AnchorType 主播类型
__KMusic__:全民K歌
__QMusic__:QQ音乐
__WeChat__:微信视频号
     */
    public String getAnchorType() {
        return this.AnchorType;
    }

    /**
     * Set 主播类型
__KMusic__:全民K歌
__QMusic__:QQ音乐
__WeChat__:微信视频号
     * @param AnchorType 主播类型
__KMusic__:全民K歌
__QMusic__:QQ音乐
__WeChat__:微信视频号
     */
    public void setAnchorType(String AnchorType) {
        this.AnchorType = AnchorType;
    }

    /**
     * Get 主播扩展信息 
     * @return AnchorExtendInfo 主播扩展信息
     */
    public AnchorExtendInfo [] getAnchorExtendInfo() {
        return this.AnchorExtendInfo;
    }

    /**
     * Set 主播扩展信息
     * @param AnchorExtendInfo 主播扩展信息
     */
    public void setAnchorExtendInfo(AnchorExtendInfo [] AnchorExtendInfo) {
        this.AnchorExtendInfo = AnchorExtendInfo;
    }

    public CreateAnchorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAnchorRequest(CreateAnchorRequest source) {
        if (source.AnchorUid != null) {
            this.AnchorUid = new String(source.AnchorUid);
        }
        if (source.AnchorName != null) {
            this.AnchorName = new String(source.AnchorName);
        }
        if (source.AnchorPhone != null) {
            this.AnchorPhone = new String(source.AnchorPhone);
        }
        if (source.AnchorEmail != null) {
            this.AnchorEmail = new String(source.AnchorEmail);
        }
        if (source.AnchorAddress != null) {
            this.AnchorAddress = new String(source.AnchorAddress);
        }
        if (source.AnchorIdNo != null) {
            this.AnchorIdNo = new String(source.AnchorIdNo);
        }
        if (source.AnchorType != null) {
            this.AnchorType = new String(source.AnchorType);
        }
        if (source.AnchorExtendInfo != null) {
            this.AnchorExtendInfo = new AnchorExtendInfo[source.AnchorExtendInfo.length];
            for (int i = 0; i < source.AnchorExtendInfo.length; i++) {
                this.AnchorExtendInfo[i] = new AnchorExtendInfo(source.AnchorExtendInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnchorUid", this.AnchorUid);
        this.setParamSimple(map, prefix + "AnchorName", this.AnchorName);
        this.setParamSimple(map, prefix + "AnchorPhone", this.AnchorPhone);
        this.setParamSimple(map, prefix + "AnchorEmail", this.AnchorEmail);
        this.setParamSimple(map, prefix + "AnchorAddress", this.AnchorAddress);
        this.setParamSimple(map, prefix + "AnchorIdNo", this.AnchorIdNo);
        this.setParamSimple(map, prefix + "AnchorType", this.AnchorType);
        this.setParamArrayObj(map, prefix + "AnchorExtendInfo.", this.AnchorExtendInfo);

    }
}

