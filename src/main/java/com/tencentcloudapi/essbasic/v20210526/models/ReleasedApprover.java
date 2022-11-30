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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleasedApprover extends AbstractModel{

    /**
    * 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 签署人在原流程中的签署人列表中的顺序序号（从0开始，按顺序依次递增），如果不清楚原流程中的签署人列表，可以通过DescribeFlows接口查看
    */
    @SerializedName("ApproverNumber")
    @Expose
    private Long ApproverNumber;

    /**
    * 签署人类型，目前仅支持
ORGANIZATION-企业
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 签署人姓名，最大长度50个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 签署人证件号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 用户侧第三方id，最大长度64个字符
当签署方为同一渠道下的员工时，该字必传
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符 
     * @return OrganizationName 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符
     * @param OrganizationName 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 签署人在原流程中的签署人列表中的顺序序号（从0开始，按顺序依次递增），如果不清楚原流程中的签署人列表，可以通过DescribeFlows接口查看 
     * @return ApproverNumber 签署人在原流程中的签署人列表中的顺序序号（从0开始，按顺序依次递增），如果不清楚原流程中的签署人列表，可以通过DescribeFlows接口查看
     */
    public Long getApproverNumber() {
        return this.ApproverNumber;
    }

    /**
     * Set 签署人在原流程中的签署人列表中的顺序序号（从0开始，按顺序依次递增），如果不清楚原流程中的签署人列表，可以通过DescribeFlows接口查看
     * @param ApproverNumber 签署人在原流程中的签署人列表中的顺序序号（从0开始，按顺序依次递增），如果不清楚原流程中的签署人列表，可以通过DescribeFlows接口查看
     */
    public void setApproverNumber(Long ApproverNumber) {
        this.ApproverNumber = ApproverNumber;
    }

    /**
     * Get 签署人类型，目前仅支持
ORGANIZATION-企业 
     * @return ApproverType 签署人类型，目前仅支持
ORGANIZATION-企业
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 签署人类型，目前仅支持
ORGANIZATION-企业
     * @param ApproverType 签署人类型，目前仅支持
ORGANIZATION-企业
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 签署人姓名，最大长度50个字符 
     * @return Name 签署人姓名，最大长度50个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署人姓名，最大长度50个字符
     * @param Name 签署人姓名，最大长度50个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证 
     * @return IdCardType 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证
     * @param IdCardType 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 签署人证件号 
     * @return IdCardNumber 签署人证件号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 签署人证件号
     * @param IdCardNumber 签署人证件号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号 
     * @return Mobile 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号
     * @param Mobile 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符 
     * @return OrganizationOpenId 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符
     * @param OrganizationOpenId 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 用户侧第三方id，最大长度64个字符
当签署方为同一渠道下的员工时，该字必传 
     * @return OpenId 用户侧第三方id，最大长度64个字符
当签署方为同一渠道下的员工时，该字必传
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户侧第三方id，最大长度64个字符
当签署方为同一渠道下的员工时，该字必传
     * @param OpenId 用户侧第三方id，最大长度64个字符
当签署方为同一渠道下的员工时，该字必传
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    public ReleasedApprover() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleasedApprover(ReleasedApprover source) {
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.ApproverNumber != null) {
            this.ApproverNumber = new Long(source.ApproverNumber);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
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
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "ApproverNumber", this.ApproverNumber);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

