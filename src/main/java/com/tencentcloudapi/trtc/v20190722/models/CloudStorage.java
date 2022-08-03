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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStorage extends AbstractModel{

    /**
    * 第三方云储存的供应商:
0：腾讯云存储 COS，暂不支持其他家。
    */
    @SerializedName("Vendor")
    @Expose
    private Long Vendor;

    /**
    * 第三方云存储的地域信息。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 第三方存储桶信息。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 第三方存储的access_key账号信息。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 第三方存储的secret_key账号信息。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 第三方云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围a~z,A~Z,0~9,'_'和'-'，举个例子，录制文件xxx.m3u8在 ["prefix1", "prefix2"]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。
    */
    @SerializedName("FileNamePrefix")
    @Expose
    private String [] FileNamePrefix;

    /**
     * Get 第三方云储存的供应商:
0：腾讯云存储 COS，暂不支持其他家。 
     * @return Vendor 第三方云储存的供应商:
0：腾讯云存储 COS，暂不支持其他家。
     */
    public Long getVendor() {
        return this.Vendor;
    }

    /**
     * Set 第三方云储存的供应商:
0：腾讯云存储 COS，暂不支持其他家。
     * @param Vendor 第三方云储存的供应商:
0：腾讯云存储 COS，暂不支持其他家。
     */
    public void setVendor(Long Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get 第三方云存储的地域信息。 
     * @return Region 第三方云存储的地域信息。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 第三方云存储的地域信息。
     * @param Region 第三方云存储的地域信息。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 第三方存储桶信息。 
     * @return Bucket 第三方存储桶信息。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 第三方存储桶信息。
     * @param Bucket 第三方存储桶信息。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 第三方存储的access_key账号信息。 
     * @return AccessKey 第三方存储的access_key账号信息。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 第三方存储的access_key账号信息。
     * @param AccessKey 第三方存储的access_key账号信息。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 第三方存储的secret_key账号信息。 
     * @return SecretKey 第三方存储的secret_key账号信息。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 第三方存储的secret_key账号信息。
     * @param SecretKey 第三方存储的secret_key账号信息。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 第三方云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围a~z,A~Z,0~9,'_'和'-'，举个例子，录制文件xxx.m3u8在 ["prefix1", "prefix2"]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。 
     * @return FileNamePrefix 第三方云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围a~z,A~Z,0~9,'_'和'-'，举个例子，录制文件xxx.m3u8在 ["prefix1", "prefix2"]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。
     */
    public String [] getFileNamePrefix() {
        return this.FileNamePrefix;
    }

    /**
     * Set 第三方云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围a~z,A~Z,0~9,'_'和'-'，举个例子，录制文件xxx.m3u8在 ["prefix1", "prefix2"]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。
     * @param FileNamePrefix 第三方云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围a~z,A~Z,0~9,'_'和'-'，举个例子，录制文件xxx.m3u8在 ["prefix1", "prefix2"]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。
     */
    public void setFileNamePrefix(String [] FileNamePrefix) {
        this.FileNamePrefix = FileNamePrefix;
    }

    public CloudStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStorage(CloudStorage source) {
        if (source.Vendor != null) {
            this.Vendor = new Long(source.Vendor);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.FileNamePrefix != null) {
            this.FileNamePrefix = new String[source.FileNamePrefix.length];
            for (int i = 0; i < source.FileNamePrefix.length; i++) {
                this.FileNamePrefix[i] = new String(source.FileNamePrefix[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamArraySimple(map, prefix + "FileNamePrefix.", this.FileNamePrefix);

    }
}

