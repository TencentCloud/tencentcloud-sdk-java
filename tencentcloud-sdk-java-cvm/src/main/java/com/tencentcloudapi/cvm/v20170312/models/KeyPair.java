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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyPair extends AbstractModel{

    /**
    * 密钥对的`ID`，是密钥对的唯一标识。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥对名称。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 密钥对所属的项目`ID`。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 密钥对描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 密钥对的纯文本公钥。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 密钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 密钥关联的实例`ID`列表。
    */
    @SerializedName("AssociatedInstanceIds")
    @Expose
    private String [] AssociatedInstanceIds;

    /**
    * 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 密钥对的`ID`，是密钥对的唯一标识。 
     * @return KeyId 密钥对的`ID`，是密钥对的唯一标识。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥对的`ID`，是密钥对的唯一标识。
     * @param KeyId 密钥对的`ID`，是密钥对的唯一标识。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥对名称。 
     * @return KeyName 密钥对名称。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 密钥对名称。
     * @param KeyName 密钥对名称。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 密钥对所属的项目`ID`。 
     * @return ProjectId 密钥对所属的项目`ID`。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 密钥对所属的项目`ID`。
     * @param ProjectId 密钥对所属的项目`ID`。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 密钥对描述信息。 
     * @return Description 密钥对描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 密钥对描述信息。
     * @param Description 密钥对描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 密钥对的纯文本公钥。 
     * @return PublicKey 密钥对的纯文本公钥。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 密钥对的纯文本公钥。
     * @param PublicKey 密钥对的纯文本公钥。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 密钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。 
     * @return PrivateKey 密钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 密钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
     * @param PrivateKey 密钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 密钥关联的实例`ID`列表。 
     * @return AssociatedInstanceIds 密钥关联的实例`ID`列表。
     */
    public String [] getAssociatedInstanceIds() {
        return this.AssociatedInstanceIds;
    }

    /**
     * Set 密钥关联的实例`ID`列表。
     * @param AssociatedInstanceIds 密钥关联的实例`ID`列表。
     */
    public void setAssociatedInstanceIds(String [] AssociatedInstanceIds) {
        this.AssociatedInstanceIds = AssociatedInstanceIds;
    }

    /**
     * Get 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return CreatedTime 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param CreatedTime 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamArraySimple(map, prefix + "AssociatedInstanceIds.", this.AssociatedInstanceIds);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

