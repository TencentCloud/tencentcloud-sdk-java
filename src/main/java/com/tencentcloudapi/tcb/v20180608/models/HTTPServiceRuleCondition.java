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

public class HTTPServiceRuleCondition extends AbstractModel {

    /**
    * <p>Target 匹配对象</p><p>枚举值：</p><ul><li>url_path： 请求 URI 路径（不含查询串），例：/static/logo.jpg</li><li>file_extension： 请求文件扩展名（EO 从 path 中解析），例：jpg</li><li>full_uri： 完整 URI（路径 + 查询串），例：/download?type=hd</li></ul>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>MatchType 字符串匹配类型</p><p>枚举值：</p><ul><li>prefix：  前缀匹配</li><li>suffix： 后缀匹配</li><li>contains： 包含匹配</li><li>exact： 精确匹配</li></ul>
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * <p>Values 匹配值集合，Values 内任一命中即认为条件成立（OR 语义）</p><p>入参限制：单项 1~1024 字节，最多 100 条</p>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get <p>Target 匹配对象</p><p>枚举值：</p><ul><li>url_path： 请求 URI 路径（不含查询串），例：/static/logo.jpg</li><li>file_extension： 请求文件扩展名（EO 从 path 中解析），例：jpg</li><li>full_uri： 完整 URI（路径 + 查询串），例：/download?type=hd</li></ul> 
     * @return Target <p>Target 匹配对象</p><p>枚举值：</p><ul><li>url_path： 请求 URI 路径（不含查询串），例：/static/logo.jpg</li><li>file_extension： 请求文件扩展名（EO 从 path 中解析），例：jpg</li><li>full_uri： 完整 URI（路径 + 查询串），例：/download?type=hd</li></ul>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>Target 匹配对象</p><p>枚举值：</p><ul><li>url_path： 请求 URI 路径（不含查询串），例：/static/logo.jpg</li><li>file_extension： 请求文件扩展名（EO 从 path 中解析），例：jpg</li><li>full_uri： 完整 URI（路径 + 查询串），例：/download?type=hd</li></ul>
     * @param Target <p>Target 匹配对象</p><p>枚举值：</p><ul><li>url_path： 请求 URI 路径（不含查询串），例：/static/logo.jpg</li><li>file_extension： 请求文件扩展名（EO 从 path 中解析），例：jpg</li><li>full_uri： 完整 URI（路径 + 查询串），例：/download?type=hd</li></ul>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>MatchType 字符串匹配类型</p><p>枚举值：</p><ul><li>prefix：  前缀匹配</li><li>suffix： 后缀匹配</li><li>contains： 包含匹配</li><li>exact： 精确匹配</li></ul> 
     * @return MatchType <p>MatchType 字符串匹配类型</p><p>枚举值：</p><ul><li>prefix：  前缀匹配</li><li>suffix： 后缀匹配</li><li>contains： 包含匹配</li><li>exact： 精确匹配</li></ul>
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set <p>MatchType 字符串匹配类型</p><p>枚举值：</p><ul><li>prefix：  前缀匹配</li><li>suffix： 后缀匹配</li><li>contains： 包含匹配</li><li>exact： 精确匹配</li></ul>
     * @param MatchType <p>MatchType 字符串匹配类型</p><p>枚举值：</p><ul><li>prefix：  前缀匹配</li><li>suffix： 后缀匹配</li><li>contains： 包含匹配</li><li>exact： 精确匹配</li></ul>
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get <p>Values 匹配值集合，Values 内任一命中即认为条件成立（OR 语义）</p><p>入参限制：单项 1~1024 字节，最多 100 条</p> 
     * @return Values <p>Values 匹配值集合，Values 内任一命中即认为条件成立（OR 语义）</p><p>入参限制：单项 1~1024 字节，最多 100 条</p>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>Values 匹配值集合，Values 内任一命中即认为条件成立（OR 语义）</p><p>入参限制：单项 1~1024 字节，最多 100 条</p>
     * @param Values <p>Values 匹配值集合，Values 内任一命中即认为条件成立（OR 语义）</p><p>入参限制：单项 1~1024 字节，最多 100 条</p>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public HTTPServiceRuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceRuleCondition(HTTPServiceRuleCondition source) {
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

