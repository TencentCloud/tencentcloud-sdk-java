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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadOrgFileRequest extends AbstractModel{

    /**
    * 收单系统分配的开放ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 收单系统分配的密钥
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
    */
    @SerializedName("Storage")
    @Expose
    private String Storage;

    /**
    * 文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 收单系统分配的开放ID 
     * @return OpenId 收单系统分配的开放ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 收单系统分配的开放ID
     * @param OpenId 收单系统分配的开放ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 收单系统分配的密钥 
     * @return OpenKey 收单系统分配的密钥
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 收单系统分配的密钥
     * @param OpenKey 收单系统分配的密钥
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域 
     * @return Storage 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
     */
    public String getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
     * @param Storage 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
     */
    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 文件路径 
     * @return FilePath 文件路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件路径
     * @param FilePath 文件路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public DownloadOrgFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadOrgFileRequest(DownloadOrgFileRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.Storage != null) {
            this.Storage = new String(source.Storage);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

