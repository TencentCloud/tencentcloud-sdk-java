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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStorage extends AbstractModel {

    /**
    * <p>腾讯云对象存储COS以及第三方云存储账号信息<br>0：腾讯云对象存储 COS<br>1：AWS<br>【注意】目前第三方云存储仅支持AWS，更多第三方云存储陆续支持中</p>
    */
    @SerializedName("Vendor")
    @Expose
    private Long Vendor;

    /**
    * <p>腾讯云对象存储的[地域信息]（https://cloud.tencent.com/document/product/436/6224#.E5.9C.B0.E5.9F.9F）。<br>示例值：cn-shanghai-1</p><p>AWS S3[地域信息]（https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions）</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>云存储桶名称。</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>云存储的access_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretId值。</p>
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>云存储的secret_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretKey值。</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围az,AZ,0~9,&#39;_&#39;和&#39;-&#39;，举个例子，录制文件xxx.m3u8在 [&quot;prefix1&quot;, &quot;prefix2&quot;]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。</p>
    */
    @SerializedName("FileNamePrefix")
    @Expose
    private String [] FileNamePrefix;

    /**
     * Get <p>腾讯云对象存储COS以及第三方云存储账号信息<br>0：腾讯云对象存储 COS<br>1：AWS<br>【注意】目前第三方云存储仅支持AWS，更多第三方云存储陆续支持中</p> 
     * @return Vendor <p>腾讯云对象存储COS以及第三方云存储账号信息<br>0：腾讯云对象存储 COS<br>1：AWS<br>【注意】目前第三方云存储仅支持AWS，更多第三方云存储陆续支持中</p>
     */
    public Long getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>腾讯云对象存储COS以及第三方云存储账号信息<br>0：腾讯云对象存储 COS<br>1：AWS<br>【注意】目前第三方云存储仅支持AWS，更多第三方云存储陆续支持中</p>
     * @param Vendor <p>腾讯云对象存储COS以及第三方云存储账号信息<br>0：腾讯云对象存储 COS<br>1：AWS<br>【注意】目前第三方云存储仅支持AWS，更多第三方云存储陆续支持中</p>
     */
    public void setVendor(Long Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>腾讯云对象存储的[地域信息]（https://cloud.tencent.com/document/product/436/6224#.E5.9C.B0.E5.9F.9F）。<br>示例值：cn-shanghai-1</p><p>AWS S3[地域信息]（https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions）</p> 
     * @return Region <p>腾讯云对象存储的[地域信息]（https://cloud.tencent.com/document/product/436/6224#.E5.9C.B0.E5.9F.9F）。<br>示例值：cn-shanghai-1</p><p>AWS S3[地域信息]（https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions）</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>腾讯云对象存储的[地域信息]（https://cloud.tencent.com/document/product/436/6224#.E5.9C.B0.E5.9F.9F）。<br>示例值：cn-shanghai-1</p><p>AWS S3[地域信息]（https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions）</p>
     * @param Region <p>腾讯云对象存储的[地域信息]（https://cloud.tencent.com/document/product/436/6224#.E5.9C.B0.E5.9F.9F）。<br>示例值：cn-shanghai-1</p><p>AWS S3[地域信息]（https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions）</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>云存储桶名称。</p> 
     * @return Bucket <p>云存储桶名称。</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>云存储桶名称。</p>
     * @param Bucket <p>云存储桶名称。</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>云存储的access_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretId值。</p> 
     * @return AccessKey <p>云存储的access_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretId值。</p>
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>云存储的access_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretId值。</p>
     * @param AccessKey <p>云存储的access_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretId值。</p>
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>云存储的secret_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretKey值。</p> 
     * @return SecretKey <p>云存储的secret_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretKey值。</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>云存储的secret_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretKey值。</p>
     * @param SecretKey <p>云存储的secret_key账号信息。<br>若存储至腾讯云对象存储COS，请前往https://console.cloud.tencent.com/cam/capi 查看或创建，对应链接中密钥字段的SecretKey值。</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围az,AZ,0~9,&#39;_&#39;和&#39;-&#39;，举个例子，录制文件xxx.m3u8在 [&quot;prefix1&quot;, &quot;prefix2&quot;]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。</p> 
     * @return FileNamePrefix <p>云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围az,AZ,0~9,&#39;_&#39;和&#39;-&#39;，举个例子，录制文件xxx.m3u8在 [&quot;prefix1&quot;, &quot;prefix2&quot;]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。</p>
     */
    public String [] getFileNamePrefix() {
        return this.FileNamePrefix;
    }

    /**
     * Set <p>云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围az,AZ,0~9,&#39;_&#39;和&#39;-&#39;，举个例子，录制文件xxx.m3u8在 [&quot;prefix1&quot;, &quot;prefix2&quot;]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。</p>
     * @param FileNamePrefix <p>云存储bucket 的指定位置，由字符串数组组成。合法的字符串范围az,AZ,0~9,&#39;_&#39;和&#39;-&#39;，举个例子，录制文件xxx.m3u8在 [&quot;prefix1&quot;, &quot;prefix2&quot;]作用下，会变成prefix1/prefix2/TaskId/xxx.m3u8。</p>
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

