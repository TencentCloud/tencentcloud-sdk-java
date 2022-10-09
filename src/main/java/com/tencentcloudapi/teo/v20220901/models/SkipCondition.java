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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkipCondition extends AbstractModel{

    /**
    * 例外跳过类型，取值为：
<li>header_fields：HTTP请求Header；</li>
<li>cookie：HTTP请求Cookie；</li>
<li>query_string：HTTP请求URL中的Query参数；</li>
<li>uri：HTTP请求URI；</li>
<li>body_raw：HTTP请求Body；</li>
<li>body_json： JSON格式的HTTP Body。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 选择跳过的字段，取值为：
<li>args：uri 下选择 query 参数: ?name1=jack&age=12；</li>
<li>path：uri 下选择部分路径：/path/to/resource.jpg；</li>
<li>full：uri 下选择完整路径：example.com/path/to/resource.jpg?name1=jack&age=12；</li>
<li>upload_filename：分段文件名，即分段传输文件时；</li>
<li>keys：所有的Key；</li>
<li>values：匹配Key对应的值；</li>
<li>key_value：匹配Key及匹配Value。</li>
    */
    @SerializedName("Selector")
    @Expose
    private String Selector;

    /**
    * 匹配Key所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li>
    */
    @SerializedName("MatchFromType")
    @Expose
    private String MatchFromType;

    /**
    * 匹配Key的值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchFrom")
    @Expose
    private String [] MatchFrom;

    /**
    * 匹配Content所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li>
    */
    @SerializedName("MatchContentType")
    @Expose
    private String MatchContentType;

    /**
    * 匹配Value的值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchContent")
    @Expose
    private String [] MatchContent;

    /**
     * Get 例外跳过类型，取值为：
<li>header_fields：HTTP请求Header；</li>
<li>cookie：HTTP请求Cookie；</li>
<li>query_string：HTTP请求URL中的Query参数；</li>
<li>uri：HTTP请求URI；</li>
<li>body_raw：HTTP请求Body；</li>
<li>body_json： JSON格式的HTTP Body。</li> 
     * @return Type 例外跳过类型，取值为：
<li>header_fields：HTTP请求Header；</li>
<li>cookie：HTTP请求Cookie；</li>
<li>query_string：HTTP请求URL中的Query参数；</li>
<li>uri：HTTP请求URI；</li>
<li>body_raw：HTTP请求Body；</li>
<li>body_json： JSON格式的HTTP Body。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 例外跳过类型，取值为：
<li>header_fields：HTTP请求Header；</li>
<li>cookie：HTTP请求Cookie；</li>
<li>query_string：HTTP请求URL中的Query参数；</li>
<li>uri：HTTP请求URI；</li>
<li>body_raw：HTTP请求Body；</li>
<li>body_json： JSON格式的HTTP Body。</li>
     * @param Type 例外跳过类型，取值为：
<li>header_fields：HTTP请求Header；</li>
<li>cookie：HTTP请求Cookie；</li>
<li>query_string：HTTP请求URL中的Query参数；</li>
<li>uri：HTTP请求URI；</li>
<li>body_raw：HTTP请求Body；</li>
<li>body_json： JSON格式的HTTP Body。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 选择跳过的字段，取值为：
<li>args：uri 下选择 query 参数: ?name1=jack&age=12；</li>
<li>path：uri 下选择部分路径：/path/to/resource.jpg；</li>
<li>full：uri 下选择完整路径：example.com/path/to/resource.jpg?name1=jack&age=12；</li>
<li>upload_filename：分段文件名，即分段传输文件时；</li>
<li>keys：所有的Key；</li>
<li>values：匹配Key对应的值；</li>
<li>key_value：匹配Key及匹配Value。</li> 
     * @return Selector 选择跳过的字段，取值为：
<li>args：uri 下选择 query 参数: ?name1=jack&age=12；</li>
<li>path：uri 下选择部分路径：/path/to/resource.jpg；</li>
<li>full：uri 下选择完整路径：example.com/path/to/resource.jpg?name1=jack&age=12；</li>
<li>upload_filename：分段文件名，即分段传输文件时；</li>
<li>keys：所有的Key；</li>
<li>values：匹配Key对应的值；</li>
<li>key_value：匹配Key及匹配Value。</li>
     */
    public String getSelector() {
        return this.Selector;
    }

    /**
     * Set 选择跳过的字段，取值为：
<li>args：uri 下选择 query 参数: ?name1=jack&age=12；</li>
<li>path：uri 下选择部分路径：/path/to/resource.jpg；</li>
<li>full：uri 下选择完整路径：example.com/path/to/resource.jpg?name1=jack&age=12；</li>
<li>upload_filename：分段文件名，即分段传输文件时；</li>
<li>keys：所有的Key；</li>
<li>values：匹配Key对应的值；</li>
<li>key_value：匹配Key及匹配Value。</li>
     * @param Selector 选择跳过的字段，取值为：
<li>args：uri 下选择 query 参数: ?name1=jack&age=12；</li>
<li>path：uri 下选择部分路径：/path/to/resource.jpg；</li>
<li>full：uri 下选择完整路径：example.com/path/to/resource.jpg?name1=jack&age=12；</li>
<li>upload_filename：分段文件名，即分段传输文件时；</li>
<li>keys：所有的Key；</li>
<li>values：匹配Key对应的值；</li>
<li>key_value：匹配Key及匹配Value。</li>
     */
    public void setSelector(String Selector) {
        this.Selector = Selector;
    }

    /**
     * Get 匹配Key所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li> 
     * @return MatchFromType 匹配Key所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li>
     */
    public String getMatchFromType() {
        return this.MatchFromType;
    }

    /**
     * Set 匹配Key所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li>
     * @param MatchFromType 匹配Key所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li>
     */
    public void setMatchFromType(String MatchFromType) {
        this.MatchFromType = MatchFromType;
    }

    /**
     * Get 匹配Key的值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchFrom 匹配Key的值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set 匹配Key的值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchFrom 匹配Key的值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchFrom(String [] MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get 匹配Content所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li> 
     * @return MatchContentType 匹配Content所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li>
     */
    public String getMatchContentType() {
        return this.MatchContentType;
    }

    /**
     * Set 匹配Content所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li>
     * @param MatchContentType 匹配Content所使用的匹配方式，取值为：
<li>equal：精准匹配，等于；</li>
<li>wildcard：通配符匹配，支持 * 通配。</li>
     */
    public void setMatchContentType(String MatchContentType) {
        this.MatchContentType = MatchContentType;
    }

    /**
     * Get 匹配Value的值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchContent 匹配Value的值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set 匹配Value的值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchContent 匹配Value的值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchContent(String [] MatchContent) {
        this.MatchContent = MatchContent;
    }

    public SkipCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkipCondition(SkipCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Selector != null) {
            this.Selector = new String(source.Selector);
        }
        if (source.MatchFromType != null) {
            this.MatchFromType = new String(source.MatchFromType);
        }
        if (source.MatchFrom != null) {
            this.MatchFrom = new String[source.MatchFrom.length];
            for (int i = 0; i < source.MatchFrom.length; i++) {
                this.MatchFrom[i] = new String(source.MatchFrom[i]);
            }
        }
        if (source.MatchContentType != null) {
            this.MatchContentType = new String(source.MatchContentType);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String[source.MatchContent.length];
            for (int i = 0; i < source.MatchContent.length; i++) {
                this.MatchContent[i] = new String(source.MatchContent[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Selector", this.Selector);
        this.setParamSimple(map, prefix + "MatchFromType", this.MatchFromType);
        this.setParamArraySimple(map, prefix + "MatchFrom.", this.MatchFrom);
        this.setParamSimple(map, prefix + "MatchContentType", this.MatchContentType);
        this.setParamArraySimple(map, prefix + "MatchContent.", this.MatchContent);

    }
}

