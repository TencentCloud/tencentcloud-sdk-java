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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportMediaRequest extends AbstractModel {

    /**
    * <p>待分析视频的URL，目前只支持<em>不带签名的</em>COS地址，字段输入内容最大为1KB</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * <p>待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32</p>
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * <p>待分析视频的名称，指定后可支持筛选，视频名称的大小长度不能超过64</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>当非本人外部视频地址导入时，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。推荐采用本主账号COS桶，如果使用其他账号COS桶，请确保COS桶可写，否则可导致分析失败</p>
    */
    @SerializedName("WriteBackCosPath")
    @Expose
    private String WriteBackCosPath;

    /**
    * <p>自定义标签，可用于查询</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>媒资导入完成的回调地址，该设置优先级高于控制台全局的设置；</p>
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

    /**
    * <p>媒资文件类型，详细定义参见<a href="https://cloud.tencent.com/document/product/1509/65063#MediaPreknownInfo">MediaPreknownInfo.MediaType</a><br>默认为2(视频)</p>
    */
    @SerializedName("MediaType")
    @Expose
    private Long MediaType;

    /**
     * Get <p>待分析视频的URL，目前只支持<em>不带签名的</em>COS地址，字段输入内容最大为1KB</p> 
     * @return URL <p>待分析视频的URL，目前只支持<em>不带签名的</em>COS地址，字段输入内容最大为1KB</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>待分析视频的URL，目前只支持<em>不带签名的</em>COS地址，字段输入内容最大为1KB</p>
     * @param URL <p>待分析视频的URL，目前只支持<em>不带签名的</em>COS地址，字段输入内容最大为1KB</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get <p>待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32</p> 
     * @return MD5 <p>待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32</p>
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set <p>待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32</p>
     * @param MD5 <p>待分析视频的MD5，为空时不做校验，否则会做MD5校验，长度必须为32</p>
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get <p>待分析视频的名称，指定后可支持筛选，视频名称的大小长度不能超过64</p> 
     * @return Name <p>待分析视频的名称，指定后可支持筛选，视频名称的大小长度不能超过64</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>待分析视频的名称，指定后可支持筛选，视频名称的大小长度不能超过64</p>
     * @param Name <p>待分析视频的名称，指定后可支持筛选，视频名称的大小长度不能超过64</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>当非本人外部视频地址导入时，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。推荐采用本主账号COS桶，如果使用其他账号COS桶，请确保COS桶可写，否则可导致分析失败</p> 
     * @return WriteBackCosPath <p>当非本人外部视频地址导入时，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。推荐采用本主账号COS桶，如果使用其他账号COS桶，请确保COS桶可写，否则可导致分析失败</p>
     */
    public String getWriteBackCosPath() {
        return this.WriteBackCosPath;
    }

    /**
     * Set <p>当非本人外部视频地址导入时，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。推荐采用本主账号COS桶，如果使用其他账号COS桶，请确保COS桶可写，否则可导致分析失败</p>
     * @param WriteBackCosPath <p>当非本人外部视频地址导入时，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。推荐采用本主账号COS桶，如果使用其他账号COS桶，请确保COS桶可写，否则可导致分析失败</p>
     */
    public void setWriteBackCosPath(String WriteBackCosPath) {
        this.WriteBackCosPath = WriteBackCosPath;
    }

    /**
     * Get <p>自定义标签，可用于查询</p> 
     * @return Label <p>自定义标签，可用于查询</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>自定义标签，可用于查询</p>
     * @param Label <p>自定义标签，可用于查询</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>媒资导入完成的回调地址，该设置优先级高于控制台全局的设置；</p> 
     * @return CallbackURL <p>媒资导入完成的回调地址，该设置优先级高于控制台全局的设置；</p>
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set <p>媒资导入完成的回调地址，该设置优先级高于控制台全局的设置；</p>
     * @param CallbackURL <p>媒资导入完成的回调地址，该设置优先级高于控制台全局的设置；</p>
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    /**
     * Get <p>媒资文件类型，详细定义参见<a href="https://cloud.tencent.com/document/product/1509/65063#MediaPreknownInfo">MediaPreknownInfo.MediaType</a><br>默认为2(视频)</p> 
     * @return MediaType <p>媒资文件类型，详细定义参见<a href="https://cloud.tencent.com/document/product/1509/65063#MediaPreknownInfo">MediaPreknownInfo.MediaType</a><br>默认为2(视频)</p>
     */
    public Long getMediaType() {
        return this.MediaType;
    }

    /**
     * Set <p>媒资文件类型，详细定义参见<a href="https://cloud.tencent.com/document/product/1509/65063#MediaPreknownInfo">MediaPreknownInfo.MediaType</a><br>默认为2(视频)</p>
     * @param MediaType <p>媒资文件类型，详细定义参见<a href="https://cloud.tencent.com/document/product/1509/65063#MediaPreknownInfo">MediaPreknownInfo.MediaType</a><br>默认为2(视频)</p>
     */
    public void setMediaType(Long MediaType) {
        this.MediaType = MediaType;
    }

    public ImportMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportMediaRequest(ImportMediaRequest source) {
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.WriteBackCosPath != null) {
            this.WriteBackCosPath = new String(source.WriteBackCosPath);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
        if (source.MediaType != null) {
            this.MediaType = new Long(source.MediaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "WriteBackCosPath", this.WriteBackCosPath);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);

    }
}

