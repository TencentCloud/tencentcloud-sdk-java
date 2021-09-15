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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateH5FaceIdUrlRequest extends AbstractModel{

    /**
    * 调用方信息; 必选
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 慧眼业务ID; 不填写时后台使用Caller反查
    */
    @SerializedName("WbAppId")
    @Expose
    private String WbAppId;

    /**
    * 姓名; 可选(未通过实名认证的用户必选)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户证件类型; 可选; 默认ID_CARD:中国居民身份证
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 用户证件号; 可选(未通过实名认证的用户必选)
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * H5人脸核身完成后回调的第三方Url; 可选; 不需要做Encode, 跳转的参数: ?code=XX&orderNo=XX&liveRate=xx, code=0表示成功,orderNo为订单号,liveRate为百分制活体检测得分
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 参数值为"1":直接跳转到url回调地址; 可选; 其他值:跳转提供的结果页面
    */
    @SerializedName("JumpType")
    @Expose
    private String JumpType;

    /**
    * browser:表示在浏览器启动刷脸, app:表示在App里启动刷脸,默认值为browser; 可选
    */
    @SerializedName("OpenFrom")
    @Expose
    private String OpenFrom;

    /**
    * 跳转类型; 可选; 参数值为"1"时,刷脸页面使用replace方式跳转,不在浏览器history中留下记录;不传或其他值则正常跳转
    */
    @SerializedName("RedirectType")
    @Expose
    private String RedirectType;

    /**
     * Get 调用方信息; 必选 
     * @return Caller 调用方信息; 必选
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息; 必选
     * @param Caller 调用方信息; 必选
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 慧眼业务ID; 不填写时后台使用Caller反查 
     * @return WbAppId 慧眼业务ID; 不填写时后台使用Caller反查
     */
    public String getWbAppId() {
        return this.WbAppId;
    }

    /**
     * Set 慧眼业务ID; 不填写时后台使用Caller反查
     * @param WbAppId 慧眼业务ID; 不填写时后台使用Caller反查
     */
    public void setWbAppId(String WbAppId) {
        this.WbAppId = WbAppId;
    }

    /**
     * Get 姓名; 可选(未通过实名认证的用户必选) 
     * @return Name 姓名; 可选(未通过实名认证的用户必选)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名; 可选(未通过实名认证的用户必选)
     * @param Name 姓名; 可选(未通过实名认证的用户必选)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户证件类型; 可选; 默认ID_CARD:中国居民身份证 
     * @return IdCardType 用户证件类型; 可选; 默认ID_CARD:中国居民身份证
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 用户证件类型; 可选; 默认ID_CARD:中国居民身份证
     * @param IdCardType 用户证件类型; 可选; 默认ID_CARD:中国居民身份证
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 用户证件号; 可选(未通过实名认证的用户必选) 
     * @return IdCardNumber 用户证件号; 可选(未通过实名认证的用户必选)
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 用户证件号; 可选(未通过实名认证的用户必选)
     * @param IdCardNumber 用户证件号; 可选(未通过实名认证的用户必选)
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get H5人脸核身完成后回调的第三方Url; 可选; 不需要做Encode, 跳转的参数: ?code=XX&orderNo=XX&liveRate=xx, code=0表示成功,orderNo为订单号,liveRate为百分制活体检测得分 
     * @return JumpUrl H5人脸核身完成后回调的第三方Url; 可选; 不需要做Encode, 跳转的参数: ?code=XX&orderNo=XX&liveRate=xx, code=0表示成功,orderNo为订单号,liveRate为百分制活体检测得分
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set H5人脸核身完成后回调的第三方Url; 可选; 不需要做Encode, 跳转的参数: ?code=XX&orderNo=XX&liveRate=xx, code=0表示成功,orderNo为订单号,liveRate为百分制活体检测得分
     * @param JumpUrl H5人脸核身完成后回调的第三方Url; 可选; 不需要做Encode, 跳转的参数: ?code=XX&orderNo=XX&liveRate=xx, code=0表示成功,orderNo为订单号,liveRate为百分制活体检测得分
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 参数值为"1":直接跳转到url回调地址; 可选; 其他值:跳转提供的结果页面 
     * @return JumpType 参数值为"1":直接跳转到url回调地址; 可选; 其他值:跳转提供的结果页面
     */
    public String getJumpType() {
        return this.JumpType;
    }

    /**
     * Set 参数值为"1":直接跳转到url回调地址; 可选; 其他值:跳转提供的结果页面
     * @param JumpType 参数值为"1":直接跳转到url回调地址; 可选; 其他值:跳转提供的结果页面
     */
    public void setJumpType(String JumpType) {
        this.JumpType = JumpType;
    }

    /**
     * Get browser:表示在浏览器启动刷脸, app:表示在App里启动刷脸,默认值为browser; 可选 
     * @return OpenFrom browser:表示在浏览器启动刷脸, app:表示在App里启动刷脸,默认值为browser; 可选
     */
    public String getOpenFrom() {
        return this.OpenFrom;
    }

    /**
     * Set browser:表示在浏览器启动刷脸, app:表示在App里启动刷脸,默认值为browser; 可选
     * @param OpenFrom browser:表示在浏览器启动刷脸, app:表示在App里启动刷脸,默认值为browser; 可选
     */
    public void setOpenFrom(String OpenFrom) {
        this.OpenFrom = OpenFrom;
    }

    /**
     * Get 跳转类型; 可选; 参数值为"1"时,刷脸页面使用replace方式跳转,不在浏览器history中留下记录;不传或其他值则正常跳转 
     * @return RedirectType 跳转类型; 可选; 参数值为"1"时,刷脸页面使用replace方式跳转,不在浏览器history中留下记录;不传或其他值则正常跳转
     */
    public String getRedirectType() {
        return this.RedirectType;
    }

    /**
     * Set 跳转类型; 可选; 参数值为"1"时,刷脸页面使用replace方式跳转,不在浏览器history中留下记录;不传或其他值则正常跳转
     * @param RedirectType 跳转类型; 可选; 参数值为"1"时,刷脸页面使用replace方式跳转,不在浏览器history中留下记录;不传或其他值则正常跳转
     */
    public void setRedirectType(String RedirectType) {
        this.RedirectType = RedirectType;
    }

    public CreateH5FaceIdUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateH5FaceIdUrlRequest(CreateH5FaceIdUrlRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.WbAppId != null) {
            this.WbAppId = new String(source.WbAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.JumpType != null) {
            this.JumpType = new String(source.JumpType);
        }
        if (source.OpenFrom != null) {
            this.OpenFrom = new String(source.OpenFrom);
        }
        if (source.RedirectType != null) {
            this.RedirectType = new String(source.RedirectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "WbAppId", this.WbAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "JumpType", this.JumpType);
        this.setParamSimple(map, prefix + "OpenFrom", this.OpenFrom);
        this.setParamSimple(map, prefix + "RedirectType", this.RedirectType);

    }
}

