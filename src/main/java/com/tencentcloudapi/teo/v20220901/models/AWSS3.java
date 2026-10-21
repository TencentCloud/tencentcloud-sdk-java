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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AWSS3 extends AbstractModel {

    /**
    * <p>AWS S3 存储桶对应的服务端点域名，取值可参考 <a href="https://docs.aws.amazon.com/zh_cn/general/latest/gr/rande.html#regional-endpoints">AWS 服务端点</a>。例如：s3.us-west-2.amazonaws.com 。</p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>AWS S3 存储桶名称。可在 AWS S3 控制台 Buckets（存储桶）列表中查看对应桶名。<br>长度须为 3–63 个字符，只能包含小写字母、数字、句点（.）和连字符（-），且必须以字母或数字开头和结尾。</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>日志文件在 AWS S3 桶中的存储目录路径，以 <code>/</code> 分隔可创建多级目录，且不能包含 <code>./..</code> 等相对路径段，路径总长度不超过 1024 个字节。<br>当目录路径存在时直接使用该路径，当目录路径不存在时会自动创建。<br>目录名仅允许由字母、数字、 及 <code>!-_.*&#39;()</code> 构成。<br>示例：<code>eo-logs/l7-access-logs</code> 。</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>授权 EdgeOne 访问 AWS S3 桶的 IAM 角色的 ARN。<br>需先在 AWS 账号中创建一个授予 EdgeOne 写入权限的 IAM 角色（创建方式详情见 <a href="https://cloud.tencent.com/document/product/1552/96007">推送至 AWS S3</a>），创建后可在 AWS IAM 控制台的角色详情页顶部查看并复制该角色的 ARN。<br>例如：<code>arn:aws:iam::123456789012:role/eo-logs</code> 。</p>
    */
    @SerializedName("RoleARN")
    @Expose
    private String RoleARN;

    /**
    * <p>数据压缩类型，取值有: <ul><li> gzip：gzip压缩。</li></ul>不填表示不启用压缩。</p>
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
     * Get <p>AWS S3 存储桶对应的服务端点域名，取值可参考 <a href="https://docs.aws.amazon.com/zh_cn/general/latest/gr/rande.html#regional-endpoints">AWS 服务端点</a>。例如：s3.us-west-2.amazonaws.com 。</p> 
     * @return Endpoint <p>AWS S3 存储桶对应的服务端点域名，取值可参考 <a href="https://docs.aws.amazon.com/zh_cn/general/latest/gr/rande.html#regional-endpoints">AWS 服务端点</a>。例如：s3.us-west-2.amazonaws.com 。</p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>AWS S3 存储桶对应的服务端点域名，取值可参考 <a href="https://docs.aws.amazon.com/zh_cn/general/latest/gr/rande.html#regional-endpoints">AWS 服务端点</a>。例如：s3.us-west-2.amazonaws.com 。</p>
     * @param Endpoint <p>AWS S3 存储桶对应的服务端点域名，取值可参考 <a href="https://docs.aws.amazon.com/zh_cn/general/latest/gr/rande.html#regional-endpoints">AWS 服务端点</a>。例如：s3.us-west-2.amazonaws.com 。</p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>AWS S3 存储桶名称。可在 AWS S3 控制台 Buckets（存储桶）列表中查看对应桶名。<br>长度须为 3–63 个字符，只能包含小写字母、数字、句点（.）和连字符（-），且必须以字母或数字开头和结尾。</p> 
     * @return BucketName <p>AWS S3 存储桶名称。可在 AWS S3 控制台 Buckets（存储桶）列表中查看对应桶名。<br>长度须为 3–63 个字符，只能包含小写字母、数字、句点（.）和连字符（-），且必须以字母或数字开头和结尾。</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>AWS S3 存储桶名称。可在 AWS S3 控制台 Buckets（存储桶）列表中查看对应桶名。<br>长度须为 3–63 个字符，只能包含小写字母、数字、句点（.）和连字符（-），且必须以字母或数字开头和结尾。</p>
     * @param BucketName <p>AWS S3 存储桶名称。可在 AWS S3 控制台 Buckets（存储桶）列表中查看对应桶名。<br>长度须为 3–63 个字符，只能包含小写字母、数字、句点（.）和连字符（-），且必须以字母或数字开头和结尾。</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>日志文件在 AWS S3 桶中的存储目录路径，以 <code>/</code> 分隔可创建多级目录，且不能包含 <code>./..</code> 等相对路径段，路径总长度不超过 1024 个字节。<br>当目录路径存在时直接使用该路径，当目录路径不存在时会自动创建。<br>目录名仅允许由字母、数字、 及 <code>!-_.*&#39;()</code> 构成。<br>示例：<code>eo-logs/l7-access-logs</code> 。</p> 
     * @return Path <p>日志文件在 AWS S3 桶中的存储目录路径，以 <code>/</code> 分隔可创建多级目录，且不能包含 <code>./..</code> 等相对路径段，路径总长度不超过 1024 个字节。<br>当目录路径存在时直接使用该路径，当目录路径不存在时会自动创建。<br>目录名仅允许由字母、数字、 及 <code>!-_.*&#39;()</code> 构成。<br>示例：<code>eo-logs/l7-access-logs</code> 。</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>日志文件在 AWS S3 桶中的存储目录路径，以 <code>/</code> 分隔可创建多级目录，且不能包含 <code>./..</code> 等相对路径段，路径总长度不超过 1024 个字节。<br>当目录路径存在时直接使用该路径，当目录路径不存在时会自动创建。<br>目录名仅允许由字母、数字、 及 <code>!-_.*&#39;()</code> 构成。<br>示例：<code>eo-logs/l7-access-logs</code> 。</p>
     * @param Path <p>日志文件在 AWS S3 桶中的存储目录路径，以 <code>/</code> 分隔可创建多级目录，且不能包含 <code>./..</code> 等相对路径段，路径总长度不超过 1024 个字节。<br>当目录路径存在时直接使用该路径，当目录路径不存在时会自动创建。<br>目录名仅允许由字母、数字、 及 <code>!-_.*&#39;()</code> 构成。<br>示例：<code>eo-logs/l7-access-logs</code> 。</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>授权 EdgeOne 访问 AWS S3 桶的 IAM 角色的 ARN。<br>需先在 AWS 账号中创建一个授予 EdgeOne 写入权限的 IAM 角色（创建方式详情见 <a href="https://cloud.tencent.com/document/product/1552/96007">推送至 AWS S3</a>），创建后可在 AWS IAM 控制台的角色详情页顶部查看并复制该角色的 ARN。<br>例如：<code>arn:aws:iam::123456789012:role/eo-logs</code> 。</p> 
     * @return RoleARN <p>授权 EdgeOne 访问 AWS S3 桶的 IAM 角色的 ARN。<br>需先在 AWS 账号中创建一个授予 EdgeOne 写入权限的 IAM 角色（创建方式详情见 <a href="https://cloud.tencent.com/document/product/1552/96007">推送至 AWS S3</a>），创建后可在 AWS IAM 控制台的角色详情页顶部查看并复制该角色的 ARN。<br>例如：<code>arn:aws:iam::123456789012:role/eo-logs</code> 。</p>
     */
    public String getRoleARN() {
        return this.RoleARN;
    }

    /**
     * Set <p>授权 EdgeOne 访问 AWS S3 桶的 IAM 角色的 ARN。<br>需先在 AWS 账号中创建一个授予 EdgeOne 写入权限的 IAM 角色（创建方式详情见 <a href="https://cloud.tencent.com/document/product/1552/96007">推送至 AWS S3</a>），创建后可在 AWS IAM 控制台的角色详情页顶部查看并复制该角色的 ARN。<br>例如：<code>arn:aws:iam::123456789012:role/eo-logs</code> 。</p>
     * @param RoleARN <p>授权 EdgeOne 访问 AWS S3 桶的 IAM 角色的 ARN。<br>需先在 AWS 账号中创建一个授予 EdgeOne 写入权限的 IAM 角色（创建方式详情见 <a href="https://cloud.tencent.com/document/product/1552/96007">推送至 AWS S3</a>），创建后可在 AWS IAM 控制台的角色详情页顶部查看并复制该角色的 ARN。<br>例如：<code>arn:aws:iam::123456789012:role/eo-logs</code> 。</p>
     */
    public void setRoleARN(String RoleARN) {
        this.RoleARN = RoleARN;
    }

    /**
     * Get <p>数据压缩类型，取值有: <ul><li> gzip：gzip压缩。</li></ul>不填表示不启用压缩。</p> 
     * @return CompressType <p>数据压缩类型，取值有: <ul><li> gzip：gzip压缩。</li></ul>不填表示不启用压缩。</p>
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set <p>数据压缩类型，取值有: <ul><li> gzip：gzip压缩。</li></ul>不填表示不启用压缩。</p>
     * @param CompressType <p>数据压缩类型，取值有: <ul><li> gzip：gzip压缩。</li></ul>不填表示不启用压缩。</p>
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    public AWSS3() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AWSS3(AWSS3 source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RoleARN != null) {
            this.RoleARN = new String(source.RoleARN);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RoleARN", this.RoleARN);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);

    }
}

