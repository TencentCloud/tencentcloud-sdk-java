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

public class ModifyLogRequest extends AbstractModel {

    /**
    * <p>日志主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>检索时间范围-开始时间</p><p>单位：ms</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>检索时间范围-结束时间</p><p>单位：ms</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行修改</p>
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * <p>修改模式</p><p>枚举值：</p><ul><li>PARTIAL： 只修改指定的日志字段</li><li>REPLACE： 整体替换原有日志（不包含预置字段及元数据字段）</li></ul>
    */
    @SerializedName("ModifyMode")
    @Expose
    private String ModifyMode;

    /**
    * <p>修改内容</p><p>不支持修改预置字段(__FILENAME__、__SOURCE__等，但不包括__CONTENT__)及元数据字段(__TAG__开头的字段)</p>
    */
    @SerializedName("ModifyContent")
    @Expose
    private String ModifyContent;

    /**
     * Get <p>日志主题id</p> 
     * @return TopicId <p>日志主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id</p>
     * @param TopicId <p>日志主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>检索时间范围-开始时间</p><p>单位：ms</p> 
     * @return From <p>检索时间范围-开始时间</p><p>单位：ms</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>检索时间范围-开始时间</p><p>单位：ms</p>
     * @param From <p>检索时间范围-开始时间</p><p>单位：ms</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>检索时间范围-结束时间</p><p>单位：ms</p> 
     * @return To <p>检索时间范围-结束时间</p><p>单位：ms</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>检索时间范围-结束时间</p><p>单位：ms</p>
     * @param To <p>检索时间范围-结束时间</p><p>单位：ms</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行修改</p> 
     * @return QueryString <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行修改</p>
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行修改</p>
     * @param QueryString <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行修改</p>
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get <p>修改模式</p><p>枚举值：</p><ul><li>PARTIAL： 只修改指定的日志字段</li><li>REPLACE： 整体替换原有日志（不包含预置字段及元数据字段）</li></ul> 
     * @return ModifyMode <p>修改模式</p><p>枚举值：</p><ul><li>PARTIAL： 只修改指定的日志字段</li><li>REPLACE： 整体替换原有日志（不包含预置字段及元数据字段）</li></ul>
     */
    public String getModifyMode() {
        return this.ModifyMode;
    }

    /**
     * Set <p>修改模式</p><p>枚举值：</p><ul><li>PARTIAL： 只修改指定的日志字段</li><li>REPLACE： 整体替换原有日志（不包含预置字段及元数据字段）</li></ul>
     * @param ModifyMode <p>修改模式</p><p>枚举值：</p><ul><li>PARTIAL： 只修改指定的日志字段</li><li>REPLACE： 整体替换原有日志（不包含预置字段及元数据字段）</li></ul>
     */
    public void setModifyMode(String ModifyMode) {
        this.ModifyMode = ModifyMode;
    }

    /**
     * Get <p>修改内容</p><p>不支持修改预置字段(__FILENAME__、__SOURCE__等，但不包括__CONTENT__)及元数据字段(__TAG__开头的字段)</p> 
     * @return ModifyContent <p>修改内容</p><p>不支持修改预置字段(__FILENAME__、__SOURCE__等，但不包括__CONTENT__)及元数据字段(__TAG__开头的字段)</p>
     */
    public String getModifyContent() {
        return this.ModifyContent;
    }

    /**
     * Set <p>修改内容</p><p>不支持修改预置字段(__FILENAME__、__SOURCE__等，但不包括__CONTENT__)及元数据字段(__TAG__开头的字段)</p>
     * @param ModifyContent <p>修改内容</p><p>不支持修改预置字段(__FILENAME__、__SOURCE__等，但不包括__CONTENT__)及元数据字段(__TAG__开头的字段)</p>
     */
    public void setModifyContent(String ModifyContent) {
        this.ModifyContent = ModifyContent;
    }

    public ModifyLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogRequest(ModifyLogRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.ModifyMode != null) {
            this.ModifyMode = new String(source.ModifyMode);
        }
        if (source.ModifyContent != null) {
            this.ModifyContent = new String(source.ModifyContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "ModifyMode", this.ModifyMode);
        this.setParamSimple(map, prefix + "ModifyContent", this.ModifyContent);

    }
}

