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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverOption extends AbstractModel {

    /**
    * <p>签署方是否可以拒签</p><ul><li> **false** : ( 默认)可以拒签</li><li> **true** :不可以拒签</li></ul>
    */
    @SerializedName("NoRefuse")
    @Expose
    private Boolean NoRefuse;

    /**
    * <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul>
    */
    @SerializedName("NoTransfer")
    @Expose
    private Boolean NoTransfer;

    /**
    * <p>允许编辑签署人信息（嵌入式使用） 默认true-可以编辑 false-不可以编辑</p>
    */
    @SerializedName("CanEditApprover")
    @Expose
    private Boolean CanEditApprover;

    /**
    * <p>签署人信息补充类型，默认无需补充。</p><ul><li> **1** :  动态签署人（可发起合同后再补充签署人信息）注：<code>企业自动签不支持动态补充</code></li></ul><p>注：</p><ol><li><code>使用动态签署人能力前，需登录腾讯电子签控制台打开服务开关</code></li><li>此参数在嵌入式场景下无效。</li></ol>
    */
    @SerializedName("FillType")
    @Expose
    private Long FillType;

    /**
    * <p>签署人阅读合同限制参数<br> <br>取值：</p><ul><li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li><li> LimitReadTime，阅读合同仅限制阅读时长</li><li> LimitBottom，阅读合同仅限制必须阅读到底</li><li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li></ul>
    */
    @SerializedName("FlowReadLimit")
    @Expose
    private String FlowReadLimit;

    /**
    * <p>禁止在签署过程中添加签署日期控件<br> <br>前置条件：文件发起合同时，指定SignBeanTag=1（可以在签署过程中添加签署控件）：</p><ul><li> 默认值：false，在开启：签署过程中添加签署控件时，添加签署控件会默认自带签署日期控件</li><li> 可选值：true，在开启：签署过程中添加签署控件时，添加签署控件不会自带签署日期控件</li></ul>
    */
    @SerializedName("ForbidAddSignDate")
    @Expose
    private Boolean ForbidAddSignDate;

    /**
    * <p>签署人手机号传参模式</p><p>枚举值：</p><ul><li>REPLACE： 接受已有认证手机号并替换</li><li>GIVEN： 以客户入参输入手机号为主</li><li>VALIDATE： 若与认证手机号不一致则报错</li></ul><p>默认值：REPLACE</p><p>会触发手机号传参模式的前提是：签署人是指定了具体身份信息的</p><ul><li>在指定签署人姓名，证件号的情况下会触发</li></ul>
    */
    @SerializedName("ApproverMobileMode")
    @Expose
    private String ApproverMobileMode;

    /**
     * Get <p>签署方是否可以拒签</p><ul><li> **false** : ( 默认)可以拒签</li><li> **true** :不可以拒签</li></ul> 
     * @return NoRefuse <p>签署方是否可以拒签</p><ul><li> **false** : ( 默认)可以拒签</li><li> **true** :不可以拒签</li></ul>
     */
    public Boolean getNoRefuse() {
        return this.NoRefuse;
    }

    /**
     * Set <p>签署方是否可以拒签</p><ul><li> **false** : ( 默认)可以拒签</li><li> **true** :不可以拒签</li></ul>
     * @param NoRefuse <p>签署方是否可以拒签</p><ul><li> **false** : ( 默认)可以拒签</li><li> **true** :不可以拒签</li></ul>
     */
    public void setNoRefuse(Boolean NoRefuse) {
        this.NoRefuse = NoRefuse;
    }

    /**
     * Get <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul> 
     * @return NoTransfer <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul>
     */
    public Boolean getNoTransfer() {
        return this.NoTransfer;
    }

    /**
     * Set <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul>
     * @param NoTransfer <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul>
     */
    public void setNoTransfer(Boolean NoTransfer) {
        this.NoTransfer = NoTransfer;
    }

    /**
     * Get <p>允许编辑签署人信息（嵌入式使用） 默认true-可以编辑 false-不可以编辑</p> 
     * @return CanEditApprover <p>允许编辑签署人信息（嵌入式使用） 默认true-可以编辑 false-不可以编辑</p>
     */
    public Boolean getCanEditApprover() {
        return this.CanEditApprover;
    }

    /**
     * Set <p>允许编辑签署人信息（嵌入式使用） 默认true-可以编辑 false-不可以编辑</p>
     * @param CanEditApprover <p>允许编辑签署人信息（嵌入式使用） 默认true-可以编辑 false-不可以编辑</p>
     */
    public void setCanEditApprover(Boolean CanEditApprover) {
        this.CanEditApprover = CanEditApprover;
    }

    /**
     * Get <p>签署人信息补充类型，默认无需补充。</p><ul><li> **1** :  动态签署人（可发起合同后再补充签署人信息）注：<code>企业自动签不支持动态补充</code></li></ul><p>注：</p><ol><li><code>使用动态签署人能力前，需登录腾讯电子签控制台打开服务开关</code></li><li>此参数在嵌入式场景下无效。</li></ol> 
     * @return FillType <p>签署人信息补充类型，默认无需补充。</p><ul><li> **1** :  动态签署人（可发起合同后再补充签署人信息）注：<code>企业自动签不支持动态补充</code></li></ul><p>注：</p><ol><li><code>使用动态签署人能力前，需登录腾讯电子签控制台打开服务开关</code></li><li>此参数在嵌入式场景下无效。</li></ol>
     */
    public Long getFillType() {
        return this.FillType;
    }

    /**
     * Set <p>签署人信息补充类型，默认无需补充。</p><ul><li> **1** :  动态签署人（可发起合同后再补充签署人信息）注：<code>企业自动签不支持动态补充</code></li></ul><p>注：</p><ol><li><code>使用动态签署人能力前，需登录腾讯电子签控制台打开服务开关</code></li><li>此参数在嵌入式场景下无效。</li></ol>
     * @param FillType <p>签署人信息补充类型，默认无需补充。</p><ul><li> **1** :  动态签署人（可发起合同后再补充签署人信息）注：<code>企业自动签不支持动态补充</code></li></ul><p>注：</p><ol><li><code>使用动态签署人能力前，需登录腾讯电子签控制台打开服务开关</code></li><li>此参数在嵌入式场景下无效。</li></ol>
     */
    public void setFillType(Long FillType) {
        this.FillType = FillType;
    }

    /**
     * Get <p>签署人阅读合同限制参数<br> <br>取值：</p><ul><li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li><li> LimitReadTime，阅读合同仅限制阅读时长</li><li> LimitBottom，阅读合同仅限制必须阅读到底</li><li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li></ul> 
     * @return FlowReadLimit <p>签署人阅读合同限制参数<br> <br>取值：</p><ul><li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li><li> LimitReadTime，阅读合同仅限制阅读时长</li><li> LimitBottom，阅读合同仅限制必须阅读到底</li><li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li></ul>
     */
    public String getFlowReadLimit() {
        return this.FlowReadLimit;
    }

    /**
     * Set <p>签署人阅读合同限制参数<br> <br>取值：</p><ul><li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li><li> LimitReadTime，阅读合同仅限制阅读时长</li><li> LimitBottom，阅读合同仅限制必须阅读到底</li><li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li></ul>
     * @param FlowReadLimit <p>签署人阅读合同限制参数<br> <br>取值：</p><ul><li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li><li> LimitReadTime，阅读合同仅限制阅读时长</li><li> LimitBottom，阅读合同仅限制必须阅读到底</li><li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li></ul>
     */
    public void setFlowReadLimit(String FlowReadLimit) {
        this.FlowReadLimit = FlowReadLimit;
    }

    /**
     * Get <p>禁止在签署过程中添加签署日期控件<br> <br>前置条件：文件发起合同时，指定SignBeanTag=1（可以在签署过程中添加签署控件）：</p><ul><li> 默认值：false，在开启：签署过程中添加签署控件时，添加签署控件会默认自带签署日期控件</li><li> 可选值：true，在开启：签署过程中添加签署控件时，添加签署控件不会自带签署日期控件</li></ul> 
     * @return ForbidAddSignDate <p>禁止在签署过程中添加签署日期控件<br> <br>前置条件：文件发起合同时，指定SignBeanTag=1（可以在签署过程中添加签署控件）：</p><ul><li> 默认值：false，在开启：签署过程中添加签署控件时，添加签署控件会默认自带签署日期控件</li><li> 可选值：true，在开启：签署过程中添加签署控件时，添加签署控件不会自带签署日期控件</li></ul>
     */
    public Boolean getForbidAddSignDate() {
        return this.ForbidAddSignDate;
    }

    /**
     * Set <p>禁止在签署过程中添加签署日期控件<br> <br>前置条件：文件发起合同时，指定SignBeanTag=1（可以在签署过程中添加签署控件）：</p><ul><li> 默认值：false，在开启：签署过程中添加签署控件时，添加签署控件会默认自带签署日期控件</li><li> 可选值：true，在开启：签署过程中添加签署控件时，添加签署控件不会自带签署日期控件</li></ul>
     * @param ForbidAddSignDate <p>禁止在签署过程中添加签署日期控件<br> <br>前置条件：文件发起合同时，指定SignBeanTag=1（可以在签署过程中添加签署控件）：</p><ul><li> 默认值：false，在开启：签署过程中添加签署控件时，添加签署控件会默认自带签署日期控件</li><li> 可选值：true，在开启：签署过程中添加签署控件时，添加签署控件不会自带签署日期控件</li></ul>
     */
    public void setForbidAddSignDate(Boolean ForbidAddSignDate) {
        this.ForbidAddSignDate = ForbidAddSignDate;
    }

    /**
     * Get <p>签署人手机号传参模式</p><p>枚举值：</p><ul><li>REPLACE： 接受已有认证手机号并替换</li><li>GIVEN： 以客户入参输入手机号为主</li><li>VALIDATE： 若与认证手机号不一致则报错</li></ul><p>默认值：REPLACE</p><p>会触发手机号传参模式的前提是：签署人是指定了具体身份信息的</p><ul><li>在指定签署人姓名，证件号的情况下会触发</li></ul> 
     * @return ApproverMobileMode <p>签署人手机号传参模式</p><p>枚举值：</p><ul><li>REPLACE： 接受已有认证手机号并替换</li><li>GIVEN： 以客户入参输入手机号为主</li><li>VALIDATE： 若与认证手机号不一致则报错</li></ul><p>默认值：REPLACE</p><p>会触发手机号传参模式的前提是：签署人是指定了具体身份信息的</p><ul><li>在指定签署人姓名，证件号的情况下会触发</li></ul>
     */
    public String getApproverMobileMode() {
        return this.ApproverMobileMode;
    }

    /**
     * Set <p>签署人手机号传参模式</p><p>枚举值：</p><ul><li>REPLACE： 接受已有认证手机号并替换</li><li>GIVEN： 以客户入参输入手机号为主</li><li>VALIDATE： 若与认证手机号不一致则报错</li></ul><p>默认值：REPLACE</p><p>会触发手机号传参模式的前提是：签署人是指定了具体身份信息的</p><ul><li>在指定签署人姓名，证件号的情况下会触发</li></ul>
     * @param ApproverMobileMode <p>签署人手机号传参模式</p><p>枚举值：</p><ul><li>REPLACE： 接受已有认证手机号并替换</li><li>GIVEN： 以客户入参输入手机号为主</li><li>VALIDATE： 若与认证手机号不一致则报错</li></ul><p>默认值：REPLACE</p><p>会触发手机号传参模式的前提是：签署人是指定了具体身份信息的</p><ul><li>在指定签署人姓名，证件号的情况下会触发</li></ul>
     */
    public void setApproverMobileMode(String ApproverMobileMode) {
        this.ApproverMobileMode = ApproverMobileMode;
    }

    public ApproverOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproverOption(ApproverOption source) {
        if (source.NoRefuse != null) {
            this.NoRefuse = new Boolean(source.NoRefuse);
        }
        if (source.NoTransfer != null) {
            this.NoTransfer = new Boolean(source.NoTransfer);
        }
        if (source.CanEditApprover != null) {
            this.CanEditApprover = new Boolean(source.CanEditApprover);
        }
        if (source.FillType != null) {
            this.FillType = new Long(source.FillType);
        }
        if (source.FlowReadLimit != null) {
            this.FlowReadLimit = new String(source.FlowReadLimit);
        }
        if (source.ForbidAddSignDate != null) {
            this.ForbidAddSignDate = new Boolean(source.ForbidAddSignDate);
        }
        if (source.ApproverMobileMode != null) {
            this.ApproverMobileMode = new String(source.ApproverMobileMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoRefuse", this.NoRefuse);
        this.setParamSimple(map, prefix + "NoTransfer", this.NoTransfer);
        this.setParamSimple(map, prefix + "CanEditApprover", this.CanEditApprover);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "FlowReadLimit", this.FlowReadLimit);
        this.setParamSimple(map, prefix + "ForbidAddSignDate", this.ForbidAddSignDate);
        this.setParamSimple(map, prefix + "ApproverMobileMode", this.ApproverMobileMode);

    }
}

