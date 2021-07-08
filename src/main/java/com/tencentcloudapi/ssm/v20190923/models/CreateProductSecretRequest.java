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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProductSecretRequest extends AbstractModel{

    /**
    * 凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 用户账号名前缀，由用户自行指定，长度限定在8个字符以内，
可选字符集包括：
数字字符：[0, 9]，
小写字符：[a, z]，
大写字符：[A, Z]，
特殊字符(全英文符号)：下划线(_)，
前缀必须以大写或小写字母开头。
    */
    @SerializedName("UserNamePrefix")
    @Expose
    private String UserNamePrefix;

    /**
    * 凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 云产品实例ID。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 账号的域名，IP形式，支持填入%。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 将凭据与云产品实例绑定时，需要授予的权限列表。
    */
    @SerializedName("PrivilegesList")
    @Expose
    private ProductPrivilegeUnit [] PrivilegesList;

    /**
    * 描述信息，用于详细描述用途等，最大支持2048字节。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 指定对凭据进行加密的KMS CMK。
如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。
您也可以指定在同region 下自行创建的KMS CMK进行加密。
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * 标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。
当EnableRotation为True时，此参数必填。
    */
    @SerializedName("RotationBeginTime")
    @Expose
    private String RotationBeginTime;

    /**
    * 是否开启轮转
True -- 开启
False -- 不开启
如果不指定，默认为False。
    */
    @SerializedName("EnableRotation")
    @Expose
    private Boolean EnableRotation;

    /**
    * 轮转周期，以天为单位，默认为1天。
    */
    @SerializedName("RotationFrequency")
    @Expose
    private Long RotationFrequency;

    /**
     * Get 凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。 
     * @return SecretName 凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。
     * @param SecretName 凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 用户账号名前缀，由用户自行指定，长度限定在8个字符以内，
可选字符集包括：
数字字符：[0, 9]，
小写字符：[a, z]，
大写字符：[A, Z]，
特殊字符(全英文符号)：下划线(_)，
前缀必须以大写或小写字母开头。 
     * @return UserNamePrefix 用户账号名前缀，由用户自行指定，长度限定在8个字符以内，
可选字符集包括：
数字字符：[0, 9]，
小写字符：[a, z]，
大写字符：[A, Z]，
特殊字符(全英文符号)：下划线(_)，
前缀必须以大写或小写字母开头。
     */
    public String getUserNamePrefix() {
        return this.UserNamePrefix;
    }

    /**
     * Set 用户账号名前缀，由用户自行指定，长度限定在8个字符以内，
可选字符集包括：
数字字符：[0, 9]，
小写字符：[a, z]，
大写字符：[A, Z]，
特殊字符(全英文符号)：下划线(_)，
前缀必须以大写或小写字母开头。
     * @param UserNamePrefix 用户账号名前缀，由用户自行指定，长度限定在8个字符以内，
可选字符集包括：
数字字符：[0, 9]，
小写字符：[a, z]，
大写字符：[A, Z]，
特殊字符(全英文符号)：下划线(_)，
前缀必须以大写或小写字母开头。
     */
    public void setUserNamePrefix(String UserNamePrefix) {
        this.UserNamePrefix = UserNamePrefix;
    }

    /**
     * Get 凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。 
     * @return ProductName 凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。
     * @param ProductName 凭据所绑定的云产品名称，如Mysql，可以通过DescribeSupportedProducts接口获取所支持的云产品名称。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 云产品实例ID。 
     * @return InstanceID 云产品实例ID。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 云产品实例ID。
     * @param InstanceID 云产品实例ID。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 账号的域名，IP形式，支持填入%。 
     * @return Domains 账号的域名，IP形式，支持填入%。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 账号的域名，IP形式，支持填入%。
     * @param Domains 账号的域名，IP形式，支持填入%。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 将凭据与云产品实例绑定时，需要授予的权限列表。 
     * @return PrivilegesList 将凭据与云产品实例绑定时，需要授予的权限列表。
     */
    public ProductPrivilegeUnit [] getPrivilegesList() {
        return this.PrivilegesList;
    }

    /**
     * Set 将凭据与云产品实例绑定时，需要授予的权限列表。
     * @param PrivilegesList 将凭据与云产品实例绑定时，需要授予的权限列表。
     */
    public void setPrivilegesList(ProductPrivilegeUnit [] PrivilegesList) {
        this.PrivilegesList = PrivilegesList;
    }

    /**
     * Get 描述信息，用于详细描述用途等，最大支持2048字节。 
     * @return Description 描述信息，用于详细描述用途等，最大支持2048字节。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息，用于详细描述用途等，最大支持2048字节。
     * @param Description 描述信息，用于详细描述用途等，最大支持2048字节。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 指定对凭据进行加密的KMS CMK。
如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。
您也可以指定在同region 下自行创建的KMS CMK进行加密。 
     * @return KmsKeyId 指定对凭据进行加密的KMS CMK。
如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。
您也可以指定在同region 下自行创建的KMS CMK进行加密。
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set 指定对凭据进行加密的KMS CMK。
如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。
您也可以指定在同region 下自行创建的KMS CMK进行加密。
     * @param KmsKeyId 指定对凭据进行加密的KMS CMK。
如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。
您也可以指定在同region 下自行创建的KMS CMK进行加密。
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get 标签列表。 
     * @return Tags 标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表。
     * @param Tags 标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。
当EnableRotation为True时，此参数必填。 
     * @return RotationBeginTime 用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。
当EnableRotation为True时，此参数必填。
     */
    public String getRotationBeginTime() {
        return this.RotationBeginTime;
    }

    /**
     * Set 用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。
当EnableRotation为True时，此参数必填。
     * @param RotationBeginTime 用户自定义的开始轮转时间，格式：2006-01-02 15:04:05。
当EnableRotation为True时，此参数必填。
     */
    public void setRotationBeginTime(String RotationBeginTime) {
        this.RotationBeginTime = RotationBeginTime;
    }

    /**
     * Get 是否开启轮转
True -- 开启
False -- 不开启
如果不指定，默认为False。 
     * @return EnableRotation 是否开启轮转
True -- 开启
False -- 不开启
如果不指定，默认为False。
     */
    public Boolean getEnableRotation() {
        return this.EnableRotation;
    }

    /**
     * Set 是否开启轮转
True -- 开启
False -- 不开启
如果不指定，默认为False。
     * @param EnableRotation 是否开启轮转
True -- 开启
False -- 不开启
如果不指定，默认为False。
     */
    public void setEnableRotation(Boolean EnableRotation) {
        this.EnableRotation = EnableRotation;
    }

    /**
     * Get 轮转周期，以天为单位，默认为1天。 
     * @return RotationFrequency 轮转周期，以天为单位，默认为1天。
     */
    public Long getRotationFrequency() {
        return this.RotationFrequency;
    }

    /**
     * Set 轮转周期，以天为单位，默认为1天。
     * @param RotationFrequency 轮转周期，以天为单位，默认为1天。
     */
    public void setRotationFrequency(Long RotationFrequency) {
        this.RotationFrequency = RotationFrequency;
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

    }
}

