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

public class TransactionEvent extends AbstractModel {

    /**
    * <p>交易唯一标识</p>
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * <p>您系统中的订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String [] OrderId;

    /**
    * <p>交易金额</p>
    */
    @SerializedName("PaymentAmount")
    @Expose
    private Amount PaymentAmount;

    /**
    * <p>支付方式，支持多种支付方式</p>
    */
    @SerializedName("PaymentMethod")
    @Expose
    private PaymentMethod PaymentMethod;

    /**
    * <p>交易类型</p><p>枚举值：</p><ul><li>sale： 一次性完成授权与扣款（最常见）</li><li>authorize： 仅授权（冻结金额）</li><li>capture： 执行扣款（在授权后）</li><li>void： 取消待处理的授权或扣款</li><li>refund： 退款（部分或全部）</li><li>deposit： 向账户存款</li><li>withdrawal： 从账户提现</li><li>transfer： 账户间转账</li><li>buy： 购买资产（如加密货币）</li><li>sell： 出售资产</li><li>send： 发送资金/资产（如跨钱包转账）</li><li>receive： 接收资金/资产</li></ul><p>默认值：sale</p>
    */
    @SerializedName("TransactionType")
    @Expose
    private String TransactionType;

    /**
    * <p>账单信息</p>
    */
    @SerializedName("Billing")
    @Expose
    private Billing Billing;

    /**
    * <p>物流信息</p>
    */
    @SerializedName("Delivery")
    @Expose
    private Delivery Delivery;

    /**
    * <p>商家信息</p>
    */
    @SerializedName("Merchant")
    @Expose
    private Merchant Merchant;

    /**
    * <p>支付结果</p>
    */
    @SerializedName("PaymentResult")
    @Expose
    private PaymentResult PaymentResult;

    /**
    * <p>接收方的用户ID，适用于 transfer 交易类型</p>
    */
    @SerializedName("TransferRecipientUserId")
    @Expose
    private String TransferRecipientUserId;

    /**
    * <p>发送方的物理地址，适用于 transfer 交易类型</p>
    */
    @SerializedName("TransferSentAddress")
    @Expose
    private Address TransferSentAddress;

    /**
    * <p>接收方的物理地址，适用于 transfer 交易类型</p>
    */
    @SerializedName("TransferReceivedAddress")
    @Expose
    private Address TransferReceivedAddress;

    /**
    * <p>数字订单列表</p>
    */
    @SerializedName("DigitalOrders")
    @Expose
    private DigitalOrder [] DigitalOrders;

    /**
    * <p>接收加密货币的钱包</p>
    */
    @SerializedName("ReceiverWallet")
    @Expose
    private Wallet ReceiverWallet;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>交易唯一标识</p> 
     * @return TransactionId <p>交易唯一标识</p>
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>交易唯一标识</p>
     * @param TransactionId <p>交易唯一标识</p>
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>您系统中的订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p> 
     * @return OrderId <p>您系统中的订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p>
     */
    public String [] getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>您系统中的订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p>
     * @param OrderId <p>您系统中的订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p>
     */
    public void setOrderId(String [] OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>交易金额</p> 
     * @return PaymentAmount <p>交易金额</p>
     */
    public Amount getPaymentAmount() {
        return this.PaymentAmount;
    }

    /**
     * Set <p>交易金额</p>
     * @param PaymentAmount <p>交易金额</p>
     */
    public void setPaymentAmount(Amount PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    /**
     * Get <p>支付方式，支持多种支付方式</p> 
     * @return PaymentMethod <p>支付方式，支持多种支付方式</p>
     */
    public PaymentMethod getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set <p>支付方式，支持多种支付方式</p>
     * @param PaymentMethod <p>支付方式，支持多种支付方式</p>
     */
    public void setPaymentMethod(PaymentMethod PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get <p>交易类型</p><p>枚举值：</p><ul><li>sale： 一次性完成授权与扣款（最常见）</li><li>authorize： 仅授权（冻结金额）</li><li>capture： 执行扣款（在授权后）</li><li>void： 取消待处理的授权或扣款</li><li>refund： 退款（部分或全部）</li><li>deposit： 向账户存款</li><li>withdrawal： 从账户提现</li><li>transfer： 账户间转账</li><li>buy： 购买资产（如加密货币）</li><li>sell： 出售资产</li><li>send： 发送资金/资产（如跨钱包转账）</li><li>receive： 接收资金/资产</li></ul><p>默认值：sale</p> 
     * @return TransactionType <p>交易类型</p><p>枚举值：</p><ul><li>sale： 一次性完成授权与扣款（最常见）</li><li>authorize： 仅授权（冻结金额）</li><li>capture： 执行扣款（在授权后）</li><li>void： 取消待处理的授权或扣款</li><li>refund： 退款（部分或全部）</li><li>deposit： 向账户存款</li><li>withdrawal： 从账户提现</li><li>transfer： 账户间转账</li><li>buy： 购买资产（如加密货币）</li><li>sell： 出售资产</li><li>send： 发送资金/资产（如跨钱包转账）</li><li>receive： 接收资金/资产</li></ul><p>默认值：sale</p>
     */
    public String getTransactionType() {
        return this.TransactionType;
    }

    /**
     * Set <p>交易类型</p><p>枚举值：</p><ul><li>sale： 一次性完成授权与扣款（最常见）</li><li>authorize： 仅授权（冻结金额）</li><li>capture： 执行扣款（在授权后）</li><li>void： 取消待处理的授权或扣款</li><li>refund： 退款（部分或全部）</li><li>deposit： 向账户存款</li><li>withdrawal： 从账户提现</li><li>transfer： 账户间转账</li><li>buy： 购买资产（如加密货币）</li><li>sell： 出售资产</li><li>send： 发送资金/资产（如跨钱包转账）</li><li>receive： 接收资金/资产</li></ul><p>默认值：sale</p>
     * @param TransactionType <p>交易类型</p><p>枚举值：</p><ul><li>sale： 一次性完成授权与扣款（最常见）</li><li>authorize： 仅授权（冻结金额）</li><li>capture： 执行扣款（在授权后）</li><li>void： 取消待处理的授权或扣款</li><li>refund： 退款（部分或全部）</li><li>deposit： 向账户存款</li><li>withdrawal： 从账户提现</li><li>transfer： 账户间转账</li><li>buy： 购买资产（如加密货币）</li><li>sell： 出售资产</li><li>send： 发送资金/资产（如跨钱包转账）</li><li>receive： 接收资金/资产</li></ul><p>默认值：sale</p>
     */
    public void setTransactionType(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    /**
     * Get <p>账单信息</p> 
     * @return Billing <p>账单信息</p>
     */
    public Billing getBilling() {
        return this.Billing;
    }

    /**
     * Set <p>账单信息</p>
     * @param Billing <p>账单信息</p>
     */
    public void setBilling(Billing Billing) {
        this.Billing = Billing;
    }

    /**
     * Get <p>物流信息</p> 
     * @return Delivery <p>物流信息</p>
     */
    public Delivery getDelivery() {
        return this.Delivery;
    }

    /**
     * Set <p>物流信息</p>
     * @param Delivery <p>物流信息</p>
     */
    public void setDelivery(Delivery Delivery) {
        this.Delivery = Delivery;
    }

    /**
     * Get <p>商家信息</p> 
     * @return Merchant <p>商家信息</p>
     */
    public Merchant getMerchant() {
        return this.Merchant;
    }

    /**
     * Set <p>商家信息</p>
     * @param Merchant <p>商家信息</p>
     */
    public void setMerchant(Merchant Merchant) {
        this.Merchant = Merchant;
    }

    /**
     * Get <p>支付结果</p> 
     * @return PaymentResult <p>支付结果</p>
     */
    public PaymentResult getPaymentResult() {
        return this.PaymentResult;
    }

    /**
     * Set <p>支付结果</p>
     * @param PaymentResult <p>支付结果</p>
     */
    public void setPaymentResult(PaymentResult PaymentResult) {
        this.PaymentResult = PaymentResult;
    }

    /**
     * Get <p>接收方的用户ID，适用于 transfer 交易类型</p> 
     * @return TransferRecipientUserId <p>接收方的用户ID，适用于 transfer 交易类型</p>
     */
    public String getTransferRecipientUserId() {
        return this.TransferRecipientUserId;
    }

    /**
     * Set <p>接收方的用户ID，适用于 transfer 交易类型</p>
     * @param TransferRecipientUserId <p>接收方的用户ID，适用于 transfer 交易类型</p>
     */
    public void setTransferRecipientUserId(String TransferRecipientUserId) {
        this.TransferRecipientUserId = TransferRecipientUserId;
    }

    /**
     * Get <p>发送方的物理地址，适用于 transfer 交易类型</p> 
     * @return TransferSentAddress <p>发送方的物理地址，适用于 transfer 交易类型</p>
     */
    public Address getTransferSentAddress() {
        return this.TransferSentAddress;
    }

    /**
     * Set <p>发送方的物理地址，适用于 transfer 交易类型</p>
     * @param TransferSentAddress <p>发送方的物理地址，适用于 transfer 交易类型</p>
     */
    public void setTransferSentAddress(Address TransferSentAddress) {
        this.TransferSentAddress = TransferSentAddress;
    }

    /**
     * Get <p>接收方的物理地址，适用于 transfer 交易类型</p> 
     * @return TransferReceivedAddress <p>接收方的物理地址，适用于 transfer 交易类型</p>
     */
    public Address getTransferReceivedAddress() {
        return this.TransferReceivedAddress;
    }

    /**
     * Set <p>接收方的物理地址，适用于 transfer 交易类型</p>
     * @param TransferReceivedAddress <p>接收方的物理地址，适用于 transfer 交易类型</p>
     */
    public void setTransferReceivedAddress(Address TransferReceivedAddress) {
        this.TransferReceivedAddress = TransferReceivedAddress;
    }

    /**
     * Get <p>数字订单列表</p> 
     * @return DigitalOrders <p>数字订单列表</p>
     */
    public DigitalOrder [] getDigitalOrders() {
        return this.DigitalOrders;
    }

    /**
     * Set <p>数字订单列表</p>
     * @param DigitalOrders <p>数字订单列表</p>
     */
    public void setDigitalOrders(DigitalOrder [] DigitalOrders) {
        this.DigitalOrders = DigitalOrders;
    }

    /**
     * Get <p>接收加密货币的钱包</p> 
     * @return ReceiverWallet <p>接收加密货币的钱包</p>
     */
    public Wallet getReceiverWallet() {
        return this.ReceiverWallet;
    }

    /**
     * Set <p>接收加密货币的钱包</p>
     * @param ReceiverWallet <p>接收加密货币的钱包</p>
     */
    public void setReceiverWallet(Wallet ReceiverWallet) {
        this.ReceiverWallet = ReceiverWallet;
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

    public TransactionEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransactionEvent(TransactionEvent source) {
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String[source.OrderId.length];
            for (int i = 0; i < source.OrderId.length; i++) {
                this.OrderId[i] = new String(source.OrderId[i]);
            }
        }
        if (source.PaymentAmount != null) {
            this.PaymentAmount = new Amount(source.PaymentAmount);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new PaymentMethod(source.PaymentMethod);
        }
        if (source.TransactionType != null) {
            this.TransactionType = new String(source.TransactionType);
        }
        if (source.Billing != null) {
            this.Billing = new Billing(source.Billing);
        }
        if (source.Delivery != null) {
            this.Delivery = new Delivery(source.Delivery);
        }
        if (source.Merchant != null) {
            this.Merchant = new Merchant(source.Merchant);
        }
        if (source.PaymentResult != null) {
            this.PaymentResult = new PaymentResult(source.PaymentResult);
        }
        if (source.TransferRecipientUserId != null) {
            this.TransferRecipientUserId = new String(source.TransferRecipientUserId);
        }
        if (source.TransferSentAddress != null) {
            this.TransferSentAddress = new Address(source.TransferSentAddress);
        }
        if (source.TransferReceivedAddress != null) {
            this.TransferReceivedAddress = new Address(source.TransferReceivedAddress);
        }
        if (source.DigitalOrders != null) {
            this.DigitalOrders = new DigitalOrder[source.DigitalOrders.length];
            for (int i = 0; i < source.DigitalOrders.length; i++) {
                this.DigitalOrders[i] = new DigitalOrder(source.DigitalOrders[i]);
            }
        }
        if (source.ReceiverWallet != null) {
            this.ReceiverWallet = new Wallet(source.ReceiverWallet);
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
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamArraySimple(map, prefix + "OrderId.", this.OrderId);
        this.setParamObj(map, prefix + "PaymentAmount.", this.PaymentAmount);
        this.setParamObj(map, prefix + "PaymentMethod.", this.PaymentMethod);
        this.setParamSimple(map, prefix + "TransactionType", this.TransactionType);
        this.setParamObj(map, prefix + "Billing.", this.Billing);
        this.setParamObj(map, prefix + "Delivery.", this.Delivery);
        this.setParamObj(map, prefix + "Merchant.", this.Merchant);
        this.setParamObj(map, prefix + "PaymentResult.", this.PaymentResult);
        this.setParamSimple(map, prefix + "TransferRecipientUserId", this.TransferRecipientUserId);
        this.setParamObj(map, prefix + "TransferSentAddress.", this.TransferSentAddress);
        this.setParamObj(map, prefix + "TransferReceivedAddress.", this.TransferReceivedAddress);
        this.setParamArrayObj(map, prefix + "DigitalOrders.", this.DigitalOrders);
        this.setParamObj(map, prefix + "ReceiverWallet.", this.ReceiverWallet);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

