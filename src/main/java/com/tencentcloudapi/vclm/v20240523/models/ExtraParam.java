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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraParam extends AbstractModel {

    /**
    * <p>预签名的上传url，支持把视频直接传到客户指定的地址。</p>
    */
    @SerializedName("UserDesignatedUrl")
    @Expose
    private String UserDesignatedUrl;

    /**
    * <p>回调地址<br>需要您在创建任务时主动设置 CallbackUrl，请求方法为 POST，当视频生成结束时，我们将向此地址发送生成结果。<br>数据格式如下：<br>{<br>    &quot;JobId&quot;: &quot;1397428070633955328&quot;,<br>    &quot;Status&quot;: &quot;DONE&quot;,<br>    &quot;ErrorCode&quot;: &quot;&quot;,<br>    &quot;ErrorMessage&quot;: &quot;&quot;,<br>    &quot;ResultVideoUrl&quot;: &quot;https://vcg.cos.tencentcos.cn/template_to_video/fa80b846-b933-4981-afad-8a39b46ef2ca.mp4&quot;<br>}</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>BGM音频文本。</p>
    */
    @SerializedName("BGMText")
    @Expose
    private String BGMText;

    /**
     * Get <p>预签名的上传url，支持把视频直接传到客户指定的地址。</p> 
     * @return UserDesignatedUrl <p>预签名的上传url，支持把视频直接传到客户指定的地址。</p>
     */
    public String getUserDesignatedUrl() {
        return this.UserDesignatedUrl;
    }

    /**
     * Set <p>预签名的上传url，支持把视频直接传到客户指定的地址。</p>
     * @param UserDesignatedUrl <p>预签名的上传url，支持把视频直接传到客户指定的地址。</p>
     */
    public void setUserDesignatedUrl(String UserDesignatedUrl) {
        this.UserDesignatedUrl = UserDesignatedUrl;
    }

    /**
     * Get <p>回调地址<br>需要您在创建任务时主动设置 CallbackUrl，请求方法为 POST，当视频生成结束时，我们将向此地址发送生成结果。<br>数据格式如下：<br>{<br>    &quot;JobId&quot;: &quot;1397428070633955328&quot;,<br>    &quot;Status&quot;: &quot;DONE&quot;,<br>    &quot;ErrorCode&quot;: &quot;&quot;,<br>    &quot;ErrorMessage&quot;: &quot;&quot;,<br>    &quot;ResultVideoUrl&quot;: &quot;https://vcg.cos.tencentcos.cn/template_to_video/fa80b846-b933-4981-afad-8a39b46ef2ca.mp4&quot;<br>}</p> 
     * @return CallbackUrl <p>回调地址<br>需要您在创建任务时主动设置 CallbackUrl，请求方法为 POST，当视频生成结束时，我们将向此地址发送生成结果。<br>数据格式如下：<br>{<br>    &quot;JobId&quot;: &quot;1397428070633955328&quot;,<br>    &quot;Status&quot;: &quot;DONE&quot;,<br>    &quot;ErrorCode&quot;: &quot;&quot;,<br>    &quot;ErrorMessage&quot;: &quot;&quot;,<br>    &quot;ResultVideoUrl&quot;: &quot;https://vcg.cos.tencentcos.cn/template_to_video/fa80b846-b933-4981-afad-8a39b46ef2ca.mp4&quot;<br>}</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调地址<br>需要您在创建任务时主动设置 CallbackUrl，请求方法为 POST，当视频生成结束时，我们将向此地址发送生成结果。<br>数据格式如下：<br>{<br>    &quot;JobId&quot;: &quot;1397428070633955328&quot;,<br>    &quot;Status&quot;: &quot;DONE&quot;,<br>    &quot;ErrorCode&quot;: &quot;&quot;,<br>    &quot;ErrorMessage&quot;: &quot;&quot;,<br>    &quot;ResultVideoUrl&quot;: &quot;https://vcg.cos.tencentcos.cn/template_to_video/fa80b846-b933-4981-afad-8a39b46ef2ca.mp4&quot;<br>}</p>
     * @param CallbackUrl <p>回调地址<br>需要您在创建任务时主动设置 CallbackUrl，请求方法为 POST，当视频生成结束时，我们将向此地址发送生成结果。<br>数据格式如下：<br>{<br>    &quot;JobId&quot;: &quot;1397428070633955328&quot;,<br>    &quot;Status&quot;: &quot;DONE&quot;,<br>    &quot;ErrorCode&quot;: &quot;&quot;,<br>    &quot;ErrorMessage&quot;: &quot;&quot;,<br>    &quot;ResultVideoUrl&quot;: &quot;https://vcg.cos.tencentcos.cn/template_to_video/fa80b846-b933-4981-afad-8a39b46ef2ca.mp4&quot;<br>}</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>BGM音频文本。</p> 
     * @return BGMText <p>BGM音频文本。</p>
     */
    public String getBGMText() {
        return this.BGMText;
    }

    /**
     * Set <p>BGM音频文本。</p>
     * @param BGMText <p>BGM音频文本。</p>
     */
    public void setBGMText(String BGMText) {
        this.BGMText = BGMText;
    }

    public ExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraParam(ExtraParam source) {
        if (source.UserDesignatedUrl != null) {
            this.UserDesignatedUrl = new String(source.UserDesignatedUrl);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.BGMText != null) {
            this.BGMText = new String(source.BGMText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserDesignatedUrl", this.UserDesignatedUrl);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "BGMText", this.BGMText);

    }
}

