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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailFieldMappingInput extends AbstractModel {

    /**
    * <p>必填。命中字段的点分隔对象路径，例如 decision 或 result.blocked；不支持数组下标、JSONPath 或通配符。</p>
    */
    @SerializedName("HitFieldPath")
    @Expose
    private String HitFieldPath;

    /**
    * <p>必填，API 类型为 string。可填写 JSON 字符串、数字或布尔标量文本，也接受 block 等非空普通文本并规范化为 JSON 字符串。示例：block 或 "block" 匹配字符串，true 匹配布尔值，0 匹配数字。null、对象、数组和空白文本不支持；类型不同不视为普通未命中。</p>
    */
    @SerializedName("HitValue")
    @Expose
    private String HitValue;

    /**
    * <p>BlockMessageMode=response 时必填，例如 message 或 result.message；读取结果应为 1～512 字符的字符串，否则使用兜底文案。</p>
    */
    @SerializedName("MessageFieldPath")
    @Expose
    private String MessageFieldPath;

    /**
    * <p>RewriteEnabled=true 时必填，例如 content.body；仅输出审核读取。字段存在即优先 replace，与命中值是否相等无关。JSON 替换值应是完整业务 JSON；SSE 必须是以空行结束的完整事件文本，替换当前未发送的 event_batch，不是整个流或某个 TCP chunk。输入不替换。</p>
    */
    @SerializedName("RewriteFieldPath")
    @Expose
    private String RewriteFieldPath;

    /**
     * Get <p>必填。命中字段的点分隔对象路径，例如 decision 或 result.blocked；不支持数组下标、JSONPath 或通配符。</p> 
     * @return HitFieldPath <p>必填。命中字段的点分隔对象路径，例如 decision 或 result.blocked；不支持数组下标、JSONPath 或通配符。</p>
     */
    public String getHitFieldPath() {
        return this.HitFieldPath;
    }

    /**
     * Set <p>必填。命中字段的点分隔对象路径，例如 decision 或 result.blocked；不支持数组下标、JSONPath 或通配符。</p>
     * @param HitFieldPath <p>必填。命中字段的点分隔对象路径，例如 decision 或 result.blocked；不支持数组下标、JSONPath 或通配符。</p>
     */
    public void setHitFieldPath(String HitFieldPath) {
        this.HitFieldPath = HitFieldPath;
    }

    /**
     * Get <p>必填，API 类型为 string。可填写 JSON 字符串、数字或布尔标量文本，也接受 block 等非空普通文本并规范化为 JSON 字符串。示例：block 或 "block" 匹配字符串，true 匹配布尔值，0 匹配数字。null、对象、数组和空白文本不支持；类型不同不视为普通未命中。</p> 
     * @return HitValue <p>必填，API 类型为 string。可填写 JSON 字符串、数字或布尔标量文本，也接受 block 等非空普通文本并规范化为 JSON 字符串。示例：block 或 "block" 匹配字符串，true 匹配布尔值，0 匹配数字。null、对象、数组和空白文本不支持；类型不同不视为普通未命中。</p>
     */
    public String getHitValue() {
        return this.HitValue;
    }

    /**
     * Set <p>必填，API 类型为 string。可填写 JSON 字符串、数字或布尔标量文本，也接受 block 等非空普通文本并规范化为 JSON 字符串。示例：block 或 "block" 匹配字符串，true 匹配布尔值，0 匹配数字。null、对象、数组和空白文本不支持；类型不同不视为普通未命中。</p>
     * @param HitValue <p>必填，API 类型为 string。可填写 JSON 字符串、数字或布尔标量文本，也接受 block 等非空普通文本并规范化为 JSON 字符串。示例：block 或 "block" 匹配字符串，true 匹配布尔值，0 匹配数字。null、对象、数组和空白文本不支持；类型不同不视为普通未命中。</p>
     */
    public void setHitValue(String HitValue) {
        this.HitValue = HitValue;
    }

    /**
     * Get <p>BlockMessageMode=response 时必填，例如 message 或 result.message；读取结果应为 1～512 字符的字符串，否则使用兜底文案。</p> 
     * @return MessageFieldPath <p>BlockMessageMode=response 时必填，例如 message 或 result.message；读取结果应为 1～512 字符的字符串，否则使用兜底文案。</p>
     */
    public String getMessageFieldPath() {
        return this.MessageFieldPath;
    }

    /**
     * Set <p>BlockMessageMode=response 时必填，例如 message 或 result.message；读取结果应为 1～512 字符的字符串，否则使用兜底文案。</p>
     * @param MessageFieldPath <p>BlockMessageMode=response 时必填，例如 message 或 result.message；读取结果应为 1～512 字符的字符串，否则使用兜底文案。</p>
     */
    public void setMessageFieldPath(String MessageFieldPath) {
        this.MessageFieldPath = MessageFieldPath;
    }

    /**
     * Get <p>RewriteEnabled=true 时必填，例如 content.body；仅输出审核读取。字段存在即优先 replace，与命中值是否相等无关。JSON 替换值应是完整业务 JSON；SSE 必须是以空行结束的完整事件文本，替换当前未发送的 event_batch，不是整个流或某个 TCP chunk。输入不替换。</p> 
     * @return RewriteFieldPath <p>RewriteEnabled=true 时必填，例如 content.body；仅输出审核读取。字段存在即优先 replace，与命中值是否相等无关。JSON 替换值应是完整业务 JSON；SSE 必须是以空行结束的完整事件文本，替换当前未发送的 event_batch，不是整个流或某个 TCP chunk。输入不替换。</p>
     */
    public String getRewriteFieldPath() {
        return this.RewriteFieldPath;
    }

    /**
     * Set <p>RewriteEnabled=true 时必填，例如 content.body；仅输出审核读取。字段存在即优先 replace，与命中值是否相等无关。JSON 替换值应是完整业务 JSON；SSE 必须是以空行结束的完整事件文本，替换当前未发送的 event_batch，不是整个流或某个 TCP chunk。输入不替换。</p>
     * @param RewriteFieldPath <p>RewriteEnabled=true 时必填，例如 content.body；仅输出审核读取。字段存在即优先 replace，与命中值是否相等无关。JSON 替换值应是完整业务 JSON；SSE 必须是以空行结束的完整事件文本，替换当前未发送的 event_batch，不是整个流或某个 TCP chunk。输入不替换。</p>
     */
    public void setRewriteFieldPath(String RewriteFieldPath) {
        this.RewriteFieldPath = RewriteFieldPath;
    }

    public CustomGuardrailFieldMappingInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailFieldMappingInput(CustomGuardrailFieldMappingInput source) {
        if (source.HitFieldPath != null) {
            this.HitFieldPath = new String(source.HitFieldPath);
        }
        if (source.HitValue != null) {
            this.HitValue = new String(source.HitValue);
        }
        if (source.MessageFieldPath != null) {
            this.MessageFieldPath = new String(source.MessageFieldPath);
        }
        if (source.RewriteFieldPath != null) {
            this.RewriteFieldPath = new String(source.RewriteFieldPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitFieldPath", this.HitFieldPath);
        this.setParamSimple(map, prefix + "HitValue", this.HitValue);
        this.setParamSimple(map, prefix + "MessageFieldPath", this.MessageFieldPath);
        this.setParamSimple(map, prefix + "RewriteFieldPath", this.RewriteFieldPath);

    }
}

