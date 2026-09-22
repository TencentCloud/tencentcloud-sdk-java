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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceProfile extends AbstractModel {

    /**
    * <p>客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView；</li><li>WeChatMiniProgram。</li></p>
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * <p>高风险请求的最低风险分数。分数大于等于该值时，判定为高风险。</p><p>取值范围：[2, 99]</p><p>默认值：50</p>
    */
    @SerializedName("HighRiskMinScore")
    @Expose
    private Long HighRiskMinScore;

    /**
    * <p>高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p>
    */
    @SerializedName("HighRiskRequestAction")
    @Expose
    private SecurityAction HighRiskRequestAction;

    /**
    * <p>中风险请求的最低风险分数。分数大于等于该值且小于 HighRiskMinScore 时，判定为中风险；低于该值时，判定为低风险。</p><p>取值范围：[1, 98]</p><p>默认值：15</p>
    */
    @SerializedName("MediumRiskMinScore")
    @Expose
    private Long MediumRiskMinScore;

    /**
    * <p>中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p>
    */
    @SerializedName("MediumRiskRequestAction")
    @Expose
    private SecurityAction MediumRiskRequestAction;

    /**
     * Get <p>客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView；</li><li>WeChatMiniProgram。</li></p> 
     * @return ClientType <p>客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView；</li><li>WeChatMiniProgram。</li></p>
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set <p>客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView；</li><li>WeChatMiniProgram。</li></p>
     * @param ClientType <p>客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView；</li><li>WeChatMiniProgram。</li></p>
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get <p>高风险请求的最低风险分数。分数大于等于该值时，判定为高风险。</p><p>取值范围：[2, 99]</p><p>默认值：50</p> 
     * @return HighRiskMinScore <p>高风险请求的最低风险分数。分数大于等于该值时，判定为高风险。</p><p>取值范围：[2, 99]</p><p>默认值：50</p>
     */
    public Long getHighRiskMinScore() {
        return this.HighRiskMinScore;
    }

    /**
     * Set <p>高风险请求的最低风险分数。分数大于等于该值时，判定为高风险。</p><p>取值范围：[2, 99]</p><p>默认值：50</p>
     * @param HighRiskMinScore <p>高风险请求的最低风险分数。分数大于等于该值时，判定为高风险。</p><p>取值范围：[2, 99]</p><p>默认值：50</p>
     */
    public void setHighRiskMinScore(Long HighRiskMinScore) {
        this.HighRiskMinScore = HighRiskMinScore;
    }

    /**
     * Get <p>高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p> 
     * @return HighRiskRequestAction <p>高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p>
     */
    public SecurityAction getHighRiskRequestAction() {
        return this.HighRiskRequestAction;
    }

    /**
     * Set <p>高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p>
     * @param HighRiskRequestAction <p>高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p>
     */
    public void setHighRiskRequestAction(SecurityAction HighRiskRequestAction) {
        this.HighRiskRequestAction = HighRiskRequestAction;
    }

    /**
     * Get <p>中风险请求的最低风险分数。分数大于等于该值且小于 HighRiskMinScore 时，判定为中风险；低于该值时，判定为低风险。</p><p>取值范围：[1, 98]</p><p>默认值：15</p> 
     * @return MediumRiskMinScore <p>中风险请求的最低风险分数。分数大于等于该值且小于 HighRiskMinScore 时，判定为中风险；低于该值时，判定为低风险。</p><p>取值范围：[1, 98]</p><p>默认值：15</p>
     */
    public Long getMediumRiskMinScore() {
        return this.MediumRiskMinScore;
    }

    /**
     * Set <p>中风险请求的最低风险分数。分数大于等于该值且小于 HighRiskMinScore 时，判定为中风险；低于该值时，判定为低风险。</p><p>取值范围：[1, 98]</p><p>默认值：15</p>
     * @param MediumRiskMinScore <p>中风险请求的最低风险分数。分数大于等于该值且小于 HighRiskMinScore 时，判定为中风险；低于该值时，判定为低风险。</p><p>取值范围：[1, 98]</p><p>默认值：15</p>
     */
    public void setMediumRiskMinScore(Long MediumRiskMinScore) {
        this.MediumRiskMinScore = MediumRiskMinScore;
    }

    /**
     * Get <p>中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p> 
     * @return MediumRiskRequestAction <p>中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p>
     */
    public SecurityAction getMediumRiskRequestAction() {
        return this.MediumRiskRequestAction;
    }

    /**
     * Set <p>中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p>
     * @param MediumRiskRequestAction <p>中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。</p>
     */
    public void setMediumRiskRequestAction(SecurityAction MediumRiskRequestAction) {
        this.MediumRiskRequestAction = MediumRiskRequestAction;
    }

    public DeviceProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceProfile(DeviceProfile source) {
        if (source.ClientType != null) {
            this.ClientType = new String(source.ClientType);
        }
        if (source.HighRiskMinScore != null) {
            this.HighRiskMinScore = new Long(source.HighRiskMinScore);
        }
        if (source.HighRiskRequestAction != null) {
            this.HighRiskRequestAction = new SecurityAction(source.HighRiskRequestAction);
        }
        if (source.MediumRiskMinScore != null) {
            this.MediumRiskMinScore = new Long(source.MediumRiskMinScore);
        }
        if (source.MediumRiskRequestAction != null) {
            this.MediumRiskRequestAction = new SecurityAction(source.MediumRiskRequestAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "HighRiskMinScore", this.HighRiskMinScore);
        this.setParamObj(map, prefix + "HighRiskRequestAction.", this.HighRiskRequestAction);
        this.setParamSimple(map, prefix + "MediumRiskMinScore", this.MediumRiskMinScore);
        this.setParamObj(map, prefix + "MediumRiskRequestAction.", this.MediumRiskRequestAction);

    }
}

