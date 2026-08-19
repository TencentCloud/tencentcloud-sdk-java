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

public class EventDetail extends AbstractModel {

    /**
    * <p>登录</p>
    */
    @SerializedName("Login")
    @Expose
    private LoginEvent Login;

    /**
    * <p>注册（变更用户信息）</p>
    */
    @SerializedName("Register")
    @Expose
    private RegisterEvent Register;

    /**
    * <p>创建订单</p>
    */
    @SerializedName("CreateOrder")
    @Expose
    private CreateOrderEvent CreateOrder;

    /**
    * <p>交易支付</p>
    */
    @SerializedName("Transaction")
    @Expose
    private TransactionEvent Transaction;

    /**
    * <p>短信</p>
    */
    @SerializedName("Sms")
    @Expose
    private SMSEvent Sms;

    /**
    * <p>拒付</p>
    */
    @SerializedName("ChargeBack")
    @Expose
    private ChargeBackEvent ChargeBack;

    /**
    * <p>登出</p>
    */
    @SerializedName("Logout")
    @Expose
    private LogoutEvent Logout;

    /**
    * <p>修改账号</p>
    */
    @SerializedName("ModifyAccount")
    @Expose
    private ModifyAccountEvent ModifyAccount;

    /**
    * <p>修改密码</p>
    */
    @SerializedName("ModifyPassword")
    @Expose
    private ModifyPasswordEvent ModifyPassword;

    /**
    * <p>安全验证</p>
    */
    @SerializedName("SecurityVerification")
    @Expose
    private SecurityVerificationEvent SecurityVerification;

    /**
    * <p>参加营销活动</p>
    */
    @SerializedName("AddPromotion")
    @Expose
    private AddPromotionEvent AddPromotion;

    /**
    * <p>兑奖</p>
    */
    @SerializedName("Redeem")
    @Expose
    private RedeemEvent Redeem;

    /**
    * <p>提现</p>
    */
    @SerializedName("Withdraw")
    @Expose
    private WithdrawEvent Withdraw;

    /**
    * <p>自定义事件</p>
    */
    @SerializedName("CustEvent")
    @Expose
    private CustEvent CustEvent;

    /**
    * <p>扫码</p>
    */
    @SerializedName("ScanCode")
    @Expose
    private ScanCodeEvent ScanCode;

    /**
    * <p>抽奖</p>
    */
    @SerializedName("LuckyDraw")
    @Expose
    private LuckyDrawEvent LuckyDraw;

    /**
    * <p>做任务</p>
    */
    @SerializedName("Task")
    @Expose
    private TaskEvent Task;

    /**
    * <p>邀请</p>
    */
    @SerializedName("Invitation")
    @Expose
    private InvitationEvent Invitation;

    /**
    * <p>领红包</p>
    */
    @SerializedName("ClaimRedPacket")
    @Expose
    private ClaimRedPacketEvent ClaimRedPacket;

    /**
    * <p>浏览</p>
    */
    @SerializedName("Browse")
    @Expose
    private BrowseEvent Browse;

    /**
     * Get <p>登录</p> 
     * @return Login <p>登录</p>
     */
    public LoginEvent getLogin() {
        return this.Login;
    }

    /**
     * Set <p>登录</p>
     * @param Login <p>登录</p>
     */
    public void setLogin(LoginEvent Login) {
        this.Login = Login;
    }

    /**
     * Get <p>注册（变更用户信息）</p> 
     * @return Register <p>注册（变更用户信息）</p>
     */
    public RegisterEvent getRegister() {
        return this.Register;
    }

    /**
     * Set <p>注册（变更用户信息）</p>
     * @param Register <p>注册（变更用户信息）</p>
     */
    public void setRegister(RegisterEvent Register) {
        this.Register = Register;
    }

    /**
     * Get <p>创建订单</p> 
     * @return CreateOrder <p>创建订单</p>
     */
    public CreateOrderEvent getCreateOrder() {
        return this.CreateOrder;
    }

    /**
     * Set <p>创建订单</p>
     * @param CreateOrder <p>创建订单</p>
     */
    public void setCreateOrder(CreateOrderEvent CreateOrder) {
        this.CreateOrder = CreateOrder;
    }

    /**
     * Get <p>交易支付</p> 
     * @return Transaction <p>交易支付</p>
     */
    public TransactionEvent getTransaction() {
        return this.Transaction;
    }

    /**
     * Set <p>交易支付</p>
     * @param Transaction <p>交易支付</p>
     */
    public void setTransaction(TransactionEvent Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get <p>短信</p> 
     * @return Sms <p>短信</p>
     */
    public SMSEvent getSms() {
        return this.Sms;
    }

    /**
     * Set <p>短信</p>
     * @param Sms <p>短信</p>
     */
    public void setSms(SMSEvent Sms) {
        this.Sms = Sms;
    }

    /**
     * Get <p>拒付</p> 
     * @return ChargeBack <p>拒付</p>
     */
    public ChargeBackEvent getChargeBack() {
        return this.ChargeBack;
    }

    /**
     * Set <p>拒付</p>
     * @param ChargeBack <p>拒付</p>
     */
    public void setChargeBack(ChargeBackEvent ChargeBack) {
        this.ChargeBack = ChargeBack;
    }

    /**
     * Get <p>登出</p> 
     * @return Logout <p>登出</p>
     */
    public LogoutEvent getLogout() {
        return this.Logout;
    }

    /**
     * Set <p>登出</p>
     * @param Logout <p>登出</p>
     */
    public void setLogout(LogoutEvent Logout) {
        this.Logout = Logout;
    }

    /**
     * Get <p>修改账号</p> 
     * @return ModifyAccount <p>修改账号</p>
     */
    public ModifyAccountEvent getModifyAccount() {
        return this.ModifyAccount;
    }

    /**
     * Set <p>修改账号</p>
     * @param ModifyAccount <p>修改账号</p>
     */
    public void setModifyAccount(ModifyAccountEvent ModifyAccount) {
        this.ModifyAccount = ModifyAccount;
    }

    /**
     * Get <p>修改密码</p> 
     * @return ModifyPassword <p>修改密码</p>
     */
    public ModifyPasswordEvent getModifyPassword() {
        return this.ModifyPassword;
    }

    /**
     * Set <p>修改密码</p>
     * @param ModifyPassword <p>修改密码</p>
     */
    public void setModifyPassword(ModifyPasswordEvent ModifyPassword) {
        this.ModifyPassword = ModifyPassword;
    }

    /**
     * Get <p>安全验证</p> 
     * @return SecurityVerification <p>安全验证</p>
     */
    public SecurityVerificationEvent getSecurityVerification() {
        return this.SecurityVerification;
    }

    /**
     * Set <p>安全验证</p>
     * @param SecurityVerification <p>安全验证</p>
     */
    public void setSecurityVerification(SecurityVerificationEvent SecurityVerification) {
        this.SecurityVerification = SecurityVerification;
    }

    /**
     * Get <p>参加营销活动</p> 
     * @return AddPromotion <p>参加营销活动</p>
     */
    public AddPromotionEvent getAddPromotion() {
        return this.AddPromotion;
    }

    /**
     * Set <p>参加营销活动</p>
     * @param AddPromotion <p>参加营销活动</p>
     */
    public void setAddPromotion(AddPromotionEvent AddPromotion) {
        this.AddPromotion = AddPromotion;
    }

    /**
     * Get <p>兑奖</p> 
     * @return Redeem <p>兑奖</p>
     */
    public RedeemEvent getRedeem() {
        return this.Redeem;
    }

    /**
     * Set <p>兑奖</p>
     * @param Redeem <p>兑奖</p>
     */
    public void setRedeem(RedeemEvent Redeem) {
        this.Redeem = Redeem;
    }

    /**
     * Get <p>提现</p> 
     * @return Withdraw <p>提现</p>
     */
    public WithdrawEvent getWithdraw() {
        return this.Withdraw;
    }

    /**
     * Set <p>提现</p>
     * @param Withdraw <p>提现</p>
     */
    public void setWithdraw(WithdrawEvent Withdraw) {
        this.Withdraw = Withdraw;
    }

    /**
     * Get <p>自定义事件</p> 
     * @return CustEvent <p>自定义事件</p>
     */
    public CustEvent getCustEvent() {
        return this.CustEvent;
    }

    /**
     * Set <p>自定义事件</p>
     * @param CustEvent <p>自定义事件</p>
     */
    public void setCustEvent(CustEvent CustEvent) {
        this.CustEvent = CustEvent;
    }

    /**
     * Get <p>扫码</p> 
     * @return ScanCode <p>扫码</p>
     */
    public ScanCodeEvent getScanCode() {
        return this.ScanCode;
    }

    /**
     * Set <p>扫码</p>
     * @param ScanCode <p>扫码</p>
     */
    public void setScanCode(ScanCodeEvent ScanCode) {
        this.ScanCode = ScanCode;
    }

    /**
     * Get <p>抽奖</p> 
     * @return LuckyDraw <p>抽奖</p>
     */
    public LuckyDrawEvent getLuckyDraw() {
        return this.LuckyDraw;
    }

    /**
     * Set <p>抽奖</p>
     * @param LuckyDraw <p>抽奖</p>
     */
    public void setLuckyDraw(LuckyDrawEvent LuckyDraw) {
        this.LuckyDraw = LuckyDraw;
    }

    /**
     * Get <p>做任务</p> 
     * @return Task <p>做任务</p>
     */
    public TaskEvent getTask() {
        return this.Task;
    }

    /**
     * Set <p>做任务</p>
     * @param Task <p>做任务</p>
     */
    public void setTask(TaskEvent Task) {
        this.Task = Task;
    }

    /**
     * Get <p>邀请</p> 
     * @return Invitation <p>邀请</p>
     */
    public InvitationEvent getInvitation() {
        return this.Invitation;
    }

    /**
     * Set <p>邀请</p>
     * @param Invitation <p>邀请</p>
     */
    public void setInvitation(InvitationEvent Invitation) {
        this.Invitation = Invitation;
    }

    /**
     * Get <p>领红包</p> 
     * @return ClaimRedPacket <p>领红包</p>
     */
    public ClaimRedPacketEvent getClaimRedPacket() {
        return this.ClaimRedPacket;
    }

    /**
     * Set <p>领红包</p>
     * @param ClaimRedPacket <p>领红包</p>
     */
    public void setClaimRedPacket(ClaimRedPacketEvent ClaimRedPacket) {
        this.ClaimRedPacket = ClaimRedPacket;
    }

    /**
     * Get <p>浏览</p> 
     * @return Browse <p>浏览</p>
     */
    public BrowseEvent getBrowse() {
        return this.Browse;
    }

    /**
     * Set <p>浏览</p>
     * @param Browse <p>浏览</p>
     */
    public void setBrowse(BrowseEvent Browse) {
        this.Browse = Browse;
    }

    public EventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDetail(EventDetail source) {
        if (source.Login != null) {
            this.Login = new LoginEvent(source.Login);
        }
        if (source.Register != null) {
            this.Register = new RegisterEvent(source.Register);
        }
        if (source.CreateOrder != null) {
            this.CreateOrder = new CreateOrderEvent(source.CreateOrder);
        }
        if (source.Transaction != null) {
            this.Transaction = new TransactionEvent(source.Transaction);
        }
        if (source.Sms != null) {
            this.Sms = new SMSEvent(source.Sms);
        }
        if (source.ChargeBack != null) {
            this.ChargeBack = new ChargeBackEvent(source.ChargeBack);
        }
        if (source.Logout != null) {
            this.Logout = new LogoutEvent(source.Logout);
        }
        if (source.ModifyAccount != null) {
            this.ModifyAccount = new ModifyAccountEvent(source.ModifyAccount);
        }
        if (source.ModifyPassword != null) {
            this.ModifyPassword = new ModifyPasswordEvent(source.ModifyPassword);
        }
        if (source.SecurityVerification != null) {
            this.SecurityVerification = new SecurityVerificationEvent(source.SecurityVerification);
        }
        if (source.AddPromotion != null) {
            this.AddPromotion = new AddPromotionEvent(source.AddPromotion);
        }
        if (source.Redeem != null) {
            this.Redeem = new RedeemEvent(source.Redeem);
        }
        if (source.Withdraw != null) {
            this.Withdraw = new WithdrawEvent(source.Withdraw);
        }
        if (source.CustEvent != null) {
            this.CustEvent = new CustEvent(source.CustEvent);
        }
        if (source.ScanCode != null) {
            this.ScanCode = new ScanCodeEvent(source.ScanCode);
        }
        if (source.LuckyDraw != null) {
            this.LuckyDraw = new LuckyDrawEvent(source.LuckyDraw);
        }
        if (source.Task != null) {
            this.Task = new TaskEvent(source.Task);
        }
        if (source.Invitation != null) {
            this.Invitation = new InvitationEvent(source.Invitation);
        }
        if (source.ClaimRedPacket != null) {
            this.ClaimRedPacket = new ClaimRedPacketEvent(source.ClaimRedPacket);
        }
        if (source.Browse != null) {
            this.Browse = new BrowseEvent(source.Browse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Login.", this.Login);
        this.setParamObj(map, prefix + "Register.", this.Register);
        this.setParamObj(map, prefix + "CreateOrder.", this.CreateOrder);
        this.setParamObj(map, prefix + "Transaction.", this.Transaction);
        this.setParamObj(map, prefix + "Sms.", this.Sms);
        this.setParamObj(map, prefix + "ChargeBack.", this.ChargeBack);
        this.setParamObj(map, prefix + "Logout.", this.Logout);
        this.setParamObj(map, prefix + "ModifyAccount.", this.ModifyAccount);
        this.setParamObj(map, prefix + "ModifyPassword.", this.ModifyPassword);
        this.setParamObj(map, prefix + "SecurityVerification.", this.SecurityVerification);
        this.setParamObj(map, prefix + "AddPromotion.", this.AddPromotion);
        this.setParamObj(map, prefix + "Redeem.", this.Redeem);
        this.setParamObj(map, prefix + "Withdraw.", this.Withdraw);
        this.setParamObj(map, prefix + "CustEvent.", this.CustEvent);
        this.setParamObj(map, prefix + "ScanCode.", this.ScanCode);
        this.setParamObj(map, prefix + "LuckyDraw.", this.LuckyDraw);
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamObj(map, prefix + "Invitation.", this.Invitation);
        this.setParamObj(map, prefix + "ClaimRedPacket.", this.ClaimRedPacket);
        this.setParamObj(map, prefix + "Browse.", this.Browse);

    }
}

