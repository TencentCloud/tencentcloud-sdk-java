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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonApproverOption extends AbstractModel {

    /**
    * <p>是否允许修改签署人信息</p>
    */
    @SerializedName("CanEditApprover")
    @Expose
    private Boolean CanEditApprover;

    /**
    * <p>是否可以拒签 默认false-可以拒签 true-不可以拒签</p>
    */
    @SerializedName("NoRefuse")
    @Expose
    private Boolean NoRefuse;

    /**
    * <p>是否可以转发 默认false-可以转发 true-不可以转发</p>
    */
    @SerializedName("NoTransfer")
    @Expose
    private Boolean NoTransfer;

    /**
    * <p>当签署方有多个签署区时候，是否隐藏一键所有的签署区</p><p>false：（默认）不隐藏<br>true：隐藏，每个签署区要单独选择印章或者签名</p>
    */
    @SerializedName("HideOneKeySign")
    @Expose
    private Boolean HideOneKeySign;

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
    * <p>在嵌入式文件发起下,若合同是通过文件,当签署人控件指定了印章类型（或印章Id）,在嵌入页面上是否能修改</p>
    */
    @SerializedName("ForbidModifySealInfos")
    @Expose
    private Boolean ForbidModifySealInfos;

    /**
     * Get <p>是否允许修改签署人信息</p> 
     * @return CanEditApprover <p>是否允许修改签署人信息</p>
     */
    public Boolean getCanEditApprover() {
        return this.CanEditApprover;
    }

    /**
     * Set <p>是否允许修改签署人信息</p>
     * @param CanEditApprover <p>是否允许修改签署人信息</p>
     */
    public void setCanEditApprover(Boolean CanEditApprover) {
        this.CanEditApprover = CanEditApprover;
    }

    /**
     * Get <p>是否可以拒签 默认false-可以拒签 true-不可以拒签</p> 
     * @return NoRefuse <p>是否可以拒签 默认false-可以拒签 true-不可以拒签</p>
     */
    public Boolean getNoRefuse() {
        return this.NoRefuse;
    }

    /**
     * Set <p>是否可以拒签 默认false-可以拒签 true-不可以拒签</p>
     * @param NoRefuse <p>是否可以拒签 默认false-可以拒签 true-不可以拒签</p>
     */
    public void setNoRefuse(Boolean NoRefuse) {
        this.NoRefuse = NoRefuse;
    }

    /**
     * Get <p>是否可以转发 默认false-可以转发 true-不可以转发</p> 
     * @return NoTransfer <p>是否可以转发 默认false-可以转发 true-不可以转发</p>
     */
    public Boolean getNoTransfer() {
        return this.NoTransfer;
    }

    /**
     * Set <p>是否可以转发 默认false-可以转发 true-不可以转发</p>
     * @param NoTransfer <p>是否可以转发 默认false-可以转发 true-不可以转发</p>
     */
    public void setNoTransfer(Boolean NoTransfer) {
        this.NoTransfer = NoTransfer;
    }

    /**
     * Get <p>当签署方有多个签署区时候，是否隐藏一键所有的签署区</p><p>false：（默认）不隐藏<br>true：隐藏，每个签署区要单独选择印章或者签名</p> 
     * @return HideOneKeySign <p>当签署方有多个签署区时候，是否隐藏一键所有的签署区</p><p>false：（默认）不隐藏<br>true：隐藏，每个签署区要单独选择印章或者签名</p>
     */
    public Boolean getHideOneKeySign() {
        return this.HideOneKeySign;
    }

    /**
     * Set <p>当签署方有多个签署区时候，是否隐藏一键所有的签署区</p><p>false：（默认）不隐藏<br>true：隐藏，每个签署区要单独选择印章或者签名</p>
     * @param HideOneKeySign <p>当签署方有多个签署区时候，是否隐藏一键所有的签署区</p><p>false：（默认）不隐藏<br>true：隐藏，每个签署区要单独选择印章或者签名</p>
     */
    public void setHideOneKeySign(Boolean HideOneKeySign) {
        this.HideOneKeySign = HideOneKeySign;
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
     * Get <p>在嵌入式文件发起下,若合同是通过文件,当签署人控件指定了印章类型（或印章Id）,在嵌入页面上是否能修改</p> 
     * @return ForbidModifySealInfos <p>在嵌入式文件发起下,若合同是通过文件,当签署人控件指定了印章类型（或印章Id）,在嵌入页面上是否能修改</p>
     */
    public Boolean getForbidModifySealInfos() {
        return this.ForbidModifySealInfos;
    }

    /**
     * Set <p>在嵌入式文件发起下,若合同是通过文件,当签署人控件指定了印章类型（或印章Id）,在嵌入页面上是否能修改</p>
     * @param ForbidModifySealInfos <p>在嵌入式文件发起下,若合同是通过文件,当签署人控件指定了印章类型（或印章Id）,在嵌入页面上是否能修改</p>
     */
    public void setForbidModifySealInfos(Boolean ForbidModifySealInfos) {
        this.ForbidModifySealInfos = ForbidModifySealInfos;
    }

    public CommonApproverOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonApproverOption(CommonApproverOption source) {
        if (source.CanEditApprover != null) {
            this.CanEditApprover = new Boolean(source.CanEditApprover);
        }
        if (source.NoRefuse != null) {
            this.NoRefuse = new Boolean(source.NoRefuse);
        }
        if (source.NoTransfer != null) {
            this.NoTransfer = new Boolean(source.NoTransfer);
        }
        if (source.HideOneKeySign != null) {
            this.HideOneKeySign = new Boolean(source.HideOneKeySign);
        }
        if (source.FlowReadLimit != null) {
            this.FlowReadLimit = new String(source.FlowReadLimit);
        }
        if (source.ForbidAddSignDate != null) {
            this.ForbidAddSignDate = new Boolean(source.ForbidAddSignDate);
        }
        if (source.ForbidModifySealInfos != null) {
            this.ForbidModifySealInfos = new Boolean(source.ForbidModifySealInfos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanEditApprover", this.CanEditApprover);
        this.setParamSimple(map, prefix + "NoRefuse", this.NoRefuse);
        this.setParamSimple(map, prefix + "NoTransfer", this.NoTransfer);
        this.setParamSimple(map, prefix + "HideOneKeySign", this.HideOneKeySign);
        this.setParamSimple(map, prefix + "FlowReadLimit", this.FlowReadLimit);
        this.setParamSimple(map, prefix + "ForbidAddSignDate", this.ForbidAddSignDate);
        this.setParamSimple(map, prefix + "ForbidModifySealInfos", this.ForbidModifySealInfos);

    }
}

