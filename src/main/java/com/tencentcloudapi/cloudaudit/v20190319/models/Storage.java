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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Storage extends AbstractModel {

    /**
    * <p>存储类型（目前支持 cos、cls、ckafka）</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>存储所在地域</p>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p>存储名称(cos：存储名称为用户自定义的存储桶名称，不包含&quot;-APPID&quot;，仅支持小写字母、数字以及中划线&quot;-&quot;的组合，不能超过50字符，且不支持中划线&quot;-&quot;开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符； ckafka： ckafka实例ID/topic. 举例：ckafka-xxxxxx/tencent_test_audit_log)</p>
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * <p>存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符</p>
    */
    @SerializedName("StoragePrefix")
    @Expose
    private String StoragePrefix;

    /**
    * <p>被指定存储用户ID</p>
    */
    @SerializedName("StorageAccountId")
    @Expose
    private String StorageAccountId;

    /**
    * <p>被指定存储用户appid</p>
    */
    @SerializedName("StorageAppId")
    @Expose
    private String StorageAppId;

    /**
    * <p>是否压缩。<br>1:压缩  2:不压缩</p>
    */
    @SerializedName("Compress")
    @Expose
    private Long Compress;

    /**
     * Get <p>存储类型（目前支持 cos、cls、ckafka）</p> 
     * @return StorageType <p>存储类型（目前支持 cos、cls、ckafka）</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型（目前支持 cos、cls、ckafka）</p>
     * @param StorageType <p>存储类型（目前支持 cos、cls、ckafka）</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>存储所在地域</p> 
     * @return StorageRegion <p>存储所在地域</p>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>存储所在地域</p>
     * @param StorageRegion <p>存储所在地域</p>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p>存储名称(cos：存储名称为用户自定义的存储桶名称，不包含&quot;-APPID&quot;，仅支持小写字母、数字以及中划线&quot;-&quot;的组合，不能超过50字符，且不支持中划线&quot;-&quot;开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符； ckafka： ckafka实例ID/topic. 举例：ckafka-xxxxxx/tencent_test_audit_log)</p> 
     * @return StorageName <p>存储名称(cos：存储名称为用户自定义的存储桶名称，不包含&quot;-APPID&quot;，仅支持小写字母、数字以及中划线&quot;-&quot;的组合，不能超过50字符，且不支持中划线&quot;-&quot;开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符； ckafka： ckafka实例ID/topic. 举例：ckafka-xxxxxx/tencent_test_audit_log)</p>
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set <p>存储名称(cos：存储名称为用户自定义的存储桶名称，不包含&quot;-APPID&quot;，仅支持小写字母、数字以及中划线&quot;-&quot;的组合，不能超过50字符，且不支持中划线&quot;-&quot;开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符； ckafka： ckafka实例ID/topic. 举例：ckafka-xxxxxx/tencent_test_audit_log)</p>
     * @param StorageName <p>存储名称(cos：存储名称为用户自定义的存储桶名称，不包含&quot;-APPID&quot;，仅支持小写字母、数字以及中划线&quot;-&quot;的组合，不能超过50字符，且不支持中划线&quot;-&quot;开头或结尾； cls：存储名称为日志主题id，字符长度为1-50个字符； ckafka： ckafka实例ID/topic. 举例：ckafka-xxxxxx/tencent_test_audit_log)</p>
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get <p>存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符</p> 
     * @return StoragePrefix <p>存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符</p>
     */
    public String getStoragePrefix() {
        return this.StoragePrefix;
    }

    /**
     * Set <p>存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符</p>
     * @param StoragePrefix <p>存储目录前缀，cos日志文件前缀仅支持字母和数字的组合，3-40个字符</p>
     */
    public void setStoragePrefix(String StoragePrefix) {
        this.StoragePrefix = StoragePrefix;
    }

    /**
     * Get <p>被指定存储用户ID</p> 
     * @return StorageAccountId <p>被指定存储用户ID</p>
     */
    public String getStorageAccountId() {
        return this.StorageAccountId;
    }

    /**
     * Set <p>被指定存储用户ID</p>
     * @param StorageAccountId <p>被指定存储用户ID</p>
     */
    public void setStorageAccountId(String StorageAccountId) {
        this.StorageAccountId = StorageAccountId;
    }

    /**
     * Get <p>被指定存储用户appid</p> 
     * @return StorageAppId <p>被指定存储用户appid</p>
     */
    public String getStorageAppId() {
        return this.StorageAppId;
    }

    /**
     * Set <p>被指定存储用户appid</p>
     * @param StorageAppId <p>被指定存储用户appid</p>
     */
    public void setStorageAppId(String StorageAppId) {
        this.StorageAppId = StorageAppId;
    }

    /**
     * Get <p>是否压缩。<br>1:压缩  2:不压缩</p> 
     * @return Compress <p>是否压缩。<br>1:压缩  2:不压缩</p>
     */
    public Long getCompress() {
        return this.Compress;
    }

    /**
     * Set <p>是否压缩。<br>1:压缩  2:不压缩</p>
     * @param Compress <p>是否压缩。<br>1:压缩  2:不压缩</p>
     */
    public void setCompress(Long Compress) {
        this.Compress = Compress;
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
        if (source.StorageAccountId != null) {
            this.StorageAccountId = new String(source.StorageAccountId);
        }
        if (source.StorageAppId != null) {
            this.StorageAppId = new String(source.StorageAppId);
        }
        if (source.Compress != null) {
            this.Compress = new Long(source.Compress);
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
        this.setParamSimple(map, prefix + "StorageAccountId", this.StorageAccountId);
        this.setParamSimple(map, prefix + "StorageAppId", this.StorageAppId);
        this.setParamSimple(map, prefix + "Compress", this.Compress);

    }
}

