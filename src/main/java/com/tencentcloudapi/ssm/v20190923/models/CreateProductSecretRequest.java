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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProductSecretRequest extends AbstractModel {

    /**
    * <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>用户账号名前缀，由用户自行指定，长度限定在8个字符以内，<br>可选字符集包括：<br>数字字符：[0, 9]，<br>小写字符：[a, z]，<br>大写字符：[A, Z]，<br>特殊字符(全英文符号)：下划线(_)，<br>前缀必须以大写或小写字母开头。</p>
    */
    @SerializedName("UserNamePrefix")
    @Expose
    private String UserNamePrefix;

    /**
    * <p>凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>云产品实例ID。</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>账号的域名，IP形式，支持填入%。</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>将凭据与云产品实例绑定时，需要授予的权限列表。</p>
    */
    @SerializedName("PrivilegesList")
    @Expose
    private ProductPrivilegeUnit [] PrivilegesList;

    /**
    * <p>描述信息，用于详细描述用途等，最大支持2048字节。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>指定对凭据进行加密的KMS CMK。<br>如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。<br>您也可以指定在同region 下自行创建的KMS CMK进行加密。</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。<br>当EnableRotation为True时，此参数必填。</p>
    */
    @SerializedName("RotationBeginTime")
    @Expose
    private String RotationBeginTime;

    /**
    * <p>是否开启轮转<br>True -- 开启<br>False -- 不开启<br>如果不指定，默认为False。</p>
    */
    @SerializedName("EnableRotation")
    @Expose
    private Boolean EnableRotation;

    /**
    * <p>轮转周期，以天为单位，默认为1天。</p>
    */
    @SerializedName("RotationFrequency")
    @Expose
    private Long RotationFrequency;

    /**
    * <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p>
    */
    @SerializedName("KmsHsmClusterId")
    @Expose
    private String KmsHsmClusterId;

    /**
    * <p>账户备注</p>
    */
    @SerializedName("AccountRemark")
    @Expose
    private String AccountRemark;

    /**
    * <p>数据库账号类型，目前仅在创建sqlserver凭据场景会使用到，仅支持L3</p><p>枚举值：</p><ul><li>L3： 普通权限账号</li></ul>
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
     * Get <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。</p> 
     * @return SecretName <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。</p>
     * @param SecretName <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>用户账号名前缀，由用户自行指定，长度限定在8个字符以内，<br>可选字符集包括：<br>数字字符：[0, 9]，<br>小写字符：[a, z]，<br>大写字符：[A, Z]，<br>特殊字符(全英文符号)：下划线(_)，<br>前缀必须以大写或小写字母开头。</p> 
     * @return UserNamePrefix <p>用户账号名前缀，由用户自行指定，长度限定在8个字符以内，<br>可选字符集包括：<br>数字字符：[0, 9]，<br>小写字符：[a, z]，<br>大写字符：[A, Z]，<br>特殊字符(全英文符号)：下划线(_)，<br>前缀必须以大写或小写字母开头。</p>
     */
    public String getUserNamePrefix() {
        return this.UserNamePrefix;
    }

    /**
     * Set <p>用户账号名前缀，由用户自行指定，长度限定在8个字符以内，<br>可选字符集包括：<br>数字字符：[0, 9]，<br>小写字符：[a, z]，<br>大写字符：[A, Z]，<br>特殊字符(全英文符号)：下划线(_)，<br>前缀必须以大写或小写字母开头。</p>
     * @param UserNamePrefix <p>用户账号名前缀，由用户自行指定，长度限定在8个字符以内，<br>可选字符集包括：<br>数字字符：[0, 9]，<br>小写字符：[a, z]，<br>大写字符：[A, Z]，<br>特殊字符(全英文符号)：下划线(_)，<br>前缀必须以大写或小写字母开头。</p>
     */
    public void setUserNamePrefix(String UserNamePrefix) {
        this.UserNamePrefix = UserNamePrefix;
    }

    /**
     * Get <p>凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。</p> 
     * @return ProductName <p>凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。</p>
     * @param ProductName <p>凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>云产品实例ID。</p> 
     * @return InstanceID <p>云产品实例ID。</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>云产品实例ID。</p>
     * @param InstanceID <p>云产品实例ID。</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>账号的域名，IP形式，支持填入%。</p> 
     * @return Domains <p>账号的域名，IP形式，支持填入%。</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>账号的域名，IP形式，支持填入%。</p>
     * @param Domains <p>账号的域名，IP形式，支持填入%。</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>将凭据与云产品实例绑定时，需要授予的权限列表。</p> 
     * @return PrivilegesList <p>将凭据与云产品实例绑定时，需要授予的权限列表。</p>
     */
    public ProductPrivilegeUnit [] getPrivilegesList() {
        return this.PrivilegesList;
    }

    /**
     * Set <p>将凭据与云产品实例绑定时，需要授予的权限列表。</p>
     * @param PrivilegesList <p>将凭据与云产品实例绑定时，需要授予的权限列表。</p>
     */
    public void setPrivilegesList(ProductPrivilegeUnit [] PrivilegesList) {
        this.PrivilegesList = PrivilegesList;
    }

    /**
     * Get <p>描述信息，用于详细描述用途等，最大支持2048字节。</p> 
     * @return Description <p>描述信息，用于详细描述用途等，最大支持2048字节。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息，用于详细描述用途等，最大支持2048字节。</p>
     * @param Description <p>描述信息，用于详细描述用途等，最大支持2048字节。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>指定对凭据进行加密的KMS CMK。<br>如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。<br>您也可以指定在同region 下自行创建的KMS CMK进行加密。</p> 
     * @return KmsKeyId <p>指定对凭据进行加密的KMS CMK。<br>如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。<br>您也可以指定在同region 下自行创建的KMS CMK进行加密。</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>指定对凭据进行加密的KMS CMK。<br>如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。<br>您也可以指定在同region 下自行创建的KMS CMK进行加密。</p>
     * @param KmsKeyId <p>指定对凭据进行加密的KMS CMK。<br>如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。<br>您也可以指定在同region 下自行创建的KMS CMK进行加密。</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>标签列表。</p> 
     * @return Tags <p>标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表。</p>
     * @param Tags <p>标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。<br>当EnableRotation为True时，此参数必填。</p> 
     * @return RotationBeginTime <p>用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。<br>当EnableRotation为True时，此参数必填。</p>
     */
    public String getRotationBeginTime() {
        return this.RotationBeginTime;
    }

    /**
     * Set <p>用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。<br>当EnableRotation为True时，此参数必填。</p>
     * @param RotationBeginTime <p>用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。<br>当EnableRotation为True时，此参数必填。</p>
     */
    public void setRotationBeginTime(String RotationBeginTime) {
        this.RotationBeginTime = RotationBeginTime;
    }

    /**
     * Get <p>是否开启轮转<br>True -- 开启<br>False -- 不开启<br>如果不指定，默认为False。</p> 
     * @return EnableRotation <p>是否开启轮转<br>True -- 开启<br>False -- 不开启<br>如果不指定，默认为False。</p>
     */
    public Boolean getEnableRotation() {
        return this.EnableRotation;
    }

    /**
     * Set <p>是否开启轮转<br>True -- 开启<br>False -- 不开启<br>如果不指定，默认为False。</p>
     * @param EnableRotation <p>是否开启轮转<br>True -- 开启<br>False -- 不开启<br>如果不指定，默认为False。</p>
     */
    public void setEnableRotation(Boolean EnableRotation) {
        this.EnableRotation = EnableRotation;
    }

    /**
     * Get <p>轮转周期，以天为单位，默认为1天。</p> 
     * @return RotationFrequency <p>轮转周期，以天为单位，默认为1天。</p>
     */
    public Long getRotationFrequency() {
        return this.RotationFrequency;
    }

    /**
     * Set <p>轮转周期，以天为单位，默认为1天。</p>
     * @param RotationFrequency <p>轮转周期，以天为单位，默认为1天。</p>
     */
    public void setRotationFrequency(Long RotationFrequency) {
        this.RotationFrequency = RotationFrequency;
    }

    /**
     * Get <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p> 
     * @return KmsHsmClusterId <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p>
     */
    public String getKmsHsmClusterId() {
        return this.KmsHsmClusterId;
    }

    /**
     * Set <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p>
     * @param KmsHsmClusterId <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p>
     */
    public void setKmsHsmClusterId(String KmsHsmClusterId) {
        this.KmsHsmClusterId = KmsHsmClusterId;
    }

    /**
     * Get <p>账户备注</p> 
     * @return AccountRemark <p>账户备注</p>
     */
    public String getAccountRemark() {
        return this.AccountRemark;
    }

    /**
     * Set <p>账户备注</p>
     * @param AccountRemark <p>账户备注</p>
     */
    public void setAccountRemark(String AccountRemark) {
        this.AccountRemark = AccountRemark;
    }

    /**
     * Get <p>数据库账号类型，目前仅在创建sqlserver凭据场景会使用到，仅支持L3</p><p>枚举值：</p><ul><li>L3： 普通权限账号</li></ul> 
     * @return AccountType <p>数据库账号类型，目前仅在创建sqlserver凭据场景会使用到，仅支持L3</p><p>枚举值：</p><ul><li>L3： 普通权限账号</li></ul>
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>数据库账号类型，目前仅在创建sqlserver凭据场景会使用到，仅支持L3</p><p>枚举值：</p><ul><li>L3： 普通权限账号</li></ul>
     * @param AccountType <p>数据库账号类型，目前仅在创建sqlserver凭据场景会使用到，仅支持L3</p><p>枚举值：</p><ul><li>L3： 普通权限账号</li></ul>
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public CreateProductSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProductSecretRequest(CreateProductSecretRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.UserNamePrefix != null) {
            this.UserNamePrefix = new String(source.UserNamePrefix);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.PrivilegesList != null) {
            this.PrivilegesList = new ProductPrivilegeUnit[source.PrivilegesList.length];
            for (int i = 0; i < source.PrivilegesList.length; i++) {
                this.PrivilegesList[i] = new ProductPrivilegeUnit(source.PrivilegesList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RotationBeginTime != null) {
            this.RotationBeginTime = new String(source.RotationBeginTime);
        }
        if (source.EnableRotation != null) {
            this.EnableRotation = new Boolean(source.EnableRotation);
        }
        if (source.RotationFrequency != null) {
            this.RotationFrequency = new Long(source.RotationFrequency);
        }
        if (source.KmsHsmClusterId != null) {
            this.KmsHsmClusterId = new String(source.KmsHsmClusterId);
        }
        if (source.AccountRemark != null) {
            this.AccountRemark = new String(source.AccountRemark);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "UserNamePrefix", this.UserNamePrefix);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArrayObj(map, prefix + "PrivilegesList.", this.PrivilegesList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RotationBeginTime", this.RotationBeginTime);
        this.setParamSimple(map, prefix + "EnableRotation", this.EnableRotation);
        this.setParamSimple(map, prefix + "RotationFrequency", this.RotationFrequency);
        this.setParamSimple(map, prefix + "KmsHsmClusterId", this.KmsHsmClusterId);
        this.setParamSimple(map, prefix + "AccountRemark", this.AccountRemark);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);

    }
}

