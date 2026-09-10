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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWMCPRoute extends AbstractModel {

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>路由表达式</p>
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
    * <p>Header匹配规则</p>
    */
    @SerializedName("HeaderMatch")
    @Expose
    private AIGWHeaderRule [] HeaderMatch;

    /**
    * <p>是否为默认路由</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>http path</p>
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * <p>路由名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>路由路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>路径匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
    */
    @SerializedName("PathMatchType")
    @Expose
    private String PathMatchType;

    /**
    * <p>优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>路由ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * <p>启用/禁用状态</p><p>枚举值：</p><ul><li>Enabled： 启用</li><li>Disabled： 禁用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否开启保留原Host功能</p>
    */
    @SerializedName("PreserveHost")
    @Expose
    private Boolean PreserveHost;

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>路由表达式</p> 
     * @return Expression <p>路由表达式</p>
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set <p>路由表达式</p>
     * @param Expression <p>路由表达式</p>
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * Get <p>Header匹配规则</p> 
     * @return HeaderMatch <p>Header匹配规则</p>
     */
    public AIGWHeaderRule [] getHeaderMatch() {
        return this.HeaderMatch;
    }

    /**
     * Set <p>Header匹配规则</p>
     * @param HeaderMatch <p>Header匹配规则</p>
     */
    public void setHeaderMatch(AIGWHeaderRule [] HeaderMatch) {
        this.HeaderMatch = HeaderMatch;
    }

    /**
     * Get <p>是否为默认路由</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return IsDefault <p>是否为默认路由</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否为默认路由</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param IsDefault <p>是否为默认路由</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>http path</p> 
     * @return Methods <p>http path</p>
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set <p>http path</p>
     * @param Methods <p>http path</p>
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get <p>路由名称</p> 
     * @return Name <p>路由名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>路由名称</p>
     * @param Name <p>路由名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>路由路径</p> 
     * @return Path <p>路由路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>路由路径</p>
     * @param Path <p>路由路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>路径匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul> 
     * @return PathMatchType <p>路径匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     */
    public String getPathMatchType() {
        return this.PathMatchType;
    }

    /**
     * Set <p>路径匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     * @param PathMatchType <p>路径匹配方式</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     */
    public void setPathMatchType(String PathMatchType) {
        this.PathMatchType = PathMatchType;
    }

    /**
     * Get <p>优先级</p> 
     * @return Priority <p>优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级</p>
     * @param Priority <p>优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>路由ID</p> 
     * @return RouteId <p>路由ID</p>
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>路由ID</p>
     * @param RouteId <p>路由ID</p>
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>启用/禁用状态</p><p>枚举值：</p><ul><li>Enabled： 启用</li><li>Disabled： 禁用</li></ul> 
     * @return Status <p>启用/禁用状态</p><p>枚举值：</p><ul><li>Enabled： 启用</li><li>Disabled： 禁用</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>启用/禁用状态</p><p>枚举值：</p><ul><li>Enabled： 启用</li><li>Disabled： 禁用</li></ul>
     * @param Status <p>启用/禁用状态</p><p>枚举值：</p><ul><li>Enabled： 启用</li><li>Disabled： 禁用</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否开启保留原Host功能</p> 
     * @return PreserveHost <p>是否开启保留原Host功能</p>
     */
    public Boolean getPreserveHost() {
        return this.PreserveHost;
    }

    /**
     * Set <p>是否开启保留原Host功能</p>
     * @param PreserveHost <p>是否开启保留原Host功能</p>
     */
    public void setPreserveHost(Boolean PreserveHost) {
        this.PreserveHost = PreserveHost;
    }

    public AIGWMCPRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWMCPRoute(AIGWMCPRoute source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
        if (source.HeaderMatch != null) {
            this.HeaderMatch = new AIGWHeaderRule[source.HeaderMatch.length];
            for (int i = 0; i < source.HeaderMatch.length; i++) {
                this.HeaderMatch[i] = new AIGWHeaderRule(source.HeaderMatch[i]);
            }
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.PathMatchType != null) {
            this.PathMatchType = new String(source.PathMatchType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PreserveHost != null) {
            this.PreserveHost = new Boolean(source.PreserveHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Expression", this.Expression);
        this.setParamArrayObj(map, prefix + "HeaderMatch.", this.HeaderMatch);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "PathMatchType", this.PathMatchType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PreserveHost", this.PreserveHost);

    }
}

