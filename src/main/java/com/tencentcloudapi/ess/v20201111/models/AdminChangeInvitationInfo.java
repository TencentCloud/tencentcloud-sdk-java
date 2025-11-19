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

public class AdminChangeInvitationInfo extends AbstractModel {

    /**
    * 要变更的企业Id。
使用接口进行变更，所支持的企业有两种。
1. 集团主企业替子企业进行超管变更。
    子企业的企业 Id 可在更多-组织管理-集团组织管理处获取。如图位置![image](https://qcloudimg.tencent-cloud.cn/raw/3d4469c13ca9e66a847560fc4309c58b.png)
2. 使用接口[创建企业认证链接](https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthUrl) 创建的企业，企业 Id 可以从回调[企业引导企业实名认证后回调](https://qian.tencent.com/developers/company/callback_types_staffs#%E5%8D%81%E4%B8%80-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%BC%81%E4%B8%9A%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83)得到。
    */
    @SerializedName("ChangeAdminOrganizationId")
    @Expose
    private String ChangeAdminOrganizationId;

    /**
    * 组织机构要变更的超管姓名。 
跟超管变更的操作人保持一致。

    */
    @SerializedName("NewAdminName")
    @Expose
    private String NewAdminName;

    /**
    * 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
    */
    @SerializedName("AuthFiles")
    @Expose
    private String [] AuthFiles;

    /**
    * 组织机构要变更的超管手机号。
跟超管变更的操作人保持一致。
超管变更的手机号和超管变更的证件号，必须要传递一个。
    */
    @SerializedName("NewAdminMobile")
    @Expose
    private String NewAdminMobile;

    /**
    * 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
- HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)

跟超管变更的操作人保持一致。

    */
    @SerializedName("NewAdminIdCardType")
    @Expose
    private String NewAdminIdCardType;

    /**
    * 组织机构新超管证件号。

跟超管变更的操作人保持一致。

超管变更的手机号和超管变更的证件号，必须要传递一个。
    */
    @SerializedName("NewAdminIdCardNumber")
    @Expose
    private String NewAdminIdCardNumber;

    /**
     * Get 要变更的企业Id。
使用接口进行变更，所支持的企业有两种。
1. 集团主企业替子企业进行超管变更。
    子企业的企业 Id 可在更多-组织管理-集团组织管理处获取。如图位置![image](https://qcloudimg.tencent-cloud.cn/raw/3d4469c13ca9e66a847560fc4309c58b.png)
2. 使用接口[创建企业认证链接](https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthUrl) 创建的企业，企业 Id 可以从回调[企业引导企业实名认证后回调](https://qian.tencent.com/developers/company/callback_types_staffs#%E5%8D%81%E4%B8%80-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%BC%81%E4%B8%9A%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83)得到。 
     * @return ChangeAdminOrganizationId 要变更的企业Id。
使用接口进行变更，所支持的企业有两种。
1. 集团主企业替子企业进行超管变更。
    子企业的企业 Id 可在更多-组织管理-集团组织管理处获取。如图位置![image](https://qcloudimg.tencent-cloud.cn/raw/3d4469c13ca9e66a847560fc4309c58b.png)
2. 使用接口[创建企业认证链接](https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthUrl) 创建的企业，企业 Id 可以从回调[企业引导企业实名认证后回调](https://qian.tencent.com/developers/company/callback_types_staffs#%E5%8D%81%E4%B8%80-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%BC%81%E4%B8%9A%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83)得到。
     */
    public String getChangeAdminOrganizationId() {
        return this.ChangeAdminOrganizationId;
    }

    /**
     * Set 要变更的企业Id。
使用接口进行变更，所支持的企业有两种。
1. 集团主企业替子企业进行超管变更。
    子企业的企业 Id 可在更多-组织管理-集团组织管理处获取。如图位置![image](https://qcloudimg.tencent-cloud.cn/raw/3d4469c13ca9e66a847560fc4309c58b.png)
2. 使用接口[创建企业认证链接](https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthUrl) 创建的企业，企业 Id 可以从回调[企业引导企业实名认证后回调](https://qian.tencent.com/developers/company/callback_types_staffs#%E5%8D%81%E4%B8%80-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%BC%81%E4%B8%9A%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83)得到。
     * @param ChangeAdminOrganizationId 要变更的企业Id。
使用接口进行变更，所支持的企业有两种。
1. 集团主企业替子企业进行超管变更。
    子企业的企业 Id 可在更多-组织管理-集团组织管理处获取。如图位置![image](https://qcloudimg.tencent-cloud.cn/raw/3d4469c13ca9e66a847560fc4309c58b.png)
2. 使用接口[创建企业认证链接](https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthUrl) 创建的企业，企业 Id 可以从回调[企业引导企业实名认证后回调](https://qian.tencent.com/developers/company/callback_types_staffs#%E5%8D%81%E4%B8%80-%E4%BC%81%E4%B8%9A%E5%BC%95%E5%AF%BC%E4%BC%81%E4%B8%9A%E5%AE%9E%E5%90%8D%E8%AE%A4%E8%AF%81%E5%90%8E%E5%9B%9E%E8%B0%83)得到。
     */
    public void setChangeAdminOrganizationId(String ChangeAdminOrganizationId) {
        this.ChangeAdminOrganizationId = ChangeAdminOrganizationId;
    }

    /**
     * Get 组织机构要变更的超管姓名。 
跟超管变更的操作人保持一致。
 
     * @return NewAdminName 组织机构要变更的超管姓名。 
跟超管变更的操作人保持一致。

     */
    public String getNewAdminName() {
        return this.NewAdminName;
    }

    /**
     * Set 组织机构要变更的超管姓名。 
跟超管变更的操作人保持一致。

     * @param NewAdminName 组织机构要变更的超管姓名。 
跟超管变更的操作人保持一致。

     */
    public void setNewAdminName(String NewAdminName) {
        this.NewAdminName = NewAdminName;
    }

    /**
     * Get 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。 
     * @return AuthFiles 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
     */
    public String [] getAuthFiles() {
        return this.AuthFiles;
    }

    /**
     * Set 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
     * @param AuthFiles 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
     */
    public void setAuthFiles(String [] AuthFiles) {
        this.AuthFiles = AuthFiles;
    }

    /**
     * Get 组织机构要变更的超管手机号。
跟超管变更的操作人保持一致。
超管变更的手机号和超管变更的证件号，必须要传递一个。 
     * @return NewAdminMobile 组织机构要变更的超管手机号。
跟超管变更的操作人保持一致。
超管变更的手机号和超管变更的证件号，必须要传递一个。
     */
    public String getNewAdminMobile() {
        return this.NewAdminMobile;
    }

    /**
     * Set 组织机构要变更的超管手机号。
跟超管变更的操作人保持一致。
超管变更的手机号和超管变更的证件号，必须要传递一个。
     * @param NewAdminMobile 组织机构要变更的超管手机号。
跟超管变更的操作人保持一致。
超管变更的手机号和超管变更的证件号，必须要传递一个。
     */
    public void setNewAdminMobile(String NewAdminMobile) {
        this.NewAdminMobile = NewAdminMobile;
    }

    /**
     * Get 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
- HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)

跟超管变更的操作人保持一致。
 
     * @return NewAdminIdCardType 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
- HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)

跟超管变更的操作人保持一致。

     */
    public String getNewAdminIdCardType() {
        return this.NewAdminIdCardType;
    }

    /**
     * Set 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
- HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)

跟超管变更的操作人保持一致。

     * @param NewAdminIdCardType 组织机构要变更的超管证件类型支持以下类型
- ID_CARD : 中国大陆居民身份证 (默认值)
- HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证
- HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)

跟超管变更的操作人保持一致。

     */
    public void setNewAdminIdCardType(String NewAdminIdCardType) {
        this.NewAdminIdCardType = NewAdminIdCardType;
    }

    /**
     * Get 组织机构新超管证件号。

跟超管变更的操作人保持一致。

超管变更的手机号和超管变更的证件号，必须要传递一个。 
     * @return NewAdminIdCardNumber 组织机构新超管证件号。

跟超管变更的操作人保持一致。

超管变更的手机号和超管变更的证件号，必须要传递一个。
     */
    public String getNewAdminIdCardNumber() {
        return this.NewAdminIdCardNumber;
    }

    /**
     * Set 组织机构新超管证件号。

跟超管变更的操作人保持一致。

超管变更的手机号和超管变更的证件号，必须要传递一个。
     * @param NewAdminIdCardNumber 组织机构新超管证件号。

跟超管变更的操作人保持一致。

超管变更的手机号和超管变更的证件号，必须要传递一个。
     */
    public void setNewAdminIdCardNumber(String NewAdminIdCardNumber) {
        this.NewAdminIdCardNumber = NewAdminIdCardNumber;
    }

    public AdminChangeInvitationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdminChangeInvitationInfo(AdminChangeInvitationInfo source) {
        if (source.ChangeAdminOrganizationId != null) {
            this.ChangeAdminOrganizationId = new String(source.ChangeAdminOrganizationId);
        }
        if (source.NewAdminName != null) {
            this.NewAdminName = new String(source.NewAdminName);
        }
        if (source.AuthFiles != null) {
            this.AuthFiles = new String[source.AuthFiles.length];
            for (int i = 0; i < source.AuthFiles.length; i++) {
                this.AuthFiles[i] = new String(source.AuthFiles[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChangeAdminOrganizationId", this.ChangeAdminOrganizationId);
        this.setParamSimple(map, prefix + "NewAdminName", this.NewAdminName);
        this.setParamArraySimple(map, prefix + "AuthFiles.", this.AuthFiles);
        this.setParamSimple(map, prefix + "NewAdminMobile", this.NewAdminMobile);
        this.setParamSimple(map, prefix + "NewAdminIdCardType", this.NewAdminIdCardType);
        this.setParamSimple(map, prefix + "NewAdminIdCardNumber", this.NewAdminIdCardNumber);

    }
}

