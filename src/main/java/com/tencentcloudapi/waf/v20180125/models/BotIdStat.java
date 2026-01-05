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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotIdStat extends AbstractModel {

    /**
    * 模式：观察/拦截/自定义
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * 规则总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 配置观察的规则数
    */
    @SerializedName("MonitorCount")
    @Expose
    private Long MonitorCount;

    /**
    * 配置拦截的规则数
    */
    @SerializedName("InterceptCount")
    @Expose
    private Long InterceptCount;

    /**
    * 配置重定向的规则数
    */
    @SerializedName("RedirectCount")
    @Expose
    private Long RedirectCount;

    /**
    * 配置人机识别的规则数
    */
    @SerializedName("CaptchaCount")
    @Expose
    private Long CaptchaCount;

    /**
    * 全局防护等级
    */
    @SerializedName("ProtectLevel")
    @Expose
    private String ProtectLevel;

    /**
    * 全局重定向路径
    */
    @SerializedName("GlobalRedirect")
    @Expose
    private String GlobalRedirect;

    /**
    * JS挑战的数目
    */
    @SerializedName("JsChallengeCount")
    @Expose
    private Long JsChallengeCount;

    /**
     * Get 模式：观察/拦截/自定义 
     * @return Pattern 模式：观察/拦截/自定义
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 模式：观察/拦截/自定义
     * @param Pattern 模式：观察/拦截/自定义
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get 规则总数 
     * @return TotalCount 规则总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 规则总数
     * @param TotalCount 规则总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 配置观察的规则数 
     * @return MonitorCount 配置观察的规则数
     */
    public Long getMonitorCount() {
        return this.MonitorCount;
    }

    /**
     * Set 配置观察的规则数
     * @param MonitorCount 配置观察的规则数
     */
    public void setMonitorCount(Long MonitorCount) {
        this.MonitorCount = MonitorCount;
    }

    /**
     * Get 配置拦截的规则数 
     * @return InterceptCount 配置拦截的规则数
     */
    public Long getInterceptCount() {
        return this.InterceptCount;
    }

    /**
     * Set 配置拦截的规则数
     * @param InterceptCount 配置拦截的规则数
     */
    public void setInterceptCount(Long InterceptCount) {
        this.InterceptCount = InterceptCount;
    }

    /**
     * Get 配置重定向的规则数 
     * @return RedirectCount 配置重定向的规则数
     */
    public Long getRedirectCount() {
        return this.RedirectCount;
    }

    /**
     * Set 配置重定向的规则数
     * @param RedirectCount 配置重定向的规则数
     */
    public void setRedirectCount(Long RedirectCount) {
        this.RedirectCount = RedirectCount;
    }

    /**
     * Get 配置人机识别的规则数 
     * @return CaptchaCount 配置人机识别的规则数
     */
    public Long getCaptchaCount() {
        return this.CaptchaCount;
    }

    /**
     * Set 配置人机识别的规则数
     * @param CaptchaCount 配置人机识别的规则数
     */
    public void setCaptchaCount(Long CaptchaCount) {
        this.CaptchaCount = CaptchaCount;
    }

    /**
     * Get 全局防护等级 
     * @return ProtectLevel 全局防护等级
     */
    public String getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set 全局防护等级
     * @param ProtectLevel 全局防护等级
     */
    public void setProtectLevel(String ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    /**
     * Get 全局重定向路径 
     * @return GlobalRedirect 全局重定向路径
     */
    public String getGlobalRedirect() {
        return this.GlobalRedirect;
    }

    /**
     * Set 全局重定向路径
     * @param GlobalRedirect 全局重定向路径
     */
    public void setGlobalRedirect(String GlobalRedirect) {
        this.GlobalRedirect = GlobalRedirect;
    }

    /**
     * Get JS挑战的数目 
     * @return JsChallengeCount JS挑战的数目
     */
    public Long getJsChallengeCount() {
        return this.JsChallengeCount;
    }

    /**
     * Set JS挑战的数目
     * @param JsChallengeCount JS挑战的数目
     */
    public void setJsChallengeCount(Long JsChallengeCount) {
        this.JsChallengeCount = JsChallengeCount;
    }

    public BotIdStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotIdStat(BotIdStat source) {
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MonitorCount != null) {
            this.MonitorCount = new Long(source.MonitorCount);
        }
        if (source.InterceptCount != null) {
            this.InterceptCount = new Long(source.InterceptCount);
        }
        if (source.RedirectCount != null) {
            this.RedirectCount = new Long(source.RedirectCount);
        }
        if (source.CaptchaCount != null) {
            this.CaptchaCount = new Long(source.CaptchaCount);
        }
        if (source.ProtectLevel != null) {
            this.ProtectLevel = new String(source.ProtectLevel);
        }
        if (source.GlobalRedirect != null) {
            this.GlobalRedirect = new String(source.GlobalRedirect);
        }
        if (source.JsChallengeCount != null) {
            this.JsChallengeCount = new Long(source.JsChallengeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "MonitorCount", this.MonitorCount);
        this.setParamSimple(map, prefix + "InterceptCount", this.InterceptCount);
        this.setParamSimple(map, prefix + "RedirectCount", this.RedirectCount);
        this.setParamSimple(map, prefix + "CaptchaCount", this.CaptchaCount);
        this.setParamSimple(map, prefix + "ProtectLevel", this.ProtectLevel);
        this.setParamSimple(map, prefix + "GlobalRedirect", this.GlobalRedirect);
        this.setParamSimple(map, prefix + "JsChallengeCount", this.JsChallengeCount);

    }
}

