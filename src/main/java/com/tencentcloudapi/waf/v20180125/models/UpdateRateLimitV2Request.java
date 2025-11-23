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

public class UpdateRateLimitV2Request extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则ID
    */
    @SerializedName("LimitRuleId")
    @Expose
    private Long LimitRuleId;

    /**
    * 规则名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 开关，0关闭，1开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 支持API，Domain。如果基于API，则LimitPaths不能为空，否则LimitPaths为空
    */
    @SerializedName("LimitObject")
    @Expose
    private String LimitObject;

    /**
    * 限流策略，0:观察,1:拦截，2:人机
    */
    @SerializedName("LimitStrategy")
    @Expose
    private Long LimitStrategy;

    /**
    * 基于Header参数名限流
    */
    @SerializedName("LimitHeaderName")
    @Expose
    private LimitHeaderName LimitHeaderName;

    /**
    * 限流方法
    */
    @SerializedName("LimitMethod")
    @Expose
    private LimitMethod LimitMethod;

    /**
    * 限流路径
    */
    @SerializedName("LimitPaths")
    @Expose
    private LimitPath LimitPaths;

    /**
    * 限流Headers
    */
    @SerializedName("LimitHeaders")
    @Expose
    private LimitHeader [] LimitHeaders;

    /**
    * 限流窗口
    */
    @SerializedName("LimitWindow")
    @Expose
    private LimitWindow LimitWindow;

    /**
    * 基于Get参数名限流
    */
    @SerializedName("GetParamsName")
    @Expose
    private MatchOption GetParamsName;

    /**
    * 基于Get参数值限流
    */
    @SerializedName("GetParamsValue")
    @Expose
    private MatchOption GetParamsValue;

    /**
    * 基于Post参数名限流
    */
    @SerializedName("PostParamsName")
    @Expose
    private MatchOption PostParamsName;

    /**
    * 基于Post参数值限流
    */
    @SerializedName("PostParamsValue")
    @Expose
    private MatchOption PostParamsValue;

    /**
    * 基于IP归属地限流
    */
    @SerializedName("IpLocation")
    @Expose
    private MatchOption IpLocation;

    /**
    * 重定向信息,当LimitStrategy为重定向时，此字段必填
    */
    @SerializedName("RedirectInfo")
    @Expose
    private RedirectInfo RedirectInfo;

    /**
    * 拦截页面,0表示429，否则填写blockPageID
    */
    @SerializedName("BlockPage")
    @Expose
    private Long BlockPage;

    /**
    * 限流对象来源，0：手动填写，1：API资产
    */
    @SerializedName("ObjectSrc")
    @Expose
    private Long ObjectSrc;

    /**
    * 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
    */
    @SerializedName("QuotaShare")
    @Expose
    private Boolean QuotaShare;

    /**
    * 路径选项,可配置每个路径的请求方法
    */
    @SerializedName("PathsOption")
    @Expose
    private PathItem [] PathsOption;

    /**
    * 限流执行顺序，0：默认情况，限流优先，1：安全防护优先
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则ID 
     * @return LimitRuleId 规则ID
     */
    public Long getLimitRuleId() {
        return this.LimitRuleId;
    }

    /**
     * Set 规则ID
     * @param LimitRuleId 规则ID
     */
    public void setLimitRuleId(Long LimitRuleId) {
        this.LimitRuleId = LimitRuleId;
    }

    /**
     * Get 规则名 
     * @return Name 规则名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名
     * @param Name 规则名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 开关，0关闭，1开启 
     * @return Status 开关，0关闭，1开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关，0关闭，1开启
     * @param Status 开关，0关闭，1开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 支持API，Domain。如果基于API，则LimitPaths不能为空，否则LimitPaths为空 
     * @return LimitObject 支持API，Domain。如果基于API，则LimitPaths不能为空，否则LimitPaths为空
     */
    public String getLimitObject() {
        return this.LimitObject;
    }

    /**
     * Set 支持API，Domain。如果基于API，则LimitPaths不能为空，否则LimitPaths为空
     * @param LimitObject 支持API，Domain。如果基于API，则LimitPaths不能为空，否则LimitPaths为空
     */
    public void setLimitObject(String LimitObject) {
        this.LimitObject = LimitObject;
    }

    /**
     * Get 限流策略，0:观察,1:拦截，2:人机 
     * @return LimitStrategy 限流策略，0:观察,1:拦截，2:人机
     */
    public Long getLimitStrategy() {
        return this.LimitStrategy;
    }

    /**
     * Set 限流策略，0:观察,1:拦截，2:人机
     * @param LimitStrategy 限流策略，0:观察,1:拦截，2:人机
     */
    public void setLimitStrategy(Long LimitStrategy) {
        this.LimitStrategy = LimitStrategy;
    }

    /**
     * Get 基于Header参数名限流 
     * @return LimitHeaderName 基于Header参数名限流
     */
    public LimitHeaderName getLimitHeaderName() {
        return this.LimitHeaderName;
    }

    /**
     * Set 基于Header参数名限流
     * @param LimitHeaderName 基于Header参数名限流
     */
    public void setLimitHeaderName(LimitHeaderName LimitHeaderName) {
        this.LimitHeaderName = LimitHeaderName;
    }

    /**
     * Get 限流方法 
     * @return LimitMethod 限流方法
     */
    public LimitMethod getLimitMethod() {
        return this.LimitMethod;
    }

    /**
     * Set 限流方法
     * @param LimitMethod 限流方法
     */
    public void setLimitMethod(LimitMethod LimitMethod) {
        this.LimitMethod = LimitMethod;
    }

    /**
     * Get 限流路径 
     * @return LimitPaths 限流路径
     */
    public LimitPath getLimitPaths() {
        return this.LimitPaths;
    }

    /**
     * Set 限流路径
     * @param LimitPaths 限流路径
     */
    public void setLimitPaths(LimitPath LimitPaths) {
        this.LimitPaths = LimitPaths;
    }

    /**
     * Get 限流Headers 
     * @return LimitHeaders 限流Headers
     */
    public LimitHeader [] getLimitHeaders() {
        return this.LimitHeaders;
    }

    /**
     * Set 限流Headers
     * @param LimitHeaders 限流Headers
     */
    public void setLimitHeaders(LimitHeader [] LimitHeaders) {
        this.LimitHeaders = LimitHeaders;
    }

    /**
     * Get 限流窗口 
     * @return LimitWindow 限流窗口
     */
    public LimitWindow getLimitWindow() {
        return this.LimitWindow;
    }

    /**
     * Set 限流窗口
     * @param LimitWindow 限流窗口
     */
    public void setLimitWindow(LimitWindow LimitWindow) {
        this.LimitWindow = LimitWindow;
    }

    /**
     * Get 基于Get参数名限流 
     * @return GetParamsName 基于Get参数名限流
     */
    public MatchOption getGetParamsName() {
        return this.GetParamsName;
    }

    /**
     * Set 基于Get参数名限流
     * @param GetParamsName 基于Get参数名限流
     */
    public void setGetParamsName(MatchOption GetParamsName) {
        this.GetParamsName = GetParamsName;
    }

    /**
     * Get 基于Get参数值限流 
     * @return GetParamsValue 基于Get参数值限流
     */
    public MatchOption getGetParamsValue() {
        return this.GetParamsValue;
    }

    /**
     * Set 基于Get参数值限流
     * @param GetParamsValue 基于Get参数值限流
     */
    public void setGetParamsValue(MatchOption GetParamsValue) {
        this.GetParamsValue = GetParamsValue;
    }

    /**
     * Get 基于Post参数名限流 
     * @return PostParamsName 基于Post参数名限流
     */
    public MatchOption getPostParamsName() {
        return this.PostParamsName;
    }

    /**
     * Set 基于Post参数名限流
     * @param PostParamsName 基于Post参数名限流
     */
    public void setPostParamsName(MatchOption PostParamsName) {
        this.PostParamsName = PostParamsName;
    }

    /**
     * Get 基于Post参数值限流 
     * @return PostParamsValue 基于Post参数值限流
     */
    public MatchOption getPostParamsValue() {
        return this.PostParamsValue;
    }

    /**
     * Set 基于Post参数值限流
     * @param PostParamsValue 基于Post参数值限流
     */
    public void setPostParamsValue(MatchOption PostParamsValue) {
        this.PostParamsValue = PostParamsValue;
    }

    /**
     * Get 基于IP归属地限流 
     * @return IpLocation 基于IP归属地限流
     */
    public MatchOption getIpLocation() {
        return this.IpLocation;
    }

    /**
     * Set 基于IP归属地限流
     * @param IpLocation 基于IP归属地限流
     */
    public void setIpLocation(MatchOption IpLocation) {
        this.IpLocation = IpLocation;
    }

    /**
     * Get 重定向信息,当LimitStrategy为重定向时，此字段必填 
     * @return RedirectInfo 重定向信息,当LimitStrategy为重定向时，此字段必填
     */
    public RedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set 重定向信息,当LimitStrategy为重定向时，此字段必填
     * @param RedirectInfo 重定向信息,当LimitStrategy为重定向时，此字段必填
     */
    public void setRedirectInfo(RedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    /**
     * Get 拦截页面,0表示429，否则填写blockPageID 
     * @return BlockPage 拦截页面,0表示429，否则填写blockPageID
     */
    public Long getBlockPage() {
        return this.BlockPage;
    }

    /**
     * Set 拦截页面,0表示429，否则填写blockPageID
     * @param BlockPage 拦截页面,0表示429，否则填写blockPageID
     */
    public void setBlockPage(Long BlockPage) {
        this.BlockPage = BlockPage;
    }

    /**
     * Get 限流对象来源，0：手动填写，1：API资产 
     * @return ObjectSrc 限流对象来源，0：手动填写，1：API资产
     */
    public Long getObjectSrc() {
        return this.ObjectSrc;
    }

    /**
     * Set 限流对象来源，0：手动填写，1：API资产
     * @param ObjectSrc 限流对象来源，0：手动填写，1：API资产
     */
    public void setObjectSrc(Long ObjectSrc) {
        this.ObjectSrc = ObjectSrc;
    }

    /**
     * Get 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额 
     * @return QuotaShare 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
     */
    public Boolean getQuotaShare() {
        return this.QuotaShare;
    }

    /**
     * Set 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
     * @param QuotaShare 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
     */
    public void setQuotaShare(Boolean QuotaShare) {
        this.QuotaShare = QuotaShare;
    }

    /**
     * Get 路径选项,可配置每个路径的请求方法 
     * @return PathsOption 路径选项,可配置每个路径的请求方法
     */
    public PathItem [] getPathsOption() {
        return this.PathsOption;
    }

    /**
     * Set 路径选项,可配置每个路径的请求方法
     * @param PathsOption 路径选项,可配置每个路径的请求方法
     */
    public void setPathsOption(PathItem [] PathsOption) {
        this.PathsOption = PathsOption;
    }

    /**
     * Get 限流执行顺序，0：默认情况，限流优先，1：安全防护优先 
     * @return Order 限流执行顺序，0：默认情况，限流优先，1：安全防护优先
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 限流执行顺序，0：默认情况，限流优先，1：安全防护优先
     * @param Order 限流执行顺序，0：默认情况，限流优先，1：安全防护优先
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public UpdateRateLimitV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRateLimitV2Request(UpdateRateLimitV2Request source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LimitRuleId != null) {
            this.LimitRuleId = new Long(source.LimitRuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LimitObject != null) {
            this.LimitObject = new String(source.LimitObject);
        }
        if (source.LimitStrategy != null) {
            this.LimitStrategy = new Long(source.LimitStrategy);
        }
        if (source.LimitHeaderName != null) {
            this.LimitHeaderName = new LimitHeaderName(source.LimitHeaderName);
        }
        if (source.LimitMethod != null) {
            this.LimitMethod = new LimitMethod(source.LimitMethod);
        }
        if (source.LimitPaths != null) {
            this.LimitPaths = new LimitPath(source.LimitPaths);
        }
        if (source.LimitHeaders != null) {
            this.LimitHeaders = new LimitHeader[source.LimitHeaders.length];
            for (int i = 0; i < source.LimitHeaders.length; i++) {
                this.LimitHeaders[i] = new LimitHeader(source.LimitHeaders[i]);
            }
        }
        if (source.LimitWindow != null) {
            this.LimitWindow = new LimitWindow(source.LimitWindow);
        }
        if (source.GetParamsName != null) {
            this.GetParamsName = new MatchOption(source.GetParamsName);
        }
        if (source.GetParamsValue != null) {
            this.GetParamsValue = new MatchOption(source.GetParamsValue);
        }
        if (source.PostParamsName != null) {
            this.PostParamsName = new MatchOption(source.PostParamsName);
        }
        if (source.PostParamsValue != null) {
            this.PostParamsValue = new MatchOption(source.PostParamsValue);
        }
        if (source.IpLocation != null) {
            this.IpLocation = new MatchOption(source.IpLocation);
        }
        if (source.RedirectInfo != null) {
            this.RedirectInfo = new RedirectInfo(source.RedirectInfo);
        }
        if (source.BlockPage != null) {
            this.BlockPage = new Long(source.BlockPage);
        }
        if (source.ObjectSrc != null) {
            this.ObjectSrc = new Long(source.ObjectSrc);
        }
        if (source.QuotaShare != null) {
            this.QuotaShare = new Boolean(source.QuotaShare);
        }
        if (source.PathsOption != null) {
            this.PathsOption = new PathItem[source.PathsOption.length];
            for (int i = 0; i < source.PathsOption.length; i++) {
                this.PathsOption[i] = new PathItem(source.PathsOption[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LimitRuleId", this.LimitRuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LimitObject", this.LimitObject);
        this.setParamSimple(map, prefix + "LimitStrategy", this.LimitStrategy);
        this.setParamObj(map, prefix + "LimitHeaderName.", this.LimitHeaderName);
        this.setParamObj(map, prefix + "LimitMethod.", this.LimitMethod);
        this.setParamObj(map, prefix + "LimitPaths.", this.LimitPaths);
        this.setParamArrayObj(map, prefix + "LimitHeaders.", this.LimitHeaders);
        this.setParamObj(map, prefix + "LimitWindow.", this.LimitWindow);
        this.setParamObj(map, prefix + "GetParamsName.", this.GetParamsName);
        this.setParamObj(map, prefix + "GetParamsValue.", this.GetParamsValue);
        this.setParamObj(map, prefix + "PostParamsName.", this.PostParamsName);
        this.setParamObj(map, prefix + "PostParamsValue.", this.PostParamsValue);
        this.setParamObj(map, prefix + "IpLocation.", this.IpLocation);
        this.setParamObj(map, prefix + "RedirectInfo.", this.RedirectInfo);
        this.setParamSimple(map, prefix + "BlockPage", this.BlockPage);
        this.setParamSimple(map, prefix + "ObjectSrc", this.ObjectSrc);
        this.setParamSimple(map, prefix + "QuotaShare", this.QuotaShare);
        this.setParamArrayObj(map, prefix + "PathsOption.", this.PathsOption);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

