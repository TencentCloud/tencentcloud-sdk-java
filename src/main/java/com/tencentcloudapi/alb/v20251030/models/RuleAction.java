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

public class RuleAction extends AbstractModel {

    /**
    * 转发动作执行顺序，不能重复，按从小到大顺序执行。取值范围：1 ~ 50000。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 固定响应内容配置。
    */
    @SerializedName("FixedResponseConfig")
    @Expose
    private FixedResponseInfo FixedResponseConfig;

    /**
    * 插入HTTP Header配置。
    */
    @SerializedName("InsertHeaderConfig")
    @Expose
    private InsertHTTPHeaderInfo InsertHeaderConfig;

    /**
    * 重定向配置。除HttpCode外，其他配置不能都使用默认值。
    */
    @SerializedName("RedirectConfig")
    @Expose
    private HTTPRedirectInfo RedirectConfig;

    /**
    * 删除HTTP Header配置。
    */
    @SerializedName("RemoveHeaderConfig")
    @Expose
    private RemoveHTTPHeaderInfo RemoveHeaderConfig;

    /**
    * 重写配置。
    */
    @SerializedName("RewriteConfig")
    @Expose
    private HTTPRewriteInfo RewriteConfig;

    /**
    * 转发目标组配置。
    */
    @SerializedName("TargetGroupConfig")
    @Expose
    private TargetGroupConfig TargetGroupConfig;

    /**
     * Get 转发动作执行顺序，不能重复，按从小到大顺序执行。取值范围：1 ~ 50000。 
     * @return Order 转发动作执行顺序，不能重复，按从小到大顺序执行。取值范围：1 ~ 50000。
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 转发动作执行顺序，不能重复，按从小到大顺序执行。取值范围：1 ~ 50000。
     * @param Order 转发动作执行顺序，不能重复，按从小到大顺序执行。取值范围：1 ~ 50000。
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。 
     * @return Type 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。
     * @param Type 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 固定响应内容配置。 
     * @return FixedResponseConfig 固定响应内容配置。
     */
    public FixedResponseInfo getFixedResponseConfig() {
        return this.FixedResponseConfig;
    }

    /**
     * Set 固定响应内容配置。
     * @param FixedResponseConfig 固定响应内容配置。
     */
    public void setFixedResponseConfig(FixedResponseInfo FixedResponseConfig) {
        this.FixedResponseConfig = FixedResponseConfig;
    }

    /**
     * Get 插入HTTP Header配置。 
     * @return InsertHeaderConfig 插入HTTP Header配置。
     */
    public InsertHTTPHeaderInfo getInsertHeaderConfig() {
        return this.InsertHeaderConfig;
    }

    /**
     * Set 插入HTTP Header配置。
     * @param InsertHeaderConfig 插入HTTP Header配置。
     */
    public void setInsertHeaderConfig(InsertHTTPHeaderInfo InsertHeaderConfig) {
        this.InsertHeaderConfig = InsertHeaderConfig;
    }

    /**
     * Get 重定向配置。除HttpCode外，其他配置不能都使用默认值。 
     * @return RedirectConfig 重定向配置。除HttpCode外，其他配置不能都使用默认值。
     */
    public HTTPRedirectInfo getRedirectConfig() {
        return this.RedirectConfig;
    }

    /**
     * Set 重定向配置。除HttpCode外，其他配置不能都使用默认值。
     * @param RedirectConfig 重定向配置。除HttpCode外，其他配置不能都使用默认值。
     */
    public void setRedirectConfig(HTTPRedirectInfo RedirectConfig) {
        this.RedirectConfig = RedirectConfig;
    }

    /**
     * Get 删除HTTP Header配置。 
     * @return RemoveHeaderConfig 删除HTTP Header配置。
     */
    public RemoveHTTPHeaderInfo getRemoveHeaderConfig() {
        return this.RemoveHeaderConfig;
    }

    /**
     * Set 删除HTTP Header配置。
     * @param RemoveHeaderConfig 删除HTTP Header配置。
     */
    public void setRemoveHeaderConfig(RemoveHTTPHeaderInfo RemoveHeaderConfig) {
        this.RemoveHeaderConfig = RemoveHeaderConfig;
    }

    /**
     * Get 重写配置。 
     * @return RewriteConfig 重写配置。
     */
    public HTTPRewriteInfo getRewriteConfig() {
        return this.RewriteConfig;
    }

    /**
     * Set 重写配置。
     * @param RewriteConfig 重写配置。
     */
    public void setRewriteConfig(HTTPRewriteInfo RewriteConfig) {
        this.RewriteConfig = RewriteConfig;
    }

    /**
     * Get 转发目标组配置。 
     * @return TargetGroupConfig 转发目标组配置。
     */
    public TargetGroupConfig getTargetGroupConfig() {
        return this.TargetGroupConfig;
    }

    /**
     * Set 转发目标组配置。
     * @param TargetGroupConfig 转发目标组配置。
     */
    public void setTargetGroupConfig(TargetGroupConfig TargetGroupConfig) {
        this.TargetGroupConfig = TargetGroupConfig;
    }

    public RuleAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleAction(RuleAction source) {
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FixedResponseConfig != null) {
            this.FixedResponseConfig = new FixedResponseInfo(source.FixedResponseConfig);
        }
        if (source.InsertHeaderConfig != null) {
            this.InsertHeaderConfig = new InsertHTTPHeaderInfo(source.InsertHeaderConfig);
        }
        if (source.RedirectConfig != null) {
            this.RedirectConfig = new HTTPRedirectInfo(source.RedirectConfig);
        }
        if (source.RemoveHeaderConfig != null) {
            this.RemoveHeaderConfig = new RemoveHTTPHeaderInfo(source.RemoveHeaderConfig);
        }
        if (source.RewriteConfig != null) {
            this.RewriteConfig = new HTTPRewriteInfo(source.RewriteConfig);
        }
        if (source.TargetGroupConfig != null) {
            this.TargetGroupConfig = new TargetGroupConfig(source.TargetGroupConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "FixedResponseConfig.", this.FixedResponseConfig);
        this.setParamObj(map, prefix + "InsertHeaderConfig.", this.InsertHeaderConfig);
        this.setParamObj(map, prefix + "RedirectConfig.", this.RedirectConfig);
        this.setParamObj(map, prefix + "RemoveHeaderConfig.", this.RemoveHeaderConfig);
        this.setParamObj(map, prefix + "RewriteConfig.", this.RewriteConfig);
        this.setParamObj(map, prefix + "TargetGroupConfig.", this.TargetGroupConfig);

    }
}

