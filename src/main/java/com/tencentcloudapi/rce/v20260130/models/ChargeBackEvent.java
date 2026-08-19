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

public class ChargeBackEvent extends AbstractModel {

    /**
    * <p>交易ID</p>
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * <p>订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String [] OrderId;

    /**
    * <p>拒付理由码，参考各卡组织定义的拒付码，例如：10.1、13.1、 4870、4871等</p>
    */
    @SerializedName("ChargeBackCode")
    @Expose
    private String ChargeBackCode;

    /**
    * <p>拒付原因，参考各卡组织定义的拒付原因，例如：未收到商品、欺诈等</p>
    */
    @SerializedName("ChargeBackReason")
    @Expose
    private String ChargeBackReason;

    /**
    * <p>拒付申诉阶段</p><p>枚举值：</p><ul><li>need_response： 需要商家回应</li><li>information_supplied： 商家已提供信息</li><li>chargeback_reversed： 拒付已撤销</li><li>chargeback_sustained： 拒付已成立</li></ul>
    */
    @SerializedName("ChargeBackProcess")
    @Expose
    private String ChargeBackProcess;

    /**
    * <p>拒付金额</p>
    */
    @SerializedName("ChargeBackAmount")
    @Expose
    private Amount ChargeBackAmount;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>交易ID</p> 
     * @return TransactionId <p>交易ID</p>
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>交易ID</p>
     * @param TransactionId <p>交易ID</p>
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p> 
     * @return OrderId <p>订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p>
     */
    public String [] getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p>
     * @param OrderId <p>订单 ID，当一笔交易关联多个订单（合并支付）时请输入所有订单ID</p>
     */
    public void setOrderId(String [] OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>拒付理由码，参考各卡组织定义的拒付码，例如：10.1、13.1、 4870、4871等</p> 
     * @return ChargeBackCode <p>拒付理由码，参考各卡组织定义的拒付码，例如：10.1、13.1、 4870、4871等</p>
     */
    public String getChargeBackCode() {
        return this.ChargeBackCode;
    }

    /**
     * Set <p>拒付理由码，参考各卡组织定义的拒付码，例如：10.1、13.1、 4870、4871等</p>
     * @param ChargeBackCode <p>拒付理由码，参考各卡组织定义的拒付码，例如：10.1、13.1、 4870、4871等</p>
     */
    public void setChargeBackCode(String ChargeBackCode) {
        this.ChargeBackCode = ChargeBackCode;
    }

    /**
     * Get <p>拒付原因，参考各卡组织定义的拒付原因，例如：未收到商品、欺诈等</p> 
     * @return ChargeBackReason <p>拒付原因，参考各卡组织定义的拒付原因，例如：未收到商品、欺诈等</p>
     */
    public String getChargeBackReason() {
        return this.ChargeBackReason;
    }

    /**
     * Set <p>拒付原因，参考各卡组织定义的拒付原因，例如：未收到商品、欺诈等</p>
     * @param ChargeBackReason <p>拒付原因，参考各卡组织定义的拒付原因，例如：未收到商品、欺诈等</p>
     */
    public void setChargeBackReason(String ChargeBackReason) {
        this.ChargeBackReason = ChargeBackReason;
    }

    /**
     * Get <p>拒付申诉阶段</p><p>枚举值：</p><ul><li>need_response： 需要商家回应</li><li>information_supplied： 商家已提供信息</li><li>chargeback_reversed： 拒付已撤销</li><li>chargeback_sustained： 拒付已成立</li></ul> 
     * @return ChargeBackProcess <p>拒付申诉阶段</p><p>枚举值：</p><ul><li>need_response： 需要商家回应</li><li>information_supplied： 商家已提供信息</li><li>chargeback_reversed： 拒付已撤销</li><li>chargeback_sustained： 拒付已成立</li></ul>
     */
    public String getChargeBackProcess() {
        return this.ChargeBackProcess;
    }

    /**
     * Set <p>拒付申诉阶段</p><p>枚举值：</p><ul><li>need_response： 需要商家回应</li><li>information_supplied： 商家已提供信息</li><li>chargeback_reversed： 拒付已撤销</li><li>chargeback_sustained： 拒付已成立</li></ul>
     * @param ChargeBackProcess <p>拒付申诉阶段</p><p>枚举值：</p><ul><li>need_response： 需要商家回应</li><li>information_supplied： 商家已提供信息</li><li>chargeback_reversed： 拒付已撤销</li><li>chargeback_sustained： 拒付已成立</li></ul>
     */
    public void setChargeBackProcess(String ChargeBackProcess) {
        this.ChargeBackProcess = ChargeBackProcess;
    }

    /**
     * Get <p>拒付金额</p> 
     * @return ChargeBackAmount <p>拒付金额</p>
     */
    public Amount getChargeBackAmount() {
        return this.ChargeBackAmount;
    }

    /**
     * Set <p>拒付金额</p>
     * @param ChargeBackAmount <p>拒付金额</p>
     */
    public void setChargeBackAmount(Amount ChargeBackAmount) {
        this.ChargeBackAmount = ChargeBackAmount;
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

    public ChargeBackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChargeBackEvent(ChargeBackEvent source) {
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String[source.OrderId.length];
            for (int i = 0; i < source.OrderId.length; i++) {
                this.OrderId[i] = new String(source.OrderId[i]);
            }
        }
        if (source.ChargeBackCode != null) {
            this.ChargeBackCode = new String(source.ChargeBackCode);
        }
        if (source.ChargeBackReason != null) {
            this.ChargeBackReason = new String(source.ChargeBackReason);
        }
        if (source.ChargeBackProcess != null) {
            this.ChargeBackProcess = new String(source.ChargeBackProcess);
        }
        if (source.ChargeBackAmount != null) {
            this.ChargeBackAmount = new Amount(source.ChargeBackAmount);
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
        this.setParamSimple(map, prefix + "ChargeBackCode", this.ChargeBackCode);
        this.setParamSimple(map, prefix + "ChargeBackReason", this.ChargeBackReason);
        this.setParamSimple(map, prefix + "ChargeBackProcess", this.ChargeBackProcess);
        this.setParamObj(map, prefix + "ChargeBackAmount.", this.ChargeBackAmount);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

