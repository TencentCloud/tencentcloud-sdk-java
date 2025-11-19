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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchAdminChangeInvitationsUrlRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。

    */
    @SerializedName("NewAdminName")
    @Expose
    private String NewAdminName;

    /**
    * 组织机构要变更的超管手机号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。

超管手机号 和超管证件号 二选一 必填。

注意：
1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。
    */
    @SerializedName("NewAdminMobile")
    @Expose
    private String NewAdminMobile;

    /**
    * 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
-  HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)
需要更当前操作人的证件类型保持一致。

    */
    @SerializedName("NewAdminIdCardType")
    @Expose
    private String NewAdminIdCardType;

    /**
    * 组织机构要变更的超管证件号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。

超管手机号和超管证件号 二选一必填。
    */
    @SerializedName("NewAdminIdCardNumber")
    @Expose
    private String NewAdminIdCardNumber;

    /**
    * 通知方式。
 NONE（默认）
 SMS  - 如果使用这个方式，则会给即将变更的超管发信息。
注意：
发送信息的手机号，是用户传递的手机号。
如果用户同时传递了证件号，手机号会用用户在电子签注册的手机号进行覆盖。
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式,  可以在页面展示适合此类型</li></ul>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。
 
     * @return NewAdminName 组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。

     */
    public String getNewAdminName() {
        return this.NewAdminName;
    }

    /**
     * Set 组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。

     * @param NewAdminName 组织机构要变更的超管姓名。 在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的姓名保持一致。

     */
    public void setNewAdminName(String NewAdminName) {
        this.NewAdminName = NewAdminName;
    }

    /**
     * Get 组织机构要变更的超管手机号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。

超管手机号 和超管证件号 二选一 必填。

注意：
1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。 
     * @return NewAdminMobile 组织机构要变更的超管手机号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。

超管手机号 和超管证件号 二选一 必填。

注意：
1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。
     */
    public String getNewAdminMobile() {
        return this.NewAdminMobile;
    }

    /**
     * Set 组织机构要变更的超管手机号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。

超管手机号 和超管证件号 二选一 必填。

注意：
1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。
     * @param NewAdminMobile 组织机构要变更的超管手机号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的手机号保持一致。

超管手机号 和超管证件号 二选一 必填。

注意：
1. 如果新超管的个人身份在电子签进行了手机号的变更，之前提交的超管变更任务将无法获取。
     */
    public void setNewAdminMobile(String NewAdminMobile) {
        this.NewAdminMobile = NewAdminMobile;
    }

    /**
     * Get 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
-  HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)
需要更当前操作人的证件类型保持一致。
 
     * @return NewAdminIdCardType 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
-  HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)
需要更当前操作人的证件类型保持一致。

     */
    public String getNewAdminIdCardType() {
        return this.NewAdminIdCardType;
    }

    /**
     * Set 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
-  HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)
需要更当前操作人的证件类型保持一致。

     * @param NewAdminIdCardType 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
-  HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)
需要更当前操作人的证件类型保持一致。

     */
    public void setNewAdminIdCardType(String NewAdminIdCardType) {
        this.NewAdminIdCardType = NewAdminIdCardType;
    }

    /**
     * Get 组织机构要变更的超管证件号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。

超管手机号和超管证件号 二选一必填。 
     * @return NewAdminIdCardNumber 组织机构要变更的超管证件号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。

超管手机号和超管证件号 二选一必填。
     */
    public String getNewAdminIdCardNumber() {
        return this.NewAdminIdCardNumber;
    }

    /**
     * Set 组织机构要变更的超管证件号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。

超管手机号和超管证件号 二选一必填。
     * @param NewAdminIdCardNumber 组织机构要变更的超管证件号。 
在超管变更流程中，必须是超管本人进行操作，需要更当前操作人的证件号保持一致。

超管手机号和超管证件号 二选一必填。
     */
    public void setNewAdminIdCardNumber(String NewAdminIdCardNumber) {
        this.NewAdminIdCardNumber = NewAdminIdCardNumber;
    }

    /**
     * Get 通知方式。
 NONE（默认）
 SMS  - 如果使用这个方式，则会给即将变更的超管发信息。
注意：
发送信息的手机号，是用户传递的手机号。
如果用户同时传递了证件号，手机号会用用户在电子签注册的手机号进行覆盖。 
     * @return NotifyType 通知方式。
 NONE（默认）
 SMS  - 如果使用这个方式，则会给即将变更的超管发信息。
注意：
发送信息的手机号，是用户传递的手机号。
如果用户同时传递了证件号，手机号会用用户在电子签注册的手机号进行覆盖。
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知方式。
 NONE（默认）
 SMS  - 如果使用这个方式，则会给即将变更的超管发信息。
注意：
发送信息的手机号，是用户传递的手机号。
如果用户同时传递了证件号，手机号会用用户在电子签注册的手机号进行覆盖。
     * @param NotifyType 通知方式。
 NONE（默认）
 SMS  - 如果使用这个方式，则会给即将变更的超管发信息。
注意：
发送信息的手机号，是用户传递的手机号。
如果用户同时传递了证件号，手机号会用用户在电子签注册的手机号进行覆盖。
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式,  可以在页面展示适合此类型</li></ul> 
     * @return Endpoint 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式,  可以在页面展示适合此类型</li></ul>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式,  可以在页面展示适合此类型</li></ul>
     * @param Endpoint 要跳转的链接类型<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li><li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li><li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li><li>**QR_CODE**： 跳转电子签小程序的http_url的二维码形式,  可以在页面展示适合此类型</li></ul>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public CreateBatchAdminChangeInvitationsUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchAdminChangeInvitationsUrlRequest(CreateBatchAdminChangeInvitationsUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.NewAdminName != null) {
            this.NewAdminName = new String(source.NewAdminName);
        }
        if (source.NewAdminMobile != null) {
            this.NewAdminMobile = new String(source.NewAdminMobile);
        }
        if (source.NewAdminIdCardType != null) {
            this.NewAdminIdCardType = new String(source.NewAdminIdCardType);
        }
        if (source.NewAdminIdCardNumber != null) {
            this.NewAdminIdCardNumber = new String(source.NewAdminIdCardNumber);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "NewAdminName", this.NewAdminName);
        this.setParamSimple(map, prefix + "NewAdminMobile", this.NewAdminMobile);
        this.setParamSimple(map, prefix + "NewAdminIdCardType", this.NewAdminIdCardType);
        this.setParamSimple(map, prefix + "NewAdminIdCardNumber", this.NewAdminIdCardNumber);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

