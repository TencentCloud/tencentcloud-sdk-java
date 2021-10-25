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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderInfo extends AbstractModel{

    /**
    * 订单号
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * 订单要切换的套餐ID
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 订单类型
<li>1 购买</li>
<li>2 续费</li>
<li>3 变配</li>
    */
    @SerializedName("TranType")
    @Expose
    private String TranType;

    /**
    * 订单状态。
<li>1未支付</li>
<li>2 支付中</li>
<li>3 发货中</li>
<li>4 发货成功</li>
<li>5 发货失败</li>
<li>6 已退款</li>
<li>7 已取消</li>
<li>100 已删除</li>
    */
    @SerializedName("TranStatus")
    @Expose
    private String TranStatus;

    /**
    * 订单更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 订单创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 付费模式.
<li>prepayment 预付费</li>
<li>postpaid 后付费</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 订单绑定的扩展ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * 资源初始化结果(仅当ExtensionId不为空时有效): successful(初始化成功), failed(初始化失败), doing(初始化进行中), init(准备初始化)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceReady")
    @Expose
    private String ResourceReady;

    /**
    * 安装标记。建议使用方统一转大小写之后再判断。
<li>QuickStart：快速启动来源</li>
<li>Activity：活动来源</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * 下单时的参数
    */
    @SerializedName("ReqBody")
    @Expose
    private String ReqBody;

    /**
     * Get 订单号 
     * @return TranId 订单号
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set 订单号
     * @param TranId 订单号
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get 订单要切换的套餐ID 
     * @return PackageId 订单要切换的套餐ID
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 订单要切换的套餐ID
     * @param PackageId 订单要切换的套餐ID
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 订单类型
<li>1 购买</li>
<li>2 续费</li>
<li>3 变配</li> 
     * @return TranType 订单类型
<li>1 购买</li>
<li>2 续费</li>
<li>3 变配</li>
     */
    public String getTranType() {
        return this.TranType;
    }

    /**
     * Set 订单类型
<li>1 购买</li>
<li>2 续费</li>
<li>3 变配</li>
     * @param TranType 订单类型
<li>1 购买</li>
<li>2 续费</li>
<li>3 变配</li>
     */
    public void setTranType(String TranType) {
        this.TranType = TranType;
    }

    /**
     * Get 订单状态。
<li>1未支付</li>
<li>2 支付中</li>
<li>3 发货中</li>
<li>4 发货成功</li>
<li>5 发货失败</li>
<li>6 已退款</li>
<li>7 已取消</li>
<li>100 已删除</li> 
     * @return TranStatus 订单状态。
<li>1未支付</li>
<li>2 支付中</li>
<li>3 发货中</li>
<li>4 发货成功</li>
<li>5 发货失败</li>
<li>6 已退款</li>
<li>7 已取消</li>
<li>100 已删除</li>
     */
    public String getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set 订单状态。
<li>1未支付</li>
<li>2 支付中</li>
<li>3 发货中</li>
<li>4 发货成功</li>
<li>5 发货失败</li>
<li>6 已退款</li>
<li>7 已取消</li>
<li>100 已删除</li>
     * @param TranStatus 订单状态。
<li>1未支付</li>
<li>2 支付中</li>
<li>3 发货中</li>
<li>4 发货成功</li>
<li>5 发货失败</li>
<li>6 已退款</li>
<li>7 已取消</li>
<li>100 已删除</li>
     */
    public void setTranStatus(String TranStatus) {
        this.TranStatus = TranStatus;
    }

    /**
     * Get 订单更新时间 
     * @return UpdateTime 订单更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 订单更新时间
     * @param UpdateTime 订单更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 订单创建时间 
     * @return CreateTime 订单创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 订单创建时间
     * @param CreateTime 订单创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 付费模式.
<li>prepayment 预付费</li>
<li>postpaid 后付费</li> 
     * @return PayMode 付费模式.
<li>prepayment 预付费</li>
<li>postpaid 后付费</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式.
<li>prepayment 预付费</li>
<li>postpaid 后付费</li>
     * @param PayMode 付费模式.
<li>prepayment 预付费</li>
<li>postpaid 后付费</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 订单绑定的扩展ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtensionId 订单绑定的扩展ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set 订单绑定的扩展ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtensionId 订单绑定的扩展ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get 资源初始化结果(仅当ExtensionId不为空时有效): successful(初始化成功), failed(初始化失败), doing(初始化进行中), init(准备初始化)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceReady 资源初始化结果(仅当ExtensionId不为空时有效): successful(初始化成功), failed(初始化失败), doing(初始化进行中), init(准备初始化)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceReady() {
        return this.ResourceReady;
    }

    /**
     * Set 资源初始化结果(仅当ExtensionId不为空时有效): successful(初始化成功), failed(初始化失败), doing(初始化进行中), init(准备初始化)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceReady 资源初始化结果(仅当ExtensionId不为空时有效): successful(初始化成功), failed(初始化失败), doing(初始化进行中), init(准备初始化)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceReady(String ResourceReady) {
        this.ResourceReady = ResourceReady;
    }

    /**
     * Get 安装标记。建议使用方统一转大小写之后再判断。
<li>QuickStart：快速启动来源</li>
<li>Activity：活动来源</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Flag 安装标记。建议使用方统一转大小写之后再判断。
<li>QuickStart：快速启动来源</li>
<li>Activity：活动来源</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set 安装标记。建议使用方统一转大小写之后再判断。
<li>QuickStart：快速启动来源</li>
<li>Activity：活动来源</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Flag 安装标记。建议使用方统一转大小写之后再判断。
<li>QuickStart：快速启动来源</li>
<li>Activity：活动来源</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 下单时的参数 
     * @return ReqBody 下单时的参数
     */
    public String getReqBody() {
        return this.ReqBody;
    }

    /**
     * Set 下单时的参数
     * @param ReqBody 下单时的参数
     */
    public void setReqBody(String ReqBody) {
        this.ReqBody = ReqBody;
    }

    public OrderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderInfo(OrderInfo source) {
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.TranType != null) {
            this.TranType = new String(source.TranType);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new String(source.TranStatus);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ExtensionId != null) {
            this.ExtensionId = new String(source.ExtensionId);
        }
        if (source.ResourceReady != null) {
            this.ResourceReady = new String(source.ResourceReady);
        }
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
        if (source.ReqBody != null) {
            this.ReqBody = new String(source.ReqBody);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "TranType", this.TranType);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExtensionId", this.ExtensionId);
        this.setParamSimple(map, prefix + "ResourceReady", this.ResourceReady);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "ReqBody", this.ReqBody);

    }
}

