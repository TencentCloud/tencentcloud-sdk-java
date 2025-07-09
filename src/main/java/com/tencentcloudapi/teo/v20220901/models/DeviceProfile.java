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
    * 客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView。</li>
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 判定请求为高风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 50，对应含义 51～100 为高风险。
    */
    @SerializedName("HighRiskMinScore")
    @Expose
    private Long HighRiskMinScore;

    /**
    * 高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
    */
    @SerializedName("HighRiskRequestAction")
    @Expose
    private SecurityAction HighRiskRequestAction;

    /**
    * 判定请求为中风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 15，对应含义 16～50 为中风险。
    */
    @SerializedName("MediumRiskMinScore")
    @Expose
    private Long MediumRiskMinScore;

    /**
    * 中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
    */
    @SerializedName("MediumRiskRequestAction")
    @Expose
    private SecurityAction MediumRiskRequestAction;

    /**
     * Get 客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView。</li> 
     * @return ClientType 客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView。</li>
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set 客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView。</li>
     * @param ClientType 客户端设备类型。取值有：<li>iOS；</li><li>Android；</li><li>WebView。</li>
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 判定请求为高风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 50，对应含义 51～100 为高风险。 
     * @return HighRiskMinScore 判定请求为高风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 50，对应含义 51～100 为高风险。
     */
    public Long getHighRiskMinScore() {
        return this.HighRiskMinScore;
    }

    /**
     * Set 判定请求为高风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 50，对应含义 51～100 为高风险。
     * @param HighRiskMinScore 判定请求为高风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 50，对应含义 51～100 为高风险。
     */
    public void setHighRiskMinScore(Long HighRiskMinScore) {
        this.HighRiskMinScore = HighRiskMinScore;
    }

    /**
     * Get 高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。 
     * @return HighRiskRequestAction 高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
     */
    public SecurityAction getHighRiskRequestAction() {
        return this.HighRiskRequestAction;
    }

    /**
     * Set 高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
     * @param HighRiskRequestAction 高风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
     */
    public void setHighRiskRequestAction(SecurityAction HighRiskRequestAction) {
        this.HighRiskRequestAction = HighRiskRequestAction;
    }

    /**
     * Get 判定请求为中风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 15，对应含义 16～50 为中风险。 
     * @return MediumRiskMinScore 判定请求为中风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 15，对应含义 16～50 为中风险。
     */
    public Long getMediumRiskMinScore() {
        return this.MediumRiskMinScore;
    }

    /**
     * Set 判定请求为中风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 15，对应含义 16～50 为中风险。
     * @param MediumRiskMinScore 判定请求为中风险的最低值，取值范围为 1～99。数值越大请求风险越高越接近 Bot 客户端发起的请求。默认值为 15，对应含义 16～50 为中风险。
     */
    public void setMediumRiskMinScore(Long MediumRiskMinScore) {
        this.MediumRiskMinScore = MediumRiskMinScore;
    }

    /**
     * Get 中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。 
     * @return MediumRiskRequestAction 中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
     */
    public SecurityAction getMediumRiskRequestAction() {
        return this.MediumRiskRequestAction;
    }

    /**
     * Set 中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
     * @param MediumRiskRequestAction 中风险请求的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
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

