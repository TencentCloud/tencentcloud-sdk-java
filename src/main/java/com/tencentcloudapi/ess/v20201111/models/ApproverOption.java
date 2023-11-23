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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverOption extends AbstractModel {

    /**
    * 签署方是否可以拒签

<ul><li> **false** : ( 默认)可以拒签</li>
<li> **true** :不可以拒签</li></ul>
    */
    @SerializedName("NoRefuse")
    @Expose
    private Boolean NoRefuse;

    /**
    * 签署方是否可以转他人处理

<ul><li> **false** : ( 默认)可以转他人处理</li>
<li> **true** :不可以转他人处理</li></ul>
    */
    @SerializedName("NoTransfer")
    @Expose
    private Boolean NoTransfer;

    /**
    * 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li>
</ul>
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
     * Get 签署方是否可以拒签

<ul><li> **false** : ( 默认)可以拒签</li>
<li> **true** :不可以拒签</li></ul> 
     * @return NoRefuse 签署方是否可以拒签

<ul><li> **false** : ( 默认)可以拒签</li>
<li> **true** :不可以拒签</li></ul>
     */
    public Boolean getNoRefuse() {
        return this.NoRefuse;
    }

    /**
     * Set 签署方是否可以拒签

<ul><li> **false** : ( 默认)可以拒签</li>
<li> **true** :不可以拒签</li></ul>
     * @param NoRefuse 签署方是否可以拒签

<ul><li> **false** : ( 默认)可以拒签</li>
<li> **true** :不可以拒签</li></ul>
     */
    public void setNoRefuse(Boolean NoRefuse) {
        this.NoRefuse = NoRefuse;
    }

    /**
     * Get 签署方是否可以转他人处理

<ul><li> **false** : ( 默认)可以转他人处理</li>
<li> **true** :不可以转他人处理</li></ul> 
     * @return NoTransfer 签署方是否可以转他人处理

<ul><li> **false** : ( 默认)可以转他人处理</li>
<li> **true** :不可以转他人处理</li></ul>
     */
    public Boolean getNoTransfer() {
        return this.NoTransfer;
    }

    /**
     * Set 签署方是否可以转他人处理

<ul><li> **false** : ( 默认)可以转他人处理</li>
<li> **true** :不可以转他人处理</li></ul>
     * @param NoTransfer 签署方是否可以转他人处理

<ul><li> **false** : ( 默认)可以转他人处理</li>
<li> **true** :不可以转他人处理</li></ul>
     */
    public void setNoTransfer(Boolean NoTransfer) {
        this.NoTransfer = NoTransfer;
    }

    /**
     * Get 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li>
</ul> 
     * @return FillType 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li>
</ul>
     */
    public Long getFillType() {
        return this.FillType;
    }

    /**
     * Set 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li>
</ul>
     * @param FillType 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）注：`企业自动签不支持动态补充`</li>
</ul>
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
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "FlowReadLimit", this.FlowReadLimit);

    }
}

