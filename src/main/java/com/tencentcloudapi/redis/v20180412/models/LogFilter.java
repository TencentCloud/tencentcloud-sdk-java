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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFilter extends AbstractModel {

    /**
    * <p>过滤条件名称。</p><p>枚举值：</p><ul><li>Timestamp： 创建时间（格式：2006-01-02 15:04:05.000）</li><li>UserName： 用户名</li><li>CacheCode： 缓存代码，后端redis节点</li><li>ClientAddr： 客户端地址</li><li>CommandDetail： 命令详情</li><li>CommandLatency： 命令延迟（毫秒）</li><li>CommandType： 命令类型</li><li>DBId： 数据库ID</li><li>ErrMsg： 错误信息</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>过滤条件匹配类型。</p><p>枚举值：</p><ul><li>INC： 包含，多个值之前是||的关系</li><li>EXC： 不包含，多个值之前是||的关系</li><li>EQS： 等于，多个值之前是||的关系</li><li>NEQ： 不等于，多个值之前是&amp;&amp;的关系</li><li>RA： 范围</li></ul>
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * <p>过滤条件匹配值。当Compare=RA时，例如：[&quot;1-100&quot;,&quot;200-300&quot;]。</p>
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get <p>过滤条件名称。</p><p>枚举值：</p><ul><li>Timestamp： 创建时间（格式：2006-01-02 15:04:05.000）</li><li>UserName： 用户名</li><li>CacheCode： 缓存代码，后端redis节点</li><li>ClientAddr： 客户端地址</li><li>CommandDetail： 命令详情</li><li>CommandLatency： 命令延迟（毫秒）</li><li>CommandType： 命令类型</li><li>DBId： 数据库ID</li><li>ErrMsg： 错误信息</li></ul> 
     * @return Type <p>过滤条件名称。</p><p>枚举值：</p><ul><li>Timestamp： 创建时间（格式：2006-01-02 15:04:05.000）</li><li>UserName： 用户名</li><li>CacheCode： 缓存代码，后端redis节点</li><li>ClientAddr： 客户端地址</li><li>CommandDetail： 命令详情</li><li>CommandLatency： 命令延迟（毫秒）</li><li>CommandType： 命令类型</li><li>DBId： 数据库ID</li><li>ErrMsg： 错误信息</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>过滤条件名称。</p><p>枚举值：</p><ul><li>Timestamp： 创建时间（格式：2006-01-02 15:04:05.000）</li><li>UserName： 用户名</li><li>CacheCode： 缓存代码，后端redis节点</li><li>ClientAddr： 客户端地址</li><li>CommandDetail： 命令详情</li><li>CommandLatency： 命令延迟（毫秒）</li><li>CommandType： 命令类型</li><li>DBId： 数据库ID</li><li>ErrMsg： 错误信息</li></ul>
     * @param Type <p>过滤条件名称。</p><p>枚举值：</p><ul><li>Timestamp： 创建时间（格式：2006-01-02 15:04:05.000）</li><li>UserName： 用户名</li><li>CacheCode： 缓存代码，后端redis节点</li><li>ClientAddr： 客户端地址</li><li>CommandDetail： 命令详情</li><li>CommandLatency： 命令延迟（毫秒）</li><li>CommandType： 命令类型</li><li>DBId： 数据库ID</li><li>ErrMsg： 错误信息</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>过滤条件匹配类型。</p><p>枚举值：</p><ul><li>INC： 包含，多个值之前是||的关系</li><li>EXC： 不包含，多个值之前是||的关系</li><li>EQS： 等于，多个值之前是||的关系</li><li>NEQ： 不等于，多个值之前是&amp;&amp;的关系</li><li>RA： 范围</li></ul> 
     * @return Compare <p>过滤条件匹配类型。</p><p>枚举值：</p><ul><li>INC： 包含，多个值之前是||的关系</li><li>EXC： 不包含，多个值之前是||的关系</li><li>EQS： 等于，多个值之前是||的关系</li><li>NEQ： 不等于，多个值之前是&amp;&amp;的关系</li><li>RA： 范围</li></ul>
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set <p>过滤条件匹配类型。</p><p>枚举值：</p><ul><li>INC： 包含，多个值之前是||的关系</li><li>EXC： 不包含，多个值之前是||的关系</li><li>EQS： 等于，多个值之前是||的关系</li><li>NEQ： 不等于，多个值之前是&amp;&amp;的关系</li><li>RA： 范围</li></ul>
     * @param Compare <p>过滤条件匹配类型。</p><p>枚举值：</p><ul><li>INC： 包含，多个值之前是||的关系</li><li>EXC： 不包含，多个值之前是||的关系</li><li>EQS： 等于，多个值之前是||的关系</li><li>NEQ： 不等于，多个值之前是&amp;&amp;的关系</li><li>RA： 范围</li></ul>
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get <p>过滤条件匹配值。当Compare=RA时，例如：[&quot;1-100&quot;,&quot;200-300&quot;]。</p> 
     * @return Value <p>过滤条件匹配值。当Compare=RA时，例如：[&quot;1-100&quot;,&quot;200-300&quot;]。</p>
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set <p>过滤条件匹配值。当Compare=RA时，例如：[&quot;1-100&quot;,&quot;200-300&quot;]。</p>
     * @param Value <p>过滤条件匹配值。当Compare=RA时，例如：[&quot;1-100&quot;,&quot;200-300&quot;]。</p>
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public LogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFilter(LogFilter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

