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

public class ModifyNetworkApplicationRequest extends AbstractModel {

    /**
    * <p>网络应用id</p>
    */
    @SerializedName("NetworkAppId")
    @Expose
    private String NetworkAppId;

    /**
    * <p>网络应用名称：长度不超过64字符，名称不能重复。</p><ul><li>只能包含以下字符：<ul><li>英文字母（大小写）</li><li>数字</li><li>下划线</li><li>连字符（减号）</li><li>汉字</li></ul></li><li>至少包含一个字符</li><li>不能包含空格</li><li>不能包含其他特殊字符（如 @、#、$、% 等）</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>网络应用id</p> 
     * @return NetworkAppId <p>网络应用id</p>
     */
    public String getNetworkAppId() {
        return this.NetworkAppId;
    }

    /**
     * Set <p>网络应用id</p>
     * @param NetworkAppId <p>网络应用id</p>
     */
    public void setNetworkAppId(String NetworkAppId) {
        this.NetworkAppId = NetworkAppId;
    }

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

    public ModifyNetworkApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkApplicationRequest(ModifyNetworkApplicationRequest source) {
        if (source.NetworkAppId != null) {
            this.NetworkAppId = new String(source.NetworkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAppId", this.NetworkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

