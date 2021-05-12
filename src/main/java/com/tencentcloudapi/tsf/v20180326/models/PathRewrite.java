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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathRewrite extends AbstractModel{

    /**
    * 路径重写规则ID
    */
    @SerializedName("PathRewriteId")
    @Expose
    private String PathRewriteId;

    /**
    * 网关部署组ID
    */
    @SerializedName("GatewayGroupId")
    @Expose
    private String GatewayGroupId;

    /**
    * 正则表达式
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * 替换的内容
    */
    @SerializedName("Replacement")
    @Expose
    private String Replacement;

    /**
    * 是否屏蔽映射后路径，Y: 是 N: 否
    */
    @SerializedName("Blocked")
    @Expose
    private String Blocked;

    /**
    * 规则顺序，越小优先级越高
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get 路径重写规则ID 
     * @return PathRewriteId 路径重写规则ID
     */
    public String getPathRewriteId() {
        return this.PathRewriteId;
    }

    /**
     * Set 路径重写规则ID
     * @param PathRewriteId 路径重写规则ID
     */
    public void setPathRewriteId(String PathRewriteId) {
        this.PathRewriteId = PathRewriteId;
    }

    /**
     * Get 网关部署组ID 
     * @return GatewayGroupId 网关部署组ID
     */
    public String getGatewayGroupId() {
        return this.GatewayGroupId;
    }

    /**
     * Set 网关部署组ID
     * @param GatewayGroupId 网关部署组ID
     */
    public void setGatewayGroupId(String GatewayGroupId) {
        this.GatewayGroupId = GatewayGroupId;
    }

    /**
     * Get 正则表达式 
     * @return Regex 正则表达式
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 正则表达式
     * @param Regex 正则表达式
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get 替换的内容 
     * @return Replacement 替换的内容
     */
    public String getReplacement() {
        return this.Replacement;
    }

    /**
     * Set 替换的内容
     * @param Replacement 替换的内容
     */
    public void setReplacement(String Replacement) {
        this.Replacement = Replacement;
    }

    /**
     * Get 是否屏蔽映射后路径，Y: 是 N: 否 
     * @return Blocked 是否屏蔽映射后路径，Y: 是 N: 否
     */
    public String getBlocked() {
        return this.Blocked;
    }

    /**
     * Set 是否屏蔽映射后路径，Y: 是 N: 否
     * @param Blocked 是否屏蔽映射后路径，Y: 是 N: 否
     */
    public void setBlocked(String Blocked) {
        this.Blocked = Blocked;
    }

    /**
     * Get 规则顺序，越小优先级越高 
     * @return Order 规则顺序，越小优先级越高
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 规则顺序，越小优先级越高
     * @param Order 规则顺序，越小优先级越高
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public PathRewrite() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathRewrite(PathRewrite source) {
        if (source.PathRewriteId != null) {
            this.PathRewriteId = new String(source.PathRewriteId);
        }
        if (source.GatewayGroupId != null) {
            this.GatewayGroupId = new String(source.GatewayGroupId);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.Replacement != null) {
            this.Replacement = new String(source.Replacement);
        }
        if (source.Blocked != null) {
            this.Blocked = new String(source.Blocked);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PathRewriteId", this.PathRewriteId);
        this.setParamSimple(map, prefix + "GatewayGroupId", this.GatewayGroupId);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Replacement", this.Replacement);
        this.setParamSimple(map, prefix + "Blocked", this.Blocked);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

