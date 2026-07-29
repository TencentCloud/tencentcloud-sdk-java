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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildSource extends AbstractModel {

    /**
    * <p>源码来源类型，取值：&quot;git&quot; &quot;zip&quot;</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Git 仓库 HTTPS URL；或 COS 下载完整 URL；与 CodeUrlWithAuth / CosTimestamp 之一非空（zip 二阶段上传时可留空）</p>
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * <p>分支 tag commit；Git 默认 main，zip 模式下忽略</p>
    */
    @SerializedName("Ref")
    @Expose
    private String Ref;

    /**
    * <p>&quot;git&quot; &quot;github&quot; &quot;gitlab&quot; &quot;gitee&quot; &quot;coding&quot;；私有仓必填，平台据此走 OAuth 鉴权</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>是否私有仓；true 时平台自动注入 CodeUrlWithAuth</p>
    */
    @SerializedName("IsPrivate")
    @Expose
    private Boolean IsPrivate;

    /**
    * <p>调用方显式传入的带鉴权 clone URL 或带签名的 zip 下载直链（优先级最高，会覆盖平台 OAuth / 自动签名）</p>
    */
    @SerializedName("CodeUrlWithAuth")
    @Expose
    private String CodeUrlWithAuth;

    /**
    * <p>仅 Type=zip/cos 时使用。配合 zip 二阶段上传：填 DescribeCloudAppCosInfo 返回的 UnixTimestamp，平台据此自动签名出 ZIP_FILE_URL</p>
    */
    @SerializedName("CosTimestamp")
    @Expose
    private String CosTimestamp;

    /**
    * <p>仅 Type=zip/cos 时使用。zip 文件后缀，默认 .zip；与 CosTimestamp 配合定位 COS 对象</p>
    */
    @SerializedName("CosSuffix")
    @Expose
    private String CosSuffix;

    /**
     * Get <p>源码来源类型，取值：&quot;git&quot; &quot;zip&quot;</p> 
     * @return Type <p>源码来源类型，取值：&quot;git&quot; &quot;zip&quot;</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>源码来源类型，取值：&quot;git&quot; &quot;zip&quot;</p>
     * @param Type <p>源码来源类型，取值：&quot;git&quot; &quot;zip&quot;</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Git 仓库 HTTPS URL；或 COS 下载完整 URL；与 CodeUrlWithAuth / CosTimestamp 之一非空（zip 二阶段上传时可留空）</p> 
     * @return Repo <p>Git 仓库 HTTPS URL；或 COS 下载完整 URL；与 CodeUrlWithAuth / CosTimestamp 之一非空（zip 二阶段上传时可留空）</p>
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set <p>Git 仓库 HTTPS URL；或 COS 下载完整 URL；与 CodeUrlWithAuth / CosTimestamp 之一非空（zip 二阶段上传时可留空）</p>
     * @param Repo <p>Git 仓库 HTTPS URL；或 COS 下载完整 URL；与 CodeUrlWithAuth / CosTimestamp 之一非空（zip 二阶段上传时可留空）</p>
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get <p>分支 tag commit；Git 默认 main，zip 模式下忽略</p> 
     * @return Ref <p>分支 tag commit；Git 默认 main，zip 模式下忽略</p>
     */
    public String getRef() {
        return this.Ref;
    }

    /**
     * Set <p>分支 tag commit；Git 默认 main，zip 模式下忽略</p>
     * @param Ref <p>分支 tag commit；Git 默认 main，zip 模式下忽略</p>
     */
    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    /**
     * Get <p>&quot;git&quot; &quot;github&quot; &quot;gitlab&quot; &quot;gitee&quot; &quot;coding&quot;；私有仓必填，平台据此走 OAuth 鉴权</p> 
     * @return Channel <p>&quot;git&quot; &quot;github&quot; &quot;gitlab&quot; &quot;gitee&quot; &quot;coding&quot;；私有仓必填，平台据此走 OAuth 鉴权</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>&quot;git&quot; &quot;github&quot; &quot;gitlab&quot; &quot;gitee&quot; &quot;coding&quot;；私有仓必填，平台据此走 OAuth 鉴权</p>
     * @param Channel <p>&quot;git&quot; &quot;github&quot; &quot;gitlab&quot; &quot;gitee&quot; &quot;coding&quot;；私有仓必填，平台据此走 OAuth 鉴权</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>是否私有仓；true 时平台自动注入 CodeUrlWithAuth</p> 
     * @return IsPrivate <p>是否私有仓；true 时平台自动注入 CodeUrlWithAuth</p>
     */
    public Boolean getIsPrivate() {
        return this.IsPrivate;
    }

    /**
     * Set <p>是否私有仓；true 时平台自动注入 CodeUrlWithAuth</p>
     * @param IsPrivate <p>是否私有仓；true 时平台自动注入 CodeUrlWithAuth</p>
     */
    public void setIsPrivate(Boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
    }

    /**
     * Get <p>调用方显式传入的带鉴权 clone URL 或带签名的 zip 下载直链（优先级最高，会覆盖平台 OAuth / 自动签名）</p> 
     * @return CodeUrlWithAuth <p>调用方显式传入的带鉴权 clone URL 或带签名的 zip 下载直链（优先级最高，会覆盖平台 OAuth / 自动签名）</p>
     */
    public String getCodeUrlWithAuth() {
        return this.CodeUrlWithAuth;
    }

    /**
     * Set <p>调用方显式传入的带鉴权 clone URL 或带签名的 zip 下载直链（优先级最高，会覆盖平台 OAuth / 自动签名）</p>
     * @param CodeUrlWithAuth <p>调用方显式传入的带鉴权 clone URL 或带签名的 zip 下载直链（优先级最高，会覆盖平台 OAuth / 自动签名）</p>
     */
    public void setCodeUrlWithAuth(String CodeUrlWithAuth) {
        this.CodeUrlWithAuth = CodeUrlWithAuth;
    }

    /**
     * Get <p>仅 Type=zip/cos 时使用。配合 zip 二阶段上传：填 DescribeCloudAppCosInfo 返回的 UnixTimestamp，平台据此自动签名出 ZIP_FILE_URL</p> 
     * @return CosTimestamp <p>仅 Type=zip/cos 时使用。配合 zip 二阶段上传：填 DescribeCloudAppCosInfo 返回的 UnixTimestamp，平台据此自动签名出 ZIP_FILE_URL</p>
     */
    public String getCosTimestamp() {
        return this.CosTimestamp;
    }

    /**
     * Set <p>仅 Type=zip/cos 时使用。配合 zip 二阶段上传：填 DescribeCloudAppCosInfo 返回的 UnixTimestamp，平台据此自动签名出 ZIP_FILE_URL</p>
     * @param CosTimestamp <p>仅 Type=zip/cos 时使用。配合 zip 二阶段上传：填 DescribeCloudAppCosInfo 返回的 UnixTimestamp，平台据此自动签名出 ZIP_FILE_URL</p>
     */
    public void setCosTimestamp(String CosTimestamp) {
        this.CosTimestamp = CosTimestamp;
    }

    /**
     * Get <p>仅 Type=zip/cos 时使用。zip 文件后缀，默认 .zip；与 CosTimestamp 配合定位 COS 对象</p> 
     * @return CosSuffix <p>仅 Type=zip/cos 时使用。zip 文件后缀，默认 .zip；与 CosTimestamp 配合定位 COS 对象</p>
     */
    public String getCosSuffix() {
        return this.CosSuffix;
    }

    /**
     * Set <p>仅 Type=zip/cos 时使用。zip 文件后缀，默认 .zip；与 CosTimestamp 配合定位 COS 对象</p>
     * @param CosSuffix <p>仅 Type=zip/cos 时使用。zip 文件后缀，默认 .zip；与 CosTimestamp 配合定位 COS 对象</p>
     */
    public void setCosSuffix(String CosSuffix) {
        this.CosSuffix = CosSuffix;
    }

    public BuildSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildSource(BuildSource source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.Ref != null) {
            this.Ref = new String(source.Ref);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.IsPrivate != null) {
            this.IsPrivate = new Boolean(source.IsPrivate);
        }
        if (source.CodeUrlWithAuth != null) {
            this.CodeUrlWithAuth = new String(source.CodeUrlWithAuth);
        }
        if (source.CosTimestamp != null) {
            this.CosTimestamp = new String(source.CosTimestamp);
        }
        if (source.CosSuffix != null) {
            this.CosSuffix = new String(source.CosSuffix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "Ref", this.Ref);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "IsPrivate", this.IsPrivate);
        this.setParamSimple(map, prefix + "CodeUrlWithAuth", this.CodeUrlWithAuth);
        this.setParamSimple(map, prefix + "CosTimestamp", this.CosTimestamp);
        this.setParamSimple(map, prefix + "CosSuffix", this.CosSuffix);

    }
}

