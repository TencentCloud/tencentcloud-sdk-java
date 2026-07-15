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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchS3RechargeInfoRequest extends AbstractModel {

    /**
    * <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>s3导入任务名称,最大支持128个字节。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>s3存储桶</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>地域</p>
    */
    @SerializedName("S3Region")
    @Expose
    private String S3Region;

    /**
    * <p>访问密钥 ID（Access Key ID）</p>
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * <p>访问密钥Key（Secret Access Key）</p>
    */
    @SerializedName("SecretAccessKey")
    @Expose
    private String SecretAccessKey;

    /**
    * <p>自定义端点</p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p>
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
     * Get <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul> 
     * @return TopicId <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     * @param TopicId <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>s3导入任务名称,最大支持128个字节。</p> 
     * @return Name <p>s3导入任务名称,最大支持128个字节。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>s3导入任务名称,最大支持128个字节。</p>
     * @param Name <p>s3导入任务名称,最大支持128个字节。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>s3存储桶</p> 
     * @return Bucket <p>s3存储桶</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>s3存储桶</p>
     * @param Bucket <p>s3存储桶</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>地域</p> 
     * @return S3Region <p>地域</p>
     */
    public String getS3Region() {
        return this.S3Region;
    }

    /**
     * Set <p>地域</p>
     * @param S3Region <p>地域</p>
     */
    public void setS3Region(String S3Region) {
        this.S3Region = S3Region;
    }

    /**
     * Get <p>访问密钥 ID（Access Key ID）</p> 
     * @return AccessKeyId <p>访问密钥 ID（Access Key ID）</p>
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set <p>访问密钥 ID（Access Key ID）</p>
     * @param AccessKeyId <p>访问密钥 ID（Access Key ID）</p>
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get <p>访问密钥Key（Secret Access Key）</p> 
     * @return SecretAccessKey <p>访问密钥Key（Secret Access Key）</p>
     */
    public String getSecretAccessKey() {
        return this.SecretAccessKey;
    }

    /**
     * Set <p>访问密钥Key（Secret Access Key）</p>
     * @param SecretAccessKey <p>访问密钥Key（Secret Access Key）</p>
     */
    public void setSecretAccessKey(String SecretAccessKey) {
        this.SecretAccessKey = SecretAccessKey;
    }

    /**
     * Get <p>自定义端点</p> 
     * @return Endpoint <p>自定义端点</p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>自定义端点</p>
     * @param Endpoint <p>自定义端点</p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p> 
     * @return Prefix <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p>
     * @param Prefix <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p> 
     * @return Compress <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p>
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p>
     * @param Compress <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p>
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    public SearchS3RechargeInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchS3RechargeInfoRequest(SearchS3RechargeInfoRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.S3Region != null) {
            this.S3Region = new String(source.S3Region);
        }
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.SecretAccessKey != null) {
            this.SecretAccessKey = new String(source.SecretAccessKey);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Compress != null) {
            this.Compress = new String(source.Compress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "S3Region", this.S3Region);
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "SecretAccessKey", this.SecretAccessKey);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Compress", this.Compress);

    }
}

