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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Distribution extends AbstractModel {

    /**
    * <p>该回复方式的调用次数</p>
    */
    @SerializedName("CallCount")
    @Expose
    private String CallCount;

    /**
    * <p>该回复方式在总调用次数中的占比（百分比，0~100，保留两位小数；无数据时全为 0，有数据时各项之和为 100）</p>
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
    * <p>回复方式名称（已按请求语言国际化；i18n 缺失时兜底为 reply_method 的枚举名）</p>
    */
    @SerializedName("ReplyName")
    @Expose
    private String ReplyName;

    /**
     * Get <p>该回复方式的调用次数</p> 
     * @return CallCount <p>该回复方式的调用次数</p>
     */
    public String getCallCount() {
        return this.CallCount;
    }

    /**
     * Set <p>该回复方式的调用次数</p>
     * @param CallCount <p>该回复方式的调用次数</p>
     */
    public void setCallCount(String CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get <p>该回复方式在总调用次数中的占比（百分比，0~100，保留两位小数；无数据时全为 0，有数据时各项之和为 100）</p> 
     * @return Percentage <p>该回复方式在总调用次数中的占比（百分比，0~100，保留两位小数；无数据时全为 0，有数据时各项之和为 100）</p>
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * Set <p>该回复方式在总调用次数中的占比（百分比，0~100，保留两位小数；无数据时全为 0，有数据时各项之和为 100）</p>
     * @param Percentage <p>该回复方式在总调用次数中的占比（百分比，0~100，保留两位小数；无数据时全为 0，有数据时各项之和为 100）</p>
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get <p>回复方式名称（已按请求语言国际化；i18n 缺失时兜底为 reply_method 的枚举名）</p> 
     * @return ReplyName <p>回复方式名称（已按请求语言国际化；i18n 缺失时兜底为 reply_method 的枚举名）</p>
     */
    public String getReplyName() {
        return this.ReplyName;
    }

    /**
     * Set <p>回复方式名称（已按请求语言国际化；i18n 缺失时兜底为 reply_method 的枚举名）</p>
     * @param ReplyName <p>回复方式名称（已按请求语言国际化；i18n 缺失时兜底为 reply_method 的枚举名）</p>
     */
    public void setReplyName(String ReplyName) {
        this.ReplyName = ReplyName;
    }

    public Distribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Distribution(Distribution source) {
        if (source.CallCount != null) {
            this.CallCount = new String(source.CallCount);
        }
        if (source.Percentage != null) {
            this.Percentage = new Float(source.Percentage);
        }
        if (source.ReplyName != null) {
            this.ReplyName = new String(source.ReplyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "ReplyName", this.ReplyName);

    }
}

