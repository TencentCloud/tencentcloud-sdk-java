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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Storage extends AbstractModel{

    /**
    * 存储类型（目前支持 cos、cls）
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 存储所在地域
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 存储名称(cos：存储名称为用户自定义的存储桶名称，不包含"-APPID"，仅支持小写字母、数字以及中划线"-"的组合，不能超过50字符，且不支持中划线"-"开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符)
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * 存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符
    */
    @SerializedName("StoragePrefix")
    @Expose
    private String StoragePrefix;

    /**
     * Get 存储类型（目前支持 cos、cls） 
     * @return StorageType 存储类型（目前支持 cos、cls）
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型（目前支持 cos、cls）
     * @param StorageType 存储类型（目前支持 cos、cls）
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 存储所在地域 
     * @return StorageRegion 存储所在地域
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 存储所在地域
     * @param StorageRegion 存储所在地域
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 存储名称(cos：存储名称为用户自定义的存储桶名称，不包含"-APPID"，仅支持小写字母、数字以及中划线"-"的组合，不能超过50字符，且不支持中划线"-"开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符) 
     * @return StorageName 存储名称(cos：存储名称为用户自定义的存储桶名称，不包含"-APPID"，仅支持小写字母、数字以及中划线"-"的组合，不能超过50字符，且不支持中划线"-"开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符)
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set 存储名称(cos：存储名称为用户自定义的存储桶名称，不包含"-APPID"，仅支持小写字母、数字以及中划线"-"的组合，不能超过50字符，且不支持中划线"-"开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符)
     * @param StorageName 存储名称(cos：存储名称为用户自定义的存储桶名称，不包含"-APPID"，仅支持小写字母、数字以及中划线"-"的组合，不能超过50字符，且不支持中划线"-"开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符)
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get 存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符 
     * @return StoragePrefix 存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符
     */
    public String getStoragePrefix() {
        return this.StoragePrefix;
    }

    /**
     * Set 存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符
     * @param StoragePrefix 存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符
     */
    public void setStoragePrefix(String StoragePrefix) {
        this.StoragePrefix = StoragePrefix;
    }

    public Storage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Storage(Storage source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
        if (source.StoragePrefix != null) {
            this.StoragePrefix = new String(source.StoragePrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);
        this.setParamSimple(map, prefix + "StoragePrefix", this.StoragePrefix);

    }
}

