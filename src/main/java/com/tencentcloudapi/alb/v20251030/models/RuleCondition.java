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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCondition extends AbstractModel {

    /**
    * 转发条件类型。取值：
Host：主机。
Path：路径。
Header：HTTP Header字段。
QueryString：HTPP查询字符串。
Method：请求方法。
Cookie：Cookie。
SourceIp：源 IP。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cookie配置。
    */
    @SerializedName("CookieConfig")
    @Expose
    private HTTPCookieInfo [] CookieConfig;

    /**
    * HTTP Header配置。
    */
    @SerializedName("HeaderConfig")
    @Expose
    private HTTPHeaderInfo HeaderConfig;

    /**
    * 主机名。主机配置在一个规则中只能出现一次，长度3 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
不能以半角句号（.）、下划线（_）开头或结尾。
精确匹配，支持的字符集为：a-z 0-9 . - _ 。
正则匹配，波浪线（~）开头为正则匹配，支持的字符集为：a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] 。
通配匹配，星号（*）多字符通配，半角问号（?）单字符通配，支持的字符集为：a-z 0-9 . - _ * ?。
    */
    @SerializedName("HostConfig")
    @Expose
    private String [] HostConfig;

    /**
    * 请求方法。取值：HEAD、GET、POST、OPTIONS、PUT、PATCH、DELETE。
    */
    @SerializedName("MethodConfig")
    @Expose
    private String [] MethodConfig;

    /**
    * 转发路径。长度1 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
精确匹配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
正则匹配，需以 ~ 开头，~ 开头表示区分大小写， ~* 开头表示不区分大小写，支持的字符集为： a-z A-Z 0-9 . - _ / = ?  ~ ^ * $ : ( ) [ ] + |。
通配匹配，* 表示多字符通配，? 表示单字符通配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
    */
    @SerializedName("PathConfig")
    @Expose
    private String [] PathConfig;

    /**
    * 查询字符串配置。
    */
    @SerializedName("QueryStringConfig")
    @Expose
    private HTTPQueryStringInfo [] QueryStringConfig;

    /**
    * 源IP匹配配置。CIDR格式，IP地址x.x.x.x/32，IP网段x.x.x.x/24。
    */
    @SerializedName("SourceIpConfig")
    @Expose
    private String [] SourceIpConfig;

    /**
     * Get 转发条件类型。取值：
Host：主机。
Path：路径。
Header：HTTP Header字段。
QueryString：HTPP查询字符串。
Method：请求方法。
Cookie：Cookie。
SourceIp：源 IP。 
     * @return Type 转发条件类型。取值：
Host：主机。
Path：路径。
Header：HTTP Header字段。
QueryString：HTPP查询字符串。
Method：请求方法。
Cookie：Cookie。
SourceIp：源 IP。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 转发条件类型。取值：
Host：主机。
Path：路径。
Header：HTTP Header字段。
QueryString：HTPP查询字符串。
Method：请求方法。
Cookie：Cookie。
SourceIp：源 IP。
     * @param Type 转发条件类型。取值：
Host：主机。
Path：路径。
Header：HTTP Header字段。
QueryString：HTPP查询字符串。
Method：请求方法。
Cookie：Cookie。
SourceIp：源 IP。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cookie配置。 
     * @return CookieConfig Cookie配置。
     */
    public HTTPCookieInfo [] getCookieConfig() {
        return this.CookieConfig;
    }

    /**
     * Set Cookie配置。
     * @param CookieConfig Cookie配置。
     */
    public void setCookieConfig(HTTPCookieInfo [] CookieConfig) {
        this.CookieConfig = CookieConfig;
    }

    /**
     * Get HTTP Header配置。 
     * @return HeaderConfig HTTP Header配置。
     */
    public HTTPHeaderInfo getHeaderConfig() {
        return this.HeaderConfig;
    }

    /**
     * Set HTTP Header配置。
     * @param HeaderConfig HTTP Header配置。
     */
    public void setHeaderConfig(HTTPHeaderInfo HeaderConfig) {
        this.HeaderConfig = HeaderConfig;
    }

    /**
     * Get 主机名。主机配置在一个规则中只能出现一次，长度3 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
不能以半角句号（.）、下划线（_）开头或结尾。
精确匹配，支持的字符集为：a-z 0-9 . - _ 。
正则匹配，波浪线（~）开头为正则匹配，支持的字符集为：a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] 。
通配匹配，星号（*）多字符通配，半角问号（?）单字符通配，支持的字符集为：a-z 0-9 . - _ * ?。 
     * @return HostConfig 主机名。主机配置在一个规则中只能出现一次，长度3 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
不能以半角句号（.）、下划线（_）开头或结尾。
精确匹配，支持的字符集为：a-z 0-9 . - _ 。
正则匹配，波浪线（~）开头为正则匹配，支持的字符集为：a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] 。
通配匹配，星号（*）多字符通配，半角问号（?）单字符通配，支持的字符集为：a-z 0-9 . - _ * ?。
     */
    public String [] getHostConfig() {
        return this.HostConfig;
    }

    /**
     * Set 主机名。主机配置在一个规则中只能出现一次，长度3 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
不能以半角句号（.）、下划线（_）开头或结尾。
精确匹配，支持的字符集为：a-z 0-9 . - _ 。
正则匹配，波浪线（~）开头为正则匹配，支持的字符集为：a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] 。
通配匹配，星号（*）多字符通配，半角问号（?）单字符通配，支持的字符集为：a-z 0-9 . - _ * ?。
     * @param HostConfig 主机名。主机配置在一个规则中只能出现一次，长度3 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
不能以半角句号（.）、下划线（_）开头或结尾。
精确匹配，支持的字符集为：a-z 0-9 . - _ 。
正则匹配，波浪线（~）开头为正则匹配，支持的字符集为：a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] 。
通配匹配，星号（*）多字符通配，半角问号（?）单字符通配，支持的字符集为：a-z 0-9 . - _ * ?。
     */
    public void setHostConfig(String [] HostConfig) {
        this.HostConfig = HostConfig;
    }

    /**
     * Get 请求方法。取值：HEAD、GET、POST、OPTIONS、PUT、PATCH、DELETE。 
     * @return MethodConfig 请求方法。取值：HEAD、GET、POST、OPTIONS、PUT、PATCH、DELETE。
     */
    public String [] getMethodConfig() {
        return this.MethodConfig;
    }

    /**
     * Set 请求方法。取值：HEAD、GET、POST、OPTIONS、PUT、PATCH、DELETE。
     * @param MethodConfig 请求方法。取值：HEAD、GET、POST、OPTIONS、PUT、PATCH、DELETE。
     */
    public void setMethodConfig(String [] MethodConfig) {
        this.MethodConfig = MethodConfig;
    }

    /**
     * Get 转发路径。长度1 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
精确匹配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
正则匹配，需以 ~ 开头，~ 开头表示区分大小写， ~* 开头表示不区分大小写，支持的字符集为： a-z A-Z 0-9 . - _ / = ?  ~ ^ * $ : ( ) [ ] + |。
通配匹配，* 表示多字符通配，? 表示单字符通配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。 
     * @return PathConfig 转发路径。长度1 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
精确匹配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
正则匹配，需以 ~ 开头，~ 开头表示区分大小写， ~* 开头表示不区分大小写，支持的字符集为： a-z A-Z 0-9 . - _ / = ?  ~ ^ * $ : ( ) [ ] + |。
通配匹配，* 表示多字符通配，? 表示单字符通配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
     */
    public String [] getPathConfig() {
        return this.PathConfig;
    }

    /**
     * Set 转发路径。长度1 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
精确匹配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
正则匹配，需以 ~ 开头，~ 开头表示区分大小写， ~* 开头表示不区分大小写，支持的字符集为： a-z A-Z 0-9 . - _ / = ?  ~ ^ * $ : ( ) [ ] + |。
通配匹配，* 表示多字符通配，? 表示单字符通配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
     * @param PathConfig 转发路径。长度1 ~ 128个字符，支持精确匹配，正则匹配，通配匹配。
精确匹配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
正则匹配，需以 ~ 开头，~ 开头表示区分大小写， ~* 开头表示不区分大小写，支持的字符集为： a-z A-Z 0-9 . - _ / = ?  ~ ^ * $ : ( ) [ ] + |。
通配匹配，* 表示多字符通配，? 表示单字符通配，支持的字符集为：a-z A-Z 0-9 . - _ / =  :。
     */
    public void setPathConfig(String [] PathConfig) {
        this.PathConfig = PathConfig;
    }

    /**
     * Get 查询字符串配置。 
     * @return QueryStringConfig 查询字符串配置。
     */
    public HTTPQueryStringInfo [] getQueryStringConfig() {
        return this.QueryStringConfig;
    }

    /**
     * Set 查询字符串配置。
     * @param QueryStringConfig 查询字符串配置。
     */
    public void setQueryStringConfig(HTTPQueryStringInfo [] QueryStringConfig) {
        this.QueryStringConfig = QueryStringConfig;
    }

    /**
     * Get 源IP匹配配置。CIDR格式，IP地址x.x.x.x/32，IP网段x.x.x.x/24。 
     * @return SourceIpConfig 源IP匹配配置。CIDR格式，IP地址x.x.x.x/32，IP网段x.x.x.x/24。
     */
    public String [] getSourceIpConfig() {
        return this.SourceIpConfig;
    }

    /**
     * Set 源IP匹配配置。CIDR格式，IP地址x.x.x.x/32，IP网段x.x.x.x/24。
     * @param SourceIpConfig 源IP匹配配置。CIDR格式，IP地址x.x.x.x/32，IP网段x.x.x.x/24。
     */
    public void setSourceIpConfig(String [] SourceIpConfig) {
        this.SourceIpConfig = SourceIpConfig;
    }

    public RuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCondition(RuleCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CookieConfig != null) {
            this.CookieConfig = new HTTPCookieInfo[source.CookieConfig.length];
            for (int i = 0; i < source.CookieConfig.length; i++) {
                this.CookieConfig[i] = new HTTPCookieInfo(source.CookieConfig[i]);
            }
        }
        if (source.HeaderConfig != null) {
            this.HeaderConfig = new HTTPHeaderInfo(source.HeaderConfig);
        }
        if (source.HostConfig != null) {
            this.HostConfig = new String[source.HostConfig.length];
            for (int i = 0; i < source.HostConfig.length; i++) {
                this.HostConfig[i] = new String(source.HostConfig[i]);
            }
        }
        if (source.MethodConfig != null) {
            this.MethodConfig = new String[source.MethodConfig.length];
            for (int i = 0; i < source.MethodConfig.length; i++) {
                this.MethodConfig[i] = new String(source.MethodConfig[i]);
            }
        }
        if (source.PathConfig != null) {
            this.PathConfig = new String[source.PathConfig.length];
            for (int i = 0; i < source.PathConfig.length; i++) {
                this.PathConfig[i] = new String(source.PathConfig[i]);
            }
        }
        if (source.QueryStringConfig != null) {
            this.QueryStringConfig = new HTTPQueryStringInfo[source.QueryStringConfig.length];
            for (int i = 0; i < source.QueryStringConfig.length; i++) {
                this.QueryStringConfig[i] = new HTTPQueryStringInfo(source.QueryStringConfig[i]);
            }
        }
        if (source.SourceIpConfig != null) {
            this.SourceIpConfig = new String[source.SourceIpConfig.length];
            for (int i = 0; i < source.SourceIpConfig.length; i++) {
                this.SourceIpConfig[i] = new String(source.SourceIpConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "CookieConfig.", this.CookieConfig);
        this.setParamObj(map, prefix + "HeaderConfig.", this.HeaderConfig);
        this.setParamArraySimple(map, prefix + "HostConfig.", this.HostConfig);
        this.setParamArraySimple(map, prefix + "MethodConfig.", this.MethodConfig);
        this.setParamArraySimple(map, prefix + "PathConfig.", this.PathConfig);
        this.setParamArrayObj(map, prefix + "QueryStringConfig.", this.QueryStringConfig);
        this.setParamArraySimple(map, prefix + "SourceIpConfig.", this.SourceIpConfig);

    }
}

