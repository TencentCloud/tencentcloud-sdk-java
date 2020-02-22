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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySiteAttributeRequest extends AbstractModel{

    /**
    * 站点ID
    */
    @SerializedName("SiteId")
    @Expose
    private Long SiteId;

    /**
    * 站点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网站是否需要登录扫描：0-未知；-1-不需要；1-需要
    */
    @SerializedName("NeedLogin")
    @Expose
    private Long NeedLogin;

    /**
    * 登录后的cookie
    */
    @SerializedName("LoginCookie")
    @Expose
    private String LoginCookie;

    /**
    * 用于测试cookie是否有效的URL
    */
    @SerializedName("LoginCheckUrl")
    @Expose
    private String LoginCheckUrl;

    /**
    * 用于测试cookie是否有效的关键字
    */
    @SerializedName("LoginCheckKw")
    @Expose
    private String LoginCheckKw;

    /**
    * 禁止扫描器扫描的目录关键字
    */
    @SerializedName("ScanDisallow")
    @Expose
    private String ScanDisallow;

    /**
     * Get 站点ID 
     * @return SiteId 站点ID
     */
    public Long getSiteId() {
        return this.SiteId;
    }

    /**
     * Set 站点ID
     * @param SiteId 站点ID
     */
    public void setSiteId(Long SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * Get 站点名称 
     * @return Name 站点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名称
     * @param Name 站点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网站是否需要登录扫描：0-未知；-1-不需要；1-需要 
     * @return NeedLogin 网站是否需要登录扫描：0-未知；-1-不需要；1-需要
     */
    public Long getNeedLogin() {
        return this.NeedLogin;
    }

    /**
     * Set 网站是否需要登录扫描：0-未知；-1-不需要；1-需要
     * @param NeedLogin 网站是否需要登录扫描：0-未知；-1-不需要；1-需要
     */
    public void setNeedLogin(Long NeedLogin) {
        this.NeedLogin = NeedLogin;
    }

    /**
     * Get 登录后的cookie 
     * @return LoginCookie 登录后的cookie
     */
    public String getLoginCookie() {
        return this.LoginCookie;
    }

    /**
     * Set 登录后的cookie
     * @param LoginCookie 登录后的cookie
     */
    public void setLoginCookie(String LoginCookie) {
        this.LoginCookie = LoginCookie;
    }

    /**
     * Get 用于测试cookie是否有效的URL 
     * @return LoginCheckUrl 用于测试cookie是否有效的URL
     */
    public String getLoginCheckUrl() {
        return this.LoginCheckUrl;
    }

    /**
     * Set 用于测试cookie是否有效的URL
     * @param LoginCheckUrl 用于测试cookie是否有效的URL
     */
    public void setLoginCheckUrl(String LoginCheckUrl) {
        this.LoginCheckUrl = LoginCheckUrl;
    }

    /**
     * Get 用于测试cookie是否有效的关键字 
     * @return LoginCheckKw 用于测试cookie是否有效的关键字
     */
    public String getLoginCheckKw() {
        return this.LoginCheckKw;
    }

    /**
     * Set 用于测试cookie是否有效的关键字
     * @param LoginCheckKw 用于测试cookie是否有效的关键字
     */
    public void setLoginCheckKw(String LoginCheckKw) {
        this.LoginCheckKw = LoginCheckKw;
    }

    /**
     * Get 禁止扫描器扫描的目录关键字 
     * @return ScanDisallow 禁止扫描器扫描的目录关键字
     */
    public String getScanDisallow() {
        return this.ScanDisallow;
    }

    /**
     * Set 禁止扫描器扫描的目录关键字
     * @param ScanDisallow 禁止扫描器扫描的目录关键字
     */
    public void setScanDisallow(String ScanDisallow) {
        this.ScanDisallow = ScanDisallow;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NeedLogin", this.NeedLogin);
        this.setParamSimple(map, prefix + "LoginCookie", this.LoginCookie);
        this.setParamSimple(map, prefix + "LoginCheckUrl", this.LoginCheckUrl);
        this.setParamSimple(map, prefix + "LoginCheckKw", this.LoginCheckKw);
        this.setParamSimple(map, prefix + "ScanDisallow", this.ScanDisallow);

    }
}

