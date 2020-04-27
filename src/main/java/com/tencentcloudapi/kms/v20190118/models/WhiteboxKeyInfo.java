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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteboxKeyInfo extends AbstractModel{

    /**
    * 白盒密钥的全局唯一标识符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字. 不可重复
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 创建者
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * 密钥的描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 密钥创建时间，Unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 白盒密钥的状态， 取值为：Enabled | Disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建者
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 密钥所用的算法类型
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * 白盒加密密钥，base64编码
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * 白盒解密密钥，base64编码
    */
    @SerializedName("DecryptKey")
    @Expose
    private String DecryptKey;

    /**
    * 资源ID，格式：creatorUin/$creatorUin/$keyId
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 白盒密钥的全局唯一标识符 
     * @return KeyId 白盒密钥的全局唯一标识符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 白盒密钥的全局唯一标识符
     * @param KeyId 白盒密钥的全局唯一标识符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字. 不可重复 
     * @return Alias 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字. 不可重复
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字. 不可重复
     * @param Alias 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字. 不可重复
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 创建者 
     * @return CreatorUin 创建者
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者
     * @param CreatorUin 创建者
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 密钥的描述信息 
     * @return Description 密钥的描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 密钥的描述信息
     * @param Description 密钥的描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 密钥创建时间，Unix时间戳 
     * @return CreateTime 密钥创建时间，Unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 密钥创建时间，Unix时间戳
     * @param CreateTime 密钥创建时间，Unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 白盒密钥的状态， 取值为：Enabled | Disabled 
     * @return Status 白盒密钥的状态， 取值为：Enabled | Disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 白盒密钥的状态， 取值为：Enabled | Disabled
     * @param Status 白盒密钥的状态， 取值为：Enabled | Disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建者 
     * @return OwnerUin 创建者
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 创建者
     * @param OwnerUin 创建者
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 密钥所用的算法类型 
     * @return Algorithm 密钥所用的算法类型
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 密钥所用的算法类型
     * @param Algorithm 密钥所用的算法类型
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get 白盒加密密钥，base64编码 
     * @return EncryptKey 白盒加密密钥，base64编码
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set 白盒加密密钥，base64编码
     * @param EncryptKey 白盒加密密钥，base64编码
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
    }

    /**
     * Get 白盒解密密钥，base64编码 
     * @return DecryptKey 白盒解密密钥，base64编码
     */
    public String getDecryptKey() {
        return this.DecryptKey;
    }

    /**
     * Set 白盒解密密钥，base64编码
     * @param DecryptKey 白盒解密密钥，base64编码
     */
    public void setDecryptKey(String DecryptKey) {
        this.DecryptKey = DecryptKey;
    }

    /**
     * Get 资源ID，格式：creatorUin/$creatorUin/$keyId 
     * @return ResourceId 资源ID，格式：creatorUin/$creatorUin/$keyId
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，格式：creatorUin/$creatorUin/$keyId
     * @param ResourceId 资源ID，格式：creatorUin/$creatorUin/$keyId
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "EncryptKey", this.EncryptKey);
        this.setParamSimple(map, prefix + "DecryptKey", this.DecryptKey);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

