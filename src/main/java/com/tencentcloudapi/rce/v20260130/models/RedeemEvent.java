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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedeemEvent extends AbstractModel {

    /**
    * <p>营销活动ID</p>
    */
    @SerializedName("PromotionId")
    @Expose
    private String PromotionId;

    /**
    * <p>营销活动名称</p>
    */
    @SerializedName("PromotionName")
    @Expose
    private String PromotionName;

    /**
    * <p>营销活动描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>邀请人ID</p>
    */
    @SerializedName("InviterUserId")
    @Expose
    private String InviterUserId;

    /**
    * <p>兑奖关联的订单信息</p>
    */
    @SerializedName("Order")
    @Expose
    private Order Order;

    /**
    * <p>兑奖结果</p>
    */
    @SerializedName("Result")
    @Expose
    private Result Result;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>营销活动ID</p> 
     * @return PromotionId <p>营销活动ID</p>
     */
    public String getPromotionId() {
        return this.PromotionId;
    }

    /**
     * Set <p>营销活动ID</p>
     * @param PromotionId <p>营销活动ID</p>
     */
    public void setPromotionId(String PromotionId) {
        this.PromotionId = PromotionId;
    }

    /**
     * Get <p>营销活动名称</p> 
     * @return PromotionName <p>营销活动名称</p>
     */
    public String getPromotionName() {
        return this.PromotionName;
    }

    /**
     * Set <p>营销活动名称</p>
     * @param PromotionName <p>营销活动名称</p>
     */
    public void setPromotionName(String PromotionName) {
        this.PromotionName = PromotionName;
    }

    /**
     * Get <p>营销活动描述</p> 
     * @return Description <p>营销活动描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>营销活动描述</p>
     * @param Description <p>营销活动描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>邀请人ID</p> 
     * @return InviterUserId <p>邀请人ID</p>
     */
    public String getInviterUserId() {
        return this.InviterUserId;
    }

    /**
     * Set <p>邀请人ID</p>
     * @param InviterUserId <p>邀请人ID</p>
     */
    public void setInviterUserId(String InviterUserId) {
        this.InviterUserId = InviterUserId;
    }

    /**
     * Get <p>兑奖关联的订单信息</p> 
     * @return Order <p>兑奖关联的订单信息</p>
     */
    public Order getOrder() {
        return this.Order;
    }

    /**
     * Set <p>兑奖关联的订单信息</p>
     * @param Order <p>兑奖关联的订单信息</p>
     */
    public void setOrder(Order Order) {
        this.Order = Order;
    }

    /**
     * Get <p>兑奖结果</p> 
     * @return Result <p>兑奖结果</p>
     */
    public Result getResult() {
        return this.Result;
    }

    /**
     * Set <p>兑奖结果</p>
     * @param Result <p>兑奖结果</p>
     */
    public void setResult(Result Result) {
        this.Result = Result;
    }

    /**
     * Get <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public RedeemEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedeemEvent(RedeemEvent source) {
        if (source.PromotionId != null) {
            this.PromotionId = new String(source.PromotionId);
        }
        if (source.PromotionName != null) {
            this.PromotionName = new String(source.PromotionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InviterUserId != null) {
            this.InviterUserId = new String(source.InviterUserId);
        }
        if (source.Order != null) {
            this.Order = new Order(source.Order);
        }
        if (source.Result != null) {
            this.Result = new Result(source.Result);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromotionId", this.PromotionId);
        this.setParamSimple(map, prefix + "PromotionName", this.PromotionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InviterUserId", this.InviterUserId);
        this.setParamObj(map, prefix + "Order.", this.Order);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

