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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddInstancesRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 云主机ID列表
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * 操作系统名称
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 操作系统镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 重装系统密码设置
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 重装系统，关联密钥设置
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 安全组设置
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * 云主机导入方式，虚拟机集群必填，容器集群不填写此字段，R：重装TSF系统镜像，M：手动安装agent
    */
    @SerializedName("InstanceImportMode")
    @Expose
    private String InstanceImportMode;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 云主机ID列表 
     * @return InstanceIdList 云主机ID列表
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 云主机ID列表
     * @param InstanceIdList 云主机ID列表
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get 操作系统名称 
     * @return OsName 操作系统名称
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称
     * @param OsName 操作系统名称
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 操作系统镜像ID 
     * @return ImageId 操作系统镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 操作系统镜像ID
     * @param ImageId 操作系统镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 重装系统密码设置 
     * @return Password 重装系统密码设置
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 重装系统密码设置
     * @param Password 重装系统密码设置
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 重装系统，关联密钥设置 
     * @return KeyId 重装系统，关联密钥设置
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 重装系统，关联密钥设置
     * @param KeyId 重装系统，关联密钥设置
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 安全组设置 
     * @return SgId 安全组设置
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set 安全组设置
     * @param SgId 安全组设置
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get 云主机导入方式，虚拟机集群必填，容器集群不填写此字段，R：重装TSF系统镜像，M：手动安装agent 
     * @return InstanceImportMode 云主机导入方式，虚拟机集群必填，容器集群不填写此字段，R：重装TSF系统镜像，M：手动安装agent
     */
    public String getInstanceImportMode() {
        return this.InstanceImportMode;
    }

    /**
     * Set 云主机导入方式，虚拟机集群必填，容器集群不填写此字段，R：重装TSF系统镜像，M：手动安装agent
     * @param InstanceImportMode 云主机导入方式，虚拟机集群必填，容器集群不填写此字段，R：重装TSF系统镜像，M：手动安装agent
     */
    public void setInstanceImportMode(String InstanceImportMode) {
        this.InstanceImportMode = InstanceImportMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamSimple(map, prefix + "InstanceImportMode", this.InstanceImportMode);

    }
}

