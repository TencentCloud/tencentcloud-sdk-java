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

public class CreateNetworkApplicationRequest extends AbstractModel {

    /**
    * <p>网络应用名称：长度不超过64字符，名称不能重复。</p><ul><li>只能包含以下字符：<ul><li>英文字母（大小写）</li><li>数字</li><li>下划线</li><li>连字符（减号）</li><li>汉字</li></ul></li><li>至少包含一个字符</li><li>不能包含空格</li><li>不能包含其他特殊字符（如 @、#、$、% 等）</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>主题名称。名称限制如下：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get <p>网络应用名称：长度不超过64字符，名称不能重复。</p><ul><li>只能包含以下字符：<ul><li>英文字母（大小写）</li><li>数字</li><li>下划线</li><li>连字符（减号）</li><li>汉字</li></ul></li><li>至少包含一个字符</li><li>不能包含空格</li><li>不能包含其他特殊字符（如 @、#、$、% 等）</li></ul> 
     * @return Name <p>网络应用名称：长度不超过64字符，名称不能重复。</p><ul><li>只能包含以下字符：<ul><li>英文字母（大小写）</li><li>数字</li><li>下划线</li><li>连字符（减号）</li><li>汉字</li></ul></li><li>至少包含一个字符</li><li>不能包含空格</li><li>不能包含其他特殊字符（如 @、#、$、% 等）</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>网络应用名称：长度不超过64字符，名称不能重复。</p><ul><li>只能包含以下字符：<ul><li>英文字母（大小写）</li><li>数字</li><li>下划线</li><li>连字符（减号）</li><li>汉字</li></ul></li><li>至少包含一个字符</li><li>不能包含空格</li><li>不能包含其他特殊字符（如 @、#、$、% 等）</li></ul>
     * @param Name <p>网络应用名称：长度不超过64字符，名称不能重复。</p><ul><li>只能包含以下字符：<ul><li>英文字母（大小写）</li><li>数字</li><li>下划线</li><li>连字符（减号）</li><li>汉字</li></ul></li><li>至少包含一个字符</li><li>不能包含空格</li><li>不能包含其他特殊字符（如 @、#、$、% 等）</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul> 
     * @return LogsetId <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     * @param LogsetId <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>主题名称。名称限制如下：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul> 
     * @return TopicName <p>主题名称。名称限制如下：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>主题名称。名称限制如下：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     * @param TopicName <p>主题名称。名称限制如下：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public CreateNetworkApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNetworkApplicationRequest(CreateNetworkApplicationRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

