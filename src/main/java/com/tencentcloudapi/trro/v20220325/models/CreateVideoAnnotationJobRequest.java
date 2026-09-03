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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoAnnotationJobRequest extends AbstractModel {

    /**
    * <p>输入源类型：1 S3 兼容存储，2 HTTP URL</p><p>枚举值：</p><ul><li>1： S3 兼容存储</li><li>2： HTTP URL</li></ul>
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
    * <p>标注模式（当前仅开放精标注）</p><p>枚举值：</p><ul><li>3： 精标注</li></ul>
    */
    @SerializedName("AnnotationType")
    @Expose
    private Long AnnotationType;

    /**
    * <p>S3 存储输入源信息，InputType=1 时必填</p>
    */
    @SerializedName("S3SourceInfo")
    @Expose
    private S3SourceInfo S3SourceInfo;

    /**
    * <p>视频 HTTP URL。InputType=2 时必填。格式如 https://example.com/video.mp4</p>
    */
    @SerializedName("HttpUrl")
    @Expose
    private String HttpUrl;

    /**
    * <p>标注上下文信息</p>
    */
    @SerializedName("AnnotationContext")
    @Expose
    private AnnotationContext AnnotationContext;

    /**
    * <p>标注处理参数，预留字段，当前无效</p>
    */
    @SerializedName("ProcessParams")
    @Expose
    private ProcessParams ProcessParams;

    /**
    * <p>结果输出信息</p>
    */
    @SerializedName("OutputInfo")
    @Expose
    private OutputInfo OutputInfo;

    /**
    * <p>回调信息，配置后当处理项状态从处理中变为其他状态时，服务端会向回调地址发送请求（退避重试三次，不保证回调一定送达，需保证目标地址接收服务有效），建议接收方做好幂等处理。回调请求格式如下：<br><strong>请求头</strong></p><table><thead><tr><th>名称</th><th>值</th></tr></thead><tbody><tr><td>X-Annotation-Signature</td><td>hex(HMAC-SHA256(请求体原始字节, CallbackInfo.Secret))</td></tr></tbody></table><p><strong>请求体</strong>（application/json）</p><table><thead><tr><th>参数名</th><th>类型</th><th>必选</th><th>描述</th></tr></thead><tbody><tr><td>JobId</td><td>string</td><td>是</td><td>任务 ID</td></tr><tr><td>TaskId</td><td>string</td><td>是</td><td>处理项 ID</td></tr><tr><td>FileName</td><td>string</td><td>是</td><td>视频文件名</td></tr><tr><td>Status</td><td>int</td><td>是</td><td>触发本次回调的处理项状态：3 超时，4 异常，5 待确认，6 成功</td></tr><tr><td>StatusChangedAt</td><td>int</td><td>是</td><td>状态变更时间，Unix 时间戳（秒）</td></tr><tr><td>RawResult</td><td>string</td><td>否</td><td>当前生效的结果 JSON 原文：成功=标注产物；待确认=原始标注；确认后=确认版内容。超时/异常无内容</td></tr></tbody></table>
    */
    @SerializedName("CallbackInfo")
    @Expose
    private CallbackInfo CallbackInfo;

    /**
     * Get <p>输入源类型：1 S3 兼容存储，2 HTTP URL</p><p>枚举值：</p><ul><li>1： S3 兼容存储</li><li>2： HTTP URL</li></ul> 
     * @return InputType <p>输入源类型：1 S3 兼容存储，2 HTTP URL</p><p>枚举值：</p><ul><li>1： S3 兼容存储</li><li>2： HTTP URL</li></ul>
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * Set <p>输入源类型：1 S3 兼容存储，2 HTTP URL</p><p>枚举值：</p><ul><li>1： S3 兼容存储</li><li>2： HTTP URL</li></ul>
     * @param InputType <p>输入源类型：1 S3 兼容存储，2 HTTP URL</p><p>枚举值：</p><ul><li>1： S3 兼容存储</li><li>2： HTTP URL</li></ul>
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * Get <p>标注模式（当前仅开放精标注）</p><p>枚举值：</p><ul><li>3： 精标注</li></ul> 
     * @return AnnotationType <p>标注模式（当前仅开放精标注）</p><p>枚举值：</p><ul><li>3： 精标注</li></ul>
     */
    public Long getAnnotationType() {
        return this.AnnotationType;
    }

    /**
     * Set <p>标注模式（当前仅开放精标注）</p><p>枚举值：</p><ul><li>3： 精标注</li></ul>
     * @param AnnotationType <p>标注模式（当前仅开放精标注）</p><p>枚举值：</p><ul><li>3： 精标注</li></ul>
     */
    public void setAnnotationType(Long AnnotationType) {
        this.AnnotationType = AnnotationType;
    }

    /**
     * Get <p>S3 存储输入源信息，InputType=1 时必填</p> 
     * @return S3SourceInfo <p>S3 存储输入源信息，InputType=1 时必填</p>
     */
    public S3SourceInfo getS3SourceInfo() {
        return this.S3SourceInfo;
    }

    /**
     * Set <p>S3 存储输入源信息，InputType=1 时必填</p>
     * @param S3SourceInfo <p>S3 存储输入源信息，InputType=1 时必填</p>
     */
    public void setS3SourceInfo(S3SourceInfo S3SourceInfo) {
        this.S3SourceInfo = S3SourceInfo;
    }

    /**
     * Get <p>视频 HTTP URL。InputType=2 时必填。格式如 https://example.com/video.mp4</p> 
     * @return HttpUrl <p>视频 HTTP URL。InputType=2 时必填。格式如 https://example.com/video.mp4</p>
     */
    public String getHttpUrl() {
        return this.HttpUrl;
    }

    /**
     * Set <p>视频 HTTP URL。InputType=2 时必填。格式如 https://example.com/video.mp4</p>
     * @param HttpUrl <p>视频 HTTP URL。InputType=2 时必填。格式如 https://example.com/video.mp4</p>
     */
    public void setHttpUrl(String HttpUrl) {
        this.HttpUrl = HttpUrl;
    }

    /**
     * Get <p>标注上下文信息</p> 
     * @return AnnotationContext <p>标注上下文信息</p>
     */
    public AnnotationContext getAnnotationContext() {
        return this.AnnotationContext;
    }

    /**
     * Set <p>标注上下文信息</p>
     * @param AnnotationContext <p>标注上下文信息</p>
     */
    public void setAnnotationContext(AnnotationContext AnnotationContext) {
        this.AnnotationContext = AnnotationContext;
    }

    /**
     * Get <p>标注处理参数，预留字段，当前无效</p> 
     * @return ProcessParams <p>标注处理参数，预留字段，当前无效</p>
     */
    public ProcessParams getProcessParams() {
        return this.ProcessParams;
    }

    /**
     * Set <p>标注处理参数，预留字段，当前无效</p>
     * @param ProcessParams <p>标注处理参数，预留字段，当前无效</p>
     */
    public void setProcessParams(ProcessParams ProcessParams) {
        this.ProcessParams = ProcessParams;
    }

    /**
     * Get <p>结果输出信息</p> 
     * @return OutputInfo <p>结果输出信息</p>
     */
    public OutputInfo getOutputInfo() {
        return this.OutputInfo;
    }

    /**
     * Set <p>结果输出信息</p>
     * @param OutputInfo <p>结果输出信息</p>
     */
    public void setOutputInfo(OutputInfo OutputInfo) {
        this.OutputInfo = OutputInfo;
    }

    /**
     * Get <p>回调信息，配置后当处理项状态从处理中变为其他状态时，服务端会向回调地址发送请求（退避重试三次，不保证回调一定送达，需保证目标地址接收服务有效），建议接收方做好幂等处理。回调请求格式如下：<br><strong>请求头</strong></p><table><thead><tr><th>名称</th><th>值</th></tr></thead><tbody><tr><td>X-Annotation-Signature</td><td>hex(HMAC-SHA256(请求体原始字节, CallbackInfo.Secret))</td></tr></tbody></table><p><strong>请求体</strong>（application/json）</p><table><thead><tr><th>参数名</th><th>类型</th><th>必选</th><th>描述</th></tr></thead><tbody><tr><td>JobId</td><td>string</td><td>是</td><td>任务 ID</td></tr><tr><td>TaskId</td><td>string</td><td>是</td><td>处理项 ID</td></tr><tr><td>FileName</td><td>string</td><td>是</td><td>视频文件名</td></tr><tr><td>Status</td><td>int</td><td>是</td><td>触发本次回调的处理项状态：3 超时，4 异常，5 待确认，6 成功</td></tr><tr><td>StatusChangedAt</td><td>int</td><td>是</td><td>状态变更时间，Unix 时间戳（秒）</td></tr><tr><td>RawResult</td><td>string</td><td>否</td><td>当前生效的结果 JSON 原文：成功=标注产物；待确认=原始标注；确认后=确认版内容。超时/异常无内容</td></tr></tbody></table> 
     * @return CallbackInfo <p>回调信息，配置后当处理项状态从处理中变为其他状态时，服务端会向回调地址发送请求（退避重试三次，不保证回调一定送达，需保证目标地址接收服务有效），建议接收方做好幂等处理。回调请求格式如下：<br><strong>请求头</strong></p><table><thead><tr><th>名称</th><th>值</th></tr></thead><tbody><tr><td>X-Annotation-Signature</td><td>hex(HMAC-SHA256(请求体原始字节, CallbackInfo.Secret))</td></tr></tbody></table><p><strong>请求体</strong>（application/json）</p><table><thead><tr><th>参数名</th><th>类型</th><th>必选</th><th>描述</th></tr></thead><tbody><tr><td>JobId</td><td>string</td><td>是</td><td>任务 ID</td></tr><tr><td>TaskId</td><td>string</td><td>是</td><td>处理项 ID</td></tr><tr><td>FileName</td><td>string</td><td>是</td><td>视频文件名</td></tr><tr><td>Status</td><td>int</td><td>是</td><td>触发本次回调的处理项状态：3 超时，4 异常，5 待确认，6 成功</td></tr><tr><td>StatusChangedAt</td><td>int</td><td>是</td><td>状态变更时间，Unix 时间戳（秒）</td></tr><tr><td>RawResult</td><td>string</td><td>否</td><td>当前生效的结果 JSON 原文：成功=标注产物；待确认=原始标注；确认后=确认版内容。超时/异常无内容</td></tr></tbody></table>
     */
    public CallbackInfo getCallbackInfo() {
        return this.CallbackInfo;
    }

    /**
     * Set <p>回调信息，配置后当处理项状态从处理中变为其他状态时，服务端会向回调地址发送请求（退避重试三次，不保证回调一定送达，需保证目标地址接收服务有效），建议接收方做好幂等处理。回调请求格式如下：<br><strong>请求头</strong></p><table><thead><tr><th>名称</th><th>值</th></tr></thead><tbody><tr><td>X-Annotation-Signature</td><td>hex(HMAC-SHA256(请求体原始字节, CallbackInfo.Secret))</td></tr></tbody></table><p><strong>请求体</strong>（application/json）</p><table><thead><tr><th>参数名</th><th>类型</th><th>必选</th><th>描述</th></tr></thead><tbody><tr><td>JobId</td><td>string</td><td>是</td><td>任务 ID</td></tr><tr><td>TaskId</td><td>string</td><td>是</td><td>处理项 ID</td></tr><tr><td>FileName</td><td>string</td><td>是</td><td>视频文件名</td></tr><tr><td>Status</td><td>int</td><td>是</td><td>触发本次回调的处理项状态：3 超时，4 异常，5 待确认，6 成功</td></tr><tr><td>StatusChangedAt</td><td>int</td><td>是</td><td>状态变更时间，Unix 时间戳（秒）</td></tr><tr><td>RawResult</td><td>string</td><td>否</td><td>当前生效的结果 JSON 原文：成功=标注产物；待确认=原始标注；确认后=确认版内容。超时/异常无内容</td></tr></tbody></table>
     * @param CallbackInfo <p>回调信息，配置后当处理项状态从处理中变为其他状态时，服务端会向回调地址发送请求（退避重试三次，不保证回调一定送达，需保证目标地址接收服务有效），建议接收方做好幂等处理。回调请求格式如下：<br><strong>请求头</strong></p><table><thead><tr><th>名称</th><th>值</th></tr></thead><tbody><tr><td>X-Annotation-Signature</td><td>hex(HMAC-SHA256(请求体原始字节, CallbackInfo.Secret))</td></tr></tbody></table><p><strong>请求体</strong>（application/json）</p><table><thead><tr><th>参数名</th><th>类型</th><th>必选</th><th>描述</th></tr></thead><tbody><tr><td>JobId</td><td>string</td><td>是</td><td>任务 ID</td></tr><tr><td>TaskId</td><td>string</td><td>是</td><td>处理项 ID</td></tr><tr><td>FileName</td><td>string</td><td>是</td><td>视频文件名</td></tr><tr><td>Status</td><td>int</td><td>是</td><td>触发本次回调的处理项状态：3 超时，4 异常，5 待确认，6 成功</td></tr><tr><td>StatusChangedAt</td><td>int</td><td>是</td><td>状态变更时间，Unix 时间戳（秒）</td></tr><tr><td>RawResult</td><td>string</td><td>否</td><td>当前生效的结果 JSON 原文：成功=标注产物；待确认=原始标注；确认后=确认版内容。超时/异常无内容</td></tr></tbody></table>
     */
    public void setCallbackInfo(CallbackInfo CallbackInfo) {
        this.CallbackInfo = CallbackInfo;
    }

    public CreateVideoAnnotationJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoAnnotationJobRequest(CreateVideoAnnotationJobRequest source) {
        if (source.InputType != null) {
            this.InputType = new Long(source.InputType);
        }
        if (source.AnnotationType != null) {
            this.AnnotationType = new Long(source.AnnotationType);
        }
        if (source.S3SourceInfo != null) {
            this.S3SourceInfo = new S3SourceInfo(source.S3SourceInfo);
        }
        if (source.HttpUrl != null) {
            this.HttpUrl = new String(source.HttpUrl);
        }
        if (source.AnnotationContext != null) {
            this.AnnotationContext = new AnnotationContext(source.AnnotationContext);
        }
        if (source.ProcessParams != null) {
            this.ProcessParams = new ProcessParams(source.ProcessParams);
        }
        if (source.OutputInfo != null) {
            this.OutputInfo = new OutputInfo(source.OutputInfo);
        }
        if (source.CallbackInfo != null) {
            this.CallbackInfo = new CallbackInfo(source.CallbackInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "AnnotationType", this.AnnotationType);
        this.setParamObj(map, prefix + "S3SourceInfo.", this.S3SourceInfo);
        this.setParamSimple(map, prefix + "HttpUrl", this.HttpUrl);
        this.setParamObj(map, prefix + "AnnotationContext.", this.AnnotationContext);
        this.setParamObj(map, prefix + "ProcessParams.", this.ProcessParams);
        this.setParamObj(map, prefix + "OutputInfo.", this.OutputInfo);
        this.setParamObj(map, prefix + "CallbackInfo.", this.CallbackInfo);

    }
}

