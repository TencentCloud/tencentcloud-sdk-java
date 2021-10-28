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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteAuthenticationRule extends AbstractModel{

    /**
    * 远程鉴权服务http url
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 请求远程鉴权服务器的http方法；取值范围[get,post,head,all]; all 表示不限制请求方法；
all: 不指定访问访问方法；
    */
    @SerializedName("AuthMethod")
    @Expose
    private String AuthMethod;

    /**
    * 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * 请求远程鉴权服务器超时时间，单位毫秒；
取值范围：[1,30 000]
    */
    @SerializedName("AuthTimeout")
    @Expose
    private Long AuthTimeout;

    /**
    * 请求远程鉴权服务器超时后执行拦截或者放行；
RETURN_200: 超时后放行；
RETURN_403:超时返回403；
    */
    @SerializedName("AuthTimeoutAction")
    @Expose
    private String AuthTimeoutAction;

    /**
     * Get 远程鉴权服务http url 
     * @return Server 远程鉴权服务http url
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 远程鉴权服务http url
     * @param Server 远程鉴权服务http url
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 请求远程鉴权服务器的http方法；取值范围[get,post,head,all]; all 表示不限制请求方法；
all: 不指定访问访问方法； 
     * @return AuthMethod 请求远程鉴权服务器的http方法；取值范围[get,post,head,all]; all 表示不限制请求方法；
all: 不指定访问访问方法；
     */
    public String getAuthMethod() {
        return this.AuthMethod;
    }

    /**
     * Set 请求远程鉴权服务器的http方法；取值范围[get,post,head,all]; all 表示不限制请求方法；
all: 不指定访问访问方法；
     * @param AuthMethod 请求远程鉴权服务器的http方法；取值范围[get,post,head,all]; all 表示不限制请求方法；
all: 不指定访问访问方法；
     */
    public void setAuthMethod(String AuthMethod) {
        this.AuthMethod = AuthMethod;
    }

    /**
     * Get 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效 
     * @return RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
     * @param RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 / 
     * @return RulePaths 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
     * @param RulePaths 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get 请求远程鉴权服务器超时时间，单位毫秒；
取值范围：[1,30 000] 
     * @return AuthTimeout 请求远程鉴权服务器超时时间，单位毫秒；
取值范围：[1,30 000]
     */
    public Long getAuthTimeout() {
        return this.AuthTimeout;
    }

    /**
     * Set 请求远程鉴权服务器超时时间，单位毫秒；
取值范围：[1,30 000]
     * @param AuthTimeout 请求远程鉴权服务器超时时间，单位毫秒；
取值范围：[1,30 000]
     */
    public void setAuthTimeout(Long AuthTimeout) {
        this.AuthTimeout = AuthTimeout;
    }

    /**
     * Get 请求远程鉴权服务器超时后执行拦截或者放行；
RETURN_200: 超时后放行；
RETURN_403:超时返回403； 
     * @return AuthTimeoutAction 请求远程鉴权服务器超时后执行拦截或者放行；
RETURN_200: 超时后放行；
RETURN_403:超时返回403；
     */
    public String getAuthTimeoutAction() {
        return this.AuthTimeoutAction;
    }

    /**
     * Set 请求远程鉴权服务器超时后执行拦截或者放行；
RETURN_200: 超时后放行；
RETURN_403:超时返回403；
     * @param AuthTimeoutAction 请求远程鉴权服务器超时后执行拦截或者放行；
RETURN_200: 超时后放行；
RETURN_403:超时返回403；
     */
    public void setAuthTimeoutAction(String AuthTimeoutAction) {
        this.AuthTimeoutAction = AuthTimeoutAction;
    }

    public RemoteAuthenticationRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteAuthenticationRule(RemoteAuthenticationRule source) {
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.AuthMethod != null) {
            this.AuthMethod = new String(source.AuthMethod);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.AuthTimeout != null) {
            this.AuthTimeout = new Long(source.AuthTimeout);
        }
        if (source.AuthTimeoutAction != null) {
            this.AuthTimeoutAction = new String(source.AuthTimeoutAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "AuthMethod", this.AuthMethod);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "AuthTimeout", this.AuthTimeout);
        this.setParamSimple(map, prefix + "AuthTimeoutAction", this.AuthTimeoutAction);

    }
}

