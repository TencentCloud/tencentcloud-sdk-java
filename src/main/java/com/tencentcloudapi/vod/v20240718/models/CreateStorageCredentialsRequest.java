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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStorageCredentialsRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 按照下方语法组装好策略后，先序列化为字符串，再做 urlencode，结果作为 Policy 字段入参。服务端会对该字段做 urldecode，并按解析后的策略授予临时访问凭证权限，请按规范传入参数。
注意： 
1.策略语法参照[访问管理策略](/document/product/598/10603)。
2.策略中不能包含 principal 元素。
3.策略的 action 元素仅支持：<li>name/vod:PutObject;</li><li>name/vod:ListParts;</li><li>name/vod:PostObject;</li><li>name/vod:InitiateMultipartUpload;</li><li>name/vod:UploadPart;</li><li>name/vod:CompleteMultipartUpload;</li><li>name/vod:AbortMultipartUpload;</li><li>name/vod:ListMultipartUploads;</li>4.策略的 resource 元素填写格式为：qcs::vod::uid/[账号AppID]:prefix//[子应用ID]/[存储桶ID]/[存储路径]，其中账号AppID、子应用ID、存储桶ID和存储路径要按需填写，其他内容不允许改动，例：qcs::vod::uid/1:prefix//1/1/path。

    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 指定临时证书的有效期，单位：秒。
默认 1800 秒，最大 129600 秒。
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 按照下方语法组装好策略后，先序列化为字符串，再做 urlencode，结果作为 Policy 字段入参。服务端会对该字段做 urldecode，并按解析后的策略授予临时访问凭证权限，请按规范传入参数。
注意： 
1.策略语法参照[访问管理策略](/document/product/598/10603)。
2.策略中不能包含 principal 元素。
3.策略的 action 元素仅支持：<li>name/vod:PutObject;</li><li>name/vod:ListParts;</li><li>name/vod:PostObject;</li><li>name/vod:InitiateMultipartUpload;</li><li>name/vod:UploadPart;</li><li>name/vod:CompleteMultipartUpload;</li><li>name/vod:AbortMultipartUpload;</li><li>name/vod:ListMultipartUploads;</li>4.策略的 resource 元素填写格式为：qcs::vod::uid/[账号AppID]:prefix//[子应用ID]/[存储桶ID]/[存储路径]，其中账号AppID、子应用ID、存储桶ID和存储路径要按需填写，其他内容不允许改动，例：qcs::vod::uid/1:prefix//1/1/path。
 
     * @return Policy 按照下方语法组装好策略后，先序列化为字符串，再做 urlencode，结果作为 Policy 字段入参。服务端会对该字段做 urldecode，并按解析后的策略授予临时访问凭证权限，请按规范传入参数。
注意： 
1.策略语法参照[访问管理策略](/document/product/598/10603)。
2.策略中不能包含 principal 元素。
3.策略的 action 元素仅支持：<li>name/vod:PutObject;</li><li>name/vod:ListParts;</li><li>name/vod:PostObject;</li><li>name/vod:InitiateMultipartUpload;</li><li>name/vod:UploadPart;</li><li>name/vod:CompleteMultipartUpload;</li><li>name/vod:AbortMultipartUpload;</li><li>name/vod:ListMultipartUploads;</li>4.策略的 resource 元素填写格式为：qcs::vod::uid/[账号AppID]:prefix//[子应用ID]/[存储桶ID]/[存储路径]，其中账号AppID、子应用ID、存储桶ID和存储路径要按需填写，其他内容不允许改动，例：qcs::vod::uid/1:prefix//1/1/path。

     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 按照下方语法组装好策略后，先序列化为字符串，再做 urlencode，结果作为 Policy 字段入参。服务端会对该字段做 urldecode，并按解析后的策略授予临时访问凭证权限，请按规范传入参数。
注意： 
1.策略语法参照[访问管理策略](/document/product/598/10603)。
2.策略中不能包含 principal 元素。
3.策略的 action 元素仅支持：<li>name/vod:PutObject;</li><li>name/vod:ListParts;</li><li>name/vod:PostObject;</li><li>name/vod:InitiateMultipartUpload;</li><li>name/vod:UploadPart;</li><li>name/vod:CompleteMultipartUpload;</li><li>name/vod:AbortMultipartUpload;</li><li>name/vod:ListMultipartUploads;</li>4.策略的 resource 元素填写格式为：qcs::vod::uid/[账号AppID]:prefix//[子应用ID]/[存储桶ID]/[存储路径]，其中账号AppID、子应用ID、存储桶ID和存储路径要按需填写，其他内容不允许改动，例：qcs::vod::uid/1:prefix//1/1/path。

     * @param Policy 按照下方语法组装好策略后，先序列化为字符串，再做 urlencode，结果作为 Policy 字段入参。服务端会对该字段做 urldecode，并按解析后的策略授予临时访问凭证权限，请按规范传入参数。
注意： 
1.策略语法参照[访问管理策略](/document/product/598/10603)。
2.策略中不能包含 principal 元素。
3.策略的 action 元素仅支持：<li>name/vod:PutObject;</li><li>name/vod:ListParts;</li><li>name/vod:PostObject;</li><li>name/vod:InitiateMultipartUpload;</li><li>name/vod:UploadPart;</li><li>name/vod:CompleteMultipartUpload;</li><li>name/vod:AbortMultipartUpload;</li><li>name/vod:ListMultipartUploads;</li>4.策略的 resource 元素填写格式为：qcs::vod::uid/[账号AppID]:prefix//[子应用ID]/[存储桶ID]/[存储路径]，其中账号AppID、子应用ID、存储桶ID和存储路径要按需填写，其他内容不允许改动，例：qcs::vod::uid/1:prefix//1/1/path。

     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 指定临时证书的有效期，单位：秒。
默认 1800 秒，最大 129600 秒。 
     * @return DurationSeconds 指定临时证书的有效期，单位：秒。
默认 1800 秒，最大 129600 秒。
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 指定临时证书的有效期，单位：秒。
默认 1800 秒，最大 129600 秒。
     * @param DurationSeconds 指定临时证书的有效期，单位：秒。
默认 1800 秒，最大 129600 秒。
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public CreateStorageCredentialsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStorageCredentialsRequest(CreateStorageCredentialsRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

