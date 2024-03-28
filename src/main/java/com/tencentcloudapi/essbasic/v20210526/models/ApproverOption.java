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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverOption extends AbstractModel {

    /**
    * 是否可以拒签 默认false-可以拒签 true-不可以拒签
    */
    @SerializedName("NoRefuse")
    @Expose
    private Boolean NoRefuse;

    /**
    * 是否可以转发 默认false-可以转发 true-不可以转发
    */
    @SerializedName("NoTransfer")
    @Expose
    private Boolean NoTransfer;

    /**
    * 是否隐藏一键签署 默认false-不隐藏true-隐藏
    */
    @SerializedName("HideOneKeySign")
    @Expose
    private Boolean HideOneKeySign;

    /**
    * 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li></ul>

注：
`使用动态签署人能力前，需登陆腾讯电子签控制台打开服务开关`
    */
    @SerializedName("FillType")
    @Expose
    private Long FillType;

    /**
    * 签署人阅读合同限制参数
 <br/>取值：
<ul>
<li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li>
<li> LimitReadTime，阅读合同仅限制阅读时长</li>
<li> LimitBottom，阅读合同仅限制必须阅读到底</li>
<li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li>
</ul>
    */
    @SerializedName("FlowReadLimit")
    @Expose
    private String FlowReadLimit;

    /**
     * Get 是否可以拒签 默认false-可以拒签 true-不可以拒签 
     * @return NoRefuse 是否可以拒签 默认false-可以拒签 true-不可以拒签
     */
    public Boolean getNoRefuse() {
        return this.NoRefuse;
    }

    /**
     * Set 是否可以拒签 默认false-可以拒签 true-不可以拒签
     * @param NoRefuse 是否可以拒签 默认false-可以拒签 true-不可以拒签
     */
    public void setNoRefuse(Boolean NoRefuse) {
        this.NoRefuse = NoRefuse;
    }

    /**
     * Get 是否可以转发 默认false-可以转发 true-不可以转发 
     * @return NoTransfer 是否可以转发 默认false-可以转发 true-不可以转发
     */
    public Boolean getNoTransfer() {
        return this.NoTransfer;
    }

    /**
     * Set 是否可以转发 默认false-可以转发 true-不可以转发
     * @param NoTransfer 是否可以转发 默认false-可以转发 true-不可以转发
     */
    public void setNoTransfer(Boolean NoTransfer) {
        this.NoTransfer = NoTransfer;
    }

    /**
     * Get 是否隐藏一键签署 默认false-不隐藏true-隐藏 
     * @return HideOneKeySign 是否隐藏一键签署 默认false-不隐藏true-隐藏
     */
    public Boolean getHideOneKeySign() {
        return this.HideOneKeySign;
    }

    /**
     * Set 是否隐藏一键签署 默认false-不隐藏true-隐藏
     * @param HideOneKeySign 是否隐藏一键签署 默认false-不隐藏true-隐藏
     */
    public void setHideOneKeySign(Boolean HideOneKeySign) {
        this.HideOneKeySign = HideOneKeySign;
    }

    /**
     * Get 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li></ul>

注：
`使用动态签署人能力前，需登陆腾讯电子签控制台打开服务开关` 
     * @return FillType 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li></ul>

注：
`使用动态签署人能力前，需登陆腾讯电子签控制台打开服务开关`
     */
    public Long getFillType() {
        return this.FillType;
    }

    /**
     * Set 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li></ul>

注：
`使用动态签署人能力前，需登陆腾讯电子签控制台打开服务开关`
     * @param FillType 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li></ul>

注：
`使用动态签署人能力前，需登陆腾讯电子签控制台打开服务开关`
     */
    public void setFillType(Long FillType) {
        this.FillType = FillType;
    }

    /**
     * Get 签署人阅读合同限制参数
 <br/>取值：
<ul>
<li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li>
<li> LimitReadTime，阅读合同仅限制阅读时长</li>
<li> LimitBottom，阅读合同仅限制必须阅读到底</li>
<li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li>
</ul> 
     * @return FlowReadLimit 签署人阅读合同限制参数
 <br/>取值：
<ul>
<li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li>
<li> LimitReadTime，阅读合同仅限制阅读时长</li>
<li> LimitBottom，阅读合同仅限制必须阅读到底</li>
<li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li>
</ul>
     */
    public String getFlowReadLimit() {
        return this.FlowReadLimit;
    }

    /**
     * Set 签署人阅读合同限制参数
 <br/>取值：
<ul>
<li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li>
<li> LimitReadTime，阅读合同仅限制阅读时长</li>
<li> LimitBottom，阅读合同仅限制必须阅读到底</li>
<li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li>
</ul>
     * @param FlowReadLimit 签署人阅读合同限制参数
 <br/>取值：
<ul>
<li> LimitReadTimeAndBottom，阅读合同必须限制阅读时长并且必须阅读到底</li>
<li> LimitReadTime，阅读合同仅限制阅读时长</li>
<li> LimitBottom，阅读合同仅限制必须阅读到底</li>
<li> NoReadTimeAndBottom，阅读合同不限制阅读时长且不限制阅读到底（白名单功能，请联系客户经理开白使用）</li>
</ul>
     */
    public void setFlowReadLimit(String FlowReadLimit) {
        this.FlowReadLimit = FlowReadLimit;
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
        if (source.HideOneKeySign != null) {
            this.HideOneKeySign = new Boolean(source.HideOneKeySign);
        }
        if (source.FillType != null) {
            this.FillType = new Long(source.FillType);
        }
        if (source.FlowReadLimit != null) {
            this.FlowReadLimit = new String(source.FlowReadLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoRefuse", this.NoRefuse);
        this.setParamSimple(map, prefix + "NoTransfer", this.NoTransfer);
        this.setParamSimple(map, prefix + "HideOneKeySign", this.HideOneKeySign);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "FlowReadLimit", this.FlowReadLimit);

    }
}

