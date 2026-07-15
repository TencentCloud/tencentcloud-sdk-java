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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdminChangeInvitationInfo extends AbstractModel {

    /**
    * <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。</p><p>注意：<br>此参数和 ChangeAdminOrganizationOpenId二选一，如果都传递了，但是不一致会进行报错拦截。</p>
    */
    @SerializedName("ChangeAdminOrganizationId")
    @Expose
    private String ChangeAdminOrganizationId;

    /**
    * <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。<br>注意： 此参数和 ChangeAdminOrganizationId二选一，如果都传递了，不一致会进行报错拦截。</p>
    */
    @SerializedName("ChangeAdminOrganizationOpenId")
    @Expose
    private String ChangeAdminOrganizationOpenId;

    /**
    * <p>组织机构要变更的超管OpenId。</p>
    */
    @SerializedName("NewAdminOpenId")
    @Expose
    private String NewAdminOpenId;

    /**
    * <p>组织机构要变更的超管姓名。</p>
    */
    @SerializedName("NewAdminName")
    @Expose
    private String NewAdminName;

    /**
    * <p>组织机构要变更的超管手机号。 跟超管变更的操作人保持一致。</p>
    */
    @SerializedName("NewAdminMobile")
    @Expose
    private String NewAdminMobile;

    /**
    * <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>跟超管变更的操作人保持一致。</p><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
    */
    @SerializedName("NewAdminIdCardType")
    @Expose
    private String NewAdminIdCardType;

    /**
    * <p>组织机构新超管证件号。 跟超管变更的操作人保持一致。</p>
    */
    @SerializedName("NewAdminIdCardNumber")
    @Expose
    private String NewAdminIdCardNumber;

    /**
    * <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。</p><p> p.s. 如果上传授权书 ，需遵循以下条件 1. 超管的信息（超管姓名，超管手机号）必须为必填参数。</p>
    */
    @SerializedName("AuthFiles")
    @Expose
    private String [] AuthFiles;

    /**
     * Get <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。</p><p>注意：<br>此参数和 ChangeAdminOrganizationOpenId二选一，如果都传递了，但是不一致会进行报错拦截。</p> 
     * @return ChangeAdminOrganizationId <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。</p><p>注意：<br>此参数和 ChangeAdminOrganizationOpenId二选一，如果都传递了，但是不一致会进行报错拦截。</p>
     */
    public String getChangeAdminOrganizationId() {
        return this.ChangeAdminOrganizationId;
    }

    /**
     * Set <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。</p><p>注意：<br>此参数和 ChangeAdminOrganizationOpenId二选一，如果都传递了，但是不一致会进行报错拦截。</p>
     * @param ChangeAdminOrganizationId <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。</p><p>注意：<br>此参数和 ChangeAdminOrganizationOpenId二选一，如果都传递了，但是不一致会进行报错拦截。</p>
     */
    public void setChangeAdminOrganizationId(String ChangeAdminOrganizationId) {
        this.ChangeAdminOrganizationId = ChangeAdminOrganizationId;
    }

    /**
     * Get <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。<br>注意： 此参数和 ChangeAdminOrganizationId二选一，如果都传递了，不一致会进行报错拦截。</p> 
     * @return ChangeAdminOrganizationOpenId <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。<br>注意： 此参数和 ChangeAdminOrganizationId二选一，如果都传递了，不一致会进行报错拦截。</p>
     */
    public String getChangeAdminOrganizationOpenId() {
        return this.ChangeAdminOrganizationOpenId;
    }

    /**
     * Set <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。<br>注意： 此参数和 ChangeAdminOrganizationId二选一，如果都传递了，不一致会进行报错拦截。</p>
     * @param ChangeAdminOrganizationOpenId <p>要变更的企业Id。 使用接口进行变更，所支持的企业有两种。<br>注意： 此参数和 ChangeAdminOrganizationId二选一，如果都传递了，不一致会进行报错拦截。</p>
     */
    public void setChangeAdminOrganizationOpenId(String ChangeAdminOrganizationOpenId) {
        this.ChangeAdminOrganizationOpenId = ChangeAdminOrganizationOpenId;
    }

    /**
     * Get <p>组织机构要变更的超管OpenId。</p> 
     * @return NewAdminOpenId <p>组织机构要变更的超管OpenId。</p>
     */
    public String getNewAdminOpenId() {
        return this.NewAdminOpenId;
    }

    /**
     * Set <p>组织机构要变更的超管OpenId。</p>
     * @param NewAdminOpenId <p>组织机构要变更的超管OpenId。</p>
     */
    public void setNewAdminOpenId(String NewAdminOpenId) {
        this.NewAdminOpenId = NewAdminOpenId;
    }

    /**
     * Get <p>组织机构要变更的超管姓名。</p> 
     * @return NewAdminName <p>组织机构要变更的超管姓名。</p>
     */
    public String getNewAdminName() {
        return this.NewAdminName;
    }

    /**
     * Set <p>组织机构要变更的超管姓名。</p>
     * @param NewAdminName <p>组织机构要变更的超管姓名。</p>
     */
    public void setNewAdminName(String NewAdminName) {
        this.NewAdminName = NewAdminName;
    }

    /**
     * Get <p>组织机构要变更的超管手机号。 跟超管变更的操作人保持一致。</p> 
     * @return NewAdminMobile <p>组织机构要变更的超管手机号。 跟超管变更的操作人保持一致。</p>
     */
    public String getNewAdminMobile() {
        return this.NewAdminMobile;
    }

    /**
     * Set <p>组织机构要变更的超管手机号。 跟超管变更的操作人保持一致。</p>
     * @param NewAdminMobile <p>组织机构要变更的超管手机号。 跟超管变更的操作人保持一致。</p>
     */
    public void setNewAdminMobile(String NewAdminMobile) {
        this.NewAdminMobile = NewAdminMobile;
    }

    /**
     * Get <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>跟超管变更的操作人保持一致。</p><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul> 
     * @return NewAdminIdCardType <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>跟超管变更的操作人保持一致。</p><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public String getNewAdminIdCardType() {
        return this.NewAdminIdCardType;
    }

    /**
     * Set <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>跟超管变更的操作人保持一致。</p><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     * @param NewAdminIdCardType <p>组织机构要变更的超管证件类型支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>跟超管变更的操作人保持一致。</p><p>枚举值：</p><ul><li>ID_CARD： 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO： 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN： 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public void setNewAdminIdCardType(String NewAdminIdCardType) {
        this.NewAdminIdCardType = NewAdminIdCardType;
    }

    /**
     * Get <p>组织机构新超管证件号。 跟超管变更的操作人保持一致。</p> 
     * @return NewAdminIdCardNumber <p>组织机构新超管证件号。 跟超管变更的操作人保持一致。</p>
     */
    public String getNewAdminIdCardNumber() {
        return this.NewAdminIdCardNumber;
    }

    /**
     * Set <p>组织机构新超管证件号。 跟超管变更的操作人保持一致。</p>
     * @param NewAdminIdCardNumber <p>组织机构新超管证件号。 跟超管变更的操作人保持一致。</p>
     */
    public void setNewAdminIdCardNumber(String NewAdminIdCardNumber) {
        this.NewAdminIdCardNumber = NewAdminIdCardNumber;
    }

    /**
     * Get <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。</p><p> p.s. 如果上传授权书 ，需遵循以下条件 1. 超管的信息（超管姓名，超管手机号）必须为必填参数。</p> 
     * @return AuthFiles <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。</p><p> p.s. 如果上传授权书 ，需遵循以下条件 1. 超管的信息（超管姓名，超管手机号）必须为必填参数。</p>
     */
    public String [] getAuthFiles() {
        return this.AuthFiles;
    }

    /**
     * Set <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。</p><p> p.s. 如果上传授权书 ，需遵循以下条件 1. 超管的信息（超管姓名，超管手机号）必须为必填参数。</p>
     * @param AuthFiles <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。</p><p> p.s. 如果上传授权书 ，需遵循以下条件 1. 超管的信息（超管姓名，超管手机号）必须为必填参数。</p>
     */
    public void setAuthFiles(String [] AuthFiles) {
        this.AuthFiles = AuthFiles;
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
        if (source.ChangeAdminOrganizationOpenId != null) {
            this.ChangeAdminOrganizationOpenId = new String(source.ChangeAdminOrganizationOpenId);
        }
        if (source.NewAdminOpenId != null) {
            this.NewAdminOpenId = new String(source.NewAdminOpenId);
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
        if (source.AuthFiles != null) {
            this.AuthFiles = new String[source.AuthFiles.length];
            for (int i = 0; i < source.AuthFiles.length; i++) {
                this.AuthFiles[i] = new String(source.AuthFiles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChangeAdminOrganizationId", this.ChangeAdminOrganizationId);
        this.setParamSimple(map, prefix + "ChangeAdminOrganizationOpenId", this.ChangeAdminOrganizationOpenId);
        this.setParamSimple(map, prefix + "NewAdminOpenId", this.NewAdminOpenId);
        this.setParamSimple(map, prefix + "NewAdminName", this.NewAdminName);
        this.setParamSimple(map, prefix + "NewAdminMobile", this.NewAdminMobile);
        this.setParamSimple(map, prefix + "NewAdminIdCardType", this.NewAdminIdCardType);
        this.setParamSimple(map, prefix + "NewAdminIdCardNumber", this.NewAdminIdCardNumber);
        this.setParamArraySimple(map, prefix + "AuthFiles.", this.AuthFiles);

    }
}

