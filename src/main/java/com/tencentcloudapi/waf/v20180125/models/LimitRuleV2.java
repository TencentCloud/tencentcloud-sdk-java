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

public class LimitRuleV2 extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("LimitRuleID")
    @Expose
    private Long LimitRuleID;

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
    * 规则开关，0表示关闭，1表示开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 时间戳
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * 限流对象，API或Domain
    */
    @SerializedName("LimitObject")
    @Expose
    private String LimitObject;

    /**
    * 限流方法名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitMethod")
    @Expose
    private LimitMethod LimitMethod;

    /**
    * 路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitPaths")
    @Expose
    private LimitPath LimitPaths;

    /**
    * Header参数
注意：此字段可能返回 null，表示取不到有效值。
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
    * 限流策略，0:观察,1:拦截，2:人机
    */
    @SerializedName("LimitStrategy")
    @Expose
    private Long LimitStrategy;

    /**
    * Header参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitHeaderName")
    @Expose
    private LimitHeaderName LimitHeaderName;

    /**
    * Get参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GetParamsName")
    @Expose
    private MatchOption GetParamsName;

    /**
    * Get参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GetParamsValue")
    @Expose
    private MatchOption GetParamsValue;

    /**
    * Post参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostParamsName")
    @Expose
    private MatchOption PostParamsName;

    /**
    * Post参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostParamsValue")
    @Expose
    private MatchOption PostParamsValue;

    /**
    * Ip属地
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpLocation")
    @Expose
    private MatchOption IpLocation;

    /**
    * 重定向信息，当LimitStrategy为2时，此字段不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectInfo")
    @Expose
    private RedirectInfo RedirectInfo;

    /**
    * 拦截页面，0表示429，否则为BlockPageID
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathsOption")
    @Expose
    private PathItem [] PathsOption;

    /**
    * 574新增需求，限流执行顺序，0：默认情况，限流优先，1：安全防护优先
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get 规则ID 
     * @return LimitRuleID 规则ID
     */
    public Long getLimitRuleID() {
        return this.LimitRuleID;
    }

    /**
     * Set 规则ID
     * @param LimitRuleID 规则ID
     */
    public void setLimitRuleID(Long LimitRuleID) {
        this.LimitRuleID = LimitRuleID;
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
     * Get 规则开关，0表示关闭，1表示开启 
     * @return Status 规则开关，0表示关闭，1表示开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关，0表示关闭，1表示开启
     * @param Status 规则开关，0表示关闭，1表示开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 时间戳 
     * @return TsVersion 时间戳
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set 时间戳
     * @param TsVersion 时间戳
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get 限流对象，API或Domain 
     * @return LimitObject 限流对象，API或Domain
     */
    public String getLimitObject() {
        return this.LimitObject;
    }

    /**
     * Set 限流对象，API或Domain
     * @param LimitObject 限流对象，API或Domain
     */
    public void setLimitObject(String LimitObject) {
        this.LimitObject = LimitObject;
    }

    /**
     * Get 限流方法名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitMethod 限流方法名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LimitMethod getLimitMethod() {
        return this.LimitMethod;
    }

    /**
     * Set 限流方法名
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitMethod 限流方法名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitMethod(LimitMethod LimitMethod) {
        this.LimitMethod = LimitMethod;
    }

    /**
     * Get 路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitPaths 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LimitPath getLimitPaths() {
        return this.LimitPaths;
    }

    /**
     * Set 路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitPaths 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitPaths(LimitPath LimitPaths) {
        this.LimitPaths = LimitPaths;
    }

    /**
     * Get Header参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitHeaders Header参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LimitHeader [] getLimitHeaders() {
        return this.LimitHeaders;
    }

    /**
     * Set Header参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitHeaders Header参数
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get Header参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitHeaderName Header参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LimitHeaderName getLimitHeaderName() {
        return this.LimitHeaderName;
    }

    /**
     * Set Header参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitHeaderName Header参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitHeaderName(LimitHeaderName LimitHeaderName) {
        this.LimitHeaderName = LimitHeaderName;
    }

    /**
     * Get Get参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GetParamsName Get参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MatchOption getGetParamsName() {
        return this.GetParamsName;
    }

    /**
     * Set Get参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param GetParamsName Get参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGetParamsName(MatchOption GetParamsName) {
        this.GetParamsName = GetParamsName;
    }

    /**
     * Get Get参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GetParamsValue Get参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MatchOption getGetParamsValue() {
        return this.GetParamsValue;
    }

    /**
     * Set Get参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param GetParamsValue Get参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGetParamsValue(MatchOption GetParamsValue) {
        this.GetParamsValue = GetParamsValue;
    }

    /**
     * Get Post参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostParamsName Post参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MatchOption getPostParamsName() {
        return this.PostParamsName;
    }

    /**
     * Set Post参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostParamsName Post参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostParamsName(MatchOption PostParamsName) {
        this.PostParamsName = PostParamsName;
    }

    /**
     * Get Post参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostParamsValue Post参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MatchOption getPostParamsValue() {
        return this.PostParamsValue;
    }

    /**
     * Set Post参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostParamsValue Post参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostParamsValue(MatchOption PostParamsValue) {
        this.PostParamsValue = PostParamsValue;
    }

    /**
     * Get Ip属地
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpLocation Ip属地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MatchOption getIpLocation() {
        return this.IpLocation;
    }

    /**
     * Set Ip属地
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpLocation Ip属地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpLocation(MatchOption IpLocation) {
        this.IpLocation = IpLocation;
    }

    /**
     * Get 重定向信息，当LimitStrategy为2时，此字段不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectInfo 重定向信息，当LimitStrategy为2时，此字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set 重定向信息，当LimitStrategy为2时，此字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectInfo 重定向信息，当LimitStrategy为2时，此字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectInfo(RedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    /**
     * Get 拦截页面，0表示429，否则为BlockPageID 
     * @return BlockPage 拦截页面，0表示429，否则为BlockPageID
     */
    public Long getBlockPage() {
        return this.BlockPage;
    }

    /**
     * Set 拦截页面，0表示429，否则为BlockPageID
     * @param BlockPage 拦截页面，0表示429，否则为BlockPageID
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathsOption 路径选项,可配置每个路径的请求方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PathItem [] getPathsOption() {
        return this.PathsOption;
    }

    /**
     * Set 路径选项,可配置每个路径的请求方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathsOption 路径选项,可配置每个路径的请求方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathsOption(PathItem [] PathsOption) {
        this.PathsOption = PathsOption;
    }

    /**
     * Get 574新增需求，限流执行顺序，0：默认情况，限流优先，1：安全防护优先 
     * @return Order 574新增需求，限流执行顺序，0：默认情况，限流优先，1：安全防护优先
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 574新增需求，限流执行顺序，0：默认情况，限流优先，1：安全防护优先
     * @param Order 574新增需求，限流执行顺序，0：默认情况，限流优先，1：安全防护优先
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public LimitRuleV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitRuleV2(LimitRuleV2 source) {
        if (source.LimitRuleID != null) {
            this.LimitRuleID = new Long(source.LimitRuleID);
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
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.LimitObject != null) {
            this.LimitObject = new String(source.LimitObject);
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
        if (source.LimitStrategy != null) {
            this.LimitStrategy = new Long(source.LimitStrategy);
        }
        if (source.LimitHeaderName != null) {
            this.LimitHeaderName = new LimitHeaderName(source.LimitHeaderName);
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
        this.setParamSimple(map, prefix + "LimitRuleID", this.LimitRuleID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "LimitObject", this.LimitObject);
        this.setParamObj(map, prefix + "LimitMethod.", this.LimitMethod);
        this.setParamObj(map, prefix + "LimitPaths.", this.LimitPaths);
        this.setParamArrayObj(map, prefix + "LimitHeaders.", this.LimitHeaders);
        this.setParamObj(map, prefix + "LimitWindow.", this.LimitWindow);
        this.setParamSimple(map, prefix + "LimitStrategy", this.LimitStrategy);
        this.setParamObj(map, prefix + "LimitHeaderName.", this.LimitHeaderName);
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

